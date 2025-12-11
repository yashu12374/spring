package com.xworkz.coreapp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Internet {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


