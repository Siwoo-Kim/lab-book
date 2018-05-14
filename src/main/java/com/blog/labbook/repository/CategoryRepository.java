package com.blog.labbook.repository;

import com.blog.labbook.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 3:27
 **/

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
