package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mobile {
    private int mobileId;
    private String mobileBrand;

    public int getMobileId() { return mobileId; }
    public void setMobileId(int mobileId) { this.mobileId = mobileId; }
    public String getMobileBrand() { return mobileBrand; }
    public void setMobileBrand(String mobileBrand) { this.mobileBrand = mobileBrand; }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId=" + mobileId +
                ", mobileBrand='" + mobileBrand + '\'' +
                '}';
    }
}

