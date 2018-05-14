package com.blog.labbook.domain.embed;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embeddable;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 1:39
 **/

@Data
@Embeddable
public class BasicDate {
    static final String MESSAGE_FORMAT = "{0} years, {1} months, {2} days ago";
    static final String TODAY_MESSAGE_FORMAT = "on Today";

    private LocalDate created;
    private LocalDate updated;

    protected BasicDate() {
    }

    public BasicDate(LocalDate created) {
        this.created = created;
    }

    public BasicDate(LocalDate created, LocalDate updated) {
        this.created = created;
        this.updated = updated;
    }

    @JsonProperty
    public LocalDate lastUpdated() {
        return updated != null ? updated : created;
    }

    public String daysAgo() {
        Period period = Period.between(lastUpdated(), LocalDate.now());
        if (isToday()) {
            return TODAY_MESSAGE_FORMAT;
        } else {
            return MessageFormat.format(MESSAGE_FORMAT, period.getYears(), period.getMonths(), period.getDays());
        }
    }

    @JsonProperty
    public boolean isToday() {
        return LocalDate.now().equals(lastUpdated());
    }

}
