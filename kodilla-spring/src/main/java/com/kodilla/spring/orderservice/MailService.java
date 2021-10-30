package com.kodilla.spring.orderservice;

import org.springframework.stereotype.Component;

@Component
public class MailService implements InformationService {

    @Override
    public void sendConfirmation(User user) {
        System.out.println("Message has been sent.");
    }
}
