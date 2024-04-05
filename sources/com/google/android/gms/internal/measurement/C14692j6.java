package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j6 */
public final class C14692j6 implements C14783q6 {

    /* renamed from: a */
    public final C14783q6[] f32895a;

    public C14692j6(C14783q6... q6VarArr) {
        this.f32895a = q6VarArr;
    }

    /* renamed from: a */
    public final C14757o6 mo50592a(Class<?> cls) {
        C14783q6[] q6VarArr = this.f32895a;
        for (int i = 0; i < 2; i++) {
            C14783q6 q6Var = q6VarArr[i];
            if (q6Var.mo50593b(cls)) {
                return q6Var.mo50592a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo50593b(Class<?> cls) {
        C14783q6[] q6VarArr = this.f32895a;
        for (int i = 0; i < 2; i++) {
            if (q6VarArr[i].mo50593b(cls)) {
                return true;
            }
        }
        return false;
    }
}
