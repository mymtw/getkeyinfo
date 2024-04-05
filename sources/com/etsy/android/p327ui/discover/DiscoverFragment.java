package com.etsy.android.p327ui.discover;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.lib.models.homescreen.RelatedTagLink;
import com.etsy.android.p327ui.cardview.CardRecyclerViewBaseFragment;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p357gf.C12796e;
import p415of.C13173c;
import p445sf.C13379a;
import p445sf.C13382d;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.discover.DiscoverFragment */
public final class DiscoverFragment extends CardRecyclerViewBaseFragment {
    public static final int $stable = 8;
    public static final C9729a Companion = new C9729a();
    private static final String METRIC_MISSING_DATA = "discover.DiscoverFragment.error.missing_data";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private LandingPageInfo _landingPageInfo;
    public C11780h favoriteRepository;
    public C12703a grafana;
    private final C13382d pagination = new C13382d();
    public C13461f rxSchedulers;

    /* renamed from: com.etsy.android.ui.discover.DiscoverFragment$a */
    public static final class C9729a {
    }

    private final LandingPageInfo getLandingPageInfo() {
        if (this._landingPageInfo == null) {
            this._landingPageInfo = (LandingPageInfo) C18263b.m30829X(this, new RelatedTagLink()).f26405b;
        }
        return this._landingPageInfo;
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getApiPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getApiUrl() {
        /*
            r1 = this;
            com.etsy.android.lib.models.homescreen.LandingPageInfo r0 = r1.getLandingPageInfo()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.getApiPath()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.discover.DiscoverFragment.getApiUrl():java.lang.String");
    }

    public C13801b getCardViewHolderFactory() {
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.clg_space_4);
        ListingCardViewHolderOptions.C11971e eVar = r2;
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        ListingCardViewHolderOptions.C11971e eVar2 = new ListingCardViewHolderOptions.C11971e(dimensionPixelSize, configMap);
        C13173c adapter = getAdapter();
        C8703p analyticsContext = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C13799a aVar = r0;
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, eVar, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440);
        return new C13801b(aVar);
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

    /* renamed from: getPagination  reason: collision with other method in class */
    public final C13382d m34968getPagination() {
        return this.pagination;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public String getTrackingName() {
        String eventName;
        LandingPageInfo landingPageInfo = getLandingPageInfo();
        if (landingPageInfo != null && (eventName = landingPageInfo.getEventName()) != null) {
            return eventName;
        }
        String trackingName = super.getTrackingName();
        C19383o.m32796f(trackingName, "super.getTrackingName()");
        return trackingName;
    }

    public void onStart() {
        String str;
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LandingPageInfo landingPageInfo = getLandingPageInfo();
            if (landingPageInfo == null || (str = landingPageInfo.getPageTitle()) == null) {
                str = "";
            }
            activity.setTitle(str);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        LandingPageInfo landingPageInfo = getLandingPageInfo();
        if (!C18263b.m30839d0(landingPageInfo != null ? landingPageInfo.getApiPath() : null)) {
            getGrafana().mo45475b(METRIC_MISSING_DATA, 1.0d);
            C12788a.m20426e(getActivity());
        }
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public C13379a getPagination() {
        return this.pagination;
    }
}
