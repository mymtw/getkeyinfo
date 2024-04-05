package com.etsy.android.p327ui.core.listingnomapper;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.uikit.p331ui.core.BaseDialogFragment;
import com.etsy.android.uikit.p331ui.core.DialogLauncherActivity;
import com.etsy.android.uikit.p331ui.core.TextDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.etsy.android.ui.core.listingnomapper.TextDialogActivity */
public final class TextDialogActivity extends DialogLauncherActivity {
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

    public BaseDialogFragment onStartDialogFragment(Bundle bundle) {
        TextDialogFragment textDialogFragment = new TextDialogFragment();
        textDialogFragment.setArguments(getIntent().getExtras());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10485g(16908290, textDialogFragment, (String) null, 1);
        aVar.mo10483d();
        return textDialogFragment;
    }
}
