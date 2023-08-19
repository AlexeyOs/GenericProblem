package com.example.demo.service;

import com.example.demo.dto.PersonFullDto;
import com.example.demo.dto.PersonDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ParseService {

   private final ObjectMapper objectMapper;

   public void jsonParser(String json) throws JsonProcessingException {

         if (json.contains("parentPhone")){
            PersonFullDto extendedFooDto = objectMapper.readValue(json, PersonFullDto.class);
            log.info(extendedFooDto.toString());
         } else {
            PersonDto foo = objectMapper.readValue(json, PersonDto.class);
            log.info(foo.toString());
         }
   }
}
