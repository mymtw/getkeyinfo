package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import com.appboy.Constants;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeParser;
import com.paypal.android.platform.authsdk.authcommon.ChallengeRawResponse;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeParserFactory */
public final class CaptchaChallengeParserFactory implements ChallengeParser {
    public static final String CAPTCHA_CHALLENGE_TYPE_KEY = "AuthAdsUriChallenge";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AuthCoreComponent authCoreComponent;

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeParserFactory$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CaptchaChallengeParserFactory(AuthCoreComponent authCoreComponent2) {
        C19383o.m32797g(authCoreComponent2, ConstantsKt.AUTH_CORE_COMPONENT);
        this.authCoreComponent = authCoreComponent2;
        authCoreComponent2.getChallengeParserRegistry().registerChallengeParser(this);
    }

    private final CaptchaChallengeData buildCaptchaChallengeData(String str, CaptchaUriData captchaUriData) {
        HashMap hashMap = new HashMap();
        hashMap.put(UriChallengeConstantKt.CHALLENGE_URI, captchaUriData.getChallengeUri());
        hashMap.put(UriChallengeConstantKt.RETURN_URI_PARAMS, captchaUriData.getReturnUriParam());
        hashMap.put(UriChallengeConstantKt.RETURN_URI, captchaUriData.getReturnUri());
        hashMap.putAll(buildQueryParamMap(getAuthCoreComponent()));
        return new CaptchaChallengeData(str, hashMap);
    }

    private final Map<String, String> buildQueryParamMap(AuthCoreComponent authCoreComponent2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String guid = authCoreComponent2.getClientConfig().getGuid();
        linkedHashMap.put(Constants.APPBOY_PUSH_PRIORITY_KEY, "auth-" + guid);
        linkedHashMap.put("source", authCoreComponent2.getClientConfig().getAppInfo().getName());
        CaptchaChallengeUtils.Companion companion = CaptchaChallengeUtils.Companion;
        linkedHashMap.put("country.x", companion.getCountryCode$auth_sdk_thirdPartyRelease(authCoreComponent2));
        linkedHashMap.put("locale.x", companion.getLocale$auth_sdk_thirdPartyRelease(authCoreComponent2));
        return linkedHashMap;
    }

    public final AuthCoreComponent getAuthCoreComponent() {
        return this.authCoreComponent;
    }

    public Challenge parseAndBuildChallenge(ChallengeRawResponse challengeRawResponse, C19857l<Object, ? extends ChallengeResult> lVar) {
        C19383o.m32797g(challengeRawResponse, "challengeRawResponse");
        try {
            String jsonResultStr = challengeRawResponse.getJsonResultStr();
            if (C19383o.m32792b(new JSONObject(jsonResultStr).get("objectType").toString(), "AuthAdsUriChallenge")) {
                CaptchaUriData captchaUriData = (CaptchaUriData) new C16708i().mo59458e(CaptchaUriData.class, jsonResultStr);
                String requestId = challengeRawResponse.getRequestId();
                String requestId2 = challengeRawResponse.getRequestId();
                C19383o.m32796f(captchaUriData, "captchaUriData");
                return new CaptchaChallenge(requestId, lVar, buildCaptchaChallengeData(requestId2, captchaUriData));
            }
        } catch (ParseException unused) {
        }
        return null;
    }
}
