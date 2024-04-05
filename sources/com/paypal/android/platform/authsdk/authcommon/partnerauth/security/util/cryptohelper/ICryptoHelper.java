package com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper;

public interface ICryptoHelper {
    String decrypt(String str);

    String encrypt(String str);
}
