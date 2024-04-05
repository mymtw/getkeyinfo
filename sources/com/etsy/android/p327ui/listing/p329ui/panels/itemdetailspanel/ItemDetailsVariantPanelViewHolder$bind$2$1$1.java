package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.content.Context;
import com.etsy.android.stylekit.views.CollageContentToggleShort;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsVariantPanelViewHolder$bind$2$1$1 */
public final class ItemDetailsVariantPanelViewHolder$bind$2$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ CollageContentToggleShort $this_apply;
    public final /* synthetic */ ItemDetailsVariantPanelViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDetailsVariantPanelViewHolder$bind$2$1$1(CollageContentToggleShort collageContentToggleShort, ItemDetailsVariantPanelViewHolder itemDetailsVariantPanelViewHolder) {
        super(0);
        this.$this_apply = collageContentToggleShort;
        this.this$0 = itemDetailsVariantPanelViewHolder;
    }

    public final void invoke() {
        this.$this_apply.setClickable(true);
        this.$this_apply.setFocusable(true);
        ItemDetailsVariantPanelViewHolder itemDetailsVariantPanelViewHolder = this.this$0;
        itemDetailsVariantPanelViewHolder.f23045k = true;
        Context context = itemDetailsVariantPanelViewHolder.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        EtsyLinkify.m19612f(context, this.this$0.f23041g, false, (C19846a) null, 28);
    }
}
