package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import p174m0.C7290i;
import p753kq.C19861p;

/* renamed from: androidx.compose.animation.t */
public final class C0485t implements C0484s {

    /* renamed from: a */
    public final boolean f1229a;

    /* renamed from: b */
    public final C19861p<C7290i, C7290i, C0454t<C7290i>> f1230b;

    public C0485t(boolean z, C19861p<? super C7290i, ? super C7290i, ? extends C0454t<C7290i>> pVar) {
        this.f1229a = z;
        this.f1230b = pVar;
    }

    /* renamed from: b */
    public final boolean mo3569b() {
        return this.f1229a;
    }

    /* renamed from: c */
    public final C0454t<C7290i> mo3570c(long j, long j2) {
        return this.f1230b.invoke(new C7290i(j), new C7290i(j2));
    }
}
