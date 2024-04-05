package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.C14498g;
import p623mm.C18246a;

@SafeParcelable.Class(creator = "ActionImplCreator")
@SafeParcelable.Reserved({1000})
public final class zzc extends AbstractSafeParcelable implements C18246a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "getActionType", mo49213id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getObjectName", mo49213id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getObjectUrl", mo49213id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getObjectSameAs", mo49213id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getMetadata", mo49213id = 5)
    private final zzb zze;
    @SafeParcelable.Field(getter = "getActionStatus", mo49213id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getPropertyBundle", mo49213id = 7)
    private final Bundle zzg;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) String str2, @SafeParcelable.Param(mo49216id = 3) String str3, @SafeParcelable.Param(mo49216id = 4) String str4, @SafeParcelable.Param(mo49216id = 5) zzb zzb2, @SafeParcelable.Param(mo49216id = 6) String str5, @SafeParcelable.Param(mo49216id = 7) Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzb2;
        this.zzf = str5;
        if (bundle != null) {
            this.zzg = bundle;
        } else {
            this.zzg = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzc.class.getClassLoader();
        C14498g.m23010a(classLoader);
        this.zzg.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ActionImpl { { actionType: '");
        h.append(this.zza);
        h.append("' } { objectName: '");
        h.append(this.zzb);
        h.append("' } { objectUrl: '");
        h.append(this.zzc);
        h.append("' } ");
        if (this.zzd != null) {
            h.append("{ objectSameAs: '");
            h.append(this.zzd);
            h.append("' } ");
        }
        if (this.zze != null) {
            h.append("{ metadata: '");
            h.append(this.zze.toString());
            h.append("' } ");
        }
        if (this.zzf != null) {
            h.append("{ actionStatus: '");
            h.append(this.zzf);
            h.append("' } ");
        }
        if (!this.zzg.isEmpty()) {
            h.append("{ ");
            h.append(this.zzg);
            h.append(" } ");
        }
        h.append("}");
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzb zza() {
        return this.zze;
    }
}
