package com.springframework.pets;

/**
 * Created on 07/08/2025 by Jesse H.
 */

public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
