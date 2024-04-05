package com.github.scribejava.core.model;

import java.util.Objects;

public class OAuth1AccessToken extends OAuth1Token {
    private static final long serialVersionUID = -103999293167210966L;

    public OAuth1AccessToken(String str, String str2) {
        this(str, str2, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth1AccessToken oAuth1AccessToken = (OAuth1AccessToken) obj;
        if (!Objects.equals(getToken(), oAuth1AccessToken.getToken())) {
            return false;
        }
        return Objects.equals(getTokenSecret(), oAuth1AccessToken.getTokenSecret());
    }

    public String getToken() {
        return super.getToken();
    }

    public String getTokenSecret() {
        return super.getTokenSecret();
    }

    public int hashCode() {
        return Objects.hashCode(getTokenSecret()) + ((Objects.hashCode(getToken()) + 219) * 73);
    }

    public OAuth1AccessToken(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
