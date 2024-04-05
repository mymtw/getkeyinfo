package com.google.common.primitives;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import kotlinx.coroutines.C19543e0;
import sun.misc.Unsafe;

enum UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator implements Comparator<byte[]> {
    INSTANCE;
    
    public static final boolean BIG_ENDIAN = false;
    public static final int BYTE_ARRAY_BASE_OFFSET = 0;
    public static final Unsafe theUnsafe = null;

    /* renamed from: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$a */
    public static class C16297a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m26388a() throws Exception {
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
            return m26388a();
        }
    }

    /* access modifiers changed from: public */
    static {
        Class<byte[]> cls;
        BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        Unsafe unsafe = getUnsafe();
        theUnsafe = unsafe;
        int arrayBaseOffset = unsafe.arrayBaseOffset(cls);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(cls) != 1) {
            throw new Error();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.C16297a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static sun.misc.Unsafe getUnsafe() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$a r0 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$a     // Catch:{ PrivilegedActionException -> 0x0011 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.getUnsafe():sun.misc.Unsafe");
    }

    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
    }

    public int compare(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        int i = min & -8;
        int i2 = 0;
        while (i2 < i) {
            Unsafe unsafe = theUnsafe;
            int i3 = BYTE_ARRAY_BASE_OFFSET;
            long j = (long) i2;
            long j2 = unsafe.getLong(bArr, ((long) i3) + j);
            long j3 = unsafe.getLong(bArr2, ((long) i3) + j);
            if (j2 == j3) {
                i2 += 8;
            } else if (BIG_ENDIAN) {
                return UnsignedLongs.m26390a(j2, j3);
            } else {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & -8;
                return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) ((j3 >>> numberOfTrailingZeros) & 255));
            }
        }
        while (i2 < min) {
            int E = C19543e0.m33289E(bArr[i2], bArr2[i2]);
            if (E != 0) {
                return E;
            }
            i2++;
        }
        return bArr.length - bArr2.length;
    }
}
