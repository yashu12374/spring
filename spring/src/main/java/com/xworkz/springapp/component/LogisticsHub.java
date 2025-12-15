package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LogisticsHub {

    private int hubId;
    private String hubName;

    @Autowired
    private Driver driver;

    public int getHubId() { return hubId; }
    public void setHubId(int hubId) { this.hubId = hubId; }

    public String getHubName() { return hubName; }
    public void setHubName(String hubName) { this.hubName = hubName; }

    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }

    @Override
    public String toString() {
        return "LogisticsHub{" +
                "hubId=" + hubId +
                ", hubName='" + hubName + '\'' +
                ", driver=" + driver +
                '}';
    }
}
