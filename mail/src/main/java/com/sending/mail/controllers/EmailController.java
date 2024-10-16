package com.sending.mail.controllers;

import com.sending.mail.dto.EmailDTO;
import com.sending.mail.services.impl.EmailServiceImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/send-mail")
public class EmailController {
    @Autowired
    private EmailServiceImpl emailService;
    @PostMapping
    ResponseEntity<String>sendMail(@RequestBody EmailDTO emailDTO) throws MessagingException {
        emailService.sendMail(emailDTO);
         return new ResponseEntity<>("Email success", HttpStatus.OK);
    }
}
