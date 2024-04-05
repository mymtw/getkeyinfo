package com.etsy.android.p327ui.cart.clicklisteners;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cart.C9333r;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.h */
public final class C9283h extends C9282g {
    public C9283h(Fragment fragment, C8703p pVar, C9333r rVar) {
        super(fragment, pVar, rVar);
    }

    /* renamed from: f */
    public final void mo31624f(CartListing cartListing) {
        if (!cartListing.isGiftCard()) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, cartListing.getListingId().getId());
            this.f28980b.mo21333d("cart_tapped_listing", hashMap);
            String c0 = C19421p.m32935c0(mo45889a().getActivity());
            EtsyId listingId = cartListing.getListingId();
            C19383o.m32797g(listingId, "listingId");
            C12788a.m20424c(mo45889a().getActivity(), new ListingKey(c0, listingId, true, true, (Bundle) null));
        }
    }
}
