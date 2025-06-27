package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

/**
 * Created on 06/27/2025 By Jesse H.
 */

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
