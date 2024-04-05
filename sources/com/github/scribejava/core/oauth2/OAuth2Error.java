package com.github.scribejava.core.oauth2;

import java.util.EnumSet;
import java.util.Set;
import p010a9.C0048b;

public enum OAuth2Error {
    INVALID_REQUEST("invalid_request"),
    UNAUTHORIZED_CLIENT("unauthorized_client"),
    ACCESS_DENIED("access_denied"),
    UNSUPPORTED_RESPONSE_TYPE("unsupported_response_type"),
    INVALID_SCOPE("invalid_scope"),
    SERVER_ERROR("server_error"),
    TEMPORARILY_UNAVAILABLE("temporarily_unavailable"),
    INVALID_CLIENT("invalid_client"),
    INVALID_GRANT("invalid_grant"),
    UNSUPPORTED_GRANT_TYPE("unsupported_grant_type"),
    INVALID_TOKEN("invalid_token"),
    INSUFFICIENT_SCOPE("insufficient_scope"),
    UNSUPPORTED_TOKEN_TYPE("unsupported_token_type"),
    AUTHORIZATION_PENDING("authorization_pending"),
    SLOW_DOWN("slow_down"),
    EXPIRED_TOKEN("expired_token");
    
    private static final Set<OAuth2Error> VALUES = null;
    private final String errorString;

    /* access modifiers changed from: public */
    static {
        VALUES = EnumSet.allOf(OAuth2Error.class);
    }

    private OAuth2Error(String str) {
        this.errorString = str;
    }

    public static OAuth2Error parseFrom(String str) {
        for (OAuth2Error next : VALUES) {
            if (next.errorString.equals(str)) {
                return next;
            }
        }
        throw new IllegalArgumentException(C0048b.m163a("there is no knowlege about '", str, "' Error"));
    }

    public String getErrorString() {
        return this.errorString;
    }
}
