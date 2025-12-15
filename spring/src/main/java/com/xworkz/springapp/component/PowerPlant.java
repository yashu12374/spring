package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PowerPlant {

    private int plantId;
    private String plantName;

    @Autowired
    private Turbine turbine;

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Turbine getTurbine() {
        return turbine;
    }

    public void setTurbine(Turbine turbine) {
        this.turbine = turbine;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", turbine=" + turbine +
                '}';
    }
}

