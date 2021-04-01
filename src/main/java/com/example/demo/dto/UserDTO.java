package com.example.demo.dto;

import com.example.demo.Gender;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserDTO {

    Long id;
    String username;
    String fullName;
    String email;
    Long birthDay;
    Gender gender;
    String photo;
}
