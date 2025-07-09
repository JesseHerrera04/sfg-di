package guru.springframework.sfg_di.services;

/**
 * Created on 06/30/2025 by Jesse H.
 */

public class PrimaryGreetingService implements GreetingService {

    @Override 
    public String sayGreeting() {

        return "Hello World - From the PRIMARY Bean";
    }
}
