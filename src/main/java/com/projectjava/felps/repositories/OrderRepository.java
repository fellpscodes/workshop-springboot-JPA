package com.projectjava.felps.repositories;

import com.projectjava.felps.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
