package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Parcel {

    private int parcelId;
    private String parcelType;

    public int getParcelId() { return parcelId; }
    public void setParcelId(int parcelId) { this.parcelId = parcelId; }

    public String getParcelType() { return parcelType; }
    public void setParcelType(String parcelType) { this.parcelType = parcelType; }

    @Override
    public String toString() {
        return "Parcel{" +
                "parcelId=" + parcelId +
                ", parcelType='" + parcelType + '\'' +
                '}';
    }
}

