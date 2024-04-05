package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import p169l5.C7265a;
import p169l5.C7267c;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.i */
public final class C6184i {

    /* renamed from: a */
    public final C7267c f13442a;

    /* renamed from: b */
    public final int f13443b;

    public C6184i(int i, C7267c cVar) {
        if (cVar != null) {
            this.f13442a = cVar;
            this.f13443b = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: a */
    public final byte[] mo17526a(byte[] bArr, int i, byte[] bArr2) {
        byte[] e = C6177d.m12379e(this.f13443b, (long) i);
        this.f13442a.mo19525b(e, e.length);
        this.f13442a.mo19525b(bArr, bArr.length);
        this.f13442a.mo19525b(bArr2, bArr2.length);
        int i2 = this.f13443b;
        byte[] bArr3 = new byte[i2];
        C7267c cVar = this.f13442a;
        if (cVar instanceof C7265a) {
            ((C7265a) cVar).mo19522a(i2, bArr3);
        } else {
            cVar.mo19526c(bArr3);
        }
        return bArr3;
    }

    /* renamed from: b */
    public final byte[] mo17527b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f13443b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return mo17526a(bArr, 3, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }
}
