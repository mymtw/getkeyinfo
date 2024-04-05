package com.etsy.android.p327ui.user.purchases;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "com.etsy.android.ui.user.purchases.PurchasesPresenter$loadContent$2", mo70541f = "PurchasesPresenter.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.purchases.PurchasesPresenter$loadContent$2 */
final class PurchasesPresenter$loadContent$2 extends SuspendLambda implements C19862q<C19600e<? super C11644f>, Throwable, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public PurchasesPresenter$loadContent$2(C19340c<? super PurchasesPresenter$loadContent$2> cVar) {
        super(3, cVar);
    }

    public final Object invoke(C19600e<? super C11644f> eVar, Throwable th, C19340c<? super C19394m> cVar) {
        PurchasesPresenter$loadContent$2 purchasesPresenter$loadContent$2 = new PurchasesPresenter$loadContent$2(cVar);
        purchasesPresenter$loadContent$2.L$0 = th;
        return purchasesPresenter$loadContent$2.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            LogCatKt.m17045a().error((Throwable) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
