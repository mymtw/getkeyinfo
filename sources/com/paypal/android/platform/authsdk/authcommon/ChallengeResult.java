package com.paypal.android.platform.authsdk.authcommon;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20018z;
import p753kq.C19857l;

public abstract class ChallengeResult {
    private final String requestId;

    public static final class Completed extends ChallengeResult {
        private final ChallengeResultData data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Completed(String str, ChallengeResultData challengeResultData) {
            super(str, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            C19383o.m32797g(challengeResultData, "data");
            this.data = challengeResultData;
        }

        public final ChallengeResultData getData() {
            return this.data;
        }
    }

    public static final class Failed extends ChallengeResult {
        private final ChallengeError error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failed(String str, ChallengeError challengeError) {
            super(str, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            C19383o.m32797g(challengeError, "error");
            this.error = challengeError;
        }

        public final ChallengeError getError() {
            return this.error;
        }
    }

    public static final class UnHandled extends ChallengeResult {
        private final Object additionalData;
        private final Challenge challenge;
        private final String challengeType;
        private final String jsonStrChallengeData;
        private final C20018z rawResponse;
        private final Error reason;
        private final ChallengeType responseChallengeType;
        private final C19857l<Object, ChallengeResult> retryCallBack;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ UnHandled(com.paypal.android.platform.authsdk.authcommon.Challenge r9, java.lang.String r10, com.paypal.android.platform.authsdk.authcommon.ChallengeType r11, java.lang.String r12, okhttp3.C20018z r13, java.lang.Object r14, java.lang.Error r15, p753kq.C19857l r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
            /*
                r8 = this;
                r0 = r17
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r10
            L_0x000a:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r11
            L_0x0011:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r12
            L_0x0018:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x001e
                r5 = r2
                goto L_0x001f
            L_0x001e:
                r5 = r13
            L_0x001f:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x0025
                r6 = r2
                goto L_0x0026
            L_0x0025:
                r6 = r14
            L_0x0026:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x002c
                r7 = r2
                goto L_0x002d
            L_0x002c:
                r7 = r15
            L_0x002d:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0032
                goto L_0x0034
            L_0x0032:
                r2 = r16
            L_0x0034:
                r10 = r8
                r11 = r9
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.ChallengeResult.UnHandled.<init>(com.paypal.android.platform.authsdk.authcommon.Challenge, java.lang.String, com.paypal.android.platform.authsdk.authcommon.ChallengeType, java.lang.String, okhttp3.z, java.lang.Object, java.lang.Error, kq.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ void getJsonStrChallengeData$annotations() {
        }

        public static /* synthetic */ void getResponseChallengeType$annotations() {
        }

        public final Object getAdditionalData() {
            return this.additionalData;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final String getChallengeType() {
            return this.challengeType;
        }

        public final String getJsonStrChallengeData() {
            return this.jsonStrChallengeData;
        }

        public final C20018z getRawResponse() {
            return this.rawResponse;
        }

        public final Error getReason() {
            return this.reason;
        }

        public final ChallengeType getResponseChallengeType() {
            return this.responseChallengeType;
        }

        public final C19857l<Object, ChallengeResult> getRetryCallBack() {
            return this.retryCallBack;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnHandled(Challenge challenge2, String str, ChallengeType challengeType2, String str2, C20018z zVar, Object obj, Error error, C19857l<Object, ? extends ChallengeResult> lVar) {
            super(challenge2.getRequestId(), (DefaultConstructorMarker) null);
            C19383o.m32797g(challenge2, "challenge");
            this.challenge = challenge2;
            this.jsonStrChallengeData = str;
            this.responseChallengeType = challengeType2;
            this.challengeType = str2;
            this.rawResponse = zVar;
            this.additionalData = obj;
            this.reason = error;
            this.retryCallBack = lVar;
        }
    }

    private ChallengeResult(String str) {
        this.requestId = str;
    }

    public /* synthetic */ ChallengeResult(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
