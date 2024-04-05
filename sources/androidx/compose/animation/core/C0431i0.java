package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0432j;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.i0 */
public final class C0431i0<T, V extends C0432j> implements C0413b<T, V> {

    /* renamed from: a */
    public final C0439m0<V> f1136a;

    /* renamed from: b */
    public final C0435k0<T, V> f1137b;

    /* renamed from: c */
    public final T f1138c;

    /* renamed from: d */
    public final T f1139d;

    /* renamed from: e */
    public final V f1140e;

    /* renamed from: f */
    public final V f1141f;

    /* renamed from: g */
    public final V f1142g;

    /* renamed from: h */
    public final long f1143h;

    /* renamed from: i */
    public final V f1144i;

    public C0431i0() {
        throw null;
    }

    public /* synthetic */ C0431i0(C0422e eVar, C0435k0 k0Var, Object obj, Object obj2) {
        this(eVar, k0Var, obj, obj2, (C0432j) null);
    }

    /* renamed from: a */
    public final boolean mo3463a() {
        return this.f1136a.mo3517a();
    }

    /* renamed from: b */
    public final V mo3464b(long j) {
        if (mo3465c(j)) {
            return this.f1144i;
        }
        return this.f1136a.mo3520f(j, this.f1140e, this.f1141f, this.f1142g);
    }

    /* renamed from: d */
    public final long mo3466d() {
        return this.f1143h;
    }

    /* renamed from: e */
    public final C0435k0<T, V> mo3467e() {
        return this.f1137b;
    }

    /* renamed from: f */
    public final T mo3468f(long j) {
        if (mo3465c(j)) {
            return this.f1139d;
        }
        return this.f1137b.mo3510b().invoke(this.f1136a.mo3521g(j, this.f1140e, this.f1141f, this.f1142g));
    }

    /* renamed from: g */
    public final T mo3469g() {
        return this.f1139d;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TargetBasedAnimation: ");
        h.append(this.f1138c);
        h.append(" -> ");
        h.append(this.f1139d);
        h.append(",initial velocity: ");
        h.append(this.f1142g);
        h.append(", duration: ");
        h.append(mo3466d() / 1000000);
        h.append(" ms");
        return h.toString();
    }

    public C0431i0(C0422e<T> eVar, C0435k0<T, V> k0Var, T t, T t2, V v) {
        V v2;
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(k0Var, "typeConverter");
        C0439m0<V> a = eVar.mo3470a(k0Var);
        C19383o.m32797g(a, "animationSpec");
        this.f1136a = a;
        this.f1137b = k0Var;
        this.f1138c = t;
        this.f1139d = t2;
        V v3 = (C0432j) k0Var.mo3509a().invoke(t);
        this.f1140e = v3;
        V v4 = (C0432j) k0Var.mo3509a().invoke(t2);
        this.f1141f = v4;
        if (v != null) {
            v2 = C1993m.m4377w(v);
        } else {
            C0432j jVar = (C0432j) k0Var.mo3509a().invoke(t);
            C19383o.m32797g(jVar, "<this>");
            v2 = jVar.mo3490c();
        }
        this.f1142g = v2;
        this.f1143h = a.mo3518b(v3, v4, v2);
        this.f1144i = a.mo3519d(v3, v4, v2);
    }
}
