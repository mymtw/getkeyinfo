package com.etsy.android.config;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.C3045f;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.etsy.android.R;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.homescreen.HomescreenTabsActivity;
import com.etsy.android.p327ui.listing.p329ui.pushoptin.ConversationPushOptInBottomSheetKey;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.PushOptInBottomSheetKey;
import com.etsy.android.p327ui.navigation.keys.dialogfragmentkeys.OnboardingCategoryQuizKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.push.onboarding.C8945a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p030bo.app.C4237u6;
import p306z8.C8476c;
import p306z8.C8482i;
import p306z8.C8483j;
import p306z8.C8484k;
import p306z8.C8485l;
import p334da.C12639h;
import p340ea.C12658b;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12941a;
import p409o9.C13119a;
import p425q9.C13265p;
import p428qc.C13286d;
import p428qc.C13294e;
import p440s9.C13366a;
import p456ua.C13461f;
import p486y9.C13888d;
import p491ye.C13921e;
import p496za.C13943a;

public final class PrefsFragment extends PreferenceFragmentCompat implements ConfigPreferencesHelper.C6340a, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C12639h analyticsUploader;
    public C8618c configMap;
    public C13888d currentLocale;
    public C12658b elkLogDao;
    public C8687h elkLogUploader;
    public C13294e homeScreenEventManager;
    private ConfigPreferencesHelper prefHelper;
    public C8945a pushOptInOnboardingEligibility;
    public C13461f rxSchedulers;
    public C13265p session;
    public C13943a sharedPreferencesProvider;
    public C13921e tooltipPrefs;

    private final void addHomeAdminTabsPref(PreferenceScreen preferenceScreen) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Preference preference = new Preference(activity, (AttributeSet) null);
            if (getHomeScreenEventManager().f29198b) {
                preference.mo11048H("Home screen tabs");
                preference.mo11026F("View the tabs for home");
            } else {
                preference.mo11048H("SDL module catalog");
                preference.mo11026F("View the modules available in homescreen SDL");
            }
            preference.f6826g = new C8484k(new WeakReference(this), this, activity);
            preference.mo11044C();
            preferenceScreen.mo11148L(preference);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addHomeAdminTabsPref$lambda-3  reason: not valid java name */
    public static final boolean m34852addHomeAdminTabsPref$lambda3(WeakReference weakReference, PrefsFragment prefsFragment, FragmentActivity fragmentActivity, Preference preference) {
        C19383o.m32797g(weakReference, "$weakSelf");
        C19383o.m32797g(prefsFragment, "this$0");
        C19383o.m32797g(fragmentActivity, "$activity");
        if (((PrefsFragment) weakReference.get()) != null) {
            if (prefsFragment.getHomeScreenEventManager().f29198b) {
                C13294e homeScreenEventManager2 = prefsFragment.getHomeScreenEventManager();
                homeScreenEventManager2.f29198b = false;
                homeScreenEventManager2.f29197a.onNext(C13286d.C13293g.f29196a);
            } else {
                C13294e homeScreenEventManager3 = prefsFragment.getHomeScreenEventManager();
                homeScreenEventManager3.f29198b = true;
                homeScreenEventManager3.f29197a.onNext(C13286d.C13292f.f29195a);
            }
            C12788a.m20424c(fragmentActivity, new C12941a(C19421p.m32935c0(fragmentActivity), (FragmentNavigationKey) new HomePagerKey(C19421p.m32935c0(fragmentActivity), (Bundle) null, false, 6, (DefaultConstructorMarker) null), false, 12));
        }
        return true;
    }

    private final void addOnboardingPrefs(PreferenceScreen preferenceScreen) {
        PreferenceCategory preferenceCategory = new PreferenceCategory(getContext(), (AttributeSet) null);
        preferenceCategory.mo11047G(R.string.config_onboarding_category_title);
        preferenceCategory.mo11044C();
        preferenceScreen.mo11148L(preferenceCategory);
        Preference preference = new Preference(getContext(), (AttributeSet) null);
        preference.mo11047G(R.string.config_onboarding_categories_quiz_title);
        preference.f6826g = new C4237u6(this, 2);
        preference.mo11044C();
        preferenceCategory.mo11148L(preference);
    }

    /* access modifiers changed from: private */
    /* renamed from: addOnboardingPrefs$lambda-16$lambda-15  reason: not valid java name */
    public static final boolean m34853addOnboardingPrefs$lambda16$lambda15(PrefsFragment prefsFragment, Preference preference) {
        C19383o.m32797g(prefsFragment, "this$0");
        C12790b.m20430b(prefsFragment, new OnboardingCategoryQuizKey(C12790b.m20432d(prefsFragment)));
        return true;
    }

    private final void addOtherHeaders() {
        C3045f preferenceManager = getPreferenceManager();
        FragmentActivity activity = getActivity();
        preferenceManager.getClass();
        PreferenceScreen preferenceScreen = new PreferenceScreen(activity, (AttributeSet) null);
        preferenceScreen.mo11060m(preferenceManager);
        ConfigPreferencesHelper configPreferencesHelper = this.prefHelper;
        if (configPreferencesHelper != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C19383o.m32796f(parentFragmentManager, "parentFragmentManager");
            PreferenceScreen addConfigFlagsPreference = configPreferencesHelper.addConfigFlagsPreference(preferenceScreen, parentFragmentManager);
            C19383o.m32796f(addConfigFlagsPreference, "screen");
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            C19383o.m32796f(parentFragmentManager2, "parentFragmentManager");
            preferenceScreen = configPreferencesHelper.addNativeConfigFlagsPreference(addConfigFlagsPreference, parentFragmentManager2);
        }
        C19383o.m32796f(preferenceScreen, "screen");
        addHomeAdminTabsPref(preferenceScreen);
        addResetInAppReviewPromptTimeoutPref(preferenceScreen);
        addPushOptInPrefs(preferenceScreen);
        addUpdatesPrefs(preferenceScreen);
        addOnboardingPrefs(preferenceScreen);
        setPreferenceScreen(preferenceScreen);
    }

    private final PreferenceScreen addPushOptInPrefs(PreferenceScreen preferenceScreen) {
        PreferenceCategory preferenceCategory = new PreferenceCategory(getContext(), (AttributeSet) null);
        preferenceCategory.mo11047G(R.string.config_push_opt_in_title);
        preferenceCategory.mo11044C();
        preferenceScreen.mo11148L(preferenceCategory);
        Preference preference = new Preference(getContext(), (AttributeSet) null);
        preference.mo11047G(R.string.config_push_opt_in_onboarding_category_title);
        preference.mo11046E(R.string.config_push_opt_in_onboarding_override_minimum_time);
        preference.f6826g = new C8482i(this, preference);
        preference.mo11044C();
        preferenceCategory.mo11148L(preference);
        Preference preference2 = new Preference(getContext(), (AttributeSet) null);
        preference2.mo11047G(R.string.config_post_purchase_push_opt_in_title);
        preference2.f6826g = new C3653e7(this, 3);
        preference2.mo11044C();
        preferenceCategory.mo11148L(preference2);
        Preference preference3 = new Preference(getContext(), (AttributeSet) null);
        preference3.mo11047G(R.string.config_convo_push_opt_in_title);
        preference3.f6826g = new C3673f7(this, 1);
        preference3.mo11044C();
        preferenceCategory.mo11148L(preference3);
        return preferenceScreen;
    }

    /* access modifiers changed from: private */
    /* renamed from: addPushOptInPrefs$lambda-10$lambda-9  reason: not valid java name */
    public static final boolean m34854addPushOptInPrefs$lambda10$lambda9(PrefsFragment prefsFragment, Preference preference) {
        C19383o.m32797g(prefsFragment, "this$0");
        C12790b.m20430b(prefsFragment, new PushOptInBottomSheetKey(C12790b.m20432d(prefsFragment)));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: addPushOptInPrefs$lambda-12$lambda-11  reason: not valid java name */
    public static final boolean m34855addPushOptInPrefs$lambda12$lambda11(PrefsFragment prefsFragment, Preference preference) {
        C19383o.m32797g(prefsFragment, "this$0");
        C12790b.m20430b(prefsFragment, new ConversationPushOptInBottomSheetKey(C12790b.m20432d(prefsFragment), "debug"));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: addPushOptInPrefs$lambda-8$lambda-7  reason: not valid java name */
    public static final boolean m34856addPushOptInPrefs$lambda8$lambda7(PrefsFragment prefsFragment, Preference preference, Preference preference2) {
        C19383o.m32797g(prefsFragment, "this$0");
        C19383o.m32797g(preference, "$this_apply");
        prefsFragment.getPushOptInOnboardingEligibility().f19734c.mo46761a().edit().putBoolean("push_onboarding_override_time_required", true).apply();
        C8901g0.m17337c(preference.f6821b, R.string.config_push_opt_in_onboarding_override_toast);
        return true;
    }

    private final PreferenceScreen addResetInAppReviewPromptTimeoutPref(PreferenceScreen preferenceScreen) {
        Preference preference = new Preference(getContext(), (AttributeSet) null);
        preference.mo11047G(R.string.config_reset_in_app_review_timeout_title);
        preference.mo11046E(R.string.config_reset_in_app_review_timeout_summary);
        preference.f6826g = new C8485l(this, preference);
        preference.mo11044C();
        preferenceScreen.mo11148L(preference);
        return preferenceScreen;
    }

    /* access modifiers changed from: private */
    /* renamed from: addResetInAppReviewPromptTimeoutPref$lambda-5$lambda-4  reason: not valid java name */
    public static final boolean m34857addResetInAppReviewPromptTimeoutPref$lambda5$lambda4(PrefsFragment prefsFragment, Preference preference, Preference preference2) {
        C19383o.m32797g(prefsFragment, "this$0");
        C19383o.m32797g(preference, "$this_apply");
        prefsFragment.getSharedPreferencesProvider().mo46761a().edit().remove("lastShownTimestampForInAppReviewPrompt").apply();
        C8901g0.m17337c(preference.f6821b, R.string.config_reset_in_app_review_timeout_toast);
        return true;
    }

    private final PreferenceScreen addUpdatesPrefs(PreferenceScreen preferenceScreen) {
        PreferenceCategory preferenceCategory = new PreferenceCategory(getContext(), (AttributeSet) null);
        preferenceCategory.mo11047G(R.string.config_updates_tooltip_category_title);
        preferenceCategory.mo11044C();
        preferenceScreen.mo11148L(preferenceCategory);
        preferenceCategory.mo11148L(getUpdatesClearDataPref());
        preferenceCategory.mo11148L(getUpdatesTimeToDelayPref());
        return preferenceScreen;
    }

    private final Preference getUpdatesClearDataPref() {
        Preference preference = new Preference(getContext(), (AttributeSet) null);
        preference.mo11047G(R.string.config_updates_tooltip_clear_data_title);
        preference.mo11046E(R.string.config_updates_tooltip_clear_data_summary);
        preference.mo11044C();
        preference.f6826g = new C8483j(preference, this);
        return preference;
    }

    /* access modifiers changed from: private */
    /* renamed from: getUpdatesClearDataPref$lambda-18$lambda-17  reason: not valid java name */
    public static final boolean m34858getUpdatesClearDataPref$lambda18$lambda17(PrefsFragment prefsFragment, Preference preference, Preference preference2) {
        C19383o.m32797g(prefsFragment, "this$0");
        C19383o.m32797g(preference, "$this_apply");
        C13921e tooltipPrefs2 = prefsFragment.getTooltipPrefs();
        SharedPreferences.Editor edit = tooltipPrefs2.f30588a.mo46761a().edit();
        edit.remove("tooltip_displayed").remove("tooltip_min_interval_days").remove("tooltip_displayed_updates_viewed");
        ArrayList<String> a = tooltipPrefs2.mo46730a();
        if (a != null) {
            for (String remove : a) {
                edit.remove(remove);
            }
        }
        edit.remove("tooltip_types");
        edit.apply();
        C8901g0.m17337c(preference.f6821b, R.string.config_updates_tooltip_clear_toast);
        return true;
    }

    private final EditTextPreference getUpdatesTimeToDelayPref() {
        EditTextPreference editTextPreference = new EditTextPreference(getContext(), (AttributeSet) null);
        editTextPreference.mo11045D("updates_time_to_delay");
        editTextPreference.mo11047G(R.string.config_updates_tooltip_time_to_delay_title);
        editTextPreference.mo11046E(R.string.config_updates_tooltip_time_to_delay_summary);
        editTextPreference.mo11044C();
        editTextPreference.f6778Q = getString(R.string.config_updates_tooltip_time_to_delay_summary);
        editTextPreference.f6825f = new C8476c(this);
        return editTextPreference;
    }

    /* access modifiers changed from: private */
    /* renamed from: getUpdatesTimeToDelayPref$lambda-20$lambda-19  reason: not valid java name */
    public static final boolean m34859getUpdatesTimeToDelayPref$lambda20$lambda19(PrefsFragment prefsFragment, Preference preference, Object obj) {
        C19383o.m32797g(prefsFragment, "this$0");
        C19383o.m32797g(obj, "newValue");
        C13921e tooltipPrefs2 = prefsFragment.getTooltipPrefs();
        tooltipPrefs2.f30588a.mo46761a().edit().putInt("updates_time_to_delay", Integer.parseInt((String) obj)).apply();
        return true;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public Preference findPreference(int i) {
        return findPreference(getResources().getString(i));
    }

    public final C12639h getAnalyticsUploader() {
        C12639h hVar = this.analyticsUploader;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("analyticsUploader");
        throw null;
    }

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C12658b getElkLogDao() {
        C12658b bVar = this.elkLogDao;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("elkLogDao");
        throw null;
    }

    public final C8687h getElkLogUploader() {
        C8687h hVar = this.elkLogUploader;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("elkLogUploader");
        throw null;
    }

    public final C13294e getHomeScreenEventManager() {
        C13294e eVar = this.homeScreenEventManager;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("homeScreenEventManager");
        throw null;
    }

    public final C8945a getPushOptInOnboardingEligibility() {
        C8945a aVar = this.pushOptInOnboardingEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("pushOptInOnboardingEligibility");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C13943a getSharedPreferencesProvider() {
        C13943a aVar = this.sharedPreferencesProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("sharedPreferencesProvider");
        throw null;
    }

    public final C13921e getTooltipPrefs() {
        C13921e eVar = this.tooltipPrefs;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("tooltipPrefs");
        throw null;
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        C3045f preferenceManager = getPreferenceManager();
        preferenceManager.f6941f = getString(R.string.config_preferences_file_name);
        preferenceManager.f6938c = null;
        C3045f preferenceManager2 = getPreferenceManager();
        preferenceManager2.f6942g = 0;
        preferenceManager2.f6938c = null;
        SharedPreferences b = getPreferenceManager().mo11205b();
        Resources resources = getResources();
        C19383o.m32796f(resources, "resources");
        C19383o.m32796f(b, "prefs");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.prefHelper = new ConfigPreferencesHelper(this, resources, b, requireActivity, getElkLogDao(), getAnalyticsUploader(), getElkLogUploader(), new C13119a(), HomescreenTabsActivity.class, getRxSchedulers(), getSession(), getCurrentLocale());
        addOtherHeaders();
        addPreferencesFromResource(R.xml.preferences);
        ConfigPreferencesHelper configPreferencesHelper = this.prefHelper;
        if (configPreferencesHelper != null) {
            configPreferencesHelper.setUp();
        }
    }

    public void onPause() {
        super.onPause();
        getPreferenceManager().mo11205b().unregisterOnSharedPreferenceChangeListener(this.prefHelper);
    }

    public void onResume() {
        super.onResume();
        getPreferenceManager().mo11205b().registerOnSharedPreferenceChangeListener(this.prefHelper);
    }

    public void onStop() {
        super.onStop();
        ConfigPreferencesHelper configPreferencesHelper = this.prefHelper;
        if (configPreferencesHelper != null) {
            configPreferencesHelper.checkEnvironment();
        }
    }

    public final void setAnalyticsUploader(C12639h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.analyticsUploader = hVar;
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setElkLogDao(C12658b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.elkLogDao = bVar;
    }

    public final void setElkLogUploader(C8687h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.elkLogUploader = hVar;
    }

    public final void setHomeScreenEventManager(C13294e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.homeScreenEventManager = eVar;
    }

    public final void setPushOptInOnboardingEligibility(C8945a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.pushOptInOnboardingEligibility = aVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setSharedPreferencesProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.sharedPreferencesProvider = aVar;
    }

    public final void setTooltipPrefs(C13921e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.tooltipPrefs = eVar;
    }

    public Preference findPreference(String str) {
        if (str != null) {
            return super.findPreference(str);
        }
        return null;
    }
}
