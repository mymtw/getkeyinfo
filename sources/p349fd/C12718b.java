package p349fd;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p490yd.C13914b;

/* renamed from: fd.b */
public final class C12718b {

    /* renamed from: a */
    public final C13914b f28038a;

    public C12718b(C13914b bVar) {
        C19383o.m32797g(bVar, "toaster");
        this.f28038a = bVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo45489a(ListingViewState.C10092d dVar) {
        C13914b.m21425a(this.f28038a, R.string.whoops_somethings_wrong);
        return new C13574d.C13594c(ListingViewState.C10092d.m18242e(dVar, false, (C10409f) null, (GooglePayData) null, (AppsInventoryAddToCartContext) null, (C10425l) null, false, 991));
    }
}
