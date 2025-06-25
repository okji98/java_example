package com.example.spro00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(){
        return "안녕하세요!";
    }

    @GetMapping("/testAll")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
