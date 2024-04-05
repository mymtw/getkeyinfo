package com.etsy.android.p327ui.shop.tabs;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2$1$1$emit$2", mo70541f = "ShopFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$2$1$1$emit$2 */
final class ShopFragment$onViewCreated$2$1$1$emit$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C11224i $viewState;
    public int label;
    public final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$2$1$1$emit$2(ShopFragment shopFragment, C11224i iVar, C19340c<? super ShopFragment$onViewCreated$2$1$1$emit$2> cVar) {
        super(2, cVar);
        this.this$0 = shopFragment;
        this.$viewState = iVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ShopFragment$onViewCreated$2$1$1$emit$2(this.this$0, this.$viewState, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ShopFragment$onViewCreated$2$1$1$emit$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleViewState(this.$viewState);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
