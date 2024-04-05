package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import p506ak.C14016b;

@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
@VisibleForTesting
public final class zzbh extends AbstractSafeParcelable implements C14016b {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    @SafeParcelable.Field(getter = "getRequestId", mo49213id = 1)
    private final String zzad;
    @SafeParcelable.Field(getter = "getTransitionTypes", mo49213id = 7)
    private final int zzae;
    @SafeParcelable.Field(getter = "getType", mo49213id = 3)
    private final short zzag;
    @SafeParcelable.Field(getter = "getLatitude", mo49213id = 4)
    private final double zzah;
    @SafeParcelable.Field(getter = "getLongitude", mo49213id = 5)
    private final double zzai;
    @SafeParcelable.Field(getter = "getRadius", mo49213id = 6)
    private final float zzaj;
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", mo49213id = 8)
    private final int zzak;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", mo49213id = 9)
    private final int zzal;
    @SafeParcelable.Field(getter = "getExpirationTime", mo49213id = 2)
    private final long zzdo;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 7) int i, @SafeParcelable.Param(mo49216id = 3) short s, @SafeParcelable.Param(mo49216id = 4) double d, @SafeParcelable.Param(mo49216id = 5) double d2, @SafeParcelable.Param(mo49216id = 6) float f, @SafeParcelable.Param(mo49216id = 2) long j, @SafeParcelable.Param(mo49216id = 8) int i2, @SafeParcelable.Param(mo49216id = 9) int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.zzag = s;
                this.zzad = str;
                this.zzah = d;
                this.zzai = d2;
                this.zzaj = f;
                this.zzdo = j;
                this.zzae = i4;
                this.zzak = i2;
                this.zzal = i3;
                return;
            }
            throw new IllegalArgumentException(C0072d.m200g(46, "No supported transition specified: ", i));
        }
    }

    public static zzbh zza(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzbh createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.zzaj == zzbh.zzaj && this.zzah == zzbh.zzah && this.zzai == zzbh.zzai && this.zzag == zzbh.zzag;
    }

    public final String getRequestId() {
        return this.zzad;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzah);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzai);
        return ((((Float.floatToIntBits(this.zzaj) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31)) * 31) + this.zzag) * 31) + this.zzae;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.zzag != 1 ? null : "CIRCLE";
        objArr[1] = this.zzad.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.zzae);
        objArr[3] = Double.valueOf(this.zzah);
        objArr[4] = Double.valueOf(this.zzai);
        objArr[5] = Float.valueOf(this.zzaj);
        objArr[6] = Integer.valueOf(this.zzak / 1000);
        objArr[7] = Integer.valueOf(this.zzal);
        objArr[8] = Long.valueOf(this.zzdo);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getRequestId(), false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzdo);
        SafeParcelWriter.writeShort(parcel, 3, this.zzag);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzah);
        SafeParcelWriter.writeDouble(parcel, 5, this.zzai);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzaj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzae);
        SafeParcelWriter.writeInt(parcel, 8, this.zzak);
        SafeParcelWriter.writeInt(parcel, 9, this.zzal);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
