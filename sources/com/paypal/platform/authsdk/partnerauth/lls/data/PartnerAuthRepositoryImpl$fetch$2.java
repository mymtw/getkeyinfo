package com.paypal.platform.authsdk.partnerauth.lls.data;

import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.platform.authsdk.partnerauth.lls.data.PartnerAuthRepositoryImpl$fetch$2", mo70541f = "PartnerAuthRepositoryImpl.kt", mo70542l = {29}, mo70543m = "invokeSuspend")
public final class PartnerAuthRepositoryImpl$fetch$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ResultStatus<TokenResponse>>, Object> {
    public final /* synthetic */ HashMap<String, String> $tokenRequest;
    public int label;
    public final /* synthetic */ PartnerAuthRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PartnerAuthRepositoryImpl$fetch$2(HashMap<String, String> hashMap, PartnerAuthRepositoryImpl partnerAuthRepositoryImpl, C19340c<? super PartnerAuthRepositoryImpl$fetch$2> cVar) {
        super(2, cVar);
        this.$tokenRequest = hashMap;
        this.this$0 = partnerAuthRepositoryImpl;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PartnerAuthRepositoryImpl$fetch$2(this.$tokenRequest, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ResultStatus<TokenResponse>> cVar) {
        return ((PartnerAuthRepositoryImpl$fetch$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r6 == null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x000e
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ Exception -> 0x00fa }
            goto L_0x00ab
        L_0x000e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0016:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r10.$tokenRequest
            java.lang.String r1 = "client_id"
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x0027
            goto L_0x00fe
        L_0x0027:
            com.paypal.platform.authsdk.partnerauth.lls.data.PartnerAuthRepositoryImpl r3 = r10.this$0
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r10.$tokenRequest
            com.paypal.platform.authsdk.partnerauth.lls.data.a r5 = r3.f37632a     // Catch:{ Exception -> 0x00fa }
            java.nio.charset.Charset r6 = kotlin.text.C19446a.f43373b     // Catch:{ Exception -> 0x00fa }
            byte[] r6 = r11.getBytes(r6)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)     // Catch:{ Exception -> 0x00fa }
            r7 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)     // Catch:{ Exception -> 0x00fa }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x00fa }
            r7.<init>()     // Catch:{ Exception -> 0x00fa }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fa }
            r8.<init>()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r9 = "Basic "
            r8.append(r9)     // Catch:{ Exception -> 0x00fa }
            r8.append(r6)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r8 = "Authorization"
            r7.put(r8, r6)     // Catch:{ Exception -> 0x00fa }
            r7.put(r1, r11)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r11 = "PAYPAL-ENTRY-POINT"
            java.lang.String r1 = "http://uri.paypal.com/API_UNKNOWN/Server/oauth2/PlatformApiServ/POST_token?flow_type=nativexo"
            r7.put(r11, r1)     // Catch:{ Exception -> 0x00fa }
            kotlin.Pair r11 = new kotlin.Pair     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = "paypal-client-metadata-id"
            java.lang.String r6 = "risk_data"
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00fa }
            if (r6 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            java.lang.String r6 = com.paypal.android.platform.authsdk.authcommon.network.utils.AuthHeaderBuilderKt.toPayPalClientMetaDataId(r6)     // Catch:{ Exception -> 0x00fa }
            if (r6 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r6 = ""
        L_0x0079:
            r11.<init>(r1, r6)     // Catch:{ Exception -> 0x00fa }
            java.util.Map r11 = kotlin.collections.C19294b0.m32565v0(r7, r11)     // Catch:{ Exception -> 0x00fa }
            kotlin.Pair r1 = new kotlin.Pair     // Catch:{ Exception -> 0x00fa }
            java.lang.String r6 = "user-agent"
            android.content.Context r3 = r3.f37633b     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = android.webkit.WebSettings.getDefaultUserAgent(r3)     // Catch:{ Exception -> 0x00fa }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fa }
            r7.<init>()     // Catch:{ Exception -> 0x00fa }
            r7.append(r3)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = " PayPal3PSDK/PayPal"
            r7.append(r3)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x00fa }
            r1.<init>(r6, r3)     // Catch:{ Exception -> 0x00fa }
            java.util.Map r11 = kotlin.collections.C19294b0.m32565v0(r11, r1)     // Catch:{ Exception -> 0x00fa }
            r10.label = r2     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r11 = r5.mo62573a(r4, r11, r10)     // Catch:{ Exception -> 0x00fa }
            if (r11 != r0) goto L_0x00ab
            return r0
        L_0x00ab:
            retrofit2.v r11 = (retrofit2.C20145v) r11     // Catch:{ Exception -> 0x00fa }
            boolean r0 = r11.mo74384a()     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00d5
            T r11 = r11.f44615b     // Catch:{ Exception -> 0x00fa }
            com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse r11 = (com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse) r11     // Catch:{ Exception -> 0x00fa }
            if (r11 != 0) goto L_0x00ce
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r11 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion     // Catch:{ Exception -> 0x00fa }
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r7 = new com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = "Data not found"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00fa }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r11 = r11.withException(r7)     // Catch:{ Exception -> 0x00fa }
            return r11
        L_0x00ce:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r0 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion     // Catch:{ Exception -> 0x00fa }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r11 = r0.withSuccess(r11)     // Catch:{ Exception -> 0x00fa }
            return r11
        L_0x00d5:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r0 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion     // Catch:{ Exception -> 0x00fa }
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r8 = new com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network     // Catch:{ Exception -> 0x00fa }
            okhttp3.a0 r11 = r11.f44616c     // Catch:{ Exception -> 0x00fa }
            if (r11 != 0) goto L_0x00df
            r11 = 0
            goto L_0x00e7
        L_0x00df:
            lr.i r11 = r11.mo70458f()     // Catch:{ Exception -> 0x00fa }
            java.io.InputStream r11 = r11.mo72774z0()     // Catch:{ Exception -> 0x00fa }
        L_0x00e7:
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00fa }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00fa }
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r11 = r0.withException(r8)     // Catch:{ Exception -> 0x00fa }
            return r11
        L_0x00fa:
            r11 = move-exception
            r11.printStackTrace()
        L_0x00fe:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r11 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r7 = new com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            java.lang.String r1 = "Client Id required"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r11 = r11.withException(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.platform.authsdk.partnerauth.lls.data.PartnerAuthRepositoryImpl$fetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
