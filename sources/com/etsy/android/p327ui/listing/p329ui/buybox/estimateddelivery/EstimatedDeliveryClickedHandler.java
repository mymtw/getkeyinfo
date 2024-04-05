package com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.estimateddelivery.EstimatedDeliveryClickedHandler */
public final class EstimatedDeliveryClickedHandler {

    /* renamed from: a */
    public final C11786n f22534a;

    /* renamed from: b */
    public final C13573c f22535b;

    public EstimatedDeliveryClickedHandler(C13573c cVar, C11786n nVar) {
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22534a = nVar;
        this.f22535b = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo33624a(ListingViewState.C10092d dVar, C13597g.C13627e0 e0Var) {
        CharSequence charSequence;
        C19383o.m32797g(e0Var, "event");
        this.f22535b.mo38043a(new C13597g.C13633f("listing_estimated_delivery_date_range_tapped"));
        if (C18263b.m30839d0(e0Var.f30103a)) {
            C11786n nVar = this.f22534a;
            String str = e0Var.f30103a;
            nVar.getClass();
            charSequence = C18263b.m30818M(str);
        } else {
            charSequence = this.f22534a.mo38059c(R.string.estimated_delivery_date_legalese, new Object[0]);
        }
        return C0761x.m1709a1(dVar, new EstimatedDeliveryClickedHandler$handle$1(this, charSequence));
    }
}
