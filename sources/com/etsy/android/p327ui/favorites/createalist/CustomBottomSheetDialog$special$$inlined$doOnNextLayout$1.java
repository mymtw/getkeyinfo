package com.etsy.android.p327ui.favorites.createalist;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.CustomBottomSheetDialog$special$$inlined$doOnNextLayout$1 */
public final class CustomBottomSheetDialog$special$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ CustomBottomSheetDialog this$0;

    public CustomBottomSheetDialog$special$$inlined$doOnNextLayout$1(CustomBottomSheetDialog customBottomSheetDialog) {
        this.this$0 = customBottomSheetDialog;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        this.this$0.getBehavior().setExpandedOffset(rect.top);
    }
}
