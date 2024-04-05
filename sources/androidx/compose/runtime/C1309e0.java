package androidx.compose.runtime;

import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.runtime.e0 */
public final class C1309e0<T> implements C1342k1<T> {

    /* renamed from: b */
    public final C19285c f2853b;

    public C1309e0(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "valueProducer");
        this.f2853b = C19350d.m32677b(aVar);
    }

    public final T getValue() {
        return this.f2853b.getValue();
    }
}
