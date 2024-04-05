package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.etsy.android.lib.models.editable.EditableListing;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentSectionCreator")
@SafeParcelable.Reserved({1000})
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public static final int zza = Integer.parseInt(EditableListing.LISTING_ID_DEVICE_DRAFT);
    private static final zzs zzf;
    @SafeParcelable.Field(mo49213id = 1)
    public final String zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public final zzs zzc;
    @SafeParcelable.Field(defaultValue = "-1", mo49213id = 4)
    public final int zzd;
    @SafeParcelable.Field(mo49213id = 5)
    public final byte[] zze;

    static {
        ArrayList arrayList = new ArrayList();
        zzf = new zzs("SsbContext", "blob", true, 1, false, (String) null, (zzm[]) arrayList.toArray(new zzm[arrayList.size()]), (String) null, (zzu) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzk(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 1) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 3) com.google.android.gms.internal.icing.zzs r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 4) int r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo49216id = 5) byte[] r11) {
        /*
            r7 = this;
            r7.<init>()
            int r0 = zza
            r1 = 10
            r2 = 0
            if (r10 == r0) goto L_0x001c
            if (r10 < 0) goto L_0x0014
            java.lang.String[] r3 = com.google.android.gms.internal.icing.C14537p2.f32678a
            if (r10 < r1) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r3 = r3[r10]
            goto L_0x0017
        L_0x0014:
            java.lang.String[] r3 = com.google.android.gms.internal.icing.C14537p2.f32678a
        L_0x0016:
            r3 = r2
        L_0x0017:
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 32
            r4.<init>(r5)
            java.lang.String r6 = "Invalid section type "
            r4.append(r6)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r4)
            r7.zzb = r8
            r7.zzc = r9
            r7.zzd = r10
            r7.zze = r11
            if (r10 == r0) goto L_0x0051
            if (r10 < 0) goto L_0x0047
            java.lang.String[] r9 = com.google.android.gms.internal.icing.C14537p2.f32678a
            if (r10 < r1) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            r9 = r9[r10]
            goto L_0x004a
        L_0x0047:
            java.lang.String[] r9 = com.google.android.gms.internal.icing.C14537p2.f32678a
        L_0x0049:
            r9 = r2
        L_0x004a:
            if (r9 != 0) goto L_0x0051
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r5, r6, r10)
            goto L_0x0057
        L_0x0051:
            if (r8 == 0) goto L_0x0057
            if (r11 == 0) goto L_0x0057
            java.lang.String r2 = "Both content and blobContent set"
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            return
        L_0x005a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzk.<init>(java.lang.String, com.google.android.gms.internal.icing.zzs, int, byte[]):void");
    }

    public static zzk zza(byte[] bArr) {
        return new zzk((String) null, zzf, zza, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(byte[] bArr, zzs zzs) {
        this((String) null, zzs, zza, bArr);
    }
}
