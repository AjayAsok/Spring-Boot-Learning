package com.aj.spsl.adminweb.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aj.spsl.adminweb.data.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Iterable<Order> findAllByCustomerId(long customerId);
}
