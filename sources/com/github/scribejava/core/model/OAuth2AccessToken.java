package com.github.scribejava.core.model;

import androidx.datastore.preferences.protobuf.C2606m;
import java.util.Objects;

public class OAuth2AccessToken extends Token {
    private static final long serialVersionUID = 8901381135476613449L;
    private String accessToken;
    private Integer expiresIn;
    private String refreshToken;
    private String scope;
    private String tokenType;

    public OAuth2AccessToken(String str) {
        this(str, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2AccessToken oAuth2AccessToken = (OAuth2AccessToken) obj;
        if (Objects.equals(this.accessToken, oAuth2AccessToken.getAccessToken()) && Objects.equals(this.tokenType, oAuth2AccessToken.getTokenType()) && Objects.equals(this.refreshToken, oAuth2AccessToken.getRefreshToken()) && Objects.equals(this.scope, oAuth2AccessToken.getScope())) {
            return Objects.equals(this.expiresIn, oAuth2AccessToken.getExpiresIn());
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getScope() {
        return this.scope;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int hashCode = Objects.hashCode(this.tokenType);
        int hashCode2 = Objects.hashCode(this.expiresIn);
        int hashCode3 = Objects.hashCode(this.refreshToken);
        return Objects.hashCode(this.scope) + ((hashCode3 + ((hashCode2 + ((hashCode + ((Objects.hashCode(this.accessToken) + 287) * 41)) * 41)) * 41)) * 41);
    }

    public OAuth2AccessToken(String str, String str2) {
        this(str, (String) null, (Integer) null, (String) null, (String) null, str2);
    }

    public OAuth2AccessToken(String str, String str2, Integer num, String str3, String str4, String str5) {
        super(str5);
        C2606m.m6123R(str, "access_token can't be null");
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresIn = num;
        this.refreshToken = str3;
        this.scope = str4;
    }
}
