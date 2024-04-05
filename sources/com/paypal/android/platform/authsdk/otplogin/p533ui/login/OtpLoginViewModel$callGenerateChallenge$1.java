package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1", mo70541f = "OtpLoginViewModel.kt", mo70542l = {140, 142}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1 */
public final class OtpLoginViewModel$callGenerateChallenge$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OTPLoginData $otpLoginData;
    public int label;
    public final /* synthetic */ OtpLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpLoginViewModel$callGenerateChallenge$1(OtpLoginViewModel otpLoginViewModel, OTPLoginData oTPLoginData, C19340c<? super OtpLoginViewModel$callGenerateChallenge$1> cVar) {
        super(2, cVar);
        this.this$0 = otpLoginViewModel;
        this.$otpLoginData = oTPLoginData;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpLoginViewModel$callGenerateChallenge$1(this.this$0, this.$otpLoginData, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpLoginViewModel$callGenerateChallenge$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 == r4) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x004b
        L_0x0011:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0019:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0036
        L_0x001d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r11 = r10.this$0
            kotlinx.coroutines.channels.d r11 = r11.analyticsEventsChannel
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Initiated r1 = new com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Initiated
            java.lang.String r5 = "native_auth_otp_phone_getcode_call"
            r1.<init>(r5)
            r10.label = r4
            java.lang.Object r11 = r11.mo72188E(r1, r10)
            if (r11 != r0) goto L_0x0036
            return r0
        L_0x0036:
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r11 = r10.$otpLoginData
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r1 = r10.this$0
            com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository r1 = r1.repository
            if (r1 != 0) goto L_0x0042
            r11 = r2
            goto L_0x004d
        L_0x0042:
            r10.label = r3
            java.lang.Object r11 = r1.generateChallenge(r11, r10)
            if (r11 != r0) goto L_0x004b
            return r0
        L_0x004b:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r11 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r11
        L_0x004d:
            if (r11 != 0) goto L_0x0063
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r11 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r0 = new com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r9 = 0
            java.lang.String r4 = "repository not found"
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r11 = r11.withException(r0)
        L_0x0063:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure
            r1 = 3
            if (r0 == 0) goto L_0x0079
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$1 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$1
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r4 = r10.this$0
            r3.<init>(r4, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            goto L_0x00c3
        L_0x0079:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Pending
            if (r0 == 0) goto L_0x008e
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r11 = r10.this$0
            kotlinx.coroutines.d0 r11 = kotlin.jvm.internal.C19388s.m32866i0(r11)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$2 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$2
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r3 = r10.this$0
            r0.<init>(r3, r2)
            kotlinx.coroutines.C19697g.m33468f(r11, r2, r2, r0, r1)
            goto L_0x00c3
        L_0x008e:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success
            if (r0 == 0) goto L_0x00af
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r11 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r11
            java.lang.Object r11 = r11.getData()
            com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData r11 = (com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData) r11
            java.lang.String r11 = r11.getNonce()
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$3 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$3
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r4 = r10.this$0
            r3.<init>(r4, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            goto L_0x00c3
        L_0x00af:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Unhandled
            if (r0 == 0) goto L_0x00c3
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$4 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$callGenerateChallenge$1$4
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel r4 = r10.this$0
            r3.<init>(r4, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
        L_0x00c3:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginViewModel$callGenerateChallenge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
