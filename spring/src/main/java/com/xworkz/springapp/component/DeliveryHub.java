package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DeliveryHub {

    private int hubId;
    private String hubName;

    @Autowired
    private Parcel parcel;

    public int getHubId() { return hubId; }
    public void setHubId(int hubId) { this.hubId = hubId; }

    public String getHubName() { return hubName; }
    public void setHubName(String hubName) { this.hubName = hubName; }

    public Parcel getParcel() { return parcel; }
    public void setParcel(Parcel parcel) { this.parcel = parcel; }

    @Override
    public String toString() {
        return "DeliveryHub{" +
                "hubId=" + hubId +
                ", hubName='" + hubName + '\'' +
                ", parcel=" + parcel +
                '}';
    }
}
