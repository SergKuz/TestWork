package com.example.demo.converters;

import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

public class UsersConverter {

    public UserDTO entityToDto(User user) {
        return new UserDTO()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setBirthDay(user.getBirthDay())
                .setFullName(user.getFullName())
                .setEmail(user.getEmail())
                .setGender(user.getGender())
                .setPhoto(user.getPhoto());
    }

    public User dtoToEntity( UserDTO user) {
        return new User()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setBirthDay(user.getBirthDay())
                .setFullName(user.getFullName())
                .setEmail(user.getEmail())
                .setGender(user.getGender())
                .setPhoto(user.getPhoto());
    }

    public ListElementDTO entityToListElement(User user) {
        return new ListElementDTO()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setFullName(user.getFullName());
    }
}
