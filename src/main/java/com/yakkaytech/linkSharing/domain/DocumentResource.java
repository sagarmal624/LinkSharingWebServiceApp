package com.yakkaytech.linkSharing.domain;

import javax.persistence.Entity;

@Entity
public class DocumentResource extends Resource{
  private String filepath;

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}
