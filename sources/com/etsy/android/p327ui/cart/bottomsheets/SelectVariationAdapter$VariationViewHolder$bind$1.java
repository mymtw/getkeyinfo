package com.etsy.android.p327ui.cart.bottomsheets;

import android.view.View;
import com.etsy.android.lib.models.apiv3.OfferingOption;
import com.etsy.android.p327ui.cart.bottomsheets.C9254a;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationAdapter$VariationViewHolder$bind$1 */
final class SelectVariationAdapter$VariationViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ OfferingOption $option;
    public final /* synthetic */ C9254a.C9255a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectVariationAdapter$VariationViewHolder$bind$1(C9254a.C9255a aVar, OfferingOption offeringOption) {
        super(1);
        this.this$0 = aVar;
        this.$option = offeringOption;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20441b.invoke(this.$option);
    }
}
