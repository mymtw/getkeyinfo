package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.addresses.AddressDetailFragment;
import com.etsy.android.p327ui.user.addresses.AddressItemUI;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.AddressDetailKey */
public final class AddressDetailKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressDetailKey> CREATOR = new Creator();
    private final AddressItemUI addressItem;
    private final Integer countryId;
    private final String countryName;
    private final boolean hideDefaultAddressToggle;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.AddressDetailKey$Creator */
    public static final class Creator implements Parcelable.Creator<AddressDetailKey> {
        public final AddressDetailKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new AddressDetailKey(parcel.readString(), parcel.readInt() == 0 ? null : AddressItemUI.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        public final AddressDetailKey[] newArray(int i) {
            return new AddressDetailKey[i];
        }
    }

    public AddressDetailKey(String str, AddressItemUI addressItemUI, Integer num, String str2, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.addressItem = addressItemUI;
        this.countryId = num;
        this.countryName = str2;
        this.hideDefaultAddressToggle = z;
    }

    public static /* synthetic */ AddressDetailKey copy$default(AddressDetailKey addressDetailKey, String str, AddressItemUI addressItemUI, Integer num, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressDetailKey.getReferrer();
        }
        if ((i & 2) != 0) {
            addressItemUI = addressDetailKey.addressItem;
        }
        AddressItemUI addressItemUI2 = addressItemUI;
        if ((i & 4) != 0) {
            num = addressDetailKey.countryId;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = addressDetailKey.countryName;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = addressDetailKey.hideDefaultAddressToggle;
        }
        return addressDetailKey.copy(str, addressItemUI2, num2, str3, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final AddressItemUI component2() {
        return this.addressItem;
    }

    public final Integer component3() {
        return this.countryId;
    }

    public final String component4() {
        return this.countryName;
    }

    public final boolean component5() {
        return this.hideDefaultAddressToggle;
    }

    public final AddressDetailKey copy(String str, AddressItemUI addressItemUI, Integer num, String str2, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new AddressDetailKey(str, addressItemUI, num, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDetailKey)) {
            return false;
        }
        AddressDetailKey addressDetailKey = (AddressDetailKey) obj;
        return C19383o.m32792b(getReferrer(), addressDetailKey.getReferrer()) && C19383o.m32792b(this.addressItem, addressDetailKey.addressItem) && C19383o.m32792b(this.countryId, addressDetailKey.countryId) && C19383o.m32792b(this.countryName, addressDetailKey.countryName) && this.hideDefaultAddressToggle == addressDetailKey.hideDefaultAddressToggle;
    }

    public final AddressItemUI getAddressItem() {
        return this.addressItem;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C15562d();
    }

    public String getClazzName() {
        String canonicalName = AddressDetailFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final Integer getCountryId() {
        return this.countryId;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final boolean getHideDefaultAddressToggle() {
        return this.hideDefaultAddressToggle;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        AddressItemUI addressItemUI = this.addressItem;
        if (addressItemUI != null) {
            fVar.f28304a.put("KEY_USER_ADDRESS", addressItemUI);
            fVar.f28304a.put("ADDRESS_DETAIL_ACTION", 1);
        } else {
            Integer num = this.countryId;
            if (num == null || this.countryName == null) {
                throw new UnsupportedNavigationException(this + " requires either address item or country data (id & name)");
            }
            fVar.f28304a.put("KEY_ADDRESSDETAIL_COUNTRY_ID", num);
            fVar.f28304a.put("KEY_ADDRESSDETAIL_COUNTRY_NAME", this.countryName);
            fVar.f28304a.put("ADDRESS_DETAIL_ACTION", 0);
            fVar.f28304a.put("HIDE_DEFAULT_ADDRESS_TOGGLE", Boolean.valueOf(this.hideDefaultAddressToggle));
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
        AddressItemUI addressItemUI = this.addressItem;
        int i = 0;
        int hashCode2 = (hashCode + (addressItemUI == null ? 0 : addressItemUI.hashCode())) * 31;
        Integer num = this.countryId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.countryName;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.hideDefaultAddressToggle;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("AddressDetailKey(referrer=");
        h.append(getReferrer());
        h.append(", addressItem=");
        h.append(this.addressItem);
        h.append(", countryId=");
        h.append(this.countryId);
        h.append(", countryName=");
        h.append(this.countryName);
        h.append(", hideDefaultAddressToggle=");
        return C0391c.m1058d(h, this.hideDefaultAddressToggle, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        AddressItemUI addressItemUI = this.addressItem;
        if (addressItemUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressItemUI.writeToParcel(parcel, i);
        }
        Integer num = this.countryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeString(this.countryName);
        parcel.writeInt(this.hideDefaultAddressToggle ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressDetailKey(String str, AddressItemUI addressItemUI, Integer num, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : addressItemUI, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z);
    }
}
