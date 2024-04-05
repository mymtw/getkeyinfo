package p244t5;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.ClassUtils;
import p010a9.C0048b;
import p267v7.C8212a;

/* renamed from: t5.a */
public final class C7959a extends C8018s1 {

    /* renamed from: d */
    public static final ConcurrentHashMap f17433d = new ConcurrentHashMap();

    /* renamed from: b */
    public final String f17434b;

    /* renamed from: c */
    public byte[] f17435c;

    /* renamed from: t5.a$a */
    public static class C7960a {

        /* renamed from: a */
        public final int f17436a;

        /* renamed from: b */
        public final byte[] f17437b;

        public C7960a(byte[] bArr) {
            this.f17436a = C8212a.m16495b(bArr);
            this.f17437b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C7960a) {
                return C8212a.m16500g(this.f17437b, ((C7960a) obj).f17437b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17436a;
        }
    }

    public C7959a(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = m15941y(2, str);
            }
            if (z) {
                this.f17434b = str;
                return;
            }
            throw new IllegalArgumentException(C0048b.m163a("string ", str, " not an OID"));
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public C7959a(byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f17434b = stringBuffer.toString();
        this.f17435c = C8212a.m16504k(bArr);
    }

    /* renamed from: q */
    public static C7959a m15938q(C7984h1 h1Var) {
        if (h1Var == null || (h1Var instanceof C7959a)) {
            return (C7959a) h1Var;
        }
        C8018s1 i = h1Var.mo12996i();
        if (i instanceof C7959a) {
            return (C7959a) i;
        }
        if (h1Var instanceof byte[]) {
            try {
                return (C7959a) C8018s1.m16138m((byte[]) h1Var);
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("failed to construct object identifier from byte[]: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            StringBuilder h2 = C0072d.m201h("illegal object in getInstance: ");
            h2.append(h1Var.getClass().getName());
            throw new IllegalArgumentException(h2.toString());
        }
    }

    /* renamed from: v */
    public static void m15939v(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: w */
    public static void m15940w(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: y */
    public static boolean m15941y(int i, String str) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    /* renamed from: A */
    public final C7959a mo20504A() {
        C7960a aVar = new C7960a(mo20505C());
        ConcurrentHashMap concurrentHashMap = f17433d;
        C7959a aVar2 = (C7959a) concurrentHashMap.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        C7959a aVar3 = (C7959a) concurrentHashMap.putIfAbsent(aVar, this);
        return aVar3 == null ? this : aVar3;
    }

    /* renamed from: C */
    public final synchronized byte[] mo20505C() {
        if (this.f17435c == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo20510s(byteArrayOutputStream);
            this.f17435c = byteArrayOutputStream.toByteArray();
        }
        return this.f17435c;
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        byte[] C = mo20505C();
        r1Var.mo20570h(6);
        r1Var.mo20566b(C.length);
        r1Var.f17501a.write(C);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (s1Var == this) {
            return true;
        }
        if (!(s1Var instanceof C7959a)) {
            return false;
        }
        return this.f17434b.equals(((C7959a) s1Var).f17434b);
    }

    public final int hashCode() {
        return this.f17434b.hashCode();
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        int length = mo20505C().length;
        return C7974e1.m15996a(length) + 1 + length;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* renamed from: s */
    public final void mo20510s(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            t5.d1 r0 = new t5.d1
            java.lang.String r1 = r7.f17434b
            r0.<init>((java.lang.String) r1)
            java.lang.String r1 = r0.mo20537a()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.mo20537a()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L_0x0024
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            goto L_0x004d
        L_0x0024:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            m15940w(r8, r1)
        L_0x0035:
            int r1 = r0.f17452a
            r2 = -1
            if (r1 == r2) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r0.mo20537a()
            int r2 = r1.length()
            if (r2 > r4) goto L_0x0051
            long r1 = java.lang.Long.parseLong(r1)
        L_0x004d:
            m15939v(r8, r1)
            goto L_0x0035
        L_0x0051:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            m15940w(r8, r2)
            goto L_0x0035
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7959a.mo20510s(java.io.ByteArrayOutputStream):void");
    }

    public final String toString() {
        return this.f17434b;
    }

    /* renamed from: z */
    public final void mo20512z(String str) {
        new C7959a(this, str);
    }

    public C7959a(C7959a aVar, String str) {
        if (m15941y(0, str)) {
            this.f17434b = C0070b.m184f(new StringBuilder(), aVar.f17434b, ".", str);
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("string ", str, " not a valid OID branch"));
    }
}
