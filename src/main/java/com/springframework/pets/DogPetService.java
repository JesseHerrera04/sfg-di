package com.springframework.pets;

/**
 * Created on 06/30/2025 by Jesse H.
 */

public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
