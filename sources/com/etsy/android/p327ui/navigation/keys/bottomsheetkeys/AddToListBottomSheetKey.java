package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.favorites.add.AddToListContainerFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey */
public final class AddToListBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddToListBottomSheetKey> CREATOR = new Creator();
    private final boolean isFavoriting;
    private final ListingLike listing;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<AddToListBottomSheetKey> {
        public final AddToListBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new AddToListBottomSheetKey(parcel.readString(), (ListingLike) parcel.readSerializable(), parcel.readInt() != 0);
        }

        public final AddToListBottomSheetKey[] newArray(int i) {
            return new AddToListBottomSheetKey[i];
        }
    }

    public AddToListBottomSheetKey(String str, ListingLike listingLike, boolean z) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(listingLike, ResponseConstants.LISTING);
        this.referrer = str;
        this.listing = listingLike;
        this.isFavoriting = z;
    }

    public static /* synthetic */ AddToListBottomSheetKey copy$default(AddToListBottomSheetKey addToListBottomSheetKey, String str, ListingLike listingLike, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addToListBottomSheetKey.getReferrer();
        }
        if ((i & 2) != 0) {
            listingLike = addToListBottomSheetKey.listing;
        }
        if ((i & 4) != 0) {
            z = addToListBottomSheetKey.isFavoriting;
        }
        return addToListBottomSheetKey.copy(str, listingLike, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final ListingLike component2() {
        return this.listing;
    }

    public final boolean component3() {
        return this.isFavoriting;
    }

    public final AddToListBottomSheetKey copy(String str, ListingLike listingLike, boolean z) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(listingLike, ResponseConstants.LISTING);
        return new AddToListBottomSheetKey(str, listingLike, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToListBottomSheetKey)) {
            return false;
        }
        AddToListBottomSheetKey addToListBottomSheetKey = (AddToListBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), addToListBottomSheetKey.getReferrer()) && C19383o.m32792b(this.listing, addToListBottomSheetKey.listing) && this.isFavoriting == addToListBottomSheetKey.isFavoriting;
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new AddToListContainerFragment();
    }

    public final ListingLike getListing() {
        return this.listing;
    }

    public C12824f getNavigationParams() {
        C11869a aVar = new C11869a();
        aVar.mo38349f(ResponseConstants.LISTING, this.listing);
        int storeDataForKey = storeDataForKey(aVar);
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
        fVar.f28304a.put("is_favoriting", Boolean.valueOf(this.isFavoriting));
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        int hashCode = (this.listing.hashCode() + (getReferrer().hashCode() * 31)) * 31;
        boolean z = this.isFavoriting;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isFavoriting() {
        return this.isFavoriting;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AddToListBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", listing=");
        h.append(this.listing);
        h.append(", isFavoriting=");
        return C0391c.m1058d(h, this.isFavoriting, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.listing);
        parcel.writeInt(this.isFavoriting ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddToListBottomSheetKey(String str, ListingLike listingLike, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, listingLike, (i & 4) != 0 ? false : z);
    }
}
