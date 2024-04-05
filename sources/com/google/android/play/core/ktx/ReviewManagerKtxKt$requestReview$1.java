package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.review.C15734a;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", mo70541f = "ReviewManagerKtx.kt", mo70542l = {17}, mo70543m = "requestReview")
final class ReviewManagerKtxKt$requestReview$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ReviewManagerKtxKt$requestReview$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ReviewManagerKtxKt$requestReview$1 reviewManagerKtxKt$requestReview$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            reviewManagerKtxKt$requestReview$1 = this;
        } else {
            reviewManagerKtxKt$requestReview$1 = new ReviewManagerKtxKt$requestReview$1(this);
        }
        Object obj2 = reviewManagerKtxKt$requestReview$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewManagerKtxKt$requestReview$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C15734a aVar = (C15734a) reviewManagerKtxKt$requestReview$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(requestReviewFlow())");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
