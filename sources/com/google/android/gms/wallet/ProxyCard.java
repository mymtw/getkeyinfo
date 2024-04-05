package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProxyCardCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new zzal();
    @SafeParcelable.Field(mo49213id = 2)
    private String zzej;
    @SafeParcelable.Field(mo49213id = 3)
    private String zzek;
    @SafeParcelable.Field(mo49213id = 4)
    private int zzel;
    @SafeParcelable.Field(mo49213id = 5)
    private int zzem;

    @SafeParcelable.Constructor
    public ProxyCard(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) int i, @SafeParcelable.Param(mo49216id = 5) int i2) {
        this.zzej = str;
        this.zzek = str2;
        this.zzel = i;
        this.zzem = i2;
    }

    public final String getCvn() {
        return this.zzek;
    }

    public final int getExpirationMonth() {
        return this.zzel;
    }

    public final int getExpirationYear() {
        return this.zzem;
    }

    public final String getPan() {
        return this.zzej;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzej, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzek, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzel);
        SafeParcelWriter.writeInt(parcel, 5, this.zzem);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
