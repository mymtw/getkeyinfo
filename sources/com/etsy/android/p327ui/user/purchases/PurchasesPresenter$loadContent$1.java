package com.etsy.android.p327ui.user.purchases;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.user.purchases.C11644f;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.user.purchases.PurchasesPresenter$loadContent$1", mo70541f = "PurchasesPresenter.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.purchases.PurchasesPresenter$loadContent$1 */
final class PurchasesPresenter$loadContent$1 extends SuspendLambda implements C19861p<C11644f, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C11672r this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesPresenter$loadContent$1(C11672r rVar, C19340c<? super PurchasesPresenter$loadContent$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PurchasesPresenter$loadContent$1 purchasesPresenter$loadContent$1 = new PurchasesPresenter$loadContent$1(this.this$0, cVar);
        purchasesPresenter$loadContent$1.L$0 = obj;
        return purchasesPresenter$loadContent$1;
    }

    public final Object invoke(C11644f fVar, C19340c<? super C19394m> cVar) {
        return ((PurchasesPresenter$loadContent$1) create(fVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C11644f fVar = (C11644f) this.L$0;
            if (fVar instanceof C11644f.C11648d) {
                this.this$0.f25838a.setLoading(true);
            } else if (fVar instanceof C11644f.C11647c) {
                C11644f.C11647c cVar = (C11644f.C11647c) fVar;
                this.this$0.f25838a.setPurchaseListItems(cVar.f25771b, cVar.f25770a);
            } else if (fVar instanceof C11644f.C11645a) {
                this.this$0.f25838a.showEmptyView();
            } else if (fVar instanceof C11644f.C11646b) {
                this.this$0.f25838a.onLoadFailure();
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
