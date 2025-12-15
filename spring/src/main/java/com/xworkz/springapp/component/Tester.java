package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Tester {

    private int testerId;
    private String testerName;

    public int getTesterId() { return testerId; }
    public void setTesterId(int testerId) { this.testerId = testerId; }

    public String getTesterName() { return testerName; }
    public void setTesterName(String testerName) { this.testerName = testerName; }

    @Override
    public String toString() {
        return "Tester{" +
                "testerId=" + testerId +
                ", testerName='" + testerName + '\'' +
                '}';
    }
}

