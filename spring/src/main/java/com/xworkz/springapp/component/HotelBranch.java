package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HotelBranch {
    private int branchId;
    private String branchName;
    @Autowired
    private Receptionist receptionist;

    public int getBranchId() { return branchId; }
    public void setBranchId(int branchId) { this.branchId = branchId; }
    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }
    public Receptionist getReceptionist() { return receptionist; }
    public void setReceptionist(Receptionist receptionist) { this.receptionist = receptionist; }

    @Override
    public String toString() {
        return "HotelBranch{" +
                "branchId=" + branchId +
                ", branchName='" + branchName + '\'' +
                ", receptionist=" + receptionist +
                '}';
    }
}

