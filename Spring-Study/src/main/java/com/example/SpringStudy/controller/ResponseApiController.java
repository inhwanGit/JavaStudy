package com.example.SpringStudy.controller;

import com.example.SpringStudy.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    @GetMapping("")
    public ResponseEntity<UserRequest> user (){

        var user = new UserRequest();
        user.setUserName("박인환");
        user.setUserAge(10);
        user.setUserEmail("inhwanpark19991120@gmail.com");
        user.setIsKorean(true);
        log.info("user : {}", user);

        var response =  ResponseEntity.status(HttpStatus.CREATED).body(user);

        return response;
    }
}