package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Database {

    private int databaseId;
    private String databaseName;

    public int getDatabaseId() { return databaseId; }
    public void setDatabaseId(int databaseId) { this.databaseId = databaseId; }

    public String getDatabaseName() { return databaseName; }
    public void setDatabaseName(String databaseName) { this.databaseName = databaseName; }

    @Override
    public String toString() {
        return "Database{" +
                "databaseId=" + databaseId +
                ", databaseName='" + databaseName + '\'' +
                '}';
    }
}

