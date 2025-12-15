package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Container {

    private int containerId;
    private String containerType;

    public int getContainerId() { return containerId; }
    public void setContainerId(int containerId) { this.containerId = containerId; }

    public String getContainerType() { return containerType; }
    public void setContainerType(String containerType) { this.containerType = containerType; }

    @Override
    public String toString() {
        return "Container{" +
                "containerId=" + containerId +
                ", containerType='" + containerType + '\'' +
                '}';
    }
}

