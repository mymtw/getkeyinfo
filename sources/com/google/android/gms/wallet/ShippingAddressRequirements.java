package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "ShippingAddressRequirementsCreator")
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzan();
    @SafeParcelable.Field(mo49213id = 1)
    public ArrayList<String> zzen;

    /* renamed from: com.google.android.gms.wallet.ShippingAddressRequirements$a */
    public final class C15161a {
    }

    @SafeParcelable.Constructor
    public ShippingAddressRequirements(@SafeParcelable.Param(mo49216id = 1) ArrayList<String> arrayList) {
        this.zzen = arrayList;
    }

    public static C15161a newBuilder() {
        new ShippingAddressRequirements();
        return new C15161a();
    }

    public final ArrayList<String> getAllowedCountryCodes() {
        return this.zzen;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zzen, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private ShippingAddressRequirements() {
    }
}
