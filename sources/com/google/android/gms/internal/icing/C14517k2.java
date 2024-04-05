package com.google.android.gms.internal.icing;

/* renamed from: com.google.android.gms.internal.icing.k2 */
public final class C14517k2 extends C14491e0<C14517k2, C14513j2> implements C14484c1 {
    /* access modifiers changed from: private */
    public static final C14517k2 zzj;
    private int zzb;
    private boolean zze;
    private int zzf;
    private String zzg = "";
    private C14511j0<C14525m2> zzh;
    private C14511j0<C14525m2> zzi;

    static {
        C14517k2 k2Var = new C14517k2();
        zzj = k2Var;
        C14491e0.m22950g(C14517k2.class, k2Var);
    }

    public C14517k2() {
        C14516k1<Object> k1Var = C14516k1.f32657e;
        this.zzh = k1Var;
        this.zzi = k1Var;
    }

    /* renamed from: l */
    public static C14517k2 m23058l() {
        return zzj;
    }

    /* renamed from: e */
    public final Object mo49756e(int i) {
        Class<C14525m2> cls = C14525m2.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14520l1(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", cls, "zzi", cls});
        } else if (i2 == 3) {
            return new C14517k2();
        } else {
            if (i2 == 4) {
                return new C14513j2();
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: i */
    public final boolean mo49827i() {
        return this.zze;
    }

    /* renamed from: j */
    public final int mo49828j() {
        return this.zzf;
    }

    /* renamed from: k */
    public final String mo49829k() {
        return this.zzg;
    }
}
