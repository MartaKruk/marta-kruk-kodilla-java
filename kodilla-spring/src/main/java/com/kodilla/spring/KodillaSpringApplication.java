package com.kodilla.spring;

import com.kodilla.spring.orderservice.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class KodillaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaSpringApplication.class, args);

		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring.orderservice");
		OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);

		OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
		OrderRequest orderRequest = orderRequestRetriever.retrieve();

		orderProcessor.processOrder(orderRequest);
	}

}
