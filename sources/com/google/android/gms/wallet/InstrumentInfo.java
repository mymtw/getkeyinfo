package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InstrumentInfoCreator")
@SafeParcelable.Reserved({1})
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final int CARD_CLASS_CREDIT = 1;
    public static final int CARD_CLASS_DEBIT = 2;
    public static final int CARD_CLASS_PREPAID = 3;
    public static final int CARD_CLASS_UNKNOWN = 0;
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getCardClass", mo49213id = 4)
    private int zzah;
    @SafeParcelable.Field(getter = "getInstrumentType", mo49213id = 2)
    private String zzbt;
    @SafeParcelable.Field(getter = "getInstrumentDetails", mo49213id = 3)
    private String zzbu;

    @SafeParcelable.Constructor
    public InstrumentInfo(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) int i) {
        this.zzbt = str;
        this.zzbu = str2;
        this.zzah = i;
    }

    public final int getCardClass() {
        int i = this.zzah;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    public final String getInstrumentDetails() {
        return this.zzbu;
    }

    public final String getInstrumentType() {
        return this.zzbt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getInstrumentType(), false);
        SafeParcelWriter.writeString(parcel, 3, getInstrumentDetails(), false);
        SafeParcelWriter.writeInt(parcel, 4, getCardClass());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private InstrumentInfo() {
    }
}
