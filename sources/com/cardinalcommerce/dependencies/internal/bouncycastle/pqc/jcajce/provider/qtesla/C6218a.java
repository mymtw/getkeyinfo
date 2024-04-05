package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.qtesla;

import androidx.compose.foundation.layout.C0761x;
import java.io.IOException;
import java.security.PrivateKey;
import p001a0.C0005b;
import p081d6.C6662a;
import p141i7.C6996a;
import p171l7.C7269a;
import p244t5.C8027v1;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.qtesla.a */
public class C6218a implements PrivateKey {

    /* renamed from: b */
    public transient C6996a f13532b;

    /* renamed from: c */
    public transient C8027v1 f13533c;

    public C6218a(C6662a aVar) {
        this.f13533c = aVar.f14691e;
        this.f13532b = (C6996a) C7269a.m13929a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6218a)) {
            return false;
        }
        C6218a aVar = (C6218a) obj;
        C6996a aVar2 = this.f13532b;
        return aVar2.f15537b == aVar.f13532b.f15537b && C8212a.m16500g(C8212a.m16504k(aVar2.f15538c), C8212a.m16504k(aVar.f13532b.f15538c));
    }

    public final String getAlgorithm() {
        return C0761x.m1659C(this.f13532b.f15537b);
    }

    public byte[] getEncoded() {
        try {
            return C0005b.m49m(this.f13532b, this.f13533c).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C6996a aVar = this.f13532b;
        return (C8212a.m16495b(C8212a.m16504k(aVar.f15538c)) * 37) + aVar.f15537b;
    }
}
