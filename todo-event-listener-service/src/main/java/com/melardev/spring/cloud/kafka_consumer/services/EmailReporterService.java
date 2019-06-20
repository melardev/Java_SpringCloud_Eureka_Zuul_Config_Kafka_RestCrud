package com.melardev.spring.cloud.kafka_consumer.services;


import com.melardev.spring.cloud.kafka_consumer.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailReporterService implements IReporterService {

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void reportTodoCreated(Todo todo) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo("melardev-ms-admin@ms-factory.com");
            message.setSubject("New Todo Created");
            message.setText("");

            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
    }
}
