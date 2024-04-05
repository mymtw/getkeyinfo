package com.etsy.android.p327ui.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8634f;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.EtsyCurrency;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.push.registration.C8839l;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.adapters.CurrencyAdapter;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8048a;
import p248tp.C8066r;
import p248tp.C8071s;
import p356ge.C12788a;
import p359ha.C12799a;
import p370ie.C12941a;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.user.CurrencySelectFragment */
public class CurrencySelectFragment extends BaseRecyclerViewListFragment<EtsyCurrency> implements C13366a, C9731e0.C9733b {
    public C8629a appCurrency;
    public C13888d appLocale;
    private C7091a compositeDisposable = new C7091a();
    public Connectivity connectivity;
    public C11520e currencyRepository;
    public C12799a firebaseAnalyticsTracker;
    public C11524g repository;
    public C13461f schedulers;
    public C8634f selectableCurrencies;
    public C13265p session;
    public C8637h userCurrency;

    /* renamed from: com.etsy.android.ui.user.CurrencySelectFragment$a */
    public interface C11332a {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadContent$0(Throwable th) throws Exception {
        onCurrencyError();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateUserPreference$2(Throwable th) throws Exception {
        C8901g0.m17337c(requireActivity(), R.string.currency_save_error);
    }

    /* access modifiers changed from: private */
    public void onCurrencyChanged(EtsyCurrency etsyCurrency, boolean z) {
        updateUserPreference(etsyCurrency, z);
        C12788a.m20424c(getActivity(), new C12941a(C19421p.m32935c0(getContext()), (FragmentNavigationKey) new HomePagerKey(C19421p.m32935c0(getContext()), (Bundle) null, true), (Bundle) null, true));
        requireActivity().recreate();
    }

    private void onCurrencyError() {
        showEmptyView();
    }

    /* access modifiers changed from: private */
    public void onCurrencyLoaded(List<? extends EtsyCurrency> list) {
        if (getActivity() != null) {
            this.adapter.clear();
            this.adapter.addItems(list);
            DefaultCurrency defaultCurrency = new DefaultCurrency(getActivity(), this.selectableCurrencies.f18980a, this.userCurrency);
            this.adapter.addItemAtPosition(0, defaultCurrency);
            if (!defaultCurrency.isSupportedCurrency()) {
                CurrencyAdapter currencyAdapter = (CurrencyAdapter) this.adapter;
                Currency deviceCurrency = defaultCurrency.getDeviceCurrency();
                currencyAdapter.getClass();
                C19383o.m32797g(deviceCurrency, "deviceCurrency");
                currencyAdapter.f19996d = deviceCurrency;
                this.adapter.addHeader(1);
            }
        }
        showListView();
    }

    private void updateUserPreference(EtsyCurrency etsyCurrency, boolean z) {
        if (this.session.mo45960e() && etsyCurrency != null) {
            if (this.connectivity.mo29933a()) {
                C7091a aVar = this.compositeDisposable;
                C11524g gVar = this.repository;
                String code = etsyCurrency.getCode();
                C19383o.m32797g(code, AppsFlyerProperties.CURRENCY_CODE);
                gVar.getClass();
                C11525h hVar = gVar.f25421a;
                C13888d dVar = gVar.f25422b;
                C19383o.m32797g(dVar, "currentLocale");
                C8048a a = hVar.mo37405a(C19294b0.m32562s0(new Pair("currency", code), new Pair("language", dVar.mo46717a()), new Pair("region", dVar.mo46719c().getCountry())));
                this.schedulers.getClass();
                C8066r b = C13461f.m21235b();
                a.getClass();
                CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(a, b);
                this.schedulers.getClass();
                aVar.mo19403b(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()).mo20608c(new C8766p(this, 6), new C11522f()));
            } else {
                C8901g0.m17337c(requireActivity(), R.string.currency_save_error);
            }
        }
        if (z) {
            C8637h hVar2 = this.userCurrency;
            hVar2.f18986e.edit().putString("etsyUserCurrencyPref", (String) null).apply();
            hVar2.f18988g = null;
            hVar2.f18983b.f29126a.mo20709c(new Intent("com.etsy.android.CURRENCY_UPDATED"));
        } else if (etsyCurrency != null) {
            this.userCurrency.mo21254c(etsyCurrency.getCode());
        } else {
            C8901g0.m17337c(requireActivity(), R.string.currency_save_error);
        }
        getAnalyticsContext().mo21333d("set_locale_preferences", new HashMap<AnalyticsProperty, Object>() {
            {
                put(PredefinedAnalyticsProperty.LANGUAGE, CurrencySelectFragment.this.appLocale.mo46717a());
                put(PredefinedAnalyticsProperty.CURRENCY, CurrencySelectFragment.this.userCurrency.mo21246a());
            }
        });
        C12799a aVar2 = this.firebaseAnalyticsTracker;
        aVar2.f28272a.mo58990a("currency", this.userCurrency.mo21246a());
    }

    public int getFragmentTitle() {
        return R.string.prefs_set_currency_title;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "view_locale_preferences";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adapter = new CurrencyAdapter(getActivity(), new C3653e7(this, 5), this.appCurrency);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = this.recyclerView;
        Context context = onCreateView.getContext();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
        recyclerView.setBackgroundResource(typedValue.resourceId);
        this.swipeRefreshLayout.setEnabled(false);
        this.emptyText.setText(getString(R.string.prefs_currency_empty));
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.mo19405d();
    }

    public void onLoadContent() {
        C8071s sVar;
        showLoadingView();
        C11520e eVar = this.currencyRepository;
        if (eVar.f25416b.f18980a.isEmpty()) {
            C8071s<List<EtsyCurrencyK>> a = eVar.f25415a.mo37617a();
            C8839l lVar = new C8839l(eVar, 3);
            a.getClass();
            sVar = new C19208j(new C19208j(a, lVar), new C3673f7(eVar, 4));
        } else {
            sVar = C8071s.m16251e(C19327t.m32655k1(eVar.f25416b.f18980a.values()));
        }
        this.compositeDisposable.mo19403b(C0391c.m1056b(this.schedulers, C0072d.m199f(this.schedulers, sVar)).mo20658g(new C6336c(this, 4), new C6487g(this, 8)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        loadContent();
    }
}
