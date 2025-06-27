package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

/**
 * Created on 06/26/2025 by Jesse H.
 */

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
