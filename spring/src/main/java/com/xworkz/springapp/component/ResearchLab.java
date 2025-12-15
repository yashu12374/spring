package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ResearchLab {

    private int labId;
    private String labName;

    @Autowired
    private Scientist scientist;

    public int getLabId() { return labId; }
    public void setLabId(int labId) { this.labId = labId; }

    public String getLabName() { return labName; }
    public void setLabName(String labName) { this.labName = labName; }

    public Scientist getScientist() { return scientist; }
    public void setScientist(Scientist scientist) { this.scientist = scientist; }

    @Override
    public String toString() {
        return "ResearchLab{" +
                "labId=" + labId +
                ", labName='" + labName + '\'' +
                ", scientist=" + scientist +
                '}';
    }
}

