package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManagerKt;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$getCodeButtonPressed$2", mo70541f = "OtpPhoneViewModel.kt", mo70542l = {364}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$getCodeButtonPressed$2 */
public final class OtpPhoneViewModel$getCodeButtonPressed$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OtpPhoneViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneViewModel$getCodeButtonPressed$2(OtpPhoneViewModel otpPhoneViewModel, C19340c<? super OtpPhoneViewModel$getCodeButtonPressed$2> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneViewModel$getCodeButtonPressed$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneViewModel$getCodeButtonPressed$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getAnalyticsEventsChannel$p = this.this$0.analyticsEventsChannel;
            OTPLoginEvent.GetNewCodeClicked getNewCodeClicked = new OTPLoginEvent.GetNewCodeClicked(OTPLoginAnalyticsManagerKt.EVENT_OTP_LOGIN_PAGE_GET_NEW_CODE_BUTTON_CLICK);
            this.label = 1;
            if (access$getAnalyticsEventsChannel$p.mo72188E(getNewCodeClicked, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        OtpLoginRepository access$getRepository$p = this.this$0.repository;
        if (access$getRepository$p != null) {
            OTPLoginData data = ((OtpLoginRepositoryImpl) access$getRepository$p).getData();
            AuthOptionChallengeData authOptionChallengeData = data.getAuthOptionChallengeData();
            data.setNonce(authOptionChallengeData == null ? null : authOptionChallengeData.getNonce());
            this.this$0.callGenerateChallenge(data);
            return C19394m.f43287a;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl");
    }
}
