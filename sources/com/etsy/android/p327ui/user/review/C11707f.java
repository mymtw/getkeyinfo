package com.etsy.android.p327ui.user.review;

import android.content.DialogInterface;
import com.etsy.android.p327ui.user.review.C11719r;

/* renamed from: com.etsy.android.ui.user.review.f */
public final /* synthetic */ class C11707f implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CreateReviewActivity f26055b;

    /* renamed from: c */
    public final /* synthetic */ C11719r.C11737r f26056c;

    public /* synthetic */ C11707f(CreateReviewActivity createReviewActivity, C11719r.C11737r rVar) {
        this.f26055b = createReviewActivity;
        this.f26056c = rVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateReviewActivity.m35085showSubmitWarningPopup$lambda52(this.f26055b, this.f26056c, dialogInterface, i);
    }
}
