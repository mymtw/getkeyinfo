package com.etsy.android.p327ui.navigation.specs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.navigation.specs.SearchSpec */
public final class SearchSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchSpec> CREATOR = new Creator();
    private final String anchorListingId;
    private final boolean includeFeaturedCategories;
    private final boolean isRecentSearch;
    private final String query;
    private final Bundle requestParams;
    private final Long savedSearchId;
    private final SearchOptions searchOptions;
    private final boolean searchWithNewFilters;
    private final Long taxonomyId;
    private final boolean topLevelCategories;

    /* renamed from: com.etsy.android.ui.navigation.specs.SearchSpec$Creator */
    public static final class Creator implements Parcelable.Creator<SearchSpec> {
        public final SearchSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchSpec(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : SearchOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readBundle());
        }

        public final SearchSpec[] newArray(int i) {
            return new SearchSpec[i];
        }
    }

    public SearchSpec() {
        this((String) null, (Long) null, (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1023, (DefaultConstructorMarker) null);
    }

    public SearchSpec(String str, Long l, SearchOptions searchOptions2, Long l2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Bundle bundle) {
        this.query = str;
        this.taxonomyId = l;
        this.searchOptions = searchOptions2;
        this.savedSearchId = l2;
        this.anchorListingId = str2;
        this.searchWithNewFilters = z;
        this.isRecentSearch = z2;
        this.includeFeaturedCategories = z3;
        this.topLevelCategories = z4;
        this.requestParams = bundle;
    }

    public static /* synthetic */ SearchSpec copy$default(SearchSpec searchSpec, String str, Long l, SearchOptions searchOptions2, Long l2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Bundle bundle, int i, Object obj) {
        SearchSpec searchSpec2 = searchSpec;
        int i2 = i;
        return searchSpec.copy((i2 & 1) != 0 ? searchSpec2.query : str, (i2 & 2) != 0 ? searchSpec2.taxonomyId : l, (i2 & 4) != 0 ? searchSpec2.searchOptions : searchOptions2, (i2 & 8) != 0 ? searchSpec2.savedSearchId : l2, (i2 & 16) != 0 ? searchSpec2.anchorListingId : str2, (i2 & 32) != 0 ? searchSpec2.searchWithNewFilters : z, (i2 & 64) != 0 ? searchSpec2.isRecentSearch : z2, (i2 & 128) != 0 ? searchSpec2.includeFeaturedCategories : z3, (i2 & 256) != 0 ? searchSpec2.topLevelCategories : z4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? searchSpec2.requestParams : bundle);
    }

    public final String component1() {
        return this.query;
    }

    public final Bundle component10() {
        return this.requestParams;
    }

    public final Long component2() {
        return this.taxonomyId;
    }

    public final SearchOptions component3() {
        return this.searchOptions;
    }

    public final Long component4() {
        return this.savedSearchId;
    }

    public final String component5() {
        return this.anchorListingId;
    }

    public final boolean component6() {
        return this.searchWithNewFilters;
    }

    public final boolean component7() {
        return this.isRecentSearch;
    }

    public final boolean component8() {
        return this.includeFeaturedCategories;
    }

    public final boolean component9() {
        return this.topLevelCategories;
    }

    public final SearchSpec copy(String str, Long l, SearchOptions searchOptions2, Long l2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Bundle bundle) {
        return new SearchSpec(str, l, searchOptions2, l2, str2, z, z2, z3, z4, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSpec)) {
            return false;
        }
        SearchSpec searchSpec = (SearchSpec) obj;
        return C19383o.m32792b(this.query, searchSpec.query) && C19383o.m32792b(this.taxonomyId, searchSpec.taxonomyId) && C19383o.m32792b(this.searchOptions, searchSpec.searchOptions) && C19383o.m32792b(this.savedSearchId, searchSpec.savedSearchId) && C19383o.m32792b(this.anchorListingId, searchSpec.anchorListingId) && this.searchWithNewFilters == searchSpec.searchWithNewFilters && this.isRecentSearch == searchSpec.isRecentSearch && this.includeFeaturedCategories == searchSpec.includeFeaturedCategories && this.topLevelCategories == searchSpec.topLevelCategories && C19383o.m32792b(this.requestParams, searchSpec.requestParams);
    }

    public final String getAnchorListingId() {
        return this.anchorListingId;
    }

    public final boolean getIncludeFeaturedCategories() {
        return this.includeFeaturedCategories;
    }

    public final String getQuery() {
        return this.query;
    }

    public final Bundle getRequestParams() {
        return this.requestParams;
    }

    public final Long getSavedSearchId() {
        return this.savedSearchId;
    }

    public final SearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    public final boolean getSearchWithNewFilters() {
        return this.searchWithNewFilters;
    }

    public final Long getTaxonomyId() {
        return this.taxonomyId;
    }

    public final boolean getTopLevelCategories() {
        return this.topLevelCategories;
    }

    public int hashCode() {
        String str = this.query;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.taxonomyId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        SearchOptions searchOptions2 = this.searchOptions;
        int hashCode3 = (hashCode2 + (searchOptions2 == null ? 0 : searchOptions2.hashCode())) * 31;
        Long l2 = this.savedSearchId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.anchorListingId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.searchWithNewFilters;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isRecentSearch;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.includeFeaturedCategories;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.topLevelCategories;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        Bundle bundle = this.requestParams;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return i5 + i;
    }

    public final boolean isRecentSearch() {
        return this.isRecentSearch;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchSpec(query=");
        h.append(this.query);
        h.append(", taxonomyId=");
        h.append(this.taxonomyId);
        h.append(", searchOptions=");
        h.append(this.searchOptions);
        h.append(", savedSearchId=");
        h.append(this.savedSearchId);
        h.append(", anchorListingId=");
        h.append(this.anchorListingId);
        h.append(", searchWithNewFilters=");
        h.append(this.searchWithNewFilters);
        h.append(", isRecentSearch=");
        h.append(this.isRecentSearch);
        h.append(", includeFeaturedCategories=");
        h.append(this.includeFeaturedCategories);
        h.append(", topLevelCategories=");
        h.append(this.topLevelCategories);
        h.append(", requestParams=");
        h.append(this.requestParams);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.query);
        Long l = this.taxonomyId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        SearchOptions searchOptions2 = this.searchOptions;
        if (searchOptions2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchOptions2.writeToParcel(parcel, i);
        }
        Long l2 = this.savedSearchId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        parcel.writeString(this.anchorListingId);
        parcel.writeInt(this.searchWithNewFilters ? 1 : 0);
        parcel.writeInt(this.isRecentSearch ? 1 : 0);
        parcel.writeInt(this.includeFeaturedCategories ? 1 : 0);
        parcel.writeInt(this.topLevelCategories ? 1 : 0);
        parcel.writeBundle(this.requestParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchSpec(java.lang.String r13, java.lang.Long r14, com.etsy.android.p327ui.search.p330v2.SearchOptions r15, java.lang.Long r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, android.os.Bundle r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x002f
            r7 = r8
            goto L_0x0031
        L_0x002f:
            r7 = r18
        L_0x0031:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0037
            r9 = r8
            goto L_0x0039
        L_0x0037:
            r9 = r19
        L_0x0039:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x003f
            r10 = r8
            goto L_0x0041
        L_0x003f:
            r10 = r20
        L_0x0041:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r8 = r21
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r22
        L_0x004f:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r9
            r21 = r10
            r22 = r8
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.specs.SearchSpec.<init>(java.lang.String, java.lang.Long, com.etsy.android.ui.search.v2.SearchOptions, java.lang.Long, java.lang.String, boolean, boolean, boolean, boolean, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
