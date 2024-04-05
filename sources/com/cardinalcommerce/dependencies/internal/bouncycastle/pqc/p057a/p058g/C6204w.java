package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;
import p223r5.C7765l;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.w */
public final class C6204w extends C7765l {

    /* renamed from: c */
    public final C6200t f13518c;

    /* renamed from: d */
    public final int f13519d;

    /* renamed from: e */
    public final byte[] f13520e;

    /* renamed from: f */
    public final byte[] f13521f;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.w$a */
    public static class C6205a {

        /* renamed from: a */
        public final C6200t f13522a;

        /* renamed from: b */
        public byte[] f13523b = null;

        /* renamed from: c */
        public byte[] f13524c = null;

        public C6205a(C6200t tVar) {
            this.f13522a = tVar;
        }
    }

    public C6204w(C6205a aVar) {
        super(aVar.f13522a.f13500b.f13456a.f13462a.mo19523a(), false);
        C6200t tVar = aVar.f13522a;
        this.f13518c = tVar;
        if (tVar != null) {
            int a = tVar.mo17541a();
            C6180f fVar = tVar.f13499a;
            if (fVar != null) {
                this.f13519d = fVar.f13435a;
            } else {
                this.f13519d = 0;
            }
            byte[] bArr = aVar.f13523b;
            if (bArr == null) {
                this.f13520e = new byte[a];
            } else if (bArr.length == a) {
                this.f13520e = bArr;
            } else {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            byte[] bArr2 = aVar.f13524c;
            if (bArr2 == null) {
                this.f13521f = new byte[a];
            } else if (bArr2.length == a) {
                this.f13521f = bArr2;
            } else {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: a */
    public final byte[] mo17547a() {
        byte[] bArr;
        int a = this.f13518c.mo17541a();
        int i = this.f13519d;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[(a + 4 + a)];
            C3436p.m8242d(i, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[(a + a)];
        }
        C6177d.m12377c(bArr, this.f13520e, i2);
        C6177d.m12377c(bArr, this.f13521f, i2 + a);
        return bArr;
    }
}
