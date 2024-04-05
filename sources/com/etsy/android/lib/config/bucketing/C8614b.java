package com.etsy.android.lib.config.bucketing;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.config.bucketing.b */
public final class C8614b {
    /* renamed from: a */
    public static long m17004a(String str) throws NoSuchAlgorithmException {
        C19383o.m32797g(str, "flagName");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset forName = Charset.forName("UTF-8");
        C19383o.m32796f(forName, "forName(\"UTF-8\")");
        byte[] bytes = str.getBytes(forName);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes);
        double doubleValue = UnsignedInteger.fromIntBits(new BigInteger(instance.digest()).intValue()).doubleValue();
        UnsignedInteger unsignedInteger = UnsignedInteger.MAX_VALUE;
        return (long) (((doubleValue % unsignedInteger.doubleValue()) / unsignedInteger.doubleValue()) * ((double) 100));
    }
}
