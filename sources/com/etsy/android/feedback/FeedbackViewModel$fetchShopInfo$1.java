package com.etsy.android.feedback;

import com.etsy.android.feedback.FeedbackViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FeedbackViewModel$fetchShopInfo$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FeedbackViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$fetchShopInfo$1(FeedbackViewModel feedbackViewModel) {
        super(1);
        this.this$0 = feedbackViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f14275m.postValue(FeedbackViewModel.C6440b.C6442b.f14292a);
    }
}
