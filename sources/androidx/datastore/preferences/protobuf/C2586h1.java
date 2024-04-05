package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.h1 */
public final class C2586h1 {

    /* renamed from: a */
    public static final Logger f5876a = Logger.getLogger(C2586h1.class.getName());

    /* renamed from: b */
    public static final Unsafe f5877b;

    /* renamed from: c */
    public static final Class<?> f5878c = C2566d.f5844a;

    /* renamed from: d */
    public static final C2591e f5879d;

    /* renamed from: e */
    public static final boolean f5880e;

    /* renamed from: f */
    public static final boolean f5881f;

    /* renamed from: g */
    public static final long f5882g = ((long) m5823b(byte[].class));

    /* renamed from: h */
    public static final long f5883h;

    /* renamed from: i */
    public static final boolean f5884i;

    /* renamed from: androidx.datastore.preferences.protobuf.h1$a */
    public static class C2587a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m5847a() throws Exception {
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
            return m5847a();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h1$b */
    public static final class C2588b extends C2591e {
        public C2588b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo9679c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo9680d(long j, Object obj) {
            return C2586h1.f5884i ? C2586h1.m5830i(j, obj) != 0 : C2586h1.m5831j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo9681e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo9682f(long j, Object obj) {
            return C2586h1.f5884i ? C2586h1.m5830i(j, obj) : C2586h1.m5831j(j, obj);
        }

        /* renamed from: g */
        public final double mo9683g(long j, Object obj) {
            return Double.longBitsToDouble(mo9693k(j, obj));
        }

        /* renamed from: h */
        public final float mo9684h(long j, Object obj) {
            return Float.intBitsToFloat(mo9692i(j, obj));
        }

        /* renamed from: j */
        public final long mo9685j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo9686n(Object obj, long j, boolean z) {
            if (C2586h1.f5884i) {
                C2586h1.m5840s(obj, j, z ? (byte) 1 : 0);
            } else {
                C2586h1.m5841t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo9687o(Object obj, long j, byte b) {
            if (C2586h1.f5884i) {
                C2586h1.m5840s(obj, j, b);
            } else {
                C2586h1.m5841t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo9688p(Object obj, long j, double d) {
            mo9697s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo9689q(Object obj, long j, float f) {
            mo9696r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h1$c */
    public static final class C2589c extends C2591e {
        public C2589c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo9679c(long j, byte[] bArr, long j2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final boolean mo9680d(long j, Object obj) {
            return C2586h1.f5884i ? C2586h1.m5830i(j, obj) != 0 : C2586h1.m5831j(j, obj) != 0;
        }

        /* renamed from: e */
        public final byte mo9681e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public final byte mo9682f(long j, Object obj) {
            return C2586h1.f5884i ? C2586h1.m5830i(j, obj) : C2586h1.m5831j(j, obj);
        }

        /* renamed from: g */
        public final double mo9683g(long j, Object obj) {
            return Double.longBitsToDouble(mo9693k(j, obj));
        }

        /* renamed from: h */
        public final float mo9684h(long j, Object obj) {
            return Float.intBitsToFloat(mo9692i(j, obj));
        }

        /* renamed from: j */
        public final long mo9685j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public final void mo9686n(Object obj, long j, boolean z) {
            if (C2586h1.f5884i) {
                C2586h1.m5840s(obj, j, z ? (byte) 1 : 0);
            } else {
                C2586h1.m5841t(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public final void mo9687o(Object obj, long j, byte b) {
            if (C2586h1.f5884i) {
                C2586h1.m5840s(obj, j, b);
            } else {
                C2586h1.m5841t(obj, j, b);
            }
        }

        /* renamed from: p */
        public final void mo9688p(Object obj, long j, double d) {
            mo9697s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public final void mo9689q(Object obj, long j, float f) {
            mo9696r(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h1$d */
    public static final class C2590d extends C2591e {
        public C2590d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final void mo9679c(long j, byte[] bArr, long j2) {
            this.f5885a.copyMemory((Object) null, j, bArr, C2586h1.f5882g + 0, j2);
        }

        /* renamed from: d */
        public final boolean mo9680d(long j, Object obj) {
            return this.f5885a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public final byte mo9681e(long j) {
            return this.f5885a.getByte(j);
        }

        /* renamed from: f */
        public final byte mo9682f(long j, Object obj) {
            return this.f5885a.getByte(obj, j);
        }

        /* renamed from: g */
        public final double mo9683g(long j, Object obj) {
            return this.f5885a.getDouble(obj, j);
        }

        /* renamed from: h */
        public final float mo9684h(long j, Object obj) {
            return this.f5885a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final long mo9685j(long j) {
            return this.f5885a.getLong(j);
        }

        /* renamed from: n */
        public final void mo9686n(Object obj, long j, boolean z) {
            this.f5885a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public final void mo9687o(Object obj, long j, byte b) {
            this.f5885a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public final void mo9688p(Object obj, long j, double d) {
            this.f5885a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public final void mo9689q(Object obj, long j, float f) {
            this.f5885a.putFloat(obj, j, f);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h1$e */
    public static abstract class C2591e {

        /* renamed from: a */
        public Unsafe f5885a;

        public C2591e(Unsafe unsafe) {
            this.f5885a = unsafe;
        }

        /* renamed from: a */
        public final int mo9690a(Class<?> cls) {
            return this.f5885a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo9691b(Class<?> cls) {
            return this.f5885a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo9679c(long j, byte[] bArr, long j2);

        /* renamed from: d */
        public abstract boolean mo9680d(long j, Object obj);

        /* renamed from: e */
        public abstract byte mo9681e(long j);

        /* renamed from: f */
        public abstract byte mo9682f(long j, Object obj);

        /* renamed from: g */
        public abstract double mo9683g(long j, Object obj);

        /* renamed from: h */
        public abstract float mo9684h(long j, Object obj);

        /* renamed from: i */
        public final int mo9692i(long j, Object obj) {
            return this.f5885a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo9685j(long j);

        /* renamed from: k */
        public final long mo9693k(long j, Object obj) {
            return this.f5885a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo9694l(long j, Object obj) {
            return this.f5885a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo9695m(Field field) {
            return this.f5885a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo9686n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo9687o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo9688p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo9689q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo9696r(Object obj, int i, long j) {
            this.f5885a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo9697s(Object obj, long j, long j2) {
            this.f5885a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo9698t(long j, Object obj, Object obj2) {
            this.f5885a.putObject(obj, j, obj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0271, code lost:
        r1 = f5879d;
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
            java.lang.Class<androidx.datastore.preferences.protobuf.h1> r0 = androidx.datastore.preferences.protobuf.C2586h1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f5876a = r0
            sun.misc.Unsafe r0 = m5837p()
            f5877b = r0
            java.lang.Class<?> r8 = androidx.datastore.preferences.protobuf.C2566d.f5844a
            f5878c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m5826e(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = m5826e(r10)
            if (r0 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r12 = androidx.datastore.preferences.protobuf.C2566d.m5712a()
            if (r12 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x0041
            androidx.datastore.preferences.protobuf.h1$c r9 = new androidx.datastore.preferences.protobuf.h1$c
            r9.<init>(r0)
            goto L_0x0050
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            androidx.datastore.preferences.protobuf.h1$b r9 = new androidx.datastore.preferences.protobuf.h1$b
            r9.<init>(r0)
            goto L_0x0050
        L_0x0049:
            r9 = 0
            goto L_0x0050
        L_0x004b:
            androidx.datastore.preferences.protobuf.h1$d r9 = new androidx.datastore.preferences.protobuf.h1$d
            r9.<init>(r0)
        L_0x0050:
            f5879d = r9
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
            java.lang.reflect.Field r4 = m5825d()     // Catch:{ all -> 0x00ff }
            if (r4 != 0) goto L_0x0098
        L_0x0094:
            r23 = r6
            goto L_0x011d
        L_0x0098:
            boolean r4 = androidx.datastore.preferences.protobuf.C2566d.m5712a()     // Catch:{ all -> 0x00ff }
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
            java.util.logging.Logger r4 = f5876a
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
            f5880e = r0
            sun.misc.Unsafe r0 = f5877b
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
            boolean r4 = androidx.datastore.preferences.protobuf.C2566d.m5712a()     // Catch:{ all -> 0x0222 }
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
            java.util.logging.Logger r2 = f5876a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0)
            r22 = r19
        L_0x023c:
            f5881f = r22
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m5823b(r0)
            long r0 = (long) r0
            f5882g = r0
            m5823b(r23)
            m5824c(r23)
            m5823b(r21)
            m5824c(r21)
            m5823b(r20)
            m5824c(r20)
            m5823b(r18)
            m5824c(r18)
            m5823b(r17)
            m5824c(r17)
            m5823b(r16)
            m5824c(r16)
            java.lang.reflect.Field r0 = m5825d()
            if (r0 == 0) goto L_0x027b
            androidx.datastore.preferences.protobuf.h1$e r1 = f5879d
            if (r1 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            long r0 = r1.mo9695m(r0)
            goto L_0x027d
        L_0x027b:
            r0 = -1
        L_0x027d:
            f5883h = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0289
            r19 = r5
        L_0x0289:
            f5884i = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2586h1.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m5822a(Class<T> cls) {
        try {
            return f5877b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m5823b(Class<?> cls) {
        if (f5881f) {
            return f5879d.mo9690a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m5824c(Class cls) {
        if (f5881f) {
            f5879d.mo9691b(cls);
        }
    }

    /* renamed from: d */
    public static Field m5825d() {
        Field field;
        Field field2;
        if (C2566d.m5712a()) {
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
    public static boolean m5826e(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C2566d.m5712a()) {
            return false;
        }
        try {
            Class<?> cls3 = f5878c;
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
    public static boolean m5827f(long j, Object obj) {
        return f5879d.mo9680d(j, obj);
    }

    /* renamed from: g */
    public static byte m5828g(long j) {
        return f5879d.mo9681e(j);
    }

    /* renamed from: h */
    public static byte m5829h(long j, byte[] bArr) {
        return f5879d.mo9682f(f5882g + j, bArr);
    }

    /* renamed from: i */
    public static byte m5830i(long j, Object obj) {
        return (byte) ((m5834m(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static byte m5831j(long j, Object obj) {
        return (byte) ((m5834m(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: k */
    public static double m5832k(long j, Object obj) {
        return f5879d.mo9683g(j, obj);
    }

    /* renamed from: l */
    public static float m5833l(long j, Object obj) {
        return f5879d.mo9684h(j, obj);
    }

    /* renamed from: m */
    public static int m5834m(long j, Object obj) {
        return f5879d.mo9692i(j, obj);
    }

    /* renamed from: n */
    public static long m5835n(long j, Object obj) {
        return f5879d.mo9693k(j, obj);
    }

    /* renamed from: o */
    public static Object m5836o(long j, Object obj) {
        return f5879d.mo9694l(j, obj);
    }

    /* renamed from: p */
    public static Unsafe m5837p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2587a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m5838q(Object obj, long j, boolean z) {
        f5879d.mo9686n(obj, j, z);
    }

    /* renamed from: r */
    public static void m5839r(byte[] bArr, byte b, long j) {
        f5879d.mo9687o(bArr, f5882g + j, b);
    }

    /* renamed from: s */
    public static void m5840s(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int m = m5834m(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m5844w(obj, ((255 & b) << i) | (m & (~(255 << i))), j2);
    }

    /* renamed from: t */
    public static void m5841t(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m5844w(obj, ((255 & b) << i) | (m5834m(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: u */
    public static void m5842u(Object obj, long j, double d) {
        f5879d.mo9688p(obj, j, d);
    }

    /* renamed from: v */
    public static void m5843v(Object obj, long j, float f) {
        f5879d.mo9689q(obj, j, f);
    }

    /* renamed from: w */
    public static void m5844w(Object obj, int i, long j) {
        f5879d.mo9696r(obj, i, j);
    }

    /* renamed from: x */
    public static void m5845x(Object obj, long j, long j2) {
        f5879d.mo9697s(obj, j, j2);
    }

    /* renamed from: y */
    public static void m5846y(long j, Object obj, Object obj2) {
        f5879d.mo9698t(j, obj, obj2);
    }
}
