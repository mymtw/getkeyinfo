package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetSaveInstrumentDetailsResponseCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field(mo49213id = 1)
    private String[] zzez;
    @SafeParcelable.Field(mo49213id = 2)
    private int[] zzfa;
    @SafeParcelable.Field(mo49213id = 3)
    private RemoteViews zzfb;
    @SafeParcelable.Field(mo49213id = 4)
    private byte[] zzfc;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(mo49216id = 1) String[] strArr, @SafeParcelable.Param(mo49216id = 2) int[] iArr, @SafeParcelable.Param(mo49216id = 3) RemoteViews remoteViews, @SafeParcelable.Param(mo49216id = 4) byte[] bArr) {
        this.zzez = strArr;
        this.zzfa = iArr;
        this.zzfb = remoteViews;
        this.zzfc = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zzez, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.zzfa, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfb, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzfc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzl() {
    }
}
