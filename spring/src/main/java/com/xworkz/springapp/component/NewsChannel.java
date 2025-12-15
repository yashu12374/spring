package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NewsChannel {

    private int channelId;
    private String channelName;

    @Autowired
    private Reporter reporter;

    // getters & setters
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "NewsChannel{" +
                "channelId=" + channelId +
                ", channelName='" + channelName + '\'' +
                ", reporter=" + reporter +
                '}';
    }
}

