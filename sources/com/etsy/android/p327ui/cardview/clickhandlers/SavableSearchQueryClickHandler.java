package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQueryType;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.search.savedsearch.C8984h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p040c9.C4579j1;
import p346fa.C12703a;
import p356ge.C12790b;
import p415of.C13171a;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.SavableSearchQueryClickHandler */
public final class SavableSearchQueryClickHandler extends C13171a<SavableSearchQuery> {

    /* renamed from: d */
    public final C8703p f20030d;

    /* renamed from: e */
    public C8984h f20031e;

    /* renamed from: f */
    public C12703a f20032f;

    /* renamed from: g */
    public C8629a f20033g;

    /* renamed from: h */
    public C13888d f20034h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavableSearchQueryClickHandler(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20030d = pVar;
        C4579j1 j1Var = (C4579j1) BOEApplication.getAppComponent();
        this.f20031e = j1Var.mo14410s();
        this.f20032f = (C12703a) j1Var.f10308s0.get();
        this.f20033g = j1Var.f10323v0.get();
        this.f20034h = j1Var.f10298q0.get();
    }

    /* renamed from: d */
    public final void mo31328c(SavableSearchQuery savableSearchQuery) {
        C19383o.m32797g(savableSearchQuery, "savableSearchQuery");
        Long valueOf = (savableSearchQuery.getSavedSearchId() > 0 ? 1 : (savableSearchQuery.getSavedSearchId() == 0 ? 0 : -1)) >= 0 ? Long.valueOf(savableSearchQuery.getSavedSearchId()) : null;
        String query = savableSearchQuery.getQuery();
        SearchOptions.Companion companion = SearchOptions.Companion;
        Map<String, String> filters = savableSearchQuery.getFilters();
        C8694h a = LogCatKt.m17045a();
        companion.getClass();
        C12790b.m20430b(mo45889a(), new SearchContainerKey(C12790b.m20432d(mo45889a()), new SearchSpec(query, (Long) null, SearchOptions.Companion.m18949c(filters, a), valueOf, (String) null, false, savableSearchQuery.getType() == SavableSearchQueryType.RECENT, false, false, (Bundle) null, 946, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null, 12, (DefaultConstructorMarker) null));
        C8703p pVar = this.f20030d;
        pVar.mo21333d(this.f20030d.f19060b + "_tapped_savable_search_query", (Map<? extends AnalyticsProperty, Object>) null);
    }

    /* renamed from: e */
    public final void mo31330e(boolean z, SavableSearchQuery savableSearchQuery) {
        C19383o.m32797g(savableSearchQuery, "savableSearchQuery");
        boolean z2 = false;
        Map s0 = C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, "saved_searches"), new Pair(PredefinedAnalyticsProperty.QUERY, savableSearchQuery.getQuery()), new Pair(PlatformAnalyticsProperty.CONTEXT_NAME, this.f20030d.f19060b));
        if (z) {
            this.f20030d.mo21333d("delete_saved_search", s0);
        } else {
            this.f20030d.mo21333d("create_saved_search", s0);
        }
        if (z) {
            if (savableSearchQuery.getSavedSearchId() >= 0) {
                z2 = true;
            }
            if (!z2) {
                C12703a aVar = this.f20032f;
                if (aVar != null) {
                    aVar.mo45475b("saved_search.delete_without_id", 0.1d);
                } else {
                    C19383o.m32805o("grafana");
                    throw null;
                }
            } else {
                Fragment a = mo45889a();
                if (a != null) {
                    C8984h hVar = this.f20031e;
                    if (hVar != null) {
                        long savedSearchId = savableSearchQuery.getSavedSearchId();
                        FragmentActivity requireActivity = a.requireActivity();
                        C19383o.m32796f(requireActivity, "fragment.requireActivity()");
                        hVar.mo30633a(savedSearchId, requireActivity);
                        return;
                    }
                    C19383o.m32805o("savedSearchViewDelegate");
                    throw null;
                }
            }
        } else {
            Fragment a2 = mo45889a();
            if (a2 != null) {
                C8984h hVar2 = this.f20031e;
                if (hVar2 != null) {
                    String query = savableSearchQuery.getQuery();
                    Map<String, String> filters = savableSearchQuery.getFilters();
                    SearchOptions.Companion companion = SearchOptions.Companion;
                    C8694h a3 = LogCatKt.m17045a();
                    companion.getClass();
                    SearchOptions c = SearchOptions.Companion.m18949c(filters, a3);
                    LinkedHashMap A0 = C19294b0.m32558A0(filters);
                    Pair<String, String> sortOrderParams = c.getSortOrderParams();
                    A0.put("sort_on", sortOrderParams.component1());
                    A0.put(ResponseConstants.SORT_ORDER, sortOrderParams.component2());
                    C8629a aVar2 = this.f20033g;
                    if (aVar2 != null) {
                        A0.put("currency", aVar2.mo21246a());
                        if (!c.hasShipsToCountry()) {
                            C13888d dVar = this.f20034h;
                            if (dVar != null) {
                                String country = dVar.mo46719c().getCountry();
                                C19383o.m32796f(country, "currentLocal.getSystemLocale().country");
                                A0.put("ship_to", country);
                            } else {
                                C19383o.m32805o("currentLocal");
                                throw null;
                            }
                        }
                        FragmentActivity requireActivity2 = a2.requireActivity();
                        C19383o.m32796f(requireActivity2, "fragment.requireActivity()");
                        hVar2.mo30634b(query, A0, requireActivity2, (List) null, (Integer) null, new SavableSearchQueryClickHandler$onSaveClick$2$1(savableSearchQuery));
                        return;
                    }
                    C19383o.m32805o("appCurrency");
                    throw null;
                }
                C19383o.m32805o("savedSearchViewDelegate");
                throw null;
            }
        }
    }
}
