package com.etsy.android.feedback;

import androidx.lifecycle.C2895z;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ReceiptReviewV3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p321cc.C8569c;

/* renamed from: com.etsy.android.feedback.e */
public final /* synthetic */ class C6460e implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ FeedbackViewModel f14323b;

    /* renamed from: c */
    public final /* synthetic */ String f14324c;

    /* renamed from: d */
    public final /* synthetic */ String f14325d;

    public /* synthetic */ C6460e(FeedbackViewModel feedbackViewModel, String str, String str2) {
        this.f14323b = feedbackViewModel;
        this.f14324c = str;
        this.f14325d = str2;
    }

    public final void accept(Object obj) {
        FeedbackViewModel feedbackViewModel = this.f14323b;
        String str = this.f14324c;
        String str2 = this.f14325d;
        C8569c.C8573b bVar = (C8569c.C8573b) obj;
        C19383o.m32797g(feedbackViewModel, "this$0");
        if (bVar instanceof C8569c.C8573b.C8575b) {
            ReceiptReviewV3 receiptReviewV3 = ((C8569c.C8573b.C8575b) bVar).f18663a;
            List<ReceiptReview> reviews = receiptReviewV3.getReviews();
            C19383o.m32796f(reviews, "receiptReview.reviews");
            ArrayList d = FeedbackViewModel.m12874d(str, str2, reviews);
            C2895z<FeedbackViewModel.C6440b> zVar = feedbackViewModel.f14275m;
            Integer num = feedbackViewModel.f14264b.f14338j;
            C19383o.m32794d(num);
            zVar.postValue(new FeedbackViewModel.C6440b.C6443c(d, num.intValue(), receiptReviewV3.getFilterCount(), receiptReviewV3.getRatingsPercents()));
            feedbackViewModel.mo18350j();
        } else if (bVar instanceof C8569c.C8573b.C8574a) {
            feedbackViewModel.f14275m.postValue(FeedbackViewModel.C6440b.C6441a.f14291a);
        }
    }
}
