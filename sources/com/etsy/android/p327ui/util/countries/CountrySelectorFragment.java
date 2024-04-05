package com.etsy.android.p327ui.util.countries;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.search.filters.adapter.C10757a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.reddit.indicatorfastscroll.C17346a;
import com.reddit.indicatorfastscroll.FastScrollerThumbView;
import com.reddit.indicatorfastscroll.FastScrollerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p435rb.C13350a;
import p440s9.C13366a;
import p441sb.C13367a;
import p456ua.C13461f;
import p470w9.C13793a;
import p486y9.C13888d;
import p753kq.C19862q;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorFragment */
public abstract class CountrySelectorFragment extends TrackingBaseFragment implements C13366a, C9731e0.C9733b, C11324t.C11329b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C13888d currentLocale;
    private final C7091a disposable = new C7091a();
    public C8694h logCat;
    public RecyclerView recyclerView;
    public C13461f schedulers;
    public TextView textCurrentCountry;
    public CountrySelectorViewModel viewModel;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.util.countries.CountrySelectorFragment$a */
    public static final class C11774a implements FastScrollerView.C17343b {

        /* renamed from: b */
        public final /* synthetic */ LinearLayoutManager f26227b;

        public C11774a(LinearLayoutManager linearLayoutManager) {
            this.f26227b = linearLayoutManager;
        }

        public final void onItemIndicatorSelected(C17346a aVar, int i, int i2) {
            C19383o.m32797g(aVar, "indicator");
            this.f26227b.mo11307k1(i2, 0);
        }
    }

    private final void initObservers() {
        PublishSubject<List<Country>> publishSubject = getViewModel().f26231e;
        C19172m c = C0472h.m1242c(publishSubject, publishSubject);
        getSchedulers().getClass();
        ObservableSubscribeOn i = c.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        ObservableObserveOn e = i.mo20635e(C13461f.m21236c());
        C8766p pVar = new C8766p(this, 8);
        C6336c cVar = new C6336c(this, 6);
        Functions.C12958c cVar2 = Functions.f28539c;
        Functions.C12959d dVar = Functions.f28540d;
        Disposable f = e.mo20636f(pVar, cVar, cVar2, dVar);
        C7091a aVar = this.disposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        C7091a aVar2 = this.disposable;
        C19254a<Country> aVar3 = getViewModel().f26232f;
        C19172m b = C0472h.m1241b(aVar3, aVar3);
        getSchedulers().getClass();
        ObservableSubscribeOn i2 = b.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        Disposable f2 = i2.mo20635e(C13461f.m21236c()).mo20636f(new C6487g(this, 10), new C8905i(this, 7), cVar2, dVar);
        C19383o.m32798h(aVar2, "$this$plusAssign");
        aVar2.mo19403b(f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-1  reason: not valid java name */
    public static final void m35093initObservers$lambda1(CountrySelectorFragment countrySelectorFragment, List list) {
        C19383o.m32797g(countrySelectorFragment, "this$0");
        C8694h logCat2 = countrySelectorFragment.getLogCat();
        logCat2.mo21310e("Countries received: " + list);
        C19383o.m32796f(list, "it");
        countrySelectorFragment.onCountriesReceived(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-2  reason: not valid java name */
    public static final void m35094initObservers$lambda2(CountrySelectorFragment countrySelectorFragment, Throwable th) {
        C19383o.m32797g(countrySelectorFragment, "this$0");
        C8694h logCat2 = countrySelectorFragment.getLogCat();
        logCat2.mo21306a("Could not fetch countries: " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-3  reason: not valid java name */
    public static final void m35095initObservers$lambda3(CountrySelectorFragment countrySelectorFragment, Country country) {
        C19383o.m32797g(countrySelectorFragment, "this$0");
        countrySelectorFragment.getTextCurrentCountry().setText(country.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-4  reason: not valid java name */
    public static final void m35096initObservers$lambda4(CountrySelectorFragment countrySelectorFragment, Throwable th) {
        C19383o.m32797g(countrySelectorFragment, "this$0");
        countrySelectorFragment.getLogCat().error(th);
    }

    private final void onCountriesReceived(List<Country> list) {
        View view = getView();
        if (view != null) {
            setupAdapter(view, list);
        }
    }

    private final void setupAdapter(View view, List<Country> list) {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView2 = getRecyclerView();
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(new C10757a(new CountrySelectorFragment$setupAdapter$1$1(this), list));
        FastScrollerView fastScrollerView = (FastScrollerView) view.findViewById(R.id.fastscroller_countries);
        if (fastScrollerView != null) {
            FastScrollerView.setupWithRecyclerView$default(fastScrollerView, getRecyclerView(), new CountrySelectorFragment$setupAdapter$2$1(list, this), (C19862q) null, false, 12, (Object) null);
            fastScrollerView.setUseDefaultScroller(false);
            fastScrollerView.getItemIndicatorSelectedCallbacks().add(new C11774a(linearLayoutManager));
        }
        C19383o.m32796f(fastScrollerView, "fastScrollerView");
        ((FastScrollerThumbView) view.findViewById(R.id.fastscroller_countries_thumb)).setupWithFastScroller(fastScrollerView);
        View findViewById = view.findViewById(R.id.scroll_to_top);
        if (findViewById != null) {
            ViewExtensions.m12866j(findViewById, new CountrySelectorFragment$setupAdapter$4$1(this));
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

    public final void countrySelected(Country country) {
        C19383o.m32797g(country, "country");
        CountrySelectorViewModel viewModel2 = getViewModel();
        viewModel2.getClass();
        viewModel2.f26232f.onNext(country);
        onCountrySelected(country);
    }

    public C11324t.C11325a getBottomTabsOverrides() {
        return C11324t.C11325a.C11326a.f24988c;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C7091a getDisposable() {
        return this.disposable;
    }

    public int getFragmentTitle() {
        return -1;
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

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        C19383o.m32805o("recyclerView");
        throw null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public final TextView getTextCurrentCountry() {
        TextView textView = this.textCurrentCountry;
        if (textView != null) {
            return textView;
        }
        C19383o.m32805o("textCurrentCountry");
        throw null;
    }

    public final CountrySelectorViewModel getViewModel() {
        CountrySelectorViewModel countrySelectorViewModel = this.viewModel;
        if (countrySelectorViewModel != null) {
            return countrySelectorViewModel;
        }
        C19383o.m32805o("viewModel");
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

    public abstract void onCountrySelected(Country country);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_country_selector, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.text_selected_country);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.text_selected_country)");
        setTextCurrentCountry((TextView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.recycler_view_countries);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.recycler_view_countries)");
        setRecyclerView((RecyclerView) findViewById2);
        C19388s.m32810A0(getTextCurrentCountry(), new C13367a.C13368a());
        Drawable drawable = inflate.getResources().getDrawable(R.drawable.sk_ic_check);
        Context context = getContext();
        if (context != null) {
            drawable.setTint(C13350a.m21013d(context, R.attr.clg_color_text_primary));
        }
        getTextCurrentCountry().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        initObservers();
        CountrySelectorViewModel viewModel2 = getViewModel();
        C7091a aVar = viewModel2.f26233g;
        C8071s<C20145v<C19928a0>> a = viewModel2.f26228b.f30357a.mo46655a();
        C13793a aVar2 = new C13793a(0);
        a.getClass();
        aVar.mo19403b(SubscribersKt.m32500e(C0391c.m1056b(viewModel2.f26229c, C0326j.m860e(viewModel2.f26229c, new C19208j(a, aVar2))), new CountrySelectorViewModel$getCountries$1(viewModel2), new CountrySelectorViewModel$getCountries$2(viewModel2)));
    }

    public void onStop() {
        super.onStop();
        this.disposable.mo19405d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        setViewModel((CountrySelectorViewModel) new C2870k0((C2880m0) this, (C2870k0.C2872b) getViewModelFactory()).mo10829a(CountrySelectorViewModel.class));
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView2) {
        C19383o.m32797g(recyclerView2, "<set-?>");
        this.recyclerView = recyclerView2;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setTextCurrentCountry(TextView textView) {
        C19383o.m32797g(textView, "<set-?>");
        this.textCurrentCountry = textView;
    }

    public final void setViewModel(CountrySelectorViewModel countrySelectorViewModel) {
        C19383o.m32797g(countrySelectorViewModel, "<set-?>");
        this.viewModel = countrySelectorViewModel;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
