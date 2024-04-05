package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a;
import kotlin.jvm.internal.C19383o;
import p467vd.C13780a;

/* renamed from: com.etsy.android.ui.listing.ui.o */
public final class C10459o {

    /* renamed from: a */
    public C10453a f22971a;

    /* renamed from: b */
    public C10453a f22972b;

    /* renamed from: c */
    public C13780a f22973c;

    public C10459o() {
        this(0);
    }

    public C10459o(int i) {
        this.f22971a = null;
        this.f22972b = null;
        this.f22973c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10459o)) {
            return false;
        }
        C10459o oVar = (C10459o) obj;
        return C19383o.m32792b(this.f22971a, oVar.f22971a) && C19383o.m32792b(this.f22972b, oVar.f22972b) && C19383o.m32792b(this.f22973c, oVar.f22973c);
    }

    public final int hashCode() {
        C10453a aVar = this.f22971a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C10453a aVar2 = this.f22972b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C13780a aVar3 = this.f22973c;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MoreFromShopRowBuilder(first=");
        h.append(this.f22971a);
        h.append(", second=");
        h.append(this.f22972b);
        h.append(", bottomSpace=");
        h.append(this.f22973c);
        h.append(')');
        return h.toString();
    }
}
