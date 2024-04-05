package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d */
public final class C2566d {

    /* renamed from: a */
    public static final Class<?> f5844a;

    /* renamed from: b */
    public static final boolean f5845b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5844a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5845b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m5712a() {
        return f5844a != null && !f5845b;
    }
}
