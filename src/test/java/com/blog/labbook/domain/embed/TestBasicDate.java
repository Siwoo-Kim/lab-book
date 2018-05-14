package com.blog.labbook.domain.embed;

import org.junit.Test;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;

import static com.blog.labbook.domain.embed.BasicDate.MESSAGE_FORMAT;
import static org.junit.Assert.*;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 1:44
 **/

public class TestBasicDate {

    @Test
    public void lastUpdated() {
        LocalDate created = LocalDate.of(1989, 03, 04);
        LocalDate updated = LocalDate.of(1989, 03, 10);
        BasicDate date = new BasicDate(created, null);
        assertEquals(date.lastUpdated(), created);

        date = new BasicDate(created, updated);
        assertEquals(date.lastUpdated(), updated);
    }

    @Test
    public void daysAgo() {
        LocalDate created = LocalDate.now();
        BasicDate date = new BasicDate(created);
        assertEquals(date.daysAgo(), BasicDate.TODAY_MESSAGE_FORMAT);

        created = LocalDate.of(1989, 03, 04);
        Period period = Period.between(created, LocalDate.now());
        String message = MessageFormat.format(MESSAGE_FORMAT, period.getYears(), period.getMonths(), period.getDays());

        date = new BasicDate(created);
        assertEquals(date.daysAgo(), message);
    }

    @Test
    public void isToday() {
        LocalDate created = LocalDate.now();
        BasicDate date = new BasicDate(created);
        assertTrue(date.isToday());

        created = LocalDate.of(1989, 03, 04);
        date = new BasicDate(created);
        assertFalse(date.isToday());
    }

}
