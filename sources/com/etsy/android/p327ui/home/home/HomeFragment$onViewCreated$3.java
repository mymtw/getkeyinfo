package com.etsy.android.p327ui.home.home;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.home.home.HomeFragment$onViewCreated$3", mo70541f = "HomeFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.home.home.HomeFragment$onViewCreated$3 */
public final class HomeFragment$onViewCreated$3 extends SuspendLambda implements C19861p<C10001h, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$3(HomeFragment homeFragment, C19340c<? super HomeFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.this$0 = homeFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        HomeFragment$onViewCreated$3 homeFragment$onViewCreated$3 = new HomeFragment$onViewCreated$3(this.this$0, cVar);
        homeFragment$onViewCreated$3.L$0 = obj;
        return homeFragment$onViewCreated$3;
    }

    public final Object invoke(C10001h hVar, C19340c<? super C19394m> cVar) {
        return ((HomeFragment$onViewCreated$3) create(hVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C10001h) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
