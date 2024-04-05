package com.google.android.gms.internal.icing;

/* renamed from: com.google.android.gms.internal.icing.t0 */
public final class C14548t0 implements C14476a1 {

    /* renamed from: a */
    public final C14476a1[] f32702a;

    public C14548t0(C14476a1... a1VarArr) {
        this.f32702a = a1VarArr;
    }

    /* renamed from: a */
    public final boolean mo49726a(Class<?> cls) {
        C14476a1[] a1VarArr = this.f32702a;
        for (int i = 0; i < 2; i++) {
            if (a1VarArr[i].mo49726a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C14566z0 mo49727b(Class<?> cls) {
        C14476a1[] a1VarArr = this.f32702a;
        for (int i = 0; i < 2; i++) {
            C14476a1 a1Var = a1VarArr[i];
            if (a1Var.mo49726a(cls)) {
                return a1Var.mo49727b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
