package com.blog.labbook.support.fixture;

import com.blog.labbook.domain.Domain;
import com.blog.labbook.domain.embed.BasicDate;
import com.blog.labbook.domain.embed.Image;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:08
 **/


public class DomainFixture {

    static List<Domain> domains() {
        List<Domain> domains = new ArrayList<>();

        Domain domain = new Domain();
        domain.setName("Home");
        domain.setContent("Junior 개발자의 블러그 ;), 이것저것 대충 풀어내는 기술 이야기");
        domain.setBasicDate(new BasicDate(LocalDate.of(2018, 05, 13)));
        domain.setImage(new Image("home", Domain.IMG_RESOURCE_PATH, "svg"));
        domains.add(domain);

        domain = new Domain();
        domain.setName("Category");
        domain.setContent("온갖 갔다 버려야 하지만 버리지 못한 잡다한 코드와 음흉한 음모가 모여있는 카타고리");
        domain.setBasicDate(new BasicDate(LocalDate.of(2018, 05, 14)));
        domain.setImage(new Image("category", Domain.IMG_RESOURCE_PATH, "png"));
        domains.add(domain);

        domain = new Domain();
        domain.setName("Cheat Sheet");
        domain.setContent("Junior 개발자의 빌어먹을 부족한 메모리를 구원해줄 Cheat Sheet..  ( Shit 일지도.. ;< ) ");
        domain.setBasicDate(new BasicDate(LocalDate.of(2018, 05, 15)));
        domain.setImage(new Image("cheat-sheet", Domain.IMG_RESOURCE_PATH, "jpg"));
        domains.add(domain);

        return domains;
    }
}
