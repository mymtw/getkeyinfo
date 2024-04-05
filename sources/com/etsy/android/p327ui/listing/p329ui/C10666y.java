package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.toppanel.C10658e;
import com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.C10655b;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.C10660a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p482xd.C13879a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.y */
public final class C10666y {

    /* renamed from: a */
    public C10660a f23486a;

    /* renamed from: b */
    public C13879a f23487b;

    /* renamed from: c */
    public C10655b f23488c;

    public C10666y(C10658e eVar) {
        C19383o.m32797g(eVar, "topPanel");
        C10660a aVar = eVar.f23427a;
        C13879a aVar2 = eVar.f23428b;
        C10655b bVar = eVar.f23429c;
        this.f23486a = aVar;
        this.f23487b = aVar2;
        this.f23488c = bVar;
    }

    /* renamed from: a */
    public final void mo34352a(C19857l<? super C10407d, C19394m> lVar) {
        C10660a aVar = this.f23486a;
        if (aVar != null) {
            C10407d dVar = new C10407d(aVar);
            lVar.invoke(dVar);
            this.f23486a = new C10660a(dVar.f22779a, dVar.f22780b, dVar.f22781c, dVar.f22782d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10666y)) {
            return false;
        }
        C10666y yVar = (C10666y) obj;
        return C19383o.m32792b(this.f23486a, yVar.f23486a) && C19383o.m32792b(this.f23487b, yVar.f23487b) && C19383o.m32792b(this.f23488c, yVar.f23488c);
    }

    public final int hashCode() {
        C10660a aVar = this.f23486a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C13879a aVar2 = this.f23487b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C10655b bVar = this.f23488c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TopPanelBuilder(favoriteInfo=");
        h.append(this.f23486a);
        h.append(", shareInfo=");
        h.append(this.f23487b);
        h.append(", contactShopInfo=");
        h.append(this.f23488c);
        h.append(')');
        return h.toString();
    }
}
