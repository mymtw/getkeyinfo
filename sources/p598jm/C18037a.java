package p598jm;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C14609d1;
import com.google.android.gms.internal.measurement.C14712l0;
import com.google.android.gms.internal.measurement.C14725m0;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.android.gms.internal.measurement.C14802s0;
import com.google.android.gms.internal.measurement.C14814t0;
import com.google.android.gms.internal.measurement.C14826u0;
import com.google.android.gms.internal.measurement.C14838v0;
import com.google.android.gms.internal.measurement.C14850w0;
import com.google.android.gms.internal.measurement.C14862x0;
import com.google.android.gms.internal.measurement.C14874y0;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.C15016k5;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: jm.a */
public final class C18037a implements C15016k5 {

    /* renamed from: a */
    public final /* synthetic */ C14726m1 f39455a;

    public C18037a(C14726m1 m1Var) {
        this.f39455a = m1Var;
    }

    /* renamed from: a */
    public final void mo52173a(String str) {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        m1Var.mo50666b(new C14802s0(m1Var, str));
    }

    /* renamed from: b */
    public final void mo52174b(String str, Bundle bundle, String str2) {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        m1Var.mo50666b(new C14725m0(m1Var, str, str2, bundle));
    }

    /* renamed from: c */
    public final void mo52175c(String str) {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        m1Var.mo50666b(new C14814t0(m1Var, str));
    }

    /* renamed from: d */
    public final void mo52176d(String str, Bundle bundle, String str2) {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        m1Var.mo50666b(new C14609d1(m1Var, str, str2, bundle, true));
    }

    /* renamed from: e */
    public final List<Bundle> mo52177e(String str, String str2) {
        return this.f39455a.mo50668e(str, str2);
    }

    /* renamed from: f */
    public final Map<String, Object> mo52178f(String str, String str2, boolean z) {
        return this.f39455a.mo50669f(str, str2, z);
    }

    /* renamed from: g */
    public final void mo52179g(Bundle bundle) {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        m1Var.mo50666b(new C14712l0(m1Var, bundle));
    }

    public final int zza(String str) {
        return this.f39455a.mo50667c(str);
    }

    public final long zzb() {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        zzbz zzbz = new zzbz();
        m1Var.mo50666b(new C14850w0(m1Var, zzbz));
        Long l = (Long) zzbz.zze(zzbz.zzb(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ m1Var.f32945a.currentTimeMillis()).nextLong();
        int i = m1Var.f32948d + 1;
        m1Var.f32948d = i;
        return nextLong + ((long) i);
    }

    public final String zzh() {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        zzbz zzbz = new zzbz();
        m1Var.mo50666b(new C14838v0(m1Var, zzbz));
        return zzbz.zzc(50);
    }

    public final String zzi() {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        zzbz zzbz = new zzbz();
        m1Var.mo50666b(new C14874y0(m1Var, zzbz));
        return zzbz.zzc(500);
    }

    public final String zzj() {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        zzbz zzbz = new zzbz();
        m1Var.mo50666b(new C14862x0(m1Var, zzbz));
        return zzbz.zzc(500);
    }

    public final String zzk() {
        C14726m1 m1Var = this.f39455a;
        m1Var.getClass();
        zzbz zzbz = new zzbz();
        m1Var.mo50666b(new C14826u0(m1Var, zzbz));
        return zzbz.zzc(500);
    }
}
