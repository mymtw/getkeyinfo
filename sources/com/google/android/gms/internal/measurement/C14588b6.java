package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
public class C14588b6 {

    /* renamed from: a */
    public volatile C14796r6 f32755a;

    /* renamed from: b */
    public volatile zzix f32756b;

    static {
        C14665h5.m23616a();
    }

    /* renamed from: a */
    public final zzix mo50383a() {
        if (this.f32756b != null) {
            return this.f32756b;
        }
        synchronized (this) {
            if (this.f32756b != null) {
                zzix zzix = this.f32756b;
                return zzix;
            }
            if (this.f32755a == null) {
                this.f32756b = zzix.zzb;
            } else {
                this.f32756b = this.f32755a.mo50825a();
            }
            zzix zzix2 = this.f32756b;
            return zzix2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50384b(com.google.android.gms.internal.measurement.C14796r6 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.r6 r0 = r1.f32755a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.r6 r0 = r1.f32755a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f32755a = r2     // Catch:{ zzkh -> 0x0011 }
            com.google.android.gms.internal.measurement.zzix r0 = com.google.android.gms.internal.measurement.zzix.zzb     // Catch:{ zzkh -> 0x0011 }
            r1.f32756b = r0     // Catch:{ zzkh -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f32755a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzix r2 = com.google.android.gms.internal.measurement.zzix.zzb     // Catch:{ all -> 0x001b }
            r1.f32756b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14588b6.mo50384b(com.google.android.gms.internal.measurement.r6):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14588b6)) {
            return false;
        }
        C14588b6 b6Var = (C14588b6) obj;
        C14796r6 r6Var = this.f32755a;
        C14796r6 r6Var2 = b6Var.f32755a;
        if (r6Var == null && r6Var2 == null) {
            return mo50383a().equals(b6Var.mo50383a());
        }
        if (r6Var != null && r6Var2 != null) {
            return r6Var.equals(r6Var2);
        }
        if (r6Var != null) {
            b6Var.mo50384b(r6Var.mo50805b());
            return r6Var.equals(b6Var.f32755a);
        }
        mo50384b(r6Var2.mo50805b());
        return this.f32755a.equals(r6Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
