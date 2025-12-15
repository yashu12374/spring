package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpaceCenter {

    private int centerId;
    private String centerName;

    @Autowired
    private Satellite satellite;

    public int getCenterId() { return centerId; }
    public void setCenterId(int centerId) { this.centerId = centerId; }

    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }

    public Satellite getSatellite() { return satellite; }
    public void setSatellite(Satellite satellite) { this.satellite = satellite; }

    @Override
    public String toString() {
        return "SpaceCenter{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", satellite=" + satellite +
                '}';
    }
}
