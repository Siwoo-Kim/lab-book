package com.blog.labbook.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 5:17
 **/

@Data
@Entity @Table(name = "tbl_topic")
@EqualsAndHashCode(of = {"id","name"})
public class Topic {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public void setCategory(Category category) {
        this.category = category;
        if(!category.contains(this)) {
            category.addTopic(this);
        }
    }

}
