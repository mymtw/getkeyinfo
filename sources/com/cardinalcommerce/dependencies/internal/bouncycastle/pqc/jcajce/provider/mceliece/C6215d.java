package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0073e;
import java.io.IOException;
import java.security.PublicKey;
import p117g7.C6893f;
import p161k6.C7198a;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7343e;
import p191n7.C7486a;
import p244t5.C8005o1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.d */
public class C6215d implements PublicKey {

    /* renamed from: a */
    private C6893f f13528a;

    public C6215d(C6893f fVar) {
        this.f13528a = fVar;
    }

    /* renamed from: a */
    public int mo17580a() {
        return this.f13528a.f15268b;
    }

    /* renamed from: b */
    public int mo17581b() {
        return this.f13528a.f15269c;
    }

    /* renamed from: c */
    public C7486a mo17582c() {
        return this.f13528a.f15270d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6215d)) {
            return false;
        }
        C6215d dVar = (C6215d) obj;
        return this.f13528a.f15268b == dVar.mo17580a() && this.f13528a.f15269c == dVar.mo17581b() && this.f13528a.f15270d.equals(dVar.mo17582c());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        C6893f fVar = this.f13528a;
        try {
            return new C7198a(new C7199b(C7339a.f16300b), (C8005o1) new C7343e(fVar.f15268b, fVar.f15269c, fVar.f15270d)).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C6893f fVar = this.f13528a;
        int i = fVar.f15268b;
        return fVar.f15270d.hashCode() + (((fVar.f15269c * 37) + i) * 37);
    }

    public String toString() {
        StringBuilder k = C0073e.m211k(C0071c.m191c(C0073e.m211k(C0071c.m191c(C0073e.m211k("McEliecePublicKey:\n", " length of the code         : "), this.f13528a.f15268b, "\n"), " error correction capability: "), this.f13528a.f15269c, "\n"), " generator matrix           : ");
        k.append(this.f13528a.f15270d);
        return k.toString();
    }
}
