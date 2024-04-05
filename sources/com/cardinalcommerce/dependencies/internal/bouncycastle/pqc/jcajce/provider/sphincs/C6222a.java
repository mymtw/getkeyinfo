package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6209d;
import java.io.IOException;
import java.security.PrivateKey;
import p001a0.C0005b;
import p081d6.C6662a;
import p161k6.C7199b;
import p162k7.C7206a;
import p171l7.C7269a;
import p181m7.C7339a;
import p181m7.C7346h;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C8027v1;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs.a */
public class C6222a implements C6209d, PrivateKey {

    /* renamed from: b */
    public transient C7959a f13545b;

    /* renamed from: c */
    public transient C7206a f13546c;

    /* renamed from: d */
    public transient C8027v1 f13547d;

    public C6222a(C6662a aVar) {
        this.f13547d = aVar.f14691e;
        this.f13545b = C7346h.m14113e(aVar.f14689c.f15984c).f16346c.f15983b;
        this.f13546c = (C7206a) C7269a.m13929a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6222a)) {
            return false;
        }
        C6222a aVar = (C6222a) obj;
        return this.f13545b.equals(aVar.f13545b) && C8212a.m16500g(C8212a.m16504k(this.f13546c.f16002c), C8212a.m16504k(aVar.f13546c.f16002c));
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            C7206a aVar = this.f13546c;
            return (aVar.f15251b != null ? C0005b.m49m(aVar, this.f13547d) : new C6662a(new C7199b(C7339a.f16302d, new C7346h(new C7199b(this.f13545b))), new C7964b0(C8212a.m16504k(this.f13546c.f16002c)), this.f13547d, (byte[]) null)).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C8212a.m16495b(C8212a.m16504k(this.f13546c.f16002c)) * 37) + this.f13545b.hashCode();
    }
}
