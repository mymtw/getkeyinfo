package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.C14498g;

@SafeParcelable.Class(creator = "MetadataCreator")
@SafeParcelable.Reserved({1000})
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzx();
    @SafeParcelable.Field(getter = "getWorksOffline", mo49213id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "getScore", mo49213id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getAccountEmail", mo49213id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getPropertyBundle", mo49213id = 4)
    private final Bundle zzd;
    @SafeParcelable.Field(getter = "getEmbeddingProperties", mo49213id = 5)
    private final Bundle zze;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(mo49216id = 1) boolean z, @SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) String str, @SafeParcelable.Param(mo49216id = 4) Bundle bundle, @SafeParcelable.Param(mo49216id = 5) Bundle bundle2) {
        this.zza = z;
        this.zzb = i;
        this.zzc = str;
        this.zzd = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.zze = bundle2;
        ClassLoader classLoader = zzac.class.getClassLoader();
        C14498g.m23010a(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzac = (zzac) obj;
        return Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(zzac.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzac.zzb)) && Objects.equal(this.zzc, zzac.zzc) && Thing.zze(this.zzd, zzac.zzd) && Thing.zze(this.zze, zzac.zze);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(Thing.zzf(this.zzd)), Integer.valueOf(Thing.zzf(this.zze)));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("worksOffline: ");
        h.append(this.zza);
        h.append(", score: ");
        h.append(this.zzb);
        if (!this.zzc.isEmpty()) {
            h.append(", accountEmail: ");
            h.append(this.zzc);
        }
        Bundle bundle = this.zzd;
        if (bundle != null && !bundle.isEmpty()) {
            h.append(", Properties { ");
            Thing.zzd(this.zzd, h);
            h.append("}");
        }
        if (!this.zze.isEmpty()) {
            h.append(", embeddingProperties { ");
            Thing.zzd(this.zze, h);
            h.append("}");
        }
        return h.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
