package com.etsy.android.p327ui.favorites.editlist;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionBottomSheetFragment$onViewCreated$2 */
public final class EditCollectionBottomSheetFragment$onViewCreated$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EditCollectionBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCollectionBottomSheetFragment$onViewCreated$2(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        super(1);
        this.this$0 = editCollectionBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        EditCollectionViewModel access$getViewModel$p = this.this$0.viewModel;
        if (access$getViewModel$p != null) {
            access$getViewModel$p.mo32892b(this.this$0.getUpdateCollectionSpec());
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }
}
