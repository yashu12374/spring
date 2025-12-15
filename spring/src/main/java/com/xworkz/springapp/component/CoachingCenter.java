package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CoachingCenter {
    private int centerId;
    private String centerName;
    @Autowired
    private Mentor mentor;

    public int getCenterId() { return centerId; }
    public void setCenterId(int centerId) { this.centerId = centerId; }
    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }
    public Mentor getMentor() { return mentor; }
    public void setMentor(Mentor mentor) { this.mentor = mentor; }

    @Override
    public String toString() {
        return "CoachingCenter{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", mentor=" + mentor +
                '}';
    }
}
