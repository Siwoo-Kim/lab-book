package com.blog.labbook.support.fixture;

import com.blog.labbook.domain.Category;
import com.blog.labbook.domain.Domain;

import java.util.List;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:11
 **/

public class FixtureProvider {

    public static List<Domain> domains() {
        return DomainFixture.domains();
    }
    public static List<Category> categories() { return CategoryFixture.categories(); }
}
