package com.google.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.SoftReference;

/* renamed from: com.google.protobuf.g */
public final class C16895g {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f37219a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f37220b;

    /* renamed from: c */
    public static final long f37221c;

    static {
        Class<?> cls;
        long j;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f37220b = cls;
        if (cls != null) {
            try {
                if (C16889f1.f37214e) {
                    j = C16889f1.f37212c.mo59930m(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
                    f37221c = j;
                }
            } catch (Throwable unused2) {
            }
        }
        j = -1;
        f37221c = j;
    }
}
