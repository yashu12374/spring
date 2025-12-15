package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SportsAcademy {

    private int academyId;
    private String academyName;

    @Autowired
    private Coach coach;

    public int getAcademyId() { return academyId; }
    public void setAcademyId(int academyId) { this.academyId = academyId; }

    public String getAcademyName() { return academyName; }
    public void setAcademyName(String academyName) { this.academyName = academyName; }

    public Coach getCoach() { return coach; }
    public void setCoach(Coach coach) { this.coach = coach; }

    @Override
    public String toString() {
        return "SportsAcademy{" +
                "academyId=" + academyId +
                ", academyName='" + academyName + '\'' +
                ", coach=" + coach +
                '}';
    }
}
