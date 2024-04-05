package com.etsy.android.p327ui.shop;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import com.appboy.Constants;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyDeepLinkId;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p444se.C13375a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.v */
public final class C11248v implements C12729e {

    /* renamed from: a */
    public final C12741o f24828a;

    /* renamed from: b */
    public final C13375a f24829b;

    public C11248v(C12741o oVar, C13375a aVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(aVar, "shopDeepLinkInspector");
        this.f24828a = oVar;
        this.f24829b = aVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12731g.C12733b bVar;
        HashMap hashMap;
        ShopHomeConfig shopHomeConfig;
        Uri uri = fVar.f28049b;
        String str = fVar.f28050c;
        Bundle bundle = fVar.f28051d;
        String string = bundle.getString("source_type");
        this.f24829b.getClass();
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        String lastPathSegment = uri.getLastPathSegment();
        DeepLinkEntity deepLinkEntity = DeepLinkEntity.SHOP;
        if (C19383o.m32792b(lastPathSegment, deepLinkEntity.getEntityName())) {
            return new C12731g.C12733b(new HomePagerKey(str, bundle, false, 4, (DefaultConstructorMarker) null));
        }
        boolean z = true;
        if (this.f24829b.mo46057a(uri, string)) {
            String e = this.f24828a.mo45510e(uri, deepLinkEntity.getEntityName());
            this.f24828a.getClass();
            String queryParameter = uri.getQueryParameter("coupon");
            this.f24828a.getClass();
            HashMap c = C12741o.m20403c(uri);
            if (!c.containsKey("section_id") && !c.containsKey("search_query") && !c.containsKey(ResponseConstants.ORDER)) {
                z = false;
            }
            if (z) {
                ShopHomeConfig shopHomeConfig2 = ShopHomeConfig.ITEMS_SEARCH;
                this.f24828a.getClass();
                shopHomeConfig = shopHomeConfig2;
                hashMap = C12741o.m20403c(uri);
            } else {
                shopHomeConfig = null;
                hashMap = null;
            }
            if (!C18263b.m30839d0(e)) {
                return new C12731g.C12732a(C0073e.m206f("Invalid shop name ", uri));
            }
            bVar = new C12731g.C12733b(new ShopHomeKey(str, (EtsyId) null, shopHomeConfig, hashMap, (String) null, e, (EtsyId) null, false, queryParameter, bundle, 210, (DefaultConstructorMarker) null));
        } else {
            String e2 = this.f24828a.mo45510e(uri, deepLinkEntity.getEntityName());
            this.f24828a.getClass();
            String queryParameter2 = uri.getQueryParameter("coupon");
            EtsyDeepLinkId etsyDeepLinkId = new EtsyDeepLinkId();
            if (!C18263b.m30839d0(e2)) {
                return new C12731g.C12732a(C0073e.m206f("Invalid shop id ", uri));
            }
            etsyDeepLinkId.checkIdTypeAndSet(e2);
            bVar = new C12731g.C12733b(new ShopHomeKey(str, new EtsyId(etsyDeepLinkId.getId()), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, queryParameter2, bundle, 252, (DefaultConstructorMarker) null));
        }
        return bVar;
    }
}
