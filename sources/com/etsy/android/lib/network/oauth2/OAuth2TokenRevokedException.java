package com.etsy.android.lib.network.oauth2;

public final class OAuth2TokenRevokedException extends RuntimeException {
    public static final int $stable = 0;

    public OAuth2TokenRevokedException() {
        super("This OAuth2 token has been revoked");
    }
}
