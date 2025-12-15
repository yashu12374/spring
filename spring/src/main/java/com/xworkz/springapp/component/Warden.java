package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Warden {
    private int wardenId;
    private String wardenName;

    public int getWardenId() { return wardenId; }
    public void setWardenId(int wardenId) { this.wardenId = wardenId; }
    public String getWardenName() { return wardenName; }
    public void setWardenName(String wardenName) { this.wardenName = wardenName; }

    @Override
    public String toString() {
        return "Warden{" +
                "wardenId=" + wardenId +
                ", wardenName='" + wardenName + '\'' +
                '}';
    }
}

