package com.etsy.android.p327ui.user.privacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0472h;
import com.etsy.android.R;
import com.etsy.android.feedback.C6466k;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10383c;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.subjects.C19254a;
import p306z8.C8480g;
import p402n9.C13089i;
import p418pa.C13198d;
import p418pa.C13203e;
import p418pa.C13207f;
import p425q9.C13263n;
import p440s9.C13366a;
import p456ua.C13458c;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.privacy.PrivacyFragment */
public final class PrivacyFragment extends BaseRecyclerViewListFragment<C13207f> implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8672b analyticsTracker;
    private final C19285c viewModel$delegate = C19350d.m32677b(new PrivacyFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    /* access modifiers changed from: private */
    public final C11622b getViewModel() {
        return (C11622b) this.viewModel$delegate.getValue();
    }

    private final void initObservers() {
        getViewModel().f25728f.observe(getViewLifecycleOwner(), new C6466k(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-0  reason: not valid java name */
    public static final void m35066initObservers$lambda0(PrivacyFragment privacyFragment, C13203e eVar) {
        C19383o.m32797g(privacyFragment, "this$0");
        if (eVar instanceof C13203e.C13206c) {
            privacyFragment.setLoading(false);
            C11829a<T> aVar = privacyFragment.adapter;
            C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.user.privacy.PrivacyListAdapter");
            ((C11618a) aVar).clear();
            C11829a<T> aVar2 = privacyFragment.adapter;
            List<C13207f> list = ((C13203e.C13206c) eVar).f29041a;
            String string = privacyFragment.getString(R.string.privacy_requiredtech_title_v2);
            C19383o.m32796f(string, "getString(R.string.privacy_requiredtech_title_v2)");
            String string2 = privacyFragment.getString(R.string.privacy_requiredtech_value);
            C19383o.m32796f(string2, "getString(R.string.privacy_requiredtech_value)");
            aVar2.addItems(C19327t.m32651g1(C19327t.m32651g1(list, new C13207f.C13209b(string, string2)), C13207f.C13208a.f29042a));
            privacyFragment.adapter.notifyDataSetChanged();
            privacyFragment.showListView();
        } else if (eVar instanceof C13203e.C13204a) {
            privacyFragment.setLoading(false);
            privacyFragment.showErrorView();
        } else if (eVar instanceof C13203e.C13205b) {
            privacyFragment.showLoadingView();
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

    public final C8672b getAnalyticsTracker() {
        C8672b bVar = this.analyticsTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.privacy;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "privacy_settings";
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
        C11618a aVar = new C11618a(getActivity(), getAnalyticsTracker(), new PrivacyFragment$onCreateView$1(this));
        this.adapter = aVar;
        this.recyclerView.setAdapter(aVar);
        initObservers();
        this.swipeRefreshLayout.setEnabled(false);
        return onCreateView;
    }

    public void onLoadContent() {
        C11622b viewModel = getViewModel();
        viewModel.f25724b.mo45907a(viewModel.f25727e);
    }

    public void onStart() {
        super.onStart();
        C11622b viewModel = getViewModel();
        C19254a<C13198d.C13199a> aVar = viewModel.f25724b.f29035e;
        C19172m b = C0472h.m1241b(aVar, aVar);
        viewModel.f25725c.getClass();
        ObservableSubscribeOn i = b.mo20639i(C13461f.m21235b());
        viewModel.f25725c.getClass();
        ObservableObserveOn e = i.mo20635e(C13461f.m21236c());
        C13263n nVar = new C13263n(viewModel, 7);
        C13089i iVar = new C13089i(viewModel, 9);
        Functions.C12958c cVar = Functions.f28539c;
        Functions.C12959d dVar = Functions.f28540d;
        Disposable f = e.mo20636f(nVar, iVar, cVar, dVar);
        C7091a aVar2 = viewModel.f25727e;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f);
        C19179q qVar = new C19179q(viewModel.f25724b.mo45909c(), new C13458c(viewModel, 6));
        viewModel.f25725c.getClass();
        ObservableSubscribeOn i2 = qVar.mo20639i(C13461f.m21235b());
        viewModel.f25725c.getClass();
        Disposable f2 = i2.mo20635e(C13461f.m21236c()).mo20636f(new C8480g(viewModel, 6), new C10383c(2), cVar, dVar);
        C7091a aVar3 = viewModel.f25727e;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(f2);
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.analyticsTracker = bVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
