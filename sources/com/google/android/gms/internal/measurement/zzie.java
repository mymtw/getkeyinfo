package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;
import java.io.Serializable;
import java.util.Arrays;

final class zzie<T> implements Serializable, C14768p4 {
    public final T zza;

    public zzie(T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzie)) {
            return false;
        }
        T t = this.zza;
        T t2 = ((zzie) obj).zza;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return C0070b.m184f(new StringBuilder(obj.length() + 22), "Suppliers.ofInstance(", obj, ")");
    }

    public final T zza() {
        return this.zza;
    }
}
