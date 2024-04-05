package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19747k;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$result$1$1", mo70541f = "CaptchaChallengeHandler.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$result$1$1 */
public final class CaptchaChallengeHandler$observeChallengeResult$result$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19747k<Result> $cancellableContinuation;
    public final /* synthetic */ C2895z<Result> $challengeResultLiveData;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeHandler$observeChallengeResult$result$1$1(C2895z<Result> zVar, C19747k<? super Result> kVar, C19340c<? super CaptchaChallengeHandler$observeChallengeResult$result$1$1> cVar) {
        super(2, cVar);
        this.$challengeResultLiveData = zVar;
        this.$cancellableContinuation = kVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CaptchaChallengeHandler$observeChallengeResult$result$1$1(this.$challengeResultLiveData, this.$cancellableContinuation, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CaptchaChallengeHandler$observeChallengeResult$result$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C2895z<Result> zVar = this.$challengeResultLiveData;
            final C19747k<Result> kVar = this.$cancellableContinuation;
            zVar.observeForever(new C2843a0() {
                public final void onChanged(Result result) {
                    if (!kVar.mo72498f()) {
                        C19747k<Result> kVar = kVar;
                        C19383o.m32796f(result, "challengeResult");
                        kVar.mo72503v(C170731.INSTANCE, result);
                    }
                }
            });
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
