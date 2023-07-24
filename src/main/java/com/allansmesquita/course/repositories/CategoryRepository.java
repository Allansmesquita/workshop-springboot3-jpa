package com.allansmesquita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allansmesquita.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
