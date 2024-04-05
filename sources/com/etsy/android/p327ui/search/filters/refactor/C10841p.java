package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.filters.refactor.p */
public final class C10841p {

    /* renamed from: a */
    public final boolean f24004a;

    /* renamed from: b */
    public final boolean f24005b;

    /* renamed from: c */
    public final List<ShippingFilter> f24006c;

    /* renamed from: d */
    public final boolean f24007d;

    /* renamed from: e */
    public final boolean f24008e;

    /* renamed from: f */
    public final boolean f24009f;

    /* renamed from: g */
    public final boolean f24010g;

    /* renamed from: h */
    public final String f24011h;

    /* renamed from: i */
    public final BigDecimal f24012i;

    /* renamed from: j */
    public final BigDecimal f24013j;

    /* renamed from: k */
    public final String f24014k;

    /* renamed from: l */
    public final SortOrder f24015l;

    /* renamed from: m */
    public final SearchOptions.MarketPlace f24016m;

    /* renamed from: n */
    public final Map<String, List<String>> f24017n;

    /* renamed from: o */
    public final String f24018o;

    /* renamed from: p */
    public final String f24019p;

    /* renamed from: q */
    public final String f24020q;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.p$a */
    public /* synthetic */ class C10842a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24021a;

        static {
            int[] iArr = new int[SortOrder.values().length];
            iArr[SortOrder.MOST_RECENT.ordinal()] = 1;
            iArr[SortOrder.RELEVANCY.ordinal()] = 2;
            iArr[SortOrder.HIGHEST_PRICE.ordinal()] = 3;
            iArr[SortOrder.LOWEST_PRICE.ordinal()] = 4;
            f24021a = iArr;
        }
    }

    public C10841p() {
        this(false, false, (List) null, false, false, false, (String) null, (BigDecimal) null, (BigDecimal) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (Map) null, (String) null, (String) null, (String) null, 131071);
    }

    public C10841p(boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, SortOrder sortOrder, SearchOptions.MarketPlace marketPlace, Map map, String str3, String str4, String str5, int i) {
        SortOrder sortOrder2;
        String str6;
        String str7;
        int i2 = i;
        boolean z6 = false;
        boolean z7 = (i2 & 1) != 0 ? false : z;
        boolean z8 = (i2 & 2) != 0 ? false : z2;
        List list2 = (i2 & 4) != 0 ? EmptyList.INSTANCE : list;
        boolean z9 = (i2 & 8) != 0 ? false : z3;
        boolean z10 = (i2 & 16) != 0 ? false : z4;
        boolean z11 = (i2 & 32) != 0 ? false : z5;
        z6 = (i2 & 64) != 0 ? true : z6;
        String str8 = (i2 & 128) != 0 ? null : str;
        BigDecimal bigDecimal3 = (i2 & 256) != 0 ? null : bigDecimal;
        BigDecimal bigDecimal4 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : bigDecimal2;
        String str9 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : str2;
        if ((i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0) {
            SortOrder.Companion.getClass();
            sortOrder2 = SortOrder.DEFAULT;
        } else {
            sortOrder2 = sortOrder;
        }
        SearchOptions.MarketPlace marketPlace2 = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS : marketPlace;
        Map p0 = (i2 & 8192) != 0 ? C19294b0.m32559p0() : map;
        String str10 = str9;
        String str11 = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? null : str3;
        if ((i2 & 32768) != 0) {
            str6 = str11;
            str7 = "";
        } else {
            str6 = str11;
            str7 = str4;
        }
        String str12 = (i2 & 65536) != 0 ? "" : str5;
        C19383o.m32797g(list2, "shippingFilters");
        C19383o.m32797g(sortOrder2, "sortedBy");
        C19383o.m32797g(marketPlace2, "marketPlace");
        C19383o.m32797g(p0, "selectedDynamicFilters");
        C19383o.m32797g(str7, "percentDiscountMin");
        C19383o.m32797g(str12, "percentDiscountMax");
        this.f24004a = z7;
        this.f24005b = z8;
        this.f24006c = list2;
        this.f24007d = z9;
        this.f24008e = z10;
        this.f24009f = z11;
        this.f24010g = z6;
        this.f24011h = str8;
        this.f24012i = bigDecimal3;
        this.f24013j = bigDecimal4;
        this.f24014k = str10;
        this.f24015l = sortOrder2;
        this.f24016m = marketPlace2;
        this.f24017n = p0;
        this.f24018o = str6;
        this.f24019p = str7;
        this.f24020q = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10841p)) {
            return false;
        }
        C10841p pVar = (C10841p) obj;
        return this.f24004a == pVar.f24004a && this.f24005b == pVar.f24005b && C19383o.m32792b(this.f24006c, pVar.f24006c) && this.f24007d == pVar.f24007d && this.f24008e == pVar.f24008e && this.f24009f == pVar.f24009f && this.f24010g == pVar.f24010g && C19383o.m32792b(this.f24011h, pVar.f24011h) && C19383o.m32792b(this.f24012i, pVar.f24012i) && C19383o.m32792b(this.f24013j, pVar.f24013j) && C19383o.m32792b(this.f24014k, pVar.f24014k) && this.f24015l == pVar.f24015l && this.f24016m == pVar.f24016m && C19383o.m32792b(this.f24017n, pVar.f24017n) && C19383o.m32792b(this.f24018o, pVar.f24018o) && C19383o.m32792b(this.f24019p, pVar.f24019p) && C19383o.m32792b(this.f24020q, pVar.f24020q);
    }

    public final int hashCode() {
        boolean z = this.f24004a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f24005b;
        if (z3) {
            z3 = true;
        }
        int g = C13983i.m21488g(this.f24006c, (i + (z3 ? 1 : 0)) * 31, 31);
        boolean z4 = this.f24007d;
        if (z4) {
            z4 = true;
        }
        int i2 = (g + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f24008e;
        if (z5) {
            z5 = true;
        }
        int i3 = (i2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f24009f;
        if (z6) {
            z6 = true;
        }
        int i4 = (i3 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f24010g;
        if (!z7) {
            z2 = z7;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str = this.f24011h;
        int i6 = 0;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f24012i;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f24013j;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f24014k;
        int hashCode4 = (this.f24017n.hashCode() + ((this.f24016m.hashCode() + ((this.f24015l.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str3 = this.f24018o;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return this.f24020q.hashCode() + C0023f.m105e(this.f24019p, (hashCode4 + i6) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersSelectedSpec(onSale=");
        h.append(this.f24004a);
        h.append(", freeShipping=");
        h.append(this.f24005b);
        h.append(", shippingFilters=");
        h.append(this.f24006c);
        h.append(", acceptsGiftCards=");
        h.append(this.f24007d);
        h.append(", customizable=");
        h.append(this.f24008e);
        h.append(", giftWrap=");
        h.append(this.f24009f);
        h.append(", withDeepFacets=");
        h.append(this.f24010g);
        h.append(", shopLocation=");
        h.append(this.f24011h);
        h.append(", minPrice=");
        h.append(this.f24012i);
        h.append(", maxPrice=");
        h.append(this.f24013j);
        h.append(", shipsToCountryCode=");
        h.append(this.f24014k);
        h.append(", sortedBy=");
        h.append(this.f24015l);
        h.append(", marketPlace=");
        h.append(this.f24016m);
        h.append(", selectedDynamicFilters=");
        h.append(this.f24017n);
        h.append(", selectedCategoryId=");
        h.append(this.f24018o);
        h.append(", percentDiscountMin=");
        h.append(this.f24019p);
        h.append(", percentDiscountMax=");
        return C0391c.m1057c(h, this.f24020q, ')');
    }
}
