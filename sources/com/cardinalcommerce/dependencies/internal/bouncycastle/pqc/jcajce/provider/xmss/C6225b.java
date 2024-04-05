package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss;

import androidx.compose.foundation.layout.C0761x;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6197r;
import java.io.IOException;
import java.security.PublicKey;
import p161k6.C7198a;
import p171l7.C7270b;
import p181m7.C7348j;
import p244t5.C7959a;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.b */
public class C6225b implements PublicKey {

    /* renamed from: b */
    public transient C7959a f13553b;

    /* renamed from: c */
    public transient C6197r f13554c;

    public C6225b(C7198a aVar) {
        this.f13553b = C7348j.m14117e(aVar.f15981b.f15984c).f16353e.f15983b;
        this.f13554c = (C6197r) C7270b.m13930a(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6225b)) {
            return false;
        }
        C6225b bVar = (C6225b) obj;
        return this.f13553b.equals(bVar.f13553b) && C8212a.m16500g(this.f13554c.mo17540a(), bVar.f13554c.mo17540a());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return C0761x.m1721g(this.f13554c).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (C8212a.m16495b(this.f13554c.mo17540a()) * 37) + this.f13553b.hashCode();
    }
}
