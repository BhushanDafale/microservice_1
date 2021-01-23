package com.de.userservice.entiry;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter @Getter
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Integer departmentId;

}
