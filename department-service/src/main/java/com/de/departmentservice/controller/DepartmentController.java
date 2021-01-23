package com.de.departmentservice.controller;

import com.de.departmentservice.entity.Department;
import com.de.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping({"/", ""})
    public Department addNewDepartment(@RequestBody Department department) {
        log.info("DEPARTMENT-SERVICE -->> add new department");
        return departmentService.addNewDepartment(department);
    }

    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") Integer id) {
        log.info("DEPARTMENT-SERVICE --> find department by id");
        return departmentService.findDepartmentById(id);
    }

}
