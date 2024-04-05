package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
public final class C15024l4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33655b;

    /* renamed from: c */
    public final /* synthetic */ String f33656c;

    /* renamed from: d */
    public final /* synthetic */ zzgn f33657d;

    public C15024l4(zzgn zzgn, String str, String str2, String str3, long j) {
        this.f33657d = zzgn;
        this.f33655b = str;
        this.f33656c = str2;
    }

    public final void run() {
        if (this.f33655b == null) {
            C15113v5 t = this.f33657d.zza.f33497m.mo52332t();
            String str = this.f33656c;
            t.mo51995g();
            synchronized (t) {
                String str2 = t.f33932n;
                if (str2 == null || str2.equals(str)) {
                    t.f33932n = str;
                }
            }
            return;
        }
        C15113v5 t2 = this.f33657d.zza.f33497m.mo52332t();
        String str3 = this.f33656c;
        t2.mo51995g();
        synchronized (t2) {
            String str4 = t2.f33932n;
            if (str4 != null) {
                str4.equals(str3);
            }
            t2.f33932n = str3;
        }
    }
}
