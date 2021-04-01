package com.example.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ListElementDTO {

    Long id;
    String username;
    String fullName;
}
