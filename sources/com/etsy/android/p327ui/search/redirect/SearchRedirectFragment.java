package com.etsy.android.p327ui.search.redirect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.container.SearchNavigationViewModel;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.redirect.C10930d;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p356ge.C12790b;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.redirect.SearchRedirectFragment */
public final class SearchRedirectFragment extends BaseRecyclerViewListFragment<Object> implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private SearchNavigationViewModel navigationViewModel;
    private final C19285c redirectViewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C10933e.class), new SearchRedirectFragment$special$$inlined$viewModels$default$2(new SearchRedirectFragment$special$$inlined$viewModels$default$1(this)), new SearchRedirectFragment$redirectViewModel$2(this));
    public C8656o viewModelFactory;

    private final SearchRedirectSpec getRedirectSpec(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("SEARCH_CATEGORY_REDIRECT_TAXONOMY_PATH")) == null) {
            return null;
        }
        Serializable serializable = bundle.getSerializable("SEARCH_CATEGORY_REDIRECT_QUERY_PARAMS");
        HashMap hashMap = serializable instanceof HashMap ? (HashMap) serializable : null;
        if (hashMap == null) {
            return null;
        }
        return new SearchRedirectSpec(string, hashMap, false, 4, (DefaultConstructorMarker) null);
    }

    private final C10933e getRedirectViewModel() {
        return (C10933e) this.redirectViewModel$delegate.getValue();
    }

    private final SearchSpec getSearchSpec() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ANCHOR_LISTING_ID") : null;
        Bundle arguments2 = getArguments();
        SearchOptions searchOptions = arguments2 != null ? (SearchOptions) arguments2.getParcelable("SEARCH_OPTIONS") : null;
        return new SearchSpec((String) null, (Long) null, searchOptions instanceof SearchOptions ? searchOptions : null, (Long) null, string, false, false, false, false, (Bundle) null, 1003, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final void handleState(C10930d dVar) {
        if (dVar instanceof C10930d.C10932b) {
            setLoading(true);
        } else if (dVar instanceof C10930d.C10931a) {
            onLoadFailure();
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.navigationViewModel = (SearchNavigationViewModel) new C2870k0(parentFragment).mo10829a(SearchNavigationViewModel.class);
            getRedirectViewModel().f24266c = this.navigationViewModel;
            C19662p1 p1Var = getRedirectViewModel().f24268e;
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new SearchRedirectFragment$onCreateView$2(this, (C19340c<? super SearchRedirectFragment$onCreateView$2>) null));
            C2887s viewLifecycleOwner = getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
            loadContent();
            return onCreateView;
        }
        throw new Exception("Invalid Parent Fragment");
    }

    public void onLoadContent() {
        Object value;
        Object value2;
        SearchRedirectSpec redirectSpec = getRedirectSpec(getArguments());
        SearchSpec searchSpec = getSearchSpec();
        C10933e redirectViewModel = getRedirectViewModel();
        String d = C12790b.m20432d(this);
        redirectViewModel.getClass();
        C19383o.m32797g(searchSpec, "searchSpec");
        StateFlowImpl stateFlowImpl = redirectViewModel.f24267d;
        do {
            value = stateFlowImpl.getValue();
            C10930d dVar = (C10930d) value;
        } while (!stateFlowImpl.mo72337i(value, C10930d.C10932b.f24264a));
        if (redirectSpec == null) {
            StateFlowImpl stateFlowImpl2 = redirectViewModel.f24267d;
            do {
                value2 = stateFlowImpl2.getValue();
                C10930d dVar2 = (C10930d) value2;
            } while (!stateFlowImpl2.mo72337i(value2, C10930d.C10931a.f24263a));
            return;
        }
        C19697g.m33468f(C19388s.m32866i0(redirectViewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchRedirectViewModel$getRedirectDestination$3(redirectSpec, redirectViewModel, d, searchSpec, (C19340c<? super SearchRedirectViewModel$getRedirectDestination$3>) null), 3);
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
