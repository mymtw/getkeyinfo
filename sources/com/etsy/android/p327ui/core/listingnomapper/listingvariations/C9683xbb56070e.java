package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.view.View;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9687c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.ListingVariationSheetOptionsAdapter$OldVariationOptionsViewHolder$bind$1 */
final class C9683xbb56070e extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9687c $adapter;
    public final /* synthetic */ VariationValue $variation;
    public final /* synthetic */ C9687c this$0;
    public final /* synthetic */ C9687c.C9688a this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9683xbb56070e(VariationValue variationValue, C9687c cVar, C9687c.C9688a aVar, C9687c cVar2) {
        super(1);
        this.$variation = variationValue;
        this.this$0 = cVar;
        this.this$1 = aVar;
        this.$adapter = cVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        VariationValue variationValue = this.$variation;
        if (variationValue != null) {
            C9687c cVar = this.this$0;
            C9687c.C9688a aVar = this.this$1;
            C9696j jVar = cVar.f21452c;
            if (jVar != null) {
                jVar.mo32395a(variationValue, aVar.getBindingAdapterPosition());
            }
        }
    }
}
