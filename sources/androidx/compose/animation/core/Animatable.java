package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import p753kq.C19857l;

public final class Animatable<T, V extends C0432j> {

    /* renamed from: a */
    public final C0435k0<T, V> f1006a;

    /* renamed from: b */
    public final T f1007b;

    /* renamed from: c */
    public final C0424f<T, V> f1008c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1009d = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1010e;

    /* renamed from: f */
    public final C0420d0 f1011f;

    /* renamed from: g */
    public final C0429h0<T> f1012g;

    /* renamed from: h */
    public final V f1013h;

    /* renamed from: i */
    public final V f1014i;

    /* renamed from: j */
    public V f1015j;

    /* renamed from: k */
    public V f1016k;

    public Animatable(T t, C0435k0<T, V> k0Var, T t2) {
        C19383o.m32797g(k0Var, "typeConverter");
        this.f1006a = k0Var;
        this.f1007b = t2;
        this.f1008c = new C0424f<>(k0Var, t, (C0432j) null, 60);
        this.f1010e = C0761x.m1751w0(t, C1351n1.f2948a);
        this.f1011f = new C0420d0();
        this.f1012g = new C0429h0<>(t2, 3);
        V v = (C0432j) k0Var.mo3509a().invoke(t);
        int b = v.mo3489b();
        for (int i = 0; i < b; i++) {
            v.mo3492e(Float.NEGATIVE_INFINITY, i);
        }
        this.f1013h = v;
        V v2 = (C0432j) this.f1006a.mo3509a().invoke(t);
        int b2 = v2.mo3489b();
        for (int i2 = 0; i2 < b2; i2++) {
            v2.mo3492e(Float.POSITIVE_INFINITY, i2);
        }
        this.f1014i = v2;
        this.f1015j = v;
        this.f1016k = v2;
    }

    /* renamed from: a */
    public static final Object m1063a(Animatable animatable, Object obj) {
        if (C19383o.m32792b(animatable.f1015j, animatable.f1013h) && C19383o.m32792b(animatable.f1016k, animatable.f1014i)) {
            return obj;
        }
        C0432j jVar = (C0432j) animatable.f1006a.mo3509a().invoke(obj);
        int b = jVar.mo3489b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (jVar.mo3488a(i) < animatable.f1015j.mo3488a(i) || jVar.mo3488a(i) > animatable.f1016k.mo3488a(i)) {
                jVar.mo3492e(C19388s.m32831L(jVar.mo3488a(i), animatable.f1015j.mo3488a(i), animatable.f1016k.mo3488a(i)), i);
                z = true;
            }
        }
        return z ? animatable.f1006a.mo3510b().invoke(jVar) : obj;
    }

    /* renamed from: b */
    public static final void m1064b(Animatable animatable) {
        C0424f<T, V> fVar = animatable.f1008c;
        fVar.f1111d.mo3491d();
        fVar.f1112e = Long.MIN_VALUE;
        animatable.f1009d.setValue(Boolean.FALSE);
    }

    /* renamed from: d */
    public static Object m1065d(Animatable animatable, Object obj, C0422e eVar, Float f, C19857l lVar, C19340c cVar, int i) {
        if ((i & 2) != 0) {
            eVar = animatable.f1012g;
        }
        C0422e eVar2 = eVar;
        T t = f;
        if ((i & 4) != 0) {
            t = animatable.f1006a.mo3510b().invoke(animatable.f1008c.f1111d);
        }
        Float f2 = t;
        if ((i & 8) != 0) {
            lVar = null;
        }
        return animatable.mo3374c(obj, eVar2, f2, lVar, cVar);
    }

    /* renamed from: c */
    public final Object mo3374c(T t, C0422e<T> eVar, T t2, C19857l<? super Animatable<T, V>, C19394m> lVar, C19340c<? super C0417c<T, V>> cVar) {
        Object e = mo3375e();
        C0435k0<T, V> k0Var = this.f1006a;
        C19383o.m32797g(eVar, "animationSpec");
        C19383o.m32797g(k0Var, "typeConverter");
        T t3 = t2;
        C0431i0 i0Var = new C0431i0(eVar, k0Var, e, t, (C0432j) k0Var.mo3509a().invoke(t2));
        long j = this.f1008c.f1112e;
        C0420d0 d0Var = this.f1011f;
        Animatable$runAnimation$2 animatable$runAnimation$2 = new Animatable$runAnimation$2(this, t2, i0Var, j, lVar, (C19340c<? super Animatable$runAnimation$2>) null);
        MutatePriority mutatePriority = MutatePriority.Default;
        d0Var.getClass();
        return C19697g.m33466d(new MutatorMutex$mutate$2(mutatePriority, d0Var, animatable$runAnimation$2, (C19340c<? super MutatorMutex$mutate$2>) null), cVar);
    }

    /* renamed from: e */
    public final T mo3375e() {
        return this.f1008c.getValue();
    }

    /* renamed from: f */
    public final Object mo3376f(T t, C19340c<? super C19394m> cVar) {
        C0420d0 d0Var = this.f1011f;
        Animatable$snapTo$2 animatable$snapTo$2 = new Animatable$snapTo$2(this, t, (C19340c<? super Animatable$snapTo$2>) null);
        MutatePriority mutatePriority = MutatePriority.Default;
        d0Var.getClass();
        Object d = C19697g.m33466d(new MutatorMutex$mutate$2(mutatePriority, d0Var, animatable$snapTo$2, (C19340c<? super MutatorMutex$mutate$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }
}
