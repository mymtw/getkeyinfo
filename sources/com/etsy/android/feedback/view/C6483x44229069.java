package com.etsy.android.feedback.view;

import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.feedback.view.ReviewsSortFilterHeader$updateRemovableRatingFilter$lambda-2$$inlined$doOnLayout$1 */
public final class C6483x44229069 implements View.OnLayoutChangeListener {
    public final /* synthetic */ HorizontalScrollView $sortFilterList$inlined;

    public C6483x44229069(HorizontalScrollView horizontalScrollView) {
        this.$sortFilterList$inlined = horizontalScrollView;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.$sortFilterList$inlined.fullScroll(66);
    }
}
