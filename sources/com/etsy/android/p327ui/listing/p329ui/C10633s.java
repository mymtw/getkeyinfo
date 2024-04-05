package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.C10621a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.s */
public final class C10633s {

    /* renamed from: a */
    public C10621a f23338a;

    public C10633s(C10621a aVar) {
        this.f23338a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10633s) && C19383o.m32792b(this.f23338a, ((C10633s) obj).f23338a);
    }

    public final int hashCode() {
        return this.f23338a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ProductWarningInfoBuilder(info=");
        h.append(this.f23338a);
        h.append(')');
        return h.toString();
    }
}
