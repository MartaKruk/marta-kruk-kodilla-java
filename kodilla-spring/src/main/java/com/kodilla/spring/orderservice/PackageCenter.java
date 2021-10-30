package com.kodilla.spring.orderservice;

import org.springframework.stereotype.Component;

@Component
public class PackageCenter implements DistributionCenter {

    @Override
    public void sendOrder(User user, Product product, int quantity) {

    }
}
