package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

/**
 * Created on 06/27/2025 by Jesse H.
 */

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
