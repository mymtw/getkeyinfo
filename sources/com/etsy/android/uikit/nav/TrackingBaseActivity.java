package com.etsy.android.uikit.nav;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import androidx.appcompat.app.C0156f;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities;
import com.etsy.android.uikit.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p389lc.C13010a;
import p389lc.C13011b;

public abstract class TrackingBaseActivity extends BaseActivity implements C8693g {
    public C8618c configMap;
    public C13010a darkModeController;
    public C13011b darkModeTracker;
    public C8703p mAnalyticsTracker;
    private String mNameFromIntent;
    private final ContentObserver observer = new C11866a(new Handler());
    public C8709f performanceTracker;

    /* renamed from: com.etsy.android.uikit.nav.TrackingBaseActivity$a */
    public class C11866a extends ContentObserver {
        public C11866a(Handler handler) {
            super(handler);
        }

        public final void onChange(boolean z, Uri uri) {
            if (uri != null) {
                String lastPathSegment = uri.getLastPathSegment();
                HashMap hashMap = new HashMap();
                lastPathSegment.getClass();
                char c = 65535;
                switch (lastPathSegment.hashCode()) {
                    case -551230169:
                        if (lastPathSegment.equals("accessibility_display_inversion_enabled")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -492650150:
                        if (lastPathSegment.equals("font_scale")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 793846821:
                        if (lastPathSegment.equals("touch_exploration_enabled")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        List<String> list = AccessibilityCapabilities.f19885a;
                        hashMap.put(PredefinedAnalyticsProperty.AY11_SETTINGS_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, Boolean.valueOf(AccessibilityCapabilities.Companion.m17418a(TrackingBaseActivity.this.getBaseContext(), lastPathSegment)));
                        TrackingBaseActivity.this.mAnalyticsTracker.mo21333d("ay11_settings_accessibility_display_inversion_enabled", hashMap);
                        return;
                    case 1:
                        try {
                            hashMap.put(PredefinedAnalyticsProperty.AY11_SETTINGS_FONT_SCALE, Float.valueOf(Settings.System.getFloat(TrackingBaseActivity.this.getContentResolver(), "font_scale")));
                            TrackingBaseActivity.this.mAnalyticsTracker.mo21333d("ay11_settings_touch_font_scale", hashMap);
                            return;
                        } catch (Settings.SettingNotFoundException e) {
                            e.printStackTrace();
                            return;
                        }
                    case 2:
                        List<String> list2 = AccessibilityCapabilities.f19885a;
                        hashMap.put(PredefinedAnalyticsProperty.AY11_SETTINGS_TOUCH_EXPLORATION_ENABLED, Boolean.valueOf(AccessibilityCapabilities.Companion.m17418a(TrackingBaseActivity.this.getBaseContext(), lastPathSegment)));
                        TrackingBaseActivity.this.mAnalyticsTracker.mo21333d("ay11_settings_touch_exploration_enabled", hashMap);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public C8703p getAnalyticsContext() {
        if (this.mAnalyticsTracker == null) {
            this.mAnalyticsTracker = new C8703p(this, true, getIntent().getExtras());
        }
        return this.mAnalyticsTracker;
    }

    public Context getAndroidContext() {
        return this;
    }

    public C8623e getConfigMap() {
        return this.mAnalyticsTracker.f19116n;
    }

    public final String getDefaultName() {
        return getClass().getSimpleName();
    }

    public C8709f getPerformanceTracker() {
        return this.performanceTracker;
    }

    public String getTrackingName() {
        String str = this.mNameFromIntent;
        return str != null ? str : getDefaultName();
    }

    public C8693g getTrackingParent() {
        return null;
    }

    public boolean isNativeFlagEnabled(NativeConfig nativeConfig) {
        return this.mAnalyticsTracker.mo21331a(nativeConfig).f18927b;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mNameFromIntent = getIntent().getStringExtra("TRACKING_NAME");
        this.mAnalyticsTracker = getAnalyticsContext();
        if (shouldAutoTrack()) {
            this.mAnalyticsTracker.mo21363k(this);
        }
        if (this.darkModeTracker != null) {
            Configuration configuration = getResources().getConfiguration();
            C13011b bVar = this.darkModeTracker;
            bVar.getClass();
            C19383o.m32797g(configuration, "config");
            if (!C13011b.f28663d && C19382n.m32778w0()) {
                int i = configuration.uiMode & 48;
                C13011b.f28663d = true;
                if (i == 0) {
                    bVar.f28665a.mo21310e("Night mode is UNDEFINED");
                } else if (i == 16) {
                    bVar.f28665a.mo21310e("Night mode is OFF");
                    bVar.f28666b.mo45475b("design_systems.system_dark_mode.off", 0.1d);
                } else if (i == 32) {
                    bVar.f28665a.mo21310e("Night mode is ON");
                    bVar.f28666b.mo45475b("design_systems.system_dark_mode.on", 0.1d);
                }
            }
            C13011b bVar2 = this.darkModeTracker;
            bVar2.getClass();
            if (!C13011b.f28664e) {
                int i2 = configuration.uiMode & 48;
                C13011b.f28664e = true;
                if (i2 == 0) {
                    bVar2.f28665a.mo21310e("Night mode is UNDEFINED");
                } else if (i2 == 16) {
                    bVar2.f28667c.mo21333d("dark_mode_off", (Map<? extends AnalyticsProperty, Object>) null);
                } else if (i2 == 32) {
                    bVar2.f28667c.mo21333d("dark_mode_on", (Map<? extends AnalyticsProperty, Object>) null);
                }
            }
        }
        C13010a aVar = this.darkModeController;
        if (aVar != null && this.configMap != null) {
            boolean contains = aVar.f28662a.mo46761a().contains("dark_mode_preference");
            boolean z = aVar.f28662a.mo46761a().getBoolean("dark_mode_preference", false);
            if (!contains) {
                if (C19382n.m32778w0()) {
                    C0156f.m490z(-1);
                } else {
                    C0156f.m490z(1);
                }
            } else if (z) {
                C0156f.m490z(2);
            } else {
                C0156f.m490z(1);
            }
        }
    }

    public void onDestroy() {
        C8703p pVar;
        super.onDestroy();
        if (shouldAutoTrack() && (pVar = this.mAnalyticsTracker) != null) {
            pVar.f19109g = false;
        }
        List<String> list = AccessibilityCapabilities.f19885a;
        ContentObserver contentObserver = this.observer;
        C19383o.m32797g(contentObserver, "observer");
        ContentResolver contentResolver = getContentResolver();
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(contentObserver);
        }
    }

    public void onResume() {
        C8703p pVar;
        super.onResume();
        if (shouldAutoTrack() && (pVar = this.mAnalyticsTracker) != null) {
            pVar.mo21360h(this);
        }
        C8703p pVar2 = this.mAnalyticsTracker;
        if (pVar2 != null && pVar2.f19116n.mo21132b(C8592b.f18731F)) {
            C1993m.f4501p = new WeakReference(this.performanceTracker);
        }
        List<String> list = AccessibilityCapabilities.f19885a;
        ContentObserver contentObserver = this.observer;
        C19383o.m32797g(contentObserver, "observer");
        ContentResolver contentResolver = getContentResolver();
        if (contentResolver != null) {
            contentResolver.registerContentObserver(Settings.Secure.getUriFor("accessibility_display_inversion_enabled"), true, contentObserver);
            contentResolver.registerContentObserver(Settings.Secure.getUriFor("touch_exploration_enabled"), true, contentObserver);
            contentResolver.registerContentObserver(Settings.System.getUriFor("font_scale"), true, contentObserver);
        }
    }

    public void onStop() {
        C8703p pVar;
        super.onStop();
        if (shouldAutoTrack() && (pVar = this.mAnalyticsTracker) != null) {
            pVar.mo21361i(this);
        }
    }

    public boolean shouldAutoTrack() {
        return true;
    }
}
