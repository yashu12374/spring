package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gym {

    private int gymId;
    private String gymName;

    @Autowired
    private Equipment equipment;

    public int getGymId() { return gymId; }
    public void setGymId(int gymId) { this.gymId = gymId; }

    public String getGymName() { return gymName; }
    public void setGymName(String gymName) { this.gymName = gymName; }

    public Equipment getEquipment() { return equipment; }
    public void setEquipment(Equipment equipment) { this.equipment = equipment; }

    @Override
    public String toString() {
        return "Gym{" +
                "gymId=" + gymId +
                ", gymName='" + gymName + '\'' +
                ", equipment=" + equipment +
                '}';
    }
}
