package com.blog.labbook.domain.embed;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:01
 **/


public class TestImage {

    @Test
    public void resolveName() {
        Image image = new Image("test","/assets/image", "svg");
        assertEquals(image.resolveName("/test"), "test");
        assertEquals(image.resolveName("test"), "test");
    }

    @Test
    public void resolvePath() {
        Image image = new Image("test","/assets/image", "svg");
        assertEquals(image.resolvePath("/assets/image/"), "/assets/image/");
        assertEquals(image.resolvePath("/assets/image"), "/assets/image/");
    }

    @Test
    public void getFullPath() {
        Image image = new Image("test","/assets/image", "svg");
        assertEquals(image.getFullPath(), "/assets/image/test.svg");
        System.out.println(image.getFullPath());
    }

}
