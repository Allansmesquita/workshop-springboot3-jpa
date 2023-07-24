package com.allansmesquita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allansmesquita.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
