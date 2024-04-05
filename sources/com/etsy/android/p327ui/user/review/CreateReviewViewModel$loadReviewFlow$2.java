package com.etsy.android.p327ui.user.review;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$loadReviewFlow$2 */
final class CreateReviewViewModel$loadReviewFlow$2 extends Lambda implements C19857l<ReviewFlow, C19394m> {
    public final /* synthetic */ Integer $presetRating;
    public final /* synthetic */ boolean $showMultiReviewPrompt;
    public final /* synthetic */ String $transactionId;
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$loadReviewFlow$2(CreateReviewViewModel createReviewViewModel, String str, Integer num, boolean z) {
        super(1);
        this.this$0 = createReviewViewModel;
        this.$transactionId = str;
        this.$presetRating = num;
        this.$showMultiReviewPrompt = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReviewFlow) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ReviewFlow reviewFlow) {
        CreateReviewViewModel createReviewViewModel = this.this$0;
        C19383o.m32796f(reviewFlow, "result");
        createReviewViewModel.f25946x = reviewFlow;
        CreateReviewViewModel createReviewViewModel2 = this.this$0;
        ReviewFlow reviewFlow2 = createReviewViewModel2.f25946x;
        if (reviewFlow2 != null) {
            reviewFlow2.f25980a.f26038d = this.$transactionId;
            createReviewViewModel2.getClass();
            boolean z = true;
            List e0 = C17782b.m29865e0(1, 2, 3);
            ReviewFlow reviewFlow3 = createReviewViewModel2.f25946x;
            if (reviewFlow3 != null) {
                for (ReviewFlowScenario reviewFlowScenario : reviewFlow3.f25980a.f26036b) {
                    if (C19383o.m32792b(reviewFlowScenario.f26015a, e0)) {
                        List e02 = C17782b.m29865e0(4, 5);
                        ReviewFlow reviewFlow4 = createReviewViewModel2.f25946x;
                        if (reviewFlow4 != null) {
                            for (ReviewFlowScenario reviewFlowScenario2 : reviewFlow4.f25980a.f26036b) {
                                if (C19383o.m32792b(reviewFlowScenario2.f26015a, e02)) {
                                    if (!(reviewFlowScenario.f26016b.size() == 3 && reviewFlowScenario.f26016b.get(2).f25988b == ReviewCardTypeId.PHOTO_UPLOAD_LOW_RATING.getId() && reviewFlowScenario2.f26016b.size() == 3 && reviewFlowScenario2.f26016b.get(2).f25988b == ReviewCardTypeId.PHOTO_UPLOAD_WITH_ICONS.getId())) {
                                        z = false;
                                    }
                                    createReviewViewModel2.f25919K = Boolean.valueOf(z);
                                    CreateReviewViewModel createReviewViewModel3 = this.this$0;
                                    createReviewViewModel3.f25932j.postValue(Boolean.valueOf(C19383o.m32792b(createReviewViewModel3.f25919K, Boolean.TRUE)));
                                    this.this$0.mo37859r(this.$presetRating, this.$showMultiReviewPrompt, false);
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        C19383o.m32805o("reviewFlowModel");
                        throw null;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
        C19383o.m32805o("reviewFlowModel");
        throw null;
    }
}
