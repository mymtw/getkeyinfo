package com.github.scribejava.core.revoke;

import com.facebook.AccessToken;

public enum TokenTypeHint {
    ACCESS_TOKEN(AccessToken.ACCESS_TOKEN_KEY),
    REFRESH_TOKEN("refresh_token");
    
    private final String value;

    private TokenTypeHint(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
