package com.etsy.android.p327ui;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.BOEOptionsMenuItemHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.EtsyFragment */
public abstract class EtsyFragment extends TrackingBaseFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public BaseActivity mActivity;

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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onAttach(Activity activity) {
        C19383o.m32797g(activity, "activity");
        super.onAttach(activity);
        this.mActivity = (BaseActivity) activity;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        onCreateOptionsMenuWithIcons(menu, menuInflater);
        BOEOptionsMenuItemHelper.m19853a(menu);
    }

    public final void onCreateOptionsMenuWithIcons(Menu menu, MenuInflater menuInflater) {
    }
}
