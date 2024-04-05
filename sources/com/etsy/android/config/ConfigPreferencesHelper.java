package com.etsy.android.config;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.Toast;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.FragmentManager;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.room.C3219b;
import com.braze.C5380a;
import com.etsy.android.R;
import com.etsy.android.config.flags.ConfigFlagsFragment;
import com.etsy.android.config.nativeflags.NativeConfigFlagsFragment;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.eventhorizon.EventHorizonService;
import com.etsy.android.lib.exceptions.CrashReportingTestException;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.DebugApiRequestDecorator;
import com.etsy.android.lib.util.C8901g0;
import com.google.logging.type.LogSeverity;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import p003a2.C0015b;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p030bo.app.C4237u6;
import p145io.reactivex.internal.operators.observable.C19167i;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p306z8.C8475b;
import p306z8.C8476c;
import p306z8.C8477d;
import p306z8.C8478e;
import p306z8.C8479f;
import p306z8.C8480g;
import p306z8.C8481h;
import p334da.C12639h;
import p340ea.C12658b;
import p409o9.C13119a;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;
import p628nj.C18263b;

public final class ConfigPreferencesHelper implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final int $stable = 8;
    private final C12639h analyticsUploader;
    private final C13119a buildConfigs;
    private final Context context;
    private final C12658b elkLogDao;
    private final C8687h elkLogUploader;
    private final C13888d locale;
    private final C6340a preferenceWidget;
    private boolean requireLogout;
    private boolean requireRestart;
    private final Resources resources;
    private final Class<? extends Activity> restartActivity;
    private final C13461f rxSchedulers;
    private final C13265p session;
    private SharedPreferences sharedPreferences;

    /* renamed from: com.etsy.android.config.ConfigPreferencesHelper$a */
    public interface C6340a {
        Preference findPreference(int i);

        Preference findPreference(String str);
    }

    public ConfigPreferencesHelper(C6340a aVar, Resources resources2, SharedPreferences sharedPreferences2, Context context2, C12658b bVar, C12639h hVar, C8687h hVar2, C13119a aVar2, Class<? extends Activity> cls, C13461f fVar, C13265p pVar, C13888d dVar) {
        C19383o.m32797g(aVar, "preferenceWidget");
        C19383o.m32797g(resources2, "resources");
        C19383o.m32797g(sharedPreferences2, "sharedPreferences");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(bVar, "elkLogDao");
        C19383o.m32797g(hVar, "analyticsUploader");
        C19383o.m32797g(hVar2, "elkLogUploader");
        C19383o.m32797g(cls, "restartActivity");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(dVar, "locale");
        this.preferenceWidget = aVar;
        this.resources = resources2;
        this.sharedPreferences = sharedPreferences2;
        this.context = context2;
        this.elkLogDao = bVar;
        this.analyticsUploader = hVar;
        this.elkLogUploader = hVar2;
        this.buildConfigs = aVar2;
        this.restartActivity = cls;
        this.rxSchedulers = fVar;
        this.session = pVar;
        this.locale = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: addConfigFlagsPreference$lambda-16  reason: not valid java name */
    public static final boolean m34835addConfigFlagsPreference$lambda16(FragmentManager fragmentManager, Preference preference) {
        C19383o.m32797g(fragmentManager, "$fragmentManager");
        C2740a aVar = new C2740a(fragmentManager);
        aVar.mo10531h(R.id.preference_content, new ConfigFlagsFragment(), (String) null);
        aVar.mo10529c((String) null);
        aVar.mo10483d();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: addNativeConfigFlagsPreference$lambda-17  reason: not valid java name */
    public static final boolean m34836addNativeConfigFlagsPreference$lambda17(FragmentManager fragmentManager, Preference preference) {
        C19383o.m32797g(fragmentManager, "$fragmentManager");
        C2740a aVar = new C2740a(fragmentManager);
        aVar.mo10531h(R.id.preference_content, new NativeConfigFlagsFragment(), (String) null);
        aVar.mo10529c((String) null);
        aVar.mo10483d();
        return true;
    }

    private final void restartApp() {
        PendingIntent activity = PendingIntent.getActivity(this.context, 13321, new Intent(this.context, this.restartActivity), 335544320);
        Object systemService = this.context.getSystemService("alarm");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).set(1, System.currentTimeMillis() + ((long) LogSeverity.NOTICE_VALUE), activity);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    private final void setPreferenceSummary(int i) {
        String string = this.resources.getString(i);
        C19383o.m32796f(string, "resources.getString(resourceId)");
        setPreferenceSummary(this.preferenceWidget.findPreference(string), string);
    }

    private final void setRequireLogout(boolean z) {
        this.requireLogout = z;
        if (z) {
            Toast.makeText(this.context, "You will be logged out after leaving this menu", 0).show();
        }
    }

    private final void setRequireRestart(boolean z) {
        this.requireRestart = z;
        if (z) {
            Toast.makeText(this.context, "App will restart after leaving this menu", 0).show();
        }
    }

    private final void setUpClearLocalePreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_locale_clear);
        if (findPreference != null) {
            findPreference.f6826g = new C8475b(this, findPreference);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpClearLocalePreference$lambda-15  reason: not valid java name */
    public static final boolean m34837setUpClearLocalePreference$lambda15(ConfigPreferencesHelper configPreferencesHelper, Preference preference, Preference preference2) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        SharedPreferences.Editor edit = configPreferencesHelper.sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.remove(preference != null ? preference.f6832m : null);
        edit.apply();
        configPreferencesHelper.setPreferenceSummary((int) R.string.config_locale, "");
        Context context2 = configPreferencesHelper.context;
        if (context2 == null) {
            return true;
        }
        C8901g0.m17338d(context2, "Locale override cleared");
        return true;
    }

    private final void setUpFeaturesDateOverridePreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_features_date_override);
        C19383o.m32795e(findPreference, "null cannot be cast to non-null type androidx.preference.EditTextPreference");
        EditTextPreference editTextPreference = (EditTextPreference) findPreference;
        editTextPreference.f6788X = new C0073e();
        editTextPreference.f6819N = new C3673f7(this, 1);
        editTextPreference.mo11005j();
        editTextPreference.f6825f = new C8481h();
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesDateOverridePreference$lambda-3  reason: not valid java name */
    public static final void m34838setUpFeaturesDateOverridePreference$lambda3(EditText editText) {
        C19383o.m32797g(editText, "it");
        editText.setInputType(2);
        editText.setHint("1663872946986 (milliseconds)");
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesDateOverridePreference$lambda-4  reason: not valid java name */
    public static final CharSequence m34839setUpFeaturesDateOverridePreference$lambda4(ConfigPreferencesHelper configPreferencesHelper, EditTextPreference editTextPreference) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        String str = editTextPreference != null ? editTextPreference.f6787W : null;
        if (str == null) {
            str = "";
        }
        if (!(str.length() > 0)) {
            return configPreferencesHelper.context.getString(R.string.config_api_features_date_override_summary);
        }
        try {
            return new SimpleDateFormat("MMM dd, yyyy h:mm a", configPreferencesHelper.locale.mo46718b()).format(new Date(Long.parseLong(str)));
        } catch (Exception unused) {
            return str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesDateOverridePreference$lambda-5  reason: not valid java name */
    public static final boolean m34840setUpFeaturesDateOverridePreference$lambda5(Preference preference, Object obj) {
        C19383o.m32797g(obj, "newValue");
        LinkedHashMap linkedHashMap = DebugApiRequestDecorator.f19167a;
        DebugApiRequestDecorator.f19168b = obj.toString().length() == 0 ? 0 : Long.parseLong(obj.toString());
        return true;
    }

    private final void setUpFeaturesOverridePreference() {
        String string = this.context.getString(R.string.config_features_override);
        C19383o.m32796f(string, "context.getString(R.stri…config_features_override)");
        Preference findPreference = this.preferenceWidget.findPreference(string);
        C19383o.m32795e(findPreference, "null cannot be cast to non-null type androidx.preference.EditTextPreference");
        EditTextPreference editTextPreference = (EditTextPreference) findPreference;
        String string2 = this.sharedPreferences.getString(string, "");
        if (C18263b.m30839d0(string2)) {
            editTextPreference.mo11026F(string2);
        }
        editTextPreference.f6788X = new C0015b();
        editTextPreference.f6819N = new C8478e(this);
        editTextPreference.mo11005j();
        editTextPreference.f6825f = new C3219b(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesOverridePreference$lambda-0  reason: not valid java name */
    public static final void m34841setUpFeaturesOverridePreference$lambda0(EditText editText) {
        C19383o.m32797g(editText, "it");
        editText.setHint("flag_1:on,flag_2:off,...,flag_N:on");
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesOverridePreference$lambda-1  reason: not valid java name */
    public static final CharSequence m34842setUpFeaturesOverridePreference$lambda1(ConfigPreferencesHelper configPreferencesHelper, EditTextPreference editTextPreference) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        String str = editTextPreference != null ? editTextPreference.f6787W : null;
        if (str == null || str.length() == 0) {
            return configPreferencesHelper.context.getString(R.string.config_api_features_override_summary);
        }
        LinkedHashMap linkedHashMap = DebugApiRequestDecorator.f19167a;
        return DebugApiRequestDecorator.Companion.m17149a();
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpFeaturesOverridePreference$lambda-2  reason: not valid java name */
    public static final boolean m34843setUpFeaturesOverridePreference$lambda2(Preference preference, Object obj) {
        C19383o.m32797g(obj, "newValue");
        LinkedHashMap linkedHashMap = DebugApiRequestDecorator.f19167a;
        DebugApiRequestDecorator.Companion.m17150b(obj.toString());
        return true;
    }

    private final void setUpPreferencesSummary() {
        setPreferenceSummary((int) R.string.config_prefs_environment);
        C13119a aVar = this.buildConfigs;
        if (aVar != null) {
            setPreferenceSummary((int) R.string.config_build_branch, aVar.f28845b);
            setPreferenceSummary((int) R.string.config_build_date, this.buildConfigs.f28844a);
            setPreferenceSummary((int) R.string.config_build_hash, this.buildConfigs.f28846c);
        }
        String string = this.sharedPreferences.getString(this.context.getString(R.string.config_locale), "");
        if (C18263b.m30837c0(string)) {
            setPreferenceSummary((int) R.string.config_locale, string);
        }
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            C19383o.m32796f(str, "context.packageManager.g…ckageName, 0).versionName");
            setPreferenceSummary((int) R.string.config_build_version, str);
        } catch (PackageManager.NameNotFoundException e) {
            C8694h hVar = C8694h.f19097a;
            StringBuilder h = C0072d.m201h("Can't find package name ");
            h.append(this.context.getPackageName());
            hVar.mo21309d(h.toString(), e);
        }
    }

    private final void setUpRefreshServerConfigPreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_refresh_server_info);
        if (findPreference != null) {
            findPreference.f6826g = new C5380a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpRefreshServerConfigPreference$lambda-7  reason: not valid java name */
    public static final boolean m34844setUpRefreshServerConfigPreference$lambda7(ConfigPreferencesHelper configPreferencesHelper, Preference preference) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        if (configPreferencesHelper.requireRestart || configPreferencesHelper.requireLogout) {
            Toast.makeText(configPreferencesHelper.context, "Environment has a staged change. Leave this screen to get a new config.", 0).show();
            return true;
        }
        List<String> list = C8591a.f18700r;
        C18263b.f40056T.mo21107e(configPreferencesHelper.context);
        C8901g0.m17337c(configPreferencesHelper.context, R.string.config_refresh_server_info_feedback_message);
        return true;
    }

    private final void setUpSendAllLogsPreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_send_all_logs);
        if (findPreference != null) {
            findPreference.f6826g = new C8476c(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpSendAllLogsPreference$lambda-11  reason: not valid java name */
    public static final boolean m34845setUpSendAllLogsPreference$lambda11(ConfigPreferencesHelper configPreferencesHelper, Preference preference) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        configPreferencesHelper.analyticsUploader.mo45423a();
        configPreferencesHelper.elkLogUploader.mo21344a();
        return false;
    }

    private final void setUpTestAnrReportingPreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_test_anr_reporting);
        if (findPreference != null) {
            findPreference.f6826g = new C0388a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpTestAnrReportingPreference$lambda-13  reason: not valid java name */
    public static final boolean m34846setUpTestAnrReportingPreference$lambda13(Preference preference) {
        try {
            Thread.sleep(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    private final void setUpTestCrashReportingPreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_test_crash_reporting);
        if (findPreference != null) {
            findPreference.f6826g = new C0070b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpTestCrashReportingPreference$lambda-12  reason: not valid java name */
    public static final boolean m34847setUpTestCrashReportingPreference$lambda12(Preference preference) {
        throw new CrashReportingTestException();
    }

    private final void setUpVmPreferenceDefault() {
        Preference findPreference = this.preferenceWidget.findPreference(this.resources.getString(R.string.config_prefs_vm));
        if (findPreference != null) {
            findPreference.f6841v = C8591a.m16993c();
        }
        if (findPreference != null) {
            findPreference.mo11026F(this.sharedPreferences.getString(this.resources.getString(R.string.config_prefs_vm), C8591a.m16993c()));
        }
    }

    private final void setUpWipeLogsPreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_wipe_logs);
        if (findPreference != null) {
            findPreference.f6826g = new C4237u6(this, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpWipeLogsPreference$lambda-10  reason: not valid java name */
    public static final boolean m34848setUpWipeLogsPreference$lambda10(ConfigPreferencesHelper configPreferencesHelper, Preference preference) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        C19167i iVar = new C19167i(new C8479f(configPreferencesHelper, 0));
        configPreferencesHelper.rxSchedulers.getClass();
        ObservableSubscribeOn i = iVar.mo20639i(C13461f.m21235b());
        configPreferencesHelper.rxSchedulers.getClass();
        i.mo20635e(C13461f.m21236c()).mo20637g(new C8480g(configPreferencesHelper, 0));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpWipeLogsPreference$lambda-10$lambda-8  reason: not valid java name */
    public static final Integer m34849setUpWipeLogsPreference$lambda10$lambda8(ConfigPreferencesHelper configPreferencesHelper) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        return Integer.valueOf(configPreferencesHelper.elkLogDao.mo45438b());
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpWipeLogsPreference$lambda-10$lambda-9  reason: not valid java name */
    public static final void m34850setUpWipeLogsPreference$lambda10$lambda9(ConfigPreferencesHelper configPreferencesHelper, Integer num) {
        C19383o.m32797g(configPreferencesHelper, "this$0");
        Context context2 = configPreferencesHelper.context;
        Toast.makeText(context2, "Deleted " + num + " logs", 0).show();
    }

    private final void setUpXDebugParamOverridePreference() {
        Preference findPreference = this.preferenceWidget.findPreference((int) R.string.config_prefs_xdebug_toggle);
        boolean z = this.sharedPreferences.getBoolean(this.context.getString(R.string.config_prefs_xdebug_toggle), false);
        if (findPreference != null) {
            findPreference.mo11026F(z ? "on" : "off");
        }
        if (findPreference != null) {
            findPreference.f6825f = new C3653e7(findPreference, 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpXDebugParamOverridePreference$lambda-6  reason: not valid java name */
    public static final boolean m34851setUpXDebugParamOverridePreference$lambda6(Preference preference, Preference preference2, Object obj) {
        C19383o.m32797g(obj, "newValue");
        if (preference == null) {
            return true;
        }
        preference.mo11026F(((Boolean) obj).booleanValue() ? "on" : "off");
        return true;
    }

    public final PreferenceScreen addConfigFlagsPreference(PreferenceScreen preferenceScreen, FragmentManager fragmentManager) {
        C19383o.m32797g(preferenceScreen, "screen");
        C19383o.m32797g(fragmentManager, "fragmentManager");
        Preference preference = new Preference(this.context, (AttributeSet) null);
        preference.mo11047G(R.string.config_flags_title);
        preference.mo11046E(R.string.config_flags_flava_text);
        preference.f6826g = new C2783s(fragmentManager, 1);
        preference.mo11044C();
        preferenceScreen.mo11148L(preference);
        return preferenceScreen;
    }

    public final PreferenceScreen addNativeConfigFlagsPreference(PreferenceScreen preferenceScreen, FragmentManager fragmentManager) {
        C19383o.m32797g(preferenceScreen, "screen");
        C19383o.m32797g(fragmentManager, "fragmentManager");
        Preference preference = new Preference(this.context, (AttributeSet) null);
        preference.mo11047G(R.string.native_config_flags_title);
        preference.mo11046E(R.string.native_config_flags_flava_text);
        preference.f6826g = new C8477d(fragmentManager);
        preference.mo11044C();
        preferenceScreen.mo11148L(preference);
        return preferenceScreen;
    }

    public final void checkEnvironment() {
        if (this.requireLogout) {
            this.session.mo45956a();
            setRequireLogout(false);
        }
        if (this.requireRestart) {
            restartApp();
            setRequireRestart(false);
        }
    }

    @SuppressLint({"all"})
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
        C19383o.m32797g(sharedPreferences2, "sharedPreferences");
        C19383o.m32797g(str, "preferenceKey");
        setPreferenceSummary(str);
        String string = this.context.getString(R.string.config_prefs_environment);
        C19383o.m32796f(string, "context.getString(R.stri…config_prefs_environment)");
        String string2 = this.context.getString(R.string.config_prefs_vm);
        C19383o.m32796f(string2, "context.getString(R.string.config_prefs_vm)");
        String str2 = "";
        String replace = new Regex(" ").replace((CharSequence) string2, str2);
        String string3 = this.context.getString(R.string.config_prefs_dev_proxy);
        C19383o.m32796f(string3, "context.getString(R.string.config_prefs_dev_proxy)");
        String string4 = this.resources.getString(R.string.config_prefs_event_horizon);
        C19383o.m32796f(string4, "resources.getString(R.st…nfig_prefs_event_horizon)");
        String string5 = this.resources.getString(R.string.config_locale);
        C19383o.m32796f(string5, "resources.getString(R.string.config_locale)");
        if (C19383o.m32792b(str, replace) || C19383o.m32792b(str, string) || C19383o.m32792b(str, string3) || C8591a.m16992a(this.context)) {
            sharedPreferences2.edit().commit();
            if (!sharedPreferences2.getBoolean(string3, false) && C19383o.m32792b(str, string)) {
                setRequireLogout(true);
            }
            setRequireRestart(true);
        }
        if (C19383o.m32792b(str, string4)) {
            boolean z = sharedPreferences2.getBoolean(this.context.getString(R.string.config_prefs_event_horizon), false);
            Intent intent = new Intent(this.context, EventHorizonService.class);
            if (z) {
                C8694h.f19097a.mo21312f("Starting event horizon service");
                this.context.startService(intent);
            } else {
                C8694h.f19097a.mo21312f("Stopping event horizon service");
                this.context.stopService(intent);
            }
        }
        if (C19383o.m32792b(str, string5)) {
            setRequireLogout(true);
            String string6 = sharedPreferences2.getString(this.context.getString(R.string.config_locale), str2);
            if (string6 != null) {
                str2 = string6;
            }
            setPreferenceSummary((int) R.string.config_locale, str2);
        }
    }

    public final void setUp() {
        setUpFeaturesOverridePreference();
        setUpFeaturesDateOverridePreference();
        setUpXDebugParamOverridePreference();
        setUpRefreshServerConfigPreference();
        setUpSendAllLogsPreference();
        setUpWipeLogsPreference();
        setUpTestCrashReportingPreference();
        setUpTestAnrReportingPreference();
        setUpClearLocalePreference();
        setUpPreferencesSummary();
        setUpVmPreferenceDefault();
    }

    private final void setPreferenceSummary(String str) {
        setPreferenceSummary(this.preferenceWidget.findPreference(str), str);
    }

    private final void setPreferenceSummary(int i, String str) {
        Preference findPreference = this.preferenceWidget.findPreference(this.resources.getString(i));
        if (findPreference != null) {
            findPreference.mo11026F(str);
        }
    }

    private final void setPreferenceSummary(Preference preference, String str) {
        if (preference != null && !C19383o.m32792b(this.resources.getString(R.string.config_prefs_admin_toolbar), str) && !C19383o.m32792b(this.resources.getString(R.string.config_locale), str) && !C19383o.m32792b(this.resources.getString(R.string.config_prefs_dev_proxy), str) && !C19383o.m32792b(this.resources.getString(R.string.config_prefs_output_json), str) && !C19383o.m32792b(this.resources.getString(R.string.config_prefs_event_horizon), str) && !C19383o.m32792b(this.resources.getString(R.string.config_prefs_xdebug_toggle), str) && preference.f6819N == null) {
            preference.mo11026F(this.sharedPreferences.getString(str, ""));
        }
    }
}
