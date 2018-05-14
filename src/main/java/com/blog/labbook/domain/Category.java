package com.blog.labbook.domain;

import com.blog.labbook.domain.embed.BasicDate;
import com.blog.labbook.domain.embed.Image;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 3:19
 **/

@Data
@Entity @Table(name = "tbl_category")
@EqualsAndHashCode(of = {"id","name"})
public class Category {
    public static final String IMG_RESOURCE_PATH = "/assets/img/category/";

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String content;
    private Image image;
    private BasicDate basicDate;
    @Enumerated(EnumType.STRING)
    private CategoryType type;

    @OneToMany(fetch = FetchType.EAGER,
            mappedBy = "category",
    orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Topic> topics = new ArrayList<>();

    @JsonProperty
    public int topicSize() {
        return topics.size();
    }

    @JsonProperty
    public List<String> topicNames() {
        return topics
                .stream()
                .map(Topic::getName)
                .collect(Collectors.toList());
    }

    @JsonProperty
    public LocalDateTime topicUpdated() {
        return null;
    }

    public void addTopic(Topic topic) {
        this.topics.add(topic);
        if(topic.getCategory() != this) {
           topic.setCategory(this);
        }
    }

    public boolean contains(Topic topic) {
        return this.topics.contains(topic);
    }
}
