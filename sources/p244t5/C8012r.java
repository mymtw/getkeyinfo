package p244t5;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;
import p267v7.C8212a;

/* renamed from: t5.r */
public class C8012r extends C8038z0 {
    public C8012r(int i, byte[] bArr) {
        super(i, bArr);
    }

    public C8012r(C8005o1 o1Var) {
        super(0, o1Var.mo12996i().mo20561a("DER"));
    }

    public C8012r(byte[] bArr) {
        super(0, bArr);
    }

    /* renamed from: v */
    public static C8012r m16120v(Object obj) {
        if (obj == null || (obj instanceof C8012r)) {
            return (C8012r) obj;
        }
        if (obj instanceof C8010q0) {
            C8010q0 q0Var = (C8010q0) obj;
            return new C8012r(q0Var.f17528c, q0Var.f17527b);
        } else if (obj instanceof byte[]) {
            try {
                return (C8012r) C8018s1.m16138m((byte[]) obj);
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
        byte[] bArr = this.f17527b;
        int i = this.f17528c;
        byte[] k = C8212a.m16504k(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            k[length] = (byte) ((255 << i) & k[length]);
        }
        int length2 = k.length + 1;
        byte[] bArr2 = new byte[length2];
        bArr2[0] = (byte) this.f17528c;
        System.arraycopy(k, 0, bArr2, 1, length2 - 1);
        r1Var.mo20569f(3, bArr2);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17527b.length + 1) + 1 + this.f17527b.length + 1;
    }
}
