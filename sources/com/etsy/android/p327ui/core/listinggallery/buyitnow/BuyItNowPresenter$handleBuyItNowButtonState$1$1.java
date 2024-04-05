package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.view.View;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.p327ui.core.listinggallery.C9680e;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c;
import com.etsy.android.util.C12059p;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$handleBuyItNowButtonState$1$1 */
final class BuyItNowPresenter$handleBuyItNowButtonState$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9665f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowPresenter$handleBuyItNowButtonState$1$1(C9665f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        boolean z;
        boolean z2;
        ListingFetch listingFetch;
        ListingFetch listingFetch2;
        C9666g gVar = this.this$0.f21408h;
        if (gVar != null) {
            C9649b value = gVar.f21411d.getValue();
            C19383o.m32794d(value);
            C9649b bVar = value;
            if (bVar instanceof C9649b.C9653d) {
                z = true;
            } else {
                z = bVar instanceof C9649b.C9652c;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = bVar instanceof C9649b.C9651b;
            }
            if (!z2 && (bVar instanceof C9649b.C9650a)) {
                C0005b bVar2 = gVar.f21409b;
                C9680e eVar = gVar.f21416i;
                List<Variation> list = null;
                AppsInventoryAddToCartContext appsInventoryAddToCartContext = eVar != null ? eVar.f21442c : null;
                List<Variation> variations = (eVar == null || (listingFetch2 = eVar.f21440a) == null) ? null : listingFetch2.getVariations();
                bVar2.getClass();
                boolean z3 = false;
                if (appsInventoryAddToCartContext != null) {
                    InventoryProductOffering offering = appsInventoryAddToCartContext.getOffering();
                    if (offering != null) {
                        z3 = C15588c1.m25348t0(Long.valueOf(offering.getOfferingId()));
                    }
                } else {
                    if (variations != null && (variations.isEmpty() ^ true)) {
                        boolean z4 = true;
                        for (Variation selectedValue : variations) {
                            if (selectedValue.getSelectedValue() == null) {
                                z4 = false;
                            }
                        }
                        z3 = z4;
                    } else {
                        z3 = true;
                    }
                }
                if (!z3) {
                    gVar.f21418k = null;
                    gVar.f21419l = null;
                    gVar.f21420m = null;
                    C9680e eVar2 = gVar.f21416i;
                    AppsInventoryAddToCartContext appsInventoryAddToCartContext2 = eVar2 != null ? eVar2.f21442c : null;
                    if (!(eVar2 == null || (listingFetch = eVar2.f21440a) == null)) {
                        list = listingFetch.getVariations();
                    }
                    if (appsInventoryAddToCartContext2 != null) {
                        gVar.f21413f.setValue(new C12059p(new C9655c.C9660e(appsInventoryAddToCartContext2, gVar.f21417j)));
                    } else if (list == null || !(!list.isEmpty())) {
                        throw new IllegalStateException("we should never get here");
                    } else {
                        gVar.f21413f.setValue(new C12059p(new C9655c.C9661f(list)));
                    }
                } else if (gVar.mo32384c()) {
                    gVar.mo32385d();
                } else {
                    gVar.mo32383b();
                }
            }
        }
    }
}
