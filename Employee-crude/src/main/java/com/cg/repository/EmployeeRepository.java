package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
