package com.yakkaytech.linkSharing.domain;

import javax.persistence.Entity;

@Entity
public class LinkResource extends Resource {
     private String Url;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
