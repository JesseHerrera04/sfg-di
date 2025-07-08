package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created on 06/30/2025 by Jesse H.
 */
@Profile({"dog", "default"})
@Service//("petService")
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
