package com.etsy.android.p327ui.cart.saveforlater;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.C11795y;
import com.etsy.android.p327ui.cart.saveforlater.C9358d;
import com.etsy.android.stylekit.views.CollageEmptyStateView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p308ac.C8498b;
import p440s9.C13366a;
import p628nj.C18263b;
import p759nq.C19920b;

/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterFragment */
public final class SaveForLaterFragment extends TrackingBaseFragment implements C13366a {
    public static final /* synthetic */ C19410j<Object>[] $$delegatedProperties;
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C9351a adapter;
    private final C19920b emptyStateView$delegate = C11795y.m19487a(this, R.id.empty_state_view);
    private final C19920b loadingView$delegate = C11795y.m19487a(this, R.id.loading_view);
    private final C19920b noInternetView$delegate = C11795y.m19487a(this, R.id.no_internet);
    private final C19920b recyclerView$delegate = C11795y.m19487a(this, R.id.recycler_view_save_for_later);
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SaveForLaterViewModel.class), new SaveForLaterFragment$special$$inlined$viewModels$default$2(new SaveForLaterFragment$special$$inlined$viewModels$default$1(this)), new SaveForLaterFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SaveForLaterFragment.class, "loadingView", "getLoadingView()Landroid/view/View;", 0);
        C19387r rVar = C19386q.f43269a;
        rVar.getClass();
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(SaveForLaterFragment.class, "noInternetView", "getNoInternetView()Landroid/view/View;", 0);
        rVar.getClass();
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(SaveForLaterFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        rVar.getClass();
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(SaveForLaterFragment.class, "emptyStateView", "getEmptyStateView()Lcom/etsy/android/stylekit/views/CollageEmptyStateView;", 0);
        rVar.getClass();
        $$delegatedProperties = new C19410j[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4};
    }

    private final CollageEmptyStateView getEmptyStateView() {
        return (CollageEmptyStateView) this.emptyStateView$delegate.getValue(this, $$delegatedProperties[3]);
    }

    private final View getLoadingView() {
        return (View) this.loadingView$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final View getNoInternetView() {
        return (View) this.noInternetView$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final SaveForLaterViewModel getViewModel() {
        return (SaveForLaterViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C9358d dVar) {
        Object value;
        C9360e eVar;
        C19383o.m32792b(dVar, C9358d.C9359a.f20643a);
        SaveForLaterViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(dVar, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f20637d;
        do {
            value = stateFlowImpl.getValue();
            eVar = (C9360e) value;
            eVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, C9360e.m17717a(eVar, (C8498b) null, C19327t.m32649e1(dVar, eVar.f20645b), 1)));
    }

    /* access modifiers changed from: private */
    public final void handleState(C9360e eVar) {
        handleViewState(eVar.f20644a);
        C9358d dVar = (C9358d) C19327t.m32640V0(eVar.f20645b);
        if (dVar != null) {
            handleSideEffect(dVar);
        }
    }

    private final void handleViewState(C8498b bVar) {
        if (bVar instanceof C8498b.C8500b) {
            return;
        }
        if (bVar instanceof C8498b.C8501c) {
            ViewExtensions.m12869m(getLoadingView());
            ViewExtensions.m12860d(getNoInternetView());
            ViewExtensions.m12860d(getRecyclerView());
            ViewExtensions.m12860d(getEmptyStateView());
        } else if (bVar instanceof C8498b.C8499a) {
            ViewExtensions.m12860d(getLoadingView());
            ViewExtensions.m12869m(getNoInternetView());
            ViewExtensions.m12860d(getRecyclerView());
            ViewExtensions.m12860d(getEmptyStateView());
        } else if (bVar instanceof C8498b.C8503e) {
            ViewExtensions.m12860d(getLoadingView());
            ViewExtensions.m12860d(getNoInternetView());
            ViewExtensions.m12869m(getRecyclerView());
            ViewExtensions.m12860d(getEmptyStateView());
            showSaveForLaterUi((C8498b.C8503e) bVar);
        } else if (C19383o.m32792b(bVar, C8498b.C8502d.f18524a)) {
            showEmptyMessage();
        }
    }

    private final void showEmptyMessage() {
        ViewExtensions.m12860d(getLoadingView());
        ViewExtensions.m12860d(getNoInternetView());
        ViewExtensions.m12860d(getRecyclerView());
        ViewExtensions.m12869m(getEmptyStateView());
    }

    private final void showSaveForLaterUi(C8498b.C8503e eVar) {
        getAdapter().mo11950j(eVar.f18525a);
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

    public final C9351a getAdapter() {
        C9351a aVar = this.adapter;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("adapter");
        throw null;
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setAdapter(new C9351a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        if (viewGroup != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_save_for_later, viewGroup, false);
            C19383o.m32796f(inflate, "inflater.inflate(R.layou…_later, container, false)");
            return inflate;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getRecyclerView().setAdapter(getAdapter());
        StateFlowImpl stateFlowImpl = getViewModel().f20638e;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(stateFlowImpl, lifecycle, Lifecycle.State.STARTED), new SaveForLaterFragment$onViewCreated$1(this, (C19340c<? super SaveForLaterFragment$onViewCreated$1>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
    }

    public final void setAdapter(C9351a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.adapter = aVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
