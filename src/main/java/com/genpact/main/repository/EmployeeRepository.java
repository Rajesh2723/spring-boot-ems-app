package com.genpact.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.genpact.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findAllByOrderByLastNameAsc();

}