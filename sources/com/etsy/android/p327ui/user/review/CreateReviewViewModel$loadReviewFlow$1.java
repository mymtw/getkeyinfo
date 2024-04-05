package com.etsy.android.p327ui.user.review;

import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.user.review.C11719r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$loadReviewFlow$1 */
final class CreateReviewViewModel$loadReviewFlow$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Integer $presetRating;
    public final /* synthetic */ boolean $showMultiReviewPrompt;
    public final /* synthetic */ String $transactionId;
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$loadReviewFlow$1(CreateReviewViewModel createReviewViewModel, String str, Integer num, boolean z) {
        super(1);
        this.this$0 = createReviewViewModel;
        this.$transactionId = str;
        this.$presetRating = num;
        this.$showMultiReviewPrompt = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        CreateReviewViewModel createReviewViewModel = this.this$0;
        C2895z<C11719r> zVar = createReviewViewModel.f25930h;
        String c = createReviewViewModel.mo37845c((String) null, th);
        final CreateReviewViewModel createReviewViewModel2 = this.this$0;
        final String str = this.$transactionId;
        final Integer num = this.$presetRating;
        final boolean z = this.$showMultiReviewPrompt;
        zVar.setValue(new C11719r.C11726g(c, new C19846a<C19394m>() {
            public final void invoke() {
                createReviewViewModel2.mo37850i(num, str, z);
            }
        }));
    }
}
