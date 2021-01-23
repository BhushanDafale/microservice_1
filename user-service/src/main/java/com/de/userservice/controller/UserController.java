package com.de.userservice.controller;

import com.de.userservice.entiry.User;
import com.de.userservice.service.UserService;
import com.de.userservice.vo.Department;
import com.de.userservice.vo.UserDepartmentResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    // add new user
    @PostMapping({"/", ""})
    public User addNewUser(@RequestBody User user) {
        log.info("USER-SERVICE -->> add new user");
        return userService.addNewUser(user);
    }

    // get user by id
    @GetMapping("{id}")
    public UserDepartmentResponseTemplateVo getUserById(@PathVariable Integer id) {
        log.info("USER-SERVICE -->> get user by id");
        UserDepartmentResponseTemplateVo templateVo = new UserDepartmentResponseTemplateVo();
        User user = userService.getUserById(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getId(), Department.class);
        templateVo.setUser(user);
        templateVo.setDepartment(department);
        return templateVo;
    }

}
