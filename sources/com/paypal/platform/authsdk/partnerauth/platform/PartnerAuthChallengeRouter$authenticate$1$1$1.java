package com.paypal.platform.authsdk.partnerauth.platform;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter$authenticate$1$1$1", mo70541f = "PartnerAuthChallengeRouter.kt", mo70542l = {69, 69}, mo70543m = "invokeSuspend")
public final class PartnerAuthChallengeRouter$authenticate$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C17163a $loginRequest;
    public final /* synthetic */ String $publicCredential;
    public Object L$0;
    public int label;
    public final /* synthetic */ PartnerAuthChallengeRouter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PartnerAuthChallengeRouter$authenticate$1$1$1(PartnerAuthChallengeRouter partnerAuthChallengeRouter, C17163a aVar, String str, C19340c<? super PartnerAuthChallengeRouter$authenticate$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = partnerAuthChallengeRouter;
        this.$loginRequest = aVar;
        this.$publicCredential = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PartnerAuthChallengeRouter$authenticate$1$1$1(this.this$0, this.$loginRequest, this.$publicCredential, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PartnerAuthChallengeRouter$authenticate$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        PartnerAuthChallengeRouter partnerAuthChallengeRouter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            partnerAuthChallengeRouter = this.this$0;
            PartnerAuthEngine partnerAuthEngine = partnerAuthChallengeRouter.f37640a;
            C17163a aVar = this.$loginRequest;
            String str = this.$publicCredential;
            C19383o.m32797g(aVar, "<this>");
            Challenge splitLogin = aVar.f37647a.getAuthState() == AuthenticationState.LoggedIn ? new Challenge.SplitLogin(aVar.f37649c, str) : new Challenge.PartnerAuthLLS(aVar.f37649c, str);
            this.L$0 = partnerAuthChallengeRouter;
            this.label = 1;
            obj = partnerAuthEngine.mo62605a(splitLogin, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            partnerAuthChallengeRouter = (PartnerAuthChallengeRouter) this.L$0;
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.L$0 = null;
        this.label = 2;
        if (partnerAuthChallengeRouter.mo62603d((ChallengeResult) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C19394m.f43287a;
    }
}
