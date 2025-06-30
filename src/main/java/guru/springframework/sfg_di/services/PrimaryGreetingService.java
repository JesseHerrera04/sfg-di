package guru.springframework.sfg_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created on 06/30/2025 by Jesse H.
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override 
    public String sayGreeting() {

        return "Hello World - From the PRIMARY Bean";
    }
}
