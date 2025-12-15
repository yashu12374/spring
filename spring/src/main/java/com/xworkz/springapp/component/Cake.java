package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cake {
    private int cakeId;
    private String cakeType;

    public int getCakeId() { return cakeId; }
    public void setCakeId(int cakeId) { this.cakeId = cakeId; }
    public String getCakeType() { return cakeType; }
    public void setCakeType(String cakeType) { this.cakeType = cakeType; }

    @Override
    public String toString() {
        return "Cake{" +
                "cakeId=" + cakeId +
                ", cakeType='" + cakeType + '\'' +
                '}';
    }
}

