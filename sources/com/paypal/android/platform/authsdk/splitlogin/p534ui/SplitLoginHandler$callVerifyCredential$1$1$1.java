package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$callVerifyCredential$1$1$1", mo70541f = "SplitLoginHandler.kt", mo70542l = {221}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$callVerifyCredential$1$1$1 */
public final class SplitLoginHandler$callVerifyCredential$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ PartnerAuthEngine $authEngine;
    public final /* synthetic */ Challenge $challenge;
    public final /* synthetic */ C2895z<ChallengeResult> $liveData;
    public final /* synthetic */ OTPLoginData $otpLoginData;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$callVerifyCredential$1$1$1(PartnerAuthEngine partnerAuthEngine, Challenge challenge, OTPLoginData oTPLoginData, C2895z<ChallengeResult> zVar, C19340c<? super SplitLoginHandler$callVerifyCredential$1$1$1> cVar) {
        super(2, cVar);
        this.$authEngine = partnerAuthEngine;
        this.$challenge = challenge;
        this.$otpLoginData = oTPLoginData;
        this.$liveData = zVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginHandler$callVerifyCredential$1$1$1(this.$authEngine, this.$challenge, this.$otpLoginData, this.$liveData, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginHandler$callVerifyCredential$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0047
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0015:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine r7 = r6.$authEngine
            java.util.Map<com.paypal.android.platform.authsdk.authcommon.ChallengeType, com.paypal.android.platform.authsdk.authcommon.ChallengeHandler> r7 = r7.f37645a
            com.paypal.android.platform.authsdk.authcommon.ChallengeType r1 = com.paypal.android.platform.authsdk.authcommon.ChallengeType.OTPLogin
            java.lang.Object r7 = r7.get(r1)
            com.paypal.android.platform.authsdk.authcommon.ChallengeHandler r7 = (com.paypal.android.platform.authsdk.authcommon.ChallengeHandler) r7
            if (r7 != 0) goto L_0x0028
            r7 = 0
            goto L_0x0049
        L_0x0028:
            com.paypal.android.platform.authsdk.authcommon.Challenge$OTPLogin r1 = new com.paypal.android.platform.authsdk.authcommon.Challenge$OTPLogin
            com.paypal.android.platform.authsdk.authcommon.Challenge r3 = r6.$challenge
            java.lang.String r3 = r3.getRequestId()
            com.google.gson.i r4 = new com.google.gson.i
            r4.<init>()
            com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData r5 = r6.$otpLoginData
            java.lang.String r4 = r4.mo59463j(r5)
            r1.<init>(r3, r4)
            r6.label = r2
            java.lang.Object r7 = r7.handleChallenge(r1, r6)
            if (r7 != r0) goto L_0x0047
            return r0
        L_0x0047:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r7 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r7
        L_0x0049:
            if (r7 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            androidx.lifecycle.z<com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r0 = r6.$liveData
            r0.postValue(r7)
        L_0x0051:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler$callVerifyCredential$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
