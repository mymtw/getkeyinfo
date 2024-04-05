package com.etsy.android.lib.models.apiv3.cart;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GooglePayData implements GooglePayDataContract, Parcelable, ITrackedObject, Serializable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePayData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long serialVersionUID = 1;
    private final long cartId;
    private final boolean isGiftCardApplied;
    private final String messageToSeller;
    private final String shopName;
    private final EtsyMoney total;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<GooglePayData> {
        public final GooglePayData createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GooglePayData(parcel.readLong(), (EtsyMoney) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        public final GooglePayData[] newArray(int i) {
            return new GooglePayData[i];
        }
    }

    public GooglePayData(long j, EtsyMoney etsyMoney, String str, boolean z, String str2) {
        C19383o.m32797g(etsyMoney, ResponseConstants.TOTAL);
        C19383o.m32797g(str, "shopName");
        this.cartId = j;
        this.total = etsyMoney;
        this.shopName = str;
        this.isGiftCardApplied = z;
        this.messageToSeller = str2;
    }

    public static /* synthetic */ GooglePayData copy$default(GooglePayData googlePayData, long j, EtsyMoney etsyMoney, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = googlePayData.getCartId();
        }
        long j2 = j;
        if ((i & 2) != 0) {
            etsyMoney = googlePayData.getTotal();
        }
        EtsyMoney etsyMoney2 = etsyMoney;
        if ((i & 4) != 0) {
            str = googlePayData.getShopName();
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = googlePayData.isGiftCardApplied();
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = googlePayData.getMessageToSeller();
        }
        return googlePayData.copy(j2, etsyMoney2, str3, z2, str2);
    }

    public final long component1() {
        return getCartId();
    }

    public final EtsyMoney component2() {
        return getTotal();
    }

    public final String component3() {
        return getShopName();
    }

    public final boolean component4() {
        return isGiftCardApplied();
    }

    public final String component5() {
        return getMessageToSeller();
    }

    public final GooglePayData copy(long j, EtsyMoney etsyMoney, String str, boolean z, String str2) {
        C19383o.m32797g(etsyMoney, ResponseConstants.TOTAL);
        C19383o.m32797g(str, "shopName");
        return new GooglePayData(j, etsyMoney, str, z, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayData)) {
            return false;
        }
        GooglePayData googlePayData = (GooglePayData) obj;
        return getCartId() == googlePayData.getCartId() && C19383o.m32792b(getTotal(), googlePayData.getTotal()) && C19383o.m32792b(getShopName(), googlePayData.getShopName()) && isGiftCardApplied() == googlePayData.isGiftCardApplied() && C19383o.m32792b(getMessageToSeller(), googlePayData.getMessageToSeller());
    }

    public long getCartId() {
        return this.cartId;
    }

    public String getMessageToSeller() {
        return this.messageToSeller;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    public String getShopName() {
        return this.shopName;
    }

    public EtsyMoney getTotal() {
        return this.total;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    @JsonIgnore
    public String getTrackingName() {
        return "";
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.CART_ID, Long.valueOf(getCartId())), new Pair(PredefinedAnalyticsProperty.PAYMENT_METHOD, "google_pay"));
    }

    public int hashCode() {
        int hashCode = (getShopName().hashCode() + ((getTotal().hashCode() + (Long.hashCode(getCartId()) * 31)) * 31)) * 31;
        boolean isGiftCardApplied2 = isGiftCardApplied();
        if (isGiftCardApplied2) {
            isGiftCardApplied2 = true;
        }
        return ((hashCode + (isGiftCardApplied2 ? 1 : 0)) * 31) + (getMessageToSeller() == null ? 0 : getMessageToSeller().hashCode());
    }

    public boolean isGiftCardApplied() {
        return this.isGiftCardApplied;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GooglePayData(cartId=");
        h.append(getCartId());
        h.append(", total=");
        h.append(getTotal());
        h.append(", shopName=");
        h.append(getShopName());
        h.append(", isGiftCardApplied=");
        h.append(isGiftCardApplied());
        h.append(", messageToSeller=");
        h.append(getMessageToSeller());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeLong(this.cartId);
        parcel.writeSerializable(this.total);
        parcel.writeString(this.shopName);
        parcel.writeInt(this.isGiftCardApplied ? 1 : 0);
        parcel.writeString(this.messageToSeller);
    }
}
