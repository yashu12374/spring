package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Turbine {

    private int turbineId;
    private String turbineType;

    public int getTurbineId() {
        return turbineId;
    }

    public void setTurbineId(int turbineId) {
        this.turbineId = turbineId;
    }

    public String getTurbineType() {
        return turbineType;
    }

    public void setTurbineType(String turbineType) {
        this.turbineType = turbineType;
    }

    @Override
    public String toString() {
        return "Turbine{" +
                "turbineId=" + turbineId +
                ", turbineType='" + turbineType + '\'' +
                '}';
    }
}

