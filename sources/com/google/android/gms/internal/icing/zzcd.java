package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.reflect.C19421p;
import p003a2.C0023f;

class zzcd extends zzcc {
    public final byte[] zza;

    public zzcd(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcf) || zzc() != ((zzcf) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return obj.equals(this);
        }
        zzcd zzcd = (zzcd) obj;
        int zzl = zzl();
        int zzl2 = zzcd.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzcd.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc <= zzcd.zzc()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzcd.zza;
            zzcd.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C0023f.m107h(59, "Ran off end of other: 0, ", zzc, ", ", zzcd.zzc()));
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    public final zzcf zze(int i, int i2) {
        zzcf.zzm(0, i2, zzc());
        return i2 == 0 ? zzcf.zzb : new zzca(this.zza, 0, i2);
    }

    public final void zzf(C14522m mVar) throws IOException {
        C14538q qVar = (C14538q) mVar;
        qVar.mo49877v(zzc(), this.zza);
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzh() {
        byte[] bArr = this.zza;
        int zzc = zzc();
        C14509i2.f32649a.getClass();
        return C19421p.m32948n0(zzc, bArr);
    }

    public final int zzi(int i, int i2, int i3) {
        byte[] bArr = this.zza;
        Charset charset = C14515k0.f32655a;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
