package com.paypal.android.platform.authsdk.authcommon.security.impls;

import android.annotation.TargetApi;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.security.Signature;
import kotlin.jvm.internal.C19383o;

public final class SignatureWrapper {
    @TargetApi(23)
    public final Signature generateECDSASignature(String str) {
        C19383o.m32797g(str, "privateKeyAlias");
        return new SecureKeySignature(CryptoUtilsKt.getPKI_EC_DSA_ALGORITHM()).generateSignature(str);
    }

    @TargetApi(18)
    public final Signature generateRSASignature(String str) {
        C19383o.m32797g(str, "privateKeyAlias");
        return new SecureKeySignature(CryptoUtilsKt.getPKI_RSA_ALGORITHM()).generateSignature(str);
    }
}
