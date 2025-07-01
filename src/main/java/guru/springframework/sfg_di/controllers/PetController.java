package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created on 06/30/2025 by Jesse H.
 */

@Controller
public class PetController {

    private final PetService petService;

    public PetController(/*@Qualifier("petService")*/ PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}