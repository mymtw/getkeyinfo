package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import kotlin.jvm.internal.C19388s;
import p081d6.C6662a;
import p153j7.C7154a;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7344f;
import p200o7.C7634a;
import p244t5.C8027v1;
import p244t5.C8037z;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow.a */
public class C6220a implements PrivateKey {

    /* renamed from: a */
    private short[][] f13535a;

    /* renamed from: b */
    private short[] f13536b;

    /* renamed from: c */
    private short[][] f13537c;

    /* renamed from: d */
    private short[] f13538d;

    /* renamed from: e */
    private C7154a[] f13539e;

    /* renamed from: f */
    private int[] f13540f;

    public C6220a(C7634a aVar) {
        this(aVar.f16924b, aVar.f16925c, aVar.f16926d, aVar.f16927e, aVar.f16928f, aVar.f16929g);
    }

    public C6220a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C7154a[] aVarArr) {
        this.f13535a = sArr;
        this.f13536b = sArr2;
        this.f13537c = sArr3;
        this.f13538d = sArr4;
        this.f13540f = iArr;
        this.f13539e = aVarArr;
    }

    /* renamed from: a */
    public short[][] mo17609a() {
        return this.f13535a;
    }

    /* renamed from: b */
    public short[] mo17610b() {
        return this.f13536b;
    }

    /* renamed from: c */
    public short[] mo17611c() {
        return this.f13538d;
    }

    /* renamed from: d */
    public short[][] mo17612d() {
        return this.f13537c;
    }

    /* renamed from: e */
    public C7154a[] mo17613e() {
        return this.f13539e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6220a)) {
            return false;
        }
        C6220a aVar = (C6220a) obj;
        boolean z = ((((C19388s.m32889v(this.f13535a, aVar.mo17609a())) && C19388s.m32889v(this.f13537c, aVar.mo17612d())) && C19388s.m32887u(this.f13536b, aVar.mo17610b())) && C19388s.m32887u(this.f13538d, aVar.mo17611c())) && Arrays.equals(this.f13540f, aVar.mo17615f());
        if (this.f13539e.length != aVar.mo17613e().length) {
            return false;
        }
        for (int length = this.f13539e.length - 1; length >= 0; length--) {
            z &= this.f13539e[length].equals(aVar.mo17613e()[length]);
        }
        return z;
    }

    /* renamed from: f */
    public int[] mo17615f() {
        return this.f13540f;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        try {
            return new C6662a(new C7199b(C7339a.f16299a, C8037z.f17524b), new C7344f(this.f13535a, this.f13536b, this.f13537c, this.f13538d, this.f13540f, this.f13539e), (C8027v1) null, (byte[]) null).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int f = C8212a.m16499f(this.f13535a);
        int e = C8212a.m16498e(this.f13536b);
        int f2 = C8212a.m16499f(this.f13537c);
        int c = C8212a.m16496c(this.f13540f) + ((C8212a.m16498e(this.f13538d) + ((f2 + ((e + ((f + (this.f13539e.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = this.f13539e.length - 1; length >= 0; length--) {
            c = (c * 37) + this.f13539e[length].hashCode();
        }
        return c;
    }
}
