package androidx.compose.foundation;

import androidx.compose.foundation.lazy.layout.C0850k;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6766d;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.x */
public final class C1031x implements C6764b {

    /* renamed from: b */
    public final C19857l<C0850k, C19394m> f2160b;

    public C1031x(C19857l<? super C0850k, C19394m> lVar) {
        this.f2160b = lVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f2160b.invoke(dVar.mo6818a(PinnableParentKt.f1791a));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1031x) && C19383o.m32792b(((C1031x) obj).f2160b, this.f2160b);
    }

    public final int hashCode() {
        return this.f2160b.hashCode();
    }
}
