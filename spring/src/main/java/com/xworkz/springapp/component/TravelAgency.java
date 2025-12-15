package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TravelAgency {

    private int agencyId;
    private String agencyName;

    @Autowired
    private Guide guide;

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "agencyId=" + agencyId +
                ", agencyName='" + agencyName + '\'' +
                ", guide=" + guide +
                '}';
    }
}

