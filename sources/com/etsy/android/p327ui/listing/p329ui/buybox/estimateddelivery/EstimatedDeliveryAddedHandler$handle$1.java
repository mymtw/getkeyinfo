package com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.estimateddelivery.EstimatedDeliveryAddedHandler$handle$1 */
final class EstimatedDeliveryAddedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13620d0 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EstimatedDeliveryAddedHandler$handle$1(C13597g.C13620d0 d0Var) {
        super(1);
        this.$event = d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        gVar.f22866g = this.$event.f30095a;
    }
}
