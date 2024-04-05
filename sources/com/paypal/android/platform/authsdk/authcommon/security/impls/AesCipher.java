package com.paypal.android.platform.authsdk.authcommon.security.impls;

import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ICipher;
import javax.crypto.Cipher;
import kotlin.jvm.internal.C19383o;

public final class AesCipher implements ICipher {
    private final String TRANSFORMATION = "AES/CBC/PKCS7Padding";

    public Cipher getCipher() {
        Cipher instance = Cipher.getInstance(this.TRANSFORMATION);
        C19383o.m32796f(instance, "getInstance(TRANSFORMATION)");
        return instance;
    }
}
