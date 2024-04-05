package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import p003a2.C0023f;

class zziv extends zziu {
    public final byte[] zza;

    public zziv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzix) || zzd() != ((zzix) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zziv = (zziv) obj;
        int zzk = zzk();
        int zzk2 = zziv.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zziv.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzd);
            sb.append(zzd2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzd <= zziv.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zziv.zza;
            zziv.zzc();
            int i = 0;
            int i2 = 0;
            while (i < zzd) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C0023f.m107h(59, "Ran off end of other: 0, ", zzd, ", ", zziv.zzd()));
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public final int zze(int i, int i2, int i3) {
        byte[] bArr = this.zza;
        Charset charset = C14575a6.f32740a;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public final zzix zzf(int i, int i2) {
        int zzj = zzix.zzj(0, i2, zzd());
        return zzj == 0 ? zzix.zzb : new zzis(this.zza, 0, zzj);
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final void zzh(C14890z4 z4Var) throws IOException {
        C14600c5 c5Var = (C14600c5) z4Var;
        c5Var.mo50422v(zzd(), this.zza);
    }

    public final boolean zzi() {
        return C14881y7.m24180d(0, zzd(), this.zza);
    }
}
