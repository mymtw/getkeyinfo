package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$1 */
final class BuyItNowPresenter$showOldStyleVariationBottomSheets$1 extends Lambda implements C19857l<VariationValue, C19394m> {
    public final /* synthetic */ List<Pair<Variation, VariationValue>> $selectedVariations;
    public final /* synthetic */ Variation $variation1;
    public final /* synthetic */ Variation $variation2;
    public final /* synthetic */ List<Variation> $variations;
    public final /* synthetic */ C9665f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowPresenter$showOldStyleVariationBottomSheets$1(List<Pair<Variation, VariationValue>> list, Variation variation, C9665f fVar, Variation variation2, List<Variation> list2) {
        super(1);
        this.$selectedVariations = list;
        this.$variation1 = variation;
        this.this$0 = fVar;
        this.$variation2 = variation2;
        this.$variations = list2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VariationValue) obj);
        return C19394m.f43287a;
    }

    public final void invoke(VariationValue variationValue) {
        C19383o.m32797g(variationValue, "firstSelectedVariation");
        this.$selectedVariations.add(new Pair(this.$variation1, variationValue));
        C9665f.m18002a(this.this$0);
        final C9665f fVar = this.this$0;
        final Variation variation = this.$variation2;
        final List<Pair<Variation, VariationValue>> list = this.$selectedVariations;
        final List<Variation> list2 = this.$variations;
        fVar.mo32382e(variation, new C19857l<VariationValue, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VariationValue) obj);
                return C19394m.f43287a;
            }

            public final void invoke(VariationValue variationValue) {
                C9666g gVar;
                C19383o.m32797g(variationValue, "secondSelectedVariation");
                fVar.mo32380c();
                list.add(new Pair(variation, variationValue));
                C9665f.m18002a(fVar);
                if (list.size() == list2.size() && (gVar = fVar.f21408h) != null) {
                    List<Pair<Variation, VariationValue>> list = list;
                    C19383o.m32797g(list, "selectedVariations");
                    gVar.f21419l = list;
                    if (gVar.mo32384c()) {
                        gVar.mo32385d();
                    } else {
                        gVar.mo32383b();
                    }
                }
            }
        });
    }
}
