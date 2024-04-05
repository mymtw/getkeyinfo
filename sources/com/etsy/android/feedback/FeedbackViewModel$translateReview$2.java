package com.etsy.android.feedback;

import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.p327ui.shop.C11244u;
import java.util.Date;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FeedbackViewModel$translateReview$2 extends Lambda implements C19857l<C11244u, C19394m> {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ FeedbackViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$translateReview$2(ReviewUiModel reviewUiModel, FeedbackViewModel feedbackViewModel) {
        super(1);
        this.$review = reviewUiModel;
        this.this$0 = feedbackViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11244u) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11244u uVar) {
        C11244u uVar2 = uVar;
        if (uVar2 instanceof C11244u.C11246b) {
            this.$review.getTranslationState().setTranslated();
            this.this$0.f14275m.postValue(new FeedbackViewModel.C6440b.C6446f(ReviewUiModel.copy$default(this.$review, (Long) null, (String) null, (String) null, (String) null, (Date) null, (Float) null, (String) null, ((C11244u.C11246b) uVar2).f24826a.getTranslatedReview(), this.$review.getTranslationState(), (String) null, false, (AppreciationPhoto) null, (Video) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, 4193919, (Object) null)));
            return;
        }
        FeedbackViewModel.m12873b(this.this$0, this.$review);
    }
}
