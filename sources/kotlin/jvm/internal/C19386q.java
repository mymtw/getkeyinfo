package kotlin.jvm.internal;

import kotlin.reflect.C19400c;

/* renamed from: kotlin.jvm.internal.q */
public final class C19386q {

    /* renamed from: a */
    public static final C19387r f43269a;

    /* renamed from: b */
    public static final C19400c[] f43270b = new C19400c[0];

    static {
        C19387r rVar = null;
        try {
            rVar = (C19387r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new C19387r();
        }
        f43269a = rVar;
    }

    /* renamed from: a */
    public static C19379k m32807a(Class cls) {
        f43269a.getClass();
        return new C19379k(cls);
    }
}
