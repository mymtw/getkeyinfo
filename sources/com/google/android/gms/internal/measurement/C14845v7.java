package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.v7 */
public final class C14845v7 extends C14857w7 {
    public C14845v7(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo50926a(long j, Object obj) {
        return Double.longBitsToDouble(mo50953k(j, obj));
    }

    /* renamed from: b */
    public final float mo50927b(long j, Object obj) {
        return Float.intBitsToFloat(mo50952j(j, obj));
    }

    /* renamed from: c */
    public final void mo50928c(Object obj, long j, boolean z) {
        if (C14869x7.f33162g) {
            C14869x7.m24145c(obj, j, z);
        } else {
            C14869x7.m24146d(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo50929d(Object obj, long j, byte b) {
        if (C14869x7.f33162g) {
            C14869x7.m24145c(obj, j, b);
        } else {
            C14869x7.m24146d(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo50930e(Object obj, long j, double d) {
        mo50957o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo50931f(Object obj, long j, float f) {
        mo50956n(obj, Float.floatToIntBits(f), j);
    }

    /* renamed from: g */
    public final boolean mo50932g(long j, Object obj) {
        return C14869x7.f33162g ? ((byte) ((C14869x7.f33158c.mo50952j(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0 : ((byte) ((C14869x7.f33158c.mo50952j(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
