package com.spring.spring_boot_study;

import org.springframework.web.bind.annotation.*;

@RestController // Rest Api를 처리하는 컨트롤러임을 알려줌
public class HelloController{
    @GetMapping("/spring")
    public String hello(){
    return "spring에 오신걸 환영합니다";
   }

}