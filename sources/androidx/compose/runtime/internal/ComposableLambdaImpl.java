package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1416u0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19847b;
import p753kq.C19848c;
import p753kq.C19850e;
import p753kq.C19851f;
import p753kq.C19852g;
import p753kq.C19853h;
import p753kq.C19854i;
import p753kq.C19855j;
import p753kq.C19856k;
import p753kq.C19858m;
import p753kq.C19859n;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;
import p753kq.C19864s;
import p753kq.C19865t;
import p753kq.C19866u;
import p753kq.C19867v;
import p753kq.C19868w;

public final class ComposableLambdaImpl implements C19861p, C19862q, C19863r, C19864s, C19865t, C19866u, C19867v, C19868w, C19847b, C19848c, C19850e, C19851f, C19852g, C19853h, C19854i, C19855j, C19856k, C19858m, C19859n {

    /* renamed from: b */
    public final int f2922b;

    /* renamed from: c */
    public final boolean f2923c;

    /* renamed from: d */
    public Object f2924d;

    /* renamed from: e */
    public C1416u0 f2925e;

    /* renamed from: f */
    public ArrayList f2926f;

    public ComposableLambdaImpl(int i, boolean z) {
        this.f2922b = i;
        this.f2923c = z;
    }

    /* renamed from: a */
    public final Object mo5829a(Object obj, C1302d dVar, int i) {
        C19383o.m32797g(dVar, "c");
        ComposerImpl h = dVar.mo5440h(this.f2922b);
        mo5861s(h);
        int u = (h.mo5408I(this) ? C18263b.m30870u(2, 1) : C18263b.m30870u(1, 1)) | i;
        Object obj2 = this.f2924d;
        if (obj2 != null) {
            C19389t.m32910d(3, obj2);
            Object invoke = ((C19862q) obj2).invoke(obj, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$1(this, obj, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: b */
    public final Object mo5830b(Object obj, Object obj2, C1302d dVar, int i) {
        C19383o.m32797g(dVar, "c");
        ComposerImpl h = dVar.mo5440h(this.f2922b);
        mo5861s(h);
        int u = (h.mo5408I(this) ? C18263b.m30870u(2, 2) : C18263b.m30870u(1, 2)) | i;
        Object obj3 = this.f2924d;
        if (obj3 != null) {
            C19389t.m32910d(4, obj3);
            Object invoke = ((C19863r) obj3).invoke(obj, obj2, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$2(this, obj, obj2, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: c */
    public final Object mo5831c(Object obj, Object obj2, Object obj3, C1302d dVar, int i) {
        C19383o.m32797g(dVar, "c");
        ComposerImpl h = dVar.mo5440h(this.f2922b);
        mo5861s(h);
        int u = (h.mo5408I(this) ? C18263b.m30870u(2, 3) : C18263b.m30870u(1, 3)) | i;
        Object obj4 = this.f2924d;
        if (obj4 != null) {
            C19389t.m32910d(5, obj4);
            Object invoke = ((C19864s) obj4).invoke(obj, obj2, obj3, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: d */
    public final Object mo5832d(Object obj, Object obj2, Object obj3, Object obj4, C1302d dVar, int i) {
        C19383o.m32797g(dVar, "c");
        ComposerImpl h = dVar.mo5440h(this.f2922b);
        mo5861s(h);
        int u = (h.mo5408I(this) ? C18263b.m30870u(2, 4) : C18263b.m30870u(1, 4)) | i;
        Object obj5 = this.f2924d;
        if (obj5 != null) {
            C19389t.m32910d(6, obj5);
            Object invoke = ((C19865t) obj5).invoke(obj, obj2, obj3, obj4, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$4(this, obj, obj2, obj3, obj4, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: e */
    public final Object mo5833e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i | (h.mo5408I(this) ? C18263b.m30870u(2, 5) : C18263b.m30870u(1, 5));
        Object obj6 = this.f2924d;
        if (obj6 != null) {
            C19389t.m32910d(7, obj6);
            Object invoke = ((C19866u) obj6).invoke(obj, obj2, obj3, obj4, obj5, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$5(this, obj, obj2, obj3, obj4, obj5, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: f */
    public final Object mo5834f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i | (h.mo5408I(this) ? C18263b.m30870u(2, 6) : C18263b.m30870u(1, 6));
        Object obj7 = this.f2924d;
        if (obj7 != null) {
            C19389t.m32910d(8, obj7);
            Object invoke = ((C19867v) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$6(this, obj, obj2, obj3, obj4, obj5, obj6, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: g */
    public final Object mo5835g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i | (h.mo5408I(this) ? C18263b.m30870u(2, 7) : C18263b.m30870u(1, 7));
        Object obj8 = this.f2924d;
        if (obj8 != null) {
            C19389t.m32910d(9, obj8);
            Object invoke = ((C19868w) obj8).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$7(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: h */
    public final Object mo5836h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i | (h.mo5408I(this) ? C18263b.m30870u(2, 8) : C18263b.m30870u(1, 8));
        Object obj9 = this.f2924d;
        if (obj9 != null) {
            C19389t.m32910d(10, obj9);
            Object invoke = ((C19847b) obj9).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$8(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: i */
    public final Object mo5837i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i | (h.mo5408I(this) ? C18263b.m30870u(2, 9) : C18263b.m30870u(1, 9));
        Object obj10 = this.f2924d;
        if (obj10 != null) {
            C19389t.m32910d(11, obj10);
            Object invoke = ((C19848c) obj10).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, h, Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$9(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        C1302d dVar = (C1302d) obj;
        int intValue = ((Number) obj2).intValue();
        C19383o.m32797g(dVar, "c");
        ComposerImpl h = dVar.mo5440h(this.f2922b);
        mo5861s(h);
        if (h.mo5408I(this)) {
            i = C18263b.m30870u(2, 0);
        } else {
            i = C18263b.m30870u(1, 0);
        }
        int i2 = intValue | i;
        Object obj3 = this.f2924d;
        if (obj3 != null) {
            C19389t.m32910d(2, obj3);
            Object invoke = ((C19861p) obj3).invoke(h, Integer.valueOf(i2));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                C19389t.m32910d(2, this);
                U.f3081d = this;
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: j */
    public final Object mo5852j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 10) : C18263b.m30870u(1, 10));
        Object obj11 = this.f2924d;
        if (obj11 != null) {
            C19389t.m32910d(13, obj11);
            Object invoke = ((C19850e) obj11).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                ComposableLambdaImpl$invoke$10 composableLambdaImpl$invoke$10 = r0;
                ComposableLambdaImpl$invoke$10 composableLambdaImpl$invoke$102 = new ComposableLambdaImpl$invoke$10(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, i);
                U.f3081d = composableLambdaImpl$invoke$10;
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: k */
    public final Object mo5853k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 11) : C18263b.m30870u(1, 11));
        Object obj12 = this.f2924d;
        if (obj12 != null) {
            C19389t.m32910d(14, obj12);
            Object invoke = ((C19851f) obj12).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$11(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: l */
    public final Object mo5854l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 12) : C18263b.m30870u(1, 12));
        Object obj13 = this.f2924d;
        if (obj13 != null) {
            C19389t.m32910d(15, obj13);
            Object invoke = ((C19852g) obj13).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$12(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: m */
    public final Object mo5855m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 13) : C18263b.m30870u(1, 13));
        Object obj14 = this.f2924d;
        if (obj14 != null) {
            C19389t.m32910d(16, obj14);
            Object invoke = ((C19853h) obj14).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$13(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: n */
    public final Object mo5856n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 14) : C18263b.m30870u(1, 14));
        Object obj15 = this.f2924d;
        if (obj15 != null) {
            C19389t.m32910d(17, obj15);
            Object invoke = ((C19854i) obj15).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$14(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: o */
    public final Object mo5857o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 15) : C18263b.m30870u(1, 15));
        Object obj16 = this.f2924d;
        if (obj16 != null) {
            C19389t.m32910d(18, obj16);
            Object invoke = ((C19855j) obj16).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$15(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: p */
    public final Object mo5858p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 16) : C18263b.m30870u(1, 16));
        Object obj17 = this.f2924d;
        if (obj17 != null) {
            C19389t.m32910d(19, obj17);
            Object invoke = ((C19856k) obj17).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$16(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: q */
    public final Object mo5859q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 17) : C18263b.m30870u(1, 17));
        Object obj18 = this.f2924d;
        if (obj18 != null) {
            C19389t.m32910d(20, obj18);
            Object invoke = ((C19858m) obj18).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$17(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: r */
    public final Object mo5860r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, C1302d dVar, int i, int i2) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "c");
        ComposerImpl h = dVar2.mo5440h(this.f2922b);
        mo5861s(h);
        int u = i2 | (h.mo5408I(this) ? C18263b.m30870u(2, 18) : C18263b.m30870u(1, 18));
        Object obj19 = this.f2924d;
        if (obj19 != null) {
            C19389t.m32910d(21, obj19);
            Object invoke = ((C19859n) obj19).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, h, Integer.valueOf(i), Integer.valueOf(u));
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ComposableLambdaImpl$invoke$18(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, i, i2);
            }
            return invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'p18')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
    }

    /* renamed from: s */
    public final void mo5861s(C1302d dVar) {
        C1418v0 s;
        if (this.f2923c && (s = dVar.mo5461s()) != null) {
            dVar.mo5398D(s);
            if (C18263b.m30851k0(this.f2925e, s)) {
                this.f2925e = s;
                return;
            }
            ArrayList arrayList = this.f2926f;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f2926f = arrayList2;
                arrayList2.add(s);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (C18263b.m30851k0((C1416u0) arrayList.get(i), s)) {
                    arrayList.set(i, s);
                    return;
                }
            }
            arrayList.add(s);
        }
    }

    /* renamed from: t */
    public final void mo5862t(Lambda lambda) {
        C19383o.m32797g(lambda, "block");
        if (!C19383o.m32792b(this.f2924d, lambda)) {
            boolean z = this.f2924d == null;
            this.f2924d = lambda;
            if (!z && this.f2923c) {
                C1416u0 u0Var = this.f2925e;
                if (u0Var != null) {
                    u0Var.invalidate();
                    this.f2925e = null;
                }
                ArrayList arrayList = this.f2926f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C1416u0) arrayList.get(i)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo5829a(obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return mo5830b(obj, obj2, (C1302d) obj3, ((Number) obj4).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return mo5831c(obj, obj2, obj3, (C1302d) obj4, ((Number) obj5).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return mo5832d(obj, obj2, obj3, obj4, (C1302d) obj5, ((Number) obj6).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return mo5833e(obj, obj2, obj3, obj4, obj5, (C1302d) obj6, ((Number) obj7).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return mo5834f(obj, obj2, obj3, obj4, obj5, obj6, (C1302d) obj7, ((Number) obj8).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return mo5835g(obj, obj2, obj3, obj4, obj5, obj6, obj7, (C1302d) obj8, ((Number) obj9).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return mo5836h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (C1302d) obj9, ((Number) obj10).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return mo5837i(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (C1302d) obj10, ((Number) obj11).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return mo5852j(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (C1302d) obj11, ((Number) obj12).intValue(), ((Number) obj13).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return mo5853k(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (C1302d) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return mo5854l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (C1302d) obj13, ((Number) obj14).intValue(), ((Number) obj15).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return mo5855m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (C1302d) obj14, ((Number) obj15).intValue(), ((Number) obj16).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return mo5856n(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (C1302d) obj15, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return mo5857o(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (C1302d) obj16, ((Number) obj17).intValue(), ((Number) obj18).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return mo5858p(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (C1302d) obj17, ((Number) obj18).intValue(), ((Number) obj19).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return mo5859q(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (C1302d) obj18, ((Number) obj19).intValue(), ((Number) obj20).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return mo5860r(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (C1302d) obj19, ((Number) obj20).intValue(), ((Number) obj21).intValue());
    }
}
