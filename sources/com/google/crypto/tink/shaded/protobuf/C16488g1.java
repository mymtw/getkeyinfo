package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g1 */
public final class C16488g1 {

    /* renamed from: a */
    public static final Logger f36609a = Logger.getLogger(C16488g1.class.getName());

    /* renamed from: b */
    public static final Unsafe f36610b;

    /* renamed from: c */
    public static final Class<?> f36611c = C16474d.f36587a;

    /* renamed from: d */
    public static final C16493e f36612d;

    /* renamed from: e */
    public static final boolean f36613e;

    /* renamed from: f */
    public static final boolean f36614f;

    /* renamed from: g */
    public static final long f36615g = ((long) m26836b(byte[].class));

    /* renamed from: h */
    public static final long f36616h;

    /* renamed from: i */
    public static final boolean f36617i;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g1$a */
    public class C16489a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m26860a() throws Exception {
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
            return m26860a();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g1$b */
    public static final class C16490b extends C16493e {
        public C16490b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo58740c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo58741d(long j, Object obj) {
            return C16488g1.f36617i ? C16488g1.m26843i(j, obj) != 0 : C16488g1.m26844j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo58742e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo58743f(long j, Object obj) {
            return C16488g1.f36617i ? C16488g1.m26843i(j, obj) : C16488g1.m26844j(j, obj);
        }

        /* renamed from: g */
        public final double mo58744g(long j, Object obj) {
            return Double.longBitsToDouble(mo58754k(j, obj));
        }

        /* renamed from: h */
        public final float mo58745h(long j, Object obj) {
            return Float.intBitsToFloat(mo58753i(j, obj));
        }

        /* renamed from: j */
        public final long mo58746j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo58747n(Object obj, long j, boolean z) {
            if (C16488g1.f36617i) {
                C16488g1.m26853s(obj, j, z ? (byte) 1 : 0);
            } else {
                C16488g1.m26854t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo58748o(Object obj, long j, byte b) {
            if (C16488g1.f36617i) {
                C16488g1.m26853s(obj, j, b);
            } else {
                C16488g1.m26854t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo58749p(Object obj, long j, double d) {
            mo58758s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo58750q(Object obj, long j, float f) {
            mo58757r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g1$c */
    public static final class C16491c extends C16493e {
        public C16491c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo58740c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo58741d(long j, Object obj) {
            return C16488g1.f36617i ? C16488g1.m26843i(j, obj) != 0 : C16488g1.m26844j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo58742e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo58743f(long j, Object obj) {
            return C16488g1.f36617i ? C16488g1.m26843i(j, obj) : C16488g1.m26844j(j, obj);
        }

        /* renamed from: g */
        public final double mo58744g(long j, Object obj) {
            return Double.longBitsToDouble(mo58754k(j, obj));
        }

        /* renamed from: h */
        public final float mo58745h(long j, Object obj) {
            return Float.intBitsToFloat(mo58753i(j, obj));
        }

        /* renamed from: j */
        public final long mo58746j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo58747n(Object obj, long j, boolean z) {
            if (C16488g1.f36617i) {
                C16488g1.m26853s(obj, j, z ? (byte) 1 : 0);
            } else {
                C16488g1.m26854t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo58748o(Object obj, long j, byte b) {
            if (C16488g1.f36617i) {
                C16488g1.m26853s(obj, j, b);
            } else {
                C16488g1.m26854t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo58749p(Object obj, long j, double d) {
            mo58758s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo58750q(Object obj, long j, float f) {
            mo58757r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g1$d */
    public static final class C16492d extends C16493e {
        public C16492d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo58740c(long j, byte[] bArr, long j2) {
            this.f36618a.copyMemory((Object) null, j, bArr, C16488g1.f36615g + 0, j2);
        }

        /* renamed from: d */
        public final boolean mo58741d(long j, Object obj) {
            return this.f36618a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public final byte mo58742e(long j) {
            return this.f36618a.getByte(j);
        }

        /* renamed from: f */
        public final byte mo58743f(long j, Object obj) {
            return this.f36618a.getByte(obj, j);
        }

        /* renamed from: g */
        public final double mo58744g(long j, Object obj) {
            return this.f36618a.getDouble(obj, j);
        }

        /* renamed from: h */
        public final float mo58745h(long j, Object obj) {
            return this.f36618a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final long mo58746j(long j) {
            return this.f36618a.getLong(j);
        }

        /* renamed from: n */
        public final void mo58747n(Object obj, long j, boolean z) {
            this.f36618a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public final void mo58748o(Object obj, long j, byte b) {
            this.f36618a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public final void mo58749p(Object obj, long j, double d) {
            this.f36618a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public final void mo58750q(Object obj, long j, float f) {
            this.f36618a.putFloat(obj, j, f);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g1$e */
    public static abstract class C16493e {

        /* renamed from: a */
        public Unsafe f36618a;

        public C16493e(Unsafe unsafe) {
            this.f36618a = unsafe;
        }

        /* renamed from: a */
        public final int mo58751a(Class<?> cls) {
            return this.f36618a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo58752b(Class<?> cls) {
            return this.f36618a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo58740c(long j, byte[] bArr, long j2);

        /* renamed from: d */
        public abstract boolean mo58741d(long j, Object obj);

        /* renamed from: e */
        public abstract byte mo58742e(long j);

        /* renamed from: f */
        public abstract byte mo58743f(long j, Object obj);

        /* renamed from: g */
        public abstract double mo58744g(long j, Object obj);

        /* renamed from: h */
        public abstract float mo58745h(long j, Object obj);

        /* renamed from: i */
        public final int mo58753i(long j, Object obj) {
            return this.f36618a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo58746j(long j);

        /* renamed from: k */
        public final long mo58754k(long j, Object obj) {
            return this.f36618a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo58755l(long j, Object obj) {
            return this.f36618a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo58756m(Field field) {
            return this.f36618a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo58747n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo58748o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo58749p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo58750q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo58757r(Object obj, int i, long j) {
            this.f36618a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo58758s(Object obj, long j, long j2) {
            this.f36618a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo58759t(long j, Object obj, Object obj2) {
            this.f36618a.putObject(obj, j, obj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0271, code lost:
        r1 = f36612d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074 A[SYNTHETIC, Splitter:B:13:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012a A[SYNTHETIC, Splitter:B:38:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.g1> r0 = com.google.crypto.tink.shaded.protobuf.C16488g1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f36609a = r0
            sun.misc.Unsafe r0 = m26850p()
            f36610b = r0
            java.lang.Class<?> r8 = com.google.crypto.tink.shaded.protobuf.C16474d.f36587a
            f36611c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m26839e(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = m26839e(r10)
            if (r0 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r12 = com.google.crypto.tink.shaded.protobuf.C16474d.m26752a()
            if (r12 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x0041
            com.google.crypto.tink.shaded.protobuf.g1$c r9 = new com.google.crypto.tink.shaded.protobuf.g1$c
            r9.<init>(r0)
            goto L_0x0050
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            com.google.crypto.tink.shaded.protobuf.g1$b r9 = new com.google.crypto.tink.shaded.protobuf.g1$b
            r9.<init>(r0)
            goto L_0x0050
        L_0x0049:
            r9 = 0
            goto L_0x0050
        L_0x004b:
            com.google.crypto.tink.shaded.protobuf.g1$d r9 = new com.google.crypto.tink.shaded.protobuf.g1$d
            r9.<init>(r0)
        L_0x0050:
            f36612d = r9
            java.lang.String r9 = "copyMemory"
            java.lang.String r11 = "putLong"
            java.lang.String r12 = "putInt"
            java.lang.String r13 = "getInt"
            java.lang.String r14 = "putByte"
            java.lang.String r15 = "getByte"
            r16 = r1
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            r17 = r2
            java.lang.String r2 = "objectFieldOffset"
            r18 = r3
            java.lang.String r3 = "getLong"
            r19 = 0
            r20 = r4
            r4 = 1
            if (r0 != 0) goto L_0x0074
            r21 = r5
            goto L_0x0094
        L_0x0074:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0103 }
            r21 = r5
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            java.lang.Class<java.lang.reflect.Field> r22 = java.lang.reflect.Field.class
            r5[r19] = r22     // Catch:{ all -> 0x00ff }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x00ff }
            r5 = 2
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x00ff }
            r4[r19] = r7     // Catch:{ all -> 0x00ff }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00ff }
            java.lang.reflect.Field r4 = m26838d()     // Catch:{ all -> 0x00ff }
            if (r4 != 0) goto L_0x0098
        L_0x0094:
            r23 = r6
            goto L_0x011d
        L_0x0098:
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16474d.m26752a()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00a1
            r23 = r6
            goto L_0x00fb
        L_0x00a1:
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r15, r5)     // Catch:{ all -> 0x00ff }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00ff }
            r23 = r6
            r6 = 1
            r5[r6] = r4     // Catch:{ all -> 0x00fd }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r10     // Catch:{ all -> 0x00fd }
            r0.getMethod(r12, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r11, r5)     // Catch:{ all -> 0x00fd }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r4 = 2
            r5[r4] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x00fd }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r4[r19] = r7     // Catch:{ all -> 0x00fd }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 2
            r4[r5] = r7     // Catch:{ all -> 0x00fd }
            r5 = 3
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 4
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r4)     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            r0 = 1
            goto L_0x011f
        L_0x00fd:
            r0 = move-exception
            goto L_0x0107
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            r23 = r6
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r21 = r5
            goto L_0x0100
        L_0x0107:
            java.util.logging.Logger r4 = f36609a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.log(r5, r0)
        L_0x011d:
            r0 = r19
        L_0x011f:
            f36613e = r0
            sun.misc.Unsafe r0 = f36610b
            if (r0 != 0) goto L_0x012a
            r22 = r19
            r5 = 1
            goto L_0x023c
        L_0x012a:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0222 }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r5[r19] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x0222 }
            r2 = 2
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x021d }
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r12, r6)     // Catch:{ all -> 0x0222 }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r3 = 2
            r4[r3] = r2     // Catch:{ all -> 0x0222 }
            r0.getMethod(r11, r4)     // Catch:{ all -> 0x0222 }
            java.lang.String r4 = "getObject"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x0222 }
            r5[r19] = r7     // Catch:{ all -> 0x0222 }
            r3 = 1
            r5[r3] = r2     // Catch:{ all -> 0x021a }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x021a }
            java.lang.String r4 = "putObject"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021a }
            r6[r19] = r7     // Catch:{ all -> 0x021a }
            r6[r3] = r2     // Catch:{ all -> 0x021a }
            r3 = 2
            r6[r3] = r7     // Catch:{ all -> 0x0222 }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x0222 }
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16474d.m26752a()     // Catch:{ all -> 0x0222 }
            if (r4 == 0) goto L_0x01a7
            r5 = 1
            r22 = 1
            goto L_0x023c
        L_0x01a7:
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x021a }
            r0.getMethod(r15, r4)     // Catch:{ all -> 0x021a }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021a }
            r5[r19] = r7     // Catch:{ all -> 0x021a }
            r5[r3] = r2     // Catch:{ all -> 0x021a }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0222 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0222 }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0222 }
            r5[r19] = r7     // Catch:{ all -> 0x0222 }
            r4 = 1
            r5[r4] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r6[r19] = r7     // Catch:{ all -> 0x021f }
            r6[r4] = r2     // Catch:{ all -> 0x021f }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x021d }
            r6 = 2
            r4[r6] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            r22 = r5
            goto L_0x023c
        L_0x021a:
            r0 = move-exception
            r5 = r3
            goto L_0x0224
        L_0x021d:
            r0 = move-exception
            goto L_0x0224
        L_0x021f:
            r0 = move-exception
            r5 = r4
            goto L_0x0224
        L_0x0222:
            r0 = move-exception
            r5 = 1
        L_0x0224:
            java.util.logging.Logger r2 = f36609a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0)
            r22 = r19
        L_0x023c:
            f36614f = r22
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m26836b(r0)
            long r0 = (long) r0
            f36615g = r0
            m26836b(r23)
            m26837c(r23)
            m26836b(r21)
            m26837c(r21)
            m26836b(r20)
            m26837c(r20)
            m26836b(r18)
            m26837c(r18)
            m26836b(r17)
            m26837c(r17)
            m26836b(r16)
            m26837c(r16)
            java.lang.reflect.Field r0 = m26838d()
            if (r0 == 0) goto L_0x027b
            com.google.crypto.tink.shaded.protobuf.g1$e r1 = f36612d
            if (r1 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            long r0 = r1.mo58756m(r0)
            goto L_0x027d
        L_0x027b:
            r0 = -1
        L_0x027d:
            f36616h = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0289
            r19 = r5
        L_0x0289:
            f36617i = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16488g1.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m26835a(Class<T> cls) {
        try {
            return f36610b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m26836b(Class<?> cls) {
        if (f36614f) {
            return f36612d.mo58751a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m26837c(Class cls) {
        if (f36614f) {
            f36612d.mo58752b(cls);
        }
    }

    /* renamed from: d */
    public static Field m26838d() {
        Field field;
        Field field2;
        if (C16474d.m26752a()) {
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
    public static boolean m26839e(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C16474d.m26752a()) {
            return false;
        }
        try {
            Class<?> cls3 = f36611c;
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
    public static boolean m26840f(long j, Object obj) {
        return f36612d.mo58741d(j, obj);
    }

    /* renamed from: g */
    public static byte m26841g(long j) {
        return f36612d.mo58742e(j);
    }

    /* renamed from: h */
    public static byte m26842h(long j, byte[] bArr) {
        return f36612d.mo58743f(f36615g + j, bArr);
    }

    /* renamed from: i */
    public static byte m26843i(long j, Object obj) {
        return (byte) ((m26847m(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static byte m26844j(long j, Object obj) {
        return (byte) ((m26847m(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: k */
    public static double m26845k(long j, Object obj) {
        return f36612d.mo58744g(j, obj);
    }

    /* renamed from: l */
    public static float m26846l(long j, Object obj) {
        return f36612d.mo58745h(j, obj);
    }

    /* renamed from: m */
    public static int m26847m(long j, Object obj) {
        return f36612d.mo58753i(j, obj);
    }

    /* renamed from: n */
    public static long m26848n(long j, Object obj) {
        return f36612d.mo58754k(j, obj);
    }

    /* renamed from: o */
    public static Object m26849o(long j, Object obj) {
        return f36612d.mo58755l(j, obj);
    }

    /* renamed from: p */
    public static Unsafe m26850p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16489a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m26851q(Object obj, long j, boolean z) {
        f36612d.mo58747n(obj, j, z);
    }

    /* renamed from: r */
    public static void m26852r(byte[] bArr, byte b, long j) {
        f36612d.mo58748o(bArr, f36615g + j, b);
    }

    /* renamed from: s */
    public static void m26853s(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int m = m26847m(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m26857w(obj, ((255 & b) << i) | (m & (~(255 << i))), j2);
    }

    /* renamed from: t */
    public static void m26854t(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m26857w(obj, ((255 & b) << i) | (m26847m(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: u */
    public static void m26855u(Object obj, long j, double d) {
        f36612d.mo58749p(obj, j, d);
    }

    /* renamed from: v */
    public static void m26856v(Object obj, long j, float f) {
        f36612d.mo58750q(obj, j, f);
    }

    /* renamed from: w */
    public static void m26857w(Object obj, int i, long j) {
        f36612d.mo58757r(obj, i, j);
    }

    /* renamed from: x */
    public static void m26858x(Object obj, long j, long j2) {
        f36612d.mo58758s(obj, j, j2);
    }

    /* renamed from: y */
    public static void m26859y(long j, Object obj, Object obj2) {
        f36612d.mo58759t(j, obj, obj2);
    }
}
