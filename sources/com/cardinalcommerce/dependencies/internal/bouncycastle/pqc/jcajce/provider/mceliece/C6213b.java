package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0073e;
import java.io.IOException;
import java.security.PublicKey;
import kotlin.reflect.C19421p;
import p117g7.C6890c;
import p161k6.C7198a;
import p161k6.C7199b;
import p181m7.C7339a;
import p181m7.C7341c;
import p191n7.C7486a;
import p244t5.C8005o1;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.b */
public class C6213b implements PublicKey {

    /* renamed from: a */
    private C6890c f13526a;

    public C6213b(C6890c cVar) {
        this.f13526a = cVar;
    }

    /* renamed from: a */
    public int mo17559a() {
        return this.f13526a.f15258c;
    }

    /* renamed from: b */
    public int mo17560b() {
        return this.f13526a.f15259d;
    }

    /* renamed from: c */
    public C7486a mo17561c() {
        return this.f13526a.f15260e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6213b)) {
            return false;
        }
        C6213b bVar = (C6213b) obj;
        return this.f13526a.f15258c == bVar.mo17559a() && this.f13526a.f15259d == bVar.mo17560b() && this.f13526a.f15260e.equals(bVar.mo17561c());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        C6890c cVar = this.f13526a;
        try {
            return new C7198a(new C7199b(C7339a.f16301c), (C8005o1) new C7341c(cVar.f15258c, cVar.f15259d, cVar.f15260e, C19421p.m32955t(cVar.f15251b))).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        C6890c cVar = this.f13526a;
        int i = cVar.f15258c;
        return cVar.f15260e.hashCode() + (((cVar.f15259d * 37) + i) * 37);
    }

    public String toString() {
        StringBuilder k = C0073e.m211k(C0071c.m191c(C0073e.m211k(C0071c.m191c(C0073e.m211k("McEliecePublicKey:\n", " length of the code         : "), this.f13526a.f15258c, "\n"), " error correction capability: "), this.f13526a.f15259d, "\n"), " generator matrix           : ");
        k.append(this.f13526a.f15260e.toString());
        return k.toString();
    }
}
