package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Server {

    private int serverId;
    private String serverType;

    public int getServerId() { return serverId; }
    public void setServerId(int serverId) { this.serverId = serverId; }

    public String getServerType() { return serverType; }
    public void setServerType(String serverType) { this.serverType = serverType; }

    @Override
    public String toString() {
        return "Server{" +
                "serverId=" + serverId +
                ", serverType='" + serverType + '\'' +
                '}';
    }
}
