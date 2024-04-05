package com.paypal.platform.authsdk.partnerauth.platform;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeParser;
import com.paypal.android.platform.authsdk.authcommon.ChallengeParserRegistry;
import com.paypal.android.platform.authsdk.authcommon.ChallengeRegistry;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class PartnerAuthEngine implements ChallengeRegistry, ChallengeParserRegistry {

    /* renamed from: a */
    public final Map<ChallengeType, ChallengeHandler> f37645a;

    /* renamed from: b */
    public final List<ChallengeParser> f37646b;

    public PartnerAuthEngine() {
        throw null;
    }

    public PartnerAuthEngine(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f37645a = linkedHashMap;
        this.f37646b = arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62605a(com.paypal.android.platform.authsdk.authcommon.Challenge r5, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine$handleChallenge$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine$handleChallenge$1 r0 = (com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine$handleChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine$handleChallenge$1 r0 = new com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine$handleChallenge$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            com.paypal.android.platform.authsdk.authcommon.Challenge r5 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.util.Map<com.paypal.android.platform.authsdk.authcommon.ChallengeType, com.paypal.android.platform.authsdk.authcommon.ChallengeHandler> r6 = r4.f37645a
            com.paypal.android.platform.authsdk.authcommon.ChallengeType r2 = r5.getType()
            java.lang.Object r6 = r6.get(r2)
            com.paypal.android.platform.authsdk.authcommon.ChallengeHandler r6 = (com.paypal.android.platform.authsdk.authcommon.ChallengeHandler) r6
            if (r6 != 0) goto L_0x0046
            r6 = 0
            goto L_0x0053
        L_0x0046:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.handleChallenge(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r6 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r6
        L_0x0053:
            if (r6 != 0) goto L_0x007d
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r6 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r0 = r5.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported
            java.lang.Error r2 = new java.lang.Error
            com.paypal.android.platform.authsdk.authcommon.ChallengeType r5 = r5.getType()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = " not yet supported"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            r1.<init>(r2)
            r6.<init>(r0, r1)
        L_0x007d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine.mo62605a(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    public final boolean registerChallengeHandler(ChallengeType challengeType, ChallengeHandler challengeHandler) {
        C19383o.m32797g(challengeType, "challengeType");
        C19383o.m32797g(challengeHandler, "challengeHandler");
        if (this.f37645a.get(challengeType) != null) {
            return false;
        }
        this.f37645a.put(challengeType, challengeHandler);
        return true;
    }

    public final void registerChallengeParser(ChallengeParser challengeParser) {
        C19383o.m32797g(challengeParser, "challengeParser");
        this.f37646b.add(challengeParser);
    }
}
