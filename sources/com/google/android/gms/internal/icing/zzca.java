package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;

final class zzca extends zzcd {
    private final int zzc;

    public zzca(byte[] bArr, int i, int i2) {
        super(bArr);
        zzcf.zzm(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C0072d.m200g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C0023f.m107h(40, "Index > length: ", i, ", ", i2));
    }

    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return 0;
    }
}
