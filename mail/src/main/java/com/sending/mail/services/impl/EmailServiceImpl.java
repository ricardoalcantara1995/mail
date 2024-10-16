package com.sending.mail.services.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

@Service
@Data
public class EmailServiceImpl {
    @Autowired
    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;
}
