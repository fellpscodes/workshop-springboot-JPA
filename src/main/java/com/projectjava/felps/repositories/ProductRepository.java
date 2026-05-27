package com.projectjava.felps.repositories;

import com.projectjava.felps.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
