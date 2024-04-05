package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.view.View;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.VariationOptionsViewHolder$bind$1 */
final class VariationOptionsViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ AppsInventoryUiOption $option;
    public final /* synthetic */ C9693h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VariationOptionsViewHolder$bind$1(C9693h hVar, AppsInventoryUiOption appsInventoryUiOption) {
        super(1);
        this.this$0 = hVar;
        this.$option = appsInventoryUiOption;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9693h hVar = this.this$0;
        C9691f fVar = hVar.f21463b;
        if (fVar != null) {
            fVar.mo32393a(this.$option, hVar.getBindingAdapterPosition());
        }
    }
}
