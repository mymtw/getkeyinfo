package p489yc;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;

/* renamed from: yc.g */
public final class C13910g {
    /* renamed from: a */
    public static C13574d.C13576b.C13577a m21424a(ListingViewState.C10092d dVar) {
        boolean z = true;
        LinkedHashMap t0 = C19294b0.m32563t0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, String.valueOf(dVar.mo33477f())));
        Long l = dVar.mo33484l();
        if (l != null) {
            t0.put(PredefinedAnalyticsProperty.SHOP_ID, String.valueOf(l.longValue()));
        }
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.LISTING_IS_FAVED;
        ListingCard listingCard = dVar.f22239g.getListingCard();
        t0.put(predefinedAnalyticsProperty, Boolean.valueOf(listingCard != null ? C19383o.m32792b(listingCard.isFavorite(), Boolean.TRUE) : false));
        PredefinedAnalyticsProperty predefinedAnalyticsProperty2 = PredefinedAnalyticsProperty.LISTING_IS_COLLECTED;
        ListingCard listingCard2 = dVar.f22239g.getListingCard();
        t0.put(predefinedAnalyticsProperty2, Boolean.valueOf(listingCard2 != null ? C19383o.m32792b(listingCard2.isInCollections(), Boolean.TRUE) : false));
        t0.put(PredefinedAnalyticsProperty.LISTING_IS_SHOP_FAV, Boolean.valueOf(C19383o.m32792b(dVar.f22239g.isShopFavorited(), Boolean.TRUE)));
        t0.put(PredefinedAnalyticsProperty.LISTING_IS_SOLD_OUT, Boolean.valueOf(dVar.f22239g.getListing().isSoldOut()));
        PredefinedAnalyticsProperty predefinedAnalyticsProperty3 = PredefinedAnalyticsProperty.LISTING_IS_AVAILABLE;
        if (!dVar.f22239g.getListing().isAvailable()) {
            z = false;
        }
        t0.put(predefinedAnalyticsProperty3, Boolean.valueOf(z));
        t0.put(PredefinedAnalyticsProperty.REFERRER, dVar.mo33467b());
        return new C13574d.C13576b.C13577a("view_listing_complementary", t0);
    }
}
