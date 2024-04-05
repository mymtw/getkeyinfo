package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.search.toplevelcategories.TopLevelCategoriesFragment;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTopLevelCategoriesKey */
public final class SearchTopLevelCategoriesKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchTopLevelCategoriesKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTopLevelCategoriesKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchTopLevelCategoriesKey> {
        public final SearchTopLevelCategoriesKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchTopLevelCategoriesKey(parcel.readString());
        }

        public final SearchTopLevelCategoriesKey[] newArray(int i) {
            return new SearchTopLevelCategoriesKey[i];
        }
    }

    public SearchTopLevelCategoriesKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ SearchTopLevelCategoriesKey copy$default(SearchTopLevelCategoriesKey searchTopLevelCategoriesKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTopLevelCategoriesKey.getReferrer();
        }
        return searchTopLevelCategoriesKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SearchTopLevelCategoriesKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new SearchTopLevelCategoriesKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTopLevelCategoriesKey) && C19383o.m32792b(getReferrer(), ((SearchTopLevelCategoriesKey) obj).getReferrer());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = TopLevelCategoriesFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new TopLevelCategoriesFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return getReferrer().hashCode();
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
        StringBuilder h = C0072d.m201h("SearchTopLevelCategoriesKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}
