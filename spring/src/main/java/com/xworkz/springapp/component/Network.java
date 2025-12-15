package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Network {

    private int networkId;
    private String networkType;

    public int getNetworkId() { return networkId; }
    public void setNetworkId(int networkId) { this.networkId = networkId; }

    public String getNetworkType() { return networkType; }
    public void setNetworkType(String networkType) { this.networkType = networkType; }

    @Override
    public String toString() {
        return "Network{" +
                "networkId=" + networkId +
                ", networkType='" + networkType + '\'' +
                '}';
    }
}

