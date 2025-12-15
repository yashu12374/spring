package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FitnessCenter {

    private int centerId;
    private String centerName;

    @Autowired
    private Instructor instructor;

    public int getCenterId() { return centerId; }
    public void setCenterId(int centerId) { this.centerId = centerId; }

    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return "FitnessCenter{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
