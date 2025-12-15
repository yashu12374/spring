package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PoliceStation {

    private int stationId;
    private String stationName;

    @Autowired
    private Officer officer;

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    @Override
    public String toString() {
        return "PoliceStation{" +
                "stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", officer=" + officer +
                '}';
    }
}
