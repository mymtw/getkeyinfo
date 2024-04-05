package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs;

import androidx.compose.foundation.layout.C0761x;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.p059a.C6209d;
import java.io.IOException;
import java.security.PublicKey;
import p161k6.C7198a;
import p161k6.C7199b;
import p162k7.C7207b;
import p171l7.C7270b;
import p181m7.C7339a;
import p181m7.C7346h;
import p244t5.C7959a;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs.b */
public class C6223b implements C6209d, PublicKey {

    /* renamed from: b */
    public transient C7959a f13548b;

    /* renamed from: c */
    public transient C7207b f13549c;

    public C6223b(C7198a aVar) {
        this.f13548b = C7346h.m14113e(aVar.f15981b.f15984c).f16346c.f15983b;
        this.f13549c = (C7207b) C7270b.m13930a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6223b)) {
            return false;
        }
        C6223b bVar = (C6223b) obj;
        return this.f13548b.equals(bVar.f13548b) && C8212a.m16500g(C8212a.m16504k(this.f13549c.f16003c), C8212a.m16504k(bVar.f13549c.f16003c));
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            C7207b bVar = this.f13549c;
            return (bVar.f15251b != null ? C0761x.m1721g(bVar) : new C7198a(new C7199b(C7339a.f16302d, new C7346h(new C7199b(this.f13548b))), C8212a.m16504k(this.f13549c.f16003c))).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (C8212a.m16495b(C8212a.m16504k(this.f13549c.f16003c)) * 37) + this.f13548b.hashCode();
    }
}
