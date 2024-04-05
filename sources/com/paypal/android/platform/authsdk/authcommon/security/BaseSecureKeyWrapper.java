package com.paypal.android.platform.authsdk.authcommon.security;

import android.annotation.TargetApi;
import android.content.Context;
import com.paypal.android.platform.authsdk.authcommon.security.handlers.SecureKeyHandler;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.security.Signature;
import java.security.SignatureException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;

public abstract class BaseSecureKeyWrapper {
    @TargetApi(18)
    private final byte[] signData(Signature signature, byte[] bArr) {
        try {
            signature.update(bArr);
            byte[] sign = signature.sign();
            C19383o.m32796f(sign, "{\n            signature.…ignature.sign()\n        }");
            return sign;
        } catch (SignatureException e) {
            throw new RuntimeException(e);
        }
    }

    public final void deleteKey(String str) {
        C19383o.m32797g(str, "keyName");
        new SecureKeyHandler().deleteKey$auth_sdk_thirdPartyRelease(str);
    }

    public abstract String getKey(Context context, String str);

    public final String signData(Signature signature, String str) throws RuntimeException {
        C19383o.m32797g(signature, "signature");
        C19383o.m32797g(str, "data");
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        return CryptoUtilsKt.encodeBase64$default(signData(signature, bytes), 0, 2, (Object) null);
    }
}
