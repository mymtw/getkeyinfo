package com.etsy.android.lib.config;

import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.editable.EditableListing;
import org.apache.commons.lang3.time.DateUtils;
import p514bk.C14088a;

/* renamed from: com.etsy.android.lib.config.b */
public final class C8592b {

    /* renamed from: A */
    public static final EtsyConfigKey f18718A = new EtsyConfigKey("BOEEnableBitly", "on");

    /* renamed from: A0 */
    public static final EtsyConfigKey f18719A0 = new EtsyConfigKey("BOEHttpClientsConfigs.CallTimeoutInSeconds", "0");

    /* renamed from: A1 */
    public static final EtsyConfigKey f18720A1;

    /* renamed from: B */
    public static final EtsyConfigKey f18721B = new EtsyConfigKey("FacebookTracking", "on");

    /* renamed from: B0 */
    public static final EtsyConfigKey f18722B0 = new EtsyConfigKey("BOEHttpClientsConfigs.ConnectTimeoutInSeconds", "10");

    /* renamed from: B1 */
    public static final EtsyConfigKey f18723B1;

    /* renamed from: C */
    public static final EtsyConfigKey f18724C;

    /* renamed from: C0 */
    public static final EtsyConfigKey f18725C0 = new EtsyConfigKey("TwoFactor", "on");

    /* renamed from: C1 */
    public static final EtsyConfigKey f18726C1 = new EtsyConfigKey("DebugForceSilentBadgeChannel", "off");

    /* renamed from: D */
    public static final EtsyConfigKey f18727D;

    /* renamed from: D0 */
    public static final EtsyConfigKey f18728D0 = new EtsyConfigKey("GooglePlaySOEBuildUrl", "market://details?id=com.etsy.android.soe");

    /* renamed from: E */
    public static final EtsyConfigKey f18729E = new EtsyConfigKey("UseViewAnalyticsTrackerClicks", "on");

    /* renamed from: E0 */
    public static final EtsyConfigKey f18730E0 = new EtsyConfigKey("BOERegistrationMarketingEmailToggleAndroid", "on");

    /* renamed from: F */
    public static final EtsyConfigKey f18731F = new EtsyConfigKey("BOENativePerformanceMetrics", "off");

    /* renamed from: F0 */
    public static final EtsyConfigKey f18732F0 = new EtsyConfigKey("BOEPushNotificationTimezones", "off");

    /* renamed from: G */
    public static final EtsyConfigKey f18733G = new EtsyConfigKey("BOENativePerformanceMetrics.SampleRate", String.valueOf(0));

    /* renamed from: G0 */
    public static final EtsyConfigKey f18734G0 = new EtsyConfigKey("quests.BOEClearTopHomeNavigation", "off");

    /* renamed from: H */
    public static final EtsyConfigKey f18735H;

    /* renamed from: H0 */
    public static final EtsyConfigKey f18736H0 = new EtsyConfigKey("BOECreateListFromFavoritesMax", "30");

    /* renamed from: I */
    public static final EtsyConfigKey f18737I = new EtsyConfigKey("NativeAppBucketingKillSwitch", "on");

    /* renamed from: I0 */
    public static final EtsyConfigKey f18738I0 = new EtsyConfigKey("BOEDebounceClicks", "off");

    /* renamed from: J */
    public static final EtsyConfigKey f18739J = new EtsyConfigKey("AnalyticsUploadPeriodSec", String.valueOf(60));

    /* renamed from: J0 */
    public static final EtsyConfigKey f18740J0 = new EtsyConfigKey("BOEDebounceClicks.ThresholdMillis", "1000");

    /* renamed from: K */
    public static final EtsyConfigKey f18741K = new EtsyConfigKey("AnalyticsMaxLogsPerSend", String.valueOf(3));

    /* renamed from: K0 */
    public static final EtsyConfigKey f18742K0 = new EtsyConfigKey("BOEAutoSuggestLimit", "6");

    /* renamed from: L */
    public static final EtsyConfigKey f18743L = new EtsyConfigKey("EtsyAnalyticsAndroid", "on");

    /* renamed from: L0 */
    public static final EtsyConfigKey f18744L0 = new EtsyConfigKey("API_KEY", "");

    /* renamed from: M */
    public static final EtsyConfigKey f18745M = new EtsyConfigKey("AnalyticsUploadWhenAppBackgrounded", "on");

    /* renamed from: M0 */
    public static final EtsyConfigKey f18746M0 = new EtsyConfigKey("API_SECRET", "");

    /* renamed from: N */
    public static final EtsyConfigKey f18747N = new EtsyConfigKey("EtsyAnalyticsServerErrorFilter", "");

    /* renamed from: N0 */
    public static final EtsyConfigKey f18748N0;

    /* renamed from: O */
    public static final EtsyConfigKey f18749O;

    /* renamed from: O0 */
    public static final EtsyConfigKey f18750O0 = new EtsyConfigKey("BOECategoryEntryPointInsteadOfPopular3Q2022Try2", "off");

    /* renamed from: P */
    public static final EtsyConfigKey f18751P = new EtsyConfigKey("EtsyAnalyticsLogErrors", "off");

    /* renamed from: P0 */
    public static final EtsyConfigKey f18752P0 = new EtsyConfigKey("BOEAutosuggestDebounceDelay", "0");

    /* renamed from: Q */
    public static final EtsyConfigKey f18753Q = new EtsyConfigKey("percent_errors_to_log", "10");

    /* renamed from: Q0 */
    public static final EtsyConfigKey f18754Q0 = new EtsyConfigKey("BOESearchImpressionBatchSize", "100");

    /* renamed from: R */
    public static final EtsyConfigKey f18755R = new EtsyConfigKey("BOELogQueueAlertSampleRate", "100");

    /* renamed from: R0 */
    public static final EtsyConfigKey f18756R0;

    /* renamed from: S */
    public static final EtsyConfigKey f18757S = new EtsyConfigKey("BOELogQueueAlertThreshold", "40");

    /* renamed from: S0 */
    public static final EtsyConfigKey f18758S0;

    /* renamed from: T */
    public static final EtsyConfigKey f18759T = new EtsyConfigKey("BOEAnalyticsQueueAlertSampleRate", "100");

    /* renamed from: T0 */
    public static final EtsyConfigKey f18760T0;

    /* renamed from: U */
    public static final EtsyConfigKey f18761U = new EtsyConfigKey("BOEAnalyticsQueueAlertThreshold", "40");

    /* renamed from: U0 */
    public static final EtsyConfigKey f18762U0 = new EtsyConfigKey("BOEMultiSelectPriceFiltersTry2", "off");

    /* renamed from: V */
    public static final EtsyConfigKey f18763V = new EtsyConfigKey("BOEAnalyticsQueueDrain", "off");

    /* renamed from: V0 */
    public static final EtsyConfigKey f18764V0 = new EtsyConfigKey("BOESearchFiltersShowCount2022Q3", "off");

    /* renamed from: W */
    public static final EtsyConfigKey f18765W = new EtsyConfigKey("BOELogQueueDrain", "off");

    /* renamed from: W0 */
    public static final EtsyConfigKey f18766W0 = new EtsyConfigKey("BOESearchPriceFilterPills", "off");

    /* renamed from: X */
    public static final EtsyConfigKey f18767X = new EtsyConfigKey("BOELogUploadForeground", "off");

    /* renamed from: X0 */
    public static final EtsyConfigKey f18768X0;

    /* renamed from: Y */
    public static final EtsyConfigKey f18769Y = new EtsyConfigKey("BOEShowFeedbackForm", "off");

    /* renamed from: Y0 */
    public static final EtsyConfigKey f18770Y0;

    /* renamed from: Z */
    public static final EtsyConfigKey f18771Z = new EtsyConfigKey("MultipleOrderPrivateNotes", "off");

    /* renamed from: Z0 */
    public static final EtsyConfigKey f18772Z0 = new EtsyConfigKey("BOEShowContactShopOnAllReviewsScreens", "off");

    /* renamed from: a */
    public static final EtsyConfigKey f18773a = new EtsyConfigKey("enable_menu_counts", "on");

    /* renamed from: a0 */
    public static final EtsyConfigKey f18774a0 = new EtsyConfigKey("ShippingMethodOnReceipt", "off");

    /* renamed from: a1 */
    public static final EtsyConfigKey f18775a1 = new EtsyConfigKey("BOEHideListingCardKebabMenu", "off");

    /* renamed from: b */
    public static final EtsyConfigKey f18776b = new EtsyConfigKey("enable_config_key_tracking", "on");

    /* renamed from: b0 */
    public static final EtsyConfigKey f18777b0 = new EtsyConfigKey("LocalizedSellerDetailsAddressInputForm", "off");

    /* renamed from: b1 */
    public static final EtsyConfigKey f18778b1 = new EtsyConfigKey("BOECartErrorMessageBubbleWithButton", "off");

    /* renamed from: c */
    public static final EtsyConfigKey f18779c = new EtsyConfigKey(ResponseConstants.Includes.VARIATIONS, "on");

    /* renamed from: c0 */
    public static final EtsyConfigKey f18780c0 = new EtsyConfigKey("CustomShops", "off");

    /* renamed from: c1 */
    public static final EtsyConfigKey f18781c1;

    /* renamed from: d */
    public static final EtsyConfigKey f18782d = new EtsyConfigKey("IsAdmin", "off");

    /* renamed from: d0 */
    public static final EtsyConfigKey f18783d0 = new EtsyConfigKey("ListingsManager.EnableOnlyRetail.CraftSuppliesTaxonomyId", "562");

    /* renamed from: d1 */
    public static final EtsyConfigKey f18784d1;

    /* renamed from: e */
    public static final EtsyConfigKey f18785e = new EtsyConfigKey("PurchaseGiftCards", "off");

    /* renamed from: e0 */
    public static final EtsyConfigKey f18786e0 = new EtsyConfigKey("BOEAppsFlyerEnabled", "on");

    /* renamed from: e1 */
    public static final EtsyConfigKey f18787e1;

    /* renamed from: f */
    public static final EtsyConfigKey f18788f = new EtsyConfigKey("CountryDialogSortPrimary", "off");

    /* renamed from: f0 */
    public static final EtsyConfigKey f18789f0 = new EtsyConfigKey("BOEAppsFlyerTrackingEnabled", "off");

    /* renamed from: f1 */
    public static final EtsyConfigKey f18790f1 = new EtsyConfigKey("BOELogAllListingErrors", "on");

    /* renamed from: g */
    public static final EtsyConfigKey f18791g = new EtsyConfigKey("PrimaryIsoCountryCodes", "");

    /* renamed from: g0 */
    public static final EtsyConfigKey f18792g0 = new EtsyConfigKey("BOEAppsFlyerPostToEtsy", "off");

    /* renamed from: g1 */
    public static final EtsyConfigKey f18793g1;

    /* renamed from: h */
    public static final EtsyConfigKey f18794h = new EtsyConfigKey("MachineTranslationLanguages", "");

    /* renamed from: h0 */
    public static final EtsyConfigKey f18795h0 = new EtsyConfigKey("BOEMultipleBackstacksClassLoader", "on");

    /* renamed from: h1 */
    public static final EtsyConfigKey f18796h1;

    /* renamed from: i */
    public static final EtsyConfigKey f18797i = new EtsyConfigKey("MachineTranslationListingLanguages", "");

    /* renamed from: i0 */
    public static EtsyConfigKey f18798i0 = new EtsyConfigKey("BOELogNavHistory", "on");

    /* renamed from: i1 */
    public static final EtsyConfigKey f18799i1 = new EtsyConfigKey("BOEUpgradePrompt", "off");

    /* renamed from: j */
    public static final EtsyConfigKey f18800j = new EtsyConfigKey("LinkVATLearnMoreFAQ", "");

    /* renamed from: j0 */
    public static EtsyConfigKey f18801j0 = new EtsyConfigKey("BOELogNavStorageMax", "5");

    /* renamed from: j1 */
    public static final EtsyConfigKey f18802j1 = new EtsyConfigKey("BOESoftUpgradePrompt", "off");

    /* renamed from: k */
    public static final EtsyConfigKey f18803k = new EtsyConfigKey("LinkVATInvoice", "");

    /* renamed from: k0 */
    public static EtsyConfigKey f18804k0 = new EtsyConfigKey("BOEDisableUpdatesTooltips", "off");

    /* renamed from: k1 */
    public static final EtsyConfigKey f18805k1 = new EtsyConfigKey("BOEGooglePayExpressCheckout", "on");

    /* renamed from: l */
    public static final EtsyConfigKey f18806l = new EtsyConfigKey("LinkVATCreditNote", "");

    /* renamed from: l0 */
    public static EtsyConfigKey f18807l0 = new EtsyConfigKey("BOEPostPurchaseApiWithModule", "off");

    /* renamed from: l1 */
    public static final EtsyConfigKey f18808l1 = new EtsyConfigKey("hide_facebook_login", "off");

    /* renamed from: m */
    public static final EtsyConfigKey f18809m = new EtsyConfigKey("LIBIntlSafeCurrencyFormatsJSON", "{\n   \"en_NZ\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_ES\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"it_IT\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_AU\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_CA\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\",\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HK\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_MX\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"MXN\":\"MX$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_SG\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_DE\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"ja_JP\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_GB\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"AUD\":\"AU$\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_US\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HU\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_IN\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_US\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_CA\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_FR\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"pl_PL\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"PLN\":\"z\\u0142\",\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   }\n}");

    /* renamed from: m0 */
    public static final EtsyConfigKey f18810m0 = new EtsyConfigKey("LogNotificationSettings", "on");

    /* renamed from: m1 */
    public static final EtsyConfigKey f18811m1 = new EtsyConfigKey("ABOEUseOAuth2Cookies", "off");

    /* renamed from: n */
    public static final EtsyConfigKey f18812n = new EtsyConfigKey("LinkIppEtsyTerms", "https://www.etsy.com/legal/terms-of-use");

    /* renamed from: n0 */
    public static final EtsyConfigKey f18813n0 = new EtsyConfigKey("ElkUploadWithWorkManager", "on");

    /* renamed from: n1 */
    public static final EtsyConfigKey f18814n1 = new EtsyConfigKey("ABOEUnauthExternalRedirectOperational", "off");

    /* renamed from: o */
    public static final EtsyConfigKey f18815o = new EtsyConfigKey("LinkIppCommsPolicy", "https://www.etsy.com/legal/electronic-communications");

    /* renamed from: o0 */
    public static final EtsyConfigKey f18816o0 = new EtsyConfigKey("EtsyGraphite", "off");

    /* renamed from: o1 */
    public static final EtsyConfigKey f18817o1 = new EtsyConfigKey("ABOEUnauthExternalRedirect_try2", "off");

    /* renamed from: p */
    public static final EtsyConfigKey f18818p = new EtsyConfigKey("LinkIppPrivacyPolicy", "https://www.etsy.com/legal/privacy");

    /* renamed from: p0 */
    public static final EtsyConfigKey f18819p0;

    /* renamed from: p1 */
    public static final EtsyConfigKey f18820p1 = new EtsyConfigKey("BOEEnableRequestSigning", "on");

    /* renamed from: q */
    public static final EtsyConfigKey f18821q = new EtsyConfigKey("BOELegalCenter", "off");

    /* renamed from: q0 */
    public static final EtsyConfigKey f18822q0;

    /* renamed from: q1 */
    public static final EtsyConfigKey f18823q1 = new EtsyConfigKey("OAuth2.OAuth2Repository.SendToBugsnag", "off");

    /* renamed from: r */
    public static final EtsyConfigKey f18824r = new EtsyConfigKey("LinkLegalCenter", "https://www.etsy.com/legal");

    /* renamed from: r0 */
    public static final EtsyConfigKey f18825r0;

    /* renamed from: r1 */
    public static final EtsyConfigKey f18826r1 = new EtsyConfigKey("BOEFirebasePerformanceMonitoring", "off");

    /* renamed from: s */
    public static final EtsyConfigKey f18827s = new EtsyConfigKey("LinkLegalCenterTerms", "https://www.etsy.com/legal/terms-of-use");

    /* renamed from: s0 */
    public static final EtsyConfigKey f18828s0;

    /* renamed from: s1 */
    public static final EtsyConfigKey f18829s1 = new EtsyConfigKey("CFEnableShareCollection", "off");

    /* renamed from: t */
    public static final EtsyConfigKey f18830t = new EtsyConfigKey("LinkLegalCenterCookies", "https://www.etsy.com/legal/cookies");

    /* renamed from: t0 */
    public static final EtsyConfigKey f18831t0;

    /* renamed from: t1 */
    public static final EtsyConfigKey f18832t1 = new EtsyConfigKey("TrackBrazeNotificationErrors", "off");

    /* renamed from: u */
    public static final EtsyConfigKey f18833u = new EtsyConfigKey("LinkBOEPrivacyOptions", "https://www.etsy.com/your/account/privacy");

    /* renamed from: u0 */
    public static final EtsyConfigKey f18834u0;

    /* renamed from: u1 */
    public static final EtsyConfigKey f18835u1 = new EtsyConfigKey("BOEBugsnagFeatureFlagsLogging", "off");

    /* renamed from: v */
    public static final EtsyConfigKey f18836v = new EtsyConfigKey("LinkBOEPersonalAdvertisingOptions", "https://help.etsy.com/hc/en-us/articles/360042433614-How-to-Opt-out-of-Personalized-Advertising");

    /* renamed from: v0 */
    public static final EtsyConfigKey f18837v0;

    /* renamed from: v1 */
    public static final EtsyConfigKey f18838v1 = new EtsyConfigKey("BOEClickLoggingWorkManager", "off");

    /* renamed from: w */
    public static final EtsyConfigKey f18839w = new EtsyConfigKey("LQBOEStopShowingStructuredRefundPoliciesInUnstructured", "off");

    /* renamed from: w0 */
    public static final EtsyConfigKey f18840w0 = new EtsyConfigKey("MultipartTimeout", "180");

    /* renamed from: w1 */
    public static final EtsyConfigKey f18841w1 = new EtsyConfigKey("BOESearchListingCardViewedTagTry2", "off");

    /* renamed from: x */
    public static final EtsyConfigKey f18842x = new EtsyConfigKey("PostManagerRetryIntervalMillis", String.valueOf(DateUtils.MILLIS_PER_MINUTE));

    /* renamed from: x0 */
    public static final EtsyConfigKey f18843x0 = new EtsyConfigKey("BOEHttpClientsConfigs", "off");

    /* renamed from: x1 */
    public static final EtsyConfigKey f18844x1;

    /* renamed from: y */
    public static final EtsyConfigKey f18845y = new EtsyConfigKey("BOEMultiShopCheckout", "off");

    /* renamed from: y0 */
    public static final EtsyConfigKey f18846y0 = new EtsyConfigKey("BOEHttpClientsConfigs.ReadTimeoutInSeconds", "15");

    /* renamed from: y1 */
    public static final EtsyConfigKey f18847y1 = new EtsyConfigKey("BOEShowReviewModal", "off");

    /* renamed from: z */
    public static final EtsyConfigKey f18848z = new EtsyConfigKey("EnableBugsnagBOE", "off");

    /* renamed from: z0 */
    public static final EtsyConfigKey f18849z0 = new EtsyConfigKey("BOEHttpClientsConfigs.WriteTimeoutInSeconds", "10");

    /* renamed from: z1 */
    public static final EtsyConfigKey f18850z1 = new EtsyConfigKey("SearchFiltersDebounceTimeMillis", "500");

    /* renamed from: com.etsy.android.lib.config.b$a */
    public static final class C8593a {

        /* renamed from: a */
        public static final EtsyConfigKey f18851a = new EtsyConfigKey("APPEIconsInFavoriteTabs", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18852b = new EtsyConfigKey("APPEFaveRecsOnLanding", "off");

        /* renamed from: c */
        public static final EtsyConfigKey f18853c = new EtsyConfigKey("APPEHideFaveFreeShippingBadge", "off");

        /* renamed from: d */
        public static final EtsyConfigKey f18854d = new EtsyConfigKey("APPEMinimalistLandingGrid", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$b */
    public static final class C8594b {

        /* renamed from: a */
        public static final EtsyConfigKey f18855a = new EtsyConfigKey("BOE100Kotlin.SearchFilters", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18856b = new EtsyConfigKey("BOECartSaveForLaterNotUsingSDLEnabled", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$c */
    public static final class C8595c {

        /* renamed from: a */
        public static final EtsyConfigKey f18857a = new EtsyConfigKey("BRAZE_REPORTING_PERCENTAGE", "100");

        /* renamed from: b */
        public static final EtsyConfigKey f18858b = new EtsyConfigKey("SHOULD_LOG_NOTIFICATION_TOKEN_ITEMS", "100");

        /* renamed from: c */
        public static final EtsyConfigKey f18859c = new EtsyConfigKey("CustomerCentricMessages", "off");

        /* renamed from: d */
        public static final EtsyConfigKey f18860d = new EtsyConfigKey("MultiReview", "off");

        /* renamed from: e */
        public static final EtsyConfigKey f18861e = new EtsyConfigKey("SignedOutHomeScreenContent", "off");

        /* renamed from: f */
        public static final EtsyConfigKey f18862f = new EtsyConfigKey("SkipNotifyItemChangeFavoriteListingUpdateOperational", "off");

        /* renamed from: g */
        public static final EtsyConfigKey f18863g = new EtsyConfigKey("AddToCartInterstitialRound2", "off");

        /* renamed from: h */
        public static final EtsyConfigKey f18864h = new EtsyConfigKey("HomeScreenTopBannerIllustration", "off");

        /* renamed from: i */
        public static final EtsyConfigKey f18865i = new EtsyConfigKey("ShopScreenTranslations", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$d */
    public static final class C8596d {

        /* renamed from: a */
        public static final EtsyConfigKey f18866a = new EtsyConfigKey("Braze.BOEKillSwitch", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18867b = new EtsyConfigKey("Braze.endpoint", "sdk.iad-03.braze.com");

        /* renamed from: c */
        public static final EtsyConfigKey f18868c = new EtsyConfigKey("Braze.VerboseLogging", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$e */
    public static final class C8597e {

        /* renamed from: a */
        public static final EtsyConfigKey f18869a = new EtsyConfigKey("BOEShippingRemovalForNonUSTry2", "on");

        /* renamed from: b */
        public static EtsyConfigKey f18870b = new EtsyConfigKey("BOEBrowseAfterPurchase", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$f */
    public static final class C8598f {

        /* renamed from: a */
        public static final EtsyConfigKey f18871a = new EtsyConfigKey("CFSearchInFavorites", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18872b = new EtsyConfigKey("CFContextualSearchOnFavorites", "off");

        /* renamed from: c */
        public static final EtsyConfigKey f18873c = new EtsyConfigKey("CFSuggestionsTabForFavorites", "off");

        /* renamed from: d */
        public static final EtsyConfigKey f18874d = new EtsyConfigKey("CFExtendedUserHeaderInCollectionV2", "off");

        /* renamed from: e */
        public static final EtsyConfigKey f18875e = new EtsyConfigKey("CFNewFavoritesNavPart1", "off");

        /* renamed from: f */
        public static final EtsyConfigKey f18876f = new EtsyConfigKey("CFNewFavoritesNavPart2", "off");

        /* renamed from: g */
        public static final EtsyConfigKey f18877g = new EtsyConfigKey("CFGreenFreeShippingBadge", "off");

        /* renamed from: h */
        public static final EtsyConfigKey f18878h = new EtsyConfigKey("BOENewListingCardsPriceUX", "off");

        /* renamed from: i */
        public static final EtsyConfigKey f18879i = new EtsyConfigKey("CFRemoveTitleOnFaveListingCards", "off");

        /* renamed from: j */
        public static final EtsyConfigKey f18880j = new EtsyConfigKey("APPEFavoriteClusters", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$g */
    public static final class C8599g {

        /* renamed from: a */
        public static final EtsyConfigKey f18881a = new EtsyConfigKey("DEEP_LINK_ERROR_REPORTING_RATE_LEGACY", "100");

        /* renamed from: b */
        public static final EtsyConfigKey f18882b = new EtsyConfigKey("DEEP_LINK_ERROR_REPORTING_RATE", "100");

        /* renamed from: c */
        public static final EtsyConfigKey f18883c = new EtsyConfigKey("BOEEtsyRouteDeepLinkRefactor", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$h */
    public interface C8600h {

        /* renamed from: a */
        public static final EtsyConfigKey f18884a = new EtsyConfigKey("EtsyGraphite.TimeFragmentLaunchSampleRate", EditableListing.LISTING_ID_DEVICE_DRAFT);

        /* renamed from: b */
        public static final EtsyConfigKey f18885b = new EtsyConfigKey("EtsyGraphite.LegacyNavSampleRate", "0.1");

        /* renamed from: c */
        public static final EtsyConfigKey f18886c = new EtsyConfigKey("EtsyGraphite.LegacyNavPerformance", "on");
    }

    /* renamed from: com.etsy.android.lib.config.b$i */
    public static final class C8601i {

        /* renamed from: a */
        public static final EtsyConfigKey f18887a = new EtsyConfigKey("BOECustomListingImageSize", "on");

        /* renamed from: b */
        public static final EtsyConfigKey f18888b = new EtsyConfigKey("BOEListingShopRedesign", "off");

        /* renamed from: c */
        public static final EtsyConfigKey f18889c = new EtsyConfigKey("ProgressiveJPEGImageURLHost", "pilot.i.etsystatic.com");

        /* renamed from: d */
        public static final EtsyConfigKey f18890d;

        /* renamed from: e */
        public static final EtsyConfigKey f18891e = new EtsyConfigKey("BOEListingScreenHeaderUpdatesQ22022", "off");

        /* renamed from: f */
        public static final EtsyConfigKey f18892f = new EtsyConfigKey("BOEReorderReviewsPanel", "off");

        /* renamed from: g */
        public static final EtsyConfigKey f18893g = new EtsyConfigKey("BOEShowSalePriceOnMoreFromShop", "off");

        /* renamed from: h */
        public static final EtsyConfigKey f18894h = new EtsyConfigKey("BOEItemDetailUpdates", "off");

        /* renamed from: i */
        public static final EtsyConfigKey f18895i = new EtsyConfigKey("BOENativeBuyItNowCheckout", "off");

        /* renamed from: j */
        public static final EtsyConfigKey f18896j = new EtsyConfigKey("BOEImageThumbnailsOnVariationSheet2022Q3", "off");

        /* renamed from: k */
        public static final EtsyConfigKey f18897k = new EtsyConfigKey("BOEShowShippingPriceWithListingPrice", "off");

        /* renamed from: l */
        public static final EtsyConfigKey f18898l = new EtsyConfigKey("BOEListingScreenTappableReviewSummary", "off");

        static {
            EtsyConfigKey etsyConfigKey = new EtsyConfigKey("BOEProgressiveJPEGEnabled", "off");
            etsyConfigKey.mo21100a(BuildTarget.INTERNAL, "on");
            f18890d = etsyConfigKey;
        }
    }

    /* renamed from: com.etsy.android.lib.config.b$j */
    public static final class C8602j {

        /* renamed from: a */
        public static final EtsyConfigKey f18899a = new EtsyConfigKey("EnableMoshiParsing", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18900b = new EtsyConfigKey("TestMoshiConfig", "on");

        /* renamed from: c */
        public static final EtsyConfigKey f18901c = new EtsyConfigKey("UserCountersMoshiParsing", "on");
    }

    /* renamed from: com.etsy.android.lib.config.b$k */
    public static final class C8603k {

        /* renamed from: a */
        public static final EtsyConfigKey f18902a;

        /* renamed from: b */
        public static final EtsyConfigKey f18903b;

        /* renamed from: c */
        public static final EtsyConfigKey f18904c;

        static {
            EtsyConfigKey etsyConfigKey = new EtsyConfigKey("BOEUsePayPalNativeCheckoutTry3", "off");
            etsyConfigKey.mo21100a(BuildTarget.INTERNAL, "on");
            f18902a = etsyConfigKey;
            EtsyConfigKey etsyConfigKey2 = new EtsyConfigKey("PayPalNativeCheckout.paypal_url_to_intercept", "https://www.paypal.com/checkoutnow");
            EtsyConfigKey.Environment environment = EtsyConfigKey.Environment.DEVELOPMENT;
            etsyConfigKey2.mo21101b(environment, "https://www.sandbox.paypal.com/checkoutnow");
            f18903b = etsyConfigKey2;
            EtsyConfigKey etsyConfigKey3 = new EtsyConfigKey("PayPalNativeCheckout.paypal_client_id", "AT5JfZGp-eIiOgbmxwNvWw9r20Ni7xiQHnZP8-a-0l7qS5-QheGbu2pVcMaKmnXtbZRbeEQPmukxRbGT");
            etsyConfigKey3.mo21101b(environment, "AV6wySkJqhcLJrQRdhAZKGnjYhZad1s4WQR1sTk0N9wkBlZCVP6YmfuieASIhZ8VsePXu-aTMga4J7Xd");
            f18904c = etsyConfigKey3;
        }
    }

    /* renamed from: com.etsy.android.lib.config.b$l */
    public static final class C8604l {

        /* renamed from: a */
        public static final EtsyConfigKey f18905a = new EtsyConfigKey("Payments.GooglePay", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18906b = new EtsyConfigKey("Payments.GooglePayMSCO", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$m */
    public static final class C8605m {

        /* renamed from: a */
        public static final EtsyConfigKey f18907a = new EtsyConfigKey("MaxRetryCount", "3");

        /* renamed from: b */
        public static final EtsyConfigKey f18908b = new EtsyConfigKey("RetryDelayInSeconds", "60");
    }

    /* renamed from: com.etsy.android.lib.config.b$n */
    public static final class C8606n {

        /* renamed from: a */
        public static final EtsyConfigKey f18909a = new EtsyConfigKey("QualtricsBOE", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18910b = new EtsyConfigKey("QualtricsBOEBrandId", "etsy");

        /* renamed from: c */
        public static final EtsyConfigKey f18911c = new EtsyConfigKey("QualtricsUpdatedBOEInterceptID", "SI_2sOVu7HyX8N7pZ3");

        /* renamed from: d */
        public static final EtsyConfigKey f18912d = new EtsyConfigKey("QualtricsBOEKillSwitch", "on");

        /* renamed from: e */
        public static final EtsyConfigKey f18913e = new EtsyConfigKey("BOEQualtricsSurvey", "off");
    }

    /* renamed from: com.etsy.android.lib.config.b$o */
    public static final class C8607o {

        /* renamed from: a */
        public static final EtsyConfigKey f18914a = new EtsyConfigKey("BOEShopHomeReviewsUpdates2022Q3Try2", "off");

        /* renamed from: b */
        public static final EtsyConfigKey f18915b = new EtsyConfigKey("BOEShopHomeReviewsSectionTitleTappable", "off");

        /* renamed from: c */
        public static final EtsyConfigKey f18916c = new EtsyConfigKey("BOEShopHomeRefactor2023Q1", "off");
    }

    static {
        EtsyConfigKey etsyConfigKey = new EtsyConfigKey("UnbindDrawables", "off");
        BuildTarget buildTarget = BuildTarget.INTERNAL;
        etsyConfigKey.mo21100a(buildTarget, "on");
        f18724C = etsyConfigKey;
        EtsyConfigKey etsyConfigKey2 = new EtsyConfigKey("ConstrainSampledImages", "off");
        etsyConfigKey2.mo21100a(buildTarget, "on");
        f18727D = etsyConfigKey2;
        EtsyConfigKey etsyConfigKey3 = new EtsyConfigKey("ServerGoogleClientId", "296956783393-2d8r0gljo87gjmdpmvkgbeasdmelq33e.apps.googleusercontent.com");
        etsyConfigKey3.mo21101b(EtsyConfigKey.Environment.DEVELOPMENT, "296956783393-nst0e0cfni3i05k7cs22tmlgahiiuts5.apps.googleusercontent.com");
        f18735H = etsyConfigKey3;
        String[] strArr = C14088a.f31024e;
        StringBuilder sb = new StringBuilder(60);
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(str);
        }
        f18749O = new EtsyConfigKey("EtsyAnalyticsLoggingRequestHeaders", sb.toString());
        EtsyConfigKey etsyConfigKey4 = new EtsyConfigKey("ETSY_ENDPOINT", "https://www.etsy.com");
        EtsyConfigKey.Environment environment = EtsyConfigKey.Environment.PRINCESS;
        etsyConfigKey4.mo21101b(environment, "https://princess.etsy.com");
        f18819p0 = etsyConfigKey4;
        EtsyConfigKey etsyConfigKey5 = new EtsyConfigKey("API_HOST", "https://openapi.etsy.com");
        etsyConfigKey5.mo21101b(environment, "https://princess-openapi.etsy.com");
        f18822q0 = etsyConfigKey5;
        EtsyConfigKey etsyConfigKey6 = new EtsyConfigKey("API_V3_ENDPOINT", "https://openapi.etsy.com/etsyapps/v3");
        etsyConfigKey6.mo21101b(environment, "https://princess-openapi.etsy.com/etsyapps/v3");
        f18825r0 = etsyConfigKey6;
        EtsyConfigKey etsyConfigKey7 = new EtsyConfigKey("API_V3_NEXT_ENDPOINT", "https://openapi.etsy.com");
        etsyConfigKey7.mo21101b(environment, "https://princess-openapi.etsy.com");
        f18828s0 = etsyConfigKey7;
        EtsyConfigKey etsyConfigKey8 = new EtsyConfigKey("EVENT_HORIZON_ENDPOINT", "ws://kafkautil01.ny5.etsy.com:8080/websocket");
        etsyConfigKey8.mo21101b(environment, "ws://princess.etsy.com/bcn/debug/ws");
        f18831t0 = etsyConfigKey8;
        EtsyConfigKey etsyConfigKey9 = new EtsyConfigKey("ICHT_ENDPOINT", "https://icht.etsysecure.com");
        etsyConfigKey9.mo21101b(environment, "https://stageicht.etsysecure.com");
        EtsyConfigKey.Environment environment2 = EtsyConfigKey.Environment.DEVELOPMENT;
        etsyConfigKey9.mo21101b(environment2, "https://devicht.etsysecure.com");
        f18834u0 = etsyConfigKey9;
        EtsyConfigKey etsyConfigKey10 = new EtsyConfigKey("GRAPH_QL_ENDPOINT", "");
        etsyConfigKey10.mo21101b(environment, "");
        f18837v0 = etsyConfigKey10;
        EtsyConfigKey etsyConfigKey11 = new EtsyConfigKey("BOEGiftGuideResultsInAutosuggest", "off");
        BuildTarget buildTarget2 = BuildTarget.INTERNAL;
        etsyConfigKey11.mo21100a(buildTarget2, "on");
        f18748N0 = etsyConfigKey11;
        EtsyConfigKey etsyConfigKey12 = new EtsyConfigKey("BOEGuidedSearchPillRedesign2019Q3", "off");
        etsyConfigKey12.mo21100a(buildTarget2, "on");
        f18756R0 = etsyConfigKey12;
        EtsyConfigKey etsyConfigKey13 = new EtsyConfigKey("BOEInlineGuidedSearchRowOffset2019Q3", "off");
        etsyConfigKey13.mo21100a(buildTarget2, "ten");
        f18758S0 = etsyConfigKey13;
        EtsyConfigKey etsyConfigKey14 = new EtsyConfigKey("BOEProlistInCategoryResultsAndSimilarListings", "off");
        etsyConfigKey14.mo21100a(buildTarget2, "on");
        f18760T0 = etsyConfigKey14;
        EtsyConfigKey etsyConfigKey15 = new EtsyConfigKey("BOEVisualInlineGuidedSearch2019Q3", "off");
        etsyConfigKey15.mo21100a(buildTarget2, "on");
        f18768X0 = etsyConfigKey15;
        EtsyConfigKey etsyConfigKey16 = new EtsyConfigKey("BOEBadgeSavedSearchesInSearchInterstitial2020Q3", "off");
        etsyConfigKey16.mo21100a(buildTarget2, "on");
        f18770Y0 = etsyConfigKey16;
        EtsyConfigKey etsyConfigKey17 = new EtsyConfigKey("BOEInAppReviewPromptEnabledAfterPurchase", "off");
        etsyConfigKey17.mo21100a(buildTarget2, "on");
        f18781c1 = etsyConfigKey17;
        EtsyConfigKey etsyConfigKey18 = new EtsyConfigKey("BOEInAppReviewPromptEnabledAfterReview", "off");
        etsyConfigKey18.mo21100a(buildTarget2, "on");
        f18784d1 = etsyConfigKey18;
        EtsyConfigKey etsyConfigKey19 = new EtsyConfigKey("BOEAccessibilityChecks", "off");
        etsyConfigKey19.mo21100a(buildTarget2, "on");
        f18787e1 = etsyConfigKey19;
        EtsyConfigKey etsyConfigKey20 = new EtsyConfigKey("BOESplitListingAndShopReviews", "off");
        etsyConfigKey20.mo21100a(buildTarget2, "on");
        f18793g1 = etsyConfigKey20;
        EtsyConfigKey etsyConfigKey21 = new EtsyConfigKey("BOESplitListingAndShopReviewsTry2", "off");
        etsyConfigKey21.mo21100a(buildTarget2, "on");
        f18796h1 = etsyConfigKey21;
        EtsyConfigKey etsyConfigKey22 = new EtsyConfigKey("BOESearchListingVariationPriceIndicator", "off");
        etsyConfigKey22.mo21101b(environment2, "on");
        f18844x1 = etsyConfigKey22;
        EtsyConfigKey etsyConfigKey23 = new EtsyConfigKey("ThreeArmSweaterLoggingRate", String.valueOf(0));
        etsyConfigKey23.mo21100a(buildTarget2, String.valueOf(100));
        f18720A1 = etsyConfigKey23;
        EtsyConfigKey etsyConfigKey24 = new EtsyConfigKey("BOEPushOptInFatigueEnabled", "off");
        etsyConfigKey24.mo21100a(buildTarget2, "on");
        f18723B1 = etsyConfigKey24;
    }
}
