package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import java.util.Map;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2", mo70541f = "OtpPhoneViewModel.kt", mo70542l = {112, 115, 119}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2 */
public final class OtpPhoneViewModel$callOtpLoginTokenAPI$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Map<String, String> $extraPayload;
    public final /* synthetic */ String $fullOtp;
    public Object L$0;
    public int label;
    public final /* synthetic */ OtpPhoneViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneViewModel$callOtpLoginTokenAPI$2(OtpPhoneViewModel otpPhoneViewModel, String str, Map<String, String> map, C19340c<? super OtpPhoneViewModel$callOtpLoginTokenAPI$2> cVar) {
        super(2, cVar);
        this.this$0 = otpPhoneViewModel;
        this.$fullOtp = str;
        this.$extraPayload = map;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OtpPhoneViewModel$callOtpLoginTokenAPI$2(this.this$0, this.$fullOtp, this.$extraPayload, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OtpPhoneViewModel$callOtpLoginTokenAPI$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        if (r9.equals(com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt.OTP_VALIDATION_LIMIT_EXCEEDED) == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        if (r9.equals("triggeredWebAuth") == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ed, code lost:
        if (r9.equals(com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt.SMS_LIMIT_EXCEEDED) == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        r9 = kotlin.jvm.internal.C19388s.m32866i0(r8.this$0);
        r1 = r8.this$0;
        kotlinx.coroutines.C19697g.m33468f(r9, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2.C170992((kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2.C170992>) null), 3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 0
            java.lang.String r4 = "native_auth_otp_login_otpvalidation_call"
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r6) goto L_0x0027
            if (r1 == r5) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r8.L$0
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x00a3
        L_0x001b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0023:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0068
        L_0x0027:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0042
        L_0x002b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.channels.d r9 = r9.analyticsEventsChannel
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Initiated r1 = new com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Initiated
            r1.<init>(r4)
            r8.label = r6
            java.lang.Object r9 = r9.mo72188E(r1, r8)
            if (r9 != r0) goto L_0x0042
            return r0
        L_0x0042:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository r9 = r9.repository
            if (r9 == 0) goto L_0x0191
            com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl r9 = (com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl) r9
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r9 = r9.getData()
            java.lang.String r1 = r8.$fullOtp
            r9.setOtp(r1)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r8.this$0
            java.util.Map<java.lang.String, java.lang.String> r7 = r8.$extraPayload
            com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository r1 = r1.repository
            com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl r1 = (com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl) r1
            r8.label = r5
            java.lang.Object r9 = r1.performOtpLogin(r9, r7, r8)
            if (r9 != r0) goto L_0x0068
            return r0
        L_0x0068:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r9 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r9
            boolean r1 = r9 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure
            if (r1 == 0) goto L_0x012d
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r8.this$0
            r1.setCompletionState(r6)
            r1 = r9
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r1 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure) r1
            java.lang.Exception r5 = r1.getException()
            boolean r5 = r5 instanceof com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.Network
            if (r5 == 0) goto L_0x018e
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r5 = r8.this$0
            kotlinx.coroutines.channels.d r5 = r5.analyticsEventsChannel
            com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Failed r6 = new com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Failed
            java.lang.Exception r1 = r1.getException()
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r1 = (com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.Network) r1
            java.lang.String r1 = r1.getCode()
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = "error_attempt_threshold"
        L_0x0094:
            r6.<init>(r4, r1)
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = r5.mo72188E(r6, r8)
            if (r1 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r9 = r0
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r9 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure) r9
            java.lang.Exception r9 = r9.getException()
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r9 = (com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.Network) r9
            java.lang.String r9 = r9.getCode()
            if (r9 == 0) goto L_0x011c
            int r1 = r9.hashCode()
            switch(r1) {
                case -647966255: goto L_0x0102;
                case 579539773: goto L_0x00e7;
                case 855037637: goto L_0x00de;
                case 1201085603: goto L_0x00c3;
                case 2007448521: goto L_0x00ba;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x011c
        L_0x00ba:
            java.lang.String r0 = "OTP_VALIDATION_LIMIT_EXCEEDED"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f0
            goto L_0x011c
        L_0x00c3:
            java.lang.String r1 = "INVALID_OTP"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00cc
            goto L_0x011c
        L_0x00cc:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.d0 r9 = kotlin.jvm.internal.C19388s.m32866i0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$1 r1 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$1
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r8.this$0
            r1.<init>(r4, r0, r3)
            kotlinx.coroutines.C19697g.m33468f(r9, r3, r3, r1, r2)
            goto L_0x018e
        L_0x00de:
            java.lang.String r0 = "triggeredWebAuth"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f0
            goto L_0x011c
        L_0x00e7:
            java.lang.String r0 = "SMS_LIMIT_EXCEEDED"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f0
            goto L_0x011c
        L_0x00f0:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.d0 r9 = kotlin.jvm.internal.C19388s.m32866i0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$2 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$2
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r8.this$0
            r0.<init>(r1, r3)
            kotlinx.coroutines.C19697g.m33468f(r9, r3, r3, r0, r2)
            goto L_0x018e
        L_0x0102:
            java.lang.String r1 = "OTP_EXPIRED"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x010b
            goto L_0x011c
        L_0x010b:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.d0 r9 = kotlin.jvm.internal.C19388s.m32866i0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$3 r1 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$3
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r8.this$0
            r1.<init>(r4, r0, r3)
            kotlinx.coroutines.C19697g.m33468f(r9, r3, r3, r1, r2)
            goto L_0x018e
        L_0x011c:
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.d0 r9 = kotlin.jvm.internal.C19388s.m32866i0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$4 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$4
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r8.this$0
            r0.<init>(r1, r3)
            kotlinx.coroutines.C19697g.m33468f(r9, r3, r3, r0, r2)
            goto L_0x018e
        L_0x012d:
            boolean r0 = r9 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Pending
            if (r0 == 0) goto L_0x0148
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            r0 = 0
            r9.setCompletionState(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r9 = r8.this$0
            kotlinx.coroutines.d0 r9 = kotlin.jvm.internal.C19388s.m32866i0(r9)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$5 r0 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$5
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r1 = r8.this$0
            r0.<init>(r1, r3)
            kotlinx.coroutines.C19697g.m33468f(r9, r3, r3, r0, r2)
            goto L_0x018e
        L_0x0148:
            boolean r0 = r9 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success
            if (r0 == 0) goto L_0x017a
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r8.this$0
            r0.setCompletionState(r6)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r8.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$6 r1 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$6
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r8.this$0
            r1.<init>(r4, r3)
            kotlinx.coroutines.C19697g.m33468f(r0, r3, r3, r1, r2)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r9 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r9
            java.lang.Object r9 = r9.getData()
            com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData r9 = (com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData) r9
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r8.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$7 r1 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$7
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r8.this$0
            r1.<init>(r4, r9, r3)
            kotlinx.coroutines.C19697g.m33468f(r0, r3, r3, r1, r2)
            goto L_0x018e
        L_0x017a:
            boolean r0 = r9 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Unhandled
            if (r0 == 0) goto L_0x018e
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r0 = r8.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$8 r1 = new com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2$8
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel r4 = r8.this$0
            r1.<init>(r4, r9, r3)
            kotlinx.coroutines.C19697g.m33468f(r0, r3, r3, r1, r2)
        L_0x018e:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x0191:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel$callOtpLoginTokenAPI$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
