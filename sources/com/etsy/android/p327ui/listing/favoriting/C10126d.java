package com.etsy.android.p327ui.listing.favoriting;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.Shop;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.C10660a;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p437rd.C13354a;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.favoriting.d */
public final class C10126d {

    /* renamed from: a */
    public final C13573c f22288a;

    public C10126d(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22288a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33526a(ListingViewState.C10092d dVar, C13597g.C13661j jVar) {
        List<ListingImage> list;
        ListingViewState.C10092d dVar2 = dVar;
        C13597g.C13661j jVar2 = jVar;
        C19383o.m32797g(jVar2, "event");
        C13573c cVar = this.f22288a;
        long f = dVar.mo33477f();
        C10660a aVar = dVar2.f22238f.f22800c.f23427a;
        boolean a = aVar != null ? aVar.mo34327a() : false;
        EtsyId etsyId = new EtsyId(dVar.mo33477f());
        String title = dVar2.f22239g.getListing().getTitle();
        String url = dVar2.f22239g.getListing().getUrl();
        C13354a aVar2 = dVar2.f22238f.f22801d;
        ListingImage listingImage = (aVar2 == null || (list = aVar2.f29277a) == null) ? null : (ListingImage) C19327t.m32640V0(list);
        Shop k = dVar.mo33483k();
        String shopName = k != null ? k.getShopName() : null;
        Long l = dVar.mo33484l();
        EtsyId etsyId2 = l != null ? new EtsyId(l.longValue()) : null;
        C10660a aVar3 = dVar2.f22238f.f22800c.f23427a;
        cVar.mo38043a(new C13597g.C13647h(f, new LightWeightListingLike(etsyId, title, (EtsyMoney) null, url, listingImage, shopName, etsyId2, aVar3 != null ? aVar3.f23436a : false, aVar3 != null ? aVar3.f23437b : false), (String) null, a, jVar2.f30154a));
        return C13574d.C13575a.f29662a;
    }
}
