package com.example.demo.dto;

import com.example.demo.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Accessors(chain = true)
public class UserDTO {

    Long id;
    @NotBlank
    String username;
    @NotBlank
    String fullName;
    @Email(message = "Email should be valid")
    String email;
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date birthDay;
    @NotBlank
    Gender gender;
    @NotBlank
    String photo;
}
