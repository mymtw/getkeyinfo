package p145io.reactivex.internal.functions;

import p287xp.C8336d;

/* renamed from: io.reactivex.internal.functions.a */
public final class C12965a {

    /* renamed from: a */
    public static final C12966a f28546a = new C12966a();

    /* renamed from: io.reactivex.internal.functions.a$a */
    public static final class C12966a implements C8336d<Object, Object> {
    }

    /* renamed from: a */
    public static boolean m20649a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static void m20650b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: c */
    public static void m20651c(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " > 0 required but it was " + i);
        }
    }
}
