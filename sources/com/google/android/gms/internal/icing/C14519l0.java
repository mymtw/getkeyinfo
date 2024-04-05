package com.google.android.gms.internal.icing;

/* renamed from: com.google.android.gms.internal.icing.l0 */
public class C14519l0 {

    /* renamed from: a */
    public volatile C14480b1 f32663a;

    /* renamed from: b */
    public volatile zzcf f32664b;

    static {
        if (C14550u.f32704b == null) {
            synchronized (C14550u.class) {
                if (C14550u.f32704b == null) {
                    C14550u.f32704b = C14550u.f32705c;
                }
            }
        }
    }

    /* renamed from: a */
    public final zzcf mo49839a() {
        if (this.f32664b != null) {
            return this.f32664b;
        }
        synchronized (this) {
            if (this.f32664b != null) {
                zzcf zzcf = this.f32664b;
                return zzcf;
            }
            if (this.f32663a == null) {
                this.f32664b = zzcf.zzb;
            } else {
                this.f32664b = this.f32663a.zzg();
            }
            zzcf zzcf2 = this.f32664b;
            return zzcf2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49840b(com.google.android.gms.internal.icing.C14480b1 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.icing.b1 r0 = r1.f32663a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.icing.b1 r0 = r1.f32663a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f32663a = r2     // Catch:{ zzdj -> 0x0011 }
            com.google.android.gms.internal.icing.zzcf r0 = com.google.android.gms.internal.icing.zzcf.zzb     // Catch:{ zzdj -> 0x0011 }
            r1.f32664b = r0     // Catch:{ zzdj -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f32663a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.icing.zzcf r2 = com.google.android.gms.internal.icing.zzcf.zzb     // Catch:{ all -> 0x001b }
            r1.f32664b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14519l0.mo49840b(com.google.android.gms.internal.icing.b1):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14519l0)) {
            return false;
        }
        C14519l0 l0Var = (C14519l0) obj;
        C14480b1 b1Var = this.f32663a;
        C14480b1 b1Var2 = l0Var.f32663a;
        if (b1Var == null && b1Var2 == null) {
            return mo49839a().equals(l0Var.mo49839a());
        }
        if (b1Var != null && b1Var2 != null) {
            return b1Var.equals(b1Var2);
        }
        if (b1Var != null) {
            l0Var.mo49840b(b1Var.mo49737b());
            return b1Var.equals(l0Var.f32663a);
        }
        mo49840b(b1Var2.mo49737b());
        return this.f32663a.equals(b1Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
