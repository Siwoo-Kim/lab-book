package com.blog.labbook.support.fixture;

import com.blog.labbook.domain.Category;
import com.blog.labbook.domain.CategoryType;
import com.blog.labbook.domain.embed.BasicDate;
import com.blog.labbook.domain.embed.Image;
import com.blog.labbook.domain.embed.ImageExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 3:27
 **/


public class CategoryFixture {

    public static List<Category> categories() {
        List<Category> categories = new ArrayList<>();

        Category category = new Category();
        category.setName("RxJS");
        category.setBasicDate(new BasicDate(LocalDate.of(2018,05,13)));
        category.setContent("RxJS는 Observable를 사용하여 비동기 및 이벤트 기반 프로그램을 작성하기 위한 라이브러리이다. 일단 비동기의 개념을 정확히 이해해야 익히는데 수월하다. " +
                "비동기를 이해해도 사실 어렵다.. RxJs엔 너무 연산자가 많고, 결과 예측이 쉽지 않아.. 결론은 내가 머리가 똥");
        category.setImage(new Image("rxjs",Category.IMG_RESOURCE_PATH, ImageExtension.PNG));
        category.setType(CategoryType.TECH);
        categories.add(category);

        category = new Category();
        category.setName("Java Collection");
        category.setBasicDate(new BasicDate(LocalDate.of(2018,05,13)));
        category.setContent("다수의 데이터, 데이터 그룹을 의미하고, 표준화된 프로그래밍 방식을 지원한다. 그 중에서는 Collection 인터페이스를 구현한 List와 Set이 있고, 컬렉션의 기능은 하지만 구조 자체가 달라 떨어져 나온 Map이 있다.");
        category.setImage(new Image("collection",Category.IMG_RESOURCE_PATH, ImageExtension.PNG));
        category.setType(CategoryType.TECH);
        categories.add(category);

        return categories;
    }
}
