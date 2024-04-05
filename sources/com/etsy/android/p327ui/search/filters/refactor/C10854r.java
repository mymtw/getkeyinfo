package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.C10841p;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.SearchOptionsParams;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p391le.C13016a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.filters.refactor.r */
public final class C10854r {

    /* renamed from: a */
    public final C10841p f24052a;

    /* renamed from: b */
    public final String f24053b;

    /* renamed from: c */
    public final boolean f24054c = true;

    /* renamed from: d */
    public final boolean f24055d = false;

    /* renamed from: e */
    public final String f24056e = null;

    /* renamed from: f */
    public final int f24057f = 48;

    public C10854r(C10841p pVar, String str) {
        this.f24052a = pVar;
        this.f24053b = str;
    }

    /* renamed from: a */
    public final LinkedHashMap mo36021a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("keywords", this.f24053b);
        linkedHashMap.put("limit", String.valueOf(this.f24057f));
        linkedHashMap.put("exclude_listings", String.valueOf(this.f24054c ? 1 : 0));
        linkedHashMap.put("include_additional_listing_images", String.valueOf(this.f24055d));
        C10841p pVar = this.f24052a;
        pVar.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("is_discounted", String.valueOf(pVar.f24004a ? 1 : 0));
        linkedHashMap2.put("free_shipping", String.valueOf(pVar.f24005b ? 1 : 0));
        linkedHashMap2.put("max_processing_days", C19327t.m32644Z0(pVar.f24006c, ",", (String) null, (String) null, SearchFiltersSelectedSpec$toMap$1.INSTANCE, 30));
        linkedHashMap2.put("accepts_gift_cards", String.valueOf(pVar.f24007d ? 1 : 0));
        linkedHashMap2.put("customizable", String.valueOf(pVar.f24008e ? 1 : 0));
        linkedHashMap2.put("gift_wrap", String.valueOf(pVar.f24009f ? 1 : 0));
        linkedHashMap2.put("with_deep_facets", String.valueOf(pVar.f24010g ? 1 : 0));
        BigDecimal bigDecimal = pVar.f24012i;
        String bigDecimal2 = ((bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) ? BigDecimal.ZERO : pVar.f24012i).toString();
        C19383o.m32796f(bigDecimal2, "formattedMinPrice.toString()");
        linkedHashMap2.put(ResponseConstants.MIN_PRICE, bigDecimal2);
        BigDecimal bigDecimal3 = pVar.f24013j;
        if (bigDecimal3 != null) {
            String bigDecimal4 = bigDecimal3.toString();
            C19383o.m32796f(bigDecimal4, "maxPrice.toString()");
            linkedHashMap2.put(ResponseConstants.MAX_PRICE, bigDecimal4);
        }
        if (C18263b.m30839d0(pVar.f24014k)) {
            linkedHashMap2.put("ship_to", pVar.f24014k);
        }
        SearchOptions.MarketPlace marketPlace = pVar.f24016m;
        if (marketPlace != SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS) {
            linkedHashMap2.put("marketplace", marketPlace.getHttpParamValue());
        }
        if (C18263b.m30839d0(pVar.f24011h)) {
            linkedHashMap2.put("location", pVar.f24011h);
        }
        boolean z = true;
        if (!pVar.f24017n.isEmpty()) {
            linkedHashMap2.put("attribute_values", C13016a.C13017a.m20733a(pVar.f24017n));
        }
        int i = C10841p.C10842a.f24021a[pVar.f24015l.ordinal()];
        if (i == 1) {
            str = "created";
        } else if (i == 2) {
            str = "score";
        } else if (i == 3 || i == 4) {
            str = ResponseConstants.PRICE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        linkedHashMap2.put("sort_on", str);
        linkedHashMap2.put(ResponseConstants.SORT_ORDER, pVar.f24015l == SortOrder.LOWEST_PRICE ? "up" : "down");
        if (C18263b.m30839d0(pVar.f24018o)) {
            linkedHashMap2.put(ResponseConstants.CATEGORY, pVar.f24018o);
        }
        linkedHashMap2.put("with_static_filters", "true");
        if (pVar.f24019p.length() > 0) {
            linkedHashMap2.put(SearchOptionsParams.PCT_DISCOUNT_MIN.getSearchParam(), pVar.f24019p);
            if (pVar.f24020q.length() <= 0) {
                z = false;
            }
            if (z && C19383o.m32792b(pVar.f24019p, pVar.f24020q)) {
                linkedHashMap2.put(SearchOptionsParams.PCT_DISCOUNT_MAX.getSearchParam(), pVar.f24020q);
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        if (C18263b.m30839d0(this.f24056e)) {
            linkedHashMap.put("currency", this.f24056e);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10854r)) {
            return false;
        }
        C10854r rVar = (C10854r) obj;
        return C19383o.m32792b(this.f24052a, rVar.f24052a) && C19383o.m32792b(this.f24053b, rVar.f24053b) && this.f24054c == rVar.f24054c && this.f24055d == rVar.f24055d && C19383o.m32792b(this.f24056e, rVar.f24056e) && this.f24057f == rVar.f24057f;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f24053b, this.f24052a.hashCode() * 31, 31);
        boolean z = this.f24054c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.f24055d;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.f24056e;
        return Integer.hashCode(this.f24057f) + ((i2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersSpec(searchFiltersSelectedSpec=");
        h.append(this.f24052a);
        h.append(", query=");
        h.append(this.f24053b);
        h.append(", excludeListings=");
        h.append(this.f24054c);
        h.append(", includeAdditionalListingImages=");
        h.append(this.f24055d);
        h.append(", currencyCode=");
        h.append(this.f24056e);
        h.append(", limit=");
        return C0073e.m208h(h, this.f24057f, ')');
    }
}
