package com.google.android.gms.internal.icing;

/* renamed from: com.google.android.gms.internal.icing.p0 */
public final class C14535p0 extends C14539q0 {
    /* renamed from: a */
    public final void mo49856a(long j, C14491e0 e0Var) {
        ((C14511j0) C14505h2.m23038l(j, e0Var)).zzb();
    }

    /* renamed from: b */
    public final void mo49857b(long j, Object obj, Object obj2) {
        C14511j0 j0Var = (C14511j0) C14505h2.m23038l(j, obj);
        C14511j0 j0Var2 = (C14511j0) C14505h2.m23038l(j, obj2);
        int size = j0Var.size();
        int size2 = j0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!j0Var.zza()) {
                j0Var = j0Var.mo49798r(size2 + size);
            }
            j0Var.addAll(j0Var2);
        }
        if (size > 0) {
            j0Var2 = j0Var;
        }
        C14505h2.m23039m(j, obj, j0Var2);
    }
}
