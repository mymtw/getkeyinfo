package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import p003a2.C0023f;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.icing.h2 */
public final class C14505h2 {

    /* renamed from: a */
    public static final Unsafe f32642a;

    /* renamed from: b */
    public static final Class<?> f32643b = C14514k.m23052a();

    /* renamed from: c */
    public static final C14501g2 f32644c;

    /* renamed from: d */
    public static final boolean f32645d;

    /* renamed from: e */
    public static final boolean f32646e;

    /* renamed from: f */
    public static final long f32647f = ((long) m23043q(byte[].class));

    /* renamed from: g */
    public static final boolean f32648g;

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
            sun.misc.Unsafe r7 = m23040n()
            f32642a = r7
            java.lang.Class r8 = com.google.android.gms.internal.icing.C14514k.m23052a()
            f32643b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m23041o(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m23041o(r10)
            if (r7 != 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r9 == 0) goto L_0x0031
            com.google.android.gms.internal.icing.f2 r9 = new com.google.android.gms.internal.icing.f2
            r9.<init>(r7)
            goto L_0x003a
        L_0x0031:
            if (r10 == 0) goto L_0x0039
            com.google.android.gms.internal.icing.e2 r9 = new com.google.android.gms.internal.icing.e2
            r9.<init>(r7)
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            f32644c = r9
            java.lang.String r7 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L_0x0046
            goto L_0x006e
        L_0x0046:
            sun.misc.Unsafe r9 = r9.f32640a
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
            java.lang.reflect.Field r8 = m23028b()     // Catch:{ all -> 0x006a }
            if (r8 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            r8 = r12
            goto L_0x006f
        L_0x006a:
            r8 = move-exception
            m23042p(r8)
        L_0x006e:
            r8 = r13
        L_0x006f:
            f32645d = r8
            com.google.android.gms.internal.icing.g2 r8 = f32644c
            if (r8 != 0) goto L_0x0077
            goto L_0x00f0
        L_0x0077:
            sun.misc.Unsafe r8 = r8.f32640a
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
            m23042p(r6)
        L_0x00f0:
            r6 = r13
        L_0x00f1:
            f32646e = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m23043q(r6)
            long r6 = (long) r6
            f32647f = r6
            m23043q(r5)
            m23027a(r5)
            m23043q(r4)
            m23027a(r4)
            m23043q(r3)
            m23027a(r3)
            m23043q(r2)
            m23027a(r2)
            m23043q(r1)
            m23027a(r1)
            m23043q(r0)
            m23027a(r0)
            java.lang.reflect.Field r0 = m23028b()
            if (r0 == 0) goto L_0x012d
            com.google.android.gms.internal.icing.g2 r1 = f32644c
            if (r1 == 0) goto L_0x012d
            r1.mo49803h(r0)
        L_0x012d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r12 = r13
        L_0x0137:
            f32648g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14505h2.<clinit>():void");
    }

    /* renamed from: a */
    public static void m23027a(Class cls) {
        if (f32646e) {
            f32644c.mo49805j(cls);
        }
    }

    /* renamed from: b */
    public static Field m23028b() {
        Field field;
        Field field2;
        int i = C14514k.f32654a;
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
    public static void m23029c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C14501g2 g2Var = f32644c;
        int k = g2Var.mo49806k(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        g2Var.mo49807l(obj, ((255 & b) << i) | (k & (~(255 << i))), j2);
    }

    /* renamed from: d */
    public static void m23030d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C14501g2 g2Var = f32644c;
        int i = (((int) j) & 3) << 3;
        g2Var.mo49807l(obj, ((255 & b) << i) | (g2Var.mo49806k(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: e */
    public static <T> T m23031e(Class<T> cls) {
        try {
            return f32642a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static int m23032f(long j, Object obj) {
        return f32644c.mo49806k(j, obj);
    }

    /* renamed from: g */
    public static void m23033g(Object obj, int i, long j) {
        f32644c.mo49807l(obj, i, j);
    }

    /* renamed from: h */
    public static long m23034h(long j, Object obj) {
        return f32644c.mo49808m(j, obj);
    }

    /* renamed from: i */
    public static boolean m23035i(long j, Object obj) {
        return f32644c.mo49782b(j, obj);
    }

    /* renamed from: j */
    public static float m23036j(long j, Object obj) {
        return f32644c.mo49784d(j, obj);
    }

    /* renamed from: k */
    public static double m23037k(long j, Object obj) {
        return f32644c.mo49786f(j, obj);
    }

    /* renamed from: l */
    public static Object m23038l(long j, Object obj) {
        return f32644c.mo49810o(j, obj);
    }

    /* renamed from: m */
    public static void m23039m(long j, Object obj, Object obj2) {
        f32644c.mo49811p(j, obj, obj2);
    }

    /* renamed from: n */
    public static Unsafe m23040n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C14489d2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m23041o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C14514k.f32654a;
        try {
            Class<?> cls3 = f32643b;
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

    /* renamed from: p */
    public static /* synthetic */ void m23042p(Throwable th) {
        Logger logger = Logger.getLogger(C14505h2.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", C0023f.m110k(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    /* renamed from: q */
    public static int m23043q(Class<?> cls) {
        if (f32646e) {
            return f32644c.mo49804i(cls);
        }
        return -1;
    }
}
