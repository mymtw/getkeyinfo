package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;
import java.io.Serializable;

final class zzic<T> implements Serializable, C14768p4 {
    public final C14768p4<T> zza;
    public volatile transient boolean zzb;
    public transient T zzc;

    public zzic(C14768p4<T> p4Var) {
        p4Var.getClass();
        this.zza = p4Var;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            obj = C0070b.m184f(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return C0070b.m184f(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    T zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
