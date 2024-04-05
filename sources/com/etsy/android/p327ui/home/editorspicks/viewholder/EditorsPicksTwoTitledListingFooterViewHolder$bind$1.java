package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import com.etsy.android.lib.models.finds.FindsTwoTitledListingsModule;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.EditorsPicksTwoTitledListingFooterViewHolder$bind$1 */
final class EditorsPicksTwoTitledListingFooterViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FindsTwoTitledListingsModule.Footer $data;
    public final /* synthetic */ C9949h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksTwoTitledListingFooterViewHolder$bind$1(C9949h hVar, FindsTwoTitledListingsModule.Footer footer) {
        super(1);
        this.this$0 = hVar;
        this.$data = footer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f21936c.mo31328c(this.$data.getUrl());
    }
}
