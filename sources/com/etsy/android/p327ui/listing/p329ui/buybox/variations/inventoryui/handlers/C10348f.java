package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.f */
public final class C10348f {

    /* renamed from: a */
    public final Connectivity f22703a;

    /* renamed from: b */
    public final C13573c f22704b;

    public C10348f(Connectivity connectivity, C13573c cVar) {
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22703a = connectivity;
        this.f22704b = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33725a(ListingViewState.C10092d dVar, C13597g.C13695n5 n5Var) {
        C19383o.m32797g(n5Var, "event");
        this.f22704b.mo38043a(new C13597g.C13633f("listing_variation_changed"));
        if (!this.f22703a.mo29933a()) {
            AppsInventoryAddToCartContext appsInventoryAddToCartContext = dVar.f22241i;
            if (appsInventoryAddToCartContext != null) {
                this.f22704b.mo38043a(new C13597g.C13639f5(appsInventoryAddToCartContext));
            }
            this.f22704b.mo38043a(C13597g.C13643g2.f30124a);
        } else {
            this.f22704b.mo38043a(n5Var.f30200a);
            this.f22704b.mo38043a(C13597g.C13766y0.f30297a);
            this.f22704b.mo38043a(C13597g.C13769y3.f30300a);
        }
        return C13574d.C13575a.f29662a;
    }
}
