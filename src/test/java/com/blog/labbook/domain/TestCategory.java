package com.blog.labbook.domain;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 5:31
 **/


public class TestCategory {

    @Test
    public void addTopic() {
        Category category = category("test1");

        Topic topic1 = topic("topic1");
        category.addTopic(topic1);
        Topic topic2 = topic("topic2");
        assertTrue(category.contains(topic1));
        assertFalse(category.contains(topic2));

        category.addTopic(topic2);
        assertTrue(category.contains(topic2));
    }

    @Test
    public void topicSize() {
        Category category = category("test1");
        category.addTopic(topic("topic1"));
        category.addTopic(topic("topic2"));

        assertTrue(category.topicSize() == 2);
    }

    @Test
    public void topicNames() {
        String[] names = {"test1", "test2"};
        Category category = category("test1");
        category.addTopic(topic(names[0]));
        category.addTopic(topic(names[0]));
        category.topicNames().containsAll(Arrays.asList(names));
    }

    public static Category category(String name) {
        Category category = new Category();
        category.setName(name);
        return category;
    }

    public static Topic topic(String name) {
        Topic topic = new Topic();
        topic.setName(name);
        return topic;
    }
}
