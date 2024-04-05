package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MetadataImplCreator")
@SafeParcelable.Reserved({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzy();
    @SafeParcelable.Field(getter = "getEventStatus", mo49213id = 1)
    private int zza;
    @SafeParcelable.Field(getter = "isUploadable", mo49213id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "getCompletionToken", mo49213id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getAccountName", mo49213id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSsbContext", mo49213id = 5)
    private final byte[] zze;
    @SafeParcelable.Field(getter = "isContextOnly", mo49213id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) boolean z, @SafeParcelable.Param(mo49216id = 3) String str, @SafeParcelable.Param(mo49216id = 4) String str2, @SafeParcelable.Param(mo49216id = 5) byte[] bArr, @SafeParcelable.Param(mo49216id = 6) boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = str;
        this.zzd = str2;
        this.zze = bArr;
        this.zzf = z2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MetadataImpl { { eventStatus: '");
        h.append(this.zza);
        h.append("' } { uploadable: '");
        h.append(this.zzb);
        h.append("' } ");
        if (this.zzc != null) {
            h.append("{ completionToken: '");
            h.append(this.zzc);
            h.append("' } ");
        }
        if (this.zzd != null) {
            h.append("{ accountName: '");
            h.append(this.zzd);
            h.append("' } ");
        }
        if (this.zze != null) {
            h.append("{ ssbContext: [ ");
            for (byte hexString : this.zze) {
                h.append("0x");
                h.append(Integer.toHexString(hexString));
                h.append(" ");
            }
            h.append("] } ");
        }
        h.append("{ contextOnly: '");
        h.append(this.zzf);
        h.append("' } }");
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza(int i) {
        this.zza = i;
    }

    public zzb(boolean z, String str, String str2, byte[] bArr, boolean z2) {
        this.zza = 0;
        this.zzb = z;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = false;
    }
}
