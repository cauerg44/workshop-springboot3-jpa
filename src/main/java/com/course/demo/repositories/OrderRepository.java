package com.course.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
