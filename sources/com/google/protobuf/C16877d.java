package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
public final class C16877d {

    /* renamed from: a */
    public static final Class<?> f37192a;

    /* renamed from: b */
    public static final boolean f37193b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f37192a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f37193b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m28067a() {
        return f37192a != null && !f37193b;
    }
}
