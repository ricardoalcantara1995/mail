package com.sending.mail.services.impl;

import com.sending.mail.dto.EmailDTO;
import com.sending.mail.services.IEmailServices;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

@Service
@Data
public class EmailServiceImpl implements IEmailServices {
    @Autowired
    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;

    @Override
    public void sendMail(EmailDTO emailDTO) {

    }
}
