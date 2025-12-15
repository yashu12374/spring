package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Auditor {

    private int auditorId;
    private String auditorName;

    public int getAuditorId() { return auditorId; }
    public void setAuditorId(int auditorId) { this.auditorId = auditorId; }

    public String getAuditorName() { return auditorName; }
    public void setAuditorName(String auditorName) { this.auditorName = auditorName; }

    @Override
    public String toString() {
        return "Auditor{" +
                "auditorId=" + auditorId +
                ", auditorName='" + auditorName + '\'' +
                '}';
    }
}

