package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hostel {
    private int hostelId;
    private String hostelName;
    @Autowired
    private Warden warden;

    public int getHostelId() { return hostelId; }
    public void setHostelId(int hostelId) { this.hostelId = hostelId; }
    public String getHostelName() { return hostelName; }
    public void setHostelName(String hostelName) { this.hostelName = hostelName; }
    public Warden getWarden() { return warden; }
    public void setWarden(Warden warden) { this.warden = warden; }

    @Override
    public String toString() {
        return "Hostel{" +
                "hostelId=" + hostelId +
                ", hostelName='" + hostelName + '\'' +
                ", warden=" + warden +
                '}';
    }
}

