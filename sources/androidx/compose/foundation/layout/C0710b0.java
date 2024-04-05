package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7294l;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.layout.b0 */
public interface C0710b0 {

    /* renamed from: a */
    public static final C0711a f1466a = C0711a.f1467a;

    /* renamed from: androidx.compose.foundation.layout.b0$a */
    public static final class C0711a {

        /* renamed from: a */
        public static final /* synthetic */ C0711a f1467a = new C0711a();

        /* renamed from: b */
        public static final C0713b f1468b = new C0713b();

        /* renamed from: c */
        public static final C0714c f1469c = new C0714c();

        /* renamed from: d */
        public static final C0712a f1470d = new C0712a();

        /* renamed from: androidx.compose.foundation.layout.b0$a$a */
        public static final class C0712a implements C0710b0 {
            /* renamed from: b */
            public final float mo4076b(float f, float f2) {
                return -f2;
            }

            /* renamed from: c */
            public final Insets mo4077c(Insets insets, int i) {
                Insets of = Insets.m169of(insets.left, insets.top, insets.right, i);
                C19383o.m32796f(of, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return of;
            }

            /* renamed from: e */
            public final int mo4079e(Insets insets) {
                return insets.bottom;
            }

            /* renamed from: f */
            public final long mo4080f(long j) {
                return C19421p.m32952q(0.0f, C8343c.m16643d(j));
            }

            /* renamed from: g */
            public final long mo4081g(long j, float f) {
                return C1993m.m4370p(0.0f, C7294l.m14005c(j) + f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.b0$a$b */
        public static final class C0713b implements C0710b0 {
            /* renamed from: b */
            public final float mo4076b(float f, float f2) {
                return f;
            }

            /* renamed from: c */
            public final Insets mo4077c(Insets insets, int i) {
                Insets of = Insets.m169of(i, insets.top, insets.right, insets.bottom);
                C19383o.m32796f(of, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return of;
            }

            /* renamed from: e */
            public final int mo4079e(Insets insets) {
                return insets.left;
            }

            /* renamed from: f */
            public final long mo4080f(long j) {
                return C19421p.m32952q(C8343c.m16642c(j), 0.0f);
            }

            /* renamed from: g */
            public final long mo4081g(long j, float f) {
                return C1993m.m4370p(C7294l.m14004b(j) - f, 0.0f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.b0$a$c */
        public static final class C0714c implements C0710b0 {
            /* renamed from: b */
            public final float mo4076b(float f, float f2) {
                return -f;
            }

            /* renamed from: c */
            public final Insets mo4077c(Insets insets, int i) {
                Insets of = Insets.m169of(insets.left, insets.top, i, insets.bottom);
                C19383o.m32796f(of, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return of;
            }

            /* renamed from: e */
            public final int mo4079e(Insets insets) {
                return insets.right;
            }

            /* renamed from: f */
            public final long mo4080f(long j) {
                return C19421p.m32952q(C8343c.m16642c(j), 0.0f);
            }

            /* renamed from: g */
            public final long mo4081g(long j, float f) {
                return C1993m.m4370p(C7294l.m14004b(j) + f, 0.0f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.b0$a$d */
        public static final class C0715d implements C0710b0 {
            /* renamed from: b */
            public final float mo4076b(float f, float f2) {
                return f2;
            }

            /* renamed from: c */
            public final Insets mo4077c(Insets insets, int i) {
                Insets of = Insets.m169of(insets.left, i, insets.right, insets.bottom);
                C19383o.m32796f(of, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return of;
            }

            /* renamed from: e */
            public final int mo4079e(Insets insets) {
                return insets.top;
            }

            /* renamed from: f */
            public final long mo4080f(long j) {
                return C19421p.m32952q(0.0f, C8343c.m16643d(j));
            }

            /* renamed from: g */
            public final long mo4081g(long j, float f) {
                return C1993m.m4370p(0.0f, C7294l.m14005c(j) - f);
            }
        }
    }

    /* renamed from: a */
    float mo4075a(float f, float f2) {
        float b = mo4076b(f, f2);
        if (b < 0.0f) {
            return 0.0f;
        }
        return b;
    }

    /* renamed from: b */
    float mo4076b(float f, float f2);

    /* renamed from: c */
    Insets mo4077c(Insets insets, int i);

    /* renamed from: d */
    float mo4078d(float f, float f2) {
        float b = mo4076b(f, f2);
        if (b > 0.0f) {
            return 0.0f;
        }
        return b;
    }

    /* renamed from: e */
    int mo4079e(Insets insets);

    /* renamed from: f */
    long mo4080f(long j);

    /* renamed from: g */
    long mo4081g(long j, float f);
}
