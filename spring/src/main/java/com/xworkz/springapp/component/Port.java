package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Port {

    private int portId;
    private String portName;

    @Autowired
    private Ship ship;

    public int getPortId() { return portId; }
    public void setPortId(int portId) { this.portId = portId; }

    public String getPortName() { return portName; }
    public void setPortName(String portName) { this.portName = portName; }

    public Ship getShip() { return ship; }
    public void setShip(Ship ship) { this.ship = ship; }

    @Override
    public String toString() {
        return "Port{" +
                "portId=" + portId +
                ", portName='" + portName + '\'' +
                ", ship=" + ship +
                '}';
    }
}

