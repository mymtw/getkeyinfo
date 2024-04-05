package com.etsy.android.p327ui.listing.p329ui.toppanel;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.C10655b;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.C10660a;
import kotlin.jvm.internal.C19383o;
import p482xd.C13879a;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.e */
public final class C10658e {

    /* renamed from: a */
    public final C10660a f23427a;

    /* renamed from: b */
    public final C13879a f23428b;

    /* renamed from: c */
    public final C10655b f23429c;

    public C10658e() {
        this((C10660a) null, (C13879a) null, (C10655b) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10658e)) {
            return false;
        }
        C10658e eVar = (C10658e) obj;
        return C19383o.m32792b(this.f23427a, eVar.f23427a) && C19383o.m32792b(this.f23428b, eVar.f23428b) && C19383o.m32792b(this.f23429c, eVar.f23429c);
    }

    public final int hashCode() {
        C10660a aVar = this.f23427a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C13879a aVar2 = this.f23428b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C10655b bVar = this.f23429c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TopPanel(favoriteInfo=");
        h.append(this.f23427a);
        h.append(", shareInfo=");
        h.append(this.f23428b);
        h.append(", contactShopInfo=");
        h.append(this.f23429c);
        h.append(')');
        return h.toString();
    }

    public C10658e(C10660a aVar, C13879a aVar2, C10655b bVar) {
        this.f23427a = aVar;
        this.f23428b = aVar2;
        this.f23429c = bVar;
    }
}
