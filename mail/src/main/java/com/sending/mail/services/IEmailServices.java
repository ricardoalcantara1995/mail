package com.sending.mail.services;

import com.sending.mail.dto.EmailDTO;

public interface IEmailServices {
    public void sendMail(EmailDTO emailDTO);
}
