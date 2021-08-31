package com.magh.springboot.web;

import com.magh.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }

    @CrossOrigin("*")
    @GetMapping("/api/hello")
    public String hello_react(){

        return "안녕하세요. 현재 서버시간은 " + new Date() + "입니다. \n";
    }

}
