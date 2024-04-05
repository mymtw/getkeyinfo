package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CountrySpecificationCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class CountrySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new zzh();
    @SafeParcelable.Field(mo49213id = 2)
    private String zzi;

    @SafeParcelable.Constructor
    public CountrySpecification(@SafeParcelable.Param(mo49216id = 2) String str) {
        this.zzi = str;
    }

    public String getCountryCode() {
        return this.zzi;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
