package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.button.C10450b;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p443sd.C13373a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.m */
public final class C10448m {

    /* renamed from: a */
    public C13373a f22922a;

    /* renamed from: b */
    public List<C10455c> f22923b;

    /* renamed from: c */
    public C10450b f22924c;

    public C10448m() {
        this((C13373a) null, (List<C10455c>) null, (C10450b) null);
    }

    /* renamed from: a */
    public final void mo33984a(long j, C19857l<? super C10458n, C19394m> lVar) {
        List<C10455c> list = this.f22923b;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(list));
            for (C10455c cVar : list) {
                C10453a aVar = cVar.f22954a;
                if (aVar.f22939a == j) {
                    C10458n nVar = new C10458n(aVar);
                    lVar.invoke(nVar);
                    cVar = C10455c.m18447b(cVar, nVar.mo34009a(), (C10453a) null, 6);
                } else {
                    C10453a aVar2 = cVar.f22955b;
                    if (aVar2.f22939a == j) {
                        C10458n nVar2 = new C10458n(aVar2);
                        lVar.invoke(nVar2);
                        cVar = C10455c.m18447b(cVar, (C10453a) null, nVar2.mo34009a(), 5);
                    }
                }
                arrayList2.add(cVar);
            }
            arrayList = arrayList2;
        }
        this.f22923b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10448m)) {
            return false;
        }
        C10448m mVar = (C10448m) obj;
        return C19383o.m32792b(this.f22922a, mVar.f22922a) && C19383o.m32792b(this.f22923b, mVar.f22923b) && C19383o.m32792b(this.f22924c, mVar.f22924c);
    }

    public final int hashCode() {
        boolean z;
        C13373a aVar = this.f22922a;
        int i = 0;
        if (aVar == null) {
            z = false;
        } else {
            z = aVar.f29299a;
            if (z) {
                z = true;
            }
        }
        int i2 = (z ? 1 : 0) * true;
        List<C10455c> list = this.f22923b;
        int hashCode = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        C10450b bVar = this.f22924c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MoreFromShopBuilder(title=");
        h.append(this.f22922a);
        h.append(", rows=");
        h.append(this.f22923b);
        h.append(", button=");
        h.append(this.f22924c);
        h.append(')');
        return h.toString();
    }

    public C10448m(C13373a aVar, List<C10455c> list, C10450b bVar) {
        this.f22922a = aVar;
        this.f22923b = list;
        this.f22924c = bVar;
    }
}
