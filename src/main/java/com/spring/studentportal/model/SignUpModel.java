package com.spring.studentportal.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class SignUpModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dept;

    private String studentId;

    @Column(name = "passcode")
    @Size(min = 4,max = 5)
    private String password;
}
