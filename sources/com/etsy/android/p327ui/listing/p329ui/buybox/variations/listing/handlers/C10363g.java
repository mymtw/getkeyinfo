package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers;

import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.handlers.g */
public final class C10363g {

    /* renamed from: a */
    public final C13573c f22718a;

    public C10363g(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22718a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33738a(C13597g.C13702o5 o5Var) {
        C19383o.m32797g(o5Var, "event");
        this.f22718a.mo38043a(new C13597g.C13633f("listing_variation_changed"));
        this.f22718a.mo38043a(o5Var.f30211a);
        VariationValue variationValue = o5Var.f30212b;
        if (variationValue != null) {
            this.f22718a.mo38043a(new C13597g.C13646g5(variationValue));
        }
        this.f22718a.mo38043a(C13597g.C13769y3.f30300a);
        return C13574d.C13575a.f29662a;
    }
}
