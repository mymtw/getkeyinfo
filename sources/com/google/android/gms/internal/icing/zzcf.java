package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p003a2.C0023f;
import p568fn.C17782b;

public abstract class zzcf implements Iterable<Byte>, Serializable {
    public static final zzcf zzb = new zzcd(C14515k0.f32656b);
    private int zza = 0;

    static {
        int i = C14514k.f32654a;
    }

    public static zzcf zzj(String str) {
        return new zzcd(str.getBytes(C14515k0.f32655a));
    }

    public static int zzm(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C0023f.m107h(37, "End index: ", i2, " >= ", i3));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc = zzc();
            i = zzi(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C14526n(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? C17782b.m29897y0(this) : String.valueOf(C17782b.m29897y0(zze(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzcf zze(int i, int i2);

    public abstract void zzf(C14522m mVar) throws IOException;

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public final String zzk(Charset charset) {
        return zzc() == 0 ? "" : zzg(charset);
    }

    public final int zzl() {
        return this.zza;
    }
}
