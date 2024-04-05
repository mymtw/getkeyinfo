package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentContentsCreator")
@SafeParcelable.Reserved({1000})
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    @SafeParcelable.Field(mo49213id = 1)
    public final zzk[] zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final String zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public final boolean zzc;
    @SafeParcelable.Field(mo49213id = 4)
    public final Account zzd;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzg(java.lang.String r3, boolean r4, android.accounts.Account r5, com.google.android.gms.internal.icing.zzk... r6) {
        /*
            r2 = this;
            r2.<init>((com.google.android.gms.internal.icing.zzk[]) r6, (java.lang.String) r3, (boolean) r4, (android.accounts.Account) r5)
            if (r6 == 0) goto L_0x004c
            java.util.BitSet r3 = new java.util.BitSet
            java.lang.String[] r4 = com.google.android.gms.internal.icing.C14537p2.f32678a
            r4 = 10
            r3.<init>(r4)
            r5 = 0
        L_0x000f:
            int r0 = r6.length
            if (r5 >= r0) goto L_0x004c
            r0 = r6[r5]
            int r0 = r0.zzd
            r1 = -1
            if (r0 == r1) goto L_0x0049
            boolean r1 = r3.get(r0)
            if (r1 == 0) goto L_0x0046
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            if (r0 < 0) goto L_0x002b
            java.lang.String[] r5 = com.google.android.gms.internal.icing.C14537p2.f32678a
            if (r0 < r4) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r4 = r5[r0]
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Duplicate global search section type "
            int r6 = r4.length()
            if (r6 == 0) goto L_0x003d
            java.lang.String r4 = r5.concat(r4)
            goto L_0x0042
        L_0x003d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L_0x0042:
            r3.<init>(r4)
            throw r3
        L_0x0046:
            r3.set(r0)
        L_0x0049:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzg.<init>(java.lang.String, boolean, android.accounts.Account, com.google.android.gms.internal.icing.zzk[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            zzg zzg = (zzg) obj;
            return Objects.equal(this.zzb, zzg.zzb) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzg.zzc)) && Objects.equal(this.zzd, zzg.zzd) && Arrays.equals(this.zza, zzg.zza);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, Boolean.valueOf(this.zzc), this.zzd, Integer.valueOf(Arrays.hashCode(this.zza)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(mo49216id = 1) zzk[] zzkArr, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) boolean z, @SafeParcelable.Param(mo49216id = 4) Account account) {
        this.zza = zzkArr;
        this.zzb = str;
        this.zzc = z;
        this.zzd = account;
    }
}
