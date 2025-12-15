package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TelecomOffice {

    private int officeId;
    private String officeName;

    @Autowired
    private Network network;

    public int getOfficeId() { return officeId; }
    public void setOfficeId(int officeId) { this.officeId = officeId; }

    public String getOfficeName() { return officeName; }
    public void setOfficeName(String officeName) { this.officeName = officeName; }

    public Network getNetwork() { return network; }
    public void setNetwork(Network network) { this.network = network; }

    @Override
    public String toString() {
        return "TelecomOffice{" +
                "officeId=" + officeId +
                ", officeName='" + officeName + '\'' +
                ", network=" + network +
                '}';
    }
}
