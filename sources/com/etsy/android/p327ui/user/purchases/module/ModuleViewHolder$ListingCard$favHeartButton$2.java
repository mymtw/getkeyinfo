package com.etsy.android.p327ui.user.purchases.module;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$ListingCard$favHeartButton$2 */
public final class ModuleViewHolder$ListingCard$favHeartButton$2 extends Lambda implements C19846a<FavHeartButton> {
    public final /* synthetic */ MaterialCardView $root;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder$ListingCard$favHeartButton$2(MaterialCardView materialCardView) {
        super(0);
        this.$root = materialCardView;
    }

    public final FavHeartButton invoke() {
        return (FavHeartButton) this.$root.findViewById(R.id.module_fav_button);
    }
}
