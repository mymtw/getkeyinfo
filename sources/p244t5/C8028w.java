package p244t5;

import p267v7.C8217e;

/* renamed from: t5.w */
public final class C8028w extends C7993k1 {
    public C8028w(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(24, mo20582y());
    }

    /* renamed from: n */
    public final int mo20509n() {
        int length = mo20582y().length;
        return C7974e1.m15996a(length) + 1 + length;
    }

    /* renamed from: y */
    public final byte[] mo20582y() {
        byte[] bArr = this.f17482b;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!mo20551w()) {
            byte[] bArr2 = this.f17482b;
            byte[] bArr3 = new byte[(bArr2.length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(C8217e.m16512d("0000Z"), 0, bArr3, this.f17482b.length - 1, 5);
            return bArr3;
        } else if (!mo20550v()) {
            byte[] bArr4 = this.f17482b;
            byte[] bArr5 = new byte[(bArr4.length + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(C8217e.m16512d("00Z"), 0, bArr5, this.f17482b.length - 1, 3);
            return bArr5;
        } else if (!mo20549s()) {
            return this.f17482b;
        } else {
            int length = this.f17482b.length - 2;
            while (length > 0 && this.f17482b[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.f17482b;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[(length + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length + 2)];
            int i = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }
}
