package androidx.compose.runtime;

import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.runtime.s0 */
public abstract class C1361s0<T> extends C1340k<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1361s0(C19846a<? extends T> aVar) {
        super(aVar);
        C19383o.m32797g(aVar, "defaultFactory");
    }

    /* renamed from: b */
    public final C1412t0<T> mo5908b(T t) {
        return new C1412t0<>(this, t, true);
    }
}
