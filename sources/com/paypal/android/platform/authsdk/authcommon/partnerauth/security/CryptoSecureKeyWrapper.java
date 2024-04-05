package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import javax.crypto.SecretKey;

public interface CryptoSecureKeyWrapper extends SecureKeyWrapper {
    String decryptString(String str, String str2, String str3);

    String decryptStringUsingAES(SecretKey secretKey, String str, String str2, int i);

    String encryptString(String str, String str2, String str3);

    String encryptStringUsingAES(SecretKey secretKey, String str, String str2, int i);
}
