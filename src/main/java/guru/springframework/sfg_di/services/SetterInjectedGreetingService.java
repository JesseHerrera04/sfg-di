package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

/**
 * Created on 06/27/2025
 */

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
