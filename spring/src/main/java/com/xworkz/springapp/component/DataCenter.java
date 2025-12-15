package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DataCenter {

    private int centerId;
    private String centerName;

    @Autowired
    private Database database;

    public int getCenterId() { return centerId; }
    public void setCenterId(int centerId) { this.centerId = centerId; }

    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }

    public Database getDatabase() { return database; }
    public void setDatabase(Database database) { this.database = database; }

    @Override
    public String toString() {
        return "DataCenter{" +
                "centerId=" + centerId +
                ", centerName='" + centerName + '\'' +
                ", database=" + database +
                '}';
    }
}

