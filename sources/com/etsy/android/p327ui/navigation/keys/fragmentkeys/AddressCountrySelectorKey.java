package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.addresses.AddressCountrySelectorFragment;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.AddressCountrySelectorKey */
public final class AddressCountrySelectorKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCountrySelectorKey> CREATOR = new Creator();
    private final Integer countryId;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.AddressCountrySelectorKey$Creator */
    public static final class Creator implements Parcelable.Creator<AddressCountrySelectorKey> {
        public final AddressCountrySelectorKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new AddressCountrySelectorKey(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final AddressCountrySelectorKey[] newArray(int i) {
            return new AddressCountrySelectorKey[i];
        }
    }

    public AddressCountrySelectorKey(String str, Integer num) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.countryId = num;
    }

    public static /* synthetic */ AddressCountrySelectorKey copy$default(AddressCountrySelectorKey addressCountrySelectorKey, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressCountrySelectorKey.getReferrer();
        }
        if ((i & 2) != 0) {
            num = addressCountrySelectorKey.countryId;
        }
        return addressCountrySelectorKey.copy(str, num);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Integer component2() {
        return this.countryId;
    }

    public final AddressCountrySelectorKey copy(String str, Integer num) {
        C19383o.m32797g(str, "referrer");
        return new AddressCountrySelectorKey(str, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressCountrySelectorKey)) {
            return false;
        }
        AddressCountrySelectorKey addressCountrySelectorKey = (AddressCountrySelectorKey) obj;
        return C19383o.m32792b(getReferrer(), addressCountrySelectorKey.getReferrer()) && C19383o.m32792b(this.countryId, addressCountrySelectorKey.countryId);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C15562d();
    }

    public String getClazzName() {
        String canonicalName = AddressCountrySelectorFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final Integer getCountryId() {
        return this.countryId;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        Integer num = this.countryId;
        if (num != null) {
            fVar.f28304a.put("KEY_ADDRESS_PRESELECTED_COUNTRY", num);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        Integer num = this.countryId;
        return hashCode + (num == null ? 0 : num.hashCode());
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
        StringBuilder h = C0072d.m201h("AddressCountrySelectorKey(referrer=");
        h.append(getReferrer());
        h.append(", countryId=");
        return C0023f.m109j(h, this.countryId, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        Integer num = this.countryId;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressCountrySelectorKey(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
