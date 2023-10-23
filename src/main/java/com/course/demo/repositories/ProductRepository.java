package com.course.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
