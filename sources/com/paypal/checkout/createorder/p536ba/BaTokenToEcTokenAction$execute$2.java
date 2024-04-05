package com.paypal.checkout.createorder.p536ba;

import androidx.compose.foundation.layout.C0761x;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.services.ApiErrorException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C19928a0;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.createorder.ba.BaTokenToEcTokenAction$execute$2", mo70541f = "BaTokenToEcTokenAction.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenAction$execute$2 */
public final class BaTokenToEcTokenAction$execute$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {
    public final /* synthetic */ String $baToken;
    public int label;
    public final /* synthetic */ BaTokenToEcTokenAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaTokenToEcTokenAction$execute$2(BaTokenToEcTokenAction baTokenToEcTokenAction, String str, C19340c<? super BaTokenToEcTokenAction$execute$2> cVar) {
        super(2, cVar);
        this.this$0 = baTokenToEcTokenAction;
        this.$baToken = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new BaTokenToEcTokenAction$execute$2(this.this$0, this.$baToken, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
        return ((BaTokenToEcTokenAction$execute$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C20018z e = ((C19971e) this.this$0.okHttpClient.mo20743a(this.this$0.baTokenToEcTokenRequestFactory.create$pyplcheckout_externalThreedsRelease(this.$baToken))).mo72859e();
            if (e.mo73006d()) {
                C16708i access$getGson$p = this.this$0.gson;
                C19928a0 a0Var = e.f44368i;
                return ((BaTokenToEcTokenResponse) access$getGson$p.mo59458e(BaTokenToEcTokenResponse.class, a0Var == null ? null : a0Var.mo72844g())).getData().getToken();
            }
            throw new ApiErrorException("BA token to EC token API was not successful");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
