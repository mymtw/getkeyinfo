package com.google.android.gms.internal.common;

import p568fn.C17782b;

final class zzai<E> extends zzag<E> {
    public static final zzag<Object> zza = new zzai(new Object[0], 0);

    /* renamed from: d */
    public final transient int f32613d;
    public final transient Object[] zzb;

    public zzai(Object[] objArr, int i) {
        this.zzb = objArr;
        this.f32613d = i;
    }

    public final E get(int i) {
        C17782b.m29831A0(i, this.f32613d);
        E e = this.zzb[i];
        e.getClass();
        return e;
    }

    public final int size() {
        return this.f32613d;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.f32613d);
        return this.f32613d;
    }

    public final int zzb() {
        return this.f32613d;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}
