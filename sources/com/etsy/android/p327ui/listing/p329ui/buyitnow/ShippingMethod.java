package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.ShippingMethod */
public final class ShippingMethod implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShippingMethod> CREATOR = new Creator();
    private final String cost;
    private final String estimatedDeliveryDateLabel;
    private final String title;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.ShippingMethod$Creator */
    public static final class Creator implements Parcelable.Creator<ShippingMethod> {
        public final ShippingMethod createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ShippingMethod(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final ShippingMethod[] newArray(int i) {
            return new ShippingMethod[i];
        }
    }

    public ShippingMethod() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public ShippingMethod(String str, String str2, String str3) {
        C0048b.m167f(str, "title", str2, "estimatedDeliveryDateLabel", str3, ResponseConstants.COST);
        this.title = str;
        this.estimatedDeliveryDateLabel = str2;
        this.cost = str3;
    }

    public static /* synthetic */ ShippingMethod copy$default(ShippingMethod shippingMethod, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingMethod.title;
        }
        if ((i & 2) != 0) {
            str2 = shippingMethod.estimatedDeliveryDateLabel;
        }
        if ((i & 4) != 0) {
            str3 = shippingMethod.cost;
        }
        return shippingMethod.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.estimatedDeliveryDateLabel;
    }

    public final String component3() {
        return this.cost;
    }

    public final ShippingMethod copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "estimatedDeliveryDateLabel");
        C19383o.m32797g(str3, ResponseConstants.COST);
        return new ShippingMethod(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingMethod)) {
            return false;
        }
        ShippingMethod shippingMethod = (ShippingMethod) obj;
        return C19383o.m32792b(this.title, shippingMethod.title) && C19383o.m32792b(this.estimatedDeliveryDateLabel, shippingMethod.estimatedDeliveryDateLabel) && C19383o.m32792b(this.cost, shippingMethod.cost);
    }

    public final String formattedTitle() {
        return this.cost + " - " + this.title;
    }

    public final String getCost() {
        return this.cost;
    }

    public final String getEstimatedDeliveryDateLabel() {
        return this.estimatedDeliveryDateLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cost.hashCode() + C0023f.m105e(this.estimatedDeliveryDateLabel, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingMethod(title=");
        h.append(this.title);
        h.append(", estimatedDeliveryDateLabel=");
        h.append(this.estimatedDeliveryDateLabel);
        h.append(", cost=");
        return C0391c.m1057c(h, this.cost, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.estimatedDeliveryDateLabel);
        parcel.writeString(this.cost);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingMethod(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
