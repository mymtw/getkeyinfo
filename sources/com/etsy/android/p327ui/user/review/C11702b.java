package com.etsy.android.p327ui.user.review;

import android.view.View;

/* renamed from: com.etsy.android.ui.user.review.b */
public final /* synthetic */ class C11702b implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ CreateReviewActivity f26051b;

    public /* synthetic */ C11702b(CreateReviewActivity createReviewActivity) {
        this.f26051b = createReviewActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        CreateReviewActivity.m35086showSubratingsStep$lambda26$lambda24(this.f26051b, view, z);
    }
}
