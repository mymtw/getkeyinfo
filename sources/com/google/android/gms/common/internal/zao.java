package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MethodInvocationCreator")
public final class zao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zao> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getMethodKey", mo49213id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResultStatusCode", mo49213id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", mo49213id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getStartTimeMillis", mo49213id = 4)
    private final long zad;
    @SafeParcelable.Field(getter = "getEndTimeMillis", mo49213id = 5)
    private final long zae;

    @SafeParcelable.Constructor
    public zao(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) int i2, @SafeParcelable.Param(mo49216id = 3) int i3, @SafeParcelable.Param(mo49216id = 4) long j, @SafeParcelable.Param(mo49216id = 5) long j2) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
