package com.allansmesquita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allansmesquita.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
