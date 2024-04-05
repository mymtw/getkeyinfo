package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1", mo70541f = "OtpPhoneViewModel.kt", mo70542l = {378}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1 */
public final class OtpPhoneViewModel$callGenerateChallenge$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OTPLoginData $otpLoginData;
    public int label;
    public final /* synthetic */ OtpPhoneViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneViewModel$callGenerateChallenge$1(OTPLoginData oTPLoginData, OtpPhoneViewModel otpPhoneViewModel, C19340c<? super OtpPhoneViewModel$callGenerateChallenge$1> cVar) {
        super(2, cVar);
        this.$otpLoginData = oTPLoginData;
        this.this$0 = otpPhoneViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneViewModel$callGenerateChallenge$1(this.$otpLoginData, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneViewModel$callGenerateChallenge$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r3) goto L_0x000e
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x002e
        L_0x000e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0016:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r11 = r10.$otpLoginData
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r10.this$0
            com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository r1 = r1.repository
            if (r1 != 0) goto L_0x0025
            r11 = r2
            goto L_0x0030
        L_0x0025:
            r10.label = r3
            java.lang.Object r11 = r1.generateChallenge(r11, r10)
            if (r11 != r0) goto L_0x002e
            return r0
        L_0x002e:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r11 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r11
        L_0x0030:
            if (r11 != 0) goto L_0x0046
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
        L_0x0046:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure
            r1 = 3
            if (r0 == 0) goto L_0x00b3
            r0 = r11
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure) r0
            java.lang.Exception r3 = r0.getException()
            boolean r3 = r3 instanceof com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.Network
            if (r3 == 0) goto L_0x00a2
            java.lang.Exception r11 = r0.getException()
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r11 = (com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.Network) r11
            java.lang.String r11 = r11.getCode()
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r10.this$0
            if (r11 == 0) goto L_0x00f8
            int r3 = r11.hashCode()
            r4 = -647966255(0xffffffffd960d1d1, float:-3.95506815E15)
            if (r3 == r4) goto L_0x008c
            r4 = 579539773(0x228b133d, float:3.7696395E-18)
            if (r3 == r4) goto L_0x0083
            r4 = 855037637(0x32f6d6c5, float:2.8735835E-8)
            if (r3 == r4) goto L_0x0079
            goto L_0x00f8
        L_0x0079:
            java.lang.String r3 = "triggeredWebAuth"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0095
            goto L_0x00f8
        L_0x0083:
            java.lang.String r3 = "SMS_LIMIT_EXCEEDED"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0095
            goto L_0x00f8
        L_0x008c:
            java.lang.String r3 = "OTP_EXPIRED"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0095
            goto L_0x00f8
        L_0x0095:
            kotlinx.coroutines.d0 r3 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$1$1 r4 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$1$1
            r4.<init>(r0, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r3, r2, r2, r4, r1)
            goto L_0x00f8
        L_0x00a2:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$2 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$2
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r10.this$0
            r3.<init>(r4, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            goto L_0x00f8
        L_0x00b3:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Pending
            if (r0 == 0) goto L_0x00c8
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r11 = r10.this$0
            kotlinx.coroutines.d0 r11 = kotlin.jvm.internal.C19388s.m32866i0(r11)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$3 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$3
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r3 = r10.this$0
            r0.<init>(r3, r2)
            kotlinx.coroutines.C19697g.m33468f(r11, r2, r2, r0, r1)
            goto L_0x00f8
        L_0x00c8:
            boolean r0 = r11 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success
            if (r0 == 0) goto L_0x00f8
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$4 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$4
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r10.this$0
            r3.<init>(r4, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r11 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r11
            java.lang.Object r11 = r11.getData()
            com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData r11 = (com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData) r11
            java.lang.String r11 = r11.getNonce()
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r10.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$5 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callGenerateChallenge$1$5
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r10.this$0
            r3.<init>(r4, r11, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
        L_0x00f8:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel$callGenerateChallenge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
