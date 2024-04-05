package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6211f;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6202v;
import java.io.IOException;
import java.security.PrivateKey;
import p001a0.C0005b;
import p081d6.C6662a;
import p171l7.C7269a;
import p181m7.C7347i;
import p244t5.C7959a;
import p244t5.C8027v1;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.c */
public class C6226c implements C6211f, PrivateKey {

    /* renamed from: b */
    public transient C6202v f13555b;

    /* renamed from: c */
    public transient C7959a f13556c;

    /* renamed from: d */
    public transient C8027v1 f13557d;

    public C6226c(C6662a aVar) {
        this.f13557d = aVar.f14691e;
        this.f13556c = C7347i.m14115e(aVar.f14689c.f15984c).f16349d.f15983b;
        this.f13555b = (C6202v) C7269a.m13929a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6226c)) {
            return false;
        }
        C6226c cVar = (C6226c) obj;
        return this.f13556c.equals(cVar.f13556c) && C8212a.m16500g(this.f13555b.mo17546a(), cVar.f13555b.mo17546a());
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return C0005b.m49m(this.f13555b, this.f13557d).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (C8212a.m16495b(this.f13555b.mo17546a()) * 37) + this.f13556c.hashCode();
    }
}
