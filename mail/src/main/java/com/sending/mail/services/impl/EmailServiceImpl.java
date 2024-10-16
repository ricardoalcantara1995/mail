package com.sending.mail.services.impl;

import com.sending.mail.dto.EmailDTO;
import com.sending.mail.services.IEmailServices;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@Data
public class EmailServiceImpl implements IEmailServices {
    @Autowired
    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;

    @Override
    public void sendMail(EmailDTO emailDTO) throws MessagingException {
    try{
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper =
                new MimeMessageHelper(message,true,"UTF-8");
        helper.setTo(emailDTO.getRecipient());
        helper.setSubject(emailDTO.getSubject());
        //Contexto de thymeleaf
        Context context = new Context();
        context.setVariable("message",emailDTO.getMessage());
        String ContentHTML =
                //nombre de la pantilla
                templateEngine.process("email",context);
        helper.setText(ContentHTML,true);
        javaMailSender.send(message);
    }catch (Exception exception){
            throw new RuntimeException("Error Email has not send " +
                    ""+exception.getMessage() + " "+exception);
        }
            }
}
