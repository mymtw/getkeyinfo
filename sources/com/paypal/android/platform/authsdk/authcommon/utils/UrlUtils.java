package com.paypal.android.platform.authsdk.authcommon.utils;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UrlUtils {
    private static final String CARRIER_ONBOARDING_HEADER_ENRICHMENT_DOMAIN = "mi.dnlsrv.com";
    public static final Companion Companion;
    private static final List<String> DEBUG_WHITELISTED_DOMAINS;
    /* access modifiers changed from: private */
    public static final String LIVE_BASE_URL = "https://www.paypal.com";
    /* access modifiers changed from: private */
    public static final List<String> LIVE_PAYPAL_DOMAINS;
    private static final List<String> LIVE_THIRDPARTY_DOMAINS;
    private static final String PAYPAL_DOMAIN = "paypal.com";
    private static final String PAYPAL_EXT_STAGE_DOMAIN = "ppextstaging.com";
    /* access modifiers changed from: private */
    public static final String PAYPAL_QA_DOMAIN = "qa.paypal.com";
    /* access modifiers changed from: private */
    public static final String PAYPAL_STAGE_DOMAIN = "stage.paypal.com";
    private static final List<String> PROD_WHITELISTED_DOMAINS;
    /* access modifiers changed from: private */
    public static final List<String> STAGE_PAYPAL_DOMAINS;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SafeVarargs
        public final List<String> asList$auth_sdk_thirdPartyRelease(List<String>... listArr) {
            C19383o.m32797g(listArr, ResponseConstants.ITEMS);
            ArrayList arrayList = new ArrayList();
            int length = listArr.length;
            int i = 0;
            while (i < length) {
                List<String> list = listArr[i];
                i++;
                arrayList.addAll(list);
            }
            return arrayList;
        }

        public final String getLIVE_BASE_URL() {
            return UrlUtils.LIVE_BASE_URL;
        }

        public final List<String> getLIVE_PAYPAL_DOMAINS$auth_sdk_thirdPartyRelease() {
            return UrlUtils.LIVE_PAYPAL_DOMAINS;
        }

        public final String getPAYPAL_QA_DOMAIN() {
            return UrlUtils.PAYPAL_QA_DOMAIN;
        }

        public final String getPAYPAL_STAGE_DOMAIN() {
            return UrlUtils.PAYPAL_STAGE_DOMAIN;
        }

        public final List<String> getSTAGE_PAYPAL_DOMAINS$auth_sdk_thirdPartyRelease() {
            return UrlUtils.STAGE_PAYPAL_DOMAINS;
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        Companion = companion;
        List<String> asList = Arrays.asList(new String[]{"paypal.com"});
        LIVE_PAYPAL_DOMAINS = asList;
        List<String> asList2 = Arrays.asList(new String[]{"mi.dnlsrv.com"});
        LIVE_THIRDPARTY_DOMAINS = asList2;
        List<String> asList3 = Arrays.asList(new String[]{"qa.paypal.com", "stage.paypal.com", "ppextstaging.com"});
        STAGE_PAYPAL_DOMAINS = asList3;
        C19383o.m32796f(asList, "LIVE_PAYPAL_DOMAINS");
        C19383o.m32796f(asList2, "LIVE_THIRDPARTY_DOMAINS");
        List<String> asList$auth_sdk_thirdPartyRelease = companion.asList$auth_sdk_thirdPartyRelease(asList, asList2);
        PROD_WHITELISTED_DOMAINS = asList$auth_sdk_thirdPartyRelease;
        C19383o.m32796f(asList3, "STAGE_PAYPAL_DOMAINS");
        DEBUG_WHITELISTED_DOMAINS = companion.asList$auth_sdk_thirdPartyRelease(asList$auth_sdk_thirdPartyRelease, asList3);
    }
}
