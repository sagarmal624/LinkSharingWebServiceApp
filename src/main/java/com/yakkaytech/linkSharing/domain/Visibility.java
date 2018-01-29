package com.yakkaytech.linkSharing.domain;

public enum Visibility {
   PUBLIC("Public") ,
   PRIVATE("private");
    private String value;

    Visibility(String value) {
        this.value=value;
    }
}
