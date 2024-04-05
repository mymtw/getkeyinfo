package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
public final class C14640f6 extends C14653g6 {
    /* renamed from: a */
    public final void mo50475a(long j, Object obj) {
        ((C14891z5) C14869x7.m24152j(j, obj)).zzb();
    }

    /* renamed from: b */
    public final void mo50476b(long j, Object obj, Object obj2) {
        C14891z5 z5Var = (C14891z5) C14869x7.m24152j(j, obj);
        C14891z5 z5Var2 = (C14891z5) C14869x7.m24152j(j, obj2);
        int size = z5Var.size();
        int size2 = z5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!z5Var.zzc()) {
                z5Var = z5Var.mo50356b(size2 + size);
            }
            z5Var.addAll(z5Var2);
        }
        if (size > 0) {
            z5Var2 = z5Var;
        }
        C14869x7.m24159q(j, obj, z5Var2);
    }
}
