package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CartWithSavedKey */
public final class CartWithSavedKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CartWithSavedKey> CREATOR = new Creator();
    public static final C10696a Companion = new C10696a();
    public static final String SAVED_TAB = "saved";
    private final String clazzName;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String tab;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CartWithSavedKey$Creator */
    public static final class Creator implements Parcelable.Creator<CartWithSavedKey> {
        public final CartWithSavedKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CartWithSavedKey(parcel.readString(), parcel.readString(), parcel.readBundle());
        }

        public final CartWithSavedKey[] newArray(int i) {
            return new CartWithSavedKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CartWithSavedKey$a */
    public static final class C10696a {
    }

    public CartWithSavedKey(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.tab = str2;
        this.referrerBundle = bundle;
        String canonicalName = CartWithSavedFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        this.clazzName = canonicalName;
    }

    public static /* synthetic */ CartWithSavedKey copy$default(CartWithSavedKey cartWithSavedKey, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cartWithSavedKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = cartWithSavedKey.tab;
        }
        if ((i & 4) != 0) {
            bundle = cartWithSavedKey.getReferrerBundle();
        }
        return cartWithSavedKey.copy(str, str2, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.tab;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final CartWithSavedKey copy(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new CartWithSavedKey(str, str2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartWithSavedKey)) {
            return false;
        }
        CartWithSavedKey cartWithSavedKey = (CartWithSavedKey) obj;
        return C19383o.m32792b(getReferrer(), cartWithSavedKey.getReferrer()) && C19383o.m32792b(this.tab, cartWithSavedKey.tab) && C19383o.m32792b(getReferrerBundle(), cartWithSavedKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C19382n();
    }

    public String getClazzName() {
        return this.clazzName;
    }

    public boolean getClearBackstack() {
        return true;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        if (C18263b.m30839d0(this.tab)) {
            fVar.f28304a.put(ResponseConstants.PAGE_LINK, this.tab);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getTab() {
        return this.tab;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.tab;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode2 + i;
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
        StringBuilder h = C0072d.m201h("CartWithSavedKey(referrer=");
        h.append(getReferrer());
        h.append(", tab=");
        h.append(this.tab);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.tab);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CartWithSavedKey(String str, String str2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bundle);
    }
}
