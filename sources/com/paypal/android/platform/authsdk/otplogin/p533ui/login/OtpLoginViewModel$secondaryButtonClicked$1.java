package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginViewModel;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManagerKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$secondaryButtonClicked$1", mo70541f = "OtpLoginViewModel.kt", mo70542l = {266, 273}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$secondaryButtonClicked$1 */
public final class OtpLoginViewModel$secondaryButtonClicked$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginViewModel$secondaryButtonClicked$1(OtpLoginViewModel otpLoginViewModel, C19340c<? super OtpLoginViewModel$secondaryButtonClicked$1> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginViewModel$secondaryButtonClicked$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpLoginViewModel$secondaryButtonClicked$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getAnalyticsEventsChannel$p = this.this$0.analyticsEventsChannel;
            OTPLoginEvent.AlternativeLogin alternativeLogin = new OTPLoginEvent.AlternativeLogin(OTPLoginAnalyticsManagerKt.EVENT_OTP_PHONE_PAGE_ALTERNATE_LOGIN_CLICK, "use_password_instead");
            this.label = 1;
            if (access$getAnalyticsEventsChannel$p.mo72188E(alternativeLogin, this) == coroutineSingletons) {
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
        C19499d access$getEventsChannel$p = this.this$0.eventsChannel;
        OtpLoginViewModel.Event.FAILED failed = new OtpLoginViewModel.Event.FAILED(new Exception("triggeredWebAuth"));
        this.label = 2;
        if (access$getEventsChannel$p.mo72188E(failed, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C19394m.f43287a;
    }
}
