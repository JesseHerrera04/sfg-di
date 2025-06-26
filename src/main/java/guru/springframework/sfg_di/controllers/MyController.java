package guru.springframework.sfg_di.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created on 06/26/2025 by Jesse H.
 */

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
