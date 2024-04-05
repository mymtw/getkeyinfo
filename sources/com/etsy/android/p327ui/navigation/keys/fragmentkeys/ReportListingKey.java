package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p010a9.C0048b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey */
public final class ReportListingKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReportListingKey> CREATOR = new Creator();
    private final String listingId;
    private final String listingUrl;
    private final String referrer;
    private final int type = 17;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey$Creator */
    public static final class Creator implements Parcelable.Creator<ReportListingKey> {
        public final ReportListingKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ReportListingKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final ReportListingKey[] newArray(int i) {
            return new ReportListingKey[i];
        }
    }

    public ReportListingKey(String str, String str2, String str3) {
        C0048b.m167f(str, "referrer", str2, "listingId", str3, "listingUrl");
        this.referrer = str;
        this.listingId = str2;
        this.listingUrl = str3;
    }

    public static /* synthetic */ ReportListingKey copy$default(ReportListingKey reportListingKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportListingKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = reportListingKey.listingId;
        }
        if ((i & 4) != 0) {
            str3 = reportListingKey.listingUrl;
        }
        return reportListingKey.copy(str, str2, str3);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.listingId;
    }

    public final String component3() {
        return this.listingUrl;
    }

    public final ReportListingKey copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "listingId");
        C19383o.m32797g(str3, "listingUrl");
        return new ReportListingKey(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportListingKey)) {
            return false;
        }
        ReportListingKey reportListingKey = (ReportListingKey) obj;
        return C19383o.m32792b(getReferrer(), reportListingKey.getReferrer()) && C19383o.m32792b(this.listingId, reportListingKey.listingId) && C19383o.m32792b(this.listingUrl, reportListingKey.listingUrl);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = EtsyWebFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final String getListingId() {
        return this.listingId;
    }

    public final String getListingUrl() {
        return this.listingUrl;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", Integer.valueOf(this.type));
        fVar.f28304a.put("listing_id", this.listingId);
        fVar.f28304a.put("url", C0023f.m110k(new StringBuilder(), this.listingUrl, "/report"));
        fVar.f28304a.put(EtsyWebFragment.ARG_TRACKING_ID, UserAction.TYPE_REPORT_LISTING);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.listingUrl.hashCode() + C0023f.m105e(this.listingId, getReferrer().hashCode() * 31, 31);
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
        StringBuilder h = C0072d.m201h("ReportListingKey(referrer=");
        h.append(getReferrer());
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", listingUrl=");
        return C0391c.m1057c(h, this.listingUrl, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.listingId);
        parcel.writeString(this.listingUrl);
    }
}
