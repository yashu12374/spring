package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Scientist {
    private int scientistId;
    private String scientistName;

    public int getScientistId() { return scientistId; }
    public void setScientistId(int scientistId) { this.scientistId = scientistId; }

    public String getScientistName() { return scientistName; }
    public void setScientistName(String scientistName) { this.scientistName = scientistName; }

    @Override
    public String toString() {
        return "Scientist{" +
                "scientistId=" + scientistId +
                ", scientistName='" + scientistName + '\'' +
                '}';
    }
}

