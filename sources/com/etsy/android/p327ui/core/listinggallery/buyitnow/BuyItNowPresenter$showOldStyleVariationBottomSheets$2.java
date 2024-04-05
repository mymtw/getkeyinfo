package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$2 */
final class BuyItNowPresenter$showOldStyleVariationBottomSheets$2 extends Lambda implements C19857l<VariationValue, C19394m> {
    public final /* synthetic */ Variation $variation;
    public final /* synthetic */ C9665f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowPresenter$showOldStyleVariationBottomSheets$2(C9665f fVar, Variation variation) {
        super(1);
        this.this$0 = fVar;
        this.$variation = variation;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VariationValue) obj);
        return C19394m.f43287a;
    }

    public final void invoke(VariationValue variationValue) {
        C19383o.m32797g(variationValue, "selectedVariation");
        this.this$0.mo32380c();
        C9665f.m18002a(this.this$0);
        C9666g gVar = this.this$0.f21408h;
        if (gVar != null) {
            gVar.f21419l = C17782b.m29864d0(new Pair(this.$variation, variationValue));
            if (gVar.mo32384c()) {
                gVar.mo32385d();
            } else {
                gVar.mo32383b();
            }
        }
    }
}
