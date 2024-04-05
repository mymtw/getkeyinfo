package com.paypal.android.platform.authsdk.stepup.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p010a9.C0048b;

public final class StepUpChallengeUtils {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String HEADER_PAYPAL_INTERNAL_EUAT = "X-PayPal-Internal-Euat";
    /* access modifiers changed from: private */
    public static final String HEADER_PAYPAL_SECURE_APP_DATA = "X-PayPal-Secure-App-Data";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String buildUrlWithQueryString$auth_sdk_thirdPartyRelease(String str, String str2) {
            Uri parse;
            C19394m mVar;
            C19383o.m32797g(str2, "queryParams");
            String str3 = null;
            if (!URLUtil.isValidUrl(str) || (parse = Uri.parse(str)) == null) {
                return null;
            }
            if (parse.getScheme() != null && C19383o.m32792b(ResponseConstants.FILE, parse.getScheme())) {
                return str;
            }
            if (str == null) {
                mVar = null;
            } else {
                if (C19457k.m33018V0(str, "/")) {
                    str = str.substring(0, str.length() - 1);
                    C19383o.m32796f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                return null;
            }
            if (TextUtils.isEmpty(parse.getQuery())) {
                if (str != null) {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = C19383o.m32799i(str.charAt(!z ? i : length), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    str3 = str.subSequence(i, length + 1).toString();
                }
                return C0048b.m163a(str3, "?", str2);
            }
            if (str != null) {
                int length2 = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = C19383o.m32799i(str.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (!z3) {
                        if (!z4) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                }
                str3 = str.subSequence(i2, length2 + 1).toString();
            }
            return C0048b.m163a(str3, "&", str2);
        }

        public final String getCountryCode$auth_sdk_thirdPartyRelease(AuthCoreComponent authCoreComponent) {
            C19383o.m32797g(authCoreComponent, ConstantsKt.AUTH_CORE_COMPONENT);
            String country = authCoreComponent.getClientConfig().getAppInfo().getLocale().getCountry();
            C19383o.m32796f(country, "authCoreComponent.getCli…().appInfo.locale.country");
            return country;
        }

        public final String getHEADER_PAYPAL_INTERNAL_EUAT$auth_sdk_thirdPartyRelease() {
            return StepUpChallengeUtils.HEADER_PAYPAL_INTERNAL_EUAT;
        }

        public final String getHEADER_PAYPAL_SECURE_APP_DATA$auth_sdk_thirdPartyRelease() {
            return StepUpChallengeUtils.HEADER_PAYPAL_SECURE_APP_DATA;
        }

        public final String getLocale$auth_sdk_thirdPartyRelease(AuthCoreComponent authCoreComponent) {
            C19383o.m32797g(authCoreComponent, ConstantsKt.AUTH_CORE_COMPONENT);
            String locale = authCoreComponent.getClientConfig().getAppInfo().getLocale().toString();
            C19383o.m32796f(locale, "authCoreComponent.getCli…appInfo.locale.toString()");
            return locale;
        }

        public final Challenge prepareStepUpChallenge$auth_sdk_thirdPartyRelease(String str, StepUpChallengeData stepUpChallengeData) {
            C19383o.m32797g(str, "requestId");
            C19383o.m32797g(stepUpChallengeData, "challengeUriData");
            HashMap hashMap = new HashMap();
            hashMap.put(UriChallengeConstantKt.CHALLENGE_URI, stepUpChallengeData.getChallengeUri());
            hashMap.put(UriChallengeConstantKt.RETURN_URI_PARAMS, stepUpChallengeData.getReturnUriParam());
            hashMap.put(UriChallengeConstantKt.RETURN_URI, stepUpChallengeData.getReturnUri());
            hashMap.put(UriChallengeConstantKt.STEP_UP_CONTEXT, stepUpChallengeData.getStepupContext());
            hashMap.put(UriChallengeConstantKt.FLOW_CONTEXT, stepUpChallengeData.getFlowContext());
            hashMap.put(UriChallengeConstantKt.FLOW_ID, stepUpChallengeData.getFlowId());
            hashMap.put(UriChallengeConstantKt.ACCESS_TOKEN, stepUpChallengeData.getAccessToken());
            return new Challenge.StepUpChallenge(str, hashMap);
        }

        public final String toQueryString$auth_sdk_thirdPartyRelease(Map<String, String> map) {
            C19383o.m32797g(map, ResponseConstants.PARAMS);
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append("=");
                sb.append((String) next.getValue());
                sb.append("&");
                arrayList.add(sb);
            }
            if (C19459m.m33038g1(sb, "&")) {
                String substring = sb.substring(0, sb.length() - 1);
                C19383o.m32796f(substring, "sb.substring(0, sb.length - 1)");
                return substring;
            }
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "sb.toString()");
            return sb2;
        }

        public final StepUpChallengeData toStepUpChallengeData$auth_sdk_thirdPartyRelease(String str) {
            C19383o.m32797g(str, "jsonData");
            Object e = new C16708i().mo59458e(StepUpChallengeData.class, str);
            C19383o.m32796f(e, "Gson().fromJson(jsonData…hallengeData::class.java)");
            return (StepUpChallengeData) e;
        }
    }
}
