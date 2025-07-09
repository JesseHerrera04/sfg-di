package guru.springframework.sfg_di.services;

/**
 * Created on 06/30/2025 by Jesse H.
 */

public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
