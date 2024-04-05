package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.PackageUtils;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import p030bo.app.C3768i;
import p030bo.app.C4230u0;
import p030bo.app.C4242v0;
import p753kq.C19846a;
import p755lq.C19875a;
import p755lq.C19880e;

public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final C5383a Companion = new C5383a();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = ((int) TimeUnit.SECONDS.toMillis(15));
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$a */
    public static final class C5383a {
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$b */
    public enum C5384b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata");
        

        /* renamed from: b */
        private final String f11578b;

        private C5384b(String str) {
            this.f11578b = str;
        }

        /* renamed from: b */
        public final String mo15858b() {
            return this.f11578b;
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$c */
    public static final class C5385c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11579b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5385c(String str) {
            super(0);
            this.f11579b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11579b, "Couldn't find application icon for package: ");
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$d */
    public static final class C5386d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5386d f11580b = new C5386d();

        public C5386d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$e */
    public static final class C5387e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5387e f11581b = new C5387e();

        public C5387e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Found an override api key. Using it to configure the Braze SDK";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$f */
    public static final class C5388f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5388f f11582b = new C5388f();

        public C5388f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$g */
    public static final class C5389g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5389g f11583b = new C5389g();

        public C5389g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$h */
    public static final class C5390h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5390h f11584b = new C5390h();

        public C5390h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                 !! WARNING !!                  **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$i */
    public static final class C5391i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5391i f11585b = new C5391i();

        public C5391i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$j */
    public static final class C5392j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5392j f11586b = new C5392j();

        public C5392j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$k */
    public static final class C5393k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5393k f11587b = new C5393k();

        public C5393k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$l */
    public static final class C5394l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5394l f11588b = new C5394l();

        public C5394l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**          Braze functionality disabled          **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$m */
    public static final class C5395m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5395m f11589b = new C5395m();

        public C5395m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$n */
    public static final class C5396n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5396n f11590b = new C5396n();

        public C5396n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Using default notification accent color found in resources";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$o */
    public static final class C5397o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5397o f11591b = new C5397o();

        public C5397o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$p */
    public static final class C5398p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5398p f11592b = new C5398p();

        public C5398p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while parsing stored SDK flavor. Returning null.";
        }
    }

    /* renamed from: com.braze.configuration.BrazeConfigurationProvider$q */
    public static final class C5399q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5399q f11593b = new C5399q();

        public C5399q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to read the version code.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context2) {
        super(context2, false, (RuntimeAppConfigurationProvider) null, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, C5384b bVar) {
        String b = bVar.mo15858b();
        if (getConfigurationCache().containsKey(b)) {
            Object obj = getConfigurationCache().get(b);
            if (obj != null) {
                return (EnumSet) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
        }
        Set stringSetValue = getStringSetValue(bVar.mo15858b(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet();
        }
        EnumSet<E> a = C4230u0.m9699a(cls, (Set<String>) stringSetValue);
        getConfigurationCache().put(b, a);
        return a;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(C5384b.SERVER_TARGET_KEY.mo15858b(), "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().f11613a.edit().clear().apply();
    }

    public final int getApplicationIconResourceId() {
        int i;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        String packageName = this.context.getPackageName();
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0)) : this.context.getPackageManager().getApplicationInfo(packageName, 0);
            C19383o.m32796f(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i = applicationInfo.icon;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C5385c(packageName), 4);
            i = 0;
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String upperCase = serverTarget.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return C19383o.m32792b("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final C3768i getBrazeApiKey() {
        String b = C5384b.API_KEY.mo15858b();
        String str = (String) getConfigurationCache().get(b);
        if (str == null) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = getRuntimeAppConfigurationProvider();
            runtimeAppConfigurationProvider.getClass();
            C19383o.m32797g(b, "key");
            str = runtimeAppConfigurationProvider.f11613a.getString(b, (String) null);
            if (str != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5387e.f11581b, 6);
            } else {
                str = getStringValue(b, (String) null);
            }
            if (str != null) {
                getConfigurationCache().put(b, str);
            }
        }
        if (str != null) {
            return new C3768i(str);
        }
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger brazeLogger2 = brazeLogger;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5388f.f11582b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5389g.f11583b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5390h.f11584b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5391i.f11585b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5392j.f11586b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5393k.f11587b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5394l.f11588b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5395m.f11589b, 6);
        BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5386d.f11580b, 6);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final String getCustomEndpoint() {
        return getStringValue(C5384b.CUSTOM_ENDPOINT.mo15858b(), (String) null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(C5384b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.mo15858b(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, C5384b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(C5384b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.mo15858b());
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5396n.f11590b, 7);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(C5384b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.mo15858b(), "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(C5384b.DEFAULT_NOTIFICATION_CHANNEL_NAME.mo15858b(), DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, C5384b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(C5384b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.mo15858b(), false);
    }

    public final Set<String> getEphemeralEventKeys() {
        String b = C5384b.EPHEMERAL_EVENTS_KEYS.mo15858b();
        Set set = EmptySet.INSTANCE;
        Set stringSetValue = getStringSetValue(b, set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5397o.f11591b, 6);
        }
        return C19327t.m32664t1(C19327t.m32657m1(set, 12));
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(C5384b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.mo15858b(), (String) null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(C5384b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.mo15858b(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(C5384b.LARGE_NOTIFICATION_ICON_KEY.mo15858b(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(C5384b.LOGGER_INITIAL_LOG_LEVEL.mo15858b(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(C5384b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.mo15858b(), "");
    }

    public final SdkFlavor getSdkFlavor() {
        String stringValue = getStringValue(C5384b.SDK_FLAVOR.mo15858b(), (String) null);
        if (stringValue == null || C19457k.m33020X0(stringValue)) {
            return null;
        }
        try {
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = stringValue.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return SdkFlavor.valueOf(upperCase);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5398p.f11592b, 4);
            return null;
        }
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String b = C5384b.SDK_METADATA_INTERNAL_KEY.mo15858b();
        CachedConfigurationProvider.C5401b bVar = CachedConfigurationProvider.C5401b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(bVar, b, new HashSet());
        if (resourceConfigurationValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        } else if (!(resourceConfigurationValue instanceof C19875a) || (resourceConfigurationValue instanceof C19880e)) {
            try {
                Set<String> set = (Set) resourceConfigurationValue;
                String b2 = C5384b.SDK_METADATA_PUBLIC_KEY.mo15858b();
                Object resourceConfigurationValue2 = getResourceConfigurationValue(bVar, b2, new HashSet());
                if (resourceConfigurationValue2 != null) {
                    Set set2 = (Set) resourceConfigurationValue2;
                    Object runtimeConfigurationValue = getRuntimeConfigurationValue(bVar, b2, new HashSet());
                    if (runtimeConfigurationValue != null) {
                        set.addAll(set2);
                        set.addAll((Set) runtimeConfigurationValue);
                        C4230u0 u0Var = C4230u0.f9378a;
                        EnumSet<BrazeSdkMetadata> noneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
                        for (String str : set) {
                            try {
                                C4230u0 u0Var2 = C4230u0.f9378a;
                                Locale locale = Locale.US;
                                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                                String upperCase = str.toUpperCase(locale);
                                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                                BrazeSdkMetadata[] values = BrazeSdkMetadata.values();
                                int i = 0;
                                int length = values.length;
                                while (i < length) {
                                    BrazeSdkMetadata brazeSdkMetadata = values[i];
                                    i++;
                                    if (C19383o.m32792b(brazeSdkMetadata.name(), upperCase)) {
                                        noneOf.add(brazeSdkMetadata);
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            } catch (Exception e) {
                                BrazeLogger.m11282d(BrazeLogger.f11932a, C4230u0.f9378a, BrazeLogger.Priority.E, e, new C4242v0(str), 4);
                            }
                        }
                        C19383o.m32796f(noneOf, "result");
                        return noneOf;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            } catch (ClassCastException e2) {
                C19383o.m32801k(C19389t.class.getName(), e2);
                throw e2;
            }
        } else {
            C19389t.m32911e(resourceConfigurationValue, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(C5384b.SESSION_TIMEOUT_KEY.mo15858b(), 10);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(C5384b.SMALL_NOTIFICATION_ICON_KEY.mo15858b(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return (long) getIntValue(C5384b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.mo15858b(), 30);
    }

    public final int getVersionCode() {
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        try {
            i = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5399q.f11593b, 4);
            i = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(C5384b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.mo15858b(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(C5384b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.mo15858b(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(C5384b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.mo15858b(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(C5384b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.mo15858b(), false);
    }

    public final boolean isDeviceObjectWhitelistEnabled() {
        return isDeviceObjectAllowlistEnabled();
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(C5384b.EPHEMERAL_EVENTS_ENABLED.mo15858b(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(C5384b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.mo15858b(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(C5384b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.mo15858b(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(C5384b.GEOFENCES_ENABLED.mo15858b(), isLocationCollectionEnabled());
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(C5384b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.mo15858b(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(C5384b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.mo15858b(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(C5384b.ENABLE_LOCATION_COLLECTION_KEY.mo15858b(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(C5384b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.mo15858b(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(C5384b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.mo15858b(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(C5384b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.mo15858b(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(C5384b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.mo15858b(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(C5384b.SDK_AUTH_ENABLED.mo15858b(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(C5384b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.mo15858b(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(C5384b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.mo15858b(), true);
    }
}
