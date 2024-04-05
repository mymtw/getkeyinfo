package com.paypal.platform.authsdk.partnerauth.lls.p537ui;

import android.content.Context;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.platform.authsdk.AuthProviders;
import com.paypal.platform.authsdk.partnerauth.lls.domain.SignatureHolder;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.HashMap;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p716xo.C18834f;
import p724yo.C18897a;
import p732zo.C18973a;

/* renamed from: com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler */
public final class PartnerAuthLLSHandler implements ChallengeHandler {

    /* renamed from: a */
    public final Context f37635a;

    /* renamed from: b */
    public final AuthCoreComponent f37636b;

    /* renamed from: c */
    public final C18834f f37637c;

    /* renamed from: d */
    public final AuthProviders f37638d;

    /* renamed from: e */
    public final ITracker f37639e;

    public PartnerAuthLLSHandler(Context context, C18834f fVar, AuthCoreComponent authCoreComponent, AuthProviders authProviders, C18897a aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(authProviders, "authProviders");
        this.f37635a = context;
        this.f37636b = authCoreComponent;
        this.f37637c = fVar;
        this.f37638d = authProviders;
        this.f37639e = aVar;
        authCoreComponent.getChallengeRegistry().registerChallengeHandler(ChallengeType.PartnerAuthLLS, this);
    }

    /* renamed from: a */
    public static TrackingEvent.Error m28637a(String str) {
        if (str == null) {
            str = "error";
        }
        return new TrackingEvent.Error("native_auth_lls_handler", str, EventsNameKt.FAILED, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2040, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final HashMap<String, String> mo62599b(String str, SignatureHolder signatureHolder) {
        HashMap<String, String> hashMap = new HashMap<>();
        String decryptString = new C18973a(this.f37635a).decryptString("riskVisitorId", (String) null);
        if (decryptString != null) {
            String put = hashMap.put("visitor_id", decryptString);
        }
        hashMap.put("refresh_token", str);
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("response_type", UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        hashMap.put("redirect_uri", this.f37636b.getClientConfig().getRedirectUri());
        hashMap.put("code_challenge_method", ConstantsKt.CHALLENGE_METHOD_ES256);
        hashMap.put("risk_data", this.f37636b.getClientConfig().getRiskData());
        String nonce = signatureHolder.getNonce();
        if (nonce != null) {
            String put2 = hashMap.put("nonce", nonce);
        }
        String codeChallenge = signatureHolder.getCodeChallenge();
        if (codeChallenge != null) {
            String put3 = hashMap.put("code_challenge", codeChallenge);
        }
        hashMap.put("client_id", this.f37636b.getClientConfig().getClientId());
        return hashMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:23|24|(1:26)(2:27|(6:29|32|(2:34|(1:36)(2:37|(1:39)(1:40)))|67|68|69))|30|31|32|(0)|67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b7, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0103 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f A[Catch:{ Exception -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015d A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b3 A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge r24, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r0 = r25
            java.lang.String r3 = "Signature not generated"
            boolean r4 = r0 instanceof com.paypal.platform.authsdk.partnerauth.lls.p537ui.PartnerAuthLLSHandler$handleChallenge$1
            if (r4 == 0) goto L_0x001b
            r4 = r0
            com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler$handleChallenge$1 r4 = (com.paypal.platform.authsdk.partnerauth.lls.p537ui.PartnerAuthLLSHandler$handleChallenge$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler$handleChallenge$1 r4 = new com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler$handleChallenge$1
            r4.<init>(r1, r0)
        L_0x0020:
            java.lang.Object r0 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r4.label
            java.lang.String r7 = "Error "
            java.lang.String r8 = ""
            r9 = 1
            if (r6 == 0) goto L_0x0053
            if (r6 != r9) goto L_0x004b
            java.lang.Object r2 = r4.L$3
            zo.a r2 = (p732zo.C18973a) r2
            java.lang.Object r3 = r4.L$2
            com.paypal.android.platform.authsdk.authcommon.Challenge$PartnerAuthLLS r3 = (com.paypal.android.platform.authsdk.authcommon.Challenge.PartnerAuthLLS) r3
            java.lang.Object r5 = r4.L$1
            com.paypal.android.platform.authsdk.authcommon.Challenge r5 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r5
            java.lang.Object r4 = r4.L$0
            com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler r4 = (com.paypal.platform.authsdk.partnerauth.lls.p537ui.PartnerAuthLLSHandler) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ Exception -> 0x0047 }
            r6 = r3
            r3 = r2
            r2 = r5
            goto L_0x0157
        L_0x0047:
            r0 = move-exception
            r2 = r5
            goto L_0x0287
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0053:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "handleChallenge "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "PartnerAuthLLSHandler"
            android.util.Log.d(r6, r0)
            r6 = r2
            com.paypal.android.platform.authsdk.authcommon.Challenge$PartnerAuthLLS r6 = (com.paypal.android.platform.authsdk.authcommon.Challenge.PartnerAuthLLS) r6
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r0 = r1.f37639e
            r12 = 0
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Impression r15 = new com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Impression
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 248(0xf8, float:3.48E-43)
            r20 = 0
            java.lang.String r10 = "native_auth_lls_handler"
            java.lang.String r11 = "triggered"
            r9 = r15
            r21 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9 = r21
            r0.onTrackEvent(r9)
            zo.a r0 = new zo.a     // Catch:{ Exception -> 0x02b6 }
            android.content.Context r9 = r1.f37635a     // Catch:{ Exception -> 0x02b6 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r9 = "refreshToken"
            r10 = 0
            java.lang.String r9 = r0.decryptString(r9, r10)     // Catch:{ Exception -> 0x02b6 }
            if (r9 != 0) goto L_0x00db
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r0 = r1.f37639e     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r3 = "No Token Found"
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Error r3 = m28637a(r3)     // Catch:{ Exception -> 0x02b6 }
            r0.onTrackEvent(r3)     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r9 = new com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r3 = r24.getRequestId()     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r4 = r6.getPublicCredential()     // Catch:{ Exception -> 0x02b6 }
            r9.<init>(r3, r4)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r10 = ""
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.Error r15 = new java.lang.Error     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r3 = "Token Error}"
            r15.<init>(r3)     // Catch:{ Exception -> 0x02b6 }
            r16 = 0
            r17 = 188(0xbc, float:2.63E-43)
            r18 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02b6 }
            return r0
        L_0x00db:
            com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecurityUtil r11 = com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecurityUtil.INSTANCE     // Catch:{ Exception -> 0x0103 }
            java.lang.String r11 = r11.generateNonce()     // Catch:{ Exception -> 0x0103 }
            java.lang.String r12 = "\n"
            r13 = 0
            java.lang.String r11 = kotlin.text.C19457k.m33023a1(r11, r12, r8, r13)     // Catch:{ Exception -> 0x0103 }
            com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyFactory r12 = com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyFactory.INSTANCE     // Catch:{ Exception -> 0x0103 }
            com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyWrapper r12 = r12.createSecureKeyWrapper()     // Catch:{ Exception -> 0x0103 }
            java.lang.String r13 = "asymmetricKeyAlias"
            java.security.Signature r13 = r12.generateSignature(r13)     // Catch:{ Exception -> 0x0103 }
            if (r13 != 0) goto L_0x00f7
            goto L_0x0103
        L_0x00f7:
            java.lang.String r12 = r12.signDataUsingSignatureObjectAndBase64Encode(r13, r11)     // Catch:{ Exception -> 0x0103 }
            if (r12 == 0) goto L_0x0103
            com.paypal.platform.authsdk.partnerauth.lls.domain.SignatureHolder r13 = new com.paypal.platform.authsdk.partnerauth.lls.domain.SignatureHolder     // Catch:{ Exception -> 0x0103 }
            r13.<init>(r11, r12)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0109
        L_0x0103:
            com.paypal.platform.authsdk.partnerauth.lls.domain.SignatureHolder r13 = new com.paypal.platform.authsdk.partnerauth.lls.domain.SignatureHolder     // Catch:{ Exception -> 0x02b6 }
            r11 = 3
            r13.<init>(r10, r10, r11, r10)     // Catch:{ Exception -> 0x02b6 }
        L_0x0109:
            java.lang.String r10 = r13.getCodeChallenge()     // Catch:{ Exception -> 0x02b6 }
            if (r10 == 0) goto L_0x0289
            java.lang.String r10 = r13.getNonce()     // Catch:{ Exception -> 0x02b6 }
            if (r10 != 0) goto L_0x0117
            goto L_0x0289
        L_0x0117:
            com.paypal.platform.authsdk.AuthProviders r3 = r1.f37638d     // Catch:{ Exception -> 0x02b6 }
            xo.e r3 = r3.getRiskDelegate()     // Catch:{ Exception -> 0x02b6 }
            com.paypal.platform.authsdk.AuthProviders r10 = r1.f37638d     // Catch:{ Exception -> 0x02b6 }
            xo.g r10 = r10.getTrackingDelegate()     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r10 = r10.getTrackingId()     // Catch:{ Exception -> 0x02b6 }
            r3.generatePairingIdAndNotifyDyson(r10)     // Catch:{ Exception -> 0x02b6 }
            java.util.HashMap r3 = r1.mo62599b(r9, r13)     // Catch:{ Exception -> 0x02b6 }
            com.paypal.platform.authsdk.partnerauth.lls.data.PartnerAuthRepositoryImpl r9 = new com.paypal.platform.authsdk.partnerauth.lls.data.PartnerAuthRepositoryImpl     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent r10 = r1.f37636b     // Catch:{ Exception -> 0x02b6 }
            java.lang.Class<com.paypal.platform.authsdk.partnerauth.lls.data.a> r11 = com.paypal.platform.authsdk.partnerauth.lls.data.C17161a.class
            java.lang.Object r10 = com.paypal.android.platform.authsdk.authcommon.network.utils.ApiUtilsKt.getAuthApi(r10, r11)     // Catch:{ Exception -> 0x02b6 }
            com.paypal.platform.authsdk.partnerauth.lls.data.a r10 = (com.paypal.platform.authsdk.partnerauth.lls.data.C17161a) r10     // Catch:{ Exception -> 0x02b6 }
            android.content.Context r11 = r1.f37635a     // Catch:{ Exception -> 0x02b6 }
            r9.<init>(r10, r11)     // Catch:{ Exception -> 0x02b6 }
            r4.L$0 = r1     // Catch:{ Exception -> 0x02b6 }
            r4.L$1 = r2     // Catch:{ Exception -> 0x02b6 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x02b6 }
            r4.L$3 = r0     // Catch:{ Exception -> 0x02b6 }
            r10 = 1
            r4.label = r10     // Catch:{ Exception -> 0x02b6 }
            java.lang.Object r3 = r9.mo62571a(r3, r4)     // Catch:{ Exception -> 0x02b6 }
            if (r3 != r5) goto L_0x0151
            return r5
        L_0x0151:
            r4 = r1
            r22 = r3
            r3 = r0
            r0 = r22
        L_0x0157:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r0     // Catch:{ Exception -> 0x0285 }
            boolean r5 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure     // Catch:{ Exception -> 0x0285 }
            if (r5 == 0) goto L_0x01b3
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r5 = r4.f37639e     // Catch:{ Exception -> 0x0285 }
            r8 = r0
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r8 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure) r8     // Catch:{ Exception -> 0x0285 }
            java.lang.Exception r8 = r8.getException()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Error r8 = m28637a(r8)     // Catch:{ Exception -> 0x0285 }
            r5.onTrackEvent(r8)     // Catch:{ Exception -> 0x0285 }
            r3.clear()     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r10 = new com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin     // Catch:{ Exception -> 0x0285 }
            java.lang.String r5 = r2.getRequestId()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r8 = r6.getPublicCredential()     // Catch:{ Exception -> 0x0285 }
            r10.<init>(r5, r8)     // Catch:{ Exception -> 0x0285 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.Error r5 = new java.lang.Error     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure) r0     // Catch:{ Exception -> 0x0285 }
            java.lang.Exception r0 = r0.getException()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0285 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0285 }
            r8.<init>()     // Catch:{ Exception -> 0x0285 }
            r8.append(r7)     // Catch:{ Exception -> 0x0285 }
            r8.append(r0)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x0285 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0285 }
            r17 = 0
            r18 = 190(0xbe, float:2.66E-43)
            r19 = 0
            r9 = r3
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0285 }
            return r3
        L_0x01b3:
            boolean r3 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Pending     // Catch:{ Exception -> 0x0285 }
            if (r3 == 0) goto L_0x01cb
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResultData r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResultData     // Catch:{ Exception -> 0x0285 }
            java.lang.String r10 = "This is pending acccess Token"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 14
            r15 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0285 }
            r0.<init>(r8, r3)     // Catch:{ Exception -> 0x0285 }
            return r0
        L_0x01cb:
            boolean r3 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success     // Catch:{ Exception -> 0x0285 }
            if (r3 == 0) goto L_0x024b
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r3 = r4.f37639e     // Catch:{ Exception -> 0x0285 }
            java.lang.String r10 = "success"
            r11 = 0
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Impression r5 = new com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Impression     // Catch:{ Exception -> 0x0285 }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 248(0xf8, float:3.48E-43)
            r18 = 0
            java.lang.String r9 = "native_auth_lls_handler"
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0285 }
            r3.onTrackEvent(r5)     // Catch:{ Exception -> 0x0285 }
            xo.f r3 = r4.f37637c     // Catch:{ Exception -> 0x0285 }
            r5 = r0
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r5 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r5     // Catch:{ Exception -> 0x0285 }
            java.lang.Object r5 = r5.getData()     // Catch:{ Exception -> 0x0285 }
            com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse r5 = (com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse) r5     // Catch:{ Exception -> 0x0285 }
            java.lang.String r5 = r5.getAccessToken()     // Catch:{ Exception -> 0x0285 }
            r3.f41705a = r5     // Catch:{ Exception -> 0x0285 }
            xo.f r3 = r4.f37637c     // Catch:{ Exception -> 0x0285 }
            r5 = r0
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r5 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r5     // Catch:{ Exception -> 0x0285 }
            java.lang.Object r5 = r5.getData()     // Catch:{ Exception -> 0x0285 }
            com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse r5 = (com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse) r5     // Catch:{ Exception -> 0x0285 }
            java.lang.Long r5 = r5.getExpiresIn()     // Catch:{ Exception -> 0x0285 }
            if (r5 != 0) goto L_0x020c
            goto L_0x0218
        L_0x020c:
            long r8 = r5.longValue()     // Catch:{ Exception -> 0x0285 }
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0285 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0285 }
            r5.toMillis(r8)     // Catch:{ Exception -> 0x0285 }
        L_0x0218:
            r3.getClass()     // Catch:{ Exception -> 0x0285 }
            xo.f r3 = r4.f37637c     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r5 = com.paypal.android.platform.authsdk.authinterface.AuthenticationState.Remembered     // Catch:{ Exception -> 0x0285 }
            r3.getClass()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r8 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r5, r8)     // Catch:{ Exception -> 0x0285 }
            r3.f41706b = r5     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed     // Catch:{ Exception -> 0x0285 }
            java.lang.String r5 = r2.getRequestId()     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResultData r15 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResultData     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r0     // Catch:{ Exception -> 0x0285 }
            java.lang.Object r0 = r0.getData()     // Catch:{ Exception -> 0x0285 }
            com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse r0 = (com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse) r0     // Catch:{ Exception -> 0x0285 }
            java.lang.String r9 = r0.getAccessToken()     // Catch:{ Exception -> 0x0285 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 14
            r14 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0285 }
            r3.<init>(r5, r15)     // Catch:{ Exception -> 0x0285 }
            return r3
        L_0x024b:
            boolean r3 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Unhandled     // Catch:{ Exception -> 0x0285 }
            if (r3 == 0) goto L_0x027f
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r3 = r4.f37639e     // Catch:{ Exception -> 0x0285 }
            java.lang.String r5 = "UnHandled"
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Error r5 = m28637a(r5)     // Catch:{ Exception -> 0x0285 }
            r3.onTrackEvent(r5)     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r9 = new com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin     // Catch:{ Exception -> 0x0285 }
            java.lang.String r5 = r2.getRequestId()     // Catch:{ Exception -> 0x0285 }
            java.lang.String r8 = r6.getPublicCredential()     // Catch:{ Exception -> 0x0285 }
            r9.<init>(r5, r8)     // Catch:{ Exception -> 0x0285 }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Unhandled r0 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Unhandled) r0     // Catch:{ Exception -> 0x0285 }
            java.lang.String r10 = r0.getChallengeData()     // Catch:{ Exception -> 0x0285 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 248(0xf8, float:3.48E-43)
            r18 = 0
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0285 }
            return r3
        L_0x027f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x0285 }
            r0.<init>()     // Catch:{ Exception -> 0x0285 }
            throw r0     // Catch:{ Exception -> 0x0285 }
        L_0x0285:
            r0 = move-exception
            r3 = r6
        L_0x0287:
            r6 = r3
            goto L_0x02b8
        L_0x0289:
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r0 = r1.f37639e     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Error r4 = m28637a(r3)     // Catch:{ Exception -> 0x02b6 }
            r0.onTrackEvent(r4)     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled     // Catch:{ Exception -> 0x02b6 }
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r9 = new com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r4 = r24.getRequestId()     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r5 = r6.getPublicCredential()     // Catch:{ Exception -> 0x02b6 }
            r9.<init>(r4, r5)     // Catch:{ Exception -> 0x02b6 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.Error r15 = new java.lang.Error     // Catch:{ Exception -> 0x02b6 }
            r15.<init>(r3)     // Catch:{ Exception -> 0x02b6 }
            r16 = 0
            r17 = 190(0xbe, float:2.66E-43)
            r18 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02b6 }
            return r0
        L_0x02b6:
            r0 = move-exception
            r4 = r1
        L_0x02b8:
            com.paypal.android.platform.authsdk.authcommon.analytics.ITracker r3 = r4.f37639e
            java.lang.String r4 = r0.getMessage()
            com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent$Error r4 = m28637a(r4)
            r3.onTrackEvent(r4)
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r9 = new com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin
            java.lang.String r2 = r2.getRequestId()
            java.lang.String r4 = r6.getPublicCredential()
            r9.<init>(r2, r4)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.Error r15 = new java.lang.Error
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r7, r0)
            r15.<init>(r0)
            r16 = 0
            r17 = 190(0xbe, float:2.66E-43)
            r18 = 0
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.platform.authsdk.partnerauth.lls.p537ui.PartnerAuthLLSHandler.handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    public final void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(challenge, "challenge");
        C19383o.m32797g(hostNavigationController, "hostNavigationController");
        C19383o.m32797g(zVar, "challengeResultLiveData");
        throw new NotImplementedError(C19383o.m32802l("Not yet implemented", "An operation is not implemented: "));
    }
}
