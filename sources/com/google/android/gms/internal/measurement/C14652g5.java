package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.google.android.gms.internal.measurement.g5 */
public final class C14652g5 {

    /* renamed from: a */
    public final Object f32849a;

    /* renamed from: b */
    public final int f32850b;

    public C14652g5(Object obj, int i) {
        this.f32849a = obj;
        this.f32850b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14652g5)) {
            return false;
        }
        C14652g5 g5Var = (C14652g5) obj;
        return this.f32849a == g5Var.f32849a && this.f32850b == g5Var.f32850b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32849a) * SupportMenu.USER_MASK) + this.f32850b;
    }
}
