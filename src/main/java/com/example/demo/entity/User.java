package com.example.demo.entity;

import com.example.demo.Gender;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue
    Long id;

    String username;
    String fullName;
    String email;
    Long birthDay;
    Gender gender;
    String photo;
}
