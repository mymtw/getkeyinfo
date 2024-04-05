package com.etsy.android.p327ui.user.review;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.review.e */
public final /* synthetic */ class C11706e implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CreateReviewActivity f26054b;

    public /* synthetic */ C11706e(CreateReviewActivity createReviewActivity) {
        this.f26054b = createReviewActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateReviewActivity.m35091showVideoTooLongDialog$lambda48(this.f26054b, dialogInterface, i);
    }
}
