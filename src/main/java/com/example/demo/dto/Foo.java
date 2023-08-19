package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Foo {
    private Integer id;
    private String name;
    List<Foo> childs;
}
