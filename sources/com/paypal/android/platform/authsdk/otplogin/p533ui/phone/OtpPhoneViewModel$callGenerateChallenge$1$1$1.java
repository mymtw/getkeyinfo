package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewState;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManagerKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$1$1", mo70541f = "OtpPhoneViewModel.kt", mo70542l = {387, 393}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$1$1 */
public final class OtpPhoneViewModel$callGenerateChallenge$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ OtpPhoneViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneViewModel$callGenerateChallenge$1$1$1(OtpPhoneViewModel otpPhoneViewModel, String str, C19340c<? super OtpPhoneViewModel$callGenerateChallenge$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneViewModel;
        this.$it = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneViewModel$callGenerateChallenge$1$1$1(this.this$0, this.$it, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneViewModel$callGenerateChallenge$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getAnalyticsEventsChannel$p = this.this$0.analyticsEventsChannel;
            OTPLoginEvent.Failed failed = new OTPLoginEvent.Failed(OTPLoginAnalyticsManagerKt.EVENT_OTP_PHONE_PAGE_GET_OTP, this.$it);
            this.label = 1;
            if (access$getAnalyticsEventsChannel$p.mo72188E(failed, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C19499d access$getViewStateChannel$p = this.this$0.viewStateChannel;
        OtpPhoneViewState.AlternateLogin alternateLogin = new OtpPhoneViewState.AlternateLogin(true);
        this.label = 2;
        if (access$getViewStateChannel$p.mo72188E(alternateLogin, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C19394m.f43287a;
    }
}
