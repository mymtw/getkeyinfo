package com.paypal.pyplcheckout.common.instrumentation;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.conversation.MessageDraft;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.CheckoutMerchant;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.utils.NetworkUtils;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import com.paypal.pyplcheckout.utils.VersionUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.Regex;
import p003a2.C0015b;
import p003a2.C0023f;

public final class InstrumentationEvent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "InstrumentationEvent";
    private String _tenant;
    private String acct_cntry;
    private String app_guid;
    private String app_name;
    private String auth_sdk_version;
    private String browser_type;
    private String button_session_id;
    private String button_version;
    private String buyer_cntry;
    private String buyer_type;
    private String channel;
    private String child_name;
    private String component;
    private String connectivity_status;
    private String context_id;
    private String context_type;
    private String correlation_id;
    private String destination_screen;
    private Integer duration;
    private String encr_cust_id;
    private String encr_rcvr_id;
    private String env_name;
    private String error_details;
    private String error_type;
    private String event_name;
    private String event_source;
    private String event_type;
    private String experimentation_experience;
    private String experimentation_treatment;
    private String ext_error_code;
    private String fallback_category;
    private String fallback_from;
    private String fallback_reason;
    private String fallback_to;
    private String fb_session_id;
    private String fi_id;
    private String field_name;
    private String flowtype;
    private String funding_source;
    private String info_msg;
    private String int_error_code;
    private String int_error_desc;
    private String mapv;
    private String mdvs;
    private String mobile_app_version;
    private String mosv;
    private String order_session_id;
    private String origin_screen;
    private String outcome;
    private String parent_name;
    private String payload_sent;
    private String product;
    private String sdk_environment;
    private String sdk_session_id;
    private String sdk_ver;
    private String sdkv;
    private String stage;
    private String startup_mechanism;
    private String state_name;

    /* renamed from: t */
    private Long f37725t;
    private String tenant_type;
    private String token;
    private String transition_name;
    private String user_id;
    private String view_name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class InstrumentationEventBuilder {
        private String appGuidInfo;
        private String authSdkVersion;
        private String childName;
        private String component;
        private String correlation_id;
        private String destinationScreen;
        private String env;
        private String errorDetails;
        private String errorMsg;
        private String errorType;
        private String eventType;
        private String experimentationExperience;
        private String experimentationTreatment;
        private String extErrorCode;
        private String fallbackCategory;
        private String fallbackFrom;
        private String fallbackReason;
        private String fallbackTo;
        private String fieldName;
        private String infoMsg;
        private String intErrorCode;
        private String originScreen;
        private String outcome;
        private String parentName;
        private String payloadSent;
        private String stateName;
        private String transactionChannel;
        private String transitionName;
        private String viewName;

        public static final class AppBuildModel {
            public static final AppBuildModel INSTANCE = new AppBuildModel();

            private AppBuildModel() {
            }

            public final String buildModel() {
                String str = Build.MODEL;
                if (str == null) {
                    return "TEST_MODEL";
                }
                C19383o.m32796f(str, "MODEL");
                return StringExtensionsKt.lowercase(new Regex(" ").replace((CharSequence) str, "_"));
            }
        }

        public InstrumentationEventBuilder() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null);
        }

        public InstrumentationEventBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
            this.eventType = str;
            this.errorType = str2;
            this.extErrorCode = str3;
            this.intErrorCode = str4;
            this.errorMsg = str5;
            this.errorDetails = str6;
            this.outcome = str7;
            this.viewName = str8;
            this.transitionName = str9;
            this.fallbackReason = str10;
            this.fallbackTo = str11;
            this.fallbackCategory = str12;
            this.fallbackFrom = str13;
            this.originScreen = str14;
            this.destinationScreen = str15;
            this.childName = str16;
            this.parentName = str17;
            this.stateName = str18;
            this.payloadSent = str19;
            this.infoMsg = str20;
            this.experimentationExperience = str21;
            this.experimentationTreatment = str22;
            this.fieldName = str23;
            this.transactionChannel = str24;
            this.correlation_id = str25;
            this.env = str26;
            this.component = str27;
            this.authSdkVersion = str28;
            this.appGuidInfo = str29;
        }

        public static /* synthetic */ InstrumentationEventBuilder copy$default(InstrumentationEventBuilder instrumentationEventBuilder, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, Object obj) {
            InstrumentationEventBuilder instrumentationEventBuilder2 = instrumentationEventBuilder;
            int i2 = i;
            return instrumentationEventBuilder.copy((i2 & 1) != 0 ? instrumentationEventBuilder2.eventType : str, (i2 & 2) != 0 ? instrumentationEventBuilder2.errorType : str2, (i2 & 4) != 0 ? instrumentationEventBuilder2.extErrorCode : str3, (i2 & 8) != 0 ? instrumentationEventBuilder2.intErrorCode : str4, (i2 & 16) != 0 ? instrumentationEventBuilder2.errorMsg : str5, (i2 & 32) != 0 ? instrumentationEventBuilder2.errorDetails : str6, (i2 & 64) != 0 ? instrumentationEventBuilder2.outcome : str7, (i2 & 128) != 0 ? instrumentationEventBuilder2.viewName : str8, (i2 & 256) != 0 ? instrumentationEventBuilder2.transitionName : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? instrumentationEventBuilder2.fallbackReason : str10, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? instrumentationEventBuilder2.fallbackTo : str11, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? instrumentationEventBuilder2.fallbackCategory : str12, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? instrumentationEventBuilder2.fallbackFrom : str13, (i2 & 8192) != 0 ? instrumentationEventBuilder2.originScreen : str14, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? instrumentationEventBuilder2.destinationScreen : str15, (i2 & 32768) != 0 ? instrumentationEventBuilder2.childName : str16, (i2 & 65536) != 0 ? instrumentationEventBuilder2.parentName : str17, (i2 & 131072) != 0 ? instrumentationEventBuilder2.stateName : str18, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? instrumentationEventBuilder2.payloadSent : str19, (i2 & 524288) != 0 ? instrumentationEventBuilder2.infoMsg : str20, (i2 & 1048576) != 0 ? instrumentationEventBuilder2.experimentationExperience : str21, (i2 & 2097152) != 0 ? instrumentationEventBuilder2.experimentationTreatment : str22, (i2 & 4194304) != 0 ? instrumentationEventBuilder2.fieldName : str23, (i2 & 8388608) != 0 ? instrumentationEventBuilder2.transactionChannel : str24, (i2 & 16777216) != 0 ? instrumentationEventBuilder2.correlation_id : str25, (i2 & 33554432) != 0 ? instrumentationEventBuilder2.env : str26, (i2 & 67108864) != 0 ? instrumentationEventBuilder2.component : str27, (i2 & 134217728) != 0 ? instrumentationEventBuilder2.authSdkVersion : str28, (i2 & 268435456) != 0 ? instrumentationEventBuilder2.appGuidInfo : str29);
        }

        private final String getAndroidVersion() {
            int i = Build.VERSION.SDK_INT;
            String str = Build.VERSION.RELEASE;
            return "Android OS: " + i + " (" + str + ")";
        }

        private final String getApplicationName() {
            return "";
        }

        private final String getApplicationPackageName() {
            Context applicationContext = getDebugConfigManager().getApplicationContext();
            if (applicationContext == null) {
                return "UndeterminedAndroidPackage";
            }
            String packageName = applicationContext.getApplicationContext().getPackageName();
            C19383o.m32796f(packageName, "appContext.applicationContext.packageName");
            return packageName;
        }

        private final String getBrowserType() {
            return PYPLCheckoutUtils.Companion.getInstance().getBrowserType();
        }

        private final String getButtonSessionId() {
            return SdkComponent.Companion.getInstance().getRepository().getSmartPaymentButtonSessionId();
        }

        private final String getBuyerCntry() {
            String buyerIPCountry = getDebugConfigManager().getBuyerIPCountry();
            return buyerIPCountry == null ? " " : buyerIPCountry;
        }

        private final long getCalculateTimeStamp() {
            return System.currentTimeMillis();
        }

        private final String getChannel() {
            return String.valueOf(getDebugConfigManager().getPayPalChannelInfo());
        }

        private final String getCheckoutEnvironment() {
            return getDebugConfigManager().getCheckoutEnvironment().getCurrentMerchantPayPalEnvironment().toString();
        }

        private final String getConnectivityStatus() {
            NetworkUtils networkUtils = NetworkUtils.INSTANCE;
            return C0015b.m90i("Internet connectivity:", networkUtils.isNetworkConnected() ? "connected" : "disconnected", MessageDraft.IMAGE_DELIMITER, StringExtensionsKt.lowercase(networkUtils.getConnectionType()));
        }

        private final DebugConfigManager getDebugConfigManager() {
            DebugConfigManager instance = DebugConfigManager.getInstance();
            C19383o.m32796f(instance, "getInstance()");
            return instance;
        }

        private final String getDeviceId() {
            ContentResolver contentResolver;
            Context applicationContext = getDebugConfigManager().getApplicationContext();
            String str = null;
            if (!(applicationContext == null || (contentResolver = applicationContext.getContentResolver()) == null)) {
                str = Settings.Secure.getString(contentResolver, "android_id");
            }
            return str == null ? AppBuildModel.INSTANCE.buildModel() : str;
        }

        private final String getEcToken() {
            if (getDebugConfigManager().getCheckoutToken() == null) {
                return "Ec token: n/a, have not started auth yet";
            }
            String checkoutToken = getDebugConfigManager().getCheckoutToken();
            C19383o.m32796f(checkoutToken, "debugConfigManager.checkoutToken");
            return checkoutToken;
        }

        private final String getEncryptedCustomerId() {
            String userId = getDebugConfigManager().getUserId();
            C19383o.m32796f(userId, "debugConfigManager.userId");
            return userId;
        }

        private final String getEncryptedMerchantId() {
            CheckoutMerchant merchant;
            if (!getDebugConfigManager().isSmartPaymentCheckout()) {
                return getDebugConfigManager().getClientId();
            }
            CheckoutSession checkoutSession = getDebugConfigManager().getCheckoutSession();
            if (checkoutSession == null || (merchant = checkoutSession.getMerchant()) == null) {
                return null;
            }
            return merchant.getMerchantId();
        }

        private final String getFiId() {
            FundingOption selectedFundingOption = SdkComponent.Companion.getInstance().getRepository().getSelectedFundingOption();
            if (selectedFundingOption == null) {
                return null;
            }
            return selectedFundingOption.getId();
        }

        private final String getFlowType() {
            return "old";
        }

        private final String getGetAcctCntry() {
            User user = SdkComponent.Companion.getInstance().getRepository().getUser();
            String country = user == null ? null : user.getCountry();
            if (country != null) {
                String access$getTAG$cp = InstrumentationEvent.TAG;
                C19383o.m32796f(access$getTAG$cp, "TAG");
                PLog.d$default(access$getTAG$cp, "get account country " + country, 0, 4, (Object) null);
                return country;
            }
            String access$getTAG$cp2 = InstrumentationEvent.TAG;
            C19383o.m32796f(access$getTAG$cp2, "TAG");
            PLog.w$default(access$getTAG$cp2, "country is null", 0, 4, (Object) null);
            return " ";
        }

        private final int getGetDuration() {
            return (int) (System.currentTimeMillis() - DebugConfigManager.getInstance().getSDKLaunchTime());
        }

        private final String getRetrieveProductName() {
            String productName = DebugConfigManager.getInstance().getProductName();
            return productName == null ? "nativexo-venice" : productName;
        }

        private final String getSdkSessionId() {
            return SdkComponent.Companion.getInstance().getInstrumentationSession().getSdkSessionId();
        }

        private final String getSdkVersion() {
            return VersionUtils.INSTANCE.getSdkVersion();
        }

        private final String getStage() {
            PEnums.Stage stage = SdkComponent.Companion.getInstance().getRepository().getStage();
            if (stage == null) {
                return null;
            }
            return stage.name();
        }

        private final String getStartupMechanism() {
            return getDebugConfigManager().isSmartPaymentCheckout() ? PEnums.StartupMechanism.WSPB.toString() : SdkComponent.Companion.getInstance().getRepository().getStartupMechanism();
        }

        private final String getTenantType() {
            return getDebugConfigManager().isSmartPaymentCheckout() ? "1p" : "3p";
        }

        private final String getUserId() {
            return getButtonSessionId();
        }

        public final InstrumentationEventBuilder appGuidInfo(String str) {
            setAppGuidInfo(str);
            return this;
        }

        public final InstrumentationEventBuilder authSdkVersion(String str) {
            setAuthSdkVersion(str);
            return this;
        }

        public final InstrumentationEvent build() {
            String tenantType = getTenantType();
            String retrieveProductName = getRetrieveProductName();
            String str = this.component;
            String str2 = str == null || C19457k.m33020X0(str) ? "nativexosdk" : this.component;
            String hostVersionName = getDebugConfigManager().getHostVersionName();
            String sdkVersion = getSdkVersion();
            String sdkVersion2 = getSdkVersion();
            String buttonVersion = DebugConfigManager.getInstance().getButtonVersion();
            String ecToken = getEcToken();
            String buttonSessionId = getButtonSessionId();
            String str3 = this.eventType;
            String str4 = this.errorType;
            String str5 = this.extErrorCode;
            String str6 = this.intErrorCode;
            String str7 = this.errorMsg;
            String str8 = this.errorDetails;
            String encryptedCustomerId = getEncryptedCustomerId();
            String encryptedMerchantId = getEncryptedMerchantId();
            String getAcctCntry = getGetAcctCntry();
            String applicationName = getApplicationName();
            String applicationPackageName = getApplicationPackageName();
            String androidVersion = getAndroidVersion();
            String deviceId = getDeviceId();
            Long valueOf = Long.valueOf(getCalculateTimeStamp());
            String str9 = str3;
            String str10 = this.outcome;
            String str11 = this.viewName;
            String str12 = this.transitionName;
            String str13 = this.fallbackReason;
            String str14 = this.fallbackTo;
            String str15 = this.fallbackCategory;
            String str16 = this.fallbackFrom;
            String str17 = this.originScreen;
            String str18 = this.destinationScreen;
            String str19 = this.childName;
            String str20 = this.parentName;
            String fiId = getFiId();
            String str21 = str20;
            String str22 = this.stateName;
            String str23 = this.payloadSent;
            Integer valueOf2 = Integer.valueOf(getGetDuration());
            String str24 = str23;
            String str25 = this.infoMsg;
            String firebaseSessionId = DebugConfigManager.getInstance().getFirebaseSessionId();
            if (firebaseSessionId == null) {
                firebaseSessionId = "NOT_PROVIDED";
            }
            String str26 = str19;
            String str27 = str21;
            String str28 = str24;
            String str29 = str17;
            String str30 = str12;
            return new InstrumentationEvent("merchant_sdk", tenantType, "mobile-native", retrieveProductName, str2, hostVersionName, sdkVersion, sdkVersion2, buttonVersion, ecToken, buttonSessionId, "EC-Token", "member", str9, str4, str5, str6, str7, str8, encryptedCustomerId, encryptedMerchantId, getAcctCntry, applicationName, applicationPackageName, androidVersion, deviceId, valueOf, str10, str11, str30, str30, str13, str14, str15, str16, str29, str18, str26, str27, fiId, str22, str28, valueOf2, str25, "android", firebaseSessionId, DebugConfigManager.getInstance().getFundingSource(), getBrowserType(), getFlowType(), getUserId(), this.experimentationExperience, this.experimentationTreatment, getBuyerCntry(), getStage(), this.fieldName, getChannel(), getConnectivityStatus(), getEcToken(), getSdkSessionId(), SdkComponent.Companion.getInstance().getInstrumentationSession().getOrderSessionId(), this.correlation_id, getCheckoutEnvironment(), getStartupMechanism(), this.authSdkVersion, this.appGuidInfo, (DefaultConstructorMarker) null);
        }

        public final InstrumentationEventBuilder childName(String str) {
            setChildName(str);
            return this;
        }

        public final InstrumentationEventBuilder component(String str) {
            setComponent(str);
            return this;
        }

        public final String component1() {
            return this.eventType;
        }

        public final String component10() {
            return this.fallbackReason;
        }

        public final String component11() {
            return this.fallbackTo;
        }

        public final String component12() {
            return this.fallbackCategory;
        }

        public final String component13() {
            return this.fallbackFrom;
        }

        public final String component14() {
            return this.originScreen;
        }

        public final String component15() {
            return this.destinationScreen;
        }

        public final String component16() {
            return this.childName;
        }

        public final String component17() {
            return this.parentName;
        }

        public final String component18() {
            return this.stateName;
        }

        public final String component19() {
            return this.payloadSent;
        }

        public final String component2() {
            return this.errorType;
        }

        public final String component20() {
            return this.infoMsg;
        }

        public final String component21() {
            return this.experimentationExperience;
        }

        public final String component22() {
            return this.experimentationTreatment;
        }

        public final String component23() {
            return this.fieldName;
        }

        public final String component24() {
            return this.transactionChannel;
        }

        public final String component25() {
            return this.correlation_id;
        }

        public final String component26() {
            return this.env;
        }

        public final String component27() {
            return this.component;
        }

        public final String component28() {
            return this.authSdkVersion;
        }

        public final String component29() {
            return this.appGuidInfo;
        }

        public final String component3() {
            return this.extErrorCode;
        }

        public final String component4() {
            return this.intErrorCode;
        }

        public final String component5() {
            return this.errorMsg;
        }

        public final String component6() {
            return this.errorDetails;
        }

        public final String component7() {
            return this.outcome;
        }

        public final String component8() {
            return this.viewName;
        }

        public final String component9() {
            return this.transitionName;
        }

        public final InstrumentationEventBuilder copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
            return new InstrumentationEventBuilder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29);
        }

        public final InstrumentationEventBuilder correlationId(String str) {
            setCorrelation_id(str);
            return this;
        }

        public final InstrumentationEventBuilder destinationScreen(String str) {
            setDestinationScreen(str);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentationEventBuilder)) {
                return false;
            }
            InstrumentationEventBuilder instrumentationEventBuilder = (InstrumentationEventBuilder) obj;
            return C19383o.m32792b(this.eventType, instrumentationEventBuilder.eventType) && C19383o.m32792b(this.errorType, instrumentationEventBuilder.errorType) && C19383o.m32792b(this.extErrorCode, instrumentationEventBuilder.extErrorCode) && C19383o.m32792b(this.intErrorCode, instrumentationEventBuilder.intErrorCode) && C19383o.m32792b(this.errorMsg, instrumentationEventBuilder.errorMsg) && C19383o.m32792b(this.errorDetails, instrumentationEventBuilder.errorDetails) && C19383o.m32792b(this.outcome, instrumentationEventBuilder.outcome) && C19383o.m32792b(this.viewName, instrumentationEventBuilder.viewName) && C19383o.m32792b(this.transitionName, instrumentationEventBuilder.transitionName) && C19383o.m32792b(this.fallbackReason, instrumentationEventBuilder.fallbackReason) && C19383o.m32792b(this.fallbackTo, instrumentationEventBuilder.fallbackTo) && C19383o.m32792b(this.fallbackCategory, instrumentationEventBuilder.fallbackCategory) && C19383o.m32792b(this.fallbackFrom, instrumentationEventBuilder.fallbackFrom) && C19383o.m32792b(this.originScreen, instrumentationEventBuilder.originScreen) && C19383o.m32792b(this.destinationScreen, instrumentationEventBuilder.destinationScreen) && C19383o.m32792b(this.childName, instrumentationEventBuilder.childName) && C19383o.m32792b(this.parentName, instrumentationEventBuilder.parentName) && C19383o.m32792b(this.stateName, instrumentationEventBuilder.stateName) && C19383o.m32792b(this.payloadSent, instrumentationEventBuilder.payloadSent) && C19383o.m32792b(this.infoMsg, instrumentationEventBuilder.infoMsg) && C19383o.m32792b(this.experimentationExperience, instrumentationEventBuilder.experimentationExperience) && C19383o.m32792b(this.experimentationTreatment, instrumentationEventBuilder.experimentationTreatment) && C19383o.m32792b(this.fieldName, instrumentationEventBuilder.fieldName) && C19383o.m32792b(this.transactionChannel, instrumentationEventBuilder.transactionChannel) && C19383o.m32792b(this.correlation_id, instrumentationEventBuilder.correlation_id) && C19383o.m32792b(this.env, instrumentationEventBuilder.env) && C19383o.m32792b(this.component, instrumentationEventBuilder.component) && C19383o.m32792b(this.authSdkVersion, instrumentationEventBuilder.authSdkVersion) && C19383o.m32792b(this.appGuidInfo, instrumentationEventBuilder.appGuidInfo);
        }

        public final InstrumentationEventBuilder errorDetails(String str) {
            setErrorDetails(str);
            return this;
        }

        public final InstrumentationEventBuilder errorMessage(String str) {
            setErrorMsg(str);
            return this;
        }

        public final InstrumentationEventBuilder errorType(String str) {
            setErrorType(str);
            return this;
        }

        public final InstrumentationEventBuilder eventType(PEnums.EventType eventType2) {
            C19383o.m32797g(eventType2, "eventType");
            setEventType(eventType2.toString());
            return this;
        }

        public final InstrumentationEventBuilder experimentationExperience(String str) {
            setExperimentationExperience(str);
            return this;
        }

        public final InstrumentationEventBuilder experimentationTreatment(String str) {
            setExperimentationTreatment(str);
            return this;
        }

        public final InstrumentationEventBuilder extErrorCode(String str) {
            setExtErrorCode(str);
            return this;
        }

        public final InstrumentationEventBuilder fallBackCategory(PEnums.FallbackCategory fallbackCategory2) {
            setFallbackCategory(String.valueOf(fallbackCategory2));
            return this;
        }

        public final InstrumentationEventBuilder fallBackFrom(String str) {
            setFallbackFrom(str);
            return this;
        }

        public final InstrumentationEventBuilder fallBackReason(PEnums.FallbackReason fallbackReason2) {
            setFallbackReason(String.valueOf(fallbackReason2));
            return this;
        }

        public final InstrumentationEventBuilder fallBackTo(String str) {
            setFallbackTo(str);
            return this;
        }

        public final InstrumentationEventBuilder fieldName(String str) {
            setFieldName(str);
            return this;
        }

        public final String getAppGuidInfo() {
            return this.appGuidInfo;
        }

        public final String getAuthSdkVersion() {
            return this.authSdkVersion;
        }

        public final String getChildName() {
            return this.childName;
        }

        public final String getComponent() {
            return this.component;
        }

        public final String getCorrelation_id() {
            return this.correlation_id;
        }

        public final String getDestinationScreen() {
            return this.destinationScreen;
        }

        public final String getEnv() {
            return this.env;
        }

        public final String getErrorDetails() {
            return this.errorDetails;
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public final String getEventType() {
            return this.eventType;
        }

        public final String getExperimentationExperience() {
            return this.experimentationExperience;
        }

        public final String getExperimentationTreatment() {
            return this.experimentationTreatment;
        }

        public final String getExtErrorCode() {
            return this.extErrorCode;
        }

        public final String getFallbackCategory() {
            return this.fallbackCategory;
        }

        public final String getFallbackFrom() {
            return this.fallbackFrom;
        }

        public final String getFallbackReason() {
            return this.fallbackReason;
        }

        public final String getFallbackTo() {
            return this.fallbackTo;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final String getInfoMsg() {
            return this.infoMsg;
        }

        public final String getIntErrorCode() {
            return this.intErrorCode;
        }

        public final String getOriginScreen() {
            return this.originScreen;
        }

        public final String getOutcome() {
            return this.outcome;
        }

        public final String getParentName() {
            return this.parentName;
        }

        public final String getPayloadSent() {
            return this.payloadSent;
        }

        public final String getStateName() {
            return this.stateName;
        }

        public final String getTransactionChannel() {
            return this.transactionChannel;
        }

        public final String getTransitionName() {
            return this.transitionName;
        }

        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            String str = this.eventType;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extErrorCode;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.intErrorCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorMsg;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDetails;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.outcome;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.viewName;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.transitionName;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.fallbackReason;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.fallbackTo;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.fallbackCategory;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.fallbackFrom;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.originScreen;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.destinationScreen;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.childName;
            int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.parentName;
            int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.stateName;
            int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.payloadSent;
            int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.infoMsg;
            int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.experimentationExperience;
            int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.experimentationTreatment;
            int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.fieldName;
            int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.transactionChannel;
            int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.correlation_id;
            int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.env;
            int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.component;
            int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.authSdkVersion;
            int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
            String str29 = this.appGuidInfo;
            if (str29 != null) {
                i = str29.hashCode();
            }
            return hashCode28 + i;
        }

        public final InstrumentationEventBuilder infoMessage(String str) {
            setInfoMsg(str);
            return this;
        }

        public final InstrumentationEventBuilder intErrorCode(String str) {
            setIntErrorCode(str);
            return this;
        }

        public final InstrumentationEventBuilder originScreen(String str) {
            setOriginScreen(str);
            return this;
        }

        public final InstrumentationEventBuilder outcome(PEnums.Outcome outcome2) {
            setOutcome(String.valueOf(outcome2));
            return this;
        }

        public final InstrumentationEventBuilder parentName(String str) {
            setParentName(str);
            return this;
        }

        public final InstrumentationEventBuilder payloadSent(String str) {
            setPayloadSent(str);
            return this;
        }

        public final void setAppGuidInfo(String str) {
            this.appGuidInfo = str;
        }

        public final void setAuthSdkVersion(String str) {
            this.authSdkVersion = str;
        }

        public final void setChildName(String str) {
            this.childName = str;
        }

        public final void setComponent(String str) {
            this.component = str;
        }

        public final void setCorrelation_id(String str) {
            this.correlation_id = str;
        }

        public final void setDestinationScreen(String str) {
            this.destinationScreen = str;
        }

        public final void setEnv(String str) {
            this.env = str;
        }

        public final void setErrorDetails(String str) {
            this.errorDetails = str;
        }

        public final void setErrorMsg(String str) {
            this.errorMsg = str;
        }

        public final void setErrorType(String str) {
            this.errorType = str;
        }

        public final void setEventType(String str) {
            this.eventType = str;
        }

        public final void setExperimentationExperience(String str) {
            this.experimentationExperience = str;
        }

        public final void setExperimentationTreatment(String str) {
            this.experimentationTreatment = str;
        }

        public final void setExtErrorCode(String str) {
            this.extErrorCode = str;
        }

        public final void setFallbackCategory(String str) {
            this.fallbackCategory = str;
        }

        public final void setFallbackFrom(String str) {
            this.fallbackFrom = str;
        }

        public final void setFallbackReason(String str) {
            this.fallbackReason = str;
        }

        public final void setFallbackTo(String str) {
            this.fallbackTo = str;
        }

        public final void setFieldName(String str) {
            this.fieldName = str;
        }

        public final void setInfoMsg(String str) {
            this.infoMsg = str;
        }

        public final void setIntErrorCode(String str) {
            this.intErrorCode = str;
        }

        public final void setOriginScreen(String str) {
            this.originScreen = str;
        }

        public final void setOutcome(String str) {
            this.outcome = str;
        }

        public final void setParentName(String str) {
            this.parentName = str;
        }

        public final void setPayloadSent(String str) {
            this.payloadSent = str;
        }

        public final void setStateName(String str) {
            this.stateName = str;
        }

        public final void setTransactionChannel(String str) {
            this.transactionChannel = str;
        }

        public final void setTransitionName(String str) {
            this.transitionName = str;
        }

        public final void setViewName(String str) {
            this.viewName = str;
        }

        public final InstrumentationEventBuilder stateName(PEnums.StateName stateName2) {
            setStateName(String.valueOf(stateName2));
            return this;
        }

        public String toString() {
            String str = this.eventType;
            String str2 = this.errorType;
            String str3 = this.extErrorCode;
            String str4 = this.intErrorCode;
            String str5 = this.errorMsg;
            String str6 = this.errorDetails;
            String str7 = this.outcome;
            String str8 = this.viewName;
            String str9 = this.transitionName;
            String str10 = this.fallbackReason;
            String str11 = this.fallbackTo;
            String str12 = this.fallbackCategory;
            String str13 = this.fallbackFrom;
            String str14 = this.originScreen;
            String str15 = this.destinationScreen;
            String str16 = this.childName;
            String str17 = this.parentName;
            String str18 = this.stateName;
            String str19 = this.payloadSent;
            String str20 = this.infoMsg;
            String str21 = this.experimentationExperience;
            String str22 = this.experimentationTreatment;
            String str23 = this.fieldName;
            String str24 = this.transactionChannel;
            String str25 = this.correlation_id;
            String str26 = this.env;
            String str27 = this.component;
            String str28 = this.authSdkVersion;
            StringBuilder f = C0388a.m1050f("InstrumentationEventBuilder(eventType=", str, ", errorType=", str2, ", extErrorCode=");
            C0391c.m1061h(f, str3, ", intErrorCode=", str4, ", errorMsg=");
            C0391c.m1061h(f, str5, ", errorDetails=", str6, ", outcome=");
            C0391c.m1061h(f, str7, ", viewName=", str8, ", transitionName=");
            C0391c.m1061h(f, str9, ", fallbackReason=", str10, ", fallbackTo=");
            C0391c.m1061h(f, str11, ", fallbackCategory=", str12, ", fallbackFrom=");
            C0391c.m1061h(f, str13, ", originScreen=", str14, ", destinationScreen=");
            C0391c.m1061h(f, str15, ", childName=", str16, ", parentName=");
            C0391c.m1061h(f, str17, ", stateName=", str18, ", payloadSent=");
            C0391c.m1061h(f, str19, ", infoMsg=", str20, ", experimentationExperience=");
            C0391c.m1061h(f, str21, ", experimentationTreatment=", str22, ", fieldName=");
            C0391c.m1061h(f, str23, ", transactionChannel=", str24, ", correlation_id=");
            C0391c.m1061h(f, str25, ", env=", str26, ", component=");
            C0391c.m1061h(f, str27, ", authSdkVersion=", str28, ", appGuidInfo=");
            return C0023f.m110k(f, this.appGuidInfo, ")");
        }

        public final InstrumentationEventBuilder transitionName(PEnums.TransitionName transitionName2) {
            setTransitionName(String.valueOf(transitionName2));
            return this;
        }

        public final InstrumentationEventBuilder viewName(String str) {
            setViewName(str);
            return this;
        }

        public final InstrumentationEventBuilder transitionName(String str) {
            C19383o.m32797g(str, "transitionName");
            setTransitionName(str);
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ InstrumentationEventBuilder(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
            /*
                r30 = this;
                r0 = r60
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0008
                r1 = 0
                goto L_0x000a
            L_0x0008:
                r1 = r31
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = 0
                goto L_0x0012
            L_0x0010:
                r3 = r32
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = 0
                goto L_0x001a
            L_0x0018:
                r4 = r33
            L_0x001a:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0020
                r5 = 0
                goto L_0x0022
            L_0x0020:
                r5 = r34
            L_0x0022:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0028
                r6 = 0
                goto L_0x002a
            L_0x0028:
                r6 = r35
            L_0x002a:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0030
                r7 = 0
                goto L_0x0032
            L_0x0030:
                r7 = r36
            L_0x0032:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0038
                r8 = 0
                goto L_0x003a
            L_0x0038:
                r8 = r37
            L_0x003a:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0040
                r9 = 0
                goto L_0x0042
            L_0x0040:
                r9 = r38
            L_0x0042:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0048
                r10 = 0
                goto L_0x004a
            L_0x0048:
                r10 = r39
            L_0x004a:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0050
                r11 = 0
                goto L_0x0052
            L_0x0050:
                r11 = r40
            L_0x0052:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0058
                r12 = 0
                goto L_0x005a
            L_0x0058:
                r12 = r41
            L_0x005a:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0060
                r13 = 0
                goto L_0x0062
            L_0x0060:
                r13 = r42
            L_0x0062:
                r14 = r0 & 4096(0x1000, float:5.74E-42)
                if (r14 == 0) goto L_0x0068
                r14 = 0
                goto L_0x006a
            L_0x0068:
                r14 = r43
            L_0x006a:
                r15 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r15 == 0) goto L_0x0070
                r15 = 0
                goto L_0x0072
            L_0x0070:
                r15 = r44
            L_0x0072:
                r2 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r2 == 0) goto L_0x0078
                r2 = 0
                goto L_0x007a
            L_0x0078:
                r2 = r45
            L_0x007a:
                r16 = 32768(0x8000, float:4.5918E-41)
                r16 = r0 & r16
                if (r16 == 0) goto L_0x0084
                r16 = 0
                goto L_0x0086
            L_0x0084:
                r16 = r46
            L_0x0086:
                r17 = 65536(0x10000, float:9.18355E-41)
                r17 = r0 & r17
                if (r17 == 0) goto L_0x008f
                r17 = 0
                goto L_0x0091
            L_0x008f:
                r17 = r47
            L_0x0091:
                r18 = 131072(0x20000, float:1.83671E-40)
                r18 = r0 & r18
                if (r18 == 0) goto L_0x009a
                r18 = 0
                goto L_0x009c
            L_0x009a:
                r18 = r48
            L_0x009c:
                r19 = 262144(0x40000, float:3.67342E-40)
                r19 = r0 & r19
                if (r19 == 0) goto L_0x00a5
                r19 = 0
                goto L_0x00a7
            L_0x00a5:
                r19 = r49
            L_0x00a7:
                r20 = 524288(0x80000, float:7.34684E-40)
                r20 = r0 & r20
                if (r20 == 0) goto L_0x00b0
                r20 = 0
                goto L_0x00b2
            L_0x00b0:
                r20 = r50
            L_0x00b2:
                r21 = 1048576(0x100000, float:1.469368E-39)
                r21 = r0 & r21
                if (r21 == 0) goto L_0x00bb
                r21 = 0
                goto L_0x00bd
            L_0x00bb:
                r21 = r51
            L_0x00bd:
                r22 = 2097152(0x200000, float:2.938736E-39)
                r22 = r0 & r22
                if (r22 == 0) goto L_0x00c6
                r22 = 0
                goto L_0x00c8
            L_0x00c6:
                r22 = r52
            L_0x00c8:
                r23 = 4194304(0x400000, float:5.877472E-39)
                r23 = r0 & r23
                if (r23 == 0) goto L_0x00d1
                r23 = 0
                goto L_0x00d3
            L_0x00d1:
                r23 = r53
            L_0x00d3:
                r24 = 8388608(0x800000, float:1.17549435E-38)
                r24 = r0 & r24
                if (r24 == 0) goto L_0x00dc
                r24 = 0
                goto L_0x00de
            L_0x00dc:
                r24 = r54
            L_0x00de:
                r25 = 16777216(0x1000000, float:2.3509887E-38)
                r25 = r0 & r25
                if (r25 == 0) goto L_0x00e7
                r25 = 0
                goto L_0x00e9
            L_0x00e7:
                r25 = r55
            L_0x00e9:
                r26 = 33554432(0x2000000, float:9.403955E-38)
                r26 = r0 & r26
                if (r26 == 0) goto L_0x00f2
                r26 = 0
                goto L_0x00f4
            L_0x00f2:
                r26 = r56
            L_0x00f4:
                r27 = 67108864(0x4000000, float:1.5046328E-36)
                r27 = r0 & r27
                if (r27 == 0) goto L_0x00fd
                r27 = 0
                goto L_0x00ff
            L_0x00fd:
                r27 = r57
            L_0x00ff:
                r28 = 134217728(0x8000000, float:3.85186E-34)
                r28 = r0 & r28
                if (r28 == 0) goto L_0x0108
                r28 = 0
                goto L_0x010a
            L_0x0108:
                r28 = r58
            L_0x010a:
                r29 = 268435456(0x10000000, float:2.5243549E-29)
                r0 = r0 & r29
                if (r0 == 0) goto L_0x0112
                r0 = 0
                goto L_0x0114
            L_0x0112:
                r0 = r59
            L_0x0114:
                r31 = r30
                r32 = r1
                r33 = r3
                r34 = r4
                r35 = r5
                r36 = r6
                r37 = r7
                r38 = r8
                r39 = r9
                r40 = r10
                r41 = r11
                r42 = r12
                r43 = r13
                r44 = r14
                r45 = r15
                r46 = r2
                r47 = r16
                r48 = r17
                r49 = r18
                r50 = r19
                r51 = r20
                r52 = r21
                r53 = r22
                r54 = r23
                r55 = r24
                r56 = r25
                r57 = r26
                r58 = r27
                r59 = r28
                r60 = r0
                r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent.InstrumentationEventBuilder.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    private InstrumentationEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Integer num, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63) {
        this._tenant = str;
        this.tenant_type = str2;
        this.event_source = str3;
        this.product = str4;
        this.component = str5;
        this.mobile_app_version = str6;
        this.sdkv = str7;
        this.sdk_ver = str8;
        this.button_version = str9;
        this.context_id = str10;
        this.button_session_id = str11;
        this.context_type = str12;
        this.buyer_type = str13;
        this.event_type = str14;
        this.error_type = str15;
        this.ext_error_code = str16;
        this.int_error_code = str17;
        this.int_error_desc = str18;
        this.error_details = str19;
        this.encr_cust_id = str20;
        this.encr_rcvr_id = str21;
        this.acct_cntry = str22;
        this.app_name = str23;
        this.mapv = str24;
        this.mosv = str25;
        this.mdvs = str26;
        this.f37725t = l;
        this.outcome = str27;
        this.view_name = str28;
        this.transition_name = str29;
        this.event_name = str30;
        this.fallback_reason = str31;
        this.fallback_to = str32;
        this.fallback_category = str33;
        this.fallback_from = str34;
        this.origin_screen = str35;
        this.destination_screen = str36;
        this.child_name = str37;
        this.parent_name = str38;
        this.fi_id = str39;
        this.state_name = str40;
        this.payload_sent = str41;
        this.duration = num;
        this.info_msg = str42;
        this.sdk_environment = str43;
        this.fb_session_id = str44;
        this.funding_source = str45;
        this.browser_type = str46;
        this.flowtype = str47;
        this.user_id = str48;
        this.experimentation_experience = str49;
        this.experimentation_treatment = str50;
        this.buyer_cntry = str51;
        this.stage = str52;
        this.field_name = str53;
        this.channel = str54;
        this.connectivity_status = str55;
        this.token = str56;
        this.sdk_session_id = str57;
        this.order_session_id = str58;
        this.correlation_id = str59;
        this.env_name = str60;
        this.startup_mechanism = str61;
        this.auth_sdk_version = str62;
        this.app_guid = str63;
    }

    public /* synthetic */ InstrumentationEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Integer num, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, l, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, num, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63);
    }

    public static /* synthetic */ InstrumentationEvent copy$default(InstrumentationEvent instrumentationEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Integer num, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, int i3, Object obj) {
        InstrumentationEvent instrumentationEvent2 = instrumentationEvent;
        int i4 = i;
        int i5 = i2;
        return instrumentationEvent.copy((i4 & 1) != 0 ? instrumentationEvent2._tenant : str, (i4 & 2) != 0 ? instrumentationEvent2.tenant_type : str2, (i4 & 4) != 0 ? instrumentationEvent2.event_source : str3, (i4 & 8) != 0 ? instrumentationEvent2.product : str4, (i4 & 16) != 0 ? instrumentationEvent2.component : str5, (i4 & 32) != 0 ? instrumentationEvent2.mobile_app_version : str6, (i4 & 64) != 0 ? instrumentationEvent2.sdkv : str7, (i4 & 128) != 0 ? instrumentationEvent2.sdk_ver : str8, (i4 & 256) != 0 ? instrumentationEvent2.button_version : str9, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? instrumentationEvent2.context_id : str10, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? instrumentationEvent2.button_session_id : str11, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? instrumentationEvent2.context_type : str12, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? instrumentationEvent2.buyer_type : str13, (i4 & 8192) != 0 ? instrumentationEvent2.event_type : str14, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? instrumentationEvent2.error_type : str15, (i4 & 32768) != 0 ? instrumentationEvent2.ext_error_code : str16, (i4 & 65536) != 0 ? instrumentationEvent2.int_error_code : str17, (i4 & 131072) != 0 ? instrumentationEvent2.int_error_desc : str18, (i4 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? instrumentationEvent2.error_details : str19, (i4 & 524288) != 0 ? instrumentationEvent2.encr_cust_id : str20, (i4 & 1048576) != 0 ? instrumentationEvent2.encr_rcvr_id : str21, (i4 & 2097152) != 0 ? instrumentationEvent2.acct_cntry : str22, (i4 & 4194304) != 0 ? instrumentationEvent2.app_name : str23, (i4 & 8388608) != 0 ? instrumentationEvent2.mapv : str24, (i4 & 16777216) != 0 ? instrumentationEvent2.mosv : str25, (i4 & 33554432) != 0 ? instrumentationEvent2.mdvs : str26, (i4 & 67108864) != 0 ? instrumentationEvent2.f37725t : l, (i4 & 134217728) != 0 ? instrumentationEvent2.outcome : str27, (i4 & 268435456) != 0 ? instrumentationEvent2.view_name : str28, (i4 & 536870912) != 0 ? instrumentationEvent2.transition_name : str29, (i4 & 1073741824) != 0 ? instrumentationEvent2.event_name : str30, (i4 & Integer.MIN_VALUE) != 0 ? instrumentationEvent2.fallback_reason : str31, (i5 & 1) != 0 ? instrumentationEvent2.fallback_to : str32, (i5 & 2) != 0 ? instrumentationEvent2.fallback_category : str33, (i5 & 4) != 0 ? instrumentationEvent2.fallback_from : str34, (i5 & 8) != 0 ? instrumentationEvent2.origin_screen : str35, (i5 & 16) != 0 ? instrumentationEvent2.destination_screen : str36, (i5 & 32) != 0 ? instrumentationEvent2.child_name : str37, (i5 & 64) != 0 ? instrumentationEvent2.parent_name : str38, (i5 & 128) != 0 ? instrumentationEvent2.fi_id : str39, (i5 & 256) != 0 ? instrumentationEvent2.state_name : str40, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? instrumentationEvent2.payload_sent : str41, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? instrumentationEvent2.duration : num, (i5 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? instrumentationEvent2.info_msg : str42, (i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? instrumentationEvent2.sdk_environment : str43, (i5 & 8192) != 0 ? instrumentationEvent2.fb_session_id : str44, (i5 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? instrumentationEvent2.funding_source : str45, (i5 & 32768) != 0 ? instrumentationEvent2.browser_type : str46, (i5 & 65536) != 0 ? instrumentationEvent2.flowtype : str47, (i5 & 131072) != 0 ? instrumentationEvent2.user_id : str48, (i5 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? instrumentationEvent2.experimentation_experience : str49, (i5 & 524288) != 0 ? instrumentationEvent2.experimentation_treatment : str50, (i5 & 1048576) != 0 ? instrumentationEvent2.buyer_cntry : str51, (i5 & 2097152) != 0 ? instrumentationEvent2.stage : str52, (i5 & 4194304) != 0 ? instrumentationEvent2.field_name : str53, (i5 & 8388608) != 0 ? instrumentationEvent2.channel : str54, (i5 & 16777216) != 0 ? instrumentationEvent2.connectivity_status : str55, (i5 & 33554432) != 0 ? instrumentationEvent2.token : str56, (i5 & 67108864) != 0 ? instrumentationEvent2.sdk_session_id : str57, (i5 & 134217728) != 0 ? instrumentationEvent2.order_session_id : str58, (i5 & 268435456) != 0 ? instrumentationEvent2.correlation_id : str59, (i5 & 536870912) != 0 ? instrumentationEvent2.env_name : str60, (i5 & 1073741824) != 0 ? instrumentationEvent2.startup_mechanism : str61, (i5 & Integer.MIN_VALUE) != 0 ? instrumentationEvent2.auth_sdk_version : str62, (i3 & 1) != 0 ? instrumentationEvent2.app_guid : str63);
    }

    public final String component1() {
        return this._tenant;
    }

    public final String component10() {
        return this.context_id;
    }

    public final String component11() {
        return this.button_session_id;
    }

    public final String component12() {
        return this.context_type;
    }

    public final String component13() {
        return this.buyer_type;
    }

    public final String component14() {
        return this.event_type;
    }

    public final String component15() {
        return this.error_type;
    }

    public final String component16() {
        return this.ext_error_code;
    }

    public final String component17() {
        return this.int_error_code;
    }

    public final String component18() {
        return this.int_error_desc;
    }

    public final String component19() {
        return this.error_details;
    }

    public final String component2() {
        return this.tenant_type;
    }

    public final String component20() {
        return this.encr_cust_id;
    }

    public final String component21() {
        return this.encr_rcvr_id;
    }

    public final String component22() {
        return this.acct_cntry;
    }

    public final String component23() {
        return this.app_name;
    }

    public final String component24() {
        return this.mapv;
    }

    public final String component25() {
        return this.mosv;
    }

    public final String component26() {
        return this.mdvs;
    }

    public final Long component27() {
        return this.f37725t;
    }

    public final String component28() {
        return this.outcome;
    }

    public final String component29() {
        return this.view_name;
    }

    public final String component3() {
        return this.event_source;
    }

    public final String component30() {
        return this.transition_name;
    }

    public final String component31() {
        return this.event_name;
    }

    public final String component32() {
        return this.fallback_reason;
    }

    public final String component33() {
        return this.fallback_to;
    }

    public final String component34() {
        return this.fallback_category;
    }

    public final String component35() {
        return this.fallback_from;
    }

    public final String component36() {
        return this.origin_screen;
    }

    public final String component37() {
        return this.destination_screen;
    }

    public final String component38() {
        return this.child_name;
    }

    public final String component39() {
        return this.parent_name;
    }

    public final String component4() {
        return this.product;
    }

    public final String component40() {
        return this.fi_id;
    }

    public final String component41() {
        return this.state_name;
    }

    public final String component42() {
        return this.payload_sent;
    }

    public final Integer component43() {
        return this.duration;
    }

    public final String component44() {
        return this.info_msg;
    }

    public final String component45() {
        return this.sdk_environment;
    }

    public final String component46() {
        return this.fb_session_id;
    }

    public final String component47() {
        return this.funding_source;
    }

    public final String component48() {
        return this.browser_type;
    }

    public final String component49() {
        return this.flowtype;
    }

    public final String component5() {
        return this.component;
    }

    public final String component50() {
        return this.user_id;
    }

    public final String component51() {
        return this.experimentation_experience;
    }

    public final String component52() {
        return this.experimentation_treatment;
    }

    public final String component53() {
        return this.buyer_cntry;
    }

    public final String component54() {
        return this.stage;
    }

    public final String component55() {
        return this.field_name;
    }

    public final String component56() {
        return this.channel;
    }

    public final String component57() {
        return this.connectivity_status;
    }

    public final String component58() {
        return this.token;
    }

    public final String component59() {
        return this.sdk_session_id;
    }

    public final String component6() {
        return this.mobile_app_version;
    }

    public final String component60() {
        return this.order_session_id;
    }

    public final String component61() {
        return this.correlation_id;
    }

    public final String component62() {
        return this.env_name;
    }

    public final String component63() {
        return this.startup_mechanism;
    }

    public final String component64() {
        return this.auth_sdk_version;
    }

    public final String component65() {
        return this.app_guid;
    }

    public final String component7() {
        return this.sdkv;
    }

    public final String component8() {
        return this.sdk_ver;
    }

    public final String component9() {
        return this.button_version;
    }

    public final InstrumentationEvent copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, Long l, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Integer num, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63) {
        String str64 = str;
        C19383o.m32797g(str43, "sdk_environment");
        C19383o.m32797g(str61, "startup_mechanism");
        return new InstrumentationEvent(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, l, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, num, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentationEvent)) {
            return false;
        }
        InstrumentationEvent instrumentationEvent = (InstrumentationEvent) obj;
        return C19383o.m32792b(this._tenant, instrumentationEvent._tenant) && C19383o.m32792b(this.tenant_type, instrumentationEvent.tenant_type) && C19383o.m32792b(this.event_source, instrumentationEvent.event_source) && C19383o.m32792b(this.product, instrumentationEvent.product) && C19383o.m32792b(this.component, instrumentationEvent.component) && C19383o.m32792b(this.mobile_app_version, instrumentationEvent.mobile_app_version) && C19383o.m32792b(this.sdkv, instrumentationEvent.sdkv) && C19383o.m32792b(this.sdk_ver, instrumentationEvent.sdk_ver) && C19383o.m32792b(this.button_version, instrumentationEvent.button_version) && C19383o.m32792b(this.context_id, instrumentationEvent.context_id) && C19383o.m32792b(this.button_session_id, instrumentationEvent.button_session_id) && C19383o.m32792b(this.context_type, instrumentationEvent.context_type) && C19383o.m32792b(this.buyer_type, instrumentationEvent.buyer_type) && C19383o.m32792b(this.event_type, instrumentationEvent.event_type) && C19383o.m32792b(this.error_type, instrumentationEvent.error_type) && C19383o.m32792b(this.ext_error_code, instrumentationEvent.ext_error_code) && C19383o.m32792b(this.int_error_code, instrumentationEvent.int_error_code) && C19383o.m32792b(this.int_error_desc, instrumentationEvent.int_error_desc) && C19383o.m32792b(this.error_details, instrumentationEvent.error_details) && C19383o.m32792b(this.encr_cust_id, instrumentationEvent.encr_cust_id) && C19383o.m32792b(this.encr_rcvr_id, instrumentationEvent.encr_rcvr_id) && C19383o.m32792b(this.acct_cntry, instrumentationEvent.acct_cntry) && C19383o.m32792b(this.app_name, instrumentationEvent.app_name) && C19383o.m32792b(this.mapv, instrumentationEvent.mapv) && C19383o.m32792b(this.mosv, instrumentationEvent.mosv) && C19383o.m32792b(this.mdvs, instrumentationEvent.mdvs) && C19383o.m32792b(this.f37725t, instrumentationEvent.f37725t) && C19383o.m32792b(this.outcome, instrumentationEvent.outcome) && C19383o.m32792b(this.view_name, instrumentationEvent.view_name) && C19383o.m32792b(this.transition_name, instrumentationEvent.transition_name) && C19383o.m32792b(this.event_name, instrumentationEvent.event_name) && C19383o.m32792b(this.fallback_reason, instrumentationEvent.fallback_reason) && C19383o.m32792b(this.fallback_to, instrumentationEvent.fallback_to) && C19383o.m32792b(this.fallback_category, instrumentationEvent.fallback_category) && C19383o.m32792b(this.fallback_from, instrumentationEvent.fallback_from) && C19383o.m32792b(this.origin_screen, instrumentationEvent.origin_screen) && C19383o.m32792b(this.destination_screen, instrumentationEvent.destination_screen) && C19383o.m32792b(this.child_name, instrumentationEvent.child_name) && C19383o.m32792b(this.parent_name, instrumentationEvent.parent_name) && C19383o.m32792b(this.fi_id, instrumentationEvent.fi_id) && C19383o.m32792b(this.state_name, instrumentationEvent.state_name) && C19383o.m32792b(this.payload_sent, instrumentationEvent.payload_sent) && C19383o.m32792b(this.duration, instrumentationEvent.duration) && C19383o.m32792b(this.info_msg, instrumentationEvent.info_msg) && C19383o.m32792b(this.sdk_environment, instrumentationEvent.sdk_environment) && C19383o.m32792b(this.fb_session_id, instrumentationEvent.fb_session_id) && C19383o.m32792b(this.funding_source, instrumentationEvent.funding_source) && C19383o.m32792b(this.browser_type, instrumentationEvent.browser_type) && C19383o.m32792b(this.flowtype, instrumentationEvent.flowtype) && C19383o.m32792b(this.user_id, instrumentationEvent.user_id) && C19383o.m32792b(this.experimentation_experience, instrumentationEvent.experimentation_experience) && C19383o.m32792b(this.experimentation_treatment, instrumentationEvent.experimentation_treatment) && C19383o.m32792b(this.buyer_cntry, instrumentationEvent.buyer_cntry) && C19383o.m32792b(this.stage, instrumentationEvent.stage) && C19383o.m32792b(this.field_name, instrumentationEvent.field_name) && C19383o.m32792b(this.channel, instrumentationEvent.channel) && C19383o.m32792b(this.connectivity_status, instrumentationEvent.connectivity_status) && C19383o.m32792b(this.token, instrumentationEvent.token) && C19383o.m32792b(this.sdk_session_id, instrumentationEvent.sdk_session_id) && C19383o.m32792b(this.order_session_id, instrumentationEvent.order_session_id) && C19383o.m32792b(this.correlation_id, instrumentationEvent.correlation_id) && C19383o.m32792b(this.env_name, instrumentationEvent.env_name) && C19383o.m32792b(this.startup_mechanism, instrumentationEvent.startup_mechanism) && C19383o.m32792b(this.auth_sdk_version, instrumentationEvent.auth_sdk_version) && C19383o.m32792b(this.app_guid, instrumentationEvent.app_guid);
    }

    public final String getAcct_cntry() {
        return this.acct_cntry;
    }

    public final String getApp_guid() {
        return this.app_guid;
    }

    public final String getApp_name() {
        return this.app_name;
    }

    public final String getAuth_sdk_version() {
        return this.auth_sdk_version;
    }

    public final String getBrowser_type() {
        return this.browser_type;
    }

    public final String getButton_session_id() {
        return this.button_session_id;
    }

    public final String getButton_version() {
        return this.button_version;
    }

    public final String getBuyer_cntry() {
        return this.buyer_cntry;
    }

    public final String getBuyer_type() {
        return this.buyer_type;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getChild_name() {
        return this.child_name;
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getConnectivity_status() {
        return this.connectivity_status;
    }

    public final String getContext_id() {
        return this.context_id;
    }

    public final String getContext_type() {
        return this.context_type;
    }

    public final String getCorrelation_id() {
        return this.correlation_id;
    }

    public final String getDestination_screen() {
        return this.destination_screen;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getEncr_cust_id() {
        return this.encr_cust_id;
    }

    public final String getEncr_rcvr_id() {
        return this.encr_rcvr_id;
    }

    public final String getEnv_name() {
        return this.env_name;
    }

    public final String getError_details() {
        return this.error_details;
    }

    public final String getError_type() {
        return this.error_type;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getEvent_source() {
        return this.event_source;
    }

    public final String getEvent_type() {
        return this.event_type;
    }

    public final String getExperimentation_experience() {
        return this.experimentation_experience;
    }

    public final String getExperimentation_treatment() {
        return this.experimentation_treatment;
    }

    public final String getExt_error_code() {
        return this.ext_error_code;
    }

    public final String getFallback_category() {
        return this.fallback_category;
    }

    public final String getFallback_from() {
        return this.fallback_from;
    }

    public final String getFallback_reason() {
        return this.fallback_reason;
    }

    public final String getFallback_to() {
        return this.fallback_to;
    }

    public final String getFb_session_id() {
        return this.fb_session_id;
    }

    public final String getFi_id() {
        return this.fi_id;
    }

    public final String getField_name() {
        return this.field_name;
    }

    public final String getFlowtype() {
        return this.flowtype;
    }

    public final String getFunding_source() {
        return this.funding_source;
    }

    public final String getInfo_msg() {
        return this.info_msg;
    }

    public final String getInt_error_code() {
        return this.int_error_code;
    }

    public final String getInt_error_desc() {
        return this.int_error_desc;
    }

    public final String getMapv() {
        return this.mapv;
    }

    public final String getMdvs() {
        return this.mdvs;
    }

    public final String getMobile_app_version() {
        return this.mobile_app_version;
    }

    public final String getMosv() {
        return this.mosv;
    }

    public final String getOrder_session_id() {
        return this.order_session_id;
    }

    public final String getOrigin_screen() {
        return this.origin_screen;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getParent_name() {
        return this.parent_name;
    }

    public final String getPayload_sent() {
        return this.payload_sent;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSdk_environment() {
        return this.sdk_environment;
    }

    public final String getSdk_session_id() {
        return this.sdk_session_id;
    }

    public final String getSdk_ver() {
        return this.sdk_ver;
    }

    public final String getSdkv() {
        return this.sdkv;
    }

    public final String getStage() {
        return this.stage;
    }

    public final String getStartup_mechanism() {
        return this.startup_mechanism;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public final Long getT() {
        return this.f37725t;
    }

    public final String getTenant_type() {
        return this.tenant_type;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTransition_name() {
        return this.transition_name;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getView_name() {
        return this.view_name;
    }

    public final String get_tenant() {
        return this._tenant;
    }

    public int hashCode() {
        String str = this._tenant;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tenant_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.event_source;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.component;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mobile_app_version;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sdkv;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sdk_ver;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.button_version;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.context_id;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.button_session_id;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.context_type;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.buyer_type;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.event_type;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.error_type;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ext_error_code;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.int_error_code;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.int_error_desc;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.error_details;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.encr_cust_id;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.encr_rcvr_id;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.acct_cntry;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.app_name;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.mapv;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.mosv;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.mdvs;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l = this.f37725t;
        int hashCode27 = (hashCode26 + (l == null ? 0 : l.hashCode())) * 31;
        String str27 = this.outcome;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.view_name;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.transition_name;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.event_name;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.fallback_reason;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.fallback_to;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.fallback_category;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.fallback_from;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.origin_screen;
        int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.destination_screen;
        int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.child_name;
        int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.parent_name;
        int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.fi_id;
        int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.state_name;
        int hashCode41 = (hashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.payload_sent;
        int hashCode42 = (hashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode43 = (hashCode42 + (num == null ? 0 : num.hashCode())) * 31;
        String str42 = this.info_msg;
        int e = C0023f.m105e(this.sdk_environment, (hashCode43 + (str42 == null ? 0 : str42.hashCode())) * 31, 31);
        String str43 = this.fb_session_id;
        int hashCode44 = (e + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.funding_source;
        int hashCode45 = (hashCode44 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.browser_type;
        int hashCode46 = (hashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.flowtype;
        int hashCode47 = (hashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.user_id;
        int hashCode48 = (hashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.experimentation_experience;
        int hashCode49 = (hashCode48 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.experimentation_treatment;
        int hashCode50 = (hashCode49 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.buyer_cntry;
        int hashCode51 = (hashCode50 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.stage;
        int hashCode52 = (hashCode51 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.field_name;
        int hashCode53 = (hashCode52 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.channel;
        int hashCode54 = (hashCode53 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.connectivity_status;
        int hashCode55 = (hashCode54 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.token;
        int hashCode56 = (hashCode55 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.sdk_session_id;
        int hashCode57 = (hashCode56 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.order_session_id;
        int hashCode58 = (hashCode57 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.correlation_id;
        int hashCode59 = (hashCode58 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.env_name;
        int e2 = C0023f.m105e(this.startup_mechanism, (hashCode59 + (str59 == null ? 0 : str59.hashCode())) * 31, 31);
        String str60 = this.auth_sdk_version;
        int hashCode60 = (e2 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.app_guid;
        if (str61 != null) {
            i = str61.hashCode();
        }
        return hashCode60 + i;
    }

    public final void setAcct_cntry(String str) {
        this.acct_cntry = str;
    }

    public final void setApp_guid(String str) {
        this.app_guid = str;
    }

    public final void setApp_name(String str) {
        this.app_name = str;
    }

    public final void setAuth_sdk_version(String str) {
        this.auth_sdk_version = str;
    }

    public final void setBrowser_type(String str) {
        this.browser_type = str;
    }

    public final void setButton_session_id(String str) {
        this.button_session_id = str;
    }

    public final void setButton_version(String str) {
        this.button_version = str;
    }

    public final void setBuyer_cntry(String str) {
        this.buyer_cntry = str;
    }

    public final void setBuyer_type(String str) {
        this.buyer_type = str;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setChild_name(String str) {
        this.child_name = str;
    }

    public final void setComponent(String str) {
        this.component = str;
    }

    public final void setConnectivity_status(String str) {
        this.connectivity_status = str;
    }

    public final void setContext_id(String str) {
        this.context_id = str;
    }

    public final void setContext_type(String str) {
        this.context_type = str;
    }

    public final void setCorrelation_id(String str) {
        this.correlation_id = str;
    }

    public final void setDestination_screen(String str) {
        this.destination_screen = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEncr_cust_id(String str) {
        this.encr_cust_id = str;
    }

    public final void setEncr_rcvr_id(String str) {
        this.encr_rcvr_id = str;
    }

    public final void setEnv_name(String str) {
        this.env_name = str;
    }

    public final void setError_details(String str) {
        this.error_details = str;
    }

    public final void setError_type(String str) {
        this.error_type = str;
    }

    public final void setEvent_name(String str) {
        this.event_name = str;
    }

    public final void setEvent_source(String str) {
        this.event_source = str;
    }

    public final void setEvent_type(String str) {
        this.event_type = str;
    }

    public final void setExperimentation_experience(String str) {
        this.experimentation_experience = str;
    }

    public final void setExperimentation_treatment(String str) {
        this.experimentation_treatment = str;
    }

    public final void setExt_error_code(String str) {
        this.ext_error_code = str;
    }

    public final void setFallback_category(String str) {
        this.fallback_category = str;
    }

    public final void setFallback_from(String str) {
        this.fallback_from = str;
    }

    public final void setFallback_reason(String str) {
        this.fallback_reason = str;
    }

    public final void setFallback_to(String str) {
        this.fallback_to = str;
    }

    public final void setFb_session_id(String str) {
        this.fb_session_id = str;
    }

    public final void setFi_id(String str) {
        this.fi_id = str;
    }

    public final void setField_name(String str) {
        this.field_name = str;
    }

    public final void setFlowtype(String str) {
        this.flowtype = str;
    }

    public final void setFunding_source(String str) {
        this.funding_source = str;
    }

    public final void setInfo_msg(String str) {
        this.info_msg = str;
    }

    public final void setInt_error_code(String str) {
        this.int_error_code = str;
    }

    public final void setInt_error_desc(String str) {
        this.int_error_desc = str;
    }

    public final void setMapv(String str) {
        this.mapv = str;
    }

    public final void setMdvs(String str) {
        this.mdvs = str;
    }

    public final void setMobile_app_version(String str) {
        this.mobile_app_version = str;
    }

    public final void setMosv(String str) {
        this.mosv = str;
    }

    public final void setOrder_session_id(String str) {
        this.order_session_id = str;
    }

    public final void setOrigin_screen(String str) {
        this.origin_screen = str;
    }

    public final void setOutcome(String str) {
        this.outcome = str;
    }

    public final void setParent_name(String str) {
        this.parent_name = str;
    }

    public final void setPayload_sent(String str) {
        this.payload_sent = str;
    }

    public final void setProduct(String str) {
        this.product = str;
    }

    public final void setSdk_environment(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.sdk_environment = str;
    }

    public final void setSdk_session_id(String str) {
        this.sdk_session_id = str;
    }

    public final void setSdk_ver(String str) {
        this.sdk_ver = str;
    }

    public final void setSdkv(String str) {
        this.sdkv = str;
    }

    public final void setStage(String str) {
        this.stage = str;
    }

    public final void setStartup_mechanism(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.startup_mechanism = str;
    }

    public final void setState_name(String str) {
        this.state_name = str;
    }

    public final void setT(Long l) {
        this.f37725t = l;
    }

    public final void setTenant_type(String str) {
        this.tenant_type = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setTransition_name(String str) {
        this.transition_name = str;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public final void setView_name(String str) {
        this.view_name = str;
    }

    public final void set_tenant(String str) {
        this._tenant = str;
    }

    public String toString() {
        String str = this._tenant;
        String str2 = this.tenant_type;
        String str3 = this.event_source;
        String str4 = this.product;
        String str5 = this.component;
        String str6 = this.mobile_app_version;
        String str7 = this.sdkv;
        String str8 = this.sdk_ver;
        String str9 = this.button_version;
        String str10 = this.context_id;
        String str11 = this.button_session_id;
        String str12 = this.context_type;
        String str13 = this.buyer_type;
        String str14 = this.event_type;
        String str15 = this.error_type;
        String str16 = this.ext_error_code;
        String str17 = this.int_error_code;
        String str18 = this.int_error_desc;
        String str19 = this.error_details;
        String str20 = this.encr_cust_id;
        String str21 = this.encr_rcvr_id;
        String str22 = this.acct_cntry;
        String str23 = this.app_name;
        String str24 = this.mapv;
        String str25 = this.mosv;
        String str26 = this.mdvs;
        Long l = this.f37725t;
        String str27 = this.outcome;
        String str28 = this.view_name;
        String str29 = this.transition_name;
        String str30 = this.event_name;
        String str31 = this.fallback_reason;
        String str32 = this.fallback_to;
        String str33 = this.fallback_category;
        String str34 = this.fallback_from;
        String str35 = this.origin_screen;
        String str36 = this.destination_screen;
        String str37 = this.child_name;
        String str38 = this.parent_name;
        String str39 = this.fi_id;
        String str40 = this.state_name;
        String str41 = this.payload_sent;
        Integer num = this.duration;
        String str42 = this.info_msg;
        String str43 = this.sdk_environment;
        String str44 = this.fb_session_id;
        String str45 = this.funding_source;
        String str46 = this.browser_type;
        String str47 = this.flowtype;
        String str48 = this.user_id;
        String str49 = this.experimentation_experience;
        String str50 = this.experimentation_treatment;
        String str51 = this.buyer_cntry;
        String str52 = this.stage;
        String str53 = this.field_name;
        String str54 = this.channel;
        String str55 = this.connectivity_status;
        String str56 = this.token;
        String str57 = this.sdk_session_id;
        String str58 = this.order_session_id;
        String str59 = this.correlation_id;
        String str60 = this.env_name;
        String str61 = this.startup_mechanism;
        String str62 = this.auth_sdk_version;
        StringBuilder f = C0388a.m1050f("InstrumentationEvent(_tenant=", str, ", tenant_type=", str2, ", event_source=");
        C0391c.m1061h(f, str3, ", product=", str4, ", component=");
        C0391c.m1061h(f, str5, ", mobile_app_version=", str6, ", sdkv=");
        C0391c.m1061h(f, str7, ", sdk_ver=", str8, ", button_version=");
        C0391c.m1061h(f, str9, ", context_id=", str10, ", button_session_id=");
        C0391c.m1061h(f, str11, ", context_type=", str12, ", buyer_type=");
        C0391c.m1061h(f, str13, ", event_type=", str14, ", error_type=");
        C0391c.m1061h(f, str15, ", ext_error_code=", str16, ", int_error_code=");
        C0391c.m1061h(f, str17, ", int_error_desc=", str18, ", error_details=");
        C0391c.m1061h(f, str19, ", encr_cust_id=", str20, ", encr_rcvr_id=");
        C0391c.m1061h(f, str21, ", acct_cntry=", str22, ", app_name=");
        C0391c.m1061h(f, str23, ", mapv=", str24, ", mosv=");
        C0391c.m1061h(f, str25, ", mdvs=", str26, ", t=");
        f.append(l);
        f.append(", outcome=");
        f.append(str27);
        f.append(", view_name=");
        C0391c.m1061h(f, str28, ", transition_name=", str29, ", event_name=");
        C0391c.m1061h(f, str30, ", fallback_reason=", str31, ", fallback_to=");
        C0391c.m1061h(f, str32, ", fallback_category=", str33, ", fallback_from=");
        C0391c.m1061h(f, str34, ", origin_screen=", str35, ", destination_screen=");
        C0391c.m1061h(f, str36, ", child_name=", str37, ", parent_name=");
        C0391c.m1061h(f, str38, ", fi_id=", str39, ", state_name=");
        C0391c.m1061h(f, str40, ", payload_sent=", str41, ", duration=");
        f.append(num);
        f.append(", info_msg=");
        f.append(str42);
        f.append(", sdk_environment=");
        C0391c.m1061h(f, str43, ", fb_session_id=", str44, ", funding_source=");
        C0391c.m1061h(f, str45, ", browser_type=", str46, ", flowtype=");
        C0391c.m1061h(f, str47, ", user_id=", str48, ", experimentation_experience=");
        C0391c.m1061h(f, str49, ", experimentation_treatment=", str50, ", buyer_cntry=");
        C0391c.m1061h(f, str51, ", stage=", str52, ", field_name=");
        C0391c.m1061h(f, str53, ", channel=", str54, ", connectivity_status=");
        C0391c.m1061h(f, str55, ", token=", str56, ", sdk_session_id=");
        C0391c.m1061h(f, str57, ", order_session_id=", str58, ", correlation_id=");
        C0391c.m1061h(f, str59, ", env_name=", str60, ", startup_mechanism=");
        C0391c.m1061h(f, str61, ", auth_sdk_version=", str62, ", app_guid=");
        return C0023f.m110k(f, this.app_guid, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstrumentationEvent(java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.Long r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.String r111, java.lang.String r112, java.lang.Integer r113, java.lang.String r114, java.lang.String r115, java.lang.String r116, java.lang.String r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.lang.String r121, java.lang.String r122, java.lang.String r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, java.lang.String r127, java.lang.String r128, java.lang.String r129, java.lang.String r130, java.lang.String r131, java.lang.String r132, java.lang.String r133, java.lang.String r134, java.lang.String r135, int r136, int r137, int r138, kotlin.jvm.internal.DefaultConstructorMarker r139) {
        /*
            r70 = this;
            r0 = r136
            r1 = r137
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r5 = 0
            goto L_0x000c
        L_0x000a:
            r5 = r71
        L_0x000c:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0012
            r6 = 0
            goto L_0x0014
        L_0x0012:
            r6 = r72
        L_0x0014:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001a
            r7 = 0
            goto L_0x001c
        L_0x001a:
            r7 = r73
        L_0x001c:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0022
            r8 = 0
            goto L_0x0024
        L_0x0022:
            r8 = r74
        L_0x0024:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x002a
            r9 = 0
            goto L_0x002c
        L_0x002a:
            r9 = r75
        L_0x002c:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x0032
            r10 = 0
            goto L_0x0034
        L_0x0032:
            r10 = r76
        L_0x0034:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x003a
            r11 = 0
            goto L_0x003c
        L_0x003a:
            r11 = r77
        L_0x003c:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0042
            r12 = 0
            goto L_0x0044
        L_0x0042:
            r12 = r78
        L_0x0044:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x004a
            r13 = 0
            goto L_0x004c
        L_0x004a:
            r13 = r79
        L_0x004c:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0052
            r14 = 0
            goto L_0x0054
        L_0x0052:
            r14 = r80
        L_0x0054:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x005a
            r15 = 0
            goto L_0x005c
        L_0x005a:
            r15 = r81
        L_0x005c:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0063
            r16 = 0
            goto L_0x0065
        L_0x0063:
            r16 = r82
        L_0x0065:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x006c
            r17 = 0
            goto L_0x006e
        L_0x006c:
            r17 = r83
        L_0x006e:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0075
            r18 = 0
            goto L_0x0077
        L_0x0075:
            r18 = r84
        L_0x0077:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007e
            r19 = 0
            goto L_0x0080
        L_0x007e:
            r19 = r85
        L_0x0080:
            r2 = 32768(0x8000, float:4.5918E-41)
            r4 = r0 & r2
            if (r4 == 0) goto L_0x008a
            r20 = 0
            goto L_0x008c
        L_0x008a:
            r20 = r86
        L_0x008c:
            r4 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r4
            if (r21 == 0) goto L_0x0095
            r21 = 0
            goto L_0x0097
        L_0x0095:
            r21 = r87
        L_0x0097:
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = r0 & r22
            if (r23 == 0) goto L_0x00a0
            r23 = 0
            goto L_0x00a2
        L_0x00a0:
            r23 = r88
        L_0x00a2:
            r24 = 262144(0x40000, float:3.67342E-40)
            r25 = r0 & r24
            if (r25 == 0) goto L_0x00ab
            r25 = 0
            goto L_0x00ad
        L_0x00ab:
            r25 = r89
        L_0x00ad:
            r26 = 524288(0x80000, float:7.34684E-40)
            r27 = r0 & r26
            if (r27 == 0) goto L_0x00b6
            r27 = 0
            goto L_0x00b8
        L_0x00b6:
            r27 = r90
        L_0x00b8:
            r28 = 1048576(0x100000, float:1.469368E-39)
            r29 = r0 & r28
            if (r29 == 0) goto L_0x00c1
            r29 = 0
            goto L_0x00c3
        L_0x00c1:
            r29 = r91
        L_0x00c3:
            r30 = 2097152(0x200000, float:2.938736E-39)
            r31 = r0 & r30
            if (r31 == 0) goto L_0x00cc
            r31 = 0
            goto L_0x00ce
        L_0x00cc:
            r31 = r92
        L_0x00ce:
            r32 = 4194304(0x400000, float:5.877472E-39)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00d7
            r32 = 0
            goto L_0x00d9
        L_0x00d7:
            r32 = r93
        L_0x00d9:
            r33 = 8388608(0x800000, float:1.17549435E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00e2
            r33 = 0
            goto L_0x00e4
        L_0x00e2:
            r33 = r94
        L_0x00e4:
            r34 = 16777216(0x1000000, float:2.3509887E-38)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x00ed
            r34 = 0
            goto L_0x00ef
        L_0x00ed:
            r34 = r95
        L_0x00ef:
            r35 = 33554432(0x2000000, float:9.403955E-38)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x00f8
            r35 = 0
            goto L_0x00fa
        L_0x00f8:
            r35 = r96
        L_0x00fa:
            r36 = 67108864(0x4000000, float:1.5046328E-36)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x0103
            r36 = 0
            goto L_0x0105
        L_0x0103:
            r36 = r97
        L_0x0105:
            r37 = 134217728(0x8000000, float:3.85186E-34)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x010e
            r37 = 0
            goto L_0x0110
        L_0x010e:
            r37 = r98
        L_0x0110:
            r38 = 268435456(0x10000000, float:2.5243549E-29)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0119
            r38 = 0
            goto L_0x011b
        L_0x0119:
            r38 = r99
        L_0x011b:
            r39 = 536870912(0x20000000, float:1.0842022E-19)
            r39 = r0 & r39
            if (r39 == 0) goto L_0x0124
            r39 = 0
            goto L_0x0126
        L_0x0124:
            r39 = r100
        L_0x0126:
            r40 = 1073741824(0x40000000, float:2.0)
            r40 = r0 & r40
            if (r40 == 0) goto L_0x012f
            r40 = 0
            goto L_0x0131
        L_0x012f:
            r40 = r101
        L_0x0131:
            r41 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r41
            if (r0 == 0) goto L_0x0139
            r0 = 0
            goto L_0x013b
        L_0x0139:
            r0 = r102
        L_0x013b:
            r41 = r1 & 1
            if (r41 == 0) goto L_0x0142
            r41 = 0
            goto L_0x0144
        L_0x0142:
            r41 = r103
        L_0x0144:
            r42 = r1 & 2
            if (r42 == 0) goto L_0x014b
            r42 = 0
            goto L_0x014d
        L_0x014b:
            r42 = r104
        L_0x014d:
            r43 = r1 & 4
            if (r43 == 0) goto L_0x0154
            r43 = 0
            goto L_0x0156
        L_0x0154:
            r43 = r105
        L_0x0156:
            r44 = r1 & 8
            if (r44 == 0) goto L_0x015d
            r44 = 0
            goto L_0x015f
        L_0x015d:
            r44 = r106
        L_0x015f:
            r45 = r1 & 16
            if (r45 == 0) goto L_0x0166
            r45 = 0
            goto L_0x0168
        L_0x0166:
            r45 = r107
        L_0x0168:
            r46 = r1 & 32
            if (r46 == 0) goto L_0x016f
            r46 = 0
            goto L_0x0171
        L_0x016f:
            r46 = r108
        L_0x0171:
            r47 = r1 & 64
            if (r47 == 0) goto L_0x0178
            r47 = 0
            goto L_0x017a
        L_0x0178:
            r47 = r109
        L_0x017a:
            r3 = r1 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0180
            r3 = 0
            goto L_0x0182
        L_0x0180:
            r3 = r110
        L_0x0182:
            r4 = r1 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0189
            r48 = 0
            goto L_0x018b
        L_0x0189:
            r48 = r111
        L_0x018b:
            r4 = r1 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0192
            r49 = 0
            goto L_0x0194
        L_0x0192:
            r49 = r112
        L_0x0194:
            r4 = r1 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x01a0
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r50 = r4
            goto L_0x01a2
        L_0x01a0:
            r50 = r113
        L_0x01a2:
            r4 = r1 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x01a9
            r51 = 0
            goto L_0x01ab
        L_0x01a9:
            r51 = r114
        L_0x01ab:
            r4 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01b2
            r52 = 0
            goto L_0x01b4
        L_0x01b2:
            r52 = r116
        L_0x01b4:
            r4 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x01bb
            r53 = 0
            goto L_0x01bd
        L_0x01bb:
            r53 = r117
        L_0x01bd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x01c2
            r2 = 0
            goto L_0x01c4
        L_0x01c2:
            r2 = r118
        L_0x01c4:
            r4 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x01cc
            r54 = 0
            goto L_0x01ce
        L_0x01cc:
            r54 = r119
        L_0x01ce:
            r4 = r1 & r22
            if (r4 == 0) goto L_0x01d5
            r55 = 0
            goto L_0x01d7
        L_0x01d5:
            r55 = r120
        L_0x01d7:
            r4 = r1 & r24
            if (r4 == 0) goto L_0x01de
            r56 = 0
            goto L_0x01e0
        L_0x01de:
            r56 = r121
        L_0x01e0:
            r4 = r1 & r26
            if (r4 == 0) goto L_0x01e7
            r57 = 0
            goto L_0x01e9
        L_0x01e7:
            r57 = r122
        L_0x01e9:
            r4 = r1 & r28
            if (r4 == 0) goto L_0x01f0
            r58 = 0
            goto L_0x01f2
        L_0x01f0:
            r58 = r123
        L_0x01f2:
            r4 = r1 & r30
            if (r4 == 0) goto L_0x01f9
            r59 = 0
            goto L_0x01fb
        L_0x01f9:
            r59 = r124
        L_0x01fb:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0203
            r60 = 0
            goto L_0x0205
        L_0x0203:
            r60 = r125
        L_0x0205:
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x020d
            r61 = 0
            goto L_0x020f
        L_0x020d:
            r61 = r126
        L_0x020f:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0217
            r62 = 0
            goto L_0x0219
        L_0x0217:
            r62 = r127
        L_0x0219:
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0221
            r63 = 0
            goto L_0x0223
        L_0x0221:
            r63 = r128
        L_0x0223:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x022b
            r65 = 0
            goto L_0x022d
        L_0x022b:
            r65 = r131
        L_0x022d:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0235
            r66 = 0
            goto L_0x0237
        L_0x0235:
            r66 = r132
        L_0x0237:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x023f
            r68 = 0
            goto L_0x0241
        L_0x023f:
            r68 = r134
        L_0x0241:
            r1 = r138 & 1
            if (r1 == 0) goto L_0x0248
            r69 = 0
            goto L_0x024a
        L_0x0248:
            r69 = r135
        L_0x024a:
            r4 = r70
            r22 = r23
            r23 = r25
            r24 = r27
            r25 = r29
            r26 = r31
            r27 = r32
            r28 = r33
            r29 = r34
            r30 = r35
            r31 = r36
            r32 = r37
            r33 = r38
            r34 = r39
            r35 = r40
            r36 = r0
            r37 = r41
            r38 = r42
            r39 = r43
            r40 = r44
            r41 = r45
            r42 = r46
            r43 = r47
            r44 = r3
            r45 = r48
            r46 = r49
            r47 = r50
            r48 = r51
            r49 = r115
            r50 = r52
            r51 = r53
            r52 = r2
            r53 = r54
            r54 = r55
            r55 = r56
            r56 = r57
            r57 = r58
            r58 = r59
            r59 = r60
            r60 = r61
            r61 = r62
            r62 = r63
            r63 = r129
            r64 = r130
            r67 = r133
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
