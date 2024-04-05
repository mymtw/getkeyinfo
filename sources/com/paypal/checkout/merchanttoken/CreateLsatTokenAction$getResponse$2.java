package com.paypal.checkout.merchanttoken;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.merchanttoken.CreateLsatTokenAction$getResponse$2", mo70541f = "CreateLsatTokenAction.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class CreateLsatTokenAction$getResponse$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C20018z>, Object> {
    public final /* synthetic */ C20011u $lsatRequest;
    public int label;
    public final /* synthetic */ CreateLsatTokenAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLsatTokenAction$getResponse$2(CreateLsatTokenAction createLsatTokenAction, C20011u uVar, C19340c<? super CreateLsatTokenAction$getResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = createLsatTokenAction;
        this.$lsatRequest = uVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CreateLsatTokenAction$getResponse$2(this.this$0, this.$lsatRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C20018z> cVar) {
        return ((CreateLsatTokenAction$getResponse$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return ((C19971e) this.this$0.okHttpClient.mo20743a(this.$lsatRequest)).mo72859e();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
