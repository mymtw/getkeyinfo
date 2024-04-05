package com.etsy.android.p327ui.listing.p329ui;

import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.MoreFromShopRows */
public final class MoreFromShopRows extends ArrayList<C10455c> {
    public static final int $stable = 0;

    public /* bridge */ boolean contains(C10455c cVar) {
        return super.contains(cVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(C10455c cVar) {
        return super.indexOf(cVar);
    }

    public /* bridge */ int lastIndexOf(C10455c cVar) {
        return super.lastIndexOf(cVar);
    }

    public final /* bridge */ C10455c remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ C10455c removeAt(int i) {
        return (C10455c) remove(i);
    }

    public final void row(C19857l<? super C10459o, C19394m> lVar) {
        C19383o.m32797g(lVar, "lambda");
        C10459o oVar = new C10459o(0);
        lVar.invoke(oVar);
        C10453a aVar = oVar.f22971a;
        C19383o.m32794d(aVar);
        C10453a aVar2 = oVar.f22972b;
        C19383o.m32794d(aVar2);
        add(new C10455c(aVar, aVar2, oVar.f22973c));
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C10455c)) {
            return false;
        }
        return contains((C10455c) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C10455c)) {
            return -1;
        }
        return indexOf((C10455c) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C10455c)) {
            return -1;
        }
        return lastIndexOf((C10455c) obj);
    }

    public /* bridge */ boolean remove(C10455c cVar) {
        return super.remove(cVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C10455c)) {
            return false;
        }
        return remove((C10455c) obj);
    }
}
