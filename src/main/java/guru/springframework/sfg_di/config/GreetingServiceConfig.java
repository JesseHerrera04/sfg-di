package guru.springframework.sfg_di.config;

import guru.springframework.sfg_di.services.ConstructorGreetingService;
import guru.springframework.sfg_di.services.PropertyInjectedGreetingService;
import guru.springframework.sfg_di.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 07/08/2025 by Jesse H.
 */

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
