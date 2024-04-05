package com.etsy.android.p327ui.sdl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.etsy.android.p327ui.sdl.C10716b;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p415of.C13173c;
import p415of.C13182k;
import p439rf.C13364c;
import p440s9.C13366a;
import p456ua.C13461f;
import p472wb.C13799a;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.sdl.SdlModalFragment */
public final class SdlModalFragment extends TrackingBottomSheetDialogFragment implements C13366a {
    public static final int $stable = 8;
    public static final C10712a Companion = new C10712a();
    private static final int INVALID_KEY = 0;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    public C11780h favoriteRepository;
    public C12703a grafana;
    private Page modalContent;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    private C10716b sdlViewDelegate;
    public C10716b.C10718b sdlViewDelegateFactory;
    public C10865h seasrchUriParser;
    public TransactionViewModel<Object> transactionViewModel;

    /* renamed from: com.etsy.android.ui.sdl.SdlModalFragment$a */
    public static final class C10712a {
    }

    private final void logMissingData() {
        getGrafana().mo45475b("collections.SdlModalFragment.error.missing_data", 1.0d);
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

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final C13851a getDeepLinkEntityChecker() {
        C13851a aVar = this.deepLinkEntityChecker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEntityChecker");
        throw null;
    }

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
        throw null;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C12741o getRouteInspector() {
        C12741o oVar = this.routeInspector;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("routeInspector");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C10716b.C10718b getSdlViewDelegateFactory() {
        C10716b.C10718b bVar = this.sdlViewDelegateFactory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("sdlViewDelegateFactory");
        throw null;
    }

    public final C10865h getSeasrchUriParser() {
        C10865h hVar = this.seasrchUriParser;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("seasrchUriParser");
        throw null;
    }

    public String getTrackingName() {
        return "sdl_modal";
    }

    public final TransactionViewModel<Object> getTransactionViewModel() {
        TransactionViewModel<Object> transactionViewModel2 = this.transactionViewModel;
        if (transactionViewModel2 != null) {
            return transactionViewModel2;
        }
        C19383o.m32805o("transactionViewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Integer num = null;
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("transaction-data", 0)) : null;
        if (valueOf == null) {
            if (bundle != null) {
                num = Integer.valueOf(bundle.getInt("transaction-data", 0));
            }
            valueOf = num;
        }
        if (valueOf == null || valueOf.intValue() == 0) {
            logMissingData();
            dismiss();
            return;
        }
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        Page page = (Page) TransactionDataRepository.C11867a.m19552a().mo38342a(valueOf.intValue());
        if (page != null) {
            this.modalContent = page;
            return;
        }
        logMissingData();
        dismiss();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        Bundle bundle2 = bundle;
        C19383o.m32797g(layoutInflater2, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater2.inflate(R.layout.fragment_sdl_modal, viewGroup, false);
        if (getActivity() != null) {
            C10716b.C10718b sdlViewDelegateFactory2 = getSdlViewDelegateFactory();
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32794d(analyticsContext);
            View findViewById = inflate.findViewById(R.id.content);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.content)");
            this.sdlViewDelegate = sdlViewDelegateFactory2.mo35631a(this, analyticsContext, (RecyclerView) findViewById, getFavoriteRepository(), getRxSchedulers(), (C10715a) null, (WeakReference<Queue<View>>) null);
            int dimensionPixelSize = requireActivity().getResources().getDimensionPixelSize(R.dimen.clg_space_8);
            C10716b bVar = this.sdlViewDelegate;
            if (bVar != null) {
                C13173c cVar = bVar.f23634b;
                C8703p analyticsContext2 = getAnalyticsContext();
                C8703p pVar = analyticsContext2;
                C19383o.m32794d(analyticsContext2);
                C11780h favoriteRepository2 = getFavoriteRepository();
                ListingCardViewHolderOptions.C11971e eVar = r0;
                C8703p analyticsContext3 = getAnalyticsContext();
                C19383o.m32794d(analyticsContext3);
                C8623e eVar2 = analyticsContext3.f19116n;
                C19383o.m32796f(eVar2, "analyticsContext!!.configMap");
                ListingCardViewHolderOptions.C11971e eVar3 = new ListingCardViewHolderOptions.C11971e(dimensionPixelSize, eVar2);
                C13799a aVar = r0;
                View view = inflate;
                int i = dimensionPixelSize;
                C13799a aVar2 = new C13799a(this, cVar, pVar, favoriteRepository2, getRxSchedulers(), getAdImpressionRepository(), getDeepLinkEligibility(), getRouteInspector(), getDeepLinkEntityChecker(), getSeasrchUriParser(), (C13182k) null, eVar, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 62464);
                SdlModalFragment$onCreateView$viewHolderFactory$1 sdlModalFragment$onCreateView$viewHolderFactory$1 = new SdlModalFragment$onCreateView$viewHolderFactory$1(this, i, aVar);
                C10716b bVar2 = this.sdlViewDelegate;
                if (bVar2 != null) {
                    bVar2.f23634b.f28991c.mo45890a(sdlModalFragment$onCreateView$viewHolderFactory$1);
                    Bundle bundle3 = bundle;
                    if (bundle3 == null) {
                        C10716b bVar3 = this.sdlViewDelegate;
                        if (bVar3 != null) {
                            Page page = this.modalContent;
                            if (page != null) {
                                bVar3.mo35630a(page.getList());
                                return view;
                            }
                            C19383o.m32805o("modalContent");
                            throw null;
                        }
                        C19383o.m32805o("sdlViewDelegate");
                        throw null;
                    }
                    C10716b bVar4 = this.sdlViewDelegate;
                    if (bVar4 != null) {
                        int i2 = bundle3.getInt("SDL_VIEW_DELEGATE_SAVED_ITEMS");
                        C19285c<TransactionDataRepository> cVar2 = TransactionDataRepository.f26402b;
                        bVar4.f23634b.mo31809n((C11869a) TransactionDataRepository.C11867a.m19552a().mo38342a(i2));
                        C13364c cVar3 = bVar4.f23635c;
                        cVar3.getClass();
                        cVar3.f29294a = bundle3.getInt("lastHeaderPos");
                        cVar3.f29295b = bundle3.getBoolean("scrolledToEnd");
                        return view;
                    }
                    C19383o.m32805o("sdlViewDelegate");
                    throw null;
                }
                C19383o.m32805o("sdlViewDelegate");
                throw null;
            }
            C19383o.m32805o("sdlViewDelegate");
            throw null;
        }
        return inflate;
    }

    public void onPause() {
        dismiss();
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        C10716b bVar = this.sdlViewDelegate;
        if (bVar != null) {
            C11869a aVar = new C11869a();
            bVar.f23634b.mo31810o(aVar);
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            bundle.putInt("SDL_VIEW_DELEGATE_SAVED_ITEMS", TransactionDataRepository.C11867a.m19552a().mo38343b(aVar));
            C13364c cVar2 = bVar.f23635c;
            bundle.putInt("lastHeaderPos", cVar2.f29294a);
            bundle.putBoolean("scrolledToEnd", cVar2.f29295b);
            TransactionDataRepository a = TransactionDataRepository.C11867a.m19552a();
            Page page = this.modalContent;
            if (page != null) {
                bundle.putInt("transaction-data", a.mo38343b(page));
                super.onSaveInstanceState(bundle);
                return;
            }
            C19383o.m32805o("modalContent");
            throw null;
        }
        C19383o.m32805o("sdlViewDelegate");
        throw null;
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSdlViewDelegateFactory(C10716b.C10718b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.sdlViewDelegateFactory = bVar;
    }

    public final void setSeasrchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.seasrchUriParser = hVar;
    }

    public final void setTransactionViewModel(TransactionViewModel<Object> transactionViewModel2) {
        C19383o.m32797g(transactionViewModel2, "<set-?>");
        this.transactionViewModel = transactionViewModel2;
    }
}
