package com.google.android.gms.internal.common;

import p568fn.C17782b;

final class zzaf extends zzag {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzag zzc;

    public zzaf(zzag zzag, int i, int i2) {
        this.zzc = zzag;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        C17782b.m29831A0(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    /* renamed from: zzh */
    public final zzag subList(int i, int i2) {
        C17782b.m29837D0(i, i2, this.zzb);
        zzag zzag = this.zzc;
        int i3 = this.zza;
        return zzag.subList(i + i3, i2 + i3);
    }
}
