package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingVideoReviewNavigationKey */
public final class ListingVideoReviewNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingVideoReviewNavigationKey> CREATOR = new Creator();
    public static final C10704a Companion = new C10704a();
    private final int position;
    private final String referrer;
    private final Bundle referrerBundle;
    private final List<ReviewUiModel> reviews;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingVideoReviewNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingVideoReviewNavigationKey> {
        public final ListingVideoReviewNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new ListingVideoReviewNavigationKey(readString, arrayList, parcel.readInt());
        }

        public final ListingVideoReviewNavigationKey[] newArray(int i) {
            return new ListingVideoReviewNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingVideoReviewNavigationKey$a */
    public static final class C10704a {
    }

    public ListingVideoReviewNavigationKey(String str, List<ReviewUiModel> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        this.referrer = str;
        this.reviews = list;
        this.position = i;
    }

    public static /* synthetic */ ListingVideoReviewNavigationKey copy$default(ListingVideoReviewNavigationKey listingVideoReviewNavigationKey, String str, List<ReviewUiModel> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listingVideoReviewNavigationKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            list = listingVideoReviewNavigationKey.reviews;
        }
        if ((i2 & 4) != 0) {
            i = listingVideoReviewNavigationKey.position;
        }
        return listingVideoReviewNavigationKey.copy(str, list, i);
    }

    public final String component1() {
        return getReferrer();
    }

    public final List<ReviewUiModel> component2() {
        return this.reviews;
    }

    public final int component3() {
        return this.position;
    }

    public final ListingVideoReviewNavigationKey copy(String str, List<ReviewUiModel> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        return new ListingVideoReviewNavigationKey(str, list, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingVideoReviewNavigationKey)) {
            return false;
        }
        ListingVideoReviewNavigationKey listingVideoReviewNavigationKey = (ListingVideoReviewNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), listingVideoReviewNavigationKey.getReferrer()) && C19383o.m32792b(this.reviews, listingVideoReviewNavigationKey.reviews) && this.position == listingVideoReviewNavigationKey.position;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = ListingVideoReviewFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        int storeDataForKey = storeDataForKey(this.reviews);
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(ListingReviewNavigationKey.INITIAL_REVIEW_POSITION, Integer.valueOf(this.position));
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
        return fVar;
    }

    public final int getPosition() {
        return this.position;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final List<ReviewUiModel> getReviews() {
        return this.reviews;
    }

    public int hashCode() {
        return Integer.hashCode(this.position) + C13983i.m21488g(this.reviews, getReferrer().hashCode() * 31, 31);
    }

    public boolean isDialog() {
        return true;
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
        StringBuilder h = C0072d.m201h("ListingVideoReviewNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", reviews=");
        h.append(this.reviews);
        h.append(", position=");
        return C0073e.m208h(h, this.position, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        List<ReviewUiModel> list = this.reviews;
        parcel.writeInt(list.size());
        for (ReviewUiModel writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
        parcel.writeInt(this.position);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingVideoReviewNavigationKey(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? 0 : i);
    }
}
