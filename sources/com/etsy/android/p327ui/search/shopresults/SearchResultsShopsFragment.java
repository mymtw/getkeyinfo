package com.etsy.android.p327ui.search.shopresults;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.search.container.C10741a;
import com.etsy.android.p327ui.search.p330v2.C10974e;
import com.etsy.android.p327ui.search.shopresults.C10939e;
import com.etsy.android.p327ui.search.shopresults.C10942g;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.EndlessRecyclerViewListFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p356ge.C12790b;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsFragment */
public final class SearchResultsShopsFragment extends EndlessRecyclerViewListFragment<ShopCard> implements C13366a, C10974e {
    public static final int $stable = 8;
    private static final int BATCH_SIZE = 30;
    public static final C10934a Companion = new C10934a();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private View emptySuggestions;
    private boolean isBrowseListingsLogged;
    private int offset;
    private C10936b searchResultsShopsAdapter;
    private View shopHeader;
    private TextView shopsSectionTitle;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SearchResultsShopsViewModel.class), new SearchResultsShopsFragment$special$$inlined$viewModels$default$2(new SearchResultsShopsFragment$special$$inlined$viewModels$default$1(this)), new SearchResultsShopsFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsFragment$a */
    public static final class C10934a {
    }

    private final void emptySearchResults() {
        showEmptyView();
    }

    private final C10741a getSearchContainerComponent() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.search.container.SearchContainerComponent");
        return (C10741a) parentFragment;
    }

    private final SearchResultsShopsViewModel getViewModel() {
        return (SearchResultsShopsViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C10939e eVar) {
        if (eVar instanceof C10939e.C10940a) {
            C10939e.C10940a aVar = (C10939e.C10940a) eVar;
            onSearchShopsResults(aVar.f24285a, aVar.f24286b);
        }
        SearchResultsShopsViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(eVar, "event");
        StateFlowImpl stateFlowImpl = viewModel.f24271d;
        C10941f fVar = (C10941f) stateFlowImpl.getValue();
        fVar.getClass();
        stateFlowImpl.setValue(C10941f.m18941a(fVar, C19327t.m32649e1(eVar, fVar.f24287a), 0, (String) null, (C10942g) null, 14));
    }

    /* access modifiers changed from: private */
    public final void handleState(C10941f fVar) {
        handleUi(fVar.f24290d);
        C10939e eVar = (C10939e) C19327t.m32640V0(fVar.f24287a);
        if (eVar != null) {
            handleSideEffect(eVar);
        }
    }

    private final void handleUi(C10942g gVar) {
        if (C19383o.m32792b(gVar, C10942g.C10945c.f24293a)) {
            return;
        }
        if (C19383o.m32792b(gVar, C10942g.C10946d.f24294a)) {
            showLoadingView();
        } else if (C19383o.m32792b(gVar, C10942g.C10948f.f24296a)) {
            showListView();
        } else if (C19383o.m32792b(gVar, C10942g.C10943a.f24291a)) {
            emptySearchResults();
        } else if (C19383o.m32792b(gVar, C10942g.C10944b.f24292a)) {
            showErrorView();
        } else if (C19383o.m32792b(gVar, C10942g.C10947e.f24295a)) {
            stopEndless();
            showEndlessError();
        }
    }

    private final void onSearchShopsResults(List<? extends ShopCard> list, int i) {
        String str;
        stopEndless();
        C10936b bVar = this.searchResultsShopsAdapter;
        if (bVar != null) {
            if (bVar.f24282d == null) {
                if (bVar != null) {
                    if (i == 0) {
                        str = getResources().getString(R.string.shops_found_none);
                    } else {
                        str = getResources().getQuantityString(R.plurals.search_shops_found, i, new Object[]{Integer.valueOf(i)});
                    }
                    C19383o.m32796f(str, "if (maxCount == 0) {\n   …      )\n                }");
                    bVar.f24282d = new C10937c(str);
                    bVar.addHeader(1);
                } else {
                    C19383o.m32805o("searchResultsShopsAdapter");
                    throw null;
                }
            }
            C10936b bVar2 = this.searchResultsShopsAdapter;
            if (bVar2 != null) {
                bVar2.addItems(list);
                C10936b bVar3 = this.searchResultsShopsAdapter;
                if (bVar3 == null) {
                    C19383o.m32805o("searchResultsShopsAdapter");
                    throw null;
                } else if (bVar3.getItemCount() < i) {
                    startEndless();
                }
            } else {
                C19383o.m32805o("searchResultsShopsAdapter");
                throw null;
            }
        } else {
            C19383o.m32805o("searchResultsShopsAdapter");
            throw null;
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

    public String getQuery() {
        return ((C10941f) getViewModel().f24271d.getValue()).f24289c;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Object value;
        super.onCreate(bundle);
        SearchResultsShopsViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("SEARCH_QUERY") : null;
        StateFlowImpl stateFlowImpl = viewModel.f24271d;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, C10941f.m18941a((C10941f) value, (ArrayList) null, 0, string, (C10942g) null, 11)));
        if (C19383o.m32792b(((C10941f) viewModel.f24272e.getValue()).f24290d, C10942g.C10945c.f24293a)) {
            viewModel.mo36274b();
        }
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C10936b bVar = new C10936b(requireActivity, new SearchResultsShopsFragment$onCreate$1(this));
        this.searchResultsShopsAdapter = bVar;
        this.adapter = bVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        getSearchContainerComponent().clearFocus();
        return onCreateView;
    }

    public void onLoadContent() {
    }

    public void onRetry() {
        getViewModel().mo36274b();
    }

    public void onScrolledToLoadTrigger() {
        getViewModel().mo36274b();
    }

    public final void onShopCardClicked(long j) {
        C12790b.m20430b(this, new ShopHomeKey(C12790b.m20432d(this), new EtsyId(j), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1020, (DefaultConstructorMarker) null));
    }

    public void onStart() {
        super.onStart();
        if (!this.isBrowseListingsLogged) {
            this.isBrowseListingsLogged = true;
            getAnalyticsContext().mo21333d("shop_search_results", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C10936b bVar = this.searchResultsShopsAdapter;
        if (bVar != null) {
            bVar.f26308b = this;
            this.emptyText.setText(R.string.empty_shop_search);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = {getString(R.string.other_things_to_try), 10};
            for (int i = 0; i < 2; i++) {
                sb.append(objArr[i]);
            }
            Object[] objArr2 = {getString(R.string.search_suggest_other_keywords), 10};
            for (int i2 = 0; i2 < 2; i2++) {
                sb.append(objArr2[i2]);
            }
            sb.append(getString(R.string.search_suggest_fewer_keywords));
            this.emptySubtext.setText(sb.toString());
            ViewExtensions.m12869m(this.emptySubtext);
            StateFlowImpl stateFlowImpl = getViewModel().f24272e;
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(stateFlowImpl, lifecycle, Lifecycle.State.STARTED), new SearchResultsShopsFragment$onViewCreated$1(this, (C19340c<? super SearchResultsShopsFragment$onViewCreated$1>) null));
            C2887s viewLifecycleOwner = getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
            return;
        }
        C19383o.m32805o("searchResultsShopsAdapter");
        throw null;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
