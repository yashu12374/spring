package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mentor {
    private int mentorId;
    private String mentorName;

    public int getMentorId() { return mentorId; }
    public void setMentorId(int mentorId) { this.mentorId = mentorId; }
    public String getMentorName() { return mentorName; }
    public void setMentorName(String mentorName) { this.mentorName = mentorName; }

    @Override
    public String toString() {
        return "Mentor{" +
                "mentorId=" + mentorId +
                ", mentorName='" + mentorName + '\'' +
                '}';
    }
}

