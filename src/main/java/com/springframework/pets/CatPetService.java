package com.springframework.pets;

/**
 * Created on 06/30/2025 by Jesse H.
 */

public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}