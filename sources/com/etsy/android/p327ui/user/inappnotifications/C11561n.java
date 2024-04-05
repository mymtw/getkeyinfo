package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8672b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.n */
public final class C11561n {

    /* renamed from: a */
    public final C8672b f25606a;

    /* renamed from: b */
    public final C19857l<C11573r, C19394m> f25607b;

    public C11561n(C8672b bVar, C19857l<? super C11573r, C19394m> lVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f25606a = bVar;
        this.f25607b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11561n)) {
            return false;
        }
        C11561n nVar = (C11561n) obj;
        return C19383o.m32792b(this.f25606a, nVar.f25606a) && C19383o.m32792b(this.f25607b, nVar.f25607b);
    }

    public final int hashCode() {
        return this.f25607b.hashCode() + (this.f25606a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IANViewHolderDependencies(analyticsTracker=");
        h.append(this.f25606a);
        h.append(", clickHandler=");
        h.append(this.f25607b);
        h.append(')');
        return h.toString();
    }
}
