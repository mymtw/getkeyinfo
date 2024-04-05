package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    @SafeParcelable.Field(getter = "getCallingPackage", mo49213id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo49213id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo49213id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCallingContextBinder", mo49213id = 4, type = "android.os.IBinder")
    private final Context zzd;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", mo49213id = 5)
    private final boolean zze;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) boolean z, @SafeParcelable.Param(mo49216id = 3) boolean z2, @SafeParcelable.Param(mo49216id = 4) IBinder iBinder, @SafeParcelable.Param(mo49216id = 5) boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
