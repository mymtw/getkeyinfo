package com.etsy.android.p327ui;

import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.config.PrefsFragment;
import com.etsy.android.uikit.BasePreferenceActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.EtsyPreferenceActivity */
public final class EtsyPreferenceActivity extends BasePreferenceActivity implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C2740a c = C0070b.m182c(supportFragmentManager, supportFragmentManager);
            c.mo10531h(R.id.preference_content, new PrefsFragment(), (String) null);
            c.mo10483d();
        }
    }
}
