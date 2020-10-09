package com.theminimalistdev.redditclone.controller;

import com.theminimalistdev.redditclone.dto.RegisterRequest;
import com.theminimalistdev.redditclone.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful",
                OK);
    }
}
