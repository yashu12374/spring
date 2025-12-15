package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ship {

    private int shipId;
    private String shipName;

    public int getShipId() { return shipId; }
    public void setShipId(int shipId) { this.shipId = shipId; }

    public String getShipName() { return shipName; }
    public void setShipName(String shipName) { this.shipName = shipName; }

    @Override
    public String toString() {
        return "Ship{" +
                "shipId=" + shipId +
                ", shipName='" + shipName + '\'' +
                '}';
    }
}

