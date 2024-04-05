package androidx.compose.p015ui.layout;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p174m0.C7280a;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.i0 */
public abstract class C1686i0 implements C1715y {

    /* renamed from: b */
    public int f3722b;

    /* renamed from: c */
    public int f3723c;

    /* renamed from: d */
    public long f3724d = C0761x.m1707a(0, 0);

    /* renamed from: e */
    public long f3725e = PlaceableKt.f3699b;

    /* renamed from: androidx.compose.ui.layout.i0$a */
    public static abstract class C1687a {

        /* renamed from: a */
        public static final C1688a f3726a = new C1688a(0);

        /* renamed from: b */
        public static LayoutDirection f3727b = LayoutDirection.Ltr;

        /* renamed from: c */
        public static int f3728c;

        /* renamed from: androidx.compose.ui.layout.i0$a$a */
        public static final class C1688a extends C1687a {
            public C1688a(int i) {
            }

            /* renamed from: a */
            public final LayoutDirection mo6680a() {
                return C1687a.f3727b;
            }

            /* renamed from: b */
            public final int mo6681b() {
                return C1687a.f3728c;
            }
        }

        /* renamed from: c */
        public static void m3581c(C1686i0 i0Var, int i, int i2, float f) {
            C19383o.m32797g(i0Var, "<this>");
            long o = C19421p.m32949o(i, i2);
            long X = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(o)), f, (C19857l<? super C1549v, C19394m>) null);
        }

        /* renamed from: d */
        public static void m3582d(C1686i0 i0Var, long j, float f) {
            C19383o.m32797g(i0Var, "$this$place");
            long X = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (j >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(j)), f, (C19857l<? super C1549v, C19394m>) null);
        }

        /* renamed from: e */
        public static void m3583e(C1687a aVar, C1686i0 i0Var, int i, int i2) {
            aVar.getClass();
            C19383o.m32797g(i0Var, "<this>");
            long o = C19421p.m32949o(i, i2);
            if (aVar.mo6680a() == LayoutDirection.Ltr || aVar.mo6681b() == 0) {
                long X = i0Var.mo6674X();
                i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(o)), 0.0f, (C19857l<? super C1549v, C19394m>) null);
                return;
            }
            long o2 = C19421p.m32949o((aVar.mo6681b() - ((int) (i0Var.f3724d >> 32))) - ((int) (o >> 32)), C7287g.m13992b(o));
            long X2 = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (o2 >> 32)) + ((int) (X2 >> 32)), C7287g.m13992b(X2) + C7287g.m13992b(o2)), 0.0f, (C19857l<? super C1549v, C19394m>) null);
        }

        /* renamed from: f */
        public static void m3584f(C1687a aVar, C1686i0 i0Var, int i, int i2) {
            C19857l<C1549v, C19394m> lVar = PlaceableKt.f3698a;
            aVar.getClass();
            C19383o.m32797g(i0Var, "<this>");
            C19383o.m32797g(lVar, "layerBlock");
            long o = C19421p.m32949o(i, i2);
            if (aVar.mo6680a() == LayoutDirection.Ltr || aVar.mo6681b() == 0) {
                long X = i0Var.mo6674X();
                i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(o)), 0.0f, lVar);
                return;
            }
            long o2 = C19421p.m32949o((aVar.mo6681b() - ((int) (i0Var.f3724d >> 32))) - ((int) (o >> 32)), C7287g.m13992b(o));
            long X2 = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (o2 >> 32)) + ((int) (X2 >> 32)), C7287g.m13992b(X2) + C7287g.m13992b(o2)), 0.0f, lVar);
        }

        /* renamed from: g */
        public static void m3585g(C1687a aVar, C1686i0 i0Var, long j) {
            C19857l<C1549v, C19394m> lVar = PlaceableKt.f3698a;
            aVar.getClass();
            C19383o.m32797g(lVar, "layerBlock");
            if (aVar.mo6680a() == LayoutDirection.Ltr || aVar.mo6681b() == 0) {
                long X = i0Var.mo6674X();
                i0Var.mo6662q0(C19421p.m32949o(((int) (j >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(j)), 0.0f, lVar);
                return;
            }
            long o = C19421p.m32949o((aVar.mo6681b() - ((int) (i0Var.f3724d >> 32))) - ((int) (j >> 32)), C7287g.m13992b(j));
            long X2 = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X2 >> 32)), C7287g.m13992b(X2) + C7287g.m13992b(o)), 0.0f, lVar);
        }

        /* renamed from: h */
        public static void m3586h(C1687a aVar, C1686i0 i0Var, int i, int i2, C19857l<C1549v, C19394m> lVar, int i3) {
            if ((i3 & 8) != 0) {
                lVar = PlaceableKt.f3698a;
            }
            aVar.getClass();
            C19383o.m32797g(i0Var, "<this>");
            C19383o.m32797g(lVar, "layerBlock");
            long o = C19421p.m32949o(i, i2);
            long X = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(o)), 0.0f, lVar);
        }

        /* renamed from: i */
        public static void m3587i(C1686i0 i0Var, long j, float f, C19857l lVar) {
            C19383o.m32797g(i0Var, "$this$placeWithLayer");
            C19383o.m32797g(lVar, "layerBlock");
            long X = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (j >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(j)), f, lVar);
        }

        /* renamed from: j */
        public static /* synthetic */ void m3588j(C1687a aVar, C1686i0 i0Var, long j) {
            C19857l<C1549v, C19394m> lVar = PlaceableKt.f3698a;
            aVar.getClass();
            m3587i(i0Var, j, 0.0f, lVar);
        }

        /* renamed from: a */
        public abstract LayoutDirection mo6680a();

        /* renamed from: b */
        public abstract int mo6681b();
    }

    /* renamed from: X */
    public final long mo6674X() {
        int i = this.f3722b;
        long j = this.f3724d;
        return C19421p.m32949o((i - ((int) (j >> 32))) / 2, (this.f3723c - C7290i.m13995b(j)) / 2);
    }

    /* renamed from: i0 */
    public int mo6675i0() {
        return C7290i.m13995b(this.f3724d);
    }

    /* renamed from: o0 */
    public int mo6676o0() {
        return (int) (this.f3724d >> 32);
    }

    /* renamed from: q0 */
    public abstract void mo6662q0(long j, float f, C19857l<? super C1549v, C19394m> lVar);

    /* renamed from: t0 */
    public final void mo6677t0() {
        this.f3722b = C19388s.m32833M((int) (this.f3724d >> 32), C7280a.m13965j(this.f3725e), C7280a.m13963h(this.f3725e));
        this.f3723c = C19388s.m32833M(C7290i.m13995b(this.f3724d), C7280a.m13964i(this.f3725e), C7280a.m13962g(this.f3725e));
    }

    /* renamed from: x0 */
    public final void mo6678x0(long j) {
        if (!C7290i.m13994a(this.f3724d, j)) {
            this.f3724d = j;
            mo6677t0();
        }
    }

    /* renamed from: y0 */
    public final void mo6679y0(long j) {
        if (!C7280a.m13957b(this.f3725e, j)) {
            this.f3725e = j;
            mo6677t0();
        }
    }
}
