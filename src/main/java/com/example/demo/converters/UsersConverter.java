package com.example.demo.converters;

import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

public class UsersConverter {

    public UserDTO entityToDto(User user) {
        return new UserDTO();
    }

    public ListElementDTO entityToListElement(User user) {
        return new ListElementDTO();
    }
}
