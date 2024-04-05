package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d */
public final class C16474d {

    /* renamed from: a */
    public static final Class<?> f36587a;

    /* renamed from: b */
    public static final boolean f36588b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f36587a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f36588b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m26752a() {
        return f36587a != null && !f36588b;
    }
}
