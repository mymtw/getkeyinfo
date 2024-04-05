package p253u3;

import java.util.HashMap;

/* renamed from: u3.a */
public final class C8134a {

    /* renamed from: a */
    public static final HashMap f17803a = new HashMap();

    /* renamed from: a */
    public static synchronized C8139f m16364a(String str) {
        C8139f fVar;
        synchronized (C8134a.class) {
            String d = C8156t.m16413d(str);
            HashMap hashMap = f17803a;
            fVar = (C8139f) hashMap.get(d);
            if (fVar == null) {
                fVar = new C8139f(d);
                hashMap.put(d, fVar);
            }
        }
        return fVar;
    }
}
