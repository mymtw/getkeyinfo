package com.google.android.gms.internal.icing;

/* renamed from: com.google.android.gms.internal.icing.e */
public final class C14490e extends C14491e0<C14490e, C14486d> implements C14484c1 {
    /* access modifiers changed from: private */
    public static final C14490e zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C14490e eVar = new C14490e();
        zzh = eVar;
        C14491e0.m22950g(C14490e.class, eVar);
    }

    /* renamed from: i */
    public static void m22946i() {
        C14486d dVar = (C14486d) ((C14479b0) zzh.mo49756e(5));
    }

    /* renamed from: e */
    public final Object mo49756e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14520l1(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C14490e();
        } else {
            if (i2 == 4) {
                return new C14486d(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
