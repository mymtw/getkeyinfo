package com.etsy.android.p327ui.home.explore;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.home.home.HomeFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.explore.ExploreFragment */
public final class ExploreFragment extends HomeFragment implements C9731e0.C9732a {
    public static final int $stable = 8;
    public static final C9985a Companion = new C9985a();
    public static final String TITLE = "title";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String title = "";

    /* renamed from: com.etsy.android.ui.home.explore.ExploreFragment$a */
    public static final class C9985a {
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

    public String getFragmentTitleString() {
        String str = this.title;
        return str.length() == 0 ? super.getPageTitle() : str;
    }

    public final String getTitle() {
        return this.title;
    }

    public String getTrackingName() {
        return "explore_fragment";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        if (string == null) {
            string = "";
        }
        this.title = string;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
