package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.qtesla;

import androidx.compose.foundation.layout.C0761x;
import java.io.IOException;
import java.security.PublicKey;
import p141i7.C6997b;
import p161k6.C7198a;
import p171l7.C7270b;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.qtesla.b */
public class C6219b implements PublicKey {

    /* renamed from: b */
    public transient C6997b f13534b;

    public C6219b(C7198a aVar) {
        this.f13534b = (C6997b) C7270b.m13930a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6219b)) {
            return false;
        }
        C6219b bVar = (C6219b) obj;
        C6997b bVar2 = this.f13534b;
        return bVar2.f15539b == bVar.f13534b.f15539b && C8212a.m16500g(C8212a.m16504k(bVar2.f15540c), C8212a.m16504k(bVar.f13534b.f15540c));
    }

    public final String getAlgorithm() {
        return C0761x.m1659C(this.f13534b.f15539b);
    }

    public byte[] getEncoded() {
        try {
            return C0761x.m1721g(this.f13534b).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C6997b bVar = this.f13534b;
        return (C8212a.m16495b(C8212a.m16504k(bVar.f15540c)) * 37) + bVar.f15539b;
    }
}
