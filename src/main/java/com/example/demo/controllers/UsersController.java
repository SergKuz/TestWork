package com.example.demo.controllers;

import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {
    
    private final UsersService usersService;
    
    @GetMapping("/users")
    List<ListElementDTO> all() {
        return usersService.findAll();
    }

    @PostMapping("/users")
    UserDTO create(@Valid @RequestBody UserDTO newUser) throws Exception {
        return usersService.save(newUser);
    }

    @GetMapping("/users/{id}")
    UserDTO findById(@PathVariable Long id) {
        return usersService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        usersService.delete(id);
    }
}
