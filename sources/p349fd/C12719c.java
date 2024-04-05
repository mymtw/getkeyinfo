package p349fd;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p490yd.C13914b;

/* renamed from: fd.c */
public final class C12719c {

    /* renamed from: a */
    public final C13573c f28039a;

    /* renamed from: b */
    public final C13914b f28040b;

    public C12719c(C13573c cVar, C13914b bVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(bVar, "toaster");
        this.f28039a = cVar;
        this.f28040b = bVar;
    }

    /* renamed from: a */
    public final C13574d mo45490a(ListingViewState.C10092d dVar, C13597g.C13621d1 d1Var) {
        GooglePayData googlePayData;
        C19383o.m32797g(d1Var, "event");
        SingleListingCart singleListingCart = d1Var.f30096a;
        if (singleListingCart == null || (googlePayData = singleListingCart.getGooglePayData()) == null) {
            C13914b.m21425a(this.f28040b, R.string.whoops_somethings_wrong);
            return C13574d.C13575a.f29662a;
        }
        this.f28039a.mo38043a(new C13597g.C13635f1(googlePayData));
        return new C13574d.C13594c(ListingViewState.C10092d.m18242e(dVar, false, (C10409f) null, googlePayData, (AppsInventoryAddToCartContext) null, (C10425l) null, false, 991));
    }
}
