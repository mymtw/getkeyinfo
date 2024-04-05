package com.etsy.android.p327ui.navigation.keys.bottomsheetkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.listingnomapper.SingleListingCheckoutNavigationSpec;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import com.etsy.android.p327ui.navigation.keys.BottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.NativeBuyItNowCheckoutBottomSheetKey */
public final class NativeBuyItNowCheckoutBottomSheetKey implements BottomSheetNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NativeBuyItNowCheckoutBottomSheetKey> CREATOR = new Creator();
    private final String referrer;
    private final SingleListingCheckoutNavigationSpec singleListingCheckoutSpec;

    /* renamed from: com.etsy.android.ui.navigation.keys.bottomsheetkeys.NativeBuyItNowCheckoutBottomSheetKey$Creator */
    public static final class Creator implements Parcelable.Creator<NativeBuyItNowCheckoutBottomSheetKey> {
        public final NativeBuyItNowCheckoutBottomSheetKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new NativeBuyItNowCheckoutBottomSheetKey(parcel.readString(), SingleListingCheckoutNavigationSpec.CREATOR.createFromParcel(parcel));
        }

        public final NativeBuyItNowCheckoutBottomSheetKey[] newArray(int i) {
            return new NativeBuyItNowCheckoutBottomSheetKey[i];
        }
    }

    public NativeBuyItNowCheckoutBottomSheetKey(String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(singleListingCheckoutNavigationSpec, "singleListingCheckoutSpec");
        this.referrer = str;
        this.singleListingCheckoutSpec = singleListingCheckoutNavigationSpec;
    }

    public static /* synthetic */ NativeBuyItNowCheckoutBottomSheetKey copy$default(NativeBuyItNowCheckoutBottomSheetKey nativeBuyItNowCheckoutBottomSheetKey, String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeBuyItNowCheckoutBottomSheetKey.getReferrer();
        }
        if ((i & 2) != 0) {
            singleListingCheckoutNavigationSpec = nativeBuyItNowCheckoutBottomSheetKey.singleListingCheckoutSpec;
        }
        return nativeBuyItNowCheckoutBottomSheetKey.copy(str, singleListingCheckoutNavigationSpec);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SingleListingCheckoutNavigationSpec component2() {
        return this.singleListingCheckoutSpec;
    }

    public final NativeBuyItNowCheckoutBottomSheetKey copy(String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(singleListingCheckoutNavigationSpec, "singleListingCheckoutSpec");
        return new NativeBuyItNowCheckoutBottomSheetKey(str, singleListingCheckoutNavigationSpec);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeBuyItNowCheckoutBottomSheetKey)) {
            return false;
        }
        NativeBuyItNowCheckoutBottomSheetKey nativeBuyItNowCheckoutBottomSheetKey = (NativeBuyItNowCheckoutBottomSheetKey) obj;
        return C19383o.m32792b(getReferrer(), nativeBuyItNowCheckoutBottomSheetKey.getReferrer()) && C19383o.m32792b(this.singleListingCheckoutSpec, nativeBuyItNowCheckoutBottomSheetKey.singleListingCheckoutSpec);
    }

    public TrackingBottomSheetDialogFragment getBottomSheetFragment() {
        return new NativeBuyItNowCheckoutContainerFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(ResponseConstants.SINGLE_LISTING_CHECKOUT, this.singleListingCheckoutSpec);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public final SingleListingCheckoutNavigationSpec getSingleListingCheckoutSpec() {
        return this.singleListingCheckoutSpec;
    }

    public int hashCode() {
        return this.singleListingCheckoutSpec.hashCode() + (getReferrer().hashCode() * 31);
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NativeBuyItNowCheckoutBottomSheetKey(referrer=");
        h.append(getReferrer());
        h.append(", singleListingCheckoutSpec=");
        h.append(this.singleListingCheckoutSpec);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.singleListingCheckoutSpec.writeToParcel(parcel, i);
    }
}
