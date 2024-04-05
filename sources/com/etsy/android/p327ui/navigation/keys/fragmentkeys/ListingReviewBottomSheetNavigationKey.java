package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.p327ui.core.review.bottomsheet.ListingReviewPagerBottomSheetFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p363he.C12822e;
import p363he.C12824f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingReviewBottomSheetNavigationKey */
public final class ListingReviewBottomSheetNavigationKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingReviewBottomSheetNavigationKey> CREATOR = new Creator();
    private final int position;
    private final String referrer;
    private final List<ReviewImage> reviews;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingReviewBottomSheetNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingReviewBottomSheetNavigationKey> {
        public final ListingReviewBottomSheetNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new ListingReviewBottomSheetNavigationKey(readString, arrayList, parcel.readInt());
        }

        public final ListingReviewBottomSheetNavigationKey[] newArray(int i) {
            return new ListingReviewBottomSheetNavigationKey[i];
        }
    }

    public ListingReviewBottomSheetNavigationKey(String str, List<ReviewImage> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        this.referrer = str;
        this.reviews = list;
        this.position = i;
    }

    public static /* synthetic */ ListingReviewBottomSheetNavigationKey copy$default(ListingReviewBottomSheetNavigationKey listingReviewBottomSheetNavigationKey, String str, List<ReviewImage> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listingReviewBottomSheetNavigationKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            list = listingReviewBottomSheetNavigationKey.reviews;
        }
        if ((i2 & 4) != 0) {
            i = listingReviewBottomSheetNavigationKey.position;
        }
        return listingReviewBottomSheetNavigationKey.copy(str, list, i);
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

    public final ListingReviewBottomSheetNavigationKey copy(String str, List<ReviewImage> list, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        return new ListingReviewBottomSheetNavigationKey(str, list, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingReviewBottomSheetNavigationKey)) {
            return false;
        }
        ListingReviewBottomSheetNavigationKey listingReviewBottomSheetNavigationKey = (ListingReviewBottomSheetNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), listingReviewBottomSheetNavigationKey.getReferrer()) && C19383o.m32792b(this.reviews, listingReviewBottomSheetNavigationKey.reviews) && this.position == listingReviewBottomSheetNavigationKey.position;
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new ListingReviewPagerBottomSheetFragment();
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

    public final List<ReviewImage> getReviews() {
        return this.reviews;
    }

    public int hashCode() {
        return Integer.hashCode(this.position) + C13983i.m21488g(this.reviews, getReferrer().hashCode() * 31, 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingReviewBottomSheetNavigationKey(referrer=");
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
    public /* synthetic */ ListingReviewBottomSheetNavigationKey(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? 0 : i);
    }
}
