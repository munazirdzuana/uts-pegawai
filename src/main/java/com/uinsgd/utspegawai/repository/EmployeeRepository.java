package com.uinsgd.utspegawai.repository;

import com.uinsgd.utspegawai.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}