package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MediaHouse {

    private int houseId;
    private String houseName;

    @Autowired
    private Editor editor;

    public int getHouseId() { return houseId; }
    public void setHouseId(int houseId) { this.houseId = houseId; }

    public String getHouseName() { return houseName; }
    public void setHouseName(String houseName) { this.houseName = houseName; }

    public Editor getEditor() { return editor; }
    public void setEditor(Editor editor) { this.editor = editor; }

    @Override
    public String toString() {
        return "MediaHouse{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", editor=" + editor +
                '}';
    }
}

