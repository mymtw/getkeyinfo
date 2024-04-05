package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateNewCollectionButton$addButtonAsHeader$$inlined$doOnNextLayout$1 */
public final class C9797xf28f024f implements View.OnLayoutChangeListener {
    public final /* synthetic */ View $viewToAdjust$inlined;

    public C9797xf28f024f(View view) {
        this.$viewToAdjust$inlined = view;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        ViewGroup.LayoutParams layoutParams = this.$viewToAdjust$inlined.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = view.getMeasuredHeight();
    }
}
