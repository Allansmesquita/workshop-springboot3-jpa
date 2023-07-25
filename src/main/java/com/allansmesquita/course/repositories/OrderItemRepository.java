package com.allansmesquita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allansmesquita.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
