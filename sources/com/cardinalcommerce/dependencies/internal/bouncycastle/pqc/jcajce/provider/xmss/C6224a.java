package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6210e;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6195q;
import java.io.IOException;
import java.security.PrivateKey;
import p001a0.C0005b;
import p081d6.C6662a;
import p171l7.C7269a;
import p181m7.C7348j;
import p244t5.C7959a;
import p244t5.C8027v1;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.a */
public class C6224a implements C6210e, PrivateKey {

    /* renamed from: b */
    public transient C7959a f13550b;

    /* renamed from: c */
    public transient C6195q f13551c;

    /* renamed from: d */
    public transient C8027v1 f13552d;

    public C6224a(C6662a aVar) {
        this.f13552d = aVar.f14691e;
        this.f13550b = C7348j.m14117e(aVar.f14689c.f15984c).f16353e.f15983b;
        this.f13551c = (C6195q) C7269a.m13929a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6224a)) {
            return false;
        }
        C6224a aVar = (C6224a) obj;
        return this.f13550b.equals(aVar.f13550b) && C8212a.m16500g(this.f13551c.mo17539a(), aVar.f13551c.mo17539a());
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return C0005b.m49m(this.f13551c, this.f13552d).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C8212a.m16495b(this.f13551c.mo17539a()) * 37) + this.f13550b.hashCode();
    }
}
