package com.sending.mail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
@PropertySource("classpath:email.properties")
public class EmailConfig {
    @Value("${email.username}")
    private String email;
    @Value("${email.password}")
    private String password;

    public Properties getMailProperties(){
        //Instanciamos la clase Properties
        Properties properties = new Properties();
        //Activa la autenticación SMTP.
        properties.put("mail.smtp.auth","true");
        //Habilita el uso de TLS para enviar correos de manera segura
        properties.put("mail.smtp.starttls.enable","true");
        //Especifica el servidor SMTP de Gmail.
        properties.put("mail.smtp.host","smtp.gmail.com");
        //El puerto 587 es el puerto estándar para enviar correos usando TLS en Gmail.
        properties.put("mail.smtp.port","587");
        return properties;
    }
    @Bean
    public JavaMailSender javaMailSender(){
        JavaMailSenderImpl javaMailSenderimpl = new JavaMailSenderImpl();
        javaMailSenderimpl.setJavaMailProperties(getMailProperties());
        javaMailSenderimpl.setUsername(email);
        javaMailSenderimpl.setPassword(password);
        return javaMailSenderimpl;
    }
    @Bean
    public ResourceLoader resourceLoader(){
        return new DefaultResourceLoader();
    }
}
