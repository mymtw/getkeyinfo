package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.f1 */
public final class C16889f1 {

    /* renamed from: a */
    public static final Unsafe f37210a;

    /* renamed from: b */
    public static final Class<?> f37211b = C16877d.f37192a;

    /* renamed from: c */
    public static final C16894e f37212c;

    /* renamed from: d */
    public static final boolean f37213d;

    /* renamed from: e */
    public static final boolean f37214e;

    /* renamed from: f */
    public static final long f37215f = ((long) m28144b(byte[].class));

    /* renamed from: g */
    public static final long f37216g;

    /* renamed from: h */
    public static final boolean f37217h;

    /* renamed from: com.google.protobuf.f1$a */
    public static class C16890a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m28168a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m28168a();
        }
    }

    /* renamed from: com.google.protobuf.f1$b */
    public static final class C16891b extends C16894e {
        public C16891b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo59914c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo59915d(long j, Object obj) {
            return C16889f1.f37217h ? C16889f1.m28151i(j, obj) != 0 : C16889f1.m28152j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo59916e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo59917f(long j, Object obj) {
            return C16889f1.f37217h ? C16889f1.m28151i(j, obj) : C16889f1.m28152j(j, obj);
        }

        /* renamed from: g */
        public final double mo59918g(long j, Object obj) {
            return Double.longBitsToDouble(mo59928k(j, obj));
        }

        /* renamed from: h */
        public final float mo59919h(long j, Object obj) {
            return Float.intBitsToFloat(mo59927i(j, obj));
        }

        /* renamed from: j */
        public final long mo59920j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo59921n(Object obj, long j, boolean z) {
            if (C16889f1.f37217h) {
                C16889f1.m28161s(obj, j, z ? (byte) 1 : 0);
            } else {
                C16889f1.m28162t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo59922o(Object obj, long j, byte b) {
            if (C16889f1.f37217h) {
                C16889f1.m28161s(obj, j, b);
            } else {
                C16889f1.m28162t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo59923p(Object obj, long j, double d) {
            mo59932s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo59924q(Object obj, long j, float f) {
            mo59931r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.protobuf.f1$c */
    public static final class C16892c extends C16894e {
        public C16892c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo59914c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo59915d(long j, Object obj) {
            return C16889f1.f37217h ? C16889f1.m28151i(j, obj) != 0 : C16889f1.m28152j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo59916e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo59917f(long j, Object obj) {
            return C16889f1.f37217h ? C16889f1.m28151i(j, obj) : C16889f1.m28152j(j, obj);
        }

        /* renamed from: g */
        public final double mo59918g(long j, Object obj) {
            return Double.longBitsToDouble(mo59928k(j, obj));
        }

        /* renamed from: h */
        public final float mo59919h(long j, Object obj) {
            return Float.intBitsToFloat(mo59927i(j, obj));
        }

        /* renamed from: j */
        public final long mo59920j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo59921n(Object obj, long j, boolean z) {
            if (C16889f1.f37217h) {
                C16889f1.m28161s(obj, j, z ? (byte) 1 : 0);
            } else {
                C16889f1.m28162t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo59922o(Object obj, long j, byte b) {
            if (C16889f1.f37217h) {
                C16889f1.m28161s(obj, j, b);
            } else {
                C16889f1.m28162t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo59923p(Object obj, long j, double d) {
            mo59932s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo59924q(Object obj, long j, float f) {
            mo59931r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.protobuf.f1$d */
    public static final class C16893d extends C16894e {
        public C16893d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo59914c(long j, byte[] bArr, long j2) {
            this.f37218a.copyMemory((Object) null, j, bArr, C16889f1.f37215f + 0, j2);
        }

        /* renamed from: d */
        public final boolean mo59915d(long j, Object obj) {
            return this.f37218a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public final byte mo59916e(long j) {
            return this.f37218a.getByte(j);
        }

        /* renamed from: f */
        public final byte mo59917f(long j, Object obj) {
            return this.f37218a.getByte(obj, j);
        }

        /* renamed from: g */
        public final double mo59918g(long j, Object obj) {
            return this.f37218a.getDouble(obj, j);
        }

        /* renamed from: h */
        public final float mo59919h(long j, Object obj) {
            return this.f37218a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final long mo59920j(long j) {
            return this.f37218a.getLong(j);
        }

        /* renamed from: n */
        public final void mo59921n(Object obj, long j, boolean z) {
            this.f37218a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public final void mo59922o(Object obj, long j, byte b) {
            this.f37218a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public final void mo59923p(Object obj, long j, double d) {
            this.f37218a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public final void mo59924q(Object obj, long j, float f) {
            this.f37218a.putFloat(obj, j, f);
        }
    }

    /* renamed from: com.google.protobuf.f1$e */
    public static abstract class C16894e {

        /* renamed from: a */
        public Unsafe f37218a;

        public C16894e(Unsafe unsafe) {
            this.f37218a = unsafe;
        }

        /* renamed from: a */
        public final int mo59925a(Class<?> cls) {
            return this.f37218a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo59926b(Class<?> cls) {
            return this.f37218a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo59914c(long j, byte[] bArr, long j2);

        /* renamed from: d */
        public abstract boolean mo59915d(long j, Object obj);

        /* renamed from: e */
        public abstract byte mo59916e(long j);

        /* renamed from: f */
        public abstract byte mo59917f(long j, Object obj);

        /* renamed from: g */
        public abstract double mo59918g(long j, Object obj);

        /* renamed from: h */
        public abstract float mo59919h(long j, Object obj);

        /* renamed from: i */
        public final int mo59927i(long j, Object obj) {
            return this.f37218a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo59920j(long j);

        /* renamed from: k */
        public final long mo59928k(long j, Object obj) {
            return this.f37218a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo59929l(long j, Object obj) {
            return this.f37218a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo59930m(Field field) {
            return this.f37218a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo59921n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo59922o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo59923p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo59924q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo59931r(Object obj, int i, long j) {
            this.f37218a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo59932s(Object obj, long j, long j2) {
            this.f37218a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo59933t(long j, Object obj, Object obj2) {
            this.f37218a.putObject(obj, j, obj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0281, code lost:
        r1 = f37212c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f A[SYNTHETIC, Splitter:B:13:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c A[SYNTHETIC, Splitter:B:38:0x012c] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<com.google.protobuf.f1> r7 = com.google.protobuf.C16889f1.class
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            sun.misc.Unsafe r0 = m28158p()
            f37210a = r0
            java.lang.Class<?> r9 = com.google.protobuf.C16877d.f37192a
            f37211b = r9
            java.lang.Class r9 = java.lang.Long.TYPE
            boolean r10 = m28147e(r9)
            java.lang.Class r11 = java.lang.Integer.TYPE
            boolean r12 = m28147e(r11)
            if (r0 != 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            boolean r13 = com.google.protobuf.C16877d.m28067a()
            if (r13 == 0) goto L_0x0041
            if (r10 == 0) goto L_0x0037
            com.google.protobuf.f1$c r10 = new com.google.protobuf.f1$c
            r10.<init>(r0)
            goto L_0x0046
        L_0x0037:
            if (r12 == 0) goto L_0x003f
            com.google.protobuf.f1$b r10 = new com.google.protobuf.f1$b
            r10.<init>(r0)
            goto L_0x0046
        L_0x003f:
            r10 = 0
            goto L_0x0046
        L_0x0041:
            com.google.protobuf.f1$d r10 = new com.google.protobuf.f1$d
            r10.<init>(r0)
        L_0x0046:
            f37212c = r10
            java.lang.String r10 = "copyMemory"
            java.lang.String r12 = "putLong"
            java.lang.String r13 = "putInt"
            java.lang.String r14 = "getInt"
            java.lang.String r15 = "putByte"
            r16 = r1
            java.lang.String r1 = "getByte"
            r17 = r2
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            r18 = r3
            java.lang.String r3 = "objectFieldOffset"
            r19 = r4
            java.lang.String r4 = "getLong"
            r20 = 0
            r21 = r5
            r5 = 1
            if (r0 != 0) goto L_0x006f
            r24 = r1
            r22 = r6
            goto L_0x011f
        L_0x006f:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00fe }
            r22 = r6
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fa }
            java.lang.Class<java.lang.reflect.Field> r23 = java.lang.reflect.Field.class
            r6[r20] = r23     // Catch:{ all -> 0x00fa }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x00fa }
            r6 = 2
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fa }
            r5[r20] = r8     // Catch:{ all -> 0x00fa }
            r6 = 1
            r5[r6] = r9     // Catch:{ all -> 0x00fa }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x00fa }
            java.lang.reflect.Field r5 = m28146d()     // Catch:{ all -> 0x00fa }
            if (r5 != 0) goto L_0x0093
            r24 = r1
            goto L_0x011f
        L_0x0093:
            boolean r5 = com.google.protobuf.C16877d.m28067a()     // Catch:{ all -> 0x00fa }
            if (r5 == 0) goto L_0x009c
            r24 = r1
            goto L_0x00f6
        L_0x009c:
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fa }
            r6[r20] = r9     // Catch:{ all -> 0x00fa }
            r0.getMethod(r1, r6)     // Catch:{ all -> 0x00fa }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fa }
            r6[r20] = r9     // Catch:{ all -> 0x00fa }
            java.lang.Class r5 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00fa }
            r24 = r1
            r1 = 1
            r6[r1] = r5     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r15, r6)     // Catch:{ all -> 0x00f8 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f8 }
            r5[r20] = r9     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x00f8 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00f8 }
            r6[r20] = r9     // Catch:{ all -> 0x00f8 }
            r6[r1] = r11     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r13, r6)     // Catch:{ all -> 0x00f8 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f8 }
            r5[r20] = r9     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x00f8 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00f8 }
            r6[r20] = r9     // Catch:{ all -> 0x00f8 }
            r6[r1] = r9     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r12, r6)     // Catch:{ all -> 0x00f8 }
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x00f8 }
            r6[r20] = r9     // Catch:{ all -> 0x00f8 }
            r6[r1] = r9     // Catch:{ all -> 0x00f8 }
            r1 = 2
            r6[r1] = r9     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r10, r6)     // Catch:{ all -> 0x00f8 }
            r1 = 5
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f8 }
            r1[r20] = r8     // Catch:{ all -> 0x00f8 }
            r5 = 1
            r1[r5] = r9     // Catch:{ all -> 0x00f8 }
            r5 = 2
            r1[r5] = r8     // Catch:{ all -> 0x00f8 }
            r5 = 3
            r1[r5] = r9     // Catch:{ all -> 0x00f8 }
            r5 = 4
            r1[r5] = r9     // Catch:{ all -> 0x00f8 }
            r0.getMethod(r10, r1)     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            r0 = 1
            goto L_0x0121
        L_0x00f8:
            r0 = move-exception
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r24 = r1
            goto L_0x0103
        L_0x00fe:
            r0 = move-exception
            r24 = r1
            r22 = r6
        L_0x0103:
            java.lang.String r1 = r7.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r1.log(r5, r0)
        L_0x011f:
            r0 = r20
        L_0x0121:
            f37213d = r0
            sun.misc.Unsafe r0 = f37210a
            if (r0 != 0) goto L_0x012c
            r23 = r20
            r6 = 1
            goto L_0x024c
        L_0x012c:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x022c }
            r1 = 1
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0229 }
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r20] = r6     // Catch:{ all -> 0x0229 }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x0229 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0229 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r20] = r6     // Catch:{ all -> 0x0229 }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x0229 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0229 }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r5[r20] = r1     // Catch:{ all -> 0x022c }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x022c }
            r1 = 2
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x022c }
            r3[r20] = r8     // Catch:{ all -> 0x022c }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x022c }
            r5 = 1
            r3[r5] = r1     // Catch:{ all -> 0x0226 }
            r0.getMethod(r14, r3)     // Catch:{ all -> 0x0226 }
            r3 = 3
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0226 }
            r6[r20] = r8     // Catch:{ all -> 0x0226 }
            r6[r5] = r1     // Catch:{ all -> 0x0226 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x022c }
            r5 = 2
            r6[r5] = r3     // Catch:{ all -> 0x022c }
            r0.getMethod(r13, r6)     // Catch:{ all -> 0x022c }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x022c }
            r3[r20] = r8     // Catch:{ all -> 0x022c }
            r5 = 1
            r3[r5] = r1     // Catch:{ all -> 0x0226 }
            r0.getMethod(r4, r3)     // Catch:{ all -> 0x0226 }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0226 }
            r4[r20] = r8     // Catch:{ all -> 0x0226 }
            r4[r5] = r1     // Catch:{ all -> 0x0226 }
            r3 = 2
            r4[r3] = r1     // Catch:{ all -> 0x022c }
            r0.getMethod(r12, r4)     // Catch:{ all -> 0x022c }
            java.lang.String r4 = "getObject"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x022c }
            r5[r20] = r8     // Catch:{ all -> 0x022c }
            r3 = 1
            r5[r3] = r1     // Catch:{ all -> 0x0223 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0223 }
            java.lang.String r4 = "putObject"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0223 }
            r6[r20] = r8     // Catch:{ all -> 0x0223 }
            r6[r3] = r1     // Catch:{ all -> 0x0223 }
            r3 = 2
            r6[r3] = r8     // Catch:{ all -> 0x022c }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x022c }
            boolean r4 = com.google.protobuf.C16877d.m28067a()     // Catch:{ all -> 0x022c }
            if (r4 == 0) goto L_0x01a9
            r6 = 1
            r23 = 1
            goto L_0x024c
        L_0x01a9:
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x022c }
            r4[r20] = r8     // Catch:{ all -> 0x022c }
            r3 = 1
            r4[r3] = r1     // Catch:{ all -> 0x0223 }
            r5 = r24
            r0.getMethod(r5, r4)     // Catch:{ all -> 0x0223 }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0223 }
            r5[r20] = r8     // Catch:{ all -> 0x0223 }
            r5[r3] = r1     // Catch:{ all -> 0x0223 }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x022c }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x022c }
            r0.getMethod(r15, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x022c }
            r5[r20] = r8     // Catch:{ all -> 0x022c }
            r4 = 1
            r5[r4] = r1     // Catch:{ all -> 0x0220 }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0220 }
            r6[r20] = r8     // Catch:{ all -> 0x0220 }
            r6[r4] = r1     // Catch:{ all -> 0x0220 }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x022c }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x022c }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x022c }
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x022c }
            r4[r20] = r8     // Catch:{ all -> 0x022c }
            r5 = 1
            r4[r5] = r1     // Catch:{ all -> 0x0226 }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x0226 }
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0226 }
            r6[r20] = r8     // Catch:{ all -> 0x0226 }
            r6[r5] = r1     // Catch:{ all -> 0x0226 }
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x022c }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x022c }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x022c }
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x022c }
            r4[r20] = r8     // Catch:{ all -> 0x022c }
            r6 = 1
            r4[r6] = r1     // Catch:{ all -> 0x021e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021e }
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x021e }
            r4[r20] = r8     // Catch:{ all -> 0x021e }
            r4[r6] = r1     // Catch:{ all -> 0x021e }
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch:{ all -> 0x021e }
            r5 = 2
            r4[r5] = r1     // Catch:{ all -> 0x021e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021e }
            r23 = r6
            goto L_0x024c
        L_0x021e:
            r0 = move-exception
            goto L_0x022e
        L_0x0220:
            r0 = move-exception
            r6 = r4
            goto L_0x022e
        L_0x0223:
            r0 = move-exception
            r6 = r3
            goto L_0x022e
        L_0x0226:
            r0 = move-exception
            r6 = r5
            goto L_0x022e
        L_0x0229:
            r0 = move-exception
            r6 = r1
            goto L_0x022e
        L_0x022c:
            r0 = move-exception
            r6 = 1
        L_0x022e:
            java.lang.String r1 = r7.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.log(r3, r0)
            r23 = r20
        L_0x024c:
            f37214e = r23
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m28144b(r0)
            long r0 = (long) r0
            f37215f = r0
            m28144b(r22)
            m28145c(r22)
            m28144b(r21)
            m28145c(r21)
            m28144b(r19)
            m28145c(r19)
            m28144b(r18)
            m28145c(r18)
            m28144b(r17)
            m28145c(r17)
            m28144b(r16)
            m28145c(r16)
            java.lang.reflect.Field r0 = m28146d()
            if (r0 == 0) goto L_0x028b
            com.google.protobuf.f1$e r1 = f37212c
            if (r1 != 0) goto L_0x0286
            goto L_0x028b
        L_0x0286:
            long r0 = r1.mo59930m(r0)
            goto L_0x028d
        L_0x028b:
            r0 = -1
        L_0x028d:
            f37216g = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0299
            r20 = r6
        L_0x0299:
            f37217h = r20
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16889f1.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m28143a(Class<T> cls) {
        try {
            return f37210a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m28144b(Class<?> cls) {
        if (f37214e) {
            return f37212c.mo59925a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m28145c(Class cls) {
        if (f37214e) {
            f37212c.mo59926b(cls);
        }
    }

    /* renamed from: d */
    public static Field m28146d() {
        Field field;
        Field field2;
        if (C16877d.m28067a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: e */
    public static boolean m28147e(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C16877d.m28067a()) {
            return false;
        }
        try {
            Class<?> cls3 = f37211b;
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

    /* renamed from: f */
    public static boolean m28148f(long j, Object obj) {
        return f37212c.mo59915d(j, obj);
    }

    /* renamed from: g */
    public static byte m28149g(long j) {
        return f37212c.mo59916e(j);
    }

    /* renamed from: h */
    public static byte m28150h(long j, byte[] bArr) {
        return f37212c.mo59917f(f37215f + j, bArr);
    }

    /* renamed from: i */
    public static byte m28151i(long j, Object obj) {
        return (byte) ((m28155m(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static byte m28152j(long j, Object obj) {
        return (byte) ((m28155m(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: k */
    public static double m28153k(long j, Object obj) {
        return f37212c.mo59918g(j, obj);
    }

    /* renamed from: l */
    public static float m28154l(long j, Object obj) {
        return f37212c.mo59919h(j, obj);
    }

    /* renamed from: m */
    public static int m28155m(long j, Object obj) {
        return f37212c.mo59927i(j, obj);
    }

    /* renamed from: n */
    public static long m28156n(long j, Object obj) {
        return f37212c.mo59928k(j, obj);
    }

    /* renamed from: o */
    public static Object m28157o(long j, Object obj) {
        return f37212c.mo59929l(j, obj);
    }

    /* renamed from: p */
    public static Unsafe m28158p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16890a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m28159q(Object obj, long j, boolean z) {
        f37212c.mo59921n(obj, j, z);
    }

    /* renamed from: r */
    public static void m28160r(byte[] bArr, byte b, long j) {
        f37212c.mo59922o(bArr, f37215f + j, b);
    }

    /* renamed from: s */
    public static void m28161s(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int m = m28155m(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m28165w(obj, ((255 & b) << i) | (m & (~(255 << i))), j2);
    }

    /* renamed from: t */
    public static void m28162t(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m28165w(obj, ((255 & b) << i) | (m28155m(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: u */
    public static void m28163u(Object obj, long j, double d) {
        f37212c.mo59923p(obj, j, d);
    }

    /* renamed from: v */
    public static void m28164v(Object obj, long j, float f) {
        f37212c.mo59924q(obj, j, f);
    }

    /* renamed from: w */
    public static void m28165w(Object obj, int i, long j) {
        f37212c.mo59931r(obj, i, j);
    }

    /* renamed from: x */
    public static void m28166x(Object obj, long j, long j2) {
        f37212c.mo59932s(obj, j, j2);
    }

    /* renamed from: y */
    public static void m28167y(long j, Object obj, Object obj2) {
        f37212c.mo59933t(j, obj, obj2);
    }
}
