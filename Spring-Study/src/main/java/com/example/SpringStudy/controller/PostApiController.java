package com.example.SpringStudy.controller;

import com.example.SpringStudy.model.BookRequset;
import com.example.SpringStudy.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(@RequestBody BookRequset bookRequset){
        System.out.println(bookRequset);
        return bookRequset.toString();
    }

    @PostMapping("/user")
    public String UserPost(@RequestBody UserRequest userRequest){
        System.out.println(userRequest);
        return userRequest.toString();
    }
}
