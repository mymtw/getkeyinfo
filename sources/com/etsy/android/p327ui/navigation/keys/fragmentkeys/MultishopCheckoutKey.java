package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p003a2.C0023f;
import p010a9.C0048b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.MultishopCheckoutKey */
public final class MultishopCheckoutKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultishopCheckoutKey> CREATOR = new Creator();
    private final String cartGroupId;
    private final String paymentMethod;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.MultishopCheckoutKey$Creator */
    public static final class Creator implements Parcelable.Creator<MultishopCheckoutKey> {
        public final MultishopCheckoutKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new MultishopCheckoutKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final MultishopCheckoutKey[] newArray(int i) {
            return new MultishopCheckoutKey[i];
        }
    }

    public MultishopCheckoutKey(String str, String str2, String str3) {
        C0048b.m167f(str, "referrer", str2, "cartGroupId", str3, "paymentMethod");
        this.referrer = str;
        this.cartGroupId = str2;
        this.paymentMethod = str3;
    }

    public static /* synthetic */ MultishopCheckoutKey copy$default(MultishopCheckoutKey multishopCheckoutKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multishopCheckoutKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = multishopCheckoutKey.cartGroupId;
        }
        if ((i & 4) != 0) {
            str3 = multishopCheckoutKey.paymentMethod;
        }
        return multishopCheckoutKey.copy(str, str2, str3);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.cartGroupId;
    }

    public final String component3() {
        return this.paymentMethod;
    }

    public final MultishopCheckoutKey copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "cartGroupId");
        C19383o.m32797g(str3, "paymentMethod");
        return new MultishopCheckoutKey(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultishopCheckoutKey)) {
            return false;
        }
        MultishopCheckoutKey multishopCheckoutKey = (MultishopCheckoutKey) obj;
        return C19383o.m32792b(getReferrer(), multishopCheckoutKey.getReferrer()) && C19383o.m32792b(this.cartGroupId, multishopCheckoutKey.cartGroupId) && C19383o.m32792b(this.paymentMethod, multishopCheckoutKey.paymentMethod);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.SLIDE_BOTTOM;
    }

    public C12693a getBackstackGenerator() {
        return new C19388s();
    }

    public final String getCartGroupId() {
        return this.cartGroupId;
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
        fVar.f28304a.put("type", 2);
        fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, Boolean.TRUE);
        fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_CART_GROUP_ID, this.cartGroupId);
        fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_PAYMENT_METHOD, this.paymentMethod);
        return fVar;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.paymentMethod.hashCode() + C0023f.m105e(this.cartGroupId, getReferrer().hashCode() * 31, 31);
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
        StringBuilder h = C0072d.m201h("MultishopCheckoutKey(referrer=");
        h.append(getReferrer());
        h.append(", cartGroupId=");
        h.append(this.cartGroupId);
        h.append(", paymentMethod=");
        return C0391c.m1057c(h, this.paymentMethod, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.cartGroupId);
        parcel.writeString(this.paymentMethod);
    }
}
