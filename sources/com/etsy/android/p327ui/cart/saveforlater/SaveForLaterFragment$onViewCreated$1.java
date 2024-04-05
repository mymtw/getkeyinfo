package com.etsy.android.p327ui.cart.saveforlater;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.cart.saveforlater.SaveForLaterFragment$onViewCreated$1", mo70541f = "SaveForLaterFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterFragment$onViewCreated$1 */
public final class SaveForLaterFragment$onViewCreated$1 extends SuspendLambda implements C19861p<C9360e, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SaveForLaterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveForLaterFragment$onViewCreated$1(SaveForLaterFragment saveForLaterFragment, C19340c<? super SaveForLaterFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = saveForLaterFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SaveForLaterFragment$onViewCreated$1 saveForLaterFragment$onViewCreated$1 = new SaveForLaterFragment$onViewCreated$1(this.this$0, cVar);
        saveForLaterFragment$onViewCreated$1.L$0 = obj;
        return saveForLaterFragment$onViewCreated$1;
    }

    public final Object invoke(C9360e eVar, C19340c<? super C19394m> cVar) {
        return ((SaveForLaterFragment$onViewCreated$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C9360e) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
