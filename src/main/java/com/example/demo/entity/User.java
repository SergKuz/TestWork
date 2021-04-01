package com.example.demo.entity;

import com.example.demo.Gender;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    Long id;

    String username;
    String fullName;
    String email;
    Long birthDay;
    Gender gender;
    String photo;
}
