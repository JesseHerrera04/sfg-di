package guru.springframework.sfg_di.services;

/**
 * Created on 06/27/2025
 */

public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
