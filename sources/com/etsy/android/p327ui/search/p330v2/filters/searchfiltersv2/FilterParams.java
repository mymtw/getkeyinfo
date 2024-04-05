package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterParams */
public final class FilterParams implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilterParams> CREATOR = new Creator();
    private final List<FacetCount> categoryFacets;
    private final List<AttributeFacet> dynamicFacets;
    private final SearchFiltersRequest filtersRequest;
    private final List<Integer> priceBuckets;
    private final String query;
    private final int resultCount;
    private final SearchOptions searchOptions;
    private final StaticFilters staticFilters;

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterParams$Creator */
    public static final class Creator implements Parcelable.Creator<FilterParams> {
        public final FilterParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList2.add(parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList3.add(parcel.readSerializable());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new FilterParams(readString, arrayList2, arrayList3, arrayList, (StaticFilters) parcel.readSerializable(), SearchOptions.CREATOR.createFromParcel(parcel), SearchFiltersRequest.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        public final FilterParams[] newArray(int i) {
            return new FilterParams[i];
        }
    }

    public FilterParams() {
        this((String) null, (List) null, (List) null, (List) null, (StaticFilters) null, (SearchOptions) null, (SearchFiltersRequest) null, 0, 255, (DefaultConstructorMarker) null);
    }

    public FilterParams(String str, List<AttributeFacet> list, List<? extends FacetCount> list2, List<Integer> list3, StaticFilters staticFilters2, SearchOptions searchOptions2, SearchFiltersRequest searchFiltersRequest, int i) {
        C19383o.m32797g(str, "query");
        C19383o.m32797g(list, "dynamicFacets");
        C19383o.m32797g(list2, "categoryFacets");
        C19383o.m32797g(searchOptions2, "searchOptions");
        C19383o.m32797g(searchFiltersRequest, "filtersRequest");
        this.query = str;
        this.dynamicFacets = list;
        this.categoryFacets = list2;
        this.priceBuckets = list3;
        this.staticFilters = staticFilters2;
        this.searchOptions = searchOptions2;
        this.filtersRequest = searchFiltersRequest;
        this.resultCount = i;
    }

    public static /* synthetic */ FilterParams copy$default(FilterParams filterParams, String str, List list, List list2, List list3, StaticFilters staticFilters2, SearchOptions searchOptions2, SearchFiltersRequest searchFiltersRequest, int i, int i2, Object obj) {
        FilterParams filterParams2 = filterParams;
        int i3 = i2;
        return filterParams.copy((i3 & 1) != 0 ? filterParams2.query : str, (i3 & 2) != 0 ? filterParams2.dynamicFacets : list, (i3 & 4) != 0 ? filterParams2.categoryFacets : list2, (i3 & 8) != 0 ? filterParams2.priceBuckets : list3, (i3 & 16) != 0 ? filterParams2.staticFilters : staticFilters2, (i3 & 32) != 0 ? filterParams2.searchOptions : searchOptions2, (i3 & 64) != 0 ? filterParams2.filtersRequest : searchFiltersRequest, (i3 & 128) != 0 ? filterParams2.resultCount : i);
    }

    public final String component1() {
        return this.query;
    }

    public final List<AttributeFacet> component2() {
        return this.dynamicFacets;
    }

    public final List<FacetCount> component3() {
        return this.categoryFacets;
    }

    public final List<Integer> component4() {
        return this.priceBuckets;
    }

    public final StaticFilters component5() {
        return this.staticFilters;
    }

    public final SearchOptions component6() {
        return this.searchOptions;
    }

    public final SearchFiltersRequest component7() {
        return this.filtersRequest;
    }

    public final int component8() {
        return this.resultCount;
    }

    public final FilterParams copy(String str, List<AttributeFacet> list, List<? extends FacetCount> list2, List<Integer> list3, StaticFilters staticFilters2, SearchOptions searchOptions2, SearchFiltersRequest searchFiltersRequest, int i) {
        C19383o.m32797g(str, "query");
        C19383o.m32797g(list, "dynamicFacets");
        C19383o.m32797g(list2, "categoryFacets");
        SearchOptions searchOptions3 = searchOptions2;
        C19383o.m32797g(searchOptions3, "searchOptions");
        SearchFiltersRequest searchFiltersRequest2 = searchFiltersRequest;
        C19383o.m32797g(searchFiltersRequest2, "filtersRequest");
        return new FilterParams(str, list, list2, list3, staticFilters2, searchOptions3, searchFiltersRequest2, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterParams)) {
            return false;
        }
        FilterParams filterParams = (FilterParams) obj;
        return C19383o.m32792b(this.query, filterParams.query) && C19383o.m32792b(this.dynamicFacets, filterParams.dynamicFacets) && C19383o.m32792b(this.categoryFacets, filterParams.categoryFacets) && C19383o.m32792b(this.priceBuckets, filterParams.priceBuckets) && C19383o.m32792b(this.staticFilters, filterParams.staticFilters) && C19383o.m32792b(this.searchOptions, filterParams.searchOptions) && C19383o.m32792b(this.filtersRequest, filterParams.filtersRequest) && this.resultCount == filterParams.resultCount;
    }

    public final List<FacetCount> getCategoryFacets() {
        return this.categoryFacets;
    }

    public final List<AttributeFacet> getDynamicFacets() {
        return this.dynamicFacets;
    }

    public final SearchFiltersRequest getFiltersRequest() {
        return this.filtersRequest;
    }

    public final List<Integer> getPriceBuckets() {
        return this.priceBuckets;
    }

    public final String getQuery() {
        return this.query;
    }

    public final int getResultCount() {
        return this.resultCount;
    }

    public final SearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    public final StaticFilters getStaticFilters() {
        return this.staticFilters;
    }

    public int hashCode() {
        int g = C13983i.m21488g(this.categoryFacets, C13983i.m21488g(this.dynamicFacets, this.query.hashCode() * 31, 31), 31);
        List<Integer> list = this.priceBuckets;
        int i = 0;
        int hashCode = (g + (list == null ? 0 : list.hashCode())) * 31;
        StaticFilters staticFilters2 = this.staticFilters;
        if (staticFilters2 != null) {
            i = staticFilters2.hashCode();
        }
        int hashCode2 = this.searchOptions.hashCode();
        return Integer.hashCode(this.resultCount) + ((this.filtersRequest.hashCode() + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FilterParams(query=");
        h.append(this.query);
        h.append(", dynamicFacets=");
        h.append(this.dynamicFacets);
        h.append(", categoryFacets=");
        h.append(this.categoryFacets);
        h.append(", priceBuckets=");
        h.append(this.priceBuckets);
        h.append(", staticFilters=");
        h.append(this.staticFilters);
        h.append(", searchOptions=");
        h.append(this.searchOptions);
        h.append(", filtersRequest=");
        h.append(this.filtersRequest);
        h.append(", resultCount=");
        return C0073e.m208h(h, this.resultCount, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.query);
        List<AttributeFacet> list = this.dynamicFacets;
        parcel.writeInt(list.size());
        for (AttributeFacet writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
        List<FacetCount> list2 = this.categoryFacets;
        parcel.writeInt(list2.size());
        for (FacetCount writeSerializable2 : list2) {
            parcel.writeSerializable(writeSerializable2);
        }
        List<Integer> list3 = this.priceBuckets;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Integer intValue : list3) {
                parcel.writeInt(intValue.intValue());
            }
        }
        parcel.writeSerializable(this.staticFilters);
        this.searchOptions.writeToParcel(parcel, i);
        this.filtersRequest.writeToParcel(parcel, i);
        parcel.writeInt(this.resultCount);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FilterParams(java.lang.String r39, java.util.List r40, java.util.List r41, java.util.List r42, com.etsy.android.lib.models.apiv3.filters.StaticFilters r43, com.etsy.android.p327ui.search.p330v2.SearchOptions r44, com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest r45, int r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r38 = this;
            r0 = r47
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r39
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0012
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x0014
        L_0x0012:
            r2 = r40
        L_0x0014:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001b
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x001d
        L_0x001b:
            r3 = r41
        L_0x001d:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0024
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x0026
        L_0x0024:
            r4 = r42
        L_0x0026:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002c
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = r43
        L_0x002e:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x006e
            com.etsy.android.ui.search.v2.SearchOptions r6 = new com.etsy.android.ui.search.v2.SearchOptions
            r7 = r6
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 268435455(0xfffffff, float:2.5243547E-29)
            r37 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0070
        L_0x006e:
            r6 = r44
        L_0x0070:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0086
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest r7 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 127(0x7f, float:1.78E-43)
            r17 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0088
        L_0x0086:
            r7 = r45
        L_0x0088:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r46
        L_0x0090:
            r39 = r38
            r40 = r1
            r41 = r2
            r42 = r3
            r43 = r4
            r44 = r5
            r45 = r6
            r46 = r7
            r47 = r0
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, com.etsy.android.lib.models.apiv3.filters.StaticFilters, com.etsy.android.ui.search.v2.SearchOptions, com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
