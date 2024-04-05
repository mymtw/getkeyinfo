package com.etsy.android.p327ui.navigation.specs;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.navigation.specs.SearchRedirectSpec */
public final class SearchRedirectSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchRedirectSpec> CREATOR = new Creator();
    private final HashMap<String, String> categoryRedirectQueryParams;
    private final String categoryTaxonomyPath;
    private final boolean initiatedFromWithinApp;

    /* renamed from: com.etsy.android.ui.navigation.specs.SearchRedirectSpec$Creator */
    public static final class Creator implements Parcelable.Creator<SearchRedirectSpec> {
        public final SearchRedirectSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            boolean z = false;
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new SearchRedirectSpec(readString, hashMap, z);
        }

        public final SearchRedirectSpec[] newArray(int i) {
            return new SearchRedirectSpec[i];
        }
    }

    public SearchRedirectSpec(String str, HashMap<String, String> hashMap, boolean z) {
        C19383o.m32797g(str, "categoryTaxonomyPath");
        C19383o.m32797g(hashMap, "categoryRedirectQueryParams");
        this.categoryTaxonomyPath = str;
        this.categoryRedirectQueryParams = hashMap;
        this.initiatedFromWithinApp = z;
    }

    public static /* synthetic */ SearchRedirectSpec copy$default(SearchRedirectSpec searchRedirectSpec, String str, HashMap<String, String> hashMap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRedirectSpec.categoryTaxonomyPath;
        }
        if ((i & 2) != 0) {
            hashMap = searchRedirectSpec.categoryRedirectQueryParams;
        }
        if ((i & 4) != 0) {
            z = searchRedirectSpec.initiatedFromWithinApp;
        }
        return searchRedirectSpec.copy(str, hashMap, z);
    }

    public final String component1() {
        return this.categoryTaxonomyPath;
    }

    public final HashMap<String, String> component2() {
        return this.categoryRedirectQueryParams;
    }

    public final boolean component3() {
        return this.initiatedFromWithinApp;
    }

    public final SearchRedirectSpec copy(String str, HashMap<String, String> hashMap, boolean z) {
        C19383o.m32797g(str, "categoryTaxonomyPath");
        C19383o.m32797g(hashMap, "categoryRedirectQueryParams");
        return new SearchRedirectSpec(str, hashMap, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRedirectSpec)) {
            return false;
        }
        SearchRedirectSpec searchRedirectSpec = (SearchRedirectSpec) obj;
        return C19383o.m32792b(this.categoryTaxonomyPath, searchRedirectSpec.categoryTaxonomyPath) && C19383o.m32792b(this.categoryRedirectQueryParams, searchRedirectSpec.categoryRedirectQueryParams) && this.initiatedFromWithinApp == searchRedirectSpec.initiatedFromWithinApp;
    }

    public final HashMap<String, String> getCategoryRedirectQueryParams() {
        return this.categoryRedirectQueryParams;
    }

    public final String getCategoryTaxonomyPath() {
        return this.categoryTaxonomyPath;
    }

    public final boolean getInitiatedFromWithinApp() {
        return this.initiatedFromWithinApp;
    }

    public int hashCode() {
        int hashCode = (this.categoryRedirectQueryParams.hashCode() + (this.categoryTaxonomyPath.hashCode() * 31)) * 31;
        boolean z = this.initiatedFromWithinApp;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchRedirectSpec(categoryTaxonomyPath=");
        h.append(this.categoryTaxonomyPath);
        h.append(", categoryRedirectQueryParams=");
        h.append(this.categoryRedirectQueryParams);
        h.append(", initiatedFromWithinApp=");
        return C0391c.m1058d(h, this.initiatedFromWithinApp, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.categoryTaxonomyPath);
        HashMap<String, String> hashMap = this.categoryRedirectQueryParams;
        parcel.writeInt(hashMap.size());
        for (Map.Entry next : hashMap.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        parcel.writeInt(this.initiatedFromWithinApp ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchRedirectSpec(String str, HashMap hashMap, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hashMap, (i & 4) != 0 ? false : z);
    }
}
