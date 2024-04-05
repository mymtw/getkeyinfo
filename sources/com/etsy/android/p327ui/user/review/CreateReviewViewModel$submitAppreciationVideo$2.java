package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.apiv3.AppreciationVideoResponse;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$submitAppreciationVideo$2 */
final class CreateReviewViewModel$submitAppreciationVideo$2 extends Lambda implements C19857l<C20145v<AppreciationVideoResponse>, C19394m> {
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$submitAppreciationVideo$2(CreateReviewViewModel createReviewViewModel) {
        super(1);
        this.this$0 = createReviewViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C20145v<AppreciationVideoResponse>) (C20145v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C20145v<AppreciationVideoResponse> vVar) {
        CreateReviewViewModel createReviewViewModel = this.this$0;
        AppreciationVideoResponse appreciationVideoResponse = (AppreciationVideoResponse) vVar.f44615b;
        createReviewViewModel.mo37863x(String.valueOf(appreciationVideoResponse != null ? Long.valueOf(appreciationVideoResponse.getVideoId()) : null));
    }
}
