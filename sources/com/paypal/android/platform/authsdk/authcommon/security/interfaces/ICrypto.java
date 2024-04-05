package com.paypal.android.platform.authsdk.authcommon.security.interfaces;

public interface ICrypto {
    String decrypt(String str);

    String encrypt(String str);
}
