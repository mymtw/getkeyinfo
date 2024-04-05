package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p361hc.C12809a;
import p361hc.C12810b;
import p361hc.C12811c;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.handlers.FetchSingleListingCartHandler */
public final class FetchSingleListingCartHandler {

    /* renamed from: a */
    public final C12811c f22467a;

    /* renamed from: b */
    public final C10101d f22468b;

    /* renamed from: c */
    public final C13461f f22469c;

    /* renamed from: d */
    public final C13573c f22470d;

    public FetchSingleListingCartHandler(C12811c cVar, C10101d dVar, C13461f fVar, C13573c cVar2) {
        C19383o.m32797g(cVar, "repository");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(cVar2, "listingEventDispatcher");
        this.f22467a = cVar;
        this.f22468b = dVar;
        this.f22469c = fVar;
        this.f22470d = cVar2;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33595a(ListingViewState.C10092d dVar, C13597g.C13760x0 x0Var) {
        C19383o.m32797g(x0Var, "event");
        if (x0Var.f30288a) {
            this.f22470d.mo38043a(new C13597g.C13633f("start_google_pay_single_listing_checkout", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(dVar.mo33477f())))));
        }
        EtsyId etsyId = new EtsyId(dVar.f22239g.getListing().getListingId());
        int j = dVar.mo33482j();
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = dVar.f22241i;
        InventoryProductOffering offering = appsInventoryAddToCartContext != null ? appsInventoryAddToCartContext.getOffering() : null;
        List<Variation> variations = dVar.f22239g.getVariations();
        String g = dVar.mo33478g();
        Boolean valueOf = Boolean.valueOf(x0Var.f30288a);
        C12811c cVar = this.f22467a;
        cVar.getClass();
        C12809a aVar = cVar.f28296a;
        HashMap hashMap = new HashMap();
        hashMap.put("listing_id", etsyId.getId());
        hashMap.put(ResponseConstants.QUANTITY, String.valueOf(j));
        if (offering != null) {
            hashMap.put("listing_inventory_id", String.valueOf(offering.getOfferingId()));
        } else {
            HashMap hashMap2 = new HashMap();
            if (variations != null) {
                for (Variation next : variations) {
                    if (next.hasOptionSet()) {
                        String e = C0388a.m1049e(new Object[]{next.getPropertyId()}, 1, "variations[%d]", "format(format, *args)");
                        VariationValue selectedValue = next.getSelectedValue();
                        C19383o.m32794d(selectedValue);
                        hashMap2.put(e, String.valueOf(selectedValue.getValueId()));
                    }
                }
            }
            hashMap.putAll(hashMap2);
        }
        if (g != null) {
            hashMap.put(ResponseConstants.PERSONALIZATION, g);
        }
        if (valueOf != null) {
            hashMap.put("supports_google_pay", String.valueOf(valueOf.booleanValue()));
        }
        C8071s<C20145v<C19928a0>> a = aVar.mo45587a(hashMap);
        C12810b bVar = new C12810b(0);
        a.getClass();
        this.f22468b.f22277a.mo19403b(SubscribersKt.m32500e(C0326j.m860e(this.f22469c, new C19208j(a, bVar)), FetchSingleListingCartHandler$handle$disposable$1.INSTANCE, new FetchSingleListingCartHandler$handle$disposable$2(x0Var, this)));
        return C13574d.C13575a.f29662a;
    }
}
