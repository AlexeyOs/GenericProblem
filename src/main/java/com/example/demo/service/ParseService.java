package com.example.demo.service;

import com.example.demo.dto.ExtendedFoo;
import com.example.demo.dto.Foo;
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
            ExtendedFoo extendedFoo = objectMapper.readValue(json, ExtendedFoo.class);
            log.info(extendedFoo.toString());
         } else {
            Foo foo = objectMapper.readValue(json, Foo.class);
            log.info(foo.toString());
         }
   }
}
