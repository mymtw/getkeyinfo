package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.OrderTrackingKey */
public final class OrderTrackingKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderTrackingKey> CREATOR = new Creator();
    private final EtsyId receiptId;
    private final String referrer;
    private final Bundle referrerBundle;
    private final EtsyId trackingId;
    private final String trackingUrl;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.OrderTrackingKey$Creator */
    public static final class Creator implements Parcelable.Creator<OrderTrackingKey> {
        public final OrderTrackingKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new OrderTrackingKey(parcel.readString(), parcel.readString(), (EtsyId) parcel.readSerializable(), (EtsyId) parcel.readSerializable(), parcel.readBundle());
        }

        public final OrderTrackingKey[] newArray(int i) {
            return new OrderTrackingKey[i];
        }
    }

    public OrderTrackingKey(String str, String str2, EtsyId etsyId, EtsyId etsyId2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.trackingUrl = str2;
        this.receiptId = etsyId;
        this.trackingId = etsyId2;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ OrderTrackingKey copy$default(OrderTrackingKey orderTrackingKey, String str, String str2, EtsyId etsyId, EtsyId etsyId2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderTrackingKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = orderTrackingKey.trackingUrl;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            etsyId = orderTrackingKey.receiptId;
        }
        EtsyId etsyId3 = etsyId;
        if ((i & 8) != 0) {
            etsyId2 = orderTrackingKey.trackingId;
        }
        EtsyId etsyId4 = etsyId2;
        if ((i & 16) != 0) {
            bundle = orderTrackingKey.getReferrerBundle();
        }
        return orderTrackingKey.copy(str, str3, etsyId3, etsyId4, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.trackingUrl;
    }

    public final EtsyId component3() {
        return this.receiptId;
    }

    public final EtsyId component4() {
        return this.trackingId;
    }

    public final Bundle component5() {
        return getReferrerBundle();
    }

    public final OrderTrackingKey copy(String str, String str2, EtsyId etsyId, EtsyId etsyId2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new OrderTrackingKey(str, str2, etsyId, etsyId2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderTrackingKey)) {
            return false;
        }
        OrderTrackingKey orderTrackingKey = (OrderTrackingKey) obj;
        return C19383o.m32792b(getReferrer(), orderTrackingKey.getReferrer()) && C19383o.m32792b(this.trackingUrl, orderTrackingKey.trackingUrl) && C19383o.m32792b(this.receiptId, orderTrackingKey.receiptId) && C19383o.m32792b(this.trackingId, orderTrackingKey.trackingId) && C19383o.m32792b(getReferrerBundle(), orderTrackingKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C17782b();
    }

    public String getClazzName() {
        String canonicalName = EtsyWebFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", 3);
        if (C18263b.m30839d0(this.trackingUrl)) {
            fVar.f28304a.put("url", this.trackingUrl);
        } else {
            EtsyId etsyId = this.receiptId;
            if (!(etsyId == null || this.trackingId == null)) {
                fVar.f28304a.put(ResponseConstants.RECEIPT_ID, etsyId);
                fVar.f28304a.put(ResponseConstants.RECEIPT_SHIPPING_ID, this.trackingId);
            }
        }
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public final EtsyId getReceiptId() {
        return this.receiptId;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final EtsyId getTrackingId() {
        return this.trackingId;
    }

    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.trackingUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EtsyId etsyId = this.receiptId;
        int hashCode3 = (hashCode2 + (etsyId == null ? 0 : etsyId.hashCode())) * 31;
        EtsyId etsyId2 = this.trackingId;
        int hashCode4 = (hashCode3 + (etsyId2 == null ? 0 : etsyId2.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode4 + i;
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
        StringBuilder h = C0072d.m201h("OrderTrackingKey(referrer=");
        h.append(getReferrer());
        h.append(", trackingUrl=");
        h.append(this.trackingUrl);
        h.append(", receiptId=");
        h.append(this.receiptId);
        h.append(", trackingId=");
        h.append(this.trackingId);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.trackingUrl);
        parcel.writeSerializable(this.receiptId);
        parcel.writeSerializable(this.trackingId);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderTrackingKey(String str, String str2, EtsyId etsyId, EtsyId etsyId2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : etsyId, (i & 8) != 0 ? null : etsyId2, (i & 16) != 0 ? null : bundle);
    }
}
