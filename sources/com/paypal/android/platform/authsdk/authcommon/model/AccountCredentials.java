package com.paypal.android.platform.authsdk.authcommon.model;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class AccountCredentials {
    private final String password;
    private final String phone;
    private final String pin;
    private final CredentialsType type;
    private final String username;

    public enum CredentialsType {
        EMAIL_PASSWORD,
        PHONE_PIN,
        PHONE_PASSWORD,
        PARTNER_PIN,
        NATIVE_BIOMETRIC,
        USERNAME,
        DEVICEAUTH_BIOMETRIC
    }

    public AccountCredentials(String str, String str2, CredentialsType credentialsType, String str3, String str4) {
        C19383o.m32797g(str, ResponseConstants.USERNAME);
        C19383o.m32797g(str2, "password");
        C19383o.m32797g(credentialsType, "type");
        C19383o.m32797g(str3, ResponseConstants.PHONE);
        C19383o.m32797g(str4, "pin");
        this.username = str;
        this.password = str2;
        this.type = credentialsType;
        this.phone = str3;
        this.pin = str4;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPin() {
        return this.pin;
    }

    public final CredentialsType getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }
}
