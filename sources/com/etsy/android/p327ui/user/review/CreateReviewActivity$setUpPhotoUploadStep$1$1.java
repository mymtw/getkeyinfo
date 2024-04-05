package com.etsy.android.p327ui.user.review;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadStep$1$1 */
public final class CreateReviewActivity$setUpPhotoUploadStep$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CreateReviewActivity $activity;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$setUpPhotoUploadStep$1$1(CreateReviewActivity createReviewActivity, CreateReviewActivity createReviewActivity2) {
        super(1);
        this.this$0 = createReviewActivity;
        this.$activity = createReviewActivity2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CreateReviewViewModel viewModel = this.this$0.getViewModel();
        MediaUploadAction mediaUploadAction = MediaUploadAction.TAKE_PHOTO;
        viewModel.getClass();
        C19383o.m32797g(mediaUploadAction, "<set-?>");
        viewModel.f25923O = mediaUploadAction;
        this.this$0.getCameraHelper().mo30474a(this.$activity);
    }
}
