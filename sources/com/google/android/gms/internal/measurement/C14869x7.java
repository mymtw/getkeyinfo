package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
public final class C14869x7 {

    /* renamed from: a */
    public static final Unsafe f33156a;

    /* renamed from: b */
    public static final Class<?> f33157b = C14842v4.m24066a();

    /* renamed from: c */
    public static final C14857w7 f33158c;

    /* renamed from: d */
    public static final boolean f33159d;

    /* renamed from: e */
    public static final boolean f33160e;

    /* renamed from: f */
    public static final long f33161f = ((long) m24162t(byte[].class));

    /* renamed from: g */
    public static final boolean f33162g;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0136  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m24153k()
            f33156a = r7
            java.lang.Class r8 = com.google.android.gms.internal.measurement.C14842v4.m24066a()
            f33157b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m24160r(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m24160r(r10)
            if (r7 != 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r9 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.v7 r9 = new com.google.android.gms.internal.measurement.v7
            r9.<init>(r7)
            goto L_0x003a
        L_0x0031:
            if (r10 == 0) goto L_0x0039
            com.google.android.gms.internal.measurement.u7 r9 = new com.google.android.gms.internal.measurement.u7
            r9.<init>(r7)
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            f33158c = r9
            java.lang.String r7 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L_0x0046
            goto L_0x006e
        L_0x0046:
            sun.misc.Unsafe r9 = r9.f33149a
            if (r9 != 0) goto L_0x004b
            goto L_0x006e
        L_0x004b:
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x006a }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006a }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006a }
            r9.getMethod(r10, r14)     // Catch:{ all -> 0x006a }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x006a }
            r14[r13] = r6     // Catch:{ all -> 0x006a }
            r14[r12] = r8     // Catch:{ all -> 0x006a }
            r9.getMethod(r7, r14)     // Catch:{ all -> 0x006a }
            java.lang.reflect.Field r8 = m24144b()     // Catch:{ all -> 0x006a }
            if (r8 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            r8 = r12
            goto L_0x006f
        L_0x006a:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C14869x7.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
        L_0x006e:
            r8 = r13
        L_0x006f:
            f33159d = r8
            com.google.android.gms.internal.measurement.w7 r8 = f33158c
            if (r8 != 0) goto L_0x0077
            goto L_0x00f0
        L_0x0077:
            sun.misc.Unsafe r8 = r8.f33149a
            if (r8 != 0) goto L_0x007c
            goto L_0x00f0
        L_0x007c:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00ec }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r9[r13] = r14     // Catch:{ all -> 0x00ec }
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00ec }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00ec }
            java.lang.String r10 = "arrayBaseOffset"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00ec }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00ec }
            java.lang.String r10 = "arrayIndexScale"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ all -> 0x00ec }
            r9[r13] = r6     // Catch:{ all -> 0x00ec }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ all -> 0x00ec }
            r9[r12] = r10     // Catch:{ all -> 0x00ec }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00ec }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00ec }
            r14[r13] = r6     // Catch:{ all -> 0x00ec }
            r14[r12] = r10     // Catch:{ all -> 0x00ec }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ec }
            r14[r11] = r15     // Catch:{ all -> 0x00ec }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x00ec }
            r14[r13] = r6     // Catch:{ all -> 0x00ec }
            r14[r12] = r10     // Catch:{ all -> 0x00ec }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00ec }
            r7[r13] = r6     // Catch:{ all -> 0x00ec }
            r7[r12] = r10     // Catch:{ all -> 0x00ec }
            r7[r11] = r10     // Catch:{ all -> 0x00ec }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ all -> 0x00ec }
            r7[r13] = r6     // Catch:{ all -> 0x00ec }
            r7[r12] = r10     // Catch:{ all -> 0x00ec }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00ec }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00ec }
            r7[r13] = r6     // Catch:{ all -> 0x00ec }
            r7[r12] = r10     // Catch:{ all -> 0x00ec }
            r7[r11] = r6     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00ec }
            r6 = r12
            goto L_0x00f1
        L_0x00ec:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C14869x7.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
        L_0x00f0:
            r6 = r13
        L_0x00f1:
            f33160e = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m24162t(r6)
            long r6 = (long) r6
            f33161f = r6
            m24162t(r5)
            m24143a(r5)
            m24162t(r4)
            m24143a(r4)
            m24162t(r3)
            m24143a(r3)
            m24162t(r2)
            m24143a(r2)
            m24162t(r1)
            m24143a(r1)
            m24162t(r0)
            m24143a(r0)
            java.lang.reflect.Field r0 = m24144b()
            if (r0 == 0) goto L_0x012d
            com.google.android.gms.internal.measurement.w7 r1 = f33158c
            if (r1 == 0) goto L_0x012d
            r1.mo50954l(r0)
        L_0x012d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r12 = r13
        L_0x0137:
            f33162g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14869x7.<clinit>():void");
    }

    /* renamed from: a */
    public static void m24143a(Class cls) {
        if (f33160e) {
            f33158c.mo50951i(cls);
        }
    }

    /* renamed from: b */
    public static Field m24144b() {
        Field field;
        Field field2;
        int i = C14842v4.f33131a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* renamed from: c */
    public static void m24145c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C14857w7 w7Var = f33158c;
        int j3 = w7Var.mo50952j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        w7Var.mo50956n(obj, ((255 & b) << i) | (j3 & (~(255 << i))), j2);
    }

    /* renamed from: d */
    public static void m24146d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C14857w7 w7Var = f33158c;
        int i = (((int) j) & 3) << 3;
        w7Var.mo50956n(obj, ((255 & b) << i) | (w7Var.mo50952j(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: e */
    public static double m24147e(long j, Object obj) {
        return f33158c.mo50926a(j, obj);
    }

    /* renamed from: f */
    public static float m24148f(long j, Object obj) {
        return f33158c.mo50927b(j, obj);
    }

    /* renamed from: g */
    public static int m24149g(long j, Object obj) {
        return f33158c.mo50952j(j, obj);
    }

    /* renamed from: h */
    public static long m24150h(long j, Object obj) {
        return f33158c.mo50953k(j, obj);
    }

    /* renamed from: i */
    public static <T> T m24151i(Class<T> cls) {
        try {
            return f33156a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: j */
    public static Object m24152j(long j, Object obj) {
        return f33158c.mo50955m(j, obj);
    }

    /* renamed from: k */
    public static Unsafe m24153k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C14821t7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static void m24155m(Object obj, long j, boolean z) {
        f33158c.mo50928c(obj, j, z);
    }

    /* renamed from: n */
    public static void m24156n(Object obj, long j, double d) {
        f33158c.mo50930e(obj, j, d);
    }

    /* renamed from: o */
    public static void m24157o(Object obj, long j, float f) {
        f33158c.mo50931f(obj, j, f);
    }

    /* renamed from: p */
    public static void m24158p(Object obj, int i, long j) {
        f33158c.mo50956n(obj, i, j);
    }

    /* renamed from: q */
    public static void m24159q(long j, Object obj, Object obj2) {
        f33158c.mo50958p(j, obj, obj2);
    }

    /* renamed from: r */
    public static boolean m24160r(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C14842v4.f33131a;
        try {
            Class<?> cls3 = f33157b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m24161s(long j, Object obj) {
        return f33158c.mo50932g(j, obj);
    }

    /* renamed from: t */
    public static int m24162t(Class<?> cls) {
        if (f33160e) {
            return f33158c.mo50950h(cls);
        }
        return -1;
    }
}
