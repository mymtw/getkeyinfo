package p244t5;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t5.r1 */
public class C8014r1 {

    /* renamed from: a */
    public OutputStream f17501a;

    /* renamed from: t5.r1$a */
    public class C8015a extends C8014r1 {

        /* renamed from: b */
        public boolean f17502b = true;

        public C8015a(OutputStream outputStream) {
            super(outputStream);
        }

        /* renamed from: h */
        public final void mo20570h(int i) {
            if (this.f17502b) {
                this.f17502b = false;
            } else {
                C8014r1.super.mo20570h(i);
            }
        }
    }

    public C8014r1(OutputStream outputStream) {
        this.f17501a = outputStream;
    }

    /* renamed from: a */
    public C7970d0 mo20534a() {
        return new C7970d0(this.f17501a);
    }

    /* renamed from: b */
    public final void mo20566b(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            mo20570h((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                mo20570h((byte) (i >> i4));
            }
            return;
        }
        mo20570h((byte) i);
    }

    /* renamed from: c */
    public final void mo20567c(int i, int i2) {
        if (i2 < 31) {
            mo20570h(i | i2);
            return;
        }
        mo20570h(i | 31);
        if (i2 < 128) {
            mo20570h(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.f17501a.write(bArr, i3, 5 - i3);
    }

    /* renamed from: d */
    public void mo20535d(C7984h1 h1Var) {
        if (h1Var != null) {
            h1Var.mo12996i().mo20506e(this);
            return;
        }
        throw new IOException("null object detected");
    }

    /* renamed from: e */
    public final void mo20568e(C8018s1 s1Var) {
        s1Var.mo20506e(new C8015a(this.f17501a));
    }

    /* renamed from: f */
    public final void mo20569f(int i, byte[] bArr) {
        mo20570h(i);
        mo20566b(bArr.length);
        this.f17501a.write(bArr);
    }

    /* renamed from: g */
    public C8014r1 mo20536g() {
        return new C8017s0(this.f17501a);
    }

    /* renamed from: h */
    public void mo20570h(int i) {
        this.f17501a.write(i);
    }
}
