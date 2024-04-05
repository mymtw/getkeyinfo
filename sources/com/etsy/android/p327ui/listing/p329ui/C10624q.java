package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.q */
public final class C10624q {

    /* renamed from: a */
    public List<? extends CharSequence> f23314a;

    /* renamed from: b */
    public boolean f23315b;

    /* renamed from: c */
    public boolean f23316c;

    public C10624q() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r4.f23067a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10624q(com.etsy.android.p327ui.listing.p329ui.panels.overview.C10518b r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0006
            java.util.List<java.lang.CharSequence> r0 = r4.f23067a
            if (r0 != 0) goto L_0x0008
        L_0x0006:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x0008:
            r1 = 0
            if (r4 == 0) goto L_0x000e
            boolean r2 = r4.f23068b
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r4 == 0) goto L_0x0013
            boolean r1 = r4.f23069c
        L_0x0013:
            java.lang.String r4 = "bullets"
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            r3.<init>()
            r3.f23314a = r0
            r3.f23315b = r2
            r3.f23316c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10624q.<init>(com.etsy.android.ui.listing.ui.panels.overview.b):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10624q)) {
            return false;
        }
        C10624q qVar = (C10624q) obj;
        return C19383o.m32792b(this.f23314a, qVar.f23314a) && this.f23315b == qVar.f23315b && this.f23316c == qVar.f23316c;
    }

    public final int hashCode() {
        int hashCode = this.f23314a.hashCode() * 31;
        boolean z = this.f23315b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23316c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OverviewPanelBuilder(bullets=");
        h.append(this.f23314a);
        h.append(", isExpanded=");
        h.append(this.f23315b);
        h.append(", isLogged=");
        return C0391c.m1058d(h, this.f23316c, ')');
    }
}
