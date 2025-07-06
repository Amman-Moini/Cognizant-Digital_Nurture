package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // By extending JpaRepository, we get methods like save(), findById(), findAll(), delete() for free.
    // The <Employee, Integer> part tells Spring Data that this repository works with the
    // Employee entity, and its primary key is of type Integer.
}