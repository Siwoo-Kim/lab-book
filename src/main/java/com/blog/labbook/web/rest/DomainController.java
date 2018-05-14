package com.blog.labbook.web.rest;

import com.blog.labbook.domain.Domain;
import com.blog.labbook.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:13
 **/


@RestController
@RequestMapping("/rest/domain")
public class DomainController {

    @Autowired
    DomainRepository domainRepository;

    @GetMapping
    List<Domain> all() {
        return domainRepository.findAll();
    }
}
