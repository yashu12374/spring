package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InsuranceOffice {

    private int officeId;
    private String officeName;

    @Autowired
    private Agent agent;

    public int getOfficeId() { return officeId; }
    public void setOfficeId(int officeId) { this.officeId = officeId; }

    public String getOfficeName() { return officeName; }
    public void setOfficeName(String officeName) { this.officeName = officeName; }

    public Agent getAgent() { return agent; }
    public void setAgent(Agent agent) { this.agent = agent; }

    @Override
    public String toString() {
        return "InsuranceOffice{" +
                "officeId=" + officeId +
                ", officeName='" + officeName + '\'' +
                ", agent=" + agent +
                '}';
    }
}

