package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Screen {
    private int screenNo;
    private String screenType;

    public int getScreenNo() {
        return screenNo;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenNo(int screenNo) {
        this.screenNo = screenNo;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenNo=" + screenNo +
                ", screenType='" + screenType + '\'' +
                '}';
    }
}
