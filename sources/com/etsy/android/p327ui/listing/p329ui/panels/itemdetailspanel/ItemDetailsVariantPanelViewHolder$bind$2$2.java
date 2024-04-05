package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsVariantPanelViewHolder$bind$2$2 */
public final class ItemDetailsVariantPanelViewHolder$bind$2$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10423j $uiModel;
    public final /* synthetic */ ItemDetailsVariantPanelViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDetailsVariantPanelViewHolder$bind$2$2(C10423j jVar, ItemDetailsVariantPanelViewHolder itemDetailsVariantPanelViewHolder) {
        super(1);
        this.$uiModel = jVar;
        this.this$0 = itemDetailsVariantPanelViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C10423j jVar = this.$uiModel;
        String str = ((ItemDetailsPanel) jVar).f23012d;
        if (str != null) {
            ItemDetailsPanel itemDetailsPanel = (ItemDetailsPanel) jVar;
            this.this$0.f23037c.mo38043a(new C13597g.C13762x2(itemDetailsPanel.f23013e, str, itemDetailsPanel.f23022n, itemDetailsPanel.mo34050b()));
        }
    }
}
