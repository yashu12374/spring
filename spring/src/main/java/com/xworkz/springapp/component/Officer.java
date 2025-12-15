package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Officer {

    private int officerId;
    private String officerName;

    public int getOfficerId() {
        return officerId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officerId=" + officerId +
                ", officerName='" + officerName + '\'' +
                '}';
    }
}
