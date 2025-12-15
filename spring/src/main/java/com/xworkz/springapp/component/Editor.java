package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Editor {

    private int editorId;
    private String editorName;

    public int getEditorId() { return editorId; }
    public void setEditorId(int editorId) { this.editorId = editorId; }

    public String getEditorName() { return editorName; }
    public void setEditorName(String editorName) { this.editorName = editorName; }

    @Override
    public String toString() {
        return "Editor{" +
                "editorId=" + editorId +
                ", editorName='" + editorName + '\'' +
                '}';
    }
}

