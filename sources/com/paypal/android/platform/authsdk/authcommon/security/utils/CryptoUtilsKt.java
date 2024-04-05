package com.paypal.android.platform.authsdk.authcommon.security.utils;

import android.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;

public final class CryptoUtilsKt {
    private static final String AES_CBC_PKCS5_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int CIPHER_IV_SIZE_IN_BYTES = 16;
    private static final String EC_CURVE = "secp256r1";
    private static final String KEY_ALGORITHM_AES = "AES";
    private static final String KEY_ALGORITHM_EC = "EC";
    private static final String KEY_ALGORITHM_RSA = "RSA";
    private static final String PKI_EC_DSA_ALGORITHM = "SHA256withECDSA";
    private static final String PKI_RSA_ALGORITHM = "SHA256withRSA";
    private static final String RSA_PKCS1_ALGORITHM = "RSA/ECB/PKCS1Padding";

    public static final String decryptData(String str, Cipher cipher, int i) throws RuntimeException {
        C19383o.m32797g(str, "encryptedData");
        C19383o.m32797g(cipher, "decryptionCipher");
        try {
            byte[] decode = Base64.decode(str, 0);
            int length = decode.length - i;
            byte[] bArr = new byte[length];
            System.arraycopy(decode, 0, new byte[i], 0, i);
            System.arraycopy(decode, i, bArr, 0, length);
            byte[] doFinal = cipher.doFinal(bArr);
            C19383o.m32796f(doFinal, "decryptionCipher.doFinal(encryptedByteData)");
            return new String(doFinal, C19446a.f43373b);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ String decryptData$default(String str, Cipher cipher, int i, int i2, Object obj) throws RuntimeException {
        if ((i2 & 4) != 0) {
            i = CIPHER_IV_SIZE_IN_BYTES;
        }
        return decryptData(str, cipher, i);
    }

    public static final String encodeBase64(byte[] bArr, int i) {
        C19383o.m32797g(bArr, "data");
        byte[] encode = Base64.encode(bArr, i);
        C19383o.m32796f(encode, "encodedData");
        return new String(encode, C19446a.f43373b);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 11;
        }
        return encodeBase64(bArr, i);
    }

    public static final String encryptData(String str, Cipher cipher, int i) throws RuntimeException {
        C19383o.m32797g(str, "data");
        C19383o.m32797g(cipher, "encryptionCipher");
        try {
            byte[] bytes = str.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] doFinal = cipher.doFinal(bytes);
            byte[] bArr = new byte[(doFinal.length + i)];
            System.arraycopy(cipher.getIV(), 0, bArr, 0, i);
            System.arraycopy(doFinal, 0, bArr, i, doFinal.length);
            return Base64.encodeToString(bArr, 0);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ String encryptData$default(String str, Cipher cipher, int i, int i2, Object obj) throws RuntimeException {
        if ((i2 & 4) != 0) {
            i = CIPHER_IV_SIZE_IN_BYTES;
        }
        return encryptData(str, cipher, i);
    }

    public static final String getAES_CBC_PKCS5_ALGORITHM() {
        return AES_CBC_PKCS5_ALGORITHM;
    }

    public static final String getANDROID_KEYSTORE() {
        return ANDROID_KEYSTORE;
    }

    public static final int getCIPHER_IV_SIZE_IN_BYTES() {
        return CIPHER_IV_SIZE_IN_BYTES;
    }

    public static final String getEC_CURVE() {
        return EC_CURVE;
    }

    public static final String getKEY_ALGORITHM_AES() {
        return KEY_ALGORITHM_AES;
    }

    public static final String getKEY_ALGORITHM_EC() {
        return KEY_ALGORITHM_EC;
    }

    public static final String getKEY_ALGORITHM_RSA() {
        return KEY_ALGORITHM_RSA;
    }

    public static final String getPKI_EC_DSA_ALGORITHM() {
        return PKI_EC_DSA_ALGORITHM;
    }

    public static final String getPKI_RSA_ALGORITHM() {
        return PKI_RSA_ALGORITHM;
    }

    public static final String getRSA_PKCS1_ALGORITHM() {
        return RSA_PKCS1_ALGORITHM;
    }
}
