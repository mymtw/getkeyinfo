package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10421h;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.d */
public final class C10345d {

    /* renamed from: a */
    public final C10421h f22698a;

    /* renamed from: b */
    public final C10156h f22699b;

    /* renamed from: c */
    public final C8890e0 f22700c;

    /* renamed from: d */
    public final C9684a f22701d;

    public C10345d(C10421h hVar, C10156h hVar2, C8890e0 e0Var, C9684a aVar) {
        C19383o.m32797g(hVar, "listingUiFactory");
        C19383o.m32797g(hVar2, "listingViewEligibility");
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(aVar, "listingImagesByVariationHelper");
        this.f22698a = hVar;
        this.f22699b = hVar2;
        this.f22700c = e0Var;
        this.f22701d = aVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo33724a(ListingViewState.C10092d dVar, C13597g.C13639f5 f5Var) {
        C19383o.m32797g(f5Var, "event");
        return C0761x.m1709a1(ListingViewState.C10092d.m18242e(dVar, false, (C10409f) null, (GooglePayData) null, f5Var.f30119a, (C10425l) null, false, 959), new UpdateOfferingHandler$handle$1(dVar, f5Var, this));
    }
}
