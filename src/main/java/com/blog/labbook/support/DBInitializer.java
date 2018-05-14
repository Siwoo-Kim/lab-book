package com.blog.labbook.support;

import com.blog.labbook.repository.CategoryRepository;
import com.blog.labbook.repository.DomainRepository;
import com.blog.labbook.support.fixture.FixtureProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 2:11
 **/

@Component
public class DBInitializer implements CommandLineRunner {

    @Autowired
    DomainRepository domainRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        domainRepository.saveAll(FixtureProvider.domains());
        categoryRepository.saveAll(FixtureProvider.categories());
    }
}
