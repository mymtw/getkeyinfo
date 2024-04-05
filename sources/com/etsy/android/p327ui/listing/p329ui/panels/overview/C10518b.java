package com.etsy.android.p327ui.listing.p329ui.panels.overview;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.panels.overview.b */
public final class C10518b extends C10423j implements C13949d {

    /* renamed from: a */
    public final List<CharSequence> f23067a;

    /* renamed from: b */
    public final boolean f23068b;

    /* renamed from: c */
    public final boolean f23069c;

    public C10518b(List<? extends CharSequence> list, boolean z, boolean z2) {
        C19383o.m32797g(list, "bullets");
        this.f23067a = list;
        this.f23068b = z;
        this.f23069c = z2;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.OVERVIEW_PANEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10518b)) {
            return false;
        }
        C10518b bVar = (C10518b) obj;
        return C19383o.m32792b(this.f23067a, bVar.f23067a) && this.f23068b == bVar.f23068b && this.f23069c == bVar.f23069c;
    }

    public final int hashCode() {
        int hashCode = this.f23067a.hashCode() * 31;
        boolean z = this.f23068b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23069c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OverviewPanel(bullets=");
        h.append(this.f23067a);
        h.append(", isExpanded=");
        h.append(this.f23068b);
        h.append(", isLogged=");
        return C0391c.m1058d(h, this.f23069c, ')');
    }
}
