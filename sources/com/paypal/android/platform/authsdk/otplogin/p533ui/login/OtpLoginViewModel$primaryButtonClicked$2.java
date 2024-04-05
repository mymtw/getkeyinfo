package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$primaryButtonClicked$2", mo70541f = "OtpLoginViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$primaryButtonClicked$2 */
public final class OtpLoginViewModel$primaryButtonClicked$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginViewModel$primaryButtonClicked$2(OtpLoginViewModel otpLoginViewModel, C19340c<? super OtpLoginViewModel$primaryButtonClicked$2> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginViewModel$primaryButtonClicked$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpLoginViewModel$primaryButtonClicked$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            OtpLoginRepository access$getRepository$p = this.this$0.repository;
            if (access$getRepository$p != null) {
                OTPLoginData data = ((OtpLoginRepositoryImpl) access$getRepository$p).getData();
                AuthOptionChallengeData access$getAuthChallengeData$p = this.this$0.authChallengeData;
                data.setNonce(access$getAuthChallengeData$p == null ? null : access$getAuthChallengeData$p.getNonce());
                data.setChallengeId(this.this$0.getSelectedChallengeId());
                this.this$0.callGenerateChallenge(data);
                return C19394m.f43287a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
