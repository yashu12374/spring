package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MobileStore {
    private int storeId;
    private String storeName;
    @Autowired
    private Mobile mobile;

    public int getStoreId() { return storeId; }
    public void setStoreId(int storeId) { this.storeId = storeId; }
    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
    public Mobile getMobile() { return mobile; }
    public void setMobile(Mobile mobile) { this.mobile = mobile; }

    @Override
    public String toString() {
        return "MobileStore{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}


