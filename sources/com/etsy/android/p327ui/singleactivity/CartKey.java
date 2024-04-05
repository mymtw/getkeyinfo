package com.etsy.android.p327ui.singleactivity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.singleactivity.CartKey */
public final class CartKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CartKey> CREATOR = new Creator();
    private final String placeholder;

    /* renamed from: com.etsy.android.ui.singleactivity.CartKey$Creator */
    public static final class Creator implements Parcelable.Creator<CartKey> {
        public final CartKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CartKey(parcel.readString());
        }

        public final CartKey[] newArray(int i) {
            return new CartKey[i];
        }
    }

    public CartKey() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CartKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    private final String component1() {
        return this.placeholder;
    }

    public static /* synthetic */ CartKey copy$default(CartKey cartKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cartKey.placeholder;
        }
        return cartKey.copy(str);
    }

    public final CartKey copy(String str) {
        C19383o.m32797g(str, "placeholder");
        return new CartKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartKey) && C19383o.m32792b(this.placeholder, ((CartKey) obj).placeholder);
    }

    public String fragmentClassName() {
        String canonicalName = CartWithSavedFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public int hashCode() {
        return this.placeholder.hashCode();
    }

    public boolean isSingleTop() {
        return true;
    }

    public String stackIdentifier() {
        return StackType.CART.name();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("CartKey(placeholder="), this.placeholder, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.placeholder);
    }

    public CartKey(String str) {
        C19383o.m32797g(str, "placeholder");
        this.placeholder = str;
    }
}
