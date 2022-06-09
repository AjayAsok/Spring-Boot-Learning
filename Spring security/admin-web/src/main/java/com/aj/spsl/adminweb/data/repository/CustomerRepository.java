package com.aj.spsl.adminweb.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aj.spsl.adminweb.data.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
