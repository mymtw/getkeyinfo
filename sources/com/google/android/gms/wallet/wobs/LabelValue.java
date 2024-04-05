package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LabelValueCreator")
@SafeParcelable.Reserved({1})
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new zzc();
    @SafeParcelable.Field(mo49213id = 2)
    private String label;
    @SafeParcelable.Field(mo49213id = 3)
    private String value;

    @SafeParcelable.Constructor
    public LabelValue(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2) {
        this.label = str;
        this.value = str2;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.label, false);
        SafeParcelWriter.writeString(parcel, 3, this.value, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LabelValue() {
    }
}
