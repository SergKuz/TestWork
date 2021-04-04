package com.example.demo.services;

import com.example.demo.converters.UsersConverter;
import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UserRepository userRepository;
    private final UsersConverter usersConverter;

    public List<ListElementDTO> findAll() {
        List<ListElementDTO> listElementDTOS = new ArrayList<>();
        userRepository.findAll()
                .forEach(user ->
                        listElementDTOS.add(usersConverter.entityToListElement(user)));
        return listElementDTOS;
    }

    public UserDTO findById(Long id) {
        return usersConverter.entityToDto(userRepository.findById(id).get());
    }

    public UserDTO save(UserDTO books) {
        return usersConverter.entityToDto(
                userRepository.save(
                        usersConverter.dtoToEntity(books)));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
