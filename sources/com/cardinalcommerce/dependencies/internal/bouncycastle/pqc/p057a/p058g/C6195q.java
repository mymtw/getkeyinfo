package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import android.support.p013v4.media.C0072d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import p223r5.C7751c0;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.q */
public final class C6195q extends C7751c0 {

    /* renamed from: c */
    public final C6194p f13478c;

    /* renamed from: d */
    public final long f13479d;

    /* renamed from: e */
    public final byte[] f13480e;

    /* renamed from: f */
    public final byte[] f13481f;

    /* renamed from: g */
    public final byte[] f13482g;

    /* renamed from: h */
    public final byte[] f13483h;

    /* renamed from: i */
    public final C6175b f13484i;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.q$a */
    public static class C6196a {

        /* renamed from: a */
        public final C6194p f13485a;

        /* renamed from: b */
        public long f13486b = 0;

        /* renamed from: c */
        public byte[] f13487c = null;

        /* renamed from: d */
        public byte[] f13488d = null;

        /* renamed from: e */
        public byte[] f13489e = null;

        /* renamed from: f */
        public byte[] f13490f = null;

        /* renamed from: g */
        public C6175b f13491g = null;

        public C6196a(C6194p pVar) {
            this.f13485a = pVar;
        }
    }

    public C6195q(C6196a aVar) {
        super(aVar.f13485a.f13475b.f13500b.f13456a.f13462a.mo19523a(), true);
        C6194p pVar = aVar.f13485a;
        this.f13478c = pVar;
        if (pVar != null) {
            int a = pVar.mo17538a();
            long j = aVar.f13486b;
            this.f13479d = j;
            byte[] bArr = aVar.f13487c;
            if (bArr == null) {
                this.f13480e = new byte[a];
            } else if (bArr.length == a) {
                this.f13480e = bArr;
            } else {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            byte[] bArr2 = aVar.f13488d;
            if (bArr2 == null) {
                this.f13481f = new byte[a];
            } else if (bArr2.length == a) {
                this.f13481f = bArr2;
            } else {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            byte[] bArr3 = aVar.f13489e;
            if (bArr3 == null) {
                this.f13482g = new byte[a];
            } else if (bArr3.length == a) {
                this.f13482g = bArr3;
            } else {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            byte[] bArr4 = aVar.f13490f;
            if (bArr4 == null) {
                this.f13483h = new byte[a];
            } else if (bArr4.length == a) {
                this.f13483h = bArr4;
            } else {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            C6175b bVar = aVar.f13491g;
            if (bVar == null) {
                if (!C6177d.m12378d(pVar.f13476c, j) || bArr3 == null || bArr == null) {
                    this.f13484i = new C6175b();
                    return;
                }
                bVar = new C6175b(pVar, aVar.f13486b, bArr3, bArr);
            }
            this.f13484i = bVar;
            return;
        }
        throw new NullPointerException("params == null");
    }

    /* renamed from: a */
    public final byte[] mo17539a() {
        int a = this.f13478c.mo17538a();
        int i = (this.f13478c.f13476c + 7) / 8;
        byte[] bArr = new byte[(i + a + a + a + a)];
        C6177d.m12377c(bArr, C6177d.m12379e(i, this.f13479d), 0);
        int i2 = i + 0;
        C6177d.m12377c(bArr, this.f13480e, i2);
        int i3 = i2 + a;
        C6177d.m12377c(bArr, this.f13481f, i3);
        int i4 = i3 + a;
        C6177d.m12377c(bArr, this.f13482g, i4);
        C6177d.m12377c(bArr, this.f13483h, i4 + a);
        try {
            C6175b bVar = this.f13484i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(bVar);
            objectOutputStream.flush();
            return C8212a.m16506m(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("error serializing bds state: ");
            h.append(e.getMessage());
            throw new IllegalStateException(h.toString(), e);
        }
    }
}
