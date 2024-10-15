package com.sending.mail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:email.properties")
public class EmailConfig {
    @Value("${email.username}")
    private String email;
    @Value("${email.password}")
    private String password;

    private Properties getMailProperties(){
        //Instanciamos la clase Properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        return properties;
    }
}
