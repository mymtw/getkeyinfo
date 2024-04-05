package com.etsy.android.p327ui.user.purchases.module;

import com.etsy.android.R;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$moduleListing2$2 */
public final class ModuleViewHolder$moduleListing2$2 extends Lambda implements C19846a<MaterialCardView> {
    public final /* synthetic */ ModuleViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$moduleListing2$2(ModuleViewHolder moduleViewHolder) {
        super(0);
        this.this$0 = moduleViewHolder;
    }

    public final MaterialCardView invoke() {
        return (MaterialCardView) this.this$0.itemView.findViewById(R.id.purchase_module_listing_2);
    }
}
