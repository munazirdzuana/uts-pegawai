package com.uinsgd.utspegawai.services;
import com.uinsgd.utspegawai.entity.Employee;
import java.util.List;

public interface EmployeeServices {
    void saveEmployee(Employee emp);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(Integer id);
    Employee getEmployeeById(Integer id);
    void updateEmployee(Employee emp);
}
