package com.blog.labbook.domain;

import com.blog.labbook.domain.embed.ImageExtension;
import org.springframework.util.Assert;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 3:20
 **/

public enum  CategoryType {
    TECH, ORDINAL, BOOK;

    public static CategoryType memberOf(String value) {
        Assert.hasText(value, "Value must have text");
        value = value.toUpperCase();
        switch (value) {
            case "TECH": return TECH;
            case "ORDINAL": return ORDINAL;
            case "BOOK": return BOOK;
            default: throw new IllegalArgumentException("Unknown value: " + value);
        }
    }

}
