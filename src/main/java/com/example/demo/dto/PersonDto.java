package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PersonDto {
    private Integer id;
    private String name;
    List<PersonDto> childs;
}
