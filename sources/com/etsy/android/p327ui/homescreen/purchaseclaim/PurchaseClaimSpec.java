package com.etsy.android.p327ui.homescreen.purchaseclaim;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimSpec */
public final class PurchaseClaimSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PurchaseClaimSpec> CREATOR = new Creator();
    private final String signature;
    private final String token;

    /* renamed from: com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimSpec$Creator */
    public static final class Creator implements Parcelable.Creator<PurchaseClaimSpec> {
        public final PurchaseClaimSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new PurchaseClaimSpec(parcel.readString(), parcel.readString());
        }

        public final PurchaseClaimSpec[] newArray(int i) {
            return new PurchaseClaimSpec[i];
        }
    }

    public PurchaseClaimSpec(String str, String str2) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C19383o.m32797g(str2, "signature");
        this.token = str;
        this.signature = str2;
    }

    public static /* synthetic */ PurchaseClaimSpec copy$default(PurchaseClaimSpec purchaseClaimSpec, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseClaimSpec.token;
        }
        if ((i & 2) != 0) {
            str2 = purchaseClaimSpec.signature;
        }
        return purchaseClaimSpec.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.signature;
    }

    public final PurchaseClaimSpec copy(String str, String str2) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C19383o.m32797g(str2, "signature");
        return new PurchaseClaimSpec(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseClaimSpec)) {
            return false;
        }
        PurchaseClaimSpec purchaseClaimSpec = (PurchaseClaimSpec) obj;
        return C19383o.m32792b(this.token, purchaseClaimSpec.token) && C19383o.m32792b(this.signature, purchaseClaimSpec.signature);
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.signature.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PurchaseClaimSpec(token=");
        h.append(this.token);
        h.append(", signature=");
        return C0391c.m1057c(h, this.signature, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.token);
        parcel.writeString(this.signature);
    }
}
