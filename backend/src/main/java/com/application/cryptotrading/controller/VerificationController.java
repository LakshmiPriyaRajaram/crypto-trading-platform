package com.application.cryptotrading.controller;

import com.application.cryptotrading.exception.UserException;
import com.application.cryptotrading.model.User;
import com.application.cryptotrading.model.VerificationCode;
import com.application.cryptotrading.service.EmailService;
import com.application.cryptotrading.service.UserService;
import com.application.cryptotrading.service.VerificationService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }




}
