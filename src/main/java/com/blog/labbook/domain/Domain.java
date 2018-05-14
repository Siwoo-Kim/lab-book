package com.blog.labbook.domain;

import com.blog.labbook.domain.embed.BasicDate;
import com.blog.labbook.domain.embed.Image;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:06
 **/

@Data
@Entity @Table(name = "tbl_domain")
@EqualsAndHashCode
public class Domain {
    public static final String IMG_RESOURCE_PATH = "/assets/img/domain/";

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String content;

    private BasicDate basicDate;

    private Image image;

}
