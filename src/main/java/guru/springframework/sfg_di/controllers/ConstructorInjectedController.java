package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

/**
 * Created on 06/27/2025 by Jesse H.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
