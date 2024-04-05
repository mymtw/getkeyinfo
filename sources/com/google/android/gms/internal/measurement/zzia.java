package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;

final class zzia<T> extends zzhz<T> {
    private final T zza;

    public zzia(T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzia) {
            return this.zza.equals(((zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return C0070b.m184f(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }

    public final T zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
