package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzk();
    @SafeParcelable.Field(mo49213id = 2)
    private long zzhd;
    @SafeParcelable.Field(mo49213id = 3)
    private long zzhe;

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(mo49216id = 2) long j, @SafeParcelable.Param(mo49216id = 3) long j2) {
        this.zzhd = j;
        this.zzhe = j2;
    }

    public final long getEndTimestamp() {
        return this.zzhe;
    }

    public final long getStartTimestamp() {
        return this.zzhd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zzhd);
        SafeParcelWriter.writeLong(parcel, 3, this.zzhe);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public TimeInterval() {
    }
}
