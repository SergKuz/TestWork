package com.example.demo.controllers;

import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {
    
    private final UsersService usersService;
    
    @GetMapping("/users")
    List<ListElementDTO> all() {
        return usersService.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/users")
    User create(@RequestBody User newUser) {
        return usersService.save(newUser);
    }

    // Single item

    @GetMapping("/users/{id}")
    User findById(@PathVariable Long id) {
        return usersService.findById(id).get();
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        usersService.delete(id);
    }
}
