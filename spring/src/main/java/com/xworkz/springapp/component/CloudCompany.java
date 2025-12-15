package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CloudCompany {

    private int companyId;
    private String companyName;

    @Autowired
    private Server server;

    public int getCompanyId() { return companyId; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public Server getServer() { return server; }
    public void setServer(Server server) { this.server = server; }

    @Override
    public String toString() {
        return "CloudCompany{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", server=" + server +
                '}';
    }
}

