package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import android.support.p013v4.media.C0072d;
import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import p223r5.C7765l;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.v */
public final class C6202v extends C7765l {

    /* renamed from: c */
    public final C6200t f13505c;

    /* renamed from: d */
    public final byte[] f13506d;

    /* renamed from: e */
    public final byte[] f13507e;

    /* renamed from: f */
    public final byte[] f13508f;

    /* renamed from: g */
    public final byte[] f13509g;

    /* renamed from: h */
    public final C6174a f13510h;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.v$a */
    public static class C6203a {

        /* renamed from: a */
        public final C6200t f13511a;

        /* renamed from: b */
        public int f13512b = 0;

        /* renamed from: c */
        public byte[] f13513c = null;

        /* renamed from: d */
        public byte[] f13514d = null;

        /* renamed from: e */
        public byte[] f13515e = null;

        /* renamed from: f */
        public byte[] f13516f = null;

        /* renamed from: g */
        public C6174a f13517g = null;

        public C6203a(C6200t tVar) {
            this.f13511a = tVar;
        }
    }

    public C6202v(C6203a aVar) {
        super(aVar.f13511a.f13500b.f13456a.f13462a.mo19523a(), true);
        C6200t tVar = aVar.f13511a;
        this.f13505c = tVar;
        if (tVar != null) {
            int a = tVar.mo17541a();
            byte[] bArr = aVar.f13513c;
            if (bArr == null) {
                this.f13506d = new byte[a];
            } else if (bArr.length == a) {
                this.f13506d = bArr;
            } else {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            byte[] bArr2 = aVar.f13514d;
            if (bArr2 == null) {
                this.f13507e = new byte[a];
            } else if (bArr2.length == a) {
                this.f13507e = bArr2;
            } else {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            byte[] bArr3 = aVar.f13515e;
            if (bArr3 == null) {
                this.f13508f = new byte[a];
            } else if (bArr3.length == a) {
                this.f13508f = bArr3;
            } else {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            byte[] bArr4 = aVar.f13516f;
            if (bArr4 == null) {
                this.f13509g = new byte[a];
            } else if (bArr4.length == a) {
                this.f13509g = bArr4;
            } else {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            C6174a aVar2 = aVar.f13517g;
            if (aVar2 == null) {
                int i = aVar.f13512b;
                if (i >= (1 << tVar.f13501c) - 2 || bArr3 == null || bArr == null) {
                    this.f13510h = new C6174a(tVar, i);
                    return;
                }
                aVar2 = new C6174a(tVar, bArr3, bArr, new C6187k(new C6187k.C6188a()), aVar.f13512b);
            }
            this.f13510h = aVar2;
            return;
        }
        throw new NullPointerException("params == null");
    }

    /* renamed from: a */
    public final byte[] mo17546a() {
        int a = this.f13505c.mo17541a();
        int i = a + 4;
        int i2 = i + a;
        int i3 = i2 + a;
        byte[] bArr = new byte[(a + i3)];
        C3436p.m8242d(this.f13510h.mo17503a(), 0, bArr);
        C6177d.m12377c(bArr, this.f13506d, 4);
        C6177d.m12377c(bArr, this.f13507e, i);
        C6177d.m12377c(bArr, this.f13508f, i2);
        C6177d.m12377c(bArr, this.f13509g, i3);
        try {
            C6174a aVar = this.f13510h;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(aVar);
            objectOutputStream.flush();
            return C8212a.m16506m(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("error serializing bds state: ");
            h.append(e.getMessage());
            throw new RuntimeException(h.toString());
        }
    }
}
