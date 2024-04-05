package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.search.p330v2.taxonomy.SearchTaxonomyCategoryPageFragment;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey */
public final class SearchTaxonomyCategoryKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchTaxonomyCategoryKey> CREATOR = new Creator();
    private final String anchorListingId;
    private final String referrer;
    private final SearchCategoryRedirectPageParcelable searchRedirectParcelable;
    private final Long taxonomyId;
    private final String taxonomyName;
    private final String taxonomyPath;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchTaxonomyCategoryKey> {
        public final SearchTaxonomyCategoryKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                searchCategoryRedirectPageParcelable = SearchCategoryRedirectPageParcelable.CREATOR.createFromParcel(parcel);
            }
            return new SearchTaxonomyCategoryKey(readString, readString2, valueOf, readString3, readString4, searchCategoryRedirectPageParcelable);
        }

        public final SearchTaxonomyCategoryKey[] newArray(int i) {
            return new SearchTaxonomyCategoryKey[i];
        }
    }

    public SearchTaxonomyCategoryKey(String str, String str2, Long l, String str3, String str4, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.anchorListingId = str2;
        this.taxonomyId = l;
        this.taxonomyName = str3;
        this.taxonomyPath = str4;
        this.searchRedirectParcelable = searchCategoryRedirectPageParcelable;
    }

    public static /* synthetic */ SearchTaxonomyCategoryKey copy$default(SearchTaxonomyCategoryKey searchTaxonomyCategoryKey, String str, String str2, Long l, String str3, String str4, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTaxonomyCategoryKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = searchTaxonomyCategoryKey.anchorListingId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            l = searchTaxonomyCategoryKey.taxonomyId;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str3 = searchTaxonomyCategoryKey.taxonomyName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = searchTaxonomyCategoryKey.taxonomyPath;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            searchCategoryRedirectPageParcelable = searchTaxonomyCategoryKey.searchRedirectParcelable;
        }
        return searchTaxonomyCategoryKey.copy(str, str5, l2, str6, str7, searchCategoryRedirectPageParcelable);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.anchorListingId;
    }

    public final Long component3() {
        return this.taxonomyId;
    }

    public final String component4() {
        return this.taxonomyName;
    }

    public final String component5() {
        return this.taxonomyPath;
    }

    public final SearchCategoryRedirectPageParcelable component6() {
        return this.searchRedirectParcelable;
    }

    public final SearchTaxonomyCategoryKey copy(String str, String str2, Long l, String str3, String str4, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable) {
        C19383o.m32797g(str, "referrer");
        return new SearchTaxonomyCategoryKey(str, str2, l, str3, str4, searchCategoryRedirectPageParcelable);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTaxonomyCategoryKey)) {
            return false;
        }
        SearchTaxonomyCategoryKey searchTaxonomyCategoryKey = (SearchTaxonomyCategoryKey) obj;
        return C19383o.m32792b(getReferrer(), searchTaxonomyCategoryKey.getReferrer()) && C19383o.m32792b(this.anchorListingId, searchTaxonomyCategoryKey.anchorListingId) && C19383o.m32792b(this.taxonomyId, searchTaxonomyCategoryKey.taxonomyId) && C19383o.m32792b(this.taxonomyName, searchTaxonomyCategoryKey.taxonomyName) && C19383o.m32792b(this.taxonomyPath, searchTaxonomyCategoryKey.taxonomyPath) && C19383o.m32792b(this.searchRedirectParcelable, searchTaxonomyCategoryKey.searchRedirectParcelable);
    }

    public final String getAnchorListingId() {
        return this.anchorListingId;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchTaxonomyCategoryPageFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new SearchTaxonomyCategoryPageFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (C18263b.m30839d0(this.anchorListingId)) {
            fVar.f28304a.put("ANCHOR_LISTING_ID", this.anchorListingId);
        }
        Long l = this.taxonomyId;
        if (l != null) {
            fVar.f28304a.put("search_taxonomy_id", l);
        }
        if (C18263b.m30839d0(this.taxonomyPath)) {
            fVar.f28304a.put("search_taxonomy_path", this.taxonomyPath);
        }
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = this.searchRedirectParcelable;
        if (searchCategoryRedirectPageParcelable != null) {
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT", searchCategoryRedirectPageParcelable);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final SearchCategoryRedirectPageParcelable getSearchRedirectParcelable() {
        return this.searchRedirectParcelable;
    }

    public final Long getTaxonomyId() {
        return this.taxonomyId;
    }

    public final String getTaxonomyName() {
        return this.taxonomyName;
    }

    public final String getTaxonomyPath() {
        return this.taxonomyPath;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.anchorListingId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.taxonomyId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.taxonomyName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxonomyPath;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = this.searchRedirectParcelable;
        if (searchCategoryRedirectPageParcelable != null) {
            i = searchCategoryRedirectPageParcelable.hashCode();
        }
        return hashCode5 + i;
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchTaxonomyCategoryKey(referrer=");
        h.append(getReferrer());
        h.append(", anchorListingId=");
        h.append(this.anchorListingId);
        h.append(", taxonomyId=");
        h.append(this.taxonomyId);
        h.append(", taxonomyName=");
        h.append(this.taxonomyName);
        h.append(", taxonomyPath=");
        h.append(this.taxonomyPath);
        h.append(", searchRedirectParcelable=");
        h.append(this.searchRedirectParcelable);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.anchorListingId);
        Long l = this.taxonomyId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        parcel.writeString(this.taxonomyName);
        parcel.writeString(this.taxonomyPath);
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = this.searchRedirectParcelable;
        if (searchCategoryRedirectPageParcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        searchCategoryRedirectPageParcelable.writeToParcel(parcel, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchTaxonomyCategoryKey(java.lang.String r7, java.lang.String r8, java.lang.Long r9, java.lang.String r10, java.lang.String r11, com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
