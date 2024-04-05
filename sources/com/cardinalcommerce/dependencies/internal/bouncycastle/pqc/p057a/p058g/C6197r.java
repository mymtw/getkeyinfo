package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;
import p223r5.C7751c0;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.r */
public final class C6197r extends C7751c0 {

    /* renamed from: c */
    public final C6194p f13492c;

    /* renamed from: d */
    public final int f13493d;

    /* renamed from: e */
    public final byte[] f13494e;

    /* renamed from: f */
    public final byte[] f13495f;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.r$a */
    public static class C6198a {

        /* renamed from: a */
        public final C6194p f13496a;

        /* renamed from: b */
        public byte[] f13497b = null;

        /* renamed from: c */
        public byte[] f13498c = null;

        public C6198a(C6194p pVar) {
            this.f13496a = pVar;
        }
    }

    public C6197r(C6198a aVar) {
        super(aVar.f13496a.f13475b.f13500b.f13456a.f13462a.mo19523a(), false);
        C6194p pVar = aVar.f13496a;
        this.f13492c = pVar;
        if (pVar != null) {
            int a = pVar.mo17538a();
            C6179e eVar = pVar.f13474a;
            if (eVar != null) {
                this.f13493d = eVar.f13432a;
            } else {
                this.f13493d = 0;
            }
            byte[] bArr = aVar.f13497b;
            if (bArr == null) {
                this.f13494e = new byte[a];
            } else if (bArr.length == a) {
                this.f13494e = bArr;
            } else {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            byte[] bArr2 = aVar.f13498c;
            if (bArr2 == null) {
                this.f13495f = new byte[a];
            } else if (bArr2.length == a) {
                this.f13495f = bArr2;
            } else {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: a */
    public final byte[] mo17540a() {
        byte[] bArr;
        int a = this.f13492c.mo17538a();
        int i = this.f13493d;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[(a + 4 + a)];
            C3436p.m8242d(i, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[(a + a)];
        }
        C6177d.m12377c(bArr, this.f13494e, i2);
        C6177d.m12377c(bArr, this.f13495f, i2 + a);
        return bArr;
    }
}
