package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Technician {
    private int technicianId;
    private String technicianName;

    public int getTechnicianId() { return technicianId; }
    public void setTechnicianId(int technicianId) { this.technicianId = technicianId; }
    public String getTechnicianName() { return technicianName; }
    public void setTechnicianName(String technicianName) { this.technicianName = technicianName; }

    @Override
    public String toString() {
        return "Technician{" +
                "technicianId=" + technicianId +
                ", technicianName='" + technicianName + '\'' +
                '}';
    }
}

