package com.etsy.android.p327ui.user.review;

/* renamed from: com.etsy.android.ui.user.review.d */
public final /* synthetic */ class C11705d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f26052b;

    /* renamed from: c */
    public final /* synthetic */ CreateReviewActivity f26053c;

    public /* synthetic */ C11705d(CreateReviewActivity createReviewActivity, int i) {
        this.f26052b = i;
        this.f26053c = createReviewActivity;
    }

    public final void run() {
        switch (this.f26052b) {
            case 0:
                CreateReviewActivity.m35090showTooltipForNewVideoReviews$lambda47(this.f26053c);
                return;
            default:
                CreateReviewActivity.m35072hideKeyboardOnTouchOutsideTextInput$lambda29$lambda28(this.f26053c);
                return;
        }
    }
}
