package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", mo49213id = 1)
    private boolean zzt;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", mo49213id = 2)
    private long zzu;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", mo49213id = 3)
    private float zzv;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", mo49213id = 4)
    private long zzw;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", mo49213id = 5)
    private int zzx;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(mo49216id = 1) boolean z, @SafeParcelable.Param(mo49216id = 2) long j, @SafeParcelable.Param(mo49216id = 3) float f, @SafeParcelable.Param(mo49216id = 4) long j2, @SafeParcelable.Param(mo49216id = 5) int i) {
        this.zzt = z;
        this.zzu = j;
        this.zzv = f;
        this.zzw = j2;
        this.zzx = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.zzt == zzj.zzt && this.zzu == zzj.zzu && Float.compare(this.zzv, zzj.zzv) == 0 && this.zzw == zzj.zzw && this.zzx == zzj.zzx;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zzt), Long.valueOf(this.zzu), Float.valueOf(this.zzv), Long.valueOf(this.zzw), Integer.valueOf(this.zzx));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeviceOrientationRequest[mShouldUseMag=");
        h.append(this.zzt);
        h.append(" mMinimumSamplingPeriodMs=");
        h.append(this.zzu);
        h.append(" mSmallestAngleChangeRadians=");
        h.append(this.zzv);
        long j = this.zzw;
        if (j != Long.MAX_VALUE) {
            h.append(" expireIn=");
            h.append(j - SystemClock.elapsedRealtime());
            h.append("ms");
        }
        if (this.zzx != Integer.MAX_VALUE) {
            h.append(" num=");
            h.append(this.zzx);
        }
        h.append(']');
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzt);
        SafeParcelWriter.writeLong(parcel, 2, this.zzu);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzv);
        SafeParcelWriter.writeLong(parcel, 4, this.zzw);
        SafeParcelWriter.writeInt(parcel, 5, this.zzx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
