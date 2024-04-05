package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.icing.g2 */
public abstract class C14501g2 {

    /* renamed from: a */
    public final Unsafe f32640a;

    public C14501g2(Unsafe unsafe) {
        this.f32640a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo49781a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo49782b(long j, Object obj);

    /* renamed from: c */
    public abstract void mo49783c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo49784d(long j, Object obj);

    /* renamed from: e */
    public abstract void mo49785e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo49786f(long j, Object obj);

    /* renamed from: g */
    public abstract void mo49787g(Object obj, long j, double d);

    /* renamed from: h */
    public final void mo49803h(Field field) {
        this.f32640a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo49804i(Class<?> cls) {
        return this.f32640a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo49805j(Class<?> cls) {
        return this.f32640a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo49806k(long j, Object obj) {
        return this.f32640a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo49807l(Object obj, int i, long j) {
        this.f32640a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo49808m(long j, Object obj) {
        return this.f32640a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo49809n(Object obj, long j, long j2) {
        this.f32640a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo49810o(long j, Object obj) {
        return this.f32640a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo49811p(long j, Object obj, Object obj2) {
        this.f32640a.putObject(obj, j, obj2);
    }
}
