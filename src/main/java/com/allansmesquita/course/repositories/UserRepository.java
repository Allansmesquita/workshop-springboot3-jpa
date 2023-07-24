package com.allansmesquita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allansmesquita.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
