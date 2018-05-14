package com.blog.labbook.repository;

import com.blog.labbook.domain.Category;
import com.blog.labbook.domain.Topic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.blog.labbook.domain.TestCategory.category;
import static com.blog.labbook.domain.TestCategory.topic;
import static org.junit.Assert.assertTrue;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 5:40
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCategoryRepository {

    @Autowired CategoryRepository categoryRepository;


    @Test
    public void associationTopic() {
        Category category = category("category1");
        Topic topic1 = topic("topic1");
        Topic topic2 = topic("topic2");
        category.addTopic(topic1);
        category.addTopic(topic2);

        category = categoryRepository.save(category);
        assertTrue(category.topicNames().size() == 2);
        assertTrue(category.topicSize() == 2);
        assertTrue(category.getTopics().size() == 2);
    }
}
