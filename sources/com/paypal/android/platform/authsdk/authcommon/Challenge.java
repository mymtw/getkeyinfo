package com.paypal.android.platform.authsdk.authcommon;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

public class Challenge {
    private final String requestId;
    private final C19857l<Object, ChallengeResult> retryCallBack;
    private final ChallengeType type;

    public static final class Biometric extends Challenge {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Biometric(String str) {
            super(str, ChallengeType.Biometric, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
        }
    }

    public static final class CaptchaChallenge extends Challenge {
        private final Map<String, String> challengeParamMap;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CaptchaChallenge(String str, Map<String, String> map) {
            super(str, ChallengeType.Captcha, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            C19383o.m32797g(map, "challengeParamMap");
            this.challengeParamMap = map;
        }

        public final Map<String, String> getChallengeParamMap() {
            return this.challengeParamMap;
        }
    }

    public static final class EmailPassword extends Challenge {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EmailPassword(String str) {
            super(str, ChallengeType.EmailPassword, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
        }
    }

    public static final class LoginChallenge extends Challenge {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoginChallenge(String str) {
            super(str, ChallengeType.Login, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
        }
    }

    public static final class OTPLogin extends Challenge {
        private final String jsonInput;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OTPLogin(String str, String str2) {
            super(str, ChallengeType.OTPLogin, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            this.jsonInput = str2;
        }

        public final String getJsonInput() {
            return this.jsonInput;
        }
    }

    public static final class PartnerAuthLLS extends Challenge {
        private final String publicCredential;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PartnerAuthLLS(String str, String str2) {
            super(str, ChallengeType.PartnerAuthLLS, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            this.publicCredential = str2;
        }

        public final String getPublicCredential() {
            return this.publicCredential;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PartnerAuthLLS(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    public static final class SplitLogin extends Challenge {
        private final String publicCredential;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SplitLogin(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getPublicCredential() {
            return this.publicCredential;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SplitLogin(String str, String str2) {
            super(str, ChallengeType.SplitLogin, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            this.publicCredential = str2;
        }
    }

    public static final class StepUpChallenge extends Challenge {
        private final Map<String, String> challengeParamMap;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StepUpChallenge(String str, Map<String, String> map) {
            super(str, ChallengeType.StepUp, (C19857l) null, 4, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "requestId");
            C19383o.m32797g(map, "challengeParamMap");
            this.challengeParamMap = map;
        }

        public final Map<String, String> getChallengeParamMap() {
            return this.challengeParamMap;
        }
    }

    public Challenge(String str, ChallengeType challengeType, C19857l<Object, ? extends ChallengeResult> lVar) {
        C19383o.m32797g(str, "requestId");
        C19383o.m32797g(challengeType, "type");
        this.requestId = str;
        this.type = challengeType;
        this.retryCallBack = lVar;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final C19857l<Object, ChallengeResult> getRetryCallBack() {
        return this.retryCallBack;
    }

    public final ChallengeType getType() {
        return this.type;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Challenge(String str, ChallengeType challengeType, C19857l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, challengeType, (i & 4) != 0 ? null : lVar);
    }
}
