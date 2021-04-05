package com.example.demo.services;

import com.example.demo.Validator;
import com.example.demo.converters.UsersConverter;
import com.example.demo.dto.ListElementDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public UserDTO save(UserDTO userDTO) throws Exception {
        Validator.validate(userDTO);

        return usersConverter.entityToDto(
                userRepository.save(
                        usersConverter.dtoToEntity(userDTO)));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
