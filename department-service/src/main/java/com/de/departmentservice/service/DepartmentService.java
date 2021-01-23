package com.de.departmentservice.service;

import com.de.departmentservice.entity.Department;
import com.de.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addNewDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Integer id) {
        return departmentRepository.findById(id).get();
    }
}
