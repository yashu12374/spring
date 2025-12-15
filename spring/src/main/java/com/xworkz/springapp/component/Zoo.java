package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zoo {
    private int zooId;
    private String zooName;
    @Autowired
    private Animal animal;

    public int getZooId() { return zooId; }
    public void setZooId(int zooId) { this.zooId = zooId; }
    public String getZooName() { return zooName; }
    public void setZooName(String zooName) { this.zooName = zooName; }
    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooId=" + zooId +
                ", zooName='" + zooName + '\'' +
                ", animal=" + animal +
                '}';
    }
}

