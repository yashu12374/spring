package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coach {
    private int coachId;
    private String coachName;

    public int getCoachId() { return coachId; }
    public void setCoachId(int coachId) { this.coachId = coachId; }

    public String getCoachName() { return coachName; }
    public void setCoachName(String coachName) { this.coachName = coachName; }

    @Override
    public String toString() {
        return "Coach{" +
                "coachId=" + coachId +
                ", coachName='" + coachName + '\'' +
                '}';
    }
}

