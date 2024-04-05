package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import android.support.p013v4.media.C0069a;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k;
import p186n2.C7438x;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.l */
public final class C6189l {

    /* renamed from: a */
    public final C6191n f13456a;

    /* renamed from: b */
    public final C6184i f13457b;

    /* renamed from: c */
    public byte[] f13458c;

    /* renamed from: d */
    public byte[] f13459d;

    public C6189l(C6191n nVar) {
        this.f13456a = nVar;
        int i = nVar.f13463b;
        this.f13457b = new C6184i(i, nVar.f13462a);
        this.f13458c = new byte[i];
        this.f13459d = new byte[i];
    }

    /* renamed from: a */
    public final C7438x mo17530a(C6187k kVar) {
        byte[][] bArr = new byte[this.f13456a.f13465d][];
        int i = 0;
        while (true) {
            C6191n nVar = this.f13456a;
            if (i >= nVar.f13465d) {
                return new C7438x(nVar, bArr);
            }
            C6187k.C6188a aVar = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b);
            aVar.f13453e = kVar.f13450e;
            aVar.f13454f = i;
            aVar.f13455g = kVar.f13452g;
            C6187k.C6188a aVar2 = (C6187k.C6188a) aVar.mo17537d(kVar.f13469d);
            aVar2.getClass();
            C6187k kVar2 = new C6187k(aVar2);
            if (i >= 0 && i < this.f13456a.f13465d) {
                bArr[i] = mo17532c(this.f13457b.mo17527b(this.f13458c, C6177d.m12379e(32, (long) i)), this.f13456a.f13464c - 1, kVar2);
                i++;
                kVar = kVar2;
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* renamed from: b */
    public final void mo17531b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f13456a.f13463b;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == i) {
            this.f13458c = bArr;
            this.f13459d = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }

    /* renamed from: c */
    public final byte[] mo17532c(byte[] bArr, int i, C6187k kVar) {
        int i2 = this.f13456a.f13463b;
        if (bArr.length == i2) {
            kVar.mo17523a();
            int i3 = i + 0;
            if (i3 > this.f13456a.f13464c - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i == 0) {
                return bArr;
            } else {
                byte[] c = mo17532c(bArr, i - 1, kVar);
                C6187k.C6188a aVar = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b);
                aVar.f13453e = kVar.f13450e;
                aVar.f13454f = kVar.f13451f;
                aVar.f13455g = i3 - 1;
                C6187k.C6188a aVar2 = (C6187k.C6188a) aVar.mo17537d(0);
                aVar2.getClass();
                C6187k kVar2 = new C6187k(aVar2);
                byte[] b = this.f13457b.mo17527b(this.f13459d, kVar2.mo17523a());
                C6187k.C6188a aVar3 = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar2.f13466a)).mo17535a(kVar2.f13467b);
                aVar3.f13453e = kVar2.f13450e;
                aVar3.f13454f = kVar2.f13451f;
                aVar3.f13455g = kVar2.f13452g;
                C6187k.C6188a aVar4 = (C6187k.C6188a) aVar3.mo17537d(1);
                aVar4.getClass();
                byte[] b2 = this.f13457b.mo17527b(this.f13459d, new C6187k(aVar4).mo17523a());
                byte[] bArr2 = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = (byte) (c[i4] ^ b2[i4]);
                }
                C6184i iVar = this.f13457b;
                iVar.getClass();
                int length = b.length;
                int i5 = iVar.f13443b;
                if (length != i5) {
                    throw new IllegalArgumentException("wrong key length");
                } else if (i2 == i5) {
                    return iVar.mo17526a(b, 0, bArr2);
                } else {
                    throw new IllegalArgumentException("wrong in length");
                }
            }
        } else {
            throw new IllegalArgumentException(C0069a.m175f("startHash needs to be ", i2, "bytes"));
        }
    }

    /* renamed from: d */
    public final byte[] mo17533d(byte[] bArr, C6187k kVar) {
        C6187k.C6188a aVar = (C6187k.C6188a) ((C6187k.C6188a) new C6187k.C6188a().mo17536c(kVar.f13466a)).mo17535a(kVar.f13467b);
        aVar.f13453e = kVar.f13450e;
        return this.f13457b.mo17527b(bArr, ((C6187k) aVar.mo17529e()).mo17523a());
    }
}
