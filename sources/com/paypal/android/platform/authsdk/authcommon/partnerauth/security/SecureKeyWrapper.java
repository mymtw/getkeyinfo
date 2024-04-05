package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import android.content.Context;
import java.security.PublicKey;
import java.security.Signature;
import javax.crypto.SecretKey;

public interface SecureKeyWrapper {
    String base64AndUrlSafeEncodedStringFromBytes(byte[] bArr);

    String decryptString(String str, String str2);

    String decryptStringUsingAES(SecretKey secretKey, String str);

    void deleteAsymmetricKey(String str);

    String encryptString(String str, String str2);

    String encryptStringUsingAES(SecretKey secretKey, String str);

    SecretKey generateAESSecretKey();

    String generateAsymmetricKeyPair(String str, Context context);

    PublicKey generatePublicKey(String str, Context context);

    Signature generateSignature(String str);

    String signDataUsingSignatureObjectAndBase64Encode(Signature signature, String str);

    boolean verifySignatureUsingPublicKey(String str, byte[] bArr, String str2);
}
