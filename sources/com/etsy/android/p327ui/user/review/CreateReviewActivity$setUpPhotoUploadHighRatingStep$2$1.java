package com.etsy.android.p327ui.user.review;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$2$1 */
public final class CreateReviewActivity$setUpPhotoUploadHighRatingStep$2$1 extends Lambda implements C19857l<String, Drawable> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$setUpPhotoUploadHighRatingStep$2$1(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public final Drawable invoke(String str) {
        C19383o.m32797g(str, "it");
        return this.this$0.getDisplayIconDrawable(str);
    }
}
