package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bakery {
    private int bakeryId;
    private String bakeryName;
    @Autowired
    private Cake cake;

    public int getBakeryId() { return bakeryId; }
    public void setBakeryId(int bakeryId) { this.bakeryId = bakeryId; }
    public String getBakeryName() { return bakeryName; }
    public void setBakeryName(String bakeryName) { this.bakeryName = bakeryName; }
    public Cake getCake() { return cake; }
    public void setCake(Cake cake) { this.cake = cake; }

    @Override
    public String toString() {
        return "Bakery{" +
                "bakeryId=" + bakeryId +
                ", bakeryName='" + bakeryName + '\'' +
                ", cake=" + cake +
                '}';
    }
}

