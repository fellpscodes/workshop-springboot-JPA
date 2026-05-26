package com.projectjava.felps.services;

import com.projectjava.felps.entities.Order;
import com.projectjava.felps.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
