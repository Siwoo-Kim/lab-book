package com.blog.labbook.domain.embed;

import org.springframework.util.Assert;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 1:54
 **/


public enum  ImageExtension {
    SVG, PNG, JPG, JPEG;

    public static ImageExtension memberOf(String value) {
        Assert.hasText(value, "Value must have text");
        value = value.toUpperCase();
        switch (value) {
            case "SVG": return SVG;
            case "PNG": return PNG;
            case "JPG": return JPG;
            case "JPEG": return JPEG;
            default: throw new IllegalArgumentException("Unknown value: " + value);
        }
    }

    public String getExtension() {
        return "." + this.name().toLowerCase();
    }
}
