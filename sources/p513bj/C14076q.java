package p513bj;

import java.lang.reflect.Array;
import p244t5.C7971d1;

/* renamed from: bj.q */
public final class C14076q {

    /* renamed from: a */
    public int f30982a;

    /* renamed from: b */
    public int f30983b;

    /* renamed from: c */
    public int f30984c;

    /* renamed from: d */
    public Object f30985d;

    public /* synthetic */ C14076q() {
        this.f30985d = C14049b0.f30918f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f30984c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46894a() {
        /*
            r2 = this;
            int r0 = r2.f30982a
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f30984c
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f30983b
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p513bj.C14075p.m21694f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14076q.mo46894a():void");
    }

    /* renamed from: b */
    public final int mo46895b() {
        return ((this.f30984c - this.f30982a) * 8) - this.f30983b;
    }

    /* renamed from: c */
    public final void mo46896c() {
        if (this.f30983b != 0) {
            this.f30983b = 0;
            this.f30982a++;
            mo46894a();
        }
    }

    /* renamed from: d */
    public final int mo46897d() {
        C14075p.m21694f(this.f30983b == 0);
        return this.f30982a;
    }

    /* renamed from: e */
    public final C7971d1 mo46898e() {
        return ((C7971d1[]) this.f30985d)[this.f30982a];
    }

    /* renamed from: f */
    public final byte[][] mo46899f(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f30984c * i;
        iArr[0] = this.f30983b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i3 = this.f30983b * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            C7971d1 d1Var = ((C7971d1[]) this.f30985d)[i4 / i2];
            int length = ((byte[]) d1Var.f17453b).length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = ((byte[]) d1Var.f17453b)[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }

    /* renamed from: g */
    public final boolean mo46900g() {
        boolean z = (((byte[]) this.f30985d)[this.f30982a] & (128 >> this.f30983b)) != 0;
        mo46906m();
        return z;
    }

    /* renamed from: h */
    public final int mo46901h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f30983b += i;
        int i3 = 0;
        while (true) {
            i2 = this.f30983b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f30983b = i4;
            int i5 = this.f30982a;
            this.f30982a = i5 + 1;
            i3 |= (((byte[]) this.f30985d)[i5] & 255) << i4;
        }
        int i6 = this.f30982a;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((((byte[]) this.f30985d)[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f30983b = 0;
            this.f30982a = i6 + 1;
        }
        mo46894a();
        return i7;
    }

    /* renamed from: i */
    public final void mo46902i(int i, byte[] bArr) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = (byte[]) this.f30985d;
            int i4 = this.f30982a;
            int i5 = i4 + 1;
            this.f30982a = i5;
            byte b = bArr2[i4];
            int i6 = this.f30983b;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.f30983b;
            if (i8 + i7 > 8) {
                int i9 = this.f30982a;
                this.f30982a = i9 + 1;
                bArr[i2] = (byte) (b3 | ((((byte[]) this.f30985d)[i9] & 255) << i8));
                this.f30983b = i8 - 8;
            }
            int i10 = this.f30983b + i7;
            this.f30983b = i10;
            int i11 = this.f30982a;
            bArr[i2] = (byte) (((byte) (((255 & ((byte[]) this.f30985d)[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
            if (i10 == 8) {
                this.f30983b = 0;
                this.f30982a = i11 + 1;
            }
            mo46894a();
        }
    }

    /* renamed from: j */
    public final void mo46903j(int i, byte[] bArr) {
        C14075p.m21694f(this.f30983b == 0);
        System.arraycopy((byte[]) this.f30985d, this.f30982a, bArr, 0, i);
        this.f30982a += i;
        mo46894a();
    }

    /* renamed from: k */
    public final void mo46904k(int i, byte[] bArr) {
        this.f30985d = bArr;
        this.f30982a = 0;
        this.f30983b = 0;
        this.f30984c = i;
    }

    /* renamed from: l */
    public final void mo46905l(int i) {
        int i2 = i / 8;
        this.f30982a = i2;
        this.f30983b = i - (i2 * 8);
        mo46894a();
    }

    /* renamed from: m */
    public final void mo46906m() {
        int i = this.f30983b + 1;
        this.f30983b = i;
        if (i == 8) {
            this.f30983b = 0;
            this.f30982a++;
        }
        mo46894a();
    }

    /* renamed from: n */
    public final void mo46907n(int i) {
        int i2 = i / 8;
        int i3 = this.f30982a + i2;
        this.f30982a = i3;
        int i4 = (i - (i2 * 8)) + this.f30983b;
        this.f30983b = i4;
        if (i4 > 7) {
            this.f30982a = i3 + 1;
            this.f30983b = i4 - 8;
        }
        mo46894a();
    }

    /* renamed from: o */
    public final void mo46908o(int i) {
        C14075p.m21694f(this.f30983b == 0);
        this.f30982a += i;
        mo46894a();
    }

    public /* synthetic */ C14076q(int i, int i2) {
        C7971d1[] d1VarArr = new C7971d1[i];
        this.f30985d = d1VarArr;
        int length = d1VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            ((C7971d1[]) this.f30985d)[i3] = new C7971d1(((i2 + 4) * 17) + 1);
        }
        this.f30984c = i2 * 17;
        this.f30983b = i;
        this.f30982a = -1;
    }

    public /* synthetic */ C14076q(int i, byte[] bArr) {
        this.f30985d = bArr;
        this.f30984c = i;
    }
}
