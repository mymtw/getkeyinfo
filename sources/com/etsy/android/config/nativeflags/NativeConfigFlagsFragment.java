package com.etsy.android.config.nativeflags;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.C3040c;
import androidx.preference.C3045f;
import androidx.preference.C3051h;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.etsy.android.BOEApplication;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.C8615c;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.config.bucketing.NativeConfigBucketingMap;
import com.etsy.android.lib.core.EtsyApplication;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p010a9.C0047a;
import p010a9.C0048b;

public class NativeConfigFlagsFragment extends PreferenceFragmentCompat implements Preference.C3009c, SearchView.C0283l, SearchView.C0282k {
    private HashSet<String> mChangedConfigs = new HashSet<>();
    private String mFilter = "";
    private PreferenceScreen mRootScreen;
    private final TreeSet<Map.Entry<NativeConfig, Boolean>> sortedOptions = new TreeSet<>(new C0047a());

    /* renamed from: com.etsy.android.config.nativeflags.NativeConfigFlagsFragment$a */
    public class C6427a extends CheckBoxPreference {
        public C6427a(FragmentActivity fragmentActivity) {
            super(fragmentActivity, (AttributeSet) null);
        }

        /* renamed from: n */
        public final void mo11000n(C3051h hVar) {
            super.mo11000n(hVar);
            TextView textView = (TextView) hVar.itemView.findViewById(16908310);
            if (textView != null) {
                textView.setSingleLine(false);
                textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }
    }

    private void createListPreference(NativeConfig.C8609b bVar) {
        bVar.getClass();
        new ArrayList();
        throw null;
    }

    private void createStringPreference(NativeConfig nativeConfig, boolean z) {
        C6427a aVar = new C6427a(getActivity());
        aVar.mo11173L(z);
        aVar.mo11048H(nativeConfig.f18917a);
        aVar.mo11045D(nativeConfig.f18917a);
        aVar.mo11026F(z ? "on" : "off");
        aVar.f6839t = false;
        aVar.f6825f = this;
        this.mRootScreen.mo11148L(aVar);
    }

    private void filterAndSortOptions() {
        C19285c<Map<NativeConfig, C8615c>> cVar = NativeConfigBucketingMap.f18920d;
        LinkedHashMap linkedHashMap = EtsyApplication.get().getNativeConfigs().f18940a;
        Map a = NativeConfigBucketingMap.C8611a.m17001a();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C19421p.m32930T(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Boolean.valueOf(((C8615c) entry.getValue()).f18927b));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.putAll(linkedHashMap);
        linkedHashMap3.putAll(linkedHashMap2);
        Set<Map.Entry> entrySet = linkedHashMap3.entrySet();
        this.sortedOptions.clear();
        boolean z = !TextUtils.isEmpty(this.mFilter);
        for (Map.Entry entry2 : entrySet) {
            if (!z || ((NativeConfig) entry2.getKey()).f18917a.toLowerCase(Locale.ROOT).contains(this.mFilter)) {
                this.sortedOptions.add(entry2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean lambda$createListPreference$1(Preference preference, Object obj) {
        Object obj2;
        String str = preference.f6832m;
        String obj3 = obj.toString();
        C8617e nativeConfigs = EtsyApplication.get().getNativeConfigs();
        nativeConfigs.getClass();
        C19383o.m32797g(str, "configName");
        C19383o.m32797g(obj3, "variantName");
        Iterator it = nativeConfigs.f18940a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C19383o.m32792b(((NativeConfig) obj2).f18917a, str)) {
                break;
            }
        }
        NativeConfig nativeConfig = (NativeConfig) obj2;
        if (nativeConfig == null || !(nativeConfig instanceof NativeConfig.C8609b)) {
            throw new IllegalStateException(C0048b.m163a("Config ", str, " is not a variant config"));
        }
        NativeConfig.C8609b bVar = (NativeConfig.C8609b) nativeConfig;
        throw null;
    }

    /* access modifiers changed from: private */
    public static int lambda$new$0(Map.Entry entry, Map.Entry entry2) {
        return ((NativeConfig) entry.getKey()).f18917a.compareToIgnoreCase(((NativeConfig) entry2.getKey()).f18917a);
    }

    private void setupPreferences() {
        PreferenceScreen preferenceScreen = this.mRootScreen;
        synchronized (preferenceScreen) {
            ArrayList arrayList = preferenceScreen.f6876R;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                preferenceScreen.mo11152Q((Preference) arrayList.get(0));
            }
        }
        Preference.C3008b bVar = preferenceScreen.f6814I;
        if (bVar != null) {
            C3040c cVar = (C3040c) bVar;
            cVar.f6922f.removeCallbacks(cVar.f6923g);
            cVar.f6922f.post(cVar.f6923g);
        }
        filterAndSortOptions();
        Iterator<Map.Entry<NativeConfig, Boolean>> it = this.sortedOptions.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            NativeConfig nativeConfig = (NativeConfig) next.getKey();
            boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
            if (nativeConfig instanceof NativeConfig.C8609b) {
                createListPreference((NativeConfig.C8609b) nativeConfig);
            } else {
                createStringPreference(nativeConfig, booleanValue);
            }
        }
    }

    public boolean onClose() {
        this.mFilter = "";
        setupPreferences();
        return false;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.preference_action_bar, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setOnQueryTextListener(this);
        searchView.setOnCloseListener(this);
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        C3045f preferenceManager = getPreferenceManager();
        FragmentActivity activity = getActivity();
        preferenceManager.getClass();
        PreferenceScreen preferenceScreen = new PreferenceScreen(activity, (AttributeSet) null);
        preferenceScreen.mo11060m(preferenceManager);
        this.mRootScreen = preferenceScreen;
        setupPreferences();
        setPreferenceScreen(this.mRootScreen);
        setHasOptionsMenu(true);
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        this.mChangedConfigs.add(preference.f6832m);
        Boolean bool = (Boolean) obj;
        String str = ((CheckBoxPreference) preference).f6832m;
        C8617e nativeConfigs = EtsyApplication.get().getNativeConfigs();
        boolean booleanValue = bool.booleanValue();
        nativeConfigs.getClass();
        C19383o.m32797g(str, "key");
        for (Map.Entry key : nativeConfigs.f18940a.entrySet()) {
            NativeConfig nativeConfig = (NativeConfig) key.getKey();
            if (C19383o.m32792b(nativeConfig.f18917a, str)) {
                nativeConfigs.f18940a.put(nativeConfig, Boolean.valueOf(booleanValue));
            }
        }
        ((BOEApplication) EtsyApplication.get()).updateEtsyLensSharingTarget();
        preference.mo11026F(bool.booleanValue() ? "on" : "off");
        return true;
    }

    public boolean onQueryTextChange(String str) {
        this.mFilter = str.toLowerCase(Locale.ROOT);
        setupPreferences();
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.mFilter = str.toLowerCase(Locale.ROOT);
        setupPreferences();
        return false;
    }

    public void onStop() {
        super.onStop();
        FragmentActivity activity = getActivity();
        HashSet<String> hashSet = this.mChangedConfigs;
        SharedPreferences.Editor edit = activity.getSharedPreferences("EtsyUserPrefs", 0).edit();
        edit.putStringSet("most_recent_config", hashSet);
        edit.apply();
    }
}
