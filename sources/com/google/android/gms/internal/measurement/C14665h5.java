package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h5 */
public final class C14665h5 {

    /* renamed from: b */
    public static volatile C14665h5 f32862b;

    /* renamed from: c */
    public static volatile C14665h5 f32863c;

    /* renamed from: d */
    public static final C14665h5 f32864d = new C14665h5(0);

    /* renamed from: a */
    public final Map<C14652g5, C14807s5<?, ?>> f32865a;

    public C14665h5() {
        this.f32865a = new HashMap();
    }

    /* renamed from: a */
    public static C14665h5 m23616a() {
        C14665h5 h5Var = f32862b;
        if (h5Var == null) {
            synchronized (C14665h5.class) {
                h5Var = f32862b;
                if (h5Var == null) {
                    h5Var = f32864d;
                    f32862b = h5Var;
                }
            }
        }
        return h5Var;
    }

    /* renamed from: b */
    public final <ContainingType extends C14796r6> C14807s5<ContainingType, ?> mo50559b(ContainingType containingtype, int i) {
        return this.f32865a.get(new C14652g5(containingtype, i));
    }

    public C14665h5(int i) {
        this.f32865a = Collections.emptyMap();
    }
}
