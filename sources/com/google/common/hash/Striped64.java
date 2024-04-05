package com.google.common.hash;

import com.appboy.Constants;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

abstract class Striped64 extends Number {
    public static final int NCPU = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static final Unsafe f36369b;

    /* renamed from: c */
    public static final long f36370c;

    /* renamed from: d */
    public static final long f36371d;
    public static final Random rng = new Random();
    public static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    public volatile transient long base;
    public volatile transient int busy;
    @NullableDecl
    public volatile transient C16266b[] cells;

    /* renamed from: com.google.common.hash.Striped64$a */
    public static class C16265a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m26302a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m26302a();
        }
    }

    /* renamed from: com.google.common.hash.Striped64$b */
    public static final class C16266b {

        /* renamed from: b */
        public static final Unsafe f36372b;

        /* renamed from: c */
        public static final long f36373c;

        /* renamed from: a */
        public volatile long f36374a;

        static {
            try {
                Unsafe access$000 = Striped64.m26300d();
                f36372b = access$000;
                f36373c = access$000.objectFieldOffset(C16266b.class.getDeclaredField(Constants.APPBOY_PUSH_CONTENT_KEY));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C16266b(long j) {
            this.f36374a = j;
        }

        /* renamed from: a */
        public final boolean mo57888a(long j, long j2) {
            return f36372b.compareAndSwapLong(this, f36373c, j, j2);
        }
    }

    static {
        try {
            Unsafe d = m26300d();
            f36369b = d;
            Class<Striped64> cls = Striped64.class;
            f36370c = d.objectFieldOffset(cls.getDeclaredField("base"));
            f36371d = d.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.Striped64.C16265a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m26300d() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.hash.Striped64$a r0 = new com.google.common.hash.Striped64$a     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.m26300d():sun.misc.Unsafe");
    }

    public final boolean casBase(long j, long j2) {
        return f36369b.compareAndSwapLong(this, f36370c, j, j2);
    }

    public final boolean casBusy() {
        return f36369b.compareAndSwapInt(this, f36371d, 0, 1);
    }

    /* renamed from: fn */
    public abstract long mo57844fn(long j, long j2);

    public final void internalReset(long j) {
        C16266b[] bVarArr = this.cells;
        this.base = j;
        if (bVarArr != null) {
            for (C16266b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f36374a = j;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0023 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void retryUpdate(long r17, @org.checkerframework.checker.nullness.compatqual.NullableDecl int[] r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 1
            r4 = 0
            if (r19 != 0) goto L_0x001b
            java.lang.ThreadLocal<int[]> r5 = threadHashCode
            int[] r6 = new int[r0]
            r5.set(r6)
            java.util.Random r5 = rng
            int r5 = r5.nextInt()
            if (r5 != 0) goto L_0x0018
            r5 = r0
        L_0x0018:
            r6[r4] = r5
            goto L_0x001f
        L_0x001b:
            r5 = r19[r4]
            r6 = r19
        L_0x001f:
            r8 = r4
            r7 = r5
            r5 = r20
        L_0x0023:
            com.google.common.hash.Striped64$b[] r9 = r1.cells
            if (r9 == 0) goto L_0x00b6
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00b6
            int r11 = r10 + -1
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0063
            int r9 = r1.busy
            if (r9 != 0) goto L_0x0061
            com.google.common.hash.Striped64$b r9 = new com.google.common.hash.Striped64$b
            r9.<init>(r2)
            int r10 = r1.busy
            if (r10 != 0) goto L_0x0061
            boolean r10 = r16.casBusy()
            if (r10 == 0) goto L_0x0061
            com.google.common.hash.Striped64$b[] r10 = r1.cells     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x0056
            int r11 = r10.length     // Catch:{ all -> 0x005d }
            if (r11 <= 0) goto L_0x0056
            int r11 = r11 + -1
            r11 = r11 & r7
            r12 = r10[r11]     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x0056
            r10[r11] = r9     // Catch:{ all -> 0x005d }
            r9 = r0
            goto L_0x0057
        L_0x0056:
            r9 = r4
        L_0x0057:
            r1.busy = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x005d:
            r0 = move-exception
            r1.busy = r4
            throw r0
        L_0x0061:
            r8 = r4
            goto L_0x00a9
        L_0x0063:
            if (r5 != 0) goto L_0x0067
            r5 = r0
            goto L_0x00a9
        L_0x0067:
            long r12 = r11.f36374a
            long r14 = r1.mo57844fn(r12, r2)
            boolean r11 = r11.mo57888a(r12, r14)
            if (r11 == 0) goto L_0x0075
            goto L_0x00ee
        L_0x0075:
            int r11 = NCPU
            if (r10 >= r11) goto L_0x0061
            com.google.common.hash.Striped64$b[] r11 = r1.cells
            if (r11 == r9) goto L_0x007e
            goto L_0x0061
        L_0x007e:
            if (r8 != 0) goto L_0x0082
            r8 = r0
            goto L_0x00a9
        L_0x0082:
            int r11 = r1.busy
            if (r11 != 0) goto L_0x00a9
            boolean r11 = r16.casBusy()
            if (r11 == 0) goto L_0x00a9
            com.google.common.hash.Striped64$b[] r8 = r1.cells     // Catch:{ all -> 0x00a5 }
            if (r8 != r9) goto L_0x00a0
            int r8 = r10 << 1
            com.google.common.hash.Striped64$b[] r8 = new com.google.common.hash.Striped64.C16266b[r8]     // Catch:{ all -> 0x00a5 }
            r11 = r4
        L_0x0095:
            if (r11 >= r10) goto L_0x009e
            r12 = r9[r11]     // Catch:{ all -> 0x00a5 }
            r8[r11] = r12     // Catch:{ all -> 0x00a5 }
            int r11 = r11 + 1
            goto L_0x0095
        L_0x009e:
            r1.cells = r8     // Catch:{ all -> 0x00a5 }
        L_0x00a0:
            r1.busy = r4
            r8 = r4
            goto L_0x0023
        L_0x00a5:
            r0 = move-exception
            r1.busy = r4
            throw r0
        L_0x00a9:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r6[r4] = r7
            goto L_0x0023
        L_0x00b6:
            int r10 = r1.busy
            if (r10 != 0) goto L_0x00e2
            com.google.common.hash.Striped64$b[] r10 = r1.cells
            if (r10 != r9) goto L_0x00e2
            boolean r10 = r16.casBusy()
            if (r10 == 0) goto L_0x00e2
            com.google.common.hash.Striped64$b[] r10 = r1.cells     // Catch:{ all -> 0x00de }
            if (r10 != r9) goto L_0x00d8
            r9 = 2
            com.google.common.hash.Striped64$b[] r9 = new com.google.common.hash.Striped64.C16266b[r9]     // Catch:{ all -> 0x00de }
            r10 = r7 & 1
            com.google.common.hash.Striped64$b r11 = new com.google.common.hash.Striped64$b     // Catch:{ all -> 0x00de }
            r11.<init>(r2)     // Catch:{ all -> 0x00de }
            r9[r10] = r11     // Catch:{ all -> 0x00de }
            r1.cells = r9     // Catch:{ all -> 0x00de }
            r9 = r0
            goto L_0x00d9
        L_0x00d8:
            r9 = r4
        L_0x00d9:
            r1.busy = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x00de:
            r0 = move-exception
            r1.busy = r4
            throw r0
        L_0x00e2:
            long r9 = r1.base
            long r11 = r1.mo57844fn(r9, r2)
            boolean r9 = r1.casBase(r9, r11)
            if (r9 == 0) goto L_0x0023
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
