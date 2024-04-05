package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;

final class zzis extends zziv {
    private final int zzc;

    public zzis(byte[] bArr, int i, int i2) {
        super(bArr);
        zzix.zzj(0, i2, bArr.length);
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
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }
}
