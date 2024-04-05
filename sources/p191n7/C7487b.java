package p191n7;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.jvm.internal.C19382n;
import p003a2.C0023f;

/* renamed from: n7.b */
public final class C7487b {

    /* renamed from: a */
    public int f16692a = 0;

    /* renamed from: b */
    public int f16693b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7487b(byte[] r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f16692a = r0
            int r1 = r10.length
            java.lang.String r2 = "byte array is not an encoded finite field"
            r3 = 4
            if (r1 != r3) goto L_0x005f
            byte r1 = r10[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            byte r4 = r10[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r1 = r1 | r4
            r4 = 2
            byte r5 = r10[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r1 = r1 | r5
            r5 = 3
            byte r10 = r10[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r10 = r10 | r1
            r9.f16693b = r10
            if (r10 != 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            int r1 = kotlin.jvm.internal.C19382n.m32744e(r10)
            int r1 = r1 >>> r3
            r5 = r0
        L_0x0033:
            if (r5 >= r1) goto L_0x004d
            int r4 = kotlin.jvm.internal.C19382n.m32748g(r4, r4, r10)
            r6 = r4 ^ 2
            r7 = r6
            r6 = r10
        L_0x003d:
            if (r6 == 0) goto L_0x0047
            int r7 = kotlin.jvm.internal.C19382n.m32746f(r7, r6)
            r8 = r7
            r7 = r6
            r6 = r8
            goto L_0x003d
        L_0x0047:
            if (r7 == r3) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 == 0) goto L_0x0059
            int r10 = r9.f16693b
            int r10 = kotlin.jvm.internal.C19382n.m32744e(r10)
            r9.f16692a = r10
            return
        L_0x0059:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L_0x005f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n7.C7487b.<init>(byte[]):void");
    }

    /* renamed from: a */
    public final int mo19829a(int i) {
        int i2 = (1 << this.f16692a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = mo19829a(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = mo19830b(i3, i);
            }
            i = mo19830b(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    /* renamed from: b */
    public final int mo19830b(int i, int i2) {
        return C19382n.m32748g(i, i2, this.f16693b);
    }

    /* renamed from: c */
    public final boolean mo19831c(int i) {
        int i2 = this.f16692a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7487b)) {
            C7487b bVar = (C7487b) obj;
            return this.f16692a == bVar.f16692a && this.f16693b == bVar.f16693b;
        }
    }

    public final int hashCode() {
        return this.f16693b;
    }

    public final String toString() {
        String str;
        StringBuilder h = C0072d.m201h("Finite Field GF(2^");
        h.append(this.f16692a);
        h.append(") = GF(2)[X]/<");
        int i = this.f16693b;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str2 = str2 + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return C0023f.m110k(h, str, "> ");
    }
}
