package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Animal {
    private int animalId;
    private String animalType;

    public int getAnimalId() { return animalId; }
    public void setAnimalId(int animalId) { this.animalId = animalId; }
    public String getAnimalType() { return animalType; }
    public void setAnimalType(String animalType) { this.animalType = animalType; }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}

