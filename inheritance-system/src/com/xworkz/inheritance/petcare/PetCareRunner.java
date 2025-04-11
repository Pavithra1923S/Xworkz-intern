package com.xworkz.inheritance.petcare;

public class PetCareRunner {
    public static void main(String[] args) {
        PetCare pet = new PetCare();
        pet.feedPet();
        pet.groomPet();

        DogPetCare dog = new DogPetCare();
        dog.feedPet();
        dog.groomPet();
    }
}
