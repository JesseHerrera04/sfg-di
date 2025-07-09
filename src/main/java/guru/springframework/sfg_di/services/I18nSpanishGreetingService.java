package guru.springframework.sfg_di.services;

/**
 * Created on 06/30/2025 by Jesse H.
 */


//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
