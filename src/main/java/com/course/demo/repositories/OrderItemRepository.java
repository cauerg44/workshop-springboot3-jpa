package com.course.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
