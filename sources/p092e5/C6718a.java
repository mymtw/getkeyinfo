package p092e5;

import p103f5.C6787b;

/* renamed from: e5.a */
public final class C6718a {

    /* renamed from: a */
    public static C6718a f14810a;

    /* renamed from: b */
    public static final Object f14811b = new Object();

    /* renamed from: c */
    public static C6787b f14812c;

    /* renamed from: a */
    public static synchronized C6718a m13109a() {
        C6718a aVar;
        synchronized (C6718a.class) {
            if (f14810a == null) {
                synchronized (f14811b) {
                    if (f14810a == null) {
                        f14810a = new C6718a();
                        f14812c = C6787b.m13170a();
                    }
                }
            }
            aVar = f14810a;
        }
        return aVar;
    }
}
