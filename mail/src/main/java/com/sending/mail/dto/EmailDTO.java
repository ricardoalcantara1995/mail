package com.sending.mail.dto;

import lombok.Data;

@Data
public class EmailDTO {
    public String recipient;
    public String  subject;
    public String message;
}
