package com.google.android.gms.internal.icing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.icing.e2 */
public final class C14493e2 extends C14501g2 {
    public C14493e2(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo49781a(Object obj, long j, byte b) {
        if (C14505h2.f32648g) {
            C14505h2.m23029c(obj, j, b);
        } else {
            C14505h2.m23030d(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo49782b(long j, Object obj) {
        return C14505h2.f32648g ? ((byte) ((C14505h2.f32644c.mo49806k(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0 : ((byte) ((C14505h2.f32644c.mo49806k(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: c */
    public final void mo49783c(Object obj, long j, boolean z) {
        if (C14505h2.f32648g) {
            C14505h2.m23029c(obj, j, z);
        } else {
            C14505h2.m23030d(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo49784d(long j, Object obj) {
        return Float.intBitsToFloat(mo49806k(j, obj));
    }

    /* renamed from: e */
    public final void mo49785e(Object obj, long j, float f) {
        mo49807l(obj, Float.floatToIntBits(f), j);
    }

    /* renamed from: f */
    public final double mo49786f(long j, Object obj) {
        return Double.longBitsToDouble(mo49808m(j, obj));
    }

    /* renamed from: g */
    public final void mo49787g(Object obj, long j, double d) {
        mo49809n(obj, j, Double.doubleToLongBits(d));
    }
}
