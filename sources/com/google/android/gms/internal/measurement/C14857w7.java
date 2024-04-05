package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.w7 */
public abstract class C14857w7 {

    /* renamed from: a */
    public final Unsafe f33149a;

    public C14857w7(Unsafe unsafe) {
        this.f33149a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo50926a(long j, Object obj);

    /* renamed from: b */
    public abstract float mo50927b(long j, Object obj);

    /* renamed from: c */
    public abstract void mo50928c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo50929d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo50930e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo50931f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo50932g(long j, Object obj);

    /* renamed from: h */
    public final int mo50950h(Class<?> cls) {
        return this.f33149a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo50951i(Class<?> cls) {
        return this.f33149a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo50952j(long j, Object obj) {
        return this.f33149a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo50953k(long j, Object obj) {
        return this.f33149a.getLong(obj, j);
    }

    /* renamed from: l */
    public final void mo50954l(Field field) {
        this.f33149a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo50955m(long j, Object obj) {
        return this.f33149a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo50956n(Object obj, int i, long j) {
        this.f33149a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo50957o(Object obj, long j, long j2) {
        this.f33149a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo50958p(long j, Object obj, Object obj2) {
        this.f33149a.putObject(obj, j, obj2);
    }
}
