package com.paypal.pyplcheckout.common.instrumentation;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopAboutVideo;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.logging.type.LogSeverity;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;
import p010a9.C0048b;

public final class PEnums {
    public static final PEnums INSTANCE = new PEnums();

    public enum ErrorType {
        INFO("info"),
        FATAL("fatal"),
        WARNING("Warning");
        
        private final String errorType;

        private ErrorType(String str) {
            this.errorType = str;
        }

        public String toString() {
            return this.errorType;
        }
    }

    public enum EventCode {
        E101("Impression, Click Event", 101, -1),
        E102("Impression, Transition Event", 102, -1),
        E103("Impression, Shown", 103, -1),
        E104("Transition, Fallback", 104, -1),
        E105("Unimplemented Delegate", 105, -1),
        E106("Checkout failed, falling back to web", 106, -1),
        E107("Error, No profile image available, defaulting to initials instead.", 107, -1),
        E108("Auth Token Service, error fetching auth code in step one", 108, -1),
        E109("Auth Token Service, error getting consent in step two", 109, -1),
        E110("Impression, Selected", 110, -1),
        E111("LSAT token upgrade", 111, -1),
        E112("Cart parameter converter, error in converting parameters", 112, -1),
        E113("Checkout Finish Service, error parsing checkout data", 113, -1),
        E114("Cancel URL Service, error getting url", 114, -1),
        E115("Cancel URL Service, error processing url", 115, -1),
        E116("HTTP Manager, error parsing data", 116, -1),
        E118("Currency Conversion Service, unabled to update backend", 118, -1),
        E119("Failed to convert Photo URI to Image Service", 119, -1),
        E121("Failed to parse URL", 121, -1),
        E122("Navigating between screens", 122, -1),
        E130("GraphQL Payload Received", 130, -1),
        E135("Venice Internal Auth Successful", 135, -1),
        E136("Venmo Internal Auth Successful", 136, -1),
        E137("Funding Instrument Selected", 137, -1),
        E138("Shipping Address Changed", 138, -1),
        E139("Carousel swiped left", 139, -1),
        E140("Carousel swiped right", 140, -1),
        E141("Currency Conversion Changed", 141, -1),
        E142("Move to web dialog OK'ed", 142, -1),
        E143("Move to web dialog Cancel'ed", 143, -1),
        E144("Cancel paysheet dialog OK'ed", 144, -1),
        E145("Cancel paysheet web dialog Cancel'ed", 145, -1),
        E146("Firebase connectivity dialog OK'ed", 146, -1),
        E147("User ineligible dialog OK'ed", 147, -1),
        E148("Card has been classified as dark", 148, -1),
        E149("Card has been classified as light", 149, -1),
        E150("Transitioning from Address book to Hermes", 150, -1),
        E151("Firebase process initiated", 151, -1),
        E152("App backgrounded", 152, -1),
        E153("Party identified", 153, -1),
        E154("Get access token", 154, -1),
        E155("User logout", 155, -1),
        E156("logout dialog shown", 156, -1),
        E157("same transaction session detected", 157, -1),
        E158("3ds 1.0 flow entered", 158, -1),
        E159("3ds 2.0 flow entered", 159, -1),
        E160("3ds jwt call started", 160, -1),
        E161("device data collection started", 161, -1),
        E162("3ds lookup started", 162, -1),
        E163("3ds authenticate started", 163, -1),
        E164("3ds resolve contingency call started", 164, -1),
        E165("3ds cardinal step up started", 165, -1),
        E166("Patching Order Started", 166, -1),
        E167("App foregrounded", 167, -1),
        E168("Network connectivity lost", 168, -1),
        E169("Firebase connectivity online", 169, -1),
        E170("Firebase connectivity offline", 170, -1),
        E171("Firebase connectivity cancelled", 171, -1),
        E210("Add Shipping Address API call succeeded", 210, -1),
        E211("LSAT upgrade completed successfully", 211, -1),
        E212("Eligibility call succeeded", 212, -1),
        E213("Auth succeeded", 213, -1),
        E214("Auth attempted", 214, -1),
        E215("Checkout finished", 215, -1),
        E216("Client config updated", 216, -1),
        E217("Button session Id obtained", 217, -1),
        E218("Create order succeeded", 218, -1),
        E219("firebase token received", 219, -1),
        E220("firebase signed in with custom Token", 220, -1),
        E221("Source app identified", 221, -1),
        E222("Elmo Experiment Response", 222, -1),
        E223("Firebase startup flow", 223, -1),
        E224("Popup startup flow", 224, -1),
        E225("DB instance identified", 225, -1),
        E226("Identity logs succeeded", 226, -1),
        E227("Strong Customer Authentication succeeded", 227, -1),
        E228("Strong Customer Authentication launched", 228, -1),
        E229("Strong Customer Authentication skipped", 229, -1),
        E230("Third party skip Strong Customer Authentication", 230, -1),
        E231("Complete Strong Customer Authentication succeeded", 226, -1),
        E232("Clicked escape path for indefinite fallback", 232, -1),
        E233("Starting Braintree session", 233, -1),
        E301("Third party auth failure", 301, -1),
        E302("Venice internal auth failure", 302, -1),
        E303("Venmo internal auth failure", 303, -1),
        E304("WebSSO Auth failed", 304, -1),
        E305("Load CCT", 305, -1),
        E403("Provider has an unsupported version of Native Checkout SDK", 403, -1),
        E404("Checkout Token not found", HttpStatus.HTTP_NOT_FOUND, -1),
        E405("Error, buyer first name is null", 405, -1),
        E406("Error, buyer last name is null", 406, -1),
        E407("Failure to cast Context to AppCompatActivity", 407, -1),
        E408("button_session_id not found in url", 408, -1),
        E501("Fall back to native", 501, -1),
        E502("RealtimeDB sendRequest Error", 502, -1),
        E503("Native Checkout is currently unsupported", 503, -1),
        E504("LSAT token not set", 504, -1),
        E505("LSAT token upgrade failed", 505, -1),
        E506("URI parse exception", 506, -1),
        E511("Failed to convert JSON to POJO", 511, -1),
        E513("Firebase failed to connect", 513, -1),
        E514("Error parsing FireBase Response (SPB Props)", 514, -1),
        E515("Error parsing FireBase Response (Auth Response)", 515, -1),
        E516("Firebase session is empty", 516, -1),
        E517("Firebase listener error", 517, -1),
        E518("Amplitude callback error", 518, -1),
        E521("Utility function versionCompare has an exception", 521, -1),
        E530("GraphQL Payload Failed", 530, -1),
        E531("Add Shipping Address API call failed", 531, -1),
        E558("Failed to parse URI from Hermes", 558, -1),
        E559("Merchant context is null", 558, -1),
        E560("Return to provider response object", 560, -1),
        E561("Missing URl Params", 561, -1),
        E562("Error getting host app version", 562, -1),
        E563("Error serializing merchant order info", 563, -1),
        E564("ApprovePaymentResponse from repository is null", 564, -1),
        E565("Create order failed", 565, -1),
        E566("Auth failure", 566, -1),
        E567("Firebase JSON Exception", 567, -1),
        E568("Firebase RealTimeDB not initialized for request", 568, -1),
        E569("LSAT token creation failed", 569, -1),
        E570("Order capture failed", 570, -1),
        E571("Error Parsing UserAndCheckout Response", 571, -1),
        E572("API Error: UserAndCheckout Response", 572, -1),
        E573("Unknown Error: UserAndCheckout Response", 573, -1),
        E574("Elmo experiment api failed", 574, -1),
        E575("Firebase Task was cancelled normally", 575, -1),
        E576("There was an exception with the Firebase Task", 576, -1),
        E577("The Firebase Task returned a null result", 577, -1),
        E578("Null payer id or order id", 578, -1),
        E579("Error parsing currency conversion response", 579, -1),
        E580("Error parsing client config update response", 580, -1),
        E581("Funding eligibility failed", 581, -1),
        E582("complete strong customer authentication mutation failed", 582, -1),
        E583("Parsing error for complete strong customer authentication Response", 583, -1),
        E584("could not resolve contingency", 584, -1),
        E585("strong customer authentication fallback", 585, -1),
        E586("strong customer authentication step up cancelled", 586, -1),
        E587("strong customer authentication step up failed", 587, -1),
        E588("complete strong customer authentication did not clear contingency", 588, -1),
        E589("buttonSessionId is null or empty", 589, -1),
        E590("Firebase RealTimeDB not initialized for response", 590, -1),
        E591("No PayerId was present from Firebase message data", 591, -1),
        E592("Failed to parse Firebase message data for finish payment (JSONException)", 592, -1),
        E593("Failed to parse shipping callback Firebase request", 593, -1),
        E594("Error parsing Firebase SPB Close props (JSONException)", 594, -1),
        E595("Error parsing Firebase SPB Close props (NullPointerException)", 595, -1),
        E596("Failed to parse Firebase message data for finish payment (JSONException)", 596, -1),
        E597("Failed to parse Firebase message data for finish payment (NullPointerException)", 597, -1),
        E598("Error dialog clicked - unknown error", 598, -1),
        E599("Upgrade access token failure", 599, -1),
        E600("3ds jwt call finished", LogSeverity.CRITICAL_VALUE, -1),
        E601("device data collection finished", 601, -1),
        E602("3ds lookup finished", 602, -1),
        E603("3ds authenticate finished", 603, -1),
        E604("3ds resolve contingency finished", 604, -1),
        E605("3ds cardinal step up finished", 605, -1),
        E606("ThreeDSVersion number not matching 1.0", 606, -1),
        E607("API Error: ThreeDSJWTV1 response", 607, -1),
        E608("Generic 3DS Error", 608, -1),
        E609("3ds lookup failure", 609, -1),
        E610("3ds 1.0 jwt failure", 610, -1),
        E611("3ds api response has errors", 611, -1),
        E612("3ds 2.0 step up failure", 612, -1),
        E613("3ds flow started", 613, -1),
        E614("3ds flow finished", 614, -1),
        E615("3ds funding instrument removed", 615, -1),
        E616("3ds step up cancelled", 616, -1),
        E617("Merchant canceled checkout flow", 617, -1),
        E618("Add card error", 618, -1),
        E619("Order patch failed", 618, -1),
        E620("Add shipping error", 620, -1),
        E621("Null access token", 621, -1),
        E622("Native add card field validation error", 622, -1),
        E623("Started pre review calls", 623, -1),
        E624("Started post review calls", 624, -1),
        E625("Started post approve calls", 625, -1),
        E626("Finished pre review calls", 626, -1),
        E627("Finished post review calls", 627, -1),
        E628("Finished post approve calls", 628, -1),
        E629("Finish fetching checkout session response", 629, -1),
        E630("Native add shipping api error", 630, -1),
        E631("Native shipping button tapped", 631, -1),
        E632("Native shipping screen interacted", 632, -1),
        E633("Validate address response", 633, -1),
        E634("Failed to register network callback", 634, -1),
        E635("Native add card interaction", 635, -1),
        E636("Elmo Experiment Status", 636, -1),
        E637("API call error", 637, -1),
        E638("address book multitap options error", 638, -1),
        E639("System back button tapped", 639, -1),
        E641("CTA button label elmo experiment status", 641, -1),
        E642("Error retrieving client config", 642, -1),
        E643("NXO spb container is created", 643, -1),
        E644("NXO spb container is loading", 644, -1),
        E645("NXO spb container button is eligible", 645, -1),
        E646("NXO spb container button is ineligible", 646, -1),
        E647("NXO spb container button is clicked", 647, -1),
        E648("NXO spb container button error", 648, -1),
        E649("Crypto quote failed response", 649, -1),
        E650("Crypto quote success response", 650, -1),
        E651("Error in Locale Metadata call", 651, -1),
        E000("Undefined or uninitialized event code", 0, 0);
        
        private String eventMessage;
        private final int externalCode;
        private final int internalCode;

        private EventCode(String str, int i, int i2) {
            this.eventMessage = str;
            this.externalCode = i;
            this.internalCode = i2;
        }

        private final String toCodeString() {
            return C0015b.m88g("PAYPAL-", this.externalCode);
        }

        public final String getExternalCodeString() {
            return String.valueOf(this.externalCode);
        }

        public final String getInternalCodeString() {
            return String.valueOf(this.internalCode);
        }

        public final EventCode setEventString(String str) {
            C19383o.m32797g(str, "eventString");
            this.eventMessage = C0015b.m90i("[", str, "] ", this.eventMessage);
            return this;
        }

        public final String toPublicString() {
            return C0015b.m88g("REF: ", this.externalCode);
        }

        public String toString() {
            return C0048b.m163a(toCodeString(), ": ", this.eventMessage);
        }
    }

    public enum EventType {
        IM("im"),
        DE("de"),
        ERR("err"),
        TR("tr"),
        CL("cl"),
        SC("sc"),
        FALLBACK("fallback"),
        STATUS(ResponseConstants.STATUS);
        
        private final String type;

        private EventType(String str) {
            this.type = str;
        }

        public String toString() {
            return this.type;
        }
    }

    public enum FallbackCategory {
        FEATURE_NOT_SUPPORTED("feature_not_supported"),
        CHECKOUT_SESSION_CONTINGENCIES("checkout_session_contingencies"),
        INELIGIBLE_TRAFFIC("ineligible_traffic"),
        DATA_PARSING_ERROR("data_parsing_error"),
        AUTH("auth"),
        CHECKOUT(CartGroupItem.ELEMENT_PAYMENT_CHECKOUT),
        CHECKOUT_ERRORS("checkout_errors"),
        USER_ACTION_NOT_SUPPORTED_NATIVE("user_action_not_supported_native"),
        THREE_DS("three_ds"),
        STRONG_CUSTOMER_AUTHENTICATION("strong_customer_authentication"),
        AB_TEST("ab_test"),
        USER_CHOICE("user_choice");
        
        private final String fallbackCategory;

        private FallbackCategory(String str) {
            this.fallbackCategory = str;
        }

        public String toString() {
            return this.fallbackCategory;
        }
    }

    public enum FallbackDestination {
        WEB("web"),
        MERCHANT_APP("merchant_app");
        
        private final String fallbackDestination;

        private FallbackDestination(String str) {
            this.fallbackDestination = str;
        }

        public String toString() {
            return this.fallbackDestination;
        }
    }

    public enum FallbackReason {
        POJO_ERROR("error in converting userCheckout json to pojo"),
        CHECKOUT_RESPONSE_ERRORS("user checkout response has errors"),
        UNSUPPORTED_FLOW("has unsupported flow"),
        PAYMENT_CONTINGENCIES("has payment contingencies"),
        CANCEL_URL("exception when processing cancelUrl API response"),
        INELIGIBLE_TRAFFIC("ineligible traffic"),
        NON_USER_CANCELLED_FLOW("auth failure non-user cancelled flow"),
        UNKNOWN_CHECKOUT_ISSUE("unable to finish checkout"),
        UNKNOWN_ELIGIBILITY_ISSUE("ineligible"),
        CURRENCY_CONVERT_FAIL("failed to call updateCurrencyConversionType"),
        USER_CHECKOUT_FAIL_PAYLOAD_SERVICE("failed to call GET checkoutData at UserAndCheckoutPayloadService"),
        FIREBASE_TOKEN("Error parsing firebase token response"),
        USER_CHECKOUT_FAIL_FINISH_SERVICE("failed to call GET approvePaymentData at ApprovePaymentService"),
        USER_CHECKOUT_COMPLETED("user completed checkout, now falling back to provider"),
        USER_WEB_FLOW("User selected flow not supported natively"),
        HERMES_WEB("hermes_web"),
        POST_APPROVE_INTERCEPT_FAILURE("checkout response null - post approve intercept"),
        EMPTY_RETURN_URL("return url is empty"),
        THREE_DS_ERROR("three ds error"),
        THREE_DS_CHALLENGE_IN_3P("3DS challenge in 3P"),
        STRONG_CUSTOMER_AUTHENTICATION_FAILURE("Failure completing strong customer authentication"),
        STRONG_CUSTOMER_AUTHENTICATION_STEPUP_NOT_IMPLEMENTED("StrongCustomerAuthStepUp was not implemented"),
        COULD_NOT_RESOLVE_STRONG_CUSTOMER_AUTHENTICATION("Could not resolve strong customer authentication nor skip contingency"),
        STRONG_CUSTOMER_AUTHENTICATION_CLEARED_FAILURE("Strong customer authentication contingency did not clear"),
        CLIENT_CONFIG_ERROR("Client Config Error"),
        USER_ESCAPE_PATH("User opted out of native"),
        PAY_WITH_CRYPTO_RAMP_FAILED("Pay with crypto ramp failed"),
        NATIVE_KILL_SWITCH_FAILED("Native kill switch on start failed"),
        AB_TEST("AB Test");
        
        private String fallBackReason;

        private FallbackReason(String str) {
            this.fallBackReason = str;
        }

        public final FallbackReason setFallbackReason(String str) {
            C19383o.m32797g(str, "reason");
            this.fallBackReason = str;
            return this;
        }

        public String toString() {
            return this.fallBackReason;
        }
    }

    public enum FundingSource {
        PAYPAL("paypal"),
        VENMO("venmo");
        
        private final String source;

        private FundingSource(String str) {
            this.source = str;
        }

        public String toString() {
            return this.source;
        }
    }

    public enum LogType {
        FPTI("FPTI"),
        CAL("CAL");
        
        private final String logType;

        private LogType(String str) {
            this.logType = str;
        }

        public String toString() {
            return this.logType;
        }
    }

    public enum Outcome {
        SELECTED(ResponseConstants.SELECTED),
        UNSELECTED("unselected"),
        CLICKED(EventsNameKt.CLICKED),
        DISABLED("disabled"),
        ENABLED(ResponseConstants.ENABLED),
        SHOWN(EventsNameKt.SHOWN),
        ATTEMPTED("attempted"),
        ELIGIBLE("eligible"),
        INELIGIBLE("ineligible"),
        SUCCEEDED("succeeded"),
        SUCCESS("success"),
        SWIPELEFT("swipe_left"),
        SWIPERIGHT("swipe_right"),
        FAILED("failed"),
        FAILURE(EventsNameKt.FAILED),
        CANCELLED(EventsNameKt.CANCELLED),
        APPROVED("approved"),
        BACK_BUTTON("back_button"),
        CLOSE_BUTTON("close_button"),
        INTERACTED("interacted"),
        TIMEOUT("timeout"),
        DISCONNECTED("disconnected"),
        DARK(ResponseConstants.DARK),
        LIGHT("light"),
        UPDATED("updated"),
        BUTTON_ID_OBTAINED("button_id_obtained"),
        BUTTON_ID_NOT_OBTAINED("button_id_not_obtained"),
        SOURCE_APP_IDENTIFIED("source_app_identified"),
        FIRST_PARTY("1P"),
        THIRD_PARTY("3P"),
        BACKGROUNDED("backgrounded"),
        FOREGROUNDED("foregrounded"),
        EC_TOKEN_CHECKED("ec_token_checked"),
        BUTTON_SESSION_ID_CHECKED("button_session_id_checked"),
        REDIRECT("redirect"),
        POPUP_FLOW("popup_flow"),
        FIREBASE_FLOW("firebase_flow"),
        CUSTOM_OUTCOME("custom_outcome"),
        MERCHANT_CANCELED("merchant_canceled"),
        CACHE_STORED("cache_stored"),
        PARSED("parsed"),
        STARTED("started"),
        LOADING("loading"),
        FINISHED("finished");
        
        private String outcome;

        private Outcome(String str) {
            this.outcome = str;
        }

        public final Outcome setOutcome(String str) {
            C19383o.m32797g(str, "outcome");
            this.outcome = str;
            return this;
        }

        public String toString() {
            return this.outcome;
        }
    }

    public enum PayPalChannelInfo {
        NATIVE(""),
        MOBILE_TO_WEB("mobile-web"),
        DESKTOP_TO_MOBILE("desktop-web");
        
        public static final Companion Companion = null;
        private final String channelInfo;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PayPalChannelInfo value(String str) {
                C19383o.m32797g(str, "channelInfo");
                return C19383o.m32792b(str, "mobile-web") ? PayPalChannelInfo.MOBILE_TO_WEB : C19383o.m32792b(str, "desktop-web") ? PayPalChannelInfo.DESKTOP_TO_MOBILE : PayPalChannelInfo.NATIVE;
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
        }

        private PayPalChannelInfo(String str) {
            this.channelInfo = str;
        }

        public String toString() {
            return this.channelInfo;
        }
    }

    public enum Stage {
        PREPARING_AUTH("preparing_auth"),
        AUTH_SHOWN("auth_shown"),
        NATIVE_BEGIN("native_begin"),
        FIREBASE("firebase"),
        WITH_PROPS("with_props"),
        LSAT_UPGRADED("lsat_upgraded"),
        ELIGIBLE("eligible"),
        PAYSHEET_SHOWN("paysheet_shown"),
        WEB_FALLBACK("web_fallback"),
        NATIVE_FALLBACK("native_fallback"),
        SHUTDOWN("shutdown"),
        APPROVING_CHECKOUT("approving_checkout"),
        THREE_DS_V1("three_DS_v1"),
        THREE_DS_V2("three_DS_v2"),
        THREE_DS("three_DS"),
        FINISHING("finishing"),
        APPROVING_WEB_CHECKOUT("approving_web_checkout"),
        SWITCHING_TO_MERCHANT("switching_to_merchant");
        
        private final String stage;

        private Stage(String str) {
            this.stage = str;
        }

        public String toString() {
            return this.stage;
        }
    }

    public enum StartCheckoutKeys {
        BUTTON_SESSION_ID("buttonSessionID"),
        STICKINESS_ID("stickinessID"),
        FB_SESSION_UID("sessionUID"),
        PAGE_URL("pageUrl"),
        TOKEN(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN),
        WEB_CHECKOUT_URL("webCheckoutUrl"),
        MESSAGE_DATA("message_data"),
        BUTTON_VERSION("sdkVersion"),
        ORDER_ID("orderID"),
        FACILITATOR_ACCESS_TOKEN("facilitatorAccessToken"),
        FORCE_ELIGIBLE("forceEligible"),
        COMMIT("commit"),
        USER_ACTION("useraction"),
        FUNDING_SOURCE("fundingSource"),
        ENABLE_FUNDING("enableFunding"),
        DB_INSTANCE_ID("rtdbInstanceID"),
        FACILITATOR_CLIENT_ID("clientID"),
        DOMAIN("domain"),
        CHANNEL(AppsFlyerProperties.CHANNEL),
        BUYER_LANGUAGE("buyerLanguage"),
        BUYER_IP_COUNTRY("buyerCountry");
        
        private final String spbKey;

        private StartCheckoutKeys(String str) {
            this.spbKey = str;
        }

        public String toString() {
            return this.spbKey;
        }
    }

    public enum StartupMechanism {
        NSPB("nspb_click"),
        MERCHANT("merchant_click"),
        WSPB("wspb_click");
        
        private final String startupMechanism;

        private StartupMechanism(String str) {
            this.startupMechanism = str;
        }

        public String toString() {
            return this.startupMechanism;
        }
    }

    public enum StateName {
        SDK_START("sdk_start"),
        REVIEW("review"),
        NATIVE_SPB_CONTAINER("native_spb_container"),
        PAY_LATER("pay_later"),
        PAYPAL_CREDIT("paypal_credit"),
        PAYPAL("paypal"),
        CURRENCY_CONVERSION("currency_conversion"),
        SHIPPING("shipping"),
        SHIPPING_CALLBACK("shipping_callback"),
        SHIPPING_OPTION(ServerDrivenAction.TYPE_SHIPPING_OPTION),
        SHIPPING_METHODS("shipping_methods"),
        FETCH_CART_INFO("fetch_cart_info"),
        SHIP_IT("ship_it"),
        PICK_IT_UP("pick_it_up"),
        READY(ShopAboutVideo.PROVIDER_STATUS_READY),
        PAYLOAD_SENT("firebase_payload_sent"),
        PAYLOAD_RECEIVED("firebase_payload_received"),
        USER_PROFILE(ResponseConstants.USER_PROFILE),
        STARTUP("startup"),
        SHUTDOWN("shutdown"),
        NXO_PRE_TRIGGER("nxo_pre_trigger"),
        UTILS("internal_utilities"),
        THREE_DS("three_ds"),
        STRONG_CUSTOMER_AUTHENTICATION("strong_customer_authentication"),
        EXTERNAL_LOG("external_log"),
        AB("ELMO_CHECK"),
        ADD_SHIPPING("ADD_SHIPPING"),
        NATIVE_ADD_CARD("NATIVE_ADD_CARD"),
        NETWORK_CONNECTIVITY("network_connectivity"),
        POST_REVIEW("post_review"),
        OVER_CAPTURE("over_capture"),
        CUSTOM_STATE_NAME("custom_state_name"),
        PAY_WITH_CRYPTO("pay_with_crypto"),
        BRAINTREE("braintree"),
        NONE("none");
        
        private String stateName;

        private StateName(String str) {
            this.stateName = str;
        }

        public final StateName setStateName(String str) {
            C19383o.m32797g(str, "stateName");
            this.stateName = str;
            return this;
        }

        public String toString() {
            return this.stateName;
        }
    }

    public enum TransitionName {
        FINISH_FETCHING_CHECKOUT_SESSION("finish_fetching_checkout_session"),
        STARTED_PRE_REVIEW_CALLS("started_pre_review_calls"),
        STARTED_POST_REVIEW_CALLS("started_post_review_calls"),
        STARTED_POST_APPROVE_CALLS("started_post_approve_calls"),
        FINISHED_PRE_REVIEW_CALLS("finished_pre_review_calls"),
        FINISHED_POST_REVIEW_CALLS("finished_post_review_calls"),
        FINISHED_POST_APPROVE_CALLS("finished_post_approve_calls"),
        REVIEW_YOUR_INFORMATION_SCREEN_SHOWN("prepare_review"),
        PROFILE_PICTURE_TAPPED("profile_picture_tapped"),
        FUNDING_INSTRUMENT_TAPPED("funding_instrument_tapped"),
        PAYMENT_RIGHTSANDPOLICIES_CLICKED("payment_rightsandpolicies_clicked"),
        PAYMENT_POLICIES_CLICKED("payment_policies_clicked"),
        PAYMENT_TERMS_CLICKED("payment_terms_clicked"),
        PRIVACY_LINK_CLICKED("privacy_link_clicked"),
        APPROVE_PAYMENT_PATH_CHOICE("approve_payment_path_choice"),
        LOGOUT_CLICKED("logout_clicked"),
        RETURN_TO_PROVIDER("return_to_1st_party_provider"),
        PAYMENT_SUBMITTED("process_review"),
        PAYMENT_OUTCOME("payment_outcome"),
        ADD_FI_TAPPED("add_fi_tapped"),
        CURRENCY_CONVERSION_OPTIONS_CLICKED("currency_conversion_options_clicked"),
        CARD_PREFERENCE_ACTIVATED("card_preference_activated"),
        CARD_PREFERENCE_CLICKED("card_preference_clicked"),
        CARD_PREFERENCE_DEACTIVATED("card_preference_deactivated"),
        FI_SCROLL_LEFT("fi_scroll_left"),
        FI_SCROLL_RIGHT("fi_scroll_right"),
        CURRENCY_CONVERSION_VIEW_SHOWN("currency_conversion_view_shown"),
        CURRENCY_OPTIONS_SHOWN("currency_options_shown"),
        CURRENCY_OPTION_TAPPED("currency_option_tapped"),
        CURRENCY_SELECTION_SUBMITTED("currency_selection_submitted"),
        CURRENCY_CONVERSION_RESPONSE("currency_conversion_response"),
        SHIPPING_VIEW_SHOWN("shipping_view_shown"),
        SHIPPING_ADDRESS_SELECTED("shipping_address_selected"),
        NATIVE_XO_ENTRY_NOT_STARTED("native_xo_entry_not_started"),
        NATIVE_XO_ENTRY("native_xo_entry"),
        NATIVE_XO_APP_INITIALIZATION("native_xo_app_initialization"),
        NATIVE_XO_TRIGGERED("native_xo_triggered"),
        NATIVE_XO_START("native_xo_started"),
        NATIVE_XO_AUTH_ATTEMPTED("native_xo_auth_attempted"),
        NATIVE_XO_POST_AUTH("native_xo_post_auth"),
        NATIVE_XO_AUTH_RESPONSE("native_xo_auth_response"),
        NATIVE_XO_POST_AUTH_ELIGIBILITY_CHECK("native_xo_post_auth_eligibility_check"),
        NATIVE_XO_ELIGIBILITY_RESPONSE("native_xo_eligibility_response"),
        NATIVE_XO_FLOW_COMPLETION("native_xo_flow_completion"),
        NATIVE_XO_ELIGIBILITY_AUTO_AUTH("native_xo_eligibility_auto_auth"),
        NATIVE_XO_ELIGIBILITY_PARAMS_ERROR("eligibility_params_error"),
        NATIVE_XO_TRANSITION_TO_WEB_AUTO_AUTH("native_xo_transition_to_web_auto_auth"),
        NATIVE_XO_LSAT_UPGRADE_REQUEST("native_xo_lsat_uprade_request"),
        NATIVE_XO_POST_LSAT_UPGRADE_REQUEST("native_xo_post_lsat_upgrade_request"),
        NATIVE_XO_POST_LSAT_UPGRADE_TOKEN("lsat_upgrade_token"),
        NATIVE_XO_POST_LSAT_CREATE_TOKEN("lsat_xreate_token"),
        NATIVE_XO_FB_PROCESS_STARTED("native_xo_fb_started"),
        NATIVE_XO_FB_TOKEN_RECEIVED("native_xo_fb_token_received"),
        NATIVE_XO_FB_CUSTOM_TOKEN_SIGNIN("native_xo_fb_custom_token_signin"),
        NATIVE_XO_FB_PROPS_ACQUIRED("native_xo_fb_props_acquired"),
        NATIVE_XO_FB_PROPS_PROCESSED("native_xo_fb_props_processed"),
        NATIVE_XO_FB_COMMUNICATION_FAILED("native_xo_fb_communication_failed"),
        NATIVE_XO_FB_CONNECTION_ONLINE("native_xo_fb_connection_online"),
        NATIVE_XO_FB_CONNECTION_OFFLINE("native_xo_fb_connection_offline"),
        NATIVE_XO_FB_CONNECTION_CANCELLED("native_xo_fb_connection_offline"),
        NATIVE_XO_CTA_BUTTON_READY("native_xo__cta_button_ready"),
        NATIVE_XO_ORDER_RESPONSE("native_xo_order_response"),
        NATIVE_XO_AUTH_TYPE_CHOSEN("native_xo_auth_type_chosen"),
        NATIVE_XO_CHECKOUT_ON_APPROVE("native_xo_checkout_on_approve"),
        NATIVE_XO_RTDB_ONERROR("native_xo_rtdb_onerror"),
        NATIVE_XO_CHECKOUT_FINISH_RESPONSE("native_xo_checkout_finish_response"),
        NATIVE_XO_SPB_ON_CANCELLED("native_xo_checkout_spb_on_cancel"),
        NATIVE_XO_COMPLETE_ON_RESPONSE("native_xo_checkout_on_approve"),
        NATIVE_XO_NULL_PAYER_ID("native_xo_null_payer_id"),
        NATIVE_ADD_CARD("native_card_add"),
        NATIVE_ADD_SHIPPING("native_card_shipping"),
        FALLBACK_TO_WEB("fallback_to_web_experience"),
        LOAD_CCT_VIEW("load_cct_view"),
        FALLBACK_TO_NATIVE("fallback_to_native_experience"),
        FIREBASE_PAYLOAD_SENT("firebase_payload_sent"),
        FIREBASE_LISTENER("firebase_listener"),
        NATIVE_XO_EXIT("exit_app"),
        ADDRESS_BOOK_TO_WEB("address_book_to_web"),
        NAVIGATE_TO_ADDRESS_BOOK("mainpaysheet_navigate_to_address_book_screen"),
        ADDRESS_BOOK_MULTI_TAP("address_book_multi_tap"),
        ADD_SHIPPING_DIALOG("add_shipping_address_dialog"),
        ADD_CARD_DIALOG("add_new_card_dialog"),
        PAYPAL_CREDIT_DIALOG("paypal_credit_dialog"),
        GLOBAL_PAY_LATER_DIALOG("global_pay_later_dialog"),
        ADD_SHIPPING_ADDRESS_API("add_shipping_address_api"),
        SOURCE_APP_IDENTIFIED("source_app_identified"),
        DUPLICATE_EC_TOKEN("duplicate_ec_token"),
        DUPLICATE_BUTTON_SESSION_ID("duplicate_button_session_id"),
        DB_INSTANCE_IDENTIFIED("db_instance_identified"),
        SHOW_FINAL_CHECKOUT_ANIMATION("show_final_checkout_animation"),
        CACHE("cache"),
        FIRED_FINISH_FINAL_CHECKOUT_ANIMATION("fired_finished_final_checkout_animation"),
        LISTENED_FINISH_FINAL_CHECKOUT_ANIMATION("listened_to_finished_final_checkout_animation"),
        INITIALIZATION_CALLBACK_REQUEST("initialization_callback_request"),
        NETWORK_CONNECTIVITY_LOST("network_connectivity_lost"),
        CHANGE_CTA_LABELS_MOBILE_XO("change_cta_labels_mobile_xo"),
        STRONG_CUSTOMER_AUTHENTICATION_SHOWN("strong_customer_authentication_shown"),
        STRONG_CUSTOMER_AUTHENTICATION_COMPLETE("strong_customer_authentication_complete"),
        STRONG_CUSTOMER_AUTHENTICATION_CLEARED("strong_customer_authentication_cleared"),
        WALLET_AUTH_ATTEMPTED("wallet_auth_attempted"),
        WALLET_AUTH_RESPONSE("wallet_auth_response"),
        WALLET_GET_USER_ACCESS_TOKEN("wallet_get_user_access_token"),
        WALLET_USER_LOGOUT("wallet_user_logout"),
        BALANCE_VIEW_SHOWN("balance_view_shown"),
        USER_PROFILE_SHOWN("user_profile_shown"),
        USER_PROFILE_IMAGE_SHOWN("profile_image_shown"),
        USER_INITIALS_SHOWN("profile_initials_shown"),
        CARD_CLASSIFICATION("card_text_color_choice"),
        GRAPH_QL_PAYLOAD("graphql_payload_received"),
        BALANCE_TOGGLE_SHOWN("enabled_balance_toggle_shown"),
        BALANCE_TOGGLE_HIDDEN("disabled_balance_toggle_shown"),
        ADD_CARD_BTN_SHOWN_PAYNOW("add_card_button_shown_paynow"),
        ADD_CARD_BTN_SHOWN_CONTINUE("add_card_button_shown_continue"),
        CART_DETAILS_ARROW_SHOWN("cart_details_arrow_view_shown"),
        INVOICE_SUMMARY_SHOWN("invoice_summaryview_shown"),
        CAROUSEL_SHOWN("carousel_shown_setup_carousel"),
        SHIPPING_ADDRESS_UPDATED("updated_main_shipping_address_shown"),
        DARK_THEME("dark_theme"),
        GLOBAL_PAY_LATER_VIEW_SHOWN("global_pay_later_view_shown"),
        PAYPAL_CREDIT_VIEW_SHOWN("paypal_credit_view_shown"),
        CART_PARAM_CONVERTER("cart_param_converter"),
        SHIPPING_CHANGE_TAPPED("shipping_change_tapped"),
        SHIPPING_CHANGE_TAPPED_FAILED("shipping_change_tapped_disallowed"),
        ADD_SHIPPING_ADDRESS_CLICKED("add_shipping_address_clicked"),
        CLICKED_OUTSIDE_DIALOG("clicked_outside_paysheet_dialog"),
        CLICKED_LOGOUT_DIALOG("logout_dialog"),
        APP_BACKGROUNDED("app_backgrounded"),
        APP_FOREGROUNDED("app_foregrounded"),
        EXPANDED_PROD_DETAILS_SHOWN("expanded_product_details_shown"),
        CLICKED_TO_EXPAND_PROD_DETS("clicked_to_expand_product_details"),
        CLICKED_TO_MIN_PROD_DETS("clicked_to_minimize_product_details"),
        CURRENCY_CONVERSION_VIEW_UPDATED("updated_conversionrate_and_amount_paid_shown"),
        CLIENT_CONFIG_UPDATE("update_client_config"),
        PAYPAL_CREDIT_CTA_CLICKED("paypal_credit_cta_clicked"),
        GLOBAL_PAY_LATER_CTA_CLICKED("global_pay_later_cta_clicked"),
        ERROR_DIALOG_FALLBACK_CLICKED("error_dialog_fallback_clicked"),
        ESCAPE_PATH_CLICKED("clicked_escape_path"),
        VALIDATE_ADDRESS_RESPONSE("validate_address_response"),
        CRYPTO_HOW_IT_WORKS_CLICKED("crypto_how_it_works_clicked"),
        CRYPTO_RATES_AND_FEES_CLICKED("crypto_rates_and_fees_clicked"),
        CRYPTO_TERMS_SERVICE_CLICKED("crypto_terms_service_clicked"),
        CRYPTO_CONSENT_ACCEPTED("crypto_consent_accepted"),
        CRYPTO_LEGAL_PAGE_LOADING("crypto_legal_page_loading"),
        CRYPTO_LEGAL_PAGE_SHOWN("crypto_legal_page_shown"),
        CRYPTO_RATE_VIEW_SHOWN("crypto_rate_view_shown"),
        CRYPTO_QUOTE_CALL("crypto_quote_call"),
        SHIPPING_CALLBACK_BLOCKING_BEHAVIOR("shipping_callback_blocking_behavior"),
        SHIP_IT_CLICKED("ship_it_clicked"),
        INVALID_SHIPPING_ADDRESS_CTA_BUTTON_TAPPED("invalid_shipping_address_cta_button_tapped"),
        INVALID_SHIPPING_METHOD_CTA_BUTTON_TAPPED("invalid_shipping_method_cta_button_tapped"),
        CREATE_ORDER_EXECUTED("create_order_executed"),
        ORDER_CAPTURE_EXECUTED("capture_executed"),
        ORDER_AUTHORIZE_EXECUTED("authorize_executed"),
        FUNDING_ELIGIBILITY_EXECUTED("funding_eligibility_executed"),
        CONNECTIVITY_HANDLER_INITIALIZED("connectivity_handler_initialized"),
        ELMO_PROCESS_CHECK("process_elmo_check"),
        THREE_DS_ONE_FLOW_ENTERED("3ds_one_flow_entered"),
        THREE_DS_TWO_FLOW_ENTERED("3ds_two_flow_entered"),
        THREE_DS_JWT_QUERY_STARTED("3ds_jwt_query_started"),
        THREE_DS_JWT_QUERY_FINISHED("3ds_jwt_query_finished"),
        THREE_DS_DDC_STARTED("3ds_ddc_started"),
        THREE_DS_DDC_FINISHED("3ds_ddc_finished"),
        THREE_DS_LOOKUP_STARTED("3ds_lookup_started"),
        THREE_DS_LOOKUP_FINISHED("3ds_lookup_finished"),
        THREE_DS_AUTHENTICATE_STARTED("3ds_authenticate_started"),
        THREE_DS_AUTHENTICATE_FINISHED("3ds_authenticate_finished"),
        THREE_DS_CARDINAL_STEP_UP_STARTED("3ds_cardinal_step_up_started"),
        THREE_DS_CARDINAL_STEP_UP_FINISHED("3ds_cardinal_step_up_finished"),
        THREE_DS_RESOLVE_CONTINGENCY_STARTED("3ds_resolve_contingency_started"),
        THREE_DS_RESOLVE_CONTINGENCY_FINISHED("3ds_resolve_contingency_finished"),
        THREE_DS_GENERIC_EXCEPTION("3ds_generic_exception"),
        THREE_DS_CONTINGENCY_FLOW_STARTED("3ds_contingency_flow_started"),
        THREE_DS_CONTINGENCY_FLOW_FINISHED("3ds_contingency_flow_finished"),
        THREE_DS_FUNDING_INSTRUMENT_DISABLED("3ds_funding_instrument_disabled"),
        THREE_DS_USER_CANCELLED_STEP_UP("3ds_user_cancelled_step_up"),
        THREE_DS_10_CONTINGENCY_ENCOUNTERED("3ds_1.0_contingency_encountered"),
        THREE_DS_JWT_STEP_QUERY_STARTED("3ds_jwt_step_up_query_started"),
        THREE_DS_JWT_STEP_QUERY_FINISHED("3ds_jwt_step_up_query_finished"),
        NATIVE_ADD_CARD_SHOWN("native_add_card_shown"),
        NATIVE_ADD_CARD_INTERACTION("native_add_card_interaction"),
        NATIVE_ADD_CARD_ATTEMPTED("native_add_card_attempted"),
        NATIVE_ADD_CARD_RESPONSE("native_add_card_response"),
        NATIVE_ADD_CARD_THREE_DS_STARTED("native_add_card_three_ds_started"),
        NATIVE_ADD_CARD_THREE_DS_RESPONSE("native_add_card_three_ds_response"),
        UPDATE_CHECKOUT_SESSION_FUNDING_OPTIONS_ATTEMPTED("update_checkout_session_funding_options_attempted"),
        UPDATE_CHECKOUT_SESSION_FUNDING_OPTIONS_RESPONSE("update_checkout_session_funding_options_response"),
        NATIVE_ADD_SHIPPING_CHANGE_TAPPED("native_add_shipping_change_tapped"),
        NATIVE_ADD_SHIPPING_VIEW_SHOWN("native_add_shipping_view_shown"),
        NATIVE_ADD_SHIPPING_ADDRESS_CLICKED("native_add_shipping_address_clicked"),
        NATIVE_ADD_SHIPPING_NEW_SHIPPING_ADDRESS_RENDER("native_add_shipping_new_shipping_address_render"),
        NATIVE_ADD_SHIPPING_FIELD_INTERACTION("native_add_shipping_field_interaction"),
        NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR("native_add_shipping_field_interaction_blur"),
        AUTO_ADDRESS_SUCCESS("auto_address_success"),
        AUTO_ADDRESS_FAILED("auto_address_failed"),
        AUTO_ADDRESS_ATTEMPTED("auto_address_attempted"),
        ADD_ADDRESS_MANUALLY_CLICKED("add_address_manually_clicked"),
        ADD_ADDRESS_MANUALLY_ENTERED("add_address_manually_entered"),
        ADD_ADDRESS_ADDED_MANUALLY("add_address_added_manually"),
        SAVE_ADDRESS_CLICKED("save_address_clicked"),
        SELECTED_COUNTRY_CLICKED("select_country_clicked"),
        SELECT_COUNTRY_SCREEN_RENDER("select_country_screen_render"),
        PROCESS_SELECTED_COUNTRY("process_selected_country"),
        PROCESS_SHIPPING_CALLBACK("process_shipping_callback"),
        SHIPPING_OPTION_CHANGE_TAPPED("shipping_option_change_tapped"),
        PATCH_ORDER_EXECUTED("patch_order_executed"),
        SHIPPING_OPTION_SELECTED("shipping_option_selected"),
        PICKUP_OPTION_SELECTED("pickup_option_selected"),
        SHIPPING_OPTION_RENDER("shipping_option_render"),
        PICK_IT_UP_CLICKED("pick_it_up_clicked"),
        PICK_IT_UP_RENDERED("pick_it_up_rendered"),
        SHIP_IT_RENDER("ship_it_render"),
        SHIPPING_FETCH_CART_INFO("shipping_fetch_cart_info"),
        SHIPPING_ADDRESS_CHANGE_ENABLED("shipping_address_change_enabled"),
        ADD_SHIPPING_BUTTON_SHOWN("add_shipping_button_shown"),
        SHIPPING_ADDRESS_VISIBLE("shipping_address_visible"),
        PLACE_ID_ATTEMPTED("place_id_attempted"),
        PLACE_ID_SUCCESS("place_id_success"),
        PLACE_ID_ERROR("place_id_error"),
        UPGRADE_ACCESS_TOKEN_ATTEMPTED("upgrade_access_token_attempted"),
        UPGRADE_ACCESS_TOKEN_RESPONSE("upgrade_access_token_response"),
        CUSTOM_TRANSITION_NAME("custom_transition_name"),
        CONTEXT_INSTANCE("context_instance"),
        USER_ESCAPE_PATH("user_escape_path"),
        BLOCKING_CONTINGENCIES_RECEIVED("blocking_contingencies_received"),
        BLOCKING_CONTINGENCIES_RESOLVED("blocking_contingencies_resolved"),
        FPTI_LOGGING_ERROR("fpti_logging_error"),
        USER_CANCELED_CHECKOUT("user_canceled_checkout"),
        CLICKED_TO_EXIT("clicked_to_exit"),
        BACK_PRESSED_TO_EXIT("back_pressed_to_exit"),
        AMPLITUDE_CALLBACK_ERROR("amplitude_callback_error"),
        RETRY_ON_FAILURE("retry_on_failure"),
        STARTUP_URI_PARSED("startup_uri_parsed"),
        URI_RECEIVED("uri_received"),
        NETWORK_EXECUTE_SUSPENDING("network_execute_suspending"),
        ACTIVITY_RECREATION_DETECTED("activity_recreated"),
        RELAUNCH_PAYSHEET("relaunch_paysheet"),
        SESSION_RESTORED("session_restored"),
        RETURN_FROM_CCT("initiate_checkout_return_from_cct"),
        SYSTEM_BACK_BUTTON_TAPPED("system_back_button_tapped"),
        NXO_FRAGMENT_SHOWN("nxo_fragment_shown"),
        NXO_FRAGMENT_ATTACHED("nxo_fragment_attached"),
        NXO_ACTIVITY_LIFECYCLE("nxo_activity_lifecycle"),
        BUTTON_SESSION_ID_PASSED("button_session_id_passed"),
        CRASHLOGGER_INITIALIZED("nxo_crashlogger_initialized"),
        CRASHLOGGER_NOT_INITIALIZED("nxo_crashlogger_not_initialized"),
        NXO_MODULE_INITIALIZED("nxo_module_initialized"),
        NXO_MODULE_NOT_INITIALIZED("nxo_module_not_initialized"),
        START_CHECKOUT_WITH_TOKEN("start_checkout_with_token"),
        ON_NEW_INTENT("initiate_checkout_on_new_intent"),
        KILL_ME_CALLED("kill_me_called"),
        INITIATE_CHECKOUT_FIND_TRIGGERED_APP("initiate_checkout_find_triggered_app"),
        HOME_ACTIVITY_LAUNCHED("home_activity_launched"),
        CONTENT_ROUTER_START_FRAGMENT("content_router_start_fragment"),
        MAIN_VIEW_MODEL_LIFECYCLE("main_view_model_lifecycle"),
        MAIN_VIEW_MODEL_START_FRAGMENT("main_view_model_start_fragment"),
        ENTER_LOADING_TEXT_SHOWN("enter_loading_text_shown"),
        ENTER_LOADING_TEXT_HIDDEN("enter_loading_text_hidden"),
        FINAL_LOADING_ANIMATION("final_loading_animation"),
        CREATE_ORDER_RESTORED("create_order_restored"),
        NXO_SPB_CONTAINER_CREATE("nxo_spb_container_create"),
        NXO_SPB_CONTAINER_LOADING("nxo_spb_container_loading"),
        NXO_SPB_CONTAINER_ELIGIBILITY_RESPONSE("nxo_spb_container_eligibility_response"),
        NXO_SPB_CONTAINER_ON_CLICK("nxo_spb_container_on_click"),
        UPLOAD_PENDING_AMPLITUDE_EVENTS("upload_pending_amplitude_events"),
        CHECKOUT_SESSION_TYPE_IDENTIFIED("checkout_session_type_identified"),
        BA_AUTHORIZATION_INFO_CLICKED("ba_authorization_info_clicked"),
        BA_AUTHORIZATION_INFO_PAGE_SHOWN("ba_authorization_info_page_shown"),
        BA_ALWAYS_USE_BALANCE_CLICKED("ba_always_use_balance_clicked"),
        BA_EXECUTE_RESPONSE("ba_execute_response"),
        SHOWING_OVER_CAPTURE("showing_over_capture"),
        GET_ORDER_DETAILS_REQUEST("get_order_details_request"),
        SHOW_LINK_TEXT("show_link_text"),
        CONTENT_ROUTER_GET_CURRENT_FRAGMENT("content_router_get_current_fragment"),
        BRAINTREE_ROUTING("xo_routing_braintree"),
        LOGIN_SCREEN_BACK_BUTTON_CLICKED("login_screen_back_button_clicked"),
        LOGIN_SCREEN_CANCEL_CLICKED("login_screen_cancel_button_clicked");
        
        private String transitionName;

        private TransitionName(String str) {
            this.transitionName = str;
        }

        public final TransitionName setTransitionName(String str) {
            C19383o.m32797g(str, "transitionName");
            this.transitionName = str;
            return this;
        }

        public String toString() {
            return this.transitionName;
        }
    }

    private PEnums() {
    }
}
