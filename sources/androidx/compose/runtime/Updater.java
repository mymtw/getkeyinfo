package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

public final class Updater<T> {
    /* renamed from: a */
    public static final void m2570a(C1302d dVar, C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "block");
        if (dVar.mo5436f()) {
            dVar.mo5471x(C19394m.f43287a, new Updater$init$1(lVar));
        }
    }

    /* renamed from: b */
    public static final <V> void m2571b(C1302d dVar, V v, C19861p<? super T, ? super V, C19394m> pVar) {
        C19383o.m32797g(pVar, "block");
        if (dVar.mo5436f() || !C19383o.m32792b(dVar.mo5467v(), v)) {
            dVar.mo5454o(v);
            dVar.mo5471x(v, pVar);
        }
    }
}
