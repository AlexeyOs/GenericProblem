package com.example.demo.controller;

import com.example.demo.service.ParseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@RequestMapping(value = "parse")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ParseController {

    private final String fooExtended = "{\n" +
            "  \"id\": 5,\n" +
            "  \"name\": \"Вася\",\n" +
            "  \"parentPhone\" : \"111111\",\n" +
            "  \"childs\": [{\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"Петя\",\n" +
            "    \"parentPhone\" : \"111111\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2,\n" +
            "    \"name\": \"Таня\"\n" +
            "  }\n" +
            "  ]\n" +
            "}";

    private final String foo ="{\n" +
            "  \"id\": 5,\n" +
            "  \"name\": \"Вася\",\n" +
            "  \"childs\": [{\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"Петя\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2,\n" +
            "    \"name\": \"Таня\"\n" +
            "  }\n" +
            "  ]\n" +
            "}";

    private final ParseService parseService;

    @GetMapping(value = "/foo")
    public void importFormFromOtherServer() throws JsonProcessingException {
        parseService.jsonParser(foo);
    }
}
