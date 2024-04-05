package com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.freeshipping.b */
public final class C10259b {

    /* renamed from: a */
    public final C13573c f22549a;

    public C10259b(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22549a = cVar;
    }

    /* renamed from: b */
    public static C13574d m18326b(ListingViewState.C10092d dVar) {
        Iterator it = dVar.mo33485m().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C10423j jVar = (C10423j) it.next();
            if ((jVar instanceof C10590a) || (jVar instanceof C10615a)) {
                break;
            }
            i++;
        }
        return i != -1 ? new C13574d.C13576b.C13587k(i) : C13574d.C13575a.f29662a;
    }

    /* renamed from: a */
    public final C13574d mo33633a(ListingViewState.C10092d dVar, C13597g.C13772z0 z0Var) {
        C19383o.m32797g(z0Var, "event");
        if (C19459m.m33036e1(z0Var.f30303a, "#listing-shipping-estimate", false)) {
            this.f22549a.mo38043a(new C13597g.C13633f("listing_free_shipping_country_tapped"));
            return m18326b(dVar);
        } else if (!C19459m.m33036e1(z0Var.f30303a, "#show_shipping_section", false)) {
            return C13574d.C13575a.f29662a;
        } else {
            this.f22549a.mo38043a(new C13597g.C13633f("listing_quick_delivery_tapped"));
            return m18326b(dVar);
        }
    }
}
