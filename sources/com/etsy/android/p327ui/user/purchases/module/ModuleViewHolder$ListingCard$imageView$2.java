package com.etsy.android.p327ui.user.purchases.module;

import android.widget.ImageView;
import com.etsy.android.R;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$ListingCard$imageView$2 */
public final class ModuleViewHolder$ListingCard$imageView$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ MaterialCardView $root;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$ListingCard$imageView$2(MaterialCardView materialCardView) {
        super(0);
        this.$root = materialCardView;
    }

    public final ImageView invoke() {
        return (ImageView) this.$root.findViewById(R.id.minimal_image);
    }
}
