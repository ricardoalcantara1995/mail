package com.sending.mail.services;

import com.sending.mail.dto.EmailDTO;
import jakarta.mail.MessagingException;

public interface IEmailServices {
    public void sendMail(EmailDTO emailDTO) throws MessagingException;
}
