package com.tonarqui.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonarqui.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
