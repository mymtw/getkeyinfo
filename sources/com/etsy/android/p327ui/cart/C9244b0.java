package com.etsy.android.p327ui.cart;

import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.cart.C9296f;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.cart.b0 */
public final class C9244b0 implements C12729e {

    /* renamed from: a */
    public final C12741o f20417a;

    /* renamed from: b */
    public final C9242a0 f20418b;

    public C9244b0(C12741o oVar, C9242a0 a0Var) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(a0Var, "couponProcessor");
        this.f20417a = oVar;
        this.f20418b = a0Var;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        String e = this.f20417a.mo45510e(fVar2.f28049b, DeepLinkEntity.PROMOTED_OFFERS.getEntityName());
        C9242a0 a0Var = this.f20418b;
        Uri uri = fVar2.f28049b;
        a0Var.getClass();
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(a0Var.f20415c, "routeInspector");
        HashMap c = C12741o.m20403c(uri);
        TreeMap treeMap = new TreeMap(c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            C19383o.m32796f(str, "it");
            if (C19457k.m33025c1(str, "shop_ids[", false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = (String) C19327t.m32637S0(linkedHashMap.values());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str3 = (String) entry2.getKey();
            C19383o.m32796f(str3, "it");
            if (C19457k.m33025c1(str3, "promotion_ids[", false)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        String str4 = (String) C19327t.m32637S0(linkedHashMap2.values());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str5 = (String) entry3.getKey();
            C19383o.m32796f(str5, "it");
            if (C19457k.m33025c1(str5, "coupon_code", false)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        String str6 = (String) C19327t.m32637S0(linkedHashMap3.values());
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry4 : treeMap.entrySet()) {
            String str7 = (String) entry4.getKey();
            C19383o.m32796f(str7, "it");
            if (C19457k.m33025c1(str7, "emailed_listings[", false)) {
                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
            }
        }
        String str8 = (String) C19327t.m32637S0(linkedHashMap4.values());
        C19383o.m32796f(str2, "shopIds");
        C19383o.m32796f(str6, "couponCodes");
        C19383o.m32796f(str4, "promotedOfferIds");
        C19383o.m32796f(str8, "emailedListings");
        String str9 = (String) c.get("id");
        C9296f.C9299c cVar = new C9296f.C9299c(Long.parseLong(str2), Long.parseLong(str4), str6, str8);
        C9293d dVar = a0Var.f20413a;
        dVar.getClass();
        dVar.f20508a.add(cVar);
        a0Var.f20414b.f20595a.onNext(C9315k.C9321f.f20593a);
        return new C12731g.C12733b(new CartWithSavedKey(fVar2.f28050c, e, fVar2.f28051d));
    }
}
