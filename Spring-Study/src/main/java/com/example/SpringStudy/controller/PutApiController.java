package com.example.SpringStudy.controller;

import com.example.SpringStudy.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody UserRequest userRequest){
        log.info("Request : {} ", userRequest);
    }
}
