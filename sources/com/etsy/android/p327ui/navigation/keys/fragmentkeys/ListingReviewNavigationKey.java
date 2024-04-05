package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.p327ui.core.review.ListingReviewPagerFragment;
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

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey */
public final class ListingReviewNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingReviewNavigationKey> CREATOR = new Creator();
    public static final C10703a Companion = new C10703a();
    public static final String INITIAL_REVIEW_POSITION = "initial_review_position";
    private final int position;
    private final String referrer;
    private final Bundle referrerBundle;
    private final List<ReviewImage> reviews;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingReviewNavigationKey> {
        public final ListingReviewNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new ListingReviewNavigationKey(readString, arrayList, parcel.readInt());
        }

        public final ListingReviewNavigationKey[] newArray(int i) {
            return new ListingReviewNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey$a */
    public static final class C10703a {
        /* renamed from: a */
        public static C12822e m18610a(boolean z, String str, List list, int i) {
            C19383o.m32797g(str, "referrer");
            C19383o.m32797g(list, ResponseConstants.REVIEWS);
            return z ? new ListingReviewBottomSheetNavigationKey(str, list, i) : new ListingReviewNavigationKey(str, list, i);
        }
    }

    public ListingReviewNavigationKey(String str, List<ReviewImage> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        this.referrer = str;
        this.reviews = list;
        this.position = i;
    }

    public static /* synthetic */ ListingReviewNavigationKey copy$default(ListingReviewNavigationKey listingReviewNavigationKey, String str, List<ReviewImage> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listingReviewNavigationKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            list = listingReviewNavigationKey.reviews;
        }
        if ((i2 & 4) != 0) {
            i = listingReviewNavigationKey.position;
        }
        return listingReviewNavigationKey.copy(str, list, i);
    }

    public final String component1() {
        return getReferrer();
    }

    public final List<ReviewImage> component2() {
        return this.reviews;
    }

    public final int component3() {
        return this.position;
    }

    public final ListingReviewNavigationKey copy(String str, List<ReviewImage> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        return new ListingReviewNavigationKey(str, list, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingReviewNavigationKey)) {
            return false;
        }
        ListingReviewNavigationKey listingReviewNavigationKey = (ListingReviewNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), listingReviewNavigationKey.getReferrer()) && C19383o.m32792b(this.reviews, listingReviewNavigationKey.reviews) && this.position == listingReviewNavigationKey.position;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.SLIDE_BOTTOM_ONTOP_MULTIBACKSTACK;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = ListingReviewPagerFragment.class.getCanonicalName();
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
        fVar.f28304a.put(INITIAL_REVIEW_POSITION, Integer.valueOf(this.position));
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

    public final List<ReviewImage> getReviews() {
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
        StringBuilder h = C0072d.m201h("ListingReviewNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", reviews=");
        h.append(this.reviews);
        h.append(", position=");
        return C0073e.m208h(h, this.position, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        List<ReviewImage> list = this.reviews;
        parcel.writeInt(list.size());
        for (ReviewImage writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
        parcel.writeInt(this.position);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingReviewNavigationKey(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? 0 : i);
    }
}
