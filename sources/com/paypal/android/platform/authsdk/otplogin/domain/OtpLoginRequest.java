package com.paypal.android.platform.authsdk.otplogin.domain;

import p010a9.C0048b;

public final class OtpLoginRequest {
    private final String barrerToken;
    private final String deviceToken;
    private final String oneTimePassword;

    public OtpLoginRequest(String str, String str2, String str3) {
        C0048b.m167f(str, "deviceToken", str2, "barrerToken", str3, "oneTimePassword");
        this.deviceToken = str;
        this.barrerToken = str2;
        this.oneTimePassword = str3;
    }

    public final String getBarrerToken() {
        return this.barrerToken;
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getOneTimePassword() {
        return this.oneTimePassword;
    }
}
