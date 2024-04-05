package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowSubscreenFragment */
public abstract class NativeBuyItNowSubscreenFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Button backButton;

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35012onViewCreated$lambda0(NativeBuyItNowSubscreenFragment nativeBuyItNowSubscreenFragment, UiState uiState) {
        C19383o.m32797g(nativeBuyItNowSubscreenFragment, "this$0");
        if (uiState instanceof UiState.Summary) {
            nativeBuyItNowSubscreenFragment.bind((UiState.Summary) uiState);
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

    public abstract void bind(UiState.Summary summary);

    public final Button getBackButton() {
        Button button = this.backButton;
        if (button != null) {
            return button;
        }
        C19383o.m32805o("backButton");
        throw null;
    }

    public final C10368a getDispatcher() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment");
        return ((NativeBuyItNowCheckoutContainerFragment) parentFragment).getDispatcher();
    }

    public abstract int getLayoutId();

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final LiveData<UiState> getState() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment");
        return ((NativeBuyItNowCheckoutContainerFragment) parentFragment).getViewModel().f22739c;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(getLayoutId(), viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.back_button);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.back_button)");
        setBackButton((Button) findViewById);
        ViewExtensions.m12866j(getBackButton(), new NativeBuyItNowSubscreenFragment$onViewCreated$1(this));
        getState().observe(getViewLifecycleOwner(), new C9498g(this, 3));
    }

    public final void setBackButton(Button button) {
        C19383o.m32797g(button, "<set-?>");
        this.backButton = button;
    }
}
