package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.compose.animation.C0391c;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.measurement.internal.p2 */
public final class C15058p2 {

    /* renamed from: a */
    public final String f33743a;

    /* renamed from: b */
    public final String f33744b;

    /* renamed from: c */
    public final long f33745c;

    /* renamed from: d */
    public final Bundle f33746d;

    public C15058p2(String str, String str2, Bundle bundle, long j) {
        this.f33743a = str;
        this.f33744b = str2;
        this.f33746d = bundle;
        this.f33745c = j;
    }

    /* renamed from: b */
    public static C15058p2 m24596b(zzat zzat) {
        return new C15058p2(zzat.zza, zzat.zzc, zzat.zzb.zzc(), zzat.zzd);
    }

    /* renamed from: a */
    public final zzat mo52283a() {
        return new zzat(this.f33743a, new zzar(new Bundle(this.f33746d)), this.f33744b, this.f33745c);
    }

    public final String toString() {
        String str = this.f33744b;
        String str2 = this.f33743a;
        String obj = this.f33746d.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        C0391c.m1061h(sb, "origin=", str, ",name=", str2);
        return C0023f.m110k(sb, ",params=", obj);
    }
}
