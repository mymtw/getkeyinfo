package com.etsy.android.p327ui.shop.tabs;

import androidx.compose.foundation.layout.C0761x;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$1$1$1$emit$2", mo70541f = "ShopFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment$onViewCreated$1$1$1$emit$2 */
final class ShopFragment$onViewCreated$1$1$1$emit$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ List<C11219f> $sideEffects;
    public int label;
    public final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$1$1$1$emit$2(List<? extends C11219f> list, ShopFragment shopFragment, C19340c<? super ShopFragment$onViewCreated$1$1$1$emit$2> cVar) {
        super(2, cVar);
        this.$sideEffects = list;
        this.this$0 = shopFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ShopFragment$onViewCreated$1$1$1$emit$2(this.$sideEffects, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ShopFragment$onViewCreated$1$1$1$emit$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C11219f fVar = (C11219f) C19327t.m32640V0(this.$sideEffects);
            if (fVar != null) {
                this.this$0.handleSideEffect(fVar);
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
