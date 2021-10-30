package com.kodilla.spring.orderservice;

public interface DistributionCenter {

    void sendOrder(User user, Product product, int quantity);
}
