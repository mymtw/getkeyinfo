package com.paypal.android.platform.authsdk.authcommon.network.utils;

import com.paypal.android.platform.authsdk.authcommon.utils.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;

public final class CryptUtil {
    public static final CryptUtil INSTANCE = new CryptUtil();

    private CryptUtil() {
    }

    public final String sha256(String str) throws NoSuchAlgorithmException {
        C19383o.m32797g(str, "input");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes);
        byte[] digest = instance.digest();
        Base64 base64 = Base64.INSTANCE;
        C19383o.m32796f(digest, "digest");
        return base64.encode(digest);
    }
}
