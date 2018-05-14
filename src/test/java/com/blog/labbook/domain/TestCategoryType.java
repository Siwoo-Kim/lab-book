package com.blog.labbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 3:25
 **/


public class TestCategoryType {

    @Test
    public void memberOf() {
        CategoryType type = CategoryType.memberOf("tech");
        assertEquals(type, CategoryType.TECH);
        type = CategoryType.memberOf("TECH");
        assertEquals(type, CategoryType.TECH);

        type = CategoryType.memberOf("ordinal");
        assertEquals(type, CategoryType.ORDINAL);
        type = CategoryType.memberOf("ORDINAL");
        assertEquals(type, CategoryType.ORDINAL);

        type = CategoryType.memberOf("book");
        assertEquals(type, CategoryType.BOOK);
        type = CategoryType.memberOf("BOOK");
        assertEquals(type, CategoryType.BOOK);
    }

}
