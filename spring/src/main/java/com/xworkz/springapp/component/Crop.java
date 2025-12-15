package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Crop {

    private int cropId;
    private String cropName;

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "cropId=" + cropId +
                ", cropName='" + cropName + '\'' +
                '}';
    }
}