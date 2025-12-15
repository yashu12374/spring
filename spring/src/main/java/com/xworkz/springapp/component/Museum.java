package com.xworkz.springapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Museum {
    private int museumId;
    private String museumName;
    @Autowired
    private Artifact artifact;

    public int getMuseumId() { return museumId; }
    public void setMuseumId(int museumId) { this.museumId = museumId; }
    public String getMuseumName() { return museumName; }
    public void setMuseumName(String museumName) { this.museumName = museumName; }
    public Artifact getArtifact() { return artifact; }
    public void setArtifact(Artifact artifact) { this.artifact = artifact; }

    @Override
    public String toString() {
        return "Museum{" +
                "museumId=" + museumId +
                ", museumName='" + museumName + '\'' +
                ", artifact=" + artifact +
                '}';
    }
}

