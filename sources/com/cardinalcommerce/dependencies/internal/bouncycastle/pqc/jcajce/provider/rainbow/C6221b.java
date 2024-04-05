package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PublicKey;
import kotlin.jvm.internal.C19388s;
import p161k6.C7198a;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7345g;
import p200o7.C7635b;
import p244t5.C8005o1;
import p244t5.C8037z;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow.b */
public class C6221b implements PublicKey {

    /* renamed from: a */
    private short[][] f13541a;

    /* renamed from: b */
    private short[][] f13542b;

    /* renamed from: c */
    private short[] f13543c;

    /* renamed from: d */
    private int f13544d;

    public C6221b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f13544d = i;
        this.f13541a = sArr;
        this.f13542b = sArr2;
        this.f13543c = sArr3;
    }

    public C6221b(C7635b bVar) {
        this(bVar.f16933e, bVar.f16930b, bVar.f16931c, bVar.f16932d);
    }

    /* renamed from: a */
    public int mo17620a() {
        return this.f13544d;
    }

    /* renamed from: b */
    public short[][] mo17621b() {
        return this.f13541a;
    }

    /* renamed from: c */
    public short[][] mo17622c() {
        short[][] sArr = new short[this.f13542b.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.f13542b;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C8212a.m16505l(sArr2[i]);
            i++;
        }
    }

    /* renamed from: d */
    public short[] mo17623d() {
        return C8212a.m16505l(this.f13543c);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6221b)) {
            return false;
        }
        C6221b bVar = (C6221b) obj;
        return this.f13544d == bVar.mo17620a() && C19388s.m32889v(this.f13541a, bVar.mo17621b()) && C19388s.m32889v(this.f13542b, bVar.mo17622c()) && C19388s.m32887u(this.f13543c, bVar.mo17623d());
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        try {
            return new C7198a(new C7199b(C7339a.f16299a, C8037z.f17524b), (C8005o1) new C7345g(this.f13544d, this.f13541a, this.f13542b, this.f13543c)).mo20561a("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        int f = C8212a.m16499f(this.f13541a);
        int f2 = C8212a.m16499f(this.f13542b);
        return C8212a.m16498e(this.f13543c) + ((f2 + ((f + (this.f13544d * 37)) * 37)) * 37);
    }
}
