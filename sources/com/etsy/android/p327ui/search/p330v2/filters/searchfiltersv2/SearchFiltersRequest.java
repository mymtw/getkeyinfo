package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest */
public final class SearchFiltersRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchFiltersRequest> CREATOR = new Creator();
    private final String anchorListingId;
    private final String currencyCode;
    private final Integer limit;
    private final SearchOptions options;
    private final Boolean parentIncludeFeatureCategories;
    private final String query;
    private final Bundle requestParams;

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest$Creator */
    public static final class Creator implements Parcelable.Creator<SearchFiltersRequest> {
        public final SearchFiltersRequest createFromParcel(Parcel parcel) {
            Boolean bool;
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            SearchOptions createFromParcel = SearchOptions.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            Bundle readBundle = parcel.readBundle();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SearchFiltersRequest(readString, readString2, createFromParcel, readString3, readBundle, valueOf, bool);
        }

        public final SearchFiltersRequest[] newArray(int i) {
            return new SearchFiltersRequest[i];
        }
    }

    public SearchFiltersRequest() {
        this((String) null, (String) null, (SearchOptions) null, (String) null, (Bundle) null, (Integer) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
    }

    public SearchFiltersRequest(String str, String str2, SearchOptions searchOptions, String str3, Bundle bundle, Integer num, Boolean bool) {
        C19383o.m32797g(searchOptions, ResponseConstants.OPTIONS);
        this.query = str;
        this.anchorListingId = str2;
        this.options = searchOptions;
        this.currencyCode = str3;
        this.requestParams = bundle;
        this.limit = num;
        this.parentIncludeFeatureCategories = bool;
    }

    public static /* synthetic */ SearchFiltersRequest copy$default(SearchFiltersRequest searchFiltersRequest, String str, String str2, SearchOptions searchOptions, String str3, Bundle bundle, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchFiltersRequest.query;
        }
        if ((i & 2) != 0) {
            str2 = searchFiltersRequest.anchorListingId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            searchOptions = searchFiltersRequest.options;
        }
        SearchOptions searchOptions2 = searchOptions;
        if ((i & 8) != 0) {
            str3 = searchFiltersRequest.currencyCode;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            bundle = searchFiltersRequest.requestParams;
        }
        Bundle bundle2 = bundle;
        if ((i & 32) != 0) {
            num = searchFiltersRequest.limit;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            bool = searchFiltersRequest.parentIncludeFeatureCategories;
        }
        return searchFiltersRequest.copy(str, str4, searchOptions2, str5, bundle2, num2, bool);
    }

    public final String component1() {
        return this.query;
    }

    public final String component2() {
        return this.anchorListingId;
    }

    public final SearchOptions component3() {
        return this.options;
    }

    public final String component4() {
        return this.currencyCode;
    }

    public final Bundle component5() {
        return this.requestParams;
    }

    public final Integer component6() {
        return this.limit;
    }

    public final Boolean component7() {
        return this.parentIncludeFeatureCategories;
    }

    public final SearchFiltersRequest copy(String str, String str2, SearchOptions searchOptions, String str3, Bundle bundle, Integer num, Boolean bool) {
        C19383o.m32797g(searchOptions, ResponseConstants.OPTIONS);
        return new SearchFiltersRequest(str, str2, searchOptions, str3, bundle, num, bool);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFiltersRequest)) {
            return false;
        }
        SearchFiltersRequest searchFiltersRequest = (SearchFiltersRequest) obj;
        return C19383o.m32792b(this.query, searchFiltersRequest.query) && C19383o.m32792b(this.anchorListingId, searchFiltersRequest.anchorListingId) && C19383o.m32792b(this.options, searchFiltersRequest.options) && C19383o.m32792b(this.currencyCode, searchFiltersRequest.currencyCode) && C19383o.m32792b(this.requestParams, searchFiltersRequest.requestParams) && C19383o.m32792b(this.limit, searchFiltersRequest.limit) && C19383o.m32792b(this.parentIncludeFeatureCategories, searchFiltersRequest.parentIncludeFeatureCategories);
    }

    public final String getAnchorListingId() {
        return this.anchorListingId;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final SearchOptions getOptions() {
        return this.options;
    }

    public final Boolean getParentIncludeFeatureCategories() {
        return this.parentIncludeFeatureCategories;
    }

    public final String getQuery() {
        return this.query;
    }

    public final Bundle getRequestParams() {
        return this.requestParams;
    }

    public int hashCode() {
        String str = this.query;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anchorListingId;
        int hashCode2 = (this.options.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.currencyCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bundle bundle = this.requestParams;
        int hashCode4 = (hashCode3 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Integer num = this.limit;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.parentIncludeFeatureCategories;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersRequest(query=");
        h.append(this.query);
        h.append(", anchorListingId=");
        h.append(this.anchorListingId);
        h.append(", options=");
        h.append(this.options);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", requestParams=");
        h.append(this.requestParams);
        h.append(", limit=");
        h.append(this.limit);
        h.append(", parentIncludeFeatureCategories=");
        h.append(this.parentIncludeFeatureCategories);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.query);
        parcel.writeString(this.anchorListingId);
        this.options.writeToParcel(parcel, i);
        parcel.writeString(this.currencyCode);
        parcel.writeBundle(this.requestParams);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        Boolean bool = this.parentIncludeFeatureCategories;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchFiltersRequest(java.lang.String r36, java.lang.String r37, com.etsy.android.p327ui.search.p330v2.SearchOptions r38, java.lang.String r39, android.os.Bundle r40, java.lang.Integer r41, java.lang.Boolean r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r35 = this;
            r0 = r43 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x000a
        L_0x0008:
            r0 = r36
        L_0x000a:
            r2 = r43 & 2
            if (r2 == 0) goto L_0x0010
            r2 = r1
            goto L_0x0012
        L_0x0010:
            r2 = r37
        L_0x0012:
            r3 = r43 & 4
            if (r3 == 0) goto L_0x004f
            com.etsy.android.ui.search.v2.SearchOptions r3 = new com.etsy.android.ui.search.v2.SearchOptions
            r4 = r3
            r5 = 0
            r6 = 0
            r7 = 0
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
            r33 = 268435455(0xfffffff, float:2.5243547E-29)
            r34 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0051
        L_0x004f:
            r3 = r38
        L_0x0051:
            r4 = r43 & 8
            if (r4 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r1 = r39
        L_0x0058:
            r4 = r43 & 16
            if (r4 == 0) goto L_0x005f
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            goto L_0x0061
        L_0x005f:
            r4 = r40
        L_0x0061:
            r5 = r43 & 32
            if (r5 == 0) goto L_0x006c
            r5 = 48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x006e
        L_0x006c:
            r5 = r41
        L_0x006e:
            r6 = r43 & 64
            if (r6 == 0) goto L_0x0075
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x0077
        L_0x0075:
            r6 = r42
        L_0x0077:
            r36 = r35
            r37 = r0
            r38 = r2
            r39 = r3
            r40 = r1
            r41 = r4
            r42 = r5
            r43 = r6
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest.<init>(java.lang.String, java.lang.String, com.etsy.android.ui.search.v2.SearchOptions, java.lang.String, android.os.Bundle, java.lang.Integer, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
