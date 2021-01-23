package com.de.userservice.vo;

import com.de.userservice.entiry.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentResponseTemplateVo {

    private User user;
    private Department department;

}
