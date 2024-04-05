package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.google.android.gms.wallet.PaymentData;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GooglePayCheckoutKey */
public final class GooglePayCheckoutKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePayCheckoutKey> CREATOR = new Creator();
    private final GooglePayDataContract dataContract;
    private final boolean isMSCO;
    private final PaymentData paymentData;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GooglePayCheckoutKey$Creator */
    public static final class Creator implements Parcelable.Creator<GooglePayCheckoutKey> {
        public final GooglePayCheckoutKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GooglePayCheckoutKey(parcel.readString(), (GooglePayDataContract) parcel.readSerializable(), (PaymentData) parcel.readParcelable(GooglePayCheckoutKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        public final GooglePayCheckoutKey[] newArray(int i) {
            return new GooglePayCheckoutKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GooglePayCheckoutKey$a */
    public static final class C10701a {

        /* renamed from: e */
        public static final /* synthetic */ C19410j<Object>[] f23600e;

        /* renamed from: a */
        public String f23601a;

        /* renamed from: b */
        public GooglePayDataContract f23602b;

        /* renamed from: c */
        public PaymentData f23603c;

        /* renamed from: d */
        public final C19919a f23604d = new C19919a();

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C10701a.class, "isMSCO", "isMSCO()Z", 0);
            C19386q.f43269a.getClass();
            f23600e = new C19410j[]{mutablePropertyReference1Impl};
        }
    }

    public GooglePayCheckoutKey(String str, GooglePayDataContract googlePayDataContract, PaymentData paymentData2, boolean z) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(googlePayDataContract, "dataContract");
        C19383o.m32797g(paymentData2, "paymentData");
        this.referrer = str;
        this.dataContract = googlePayDataContract;
        this.paymentData = paymentData2;
        this.isMSCO = z;
    }

    public static /* synthetic */ GooglePayCheckoutKey copy$default(GooglePayCheckoutKey googlePayCheckoutKey, String str, GooglePayDataContract googlePayDataContract, PaymentData paymentData2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayCheckoutKey.getReferrer();
        }
        if ((i & 2) != 0) {
            googlePayDataContract = googlePayCheckoutKey.dataContract;
        }
        if ((i & 4) != 0) {
            paymentData2 = googlePayCheckoutKey.paymentData;
        }
        if ((i & 8) != 0) {
            z = googlePayCheckoutKey.isMSCO;
        }
        return googlePayCheckoutKey.copy(str, googlePayDataContract, paymentData2, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final GooglePayDataContract component2() {
        return this.dataContract;
    }

    public final PaymentData component3() {
        return this.paymentData;
    }

    public final boolean component4() {
        return this.isMSCO;
    }

    public final GooglePayCheckoutKey copy(String str, GooglePayDataContract googlePayDataContract, PaymentData paymentData2, boolean z) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(googlePayDataContract, "dataContract");
        C19383o.m32797g(paymentData2, "paymentData");
        return new GooglePayCheckoutKey(str, googlePayDataContract, paymentData2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayCheckoutKey)) {
            return false;
        }
        GooglePayCheckoutKey googlePayCheckoutKey = (GooglePayCheckoutKey) obj;
        return C19383o.m32792b(getReferrer(), googlePayCheckoutKey.getReferrer()) && C19383o.m32792b(this.dataContract, googlePayCheckoutKey.dataContract) && C19383o.m32792b(this.paymentData, googlePayCheckoutKey.paymentData) && this.isMSCO == googlePayCheckoutKey.isMSCO;
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

    public final GooglePayDataContract getDataContract() {
        return this.dataContract;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", 2);
        fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_CART, this.dataContract);
        fVar.f28304a.put("google_pay_payment_data", this.paymentData);
        fVar.f28304a.put(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, Boolean.valueOf(this.isMSCO));
        return fVar;
    }

    public final PaymentData getPaymentData() {
        return this.paymentData;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int hashCode = this.dataContract.hashCode();
        int hashCode2 = (this.paymentData.hashCode() + ((hashCode + (getReferrer().hashCode() * 31)) * 31)) * 31;
        boolean z = this.isMSCO;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public final boolean isMSCO() {
        return this.isMSCO;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GooglePayCheckoutKey(referrer=");
        h.append(getReferrer());
        h.append(", dataContract=");
        h.append(this.dataContract);
        h.append(", paymentData=");
        h.append(this.paymentData);
        h.append(", isMSCO=");
        return C0391c.m1058d(h, this.isMSCO, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.dataContract);
        parcel.writeParcelable(this.paymentData, i);
        parcel.writeInt(this.isMSCO ? 1 : 0);
    }
}
