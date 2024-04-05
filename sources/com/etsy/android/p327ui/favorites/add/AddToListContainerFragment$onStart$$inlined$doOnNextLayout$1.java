package com.etsy.android.p327ui.favorites.add;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListContainerFragment$onStart$$inlined$doOnNextLayout$1 */
public final class AddToListContainerFragment$onStart$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ AddToListContainerFragment this$0;

    public AddToListContainerFragment$onStart$$inlined$doOnNextLayout$1(AddToListContainerFragment addToListContainerFragment) {
        this.this$0 = addToListContainerFragment;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        AddToListContainerFragment addToListContainerFragment = this.this$0;
        Dialog dialog = addToListContainerFragment.getDialog();
        C19383o.m32795e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        addToListContainerFragment.makePeekHeightOneThird((BottomSheetDialog) dialog);
    }
}
