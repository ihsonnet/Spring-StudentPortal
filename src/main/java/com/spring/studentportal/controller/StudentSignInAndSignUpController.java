package com.spring.studentportal.controller;

import com.spring.studentportal.dto.request.SignUpRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/")
public class StudentSignInAndSignUpController {

    @PostMapping("signup")
    public void signUp(@RequestBody SignUpRequest signUpRequest)
    {

    }

    @GetMapping("sigIn")
    public String signIn()
    {
    return "ergdfg";
    }
}
