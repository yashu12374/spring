package com.xworkz.springapp.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Artifact {
    private int artifactId;
    private String artifactName;

    public int getArtifactId() { return artifactId; }
    public void setArtifactId(int artifactId) { this.artifactId = artifactId; }
    public String getArtifactName() { return artifactName; }
    public void setArtifactName(String artifactName) { this.artifactName = artifactName; }

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactId=" + artifactId +
                ", artifactName='" + artifactName + '\'' +
                '}';
    }
}

