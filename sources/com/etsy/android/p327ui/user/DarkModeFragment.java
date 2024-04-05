package com.etsy.android.p327ui.user;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0156f;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p389lc.C13011b;
import p440s9.C13366a;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.user.DarkModeFragment */
public final class DarkModeFragment extends TrackingBaseFragment implements C9731e0.C9733b, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C13011b darkModeTracker;

    /* renamed from: com.etsy.android.ui.user.DarkModeFragment$a */
    public static final class C11333a implements CollageRadioGroup.C9044a {

        /* renamed from: a */
        public final /* synthetic */ C13943a f24992a;

        /* renamed from: b */
        public final /* synthetic */ DarkModeFragment f24993b;

        public C11333a(C13943a aVar, DarkModeFragment darkModeFragment) {
            this.f24992a = aVar;
            this.f24993b = darkModeFragment;
        }

        /* renamed from: a */
        public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
            C19383o.m32797g(collageRadioButton, "selectedButton");
            switch (collageRadioButton.getId()) {
                case R.id.dark_mode_follow_system:
                    this.f24992a.mo46761a().edit().remove("dark_mode_preference").apply();
                    C0156f.m490z(-1);
                    return;
                case R.id.dark_mode_off:
                    this.f24992a.mo46761a().edit().putBoolean("dark_mode_preference", false).apply();
                    C0156f.m490z(1);
                    this.f24993b.getDarkModeTracker().mo45808a(false);
                    return;
                case R.id.dark_mode_on:
                    this.f24992a.mo46761a().edit().putBoolean("dark_mode_preference", true).apply();
                    C0156f.m490z(2);
                    this.f24993b.getDarkModeTracker().mo45808a(true);
                    return;
                default:
                    return;
            }
        }
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

    public final C13011b getDarkModeTracker() {
        C13011b bVar = this.darkModeTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("darkModeTracker");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.dark_mode;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_dark_mode, viewGroup, false);
        boolean w0 = C19382n.m32778w0();
        int i = R.id.dark_mode_follow_system;
        if (!w0) {
            ViewExtensions.m12860d(inflate.findViewById(R.id.dark_mode_follow_system));
        }
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C13943a aVar = new C13943a(requireContext);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageRadioGroup");
        CollageRadioGroup collageRadioGroup = (CollageRadioGroup) inflate;
        if (!C19382n.m32778w0() || aVar.mo46761a().contains("dark_mode_preference")) {
            i = aVar.mo46761a().getBoolean("dark_mode_preference", false) ? R.id.dark_mode_on : R.id.dark_mode_off;
        }
        collageRadioGroup.check(i);
        collageRadioGroup.setOnCheckedChangeListener(new C11333a(aVar, this));
        return inflate;
    }

    public final void setDarkModeTracker(C13011b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.darkModeTracker = bVar;
    }
}
