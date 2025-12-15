package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Court {

    private int courtId;
    private String courtName;
    @Autowired
    private Judge judge;

    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Judge getJudge() {
        return judge;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    @Override
    public String toString() {
        return "Court{" +
                "courtId=" + courtId +
                ", courtName='" + courtName + '\'' +
                ", judge=" + judge +
                '}';
    }
}
