package com.etsy.android.p327ui.search.listingresults;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.SearchBannerMessage;
import com.etsy.android.lib.models.apiv3.search.GuidedSearch;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.cardviewelement.SearchFilterHeader;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.search.listingresults.C10920j;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsState */
public final class SearchResultsListingsState {

    /* renamed from: a */
    public final List<C10909i> f24154a;

    /* renamed from: b */
    public final String f24155b;

    /* renamed from: c */
    public final String f24156c;

    /* renamed from: d */
    public final ListingCard f24157d;

    /* renamed from: e */
    public final GuidedSearch f24158e;

    /* renamed from: f */
    public final QueryCorrection f24159f;

    /* renamed from: g */
    public final List<SearchBannerMessage> f24160g;

    /* renamed from: h */
    public final Long f24161h;

    /* renamed from: i */
    public final boolean f24162i;

    /* renamed from: j */
    public final int f24163j;

    /* renamed from: k */
    public final int f24164k;

    /* renamed from: l */
    public final SearchFilterHeader f24165l;

    /* renamed from: m */
    public final List<IFormattedTaxonomyCategory> f24166m;

    /* renamed from: n */
    public final ViewMode f24167n;

    /* renamed from: o */
    public final boolean f24168o;

    /* renamed from: p */
    public final boolean f24169p;

    /* renamed from: q */
    public final View f24170q;

    /* renamed from: r */
    public final C10920j f24171r;

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsState$ViewMode */
    public enum ViewMode {
        TWO_BY_TWO,
        THREE_BY_THREE
    }

    public SearchResultsListingsState(List<? extends C10909i> list, String str, String str2, ListingCard listingCard, GuidedSearch guidedSearch, QueryCorrection queryCorrection, List<SearchBannerMessage> list2, Long l, boolean z, int i, int i2, SearchFilterHeader searchFilterHeader, List<IFormattedTaxonomyCategory> list3, ViewMode viewMode, boolean z2, boolean z3, View view, C10920j jVar) {
        ViewMode viewMode2 = viewMode;
        C10920j jVar2 = jVar;
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(str, "query");
        C19383o.m32797g(viewMode2, "selectedViewMode");
        C19383o.m32797g(jVar2, ResponseConstants.f19137UI);
        this.f24154a = list;
        this.f24155b = str;
        this.f24156c = str2;
        this.f24157d = listingCard;
        this.f24158e = guidedSearch;
        this.f24159f = queryCorrection;
        this.f24160g = list2;
        this.f24161h = l;
        this.f24162i = z;
        this.f24163j = i;
        this.f24164k = i2;
        this.f24165l = searchFilterHeader;
        this.f24166m = list3;
        this.f24167n = viewMode2;
        this.f24168o = z2;
        this.f24169p = z3;
        this.f24170q = view;
        this.f24171r = jVar2;
    }

    /* renamed from: b */
    public static SearchResultsListingsState m18908b(SearchResultsListingsState searchResultsListingsState, ArrayList arrayList, String str, String str2, ListingCard listingCard, GuidedSearch guidedSearch, QueryCorrection queryCorrection, List list, Long l, boolean z, int i, int i2, SearchFilterHeader searchFilterHeader, List list2, ViewMode viewMode, boolean z2, boolean z3, C10920j.C10921a aVar, int i3) {
        SearchResultsListingsState searchResultsListingsState2 = searchResultsListingsState;
        int i4 = i3;
        List<C10909i> list3 = (i4 & 1) != 0 ? searchResultsListingsState2.f24154a : arrayList;
        String str3 = (i4 & 2) != 0 ? searchResultsListingsState2.f24155b : str;
        String str4 = (i4 & 4) != 0 ? searchResultsListingsState2.f24156c : str2;
        ListingCard listingCard2 = (i4 & 8) != 0 ? searchResultsListingsState2.f24157d : listingCard;
        GuidedSearch guidedSearch2 = (i4 & 16) != 0 ? searchResultsListingsState2.f24158e : guidedSearch;
        QueryCorrection queryCorrection2 = (i4 & 32) != 0 ? searchResultsListingsState2.f24159f : queryCorrection;
        List list4 = (i4 & 64) != 0 ? searchResultsListingsState2.f24160g : list;
        Long l2 = (i4 & 128) != 0 ? searchResultsListingsState2.f24161h : l;
        boolean z4 = (i4 & 256) != 0 ? searchResultsListingsState2.f24162i : z;
        int i5 = (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? searchResultsListingsState2.f24163j : i;
        int i6 = (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? searchResultsListingsState2.f24164k : i2;
        SearchFilterHeader searchFilterHeader2 = (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? searchResultsListingsState2.f24165l : searchFilterHeader;
        List list5 = (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? searchResultsListingsState2.f24166m : list2;
        ViewMode viewMode2 = (i4 & 8192) != 0 ? searchResultsListingsState2.f24167n : viewMode;
        List list6 = list5;
        boolean z5 = (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? searchResultsListingsState2.f24168o : z2;
        boolean z6 = (i4 & 32768) != 0 ? searchResultsListingsState2.f24169p : z3;
        View view = (i4 & 65536) != 0 ? searchResultsListingsState2.f24170q : null;
        C10920j jVar = (i4 & 131072) != 0 ? searchResultsListingsState2.f24171r : aVar;
        searchResultsListingsState.getClass();
        C19383o.m32797g(list3, "sideEffects");
        C19383o.m32797g(str3, "query");
        C19383o.m32797g(viewMode2, "selectedViewMode");
        C19383o.m32797g(jVar, ResponseConstants.f19137UI);
        return new SearchResultsListingsState(list3, str3, str4, listingCard2, guidedSearch2, queryCorrection2, list4, l2, z4, i5, i6, searchFilterHeader2, list6, viewMode2, z5, z6, view, jVar);
    }

    /* renamed from: a */
    public final SearchResultsListingsState mo36191a(C10909i iVar) {
        return m18908b(this, C19327t.m32651g1(this.f24154a, iVar), (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, (ViewMode) null, false, false, (C10920j.C10921a) null, 262142);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultsListingsState)) {
            return false;
        }
        SearchResultsListingsState searchResultsListingsState = (SearchResultsListingsState) obj;
        return C19383o.m32792b(this.f24154a, searchResultsListingsState.f24154a) && C19383o.m32792b(this.f24155b, searchResultsListingsState.f24155b) && C19383o.m32792b(this.f24156c, searchResultsListingsState.f24156c) && C19383o.m32792b(this.f24157d, searchResultsListingsState.f24157d) && C19383o.m32792b(this.f24158e, searchResultsListingsState.f24158e) && C19383o.m32792b(this.f24159f, searchResultsListingsState.f24159f) && C19383o.m32792b(this.f24160g, searchResultsListingsState.f24160g) && C19383o.m32792b(this.f24161h, searchResultsListingsState.f24161h) && this.f24162i == searchResultsListingsState.f24162i && this.f24163j == searchResultsListingsState.f24163j && this.f24164k == searchResultsListingsState.f24164k && C19383o.m32792b(this.f24165l, searchResultsListingsState.f24165l) && C19383o.m32792b(this.f24166m, searchResultsListingsState.f24166m) && this.f24167n == searchResultsListingsState.f24167n && this.f24168o == searchResultsListingsState.f24168o && this.f24169p == searchResultsListingsState.f24169p && C19383o.m32792b(this.f24170q, searchResultsListingsState.f24170q) && C19383o.m32792b(this.f24171r, searchResultsListingsState.f24171r);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f24155b, this.f24154a.hashCode() * 31, 31);
        String str = this.f24156c;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        ListingCard listingCard = this.f24157d;
        int hashCode2 = (hashCode + (listingCard == null ? 0 : listingCard.hashCode())) * 31;
        GuidedSearch guidedSearch = this.f24158e;
        int hashCode3 = (hashCode2 + (guidedSearch == null ? 0 : guidedSearch.hashCode())) * 31;
        QueryCorrection queryCorrection = this.f24159f;
        int hashCode4 = (hashCode3 + (queryCorrection == null ? 0 : queryCorrection.hashCode())) * 31;
        List<SearchBannerMessage> list = this.f24160g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f24161h;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.f24162i;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a = C0069a.m170a(this.f24164k, C0069a.m170a(this.f24163j, (hashCode6 + (z ? 1 : 0)) * 31, 31), 31);
        SearchFilterHeader searchFilterHeader = this.f24165l;
        int hashCode7 = (a + (searchFilterHeader == null ? 0 : searchFilterHeader.hashCode())) * 31;
        List<IFormattedTaxonomyCategory> list2 = this.f24166m;
        int hashCode8 = (this.f24167n.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        boolean z3 = this.f24168o;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode8 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f24169p;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        View view = this.f24170q;
        if (view != null) {
            i = view.hashCode();
        }
        return this.f24171r.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchResultsListingsState(sideEffects=");
        h.append(this.f24154a);
        h.append(", query=");
        h.append(this.f24155b);
        h.append(", anchorListingId=");
        h.append(this.f24156c);
        h.append(", anchorListing=");
        h.append(this.f24157d);
        h.append(", guidedSearch=");
        h.append(this.f24158e);
        h.append(", queryCorrection=");
        h.append(this.f24159f);
        h.append(", bannerMessages=");
        h.append(this.f24160g);
        h.append(", savedSearchId=");
        h.append(this.f24161h);
        h.append(", includeFeaturedCategories=");
        h.append(this.f24162i);
        h.append(", totalResultsCount=");
        h.append(this.f24163j);
        h.append(", loadedResultsCount=");
        h.append(this.f24164k);
        h.append(", filterHeader=");
        h.append(this.f24165l);
        h.append(", relatedCategories=");
        h.append(this.f24166m);
        h.append(", selectedViewMode=");
        h.append(this.f24167n);
        h.append(", isRecentSearch=");
        h.append(this.f24168o);
        h.append(", newFilterApplied=");
        h.append(this.f24169p);
        h.append(", relatedCategoriesHeaderView=");
        h.append(this.f24170q);
        h.append(", ui=");
        h.append(this.f24171r);
        h.append(')');
        return h.toString();
    }
}
