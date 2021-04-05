package com.example.demo;

import com.example.demo.dto.UserDTO;
import javassist.NotFoundException;

import java.util.Arrays;

public class Validator {

    public static void validate(UserDTO userDTO) throws Exception {
        Arrays.stream(Gender.values())
                .filter(gender -> gender.equals(userDTO.getGender()))
                .findAny()
                .orElseThrow(() -> new NotFoundException("Cant find such gender."));
    }
}
