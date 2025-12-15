package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Judge {

    private int judgeId;
    private String judgeName;

    public int getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(int judgeId) {
        this.judgeId = judgeId;
    }

    public String getJudgeName() {
        return judgeName;
    }

    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    @Override
    public String toString() {
        return "Judge{" +
                "judgeId=" + judgeId +
                ", judgeName='" + judgeName + '\'' +
                '}';
    }
}
