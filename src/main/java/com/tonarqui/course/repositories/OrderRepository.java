package com.tonarqui.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonarqui.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
