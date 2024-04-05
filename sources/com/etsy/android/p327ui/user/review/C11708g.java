package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.etsy.android.ui.user.review.g */
public final /* synthetic */ class C11708g implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCardView f26057a;

    /* renamed from: b */
    public final /* synthetic */ int f26058b;

    public /* synthetic */ C11708g(MaterialCardView materialCardView, int i) {
        this.f26057a = materialCardView;
        this.f26058b = i;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        CreateReviewActivity.m35079onCreate$lambda7(this.f26057a, this.f26058b, view, i, i2, i3, i4);
    }
}
