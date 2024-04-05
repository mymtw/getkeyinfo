package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.cart.googlepay.GooglePayCheckoutSpec;
import com.etsy.android.p327ui.core.listingnomapper.SingleListingCheckoutNavigationSpec;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey */
public final class SingleListingCheckoutKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleListingCheckoutKey> CREATOR = new Creator();
    private final GooglePayCheckoutSpec googlePayCheckoutSpec;
    private final String referrer;
    private final SingleListingCheckoutNavigationSpec singleListingCheckoutSpec;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey$Creator */
    public static final class Creator implements Parcelable.Creator<SingleListingCheckoutKey> {
        public final SingleListingCheckoutKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SingleListingCheckoutKey(parcel.readString(), SingleListingCheckoutNavigationSpec.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GooglePayCheckoutSpec.CREATOR.createFromParcel(parcel));
        }

        public final SingleListingCheckoutKey[] newArray(int i) {
            return new SingleListingCheckoutKey[i];
        }
    }

    public SingleListingCheckoutKey(String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, GooglePayCheckoutSpec googlePayCheckoutSpec2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(singleListingCheckoutNavigationSpec, "singleListingCheckoutSpec");
        this.referrer = str;
        this.singleListingCheckoutSpec = singleListingCheckoutNavigationSpec;
        this.googlePayCheckoutSpec = googlePayCheckoutSpec2;
    }

    public static /* synthetic */ SingleListingCheckoutKey copy$default(SingleListingCheckoutKey singleListingCheckoutKey, String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, GooglePayCheckoutSpec googlePayCheckoutSpec2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleListingCheckoutKey.getReferrer();
        }
        if ((i & 2) != 0) {
            singleListingCheckoutNavigationSpec = singleListingCheckoutKey.singleListingCheckoutSpec;
        }
        if ((i & 4) != 0) {
            googlePayCheckoutSpec2 = singleListingCheckoutKey.googlePayCheckoutSpec;
        }
        return singleListingCheckoutKey.copy(str, singleListingCheckoutNavigationSpec, googlePayCheckoutSpec2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SingleListingCheckoutNavigationSpec component2() {
        return this.singleListingCheckoutSpec;
    }

    public final GooglePayCheckoutSpec component3() {
        return this.googlePayCheckoutSpec;
    }

    public final SingleListingCheckoutKey copy(String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, GooglePayCheckoutSpec googlePayCheckoutSpec2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(singleListingCheckoutNavigationSpec, "singleListingCheckoutSpec");
        return new SingleListingCheckoutKey(str, singleListingCheckoutNavigationSpec, googlePayCheckoutSpec2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleListingCheckoutKey)) {
            return false;
        }
        SingleListingCheckoutKey singleListingCheckoutKey = (SingleListingCheckoutKey) obj;
        return C19383o.m32792b(getReferrer(), singleListingCheckoutKey.getReferrer()) && C19383o.m32792b(this.singleListingCheckoutSpec, singleListingCheckoutKey.singleListingCheckoutSpec) && C19383o.m32792b(this.googlePayCheckoutSpec, singleListingCheckoutKey.googlePayCheckoutSpec);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.SLIDE_BOTTOM;
    }

    public C12693a getBackstackGenerator() {
        return new C19388s();
    }

    public String getClazzName() {
        String canonicalName = EtsyWebFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final GooglePayCheckoutSpec getGooglePayCheckoutSpec() {
        return this.googlePayCheckoutSpec;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", 2);
        fVar.f28304a.put("checked_out_single_listing", Boolean.TRUE);
        fVar.f28304a.put("listing_id", this.singleListingCheckoutSpec.getListingId());
        fVar.f28304a.put(ResponseConstants.QUANTITY, this.singleListingCheckoutSpec.getQuantity());
        fVar.f28304a.put("payment_option", this.singleListingCheckoutSpec.getPaymentOption());
        GooglePayCheckoutSpec googlePayCheckoutSpec2 = this.googlePayCheckoutSpec;
        if (googlePayCheckoutSpec2 != null) {
            fVar.f28304a.put("google_pay_payment_data", googlePayCheckoutSpec2.getPaymentData());
            fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_CART, this.googlePayCheckoutSpec.getDataContract());
        }
        if (C18263b.m30839d0(this.singleListingCheckoutSpec.getOfferingId())) {
            fVar.f28304a.put(ResponseConstants.OFFERING_ID, this.singleListingCheckoutSpec.getOfferingId());
        } else if (C18263b.m30839d0(this.singleListingCheckoutSpec.getSelectedVariations())) {
            fVar.f28304a.put("listing_variation", this.singleListingCheckoutSpec.getSelectedVariations());
        }
        if (C18263b.m30839d0(this.singleListingCheckoutSpec.getPersonalization())) {
            fVar.f28304a.put(ResponseConstants.PERSONALIZATION, this.singleListingCheckoutSpec.getPersonalization());
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final SingleListingCheckoutNavigationSpec getSingleListingCheckoutSpec() {
        return this.singleListingCheckoutSpec;
    }

    public int hashCode() {
        int hashCode = (this.singleListingCheckoutSpec.hashCode() + (getReferrer().hashCode() * 31)) * 31;
        GooglePayCheckoutSpec googlePayCheckoutSpec2 = this.googlePayCheckoutSpec;
        return hashCode + (googlePayCheckoutSpec2 == null ? 0 : googlePayCheckoutSpec2.hashCode());
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
        StringBuilder h = C0072d.m201h("SingleListingCheckoutKey(referrer=");
        h.append(getReferrer());
        h.append(", singleListingCheckoutSpec=");
        h.append(this.singleListingCheckoutSpec);
        h.append(", googlePayCheckoutSpec=");
        h.append(this.googlePayCheckoutSpec);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.singleListingCheckoutSpec.writeToParcel(parcel, i);
        GooglePayCheckoutSpec googlePayCheckoutSpec2 = this.googlePayCheckoutSpec;
        if (googlePayCheckoutSpec2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        googlePayCheckoutSpec2.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleListingCheckoutKey(String str, SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, GooglePayCheckoutSpec googlePayCheckoutSpec2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, singleListingCheckoutNavigationSpec, (i & 4) != 0 ? null : googlePayCheckoutSpec2);
    }
}
