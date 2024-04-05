package com.etsy.android.p327ui.core;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.etsy.android.ui.core.ShopAboutVideoActivity */
public final class ShopAboutVideoActivity extends TrackingBaseActivity {
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
        getAppBarHelper().hideAppBar();
        if (bundle == null) {
            ShopAboutVideoFragment shopAboutVideoFragment = new ShopAboutVideoFragment();
            shopAboutVideoFragment.setArguments(getIntent().getExtras());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C2740a aVar = new C2740a(supportFragmentManager);
            aVar.mo10531h(16908290, shopAboutVideoFragment, (String) null);
            aVar.mo10483d();
        }
    }
}
