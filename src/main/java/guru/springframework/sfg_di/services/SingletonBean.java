package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Component;

/**
 * Created on 07/08/2025
 */

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
