package p597jl;

import p003a2.C0023f;

/* renamed from: jl.b */
public final class C18009b {

    /* renamed from: a */
    public static final C18010a f39406a = new C18010a();

    /* renamed from: b */
    public static final C18011b f39407b = new C18011b();

    /* renamed from: c */
    public static final C18012c f39408c = new C18012c();

    /* renamed from: d */
    public static final C18013d f39409d = new C18013d();

    /* renamed from: jl.b$a */
    public static class C18010a implements C18008a {
        /* renamed from: a */
        public final C18014c mo69581a(float f, float f2, float f3) {
            return new C18014c(255, C18035v.m30474d(f2, f3, f, 0, 255), true);
        }
    }

    /* renamed from: jl.b$b */
    public static class C18011b implements C18008a {
        /* renamed from: a */
        public final C18014c mo69581a(float f, float f2, float f3) {
            return new C18014c(C18035v.m30474d(f2, f3, f, 255, 0), 255, false);
        }
    }

    /* renamed from: jl.b$c */
    public static class C18012c implements C18008a {
        /* renamed from: a */
        public final C18014c mo69581a(float f, float f2, float f3) {
            return new C18014c(C18035v.m30474d(f2, f3, f, 255, 0), C18035v.m30474d(f2, f3, f, 0, 255), false);
        }
    }

    /* renamed from: jl.b$d */
    public static class C18013d implements C18008a {
        /* renamed from: a */
        public final C18014c mo69581a(float f, float f2, float f3) {
            float b = C0023f.m103b(f3, f2, 0.35f, f2);
            return new C18014c(C18035v.m30474d(f2, b, f, 255, 0), C18035v.m30474d(b, f3, f, 0, 255), false);
        }
    }
}
