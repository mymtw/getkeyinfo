package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p030bo.app.C4230u0;
import p753kq.C19846a;

public final class RuntimeAppConfigurationProvider {

    /* renamed from: a */
    public final SharedPreferences f11613a;

    /* renamed from: b */
    public SharedPreferences.Editor f11614b;

    /* renamed from: com.braze.configuration.RuntimeAppConfigurationProvider$b */
    public static final class C5408b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5408b f11615b = new C5408b();

        public C5408b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    /* renamed from: com.braze.configuration.RuntimeAppConfigurationProvider$c */
    public static final class C5409c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C5410a f11616b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5409c(C5410a aVar) {
            super(0);
            this.f11616b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11616b, "Setting Braze Override configuration with config: ");
        }
    }

    public RuntimeAppConfigurationProvider(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f11613a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo15894a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5408b.f11615b, 7);
        this.f11613a.edit().clear().apply();
    }

    /* renamed from: b */
    public final void mo15895b(String str, Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            SharedPreferences.Editor editor = this.f11614b;
            if (editor != null) {
                editor.putBoolean(str, booleanValue);
            }
        }
    }

    /* renamed from: c */
    public final void mo15896c(String str, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            SharedPreferences.Editor editor = this.f11614b;
            if (editor != null) {
                editor.putInt(str, intValue);
            }
        }
    }

    /* renamed from: d */
    public final void mo15897d(String str, String str2) {
        SharedPreferences.Editor editor;
        C19383o.m32797g(str, "key");
        if (str2 != null && (editor = this.f11614b) != null) {
            editor.putString(str, str2);
        }
    }

    /* renamed from: e */
    public final void mo15898e(C5410a aVar) {
        C19383o.m32797g(aVar, "config");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C5409c(aVar), 6);
        this.f11614b = this.f11613a.edit();
        mo15897d(BrazeConfigurationProvider.C5384b.API_KEY.mo15858b(), aVar.f11632b);
        mo15897d(BrazeConfigurationProvider.C5384b.SERVER_TARGET_KEY.mo15858b(), aVar.f11633c);
        String b = BrazeConfigurationProvider.C5384b.SDK_FLAVOR.mo15858b();
        SdkFlavor sdkFlavor = aVar.f11642l;
        C19383o.m32797g(b, "key");
        if (sdkFlavor != null) {
            mo15897d(b, sdkFlavor.toString());
        }
        mo15895b(BrazeConfigurationProvider.C5384b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.mo15858b(), aVar.f11653w);
        mo15897d(BrazeConfigurationProvider.C5384b.CUSTOM_ENDPOINT.mo15858b(), aVar.f11636f);
        mo15897d(BrazeConfigurationProvider.C5384b.SMALL_NOTIFICATION_ICON_KEY.mo15858b(), aVar.f11634d);
        mo15897d(BrazeConfigurationProvider.C5384b.LARGE_NOTIFICATION_ICON_KEY.mo15858b(), aVar.f11635e);
        mo15896c(BrazeConfigurationProvider.C5384b.SESSION_TIMEOUT_KEY.mo15858b(), aVar.f11643m);
        mo15896c(BrazeConfigurationProvider.C5384b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.mo15858b(), aVar.f11644n);
        mo15896c(BrazeConfigurationProvider.C5384b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.mo15858b(), aVar.f11645o);
        mo15895b(BrazeConfigurationProvider.C5384b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.mo15858b(), aVar.f11650t);
        mo15895b(BrazeConfigurationProvider.C5384b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.mo15858b(), aVar.f11651u);
        mo15895b(BrazeConfigurationProvider.C5384b.ENABLE_LOCATION_COLLECTION_KEY.mo15858b(), aVar.f11652v);
        mo15896c(BrazeConfigurationProvider.C5384b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.mo15858b(), aVar.f11646p);
        mo15896c(BrazeConfigurationProvider.C5384b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.mo15858b(), aVar.f11647q);
        mo15896c(BrazeConfigurationProvider.C5384b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.mo15858b(), aVar.f11648r);
        mo15897d(BrazeConfigurationProvider.C5384b.DEFAULT_NOTIFICATION_CHANNEL_NAME.mo15858b(), aVar.f11637g);
        mo15897d(BrazeConfigurationProvider.C5384b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.mo15858b(), aVar.f11638h);
        mo15895b(BrazeConfigurationProvider.C5384b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.mo15858b(), aVar.f11654x);
        mo15897d(BrazeConfigurationProvider.C5384b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.mo15858b(), aVar.f11639i);
        mo15895b(BrazeConfigurationProvider.C5384b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.mo15858b(), aVar.f11655y);
        mo15895b(BrazeConfigurationProvider.C5384b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.mo15858b(), aVar.f11656z);
        mo15897d(BrazeConfigurationProvider.C5384b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.mo15858b(), aVar.f11640j);
        mo15895b(BrazeConfigurationProvider.C5384b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.mo15858b(), aVar.f11617A);
        mo15895b(BrazeConfigurationProvider.C5384b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.mo15858b(), aVar.f11628L);
        mo15895b(BrazeConfigurationProvider.C5384b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.mo15858b(), aVar.f11618B);
        mo15895b(BrazeConfigurationProvider.C5384b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.mo15858b(), aVar.f11619C);
        mo15895b(BrazeConfigurationProvider.C5384b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.mo15858b(), aVar.f11620D);
        mo15895b(BrazeConfigurationProvider.C5384b.GEOFENCES_ENABLED.mo15858b(), aVar.f11621E);
        mo15895b(BrazeConfigurationProvider.C5384b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.mo15858b(), aVar.f11622F);
        mo15897d(BrazeConfigurationProvider.C5384b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.mo15858b(), aVar.f11641k);
        mo15895b(BrazeConfigurationProvider.C5384b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.mo15858b(), aVar.f11623G);
        mo15896c(BrazeConfigurationProvider.C5384b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.mo15858b(), aVar.f11649s);
        mo15895b(BrazeConfigurationProvider.C5384b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.mo15858b(), aVar.f11624H);
        mo15895b(BrazeConfigurationProvider.C5384b.SDK_AUTH_ENABLED.mo15858b(), aVar.f11625I);
        mo15895b(BrazeConfigurationProvider.C5384b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.mo15858b(), aVar.f11626J);
        EnumSet<DeviceKey> enumSet = aVar.f11627K;
        String b2 = BrazeConfigurationProvider.C5384b.DEVICE_OBJECT_ALLOWLIST_VALUE.mo15858b();
        if (enumSet != null) {
            Set<String> a = C4230u0.m9700a(enumSet);
            SharedPreferences.Editor editor = this.f11614b;
            if (editor != null) {
                editor.putStringSet(b2, a);
            }
        }
        EnumSet<LocationProviderName> enumSet2 = aVar.f11629M;
        String b3 = BrazeConfigurationProvider.C5384b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.mo15858b();
        if (enumSet2 != null) {
            Set<String> a2 = C4230u0.m9700a(enumSet2);
            SharedPreferences.Editor editor2 = this.f11614b;
            if (editor2 != null) {
                editor2.putStringSet(b3, a2);
            }
        }
        EnumSet<BrazeSdkMetadata> enumSet3 = aVar.f11630N;
        if (enumSet3 != null) {
            String b4 = BrazeConfigurationProvider.C5384b.SDK_METADATA_PUBLIC_KEY.mo15858b();
            C19383o.m32797g(b4, "key");
            Set<String> stringSet = this.f11613a.getStringSet(b4, new HashSet());
            if (stringSet != null) {
                stringSet.addAll(C4230u0.m9700a(enumSet3));
            }
            this.f11613a.edit().putStringSet(b4, stringSet).apply();
        }
        SharedPreferences.Editor editor3 = this.f11614b;
        if (editor3 != null) {
            editor3.apply();
        }
    }
}
