package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SetterInjectedControllerTest {

    SetterInjectedController  controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}