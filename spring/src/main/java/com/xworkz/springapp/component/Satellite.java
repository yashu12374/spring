package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Satellite {

    private int satelliteId;
    private String satelliteName;

    public int getSatelliteId() { return satelliteId; }
    public void setSatelliteId(int satelliteId) { this.satelliteId = satelliteId; }

    public String getSatelliteName() { return satelliteName; }
    public void setSatelliteName(String satelliteName) { this.satelliteName = satelliteName; }

    @Override
    public String toString() {
        return "Satellite{" +
                "satelliteId=" + satelliteId +
                ", satelliteName='" + satelliteName + '\'' +
                '}';
    }
}
