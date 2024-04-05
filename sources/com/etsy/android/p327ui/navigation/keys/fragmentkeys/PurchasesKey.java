package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.purchases.PurchasesFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.PurchasesKey */
public final class PurchasesKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PurchasesKey> CREATOR = new Creator();
    private final boolean overrideInternalReferrer;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.PurchasesKey$Creator */
    public static final class Creator implements Parcelable.Creator<PurchasesKey> {
        public final PurchasesKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new PurchasesKey(parcel.readString(), parcel.readBundle(), parcel.readInt() != 0);
        }

        public final PurchasesKey[] newArray(int i) {
            return new PurchasesKey[i];
        }
    }

    public PurchasesKey(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
        this.overrideInternalReferrer = z;
    }

    public static /* synthetic */ PurchasesKey copy$default(PurchasesKey purchasesKey, String str, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasesKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = purchasesKey.getReferrerBundle();
        }
        if ((i & 4) != 0) {
            z = purchasesKey.overrideInternalReferrer;
        }
        return purchasesKey.copy(str, bundle, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final boolean component3() {
        return this.overrideInternalReferrer;
    }

    public final PurchasesKey copy(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new PurchasesKey(str, bundle, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesKey)) {
            return false;
        }
        PurchasesKey purchasesKey = (PurchasesKey) obj;
        return C19383o.m32792b(getReferrer(), purchasesKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), purchasesKey.getReferrerBundle()) && this.overrideInternalReferrer == purchasesKey.overrideInternalReferrer;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(this.overrideInternalReferrer);
    }

    public String getClazzName() {
        String canonicalName = PurchasesFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public final boolean getOverrideInternalReferrer() {
        return this.overrideInternalReferrer;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public int hashCode() {
        int hashCode = ((getReferrer().hashCode() * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31;
        boolean z = this.overrideInternalReferrer;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("PurchasesKey(referrer=");
        h.append(getReferrer());
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", overrideInternalReferrer=");
        return C0391c.m1058d(h, this.overrideInternalReferrer, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeInt(this.overrideInternalReferrer ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasesKey(String str, Bundle bundle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? false : z);
    }
}
