package com.google.common.hash;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

enum LittleEndianByteArray$UnsafeByteArray {
    UNSAFE_LITTLE_ENDIAN {
        public long getLongLittleEndian(byte[] bArr, int i) {
            return LittleEndianByteArray$UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
        }

        public void putLongLittleEndian(byte[] bArr, int i, long j) {
            LittleEndianByteArray$UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), j);
        }
    },
    UNSAFE_BIG_ENDIAN {
        public long getLongLittleEndian(byte[] bArr, int i) {
            return Long.reverseBytes(LittleEndianByteArray$UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET)));
        }

        public void putLongLittleEndian(byte[] bArr, int i, long j) {
            long reverseBytes = Long.reverseBytes(j);
            LittleEndianByteArray$UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i) + ((long) LittleEndianByteArray$UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), reverseBytes);
        }
    };
    
    /* access modifiers changed from: private */
    public static final int BYTE_ARRAY_BASE_OFFSET = 0;
    /* access modifiers changed from: private */
    public static final Unsafe theUnsafe = null;

    /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$a */
    public static class C16257a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m26271a() throws Exception {
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
            return m26271a();
        }
    }

    /* access modifiers changed from: public */
    static {
        Class<byte[]> cls;
        Unsafe unsafe = getUnsafe();
        theUnsafe = unsafe;
        BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(cls);
        if (unsafe.arrayIndexScale(cls) != 1) {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.C16257a());
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
            com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$a r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$a     // Catch:{ PrivilegedActionException -> 0x0011 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.getUnsafe():sun.misc.Unsafe");
    }
}
