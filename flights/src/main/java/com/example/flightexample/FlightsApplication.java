package com.example.flightexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages= {"com.example.flightexample.controller"})
//@ComponentScan(basePackages= {"com.example.flightexample.model"})
//@ComponentScan(basePackages= {"com.example.flightexample.repository"})

public class FlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}

}
