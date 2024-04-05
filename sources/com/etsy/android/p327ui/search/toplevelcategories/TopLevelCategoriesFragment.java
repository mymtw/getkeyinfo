package com.etsy.android.p327ui.search.toplevelcategories;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CreateGiftCardKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.container.SearchNavigationViewModel;
import com.etsy.android.p327ui.search.p330v2.suggestions.SearchSuggestionsLayout;
import com.etsy.android.p327ui.search.toplevelcategories.C10960e;
import com.etsy.android.stylekit.views.CollageEdge;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.BOEOptionsMenuItemHelper;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8061n;
import p260v0.C8184a;
import p356ge.C12790b;
import p363he.C12821d;
import p430qe.C13301b;
import p430qe.C13311c;
import p440s9.C13366a;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.TopLevelCategoriesFragment */
public final class TopLevelCategoriesFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a compositeDisposable = new C7091a();
    private int firstVisibleItem;
    public C8694h logCat;
    private SearchNavigationViewModel navigationViewModel;
    public C13461f schedulers;
    private RecyclerView searchSuggestionsRecyclerView;
    private boolean shouldResetToolbar = true;
    private final C19285c topLevelCategoriesViewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C10966f.class), new TopLevelCategoriesFragment$special$$inlined$viewModels$default$2(new TopLevelCategoriesFragment$special$$inlined$viewModels$default$1(this)), new TopLevelCategoriesFragment$topLevelCategoriesViewModel$2(this));
    private SearchSuggestionsLayout view;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.TopLevelCategoriesFragment$a */
    public static final class C10954a extends RecyclerView.C3099n {

        /* renamed from: a */
        public final /* synthetic */ TopLevelCategoriesFragment f24304a;

        public C10954a(TopLevelCategoriesFragment topLevelCategoriesFragment) {
            this.f24304a = topLevelCategoriesFragment;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            C19383o.m32797g(rect, "outRect");
            C19383o.m32797g(view, "view");
            C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
            C19383o.m32797g(yVar, "state");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = this.f24304a.getResources().getDimensionPixelSize(R.dimen.categories_tear_header_height);
            }
        }
    }

    private final C10966f getTopLevelCategoriesViewModel() {
        return (C10966f) this.topLevelCategoriesViewModel$delegate.getValue();
    }

    private final void handleSideEffect(C10958c cVar) {
        Object value;
        C10959d dVar;
        C10966f topLevelCategoriesViewModel = getTopLevelCategoriesViewModel();
        topLevelCategoriesViewModel.getClass();
        C19383o.m32797g(cVar, "sideEffect");
        StateFlowImpl stateFlowImpl = topLevelCategoriesViewModel.f24315d;
        do {
            value = stateFlowImpl.getValue();
            dVar = (C10959d) value;
            dVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, C10959d.m18945a(dVar, (C10960e) null, C19327t.m32649e1(cVar, dVar.f24307b), 1)));
    }

    /* access modifiers changed from: private */
    public final void handleState(C10959d dVar) {
        handleUiState(dVar.f24306a);
        C10958c cVar = (C10958c) C19327t.m32640V0(dVar.f24307b);
        if (cVar != null) {
            handleSideEffect(cVar);
        }
    }

    private final void handleUiState(C10960e eVar) {
        if (eVar instanceof C10960e.C10963c) {
            return;
        }
        if (eVar instanceof C10960e.C10964d) {
            SearchSuggestionsLayout searchSuggestionsLayout = this.view;
            if (searchSuggestionsLayout != null) {
                searchSuggestionsLayout.showLoader();
            }
        } else if (eVar instanceof C10960e.C10961a) {
            SearchSuggestionsLayout searchSuggestionsLayout2 = this.view;
            if (searchSuggestionsLayout2 != null) {
                searchSuggestionsLayout2.hideLoaderAndError();
            }
            SearchSuggestionsLayout searchSuggestionsLayout3 = this.view;
            if (searchSuggestionsLayout3 != null) {
                searchSuggestionsLayout3.hideSearchHistory();
            }
        } else if (eVar instanceof C10960e.C10965e) {
            SearchSuggestionsLayout searchSuggestionsLayout4 = this.view;
            if (searchSuggestionsLayout4 != null) {
                searchSuggestionsLayout4.hideLoaderAndError();
            }
            SearchSuggestionsLayout searchSuggestionsLayout5 = this.view;
            if (searchSuggestionsLayout5 != null) {
                searchSuggestionsLayout5.showSearchSuggestions(((C10960e.C10965e) eVar).f24312a, false);
            }
        } else if (eVar instanceof C10960e.C10962b) {
            SearchSuggestionsLayout searchSuggestionsLayout6 = this.view;
            if (searchSuggestionsLayout6 != null) {
                searchSuggestionsLayout6.hideLoaderAndError();
            }
            SearchSuggestionsLayout searchSuggestionsLayout7 = this.view;
            if (searchSuggestionsLayout7 != null) {
                searchSuggestionsLayout7.showErrorView();
            }
        }
    }

    private final void navigateToGiftCards() {
        C12790b.m20430b(this, new CreateGiftCardKey(C19421p.m32935c0(getActivity()), (Bundle) null, 2, (DefaultConstructorMarker) null));
    }

    private final void navigateToGiftGuide(String str) {
        C12790b.m20430b(this, new C12821d(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m35049onCreateView$lambda2(TopLevelCategoriesFragment topLevelCategoriesFragment, View view2) {
        C19383o.m32797g(topLevelCategoriesFragment, "this$0");
        C10966f topLevelCategoriesViewModel = topLevelCategoriesFragment.getTopLevelCategoriesViewModel();
        topLevelCategoriesViewModel.getClass();
        C19697g.m33468f(C19388s.m32866i0(topLevelCategoriesViewModel), (CoroutineContext) null, (CoroutineStart) null, new TopLevelCategoriesViewModel$loadSuggestions$1(topLevelCategoriesViewModel, (C19340c<? super TopLevelCategoriesViewModel$loadSuggestions$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void processClickType(C13311c cVar) {
        if (cVar instanceof C13311c.C13320i) {
            navigateToGiftGuide(((C13311c.C13320i) cVar).f29225a);
        } else if (C19383o.m32792b(cVar, C13311c.C13319h.f29224a)) {
            navigateToGiftCards();
        } else if (cVar instanceof C13311c.C13313b) {
            this.shouldResetToolbar = false;
            SearchNavigationViewModel searchNavigationViewModel = this.navigationViewModel;
            if (searchNavigationViewModel != null) {
                C13311c.C13313b bVar = (C13311c.C13313b) cVar;
                C19383o.m32797g(bVar, "click");
                searchNavigationViewModel.f23672b.onNext(new C13301b.C13304c(bVar.f29218a));
                return;
            }
            C19383o.m32805o("navigationViewModel");
            throw null;
        } else {
            boolean z = true;
            if (!(cVar instanceof C13311c.C13325n ? true : cVar instanceof C13311c.C13322k ? true : C19383o.m32792b(cVar, C13311c.C13312a.f29217a) ? true : cVar instanceof C13311c.C13315d ? true : C19383o.m32792b(cVar, C13311c.C13314c.f29219a) ? true : cVar instanceof C13311c.C13321j ? true : cVar instanceof C13311c.C13323l)) {
                z = cVar instanceof C13311c.C13324m;
            }
            if (!z && !(cVar instanceof C13311c.C13317f) && !(cVar instanceof C13311c.C13316e)) {
                boolean z2 = cVar instanceof C13311c.C13318g;
            }
        }
    }

    private final void resetToolbar() {
        FragmentActivity activity;
        if (this.shouldResetToolbar && (activity = getActivity()) != null) {
            AppBarHelper appBarHelper = ((BOEActivity) activity).getAppBarHelper();
            C19383o.m32796f(appBarHelper, "it as BOEActivity).appBarHelper");
            appBarHelper.resetToolbarColor();
            if (!appBarHelper.isFullScreen(activity)) {
                appBarHelper.resetStatusBarColor(getActivity());
            }
            appBarHelper.restoreElevation();
        }
    }

    private final void setUpToolbar() {
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof BOEActivity)) {
            this.shouldResetToolbar = true;
            AppBarHelper appBarHelper = ((BOEActivity) activity).getAppBarHelper();
            C19383o.m32796f(appBarHelper, "it.appBarHelper");
            Object obj = C8184a.f17966a;
            appBarHelper.changeToolbarBackgroundColor(C8184a.C8188d.m16468a(activity, R.color.navigational_header_tear));
            appBarHelper.removeElevation();
            if (!appBarHelper.isFullScreen(activity)) {
                appBarHelper.changeStatusBarColor(C8184a.C8188d.m16468a(activity, R.color.navigational_header_tear), getActivity());
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view2 = map.get(Integer.valueOf(i));
        if (view2 != null) {
            return view2;
        }
        View view3 = getView();
        if (view3 == null || (findViewById = view3.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
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
        super.onCreate(bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.navigationViewModel = (SearchNavigationViewModel) new C2870k0(parentFragment).mo10829a(SearchNavigationViewModel.class);
            return;
        }
        throw new IllegalStateException("Invalid Parent Fragment");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        BOEOptionsMenuItemHelper.m19853a(menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8061n<C13311c> clickEvents;
        C19383o.m32797g(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        SearchSuggestionsLayout searchSuggestionsLayout = new SearchSuggestionsLayout(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        searchSuggestionsLayout.setAnalyticsContext(getAnalyticsContext());
        this.view = searchSuggestionsLayout;
        this.searchSuggestionsRecyclerView = (RecyclerView) searchSuggestionsLayout.findViewById(R.id.search_suggestions_recyclerview);
        SearchSuggestionsLayout searchSuggestionsLayout2 = this.view;
        CollageEdge collageEdge = searchSuggestionsLayout2 != null ? (CollageEdge) searchSuggestionsLayout2.findViewById(R.id.header_edge) : null;
        RecyclerView recyclerView = this.searchSuggestionsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setPadding(getResources().getDimensionPixelSize(R.dimen.clg_space_8), 0, getResources().getDimensionPixelSize(R.dimen.clg_space_8), 0);
        }
        if (collageEdge != null) {
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            Object obj = C8184a.f17966a;
            collageEdge.setImageTintList(ColorStateList.valueOf(C8184a.C8188d.m16468a(requireContext2, R.color.navigational_header_tear)));
        }
        if (collageEdge != null) {
            ViewExtensions.m12869m(collageEdge);
        }
        RecyclerView recyclerView2 = this.searchSuggestionsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C10954a(this));
        }
        SearchSuggestionsLayout searchSuggestionsLayout3 = this.view;
        if (searchSuggestionsLayout3 != null) {
            searchSuggestionsLayout3.setErrorViewClickListener(new C6486a(this, 4));
        }
        SearchSuggestionsLayout searchSuggestionsLayout4 = this.view;
        if (!(searchSuggestionsLayout4 == null || (clickEvents = searchSuggestionsLayout4.clickEvents()) == null)) {
            getSchedulers().getClass();
            ObservableSubscribeOn i = clickEvents.mo20639i(C13461f.m21235b());
            getSchedulers().getClass();
            LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), TopLevelCategoriesFragment$onCreateView$4.INSTANCE, new TopLevelCategoriesFragment$onCreateView$5(this), 2);
            C7091a aVar = this.compositeDisposable;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(f);
        }
        return this.view;
    }

    public void onDestroyView() {
        this.compositeDisposable.mo19405d();
        this.view = null;
        this.searchSuggestionsRecyclerView = null;
        resetToolbar();
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        C12790b.m20430b(this, new SearchContainerKey(C19421p.m32935c0(getActivity()), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null, 14, (DefaultConstructorMarker) null));
        return true;
    }

    public void onPause() {
        super.onPause();
        RecyclerView recyclerView = this.searchSuggestionsRecyclerView;
        RecyclerView.C3100o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.firstVisibleItem = ((LinearLayoutManager) layoutManager).mo11282S0();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_search);
        if (findItem != null) {
            findItem.setVisible(true);
            findItem.setEnabled(true);
        }
    }

    public void onResume() {
        super.onResume();
        setUpToolbar();
    }

    public void onViewCreated(View view2, Bundle bundle) {
        C19383o.m32797g(view2, "view");
        C19662p1 p1Var = getTopLevelCategoriesViewModel().f24316e;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new TopLevelCategoriesFragment$onViewCreated$1(this, (C19340c<? super TopLevelCategoriesFragment$onViewCreated$1>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
