package com.etsy.android.p327ui.listing.p329ui.shop.handlers;

import android.os.Bundle;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.shop.handlers.a */
public final class C10642a {
    public C10642a(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
    }

    /* renamed from: a */
    public static C13574d m18566a(ListingViewState.C10092d dVar, C13597g.C13699o2 o2Var) {
        C13597g.C13699o2 o2Var2 = o2Var;
        C19383o.m32797g(o2Var2, "event");
        Long l = dVar.mo33484l();
        if (l == null) {
            return C13574d.C13575a.f29662a;
        }
        long longValue = l.longValue();
        ShopHomeKey shopHomeKey = r4;
        ShopHomeKey shopHomeKey2 = new ShopHomeKey(dVar.mo33467b(), new EtsyId(longValue), o2Var2.f30204a, (Map) null, String.valueOf(dVar.mo33477f()), (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1000, (DefaultConstructorMarker) null);
        return new C13574d.C13576b.C13585i(shopHomeKey);
    }
}
