package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.FetchVariationOfferingHandler$handle$1 */
public final class FetchVariationOfferingHandler$handle$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FetchVariationOfferingHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchVariationOfferingHandler$handle$1(FetchVariationOfferingHandler fetchVariationOfferingHandler) {
        super(1);
        this.this$0 = fetchVariationOfferingHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f22691b.mo38043a(C13597g.C13656i1.f30148a);
        this.this$0.f22691b.mo38043a(new C13597g.C13599a0(th.getMessage()));
    }
}
