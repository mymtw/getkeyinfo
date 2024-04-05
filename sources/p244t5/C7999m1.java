package p244t5;

import android.support.p013v4.media.C0072d;
import java.math.BigInteger;
import p003a2.C0023f;
import p267v7.C8212a;

/* renamed from: t5.m1 */
public final class C7999m1 extends C8018s1 {

    /* renamed from: b */
    public final byte[] f17490b;

    public C7999m1(long j) {
        this.f17490b = BigInteger.valueOf(j).toByteArray();
    }

    public C7999m1(BigInteger bigInteger) {
        this.f17490b = bigInteger.toByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7999m1(byte[] r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = p267v7.C8216d.f18043a
            r0 = 0
            v7.c r1 = new v7.c     // Catch:{ AccessControlException -> 0x001e }
            r1.<init>()     // Catch:{ AccessControlException -> 0x001e }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ AccessControlException -> 0x001e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ AccessControlException -> 0x001e }
            if (r1 == 0) goto L_0x001e
            java.lang.String r2 = "true"
            java.lang.String r1 = p267v7.C8217e.m16510b(r1)     // Catch:{ AccessControlException -> 0x001e }
            boolean r1 = r2.equals(r1)     // Catch:{ AccessControlException -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            if (r1 != 0) goto L_0x0046
            int r1 = r5.length
            r2 = 1
            if (r1 <= r2) goto L_0x003b
            byte r1 = r5[r0]
            if (r1 != 0) goto L_0x0031
            byte r3 = r5[r2]
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            r0 = r2
            goto L_0x003b
        L_0x0031:
            r3 = -1
            if (r1 != r3) goto L_0x003b
            byte r1 = r5[r2]
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "malformed integer"
            r5.<init>(r6)
            throw r5
        L_0x0046:
            if (r6 == 0) goto L_0x004c
            byte[] r5 = p267v7.C8212a.m16504k(r5)
        L_0x004c:
            r4.f17490b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7999m1.<init>(byte[], boolean):void");
    }

    /* renamed from: q */
    public static C7999m1 m16076q(Object obj) {
        if (obj == null || (obj instanceof C7999m1)) {
            return (C7999m1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C7999m1) C8018s1.m16138m((byte[]) obj);
            } catch (Exception e) {
                StringBuilder h = C0072d.m201h("encoding error in getInstance: ");
                h.append(e.toString());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            throw new IllegalArgumentException(C0023f.m108i(obj, C0072d.m201h("illegal object in getInstance: ")));
        }
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(2, this.f17490b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7999m1)) {
            return false;
        }
        return C8212a.m16500g(this.f17490b, ((C7999m1) s1Var).f17490b);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f17490b;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17490b.length) + 1 + this.f17490b.length;
    }

    /* renamed from: s */
    public final BigInteger mo20556s() {
        return new BigInteger(this.f17490b);
    }

    public final String toString() {
        return mo20556s().toString();
    }

    /* renamed from: v */
    public final BigInteger mo20558v() {
        return new BigInteger(1, this.f17490b);
    }
}
