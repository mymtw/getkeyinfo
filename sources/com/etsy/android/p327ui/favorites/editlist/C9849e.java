package com.etsy.android.p327ui.favorites.editlist;

import android.view.View;
import com.etsy.android.p327ui.favorites.C9743a0;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.editlist.e */
public final /* synthetic */ class C9849e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ EditCollectionBottomSheetFragment f21750b;

    public /* synthetic */ C9849e(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        this.f21750b = editCollectionBottomSheetFragment;
    }

    public final void onClick(View view) {
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment = this.f21750b;
        C19383o.m32797g(editCollectionBottomSheetFragment, "this$0");
        C9743a0 access$getUpdateCollectionSpec = editCollectionBottomSheetFragment.getUpdateCollectionSpec();
        CollageTextInput access$getEditNameDialog$p = editCollectionBottomSheetFragment.editNameDialog;
        if (access$getEditNameDialog$p != null) {
            access$getUpdateCollectionSpec.f21540b = access$getEditNameDialog$p.getText();
            EditCollectionViewModel access$getViewModel$p = editCollectionBottomSheetFragment.viewModel;
            if (access$getViewModel$p != null) {
                access$getViewModel$p.mo32892b(editCollectionBottomSheetFragment.getUpdateCollectionSpec());
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        } else {
            C19383o.m32805o("editNameDialog");
            throw null;
        }
    }
}
