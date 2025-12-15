package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceCenter {
    private int centerId;
    private String centerName;
    @Autowired
    private Technician technician;

    public int getCenterId() { return centerId; }
    public void setCenterId(int centerId) { this.centerId = centerId; }
    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }
    public Technician getTechnician() { return technician; }
    public void setTechnician(Technician technician) { this.technician = technician; }

    @Override
    public String toString() {
        return "ServiceCenter{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", technician=" + technician +
                '}';
    }
}

