package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SoftwareFirm {

    private int firmId;
    private String firmName;

    @Autowired
    private Tester tester;

    public int getFirmId() { return firmId; }
    public void setFirmId(int firmId) { this.firmId = firmId; }

    public String getFirmName() { return firmName; }
    public void setFirmName(String firmName) { this.firmName = firmName; }

    public Tester getTester() { return tester; }
    public void setTester(Tester tester) { this.tester = tester; }

    @Override
    public String toString() {
        return "SoftwareFirm{" +
                "firmId=" + firmId +
                ", firmName='" + firmName + '\'' +
                ", tester=" + tester +
                '}';
    }
}
