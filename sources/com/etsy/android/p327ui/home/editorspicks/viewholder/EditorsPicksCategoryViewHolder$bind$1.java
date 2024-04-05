package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import com.etsy.android.lib.models.finds.FindsSearchCategory;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.EditorsPicksCategoryViewHolder$bind$1 */
final class EditorsPicksCategoryViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FindsSearchCategory $category;
    public final /* synthetic */ C9942a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksCategoryViewHolder$bind$1(C9942a aVar, FindsSearchCategory findsSearchCategory) {
        super(1);
        this.this$0 = aVar;
        this.$category = findsSearchCategory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f21912c.mo31328c(this.$category.getUrl());
    }
}
