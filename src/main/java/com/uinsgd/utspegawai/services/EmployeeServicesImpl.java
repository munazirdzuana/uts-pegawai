package com.uinsgd.utspegawai.services;
import java.util.List;
import java.util.Optional;

import com.uinsgd.utspegawai.entity.Employee;
import com.uinsgd.utspegawai.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

        @Autowired
        private EmployeeRepository repo;

        @Override
        public void saveEmployee(Employee emp) {
            repo.save(emp);
        }

        public List<Employee> getAllEmployees() {
            return repo.findAll();
        }

        @Override
        public void deleteEmployeeById(Integer id) {
            repo.deleteById(id);
        }

        @Override
        public Employee getEmployeeById(Integer id) {
            Optional<Employee> opt = repo.findById(id);
            if(opt.isEmpty()) {
                return null;
            }
            return opt.get();
        }

        @Override
        public void updateEmployee(Employee emp) {
            repo.save(emp);
        }

    }
