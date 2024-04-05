package androidx.compose.p015ui.layout;

import p001a0.C0005b;
import p288y.C8347f;

/* renamed from: androidx.compose.ui.layout.c */
public interface C1670c {

    /* renamed from: androidx.compose.ui.layout.c$a */
    public static final class C1671a {

        /* renamed from: a */
        public static final C1672a f3712a = new C1672a();

        /* renamed from: b */
        public static final C1673b f3713b = new C1673b();

        /* renamed from: androidx.compose.ui.layout.c$a$a */
        public static final class C1672a implements C1670c {
            /* renamed from: a */
            public final long mo6663a(long j, long j2) {
                float min = Math.min(C8347f.m16656d(j2) / C8347f.m16656d(j), C8347f.m16654b(j2) / C8347f.m16654b(j));
                return C0005b.m42i(min, min);
            }
        }

        /* renamed from: androidx.compose.ui.layout.c$a$b */
        public static final class C1673b implements C1670c {
            /* renamed from: a */
            public final long mo6663a(long j, long j2) {
                if (C8347f.m16656d(j) <= C8347f.m16656d(j2) && C8347f.m16654b(j) <= C8347f.m16654b(j2)) {
                    return C0005b.m42i(1.0f, 1.0f);
                }
                float min = Math.min(C8347f.m16656d(j2) / C8347f.m16656d(j), C8347f.m16654b(j2) / C8347f.m16654b(j));
                return C0005b.m42i(min, min);
            }
        }
    }

    /* renamed from: a */
    long mo6663a(long j, long j2);
}
