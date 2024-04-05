package androidx.datastore.preferences.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.SoftReference;

/* renamed from: androidx.datastore.preferences.protobuf.g */
public final class C2579g {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f5868a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f5869b;

    /* renamed from: c */
    public static final long f5870c;

    static {
        Class<?> cls;
        long j;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f5869b = cls;
        if (cls != null) {
            try {
                if (C2586h1.f5881f) {
                    j = C2586h1.f5879d.mo9695m(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
                    f5870c = j;
                }
            } catch (Throwable unused2) {
            }
        }
        j = -1;
        f5870c = j;
    }
}
