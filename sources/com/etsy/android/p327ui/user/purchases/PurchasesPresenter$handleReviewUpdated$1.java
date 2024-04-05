package com.etsy.android.p327ui.user.purchases;

import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.FragmentActivity;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.rx2.C19788a;
import p143i9.C7003e;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.user.purchases.PurchasesPresenter$handleReviewUpdated$1", mo70541f = "PurchasesPresenter.kt", mo70542l = {293}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.purchases.PurchasesPresenter$handleReviewUpdated$1 */
final class PurchasesPresenter$handleReviewUpdated$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ C7003e $reviewPrompt;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesPresenter$handleReviewUpdated$1(C7003e eVar, FragmentActivity fragmentActivity, C19340c<? super PurchasesPresenter$handleReviewUpdated$1> cVar) {
        super(2, cVar);
        this.$reviewPrompt = eVar;
        this.$activity = fragmentActivity;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PurchasesPresenter$handleReviewUpdated$1(this.$reviewPrompt, this.$activity, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PurchasesPresenter$handleReviewUpdated$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SingleCreate a = this.$reviewPrompt.mo19183a(this.$activity);
            this.label = 1;
            C19753l lVar = new C19753l(1, C19388s.m32873m0(this));
            lVar.mo72548n();
            a.mo20655a(new C19788a(lVar));
            if (lVar.mo72547l() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
