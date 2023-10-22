package com.course.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
