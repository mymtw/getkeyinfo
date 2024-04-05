package com.google.crypto.tink.shaded.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.SoftReference;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g */
public final class C16486g {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f36604a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f36605b;

    /* renamed from: c */
    public static final long f36606c;

    static {
        Class<?> cls;
        long j;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f36605b = cls;
        if (cls != null) {
            try {
                if (C16488g1.f36614f) {
                    j = C16488g1.f36612d.mo58756m(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
                    f36606c = j;
                }
            } catch (Throwable unused2) {
            }
        }
        j = -1;
        f36606c = j;
    }
}
