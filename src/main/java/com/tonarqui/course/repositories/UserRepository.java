package com.tonarqui.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonarqui.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
