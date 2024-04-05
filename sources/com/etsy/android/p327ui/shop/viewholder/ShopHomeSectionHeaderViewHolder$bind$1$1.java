package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.models.ShopSection;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopHomeSectionHeaderViewHolder$bind$1$1 */
final class ShopHomeSectionHeaderViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ String $sectionTitle;
    public final /* synthetic */ ShopSection $shopSection;
    public final /* synthetic */ C11300w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopHomeSectionHeaderViewHolder$bind$1$1(C11300w wVar, ShopSection shopSection, String str) {
        super(1);
        this.this$0 = wVar;
        this.$shopSection = shopSection;
        this.$sectionTitle = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24944c.mo36804b(this.$shopSection.getListingActiveCount(), this.$shopSection.getShopSectionId().getId(), this.$sectionTitle);
    }
}
