package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.PhoneNumberViewState;
import com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsManagerKt;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$2", mo70541f = "OtpLoginViewModel.kt", mo70542l = {70, 75}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$2 */
public final class OtpLoginViewModel$initOtpPhoneLayout$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ ArrayList<String> $phoneNumbers;
    public int label;
    public final /* synthetic */ OtpLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginViewModel$initOtpPhoneLayout$2(OtpLoginViewModel otpLoginViewModel, ArrayList<String> arrayList, C19340c<? super OtpLoginViewModel$initOtpPhoneLayout$2> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginViewModel;
        this.$phoneNumbers = arrayList;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginViewModel$initOtpPhoneLayout$2(this.this$0, this.$phoneNumbers, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpLoginViewModel$initOtpPhoneLayout$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getAnalyticsEventsChannel$p = this.this$0.analyticsEventsChannel;
            OTPLoginEvent.SinglePhoneNumber singlePhoneNumber = new OTPLoginEvent.SinglePhoneNumber(OTPLoginAnalyticsManagerKt.EVENT_OTP_PHONE_PAGE_SHOWN);
            this.label = 1;
            if (access$getAnalyticsEventsChannel$p.mo72188E(singlePhoneNumber, this) == coroutineSingletons) {
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
        PhoneNumberViewState.SinglePhoneNumber singlePhoneNumber2 = new PhoneNumberViewState.SinglePhoneNumber((String) C19327t.m32638T0(this.$phoneNumbers));
        this.label = 2;
        if (access$getViewStateChannel$p.mo72188E(singlePhoneNumber2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C19394m.f43287a;
    }
}
