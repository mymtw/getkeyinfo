package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss;

import androidx.compose.foundation.layout.C0761x;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6204w;
import java.io.IOException;
import java.security.PublicKey;
import p161k6.C7198a;
import p171l7.C7270b;
import p181m7.C7347i;
import p244t5.C7959a;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.d */
public class C6227d implements PublicKey {

    /* renamed from: b */
    public transient C6204w f13558b;

    /* renamed from: c */
    public transient C7959a f13559c;

    public C6227d(C7198a aVar) {
        this.f13559c = C7347i.m14115e(aVar.f15981b.f15984c).f16349d.f15983b;
        this.f13558b = (C6204w) C7270b.m13930a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6227d)) {
            return false;
        }
        C6227d dVar = (C6227d) obj;
        return this.f13559c.equals(dVar.f13559c) && C8212a.m16500g(this.f13558b.mo17547a(), dVar.f13558b.mo17547a());
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return C0761x.m1721g(this.f13558b).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (C8212a.m16495b(this.f13558b.mo17547a()) * 37) + this.f13559c.hashCode();
    }
}
