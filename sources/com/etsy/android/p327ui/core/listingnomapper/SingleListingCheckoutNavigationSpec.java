package com.etsy.android.p327ui.core.listingnomapper;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.core.listingnomapper.SingleListingCheckoutNavigationSpec */
public final class SingleListingCheckoutNavigationSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleListingCheckoutNavigationSpec> CREATOR = new Creator();
    private final String listingId;
    private final String offeringId;
    private final PaymentOption paymentOption;
    private final String personalization;
    private final String quantity;
    private final String selectedVariations;

    /* renamed from: com.etsy.android.ui.core.listingnomapper.SingleListingCheckoutNavigationSpec$Creator */
    public static final class Creator implements Parcelable.Creator<SingleListingCheckoutNavigationSpec> {
        public final SingleListingCheckoutNavigationSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SingleListingCheckoutNavigationSpec(parcel.readString(), parcel.readString(), (PaymentOption) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final SingleListingCheckoutNavigationSpec[] newArray(int i) {
            return new SingleListingCheckoutNavigationSpec[i];
        }
    }

    public SingleListingCheckoutNavigationSpec(String str, String str2, PaymentOption paymentOption2, String str3, String str4, String str5) {
        C19383o.m32797g(str, "listingId");
        C19383o.m32797g(str2, ResponseConstants.QUANTITY);
        C19383o.m32797g(paymentOption2, "paymentOption");
        this.listingId = str;
        this.quantity = str2;
        this.paymentOption = paymentOption2;
        this.offeringId = str3;
        this.personalization = str4;
        this.selectedVariations = str5;
    }

    public static /* synthetic */ SingleListingCheckoutNavigationSpec copy$default(SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec, String str, String str2, PaymentOption paymentOption2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleListingCheckoutNavigationSpec.listingId;
        }
        if ((i & 2) != 0) {
            str2 = singleListingCheckoutNavigationSpec.quantity;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            paymentOption2 = singleListingCheckoutNavigationSpec.paymentOption;
        }
        PaymentOption paymentOption3 = paymentOption2;
        if ((i & 8) != 0) {
            str3 = singleListingCheckoutNavigationSpec.offeringId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = singleListingCheckoutNavigationSpec.personalization;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = singleListingCheckoutNavigationSpec.selectedVariations;
        }
        return singleListingCheckoutNavigationSpec.copy(str, str6, paymentOption3, str7, str8, str5);
    }

    public final String component1() {
        return this.listingId;
    }

    public final String component2() {
        return this.quantity;
    }

    public final PaymentOption component3() {
        return this.paymentOption;
    }

    public final String component4() {
        return this.offeringId;
    }

    public final String component5() {
        return this.personalization;
    }

    public final String component6() {
        return this.selectedVariations;
    }

    public final SingleListingCheckoutNavigationSpec copy(String str, String str2, PaymentOption paymentOption2, String str3, String str4, String str5) {
        C19383o.m32797g(str, "listingId");
        C19383o.m32797g(str2, ResponseConstants.QUANTITY);
        C19383o.m32797g(paymentOption2, "paymentOption");
        return new SingleListingCheckoutNavigationSpec(str, str2, paymentOption2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleListingCheckoutNavigationSpec)) {
            return false;
        }
        SingleListingCheckoutNavigationSpec singleListingCheckoutNavigationSpec = (SingleListingCheckoutNavigationSpec) obj;
        return C19383o.m32792b(this.listingId, singleListingCheckoutNavigationSpec.listingId) && C19383o.m32792b(this.quantity, singleListingCheckoutNavigationSpec.quantity) && C19383o.m32792b(this.paymentOption, singleListingCheckoutNavigationSpec.paymentOption) && C19383o.m32792b(this.offeringId, singleListingCheckoutNavigationSpec.offeringId) && C19383o.m32792b(this.personalization, singleListingCheckoutNavigationSpec.personalization) && C19383o.m32792b(this.selectedVariations, singleListingCheckoutNavigationSpec.selectedVariations);
    }

    public final String getListingId() {
        return this.listingId;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    public final String getPersonalization() {
        return this.personalization;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSelectedVariations() {
        return this.selectedVariations;
    }

    public int hashCode() {
        int hashCode = (this.paymentOption.hashCode() + C0023f.m105e(this.quantity, this.listingId.hashCode() * 31, 31)) * 31;
        String str = this.offeringId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.personalization;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedVariations;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SingleListingCheckoutNavigationSpec(listingId=");
        h.append(this.listingId);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", paymentOption=");
        h.append(this.paymentOption);
        h.append(", offeringId=");
        h.append(this.offeringId);
        h.append(", personalization=");
        h.append(this.personalization);
        h.append(", selectedVariations=");
        return C0391c.m1057c(h, this.selectedVariations, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.listingId);
        parcel.writeString(this.quantity);
        parcel.writeSerializable(this.paymentOption);
        parcel.writeString(this.offeringId);
        parcel.writeString(this.personalization);
        parcel.writeString(this.selectedVariations);
    }
}
