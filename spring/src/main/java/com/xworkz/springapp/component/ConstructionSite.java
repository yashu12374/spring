package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ConstructionSite {

    private int siteId;
    private String siteName;

    @Autowired
    private Engineer engineer;

    public int getSiteId() { return siteId; }
    public void setSiteId(int siteId) { this.siteId = siteId; }

    public String getSiteName() { return siteName; }
    public void setSiteName(String siteName) { this.siteName = siteName; }

    public Engineer getEngineer() { return engineer; }
    public void setEngineer(Engineer engineer) { this.engineer = engineer; }

    @Override
    public String toString() {
        return "ConstructionSite{" +
                "siteId=" + siteId +
                ", siteName='" + siteName + '\'' +
                ", engineer=" + engineer +
                '}';
    }
}

