package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.p053a.C6160a;
import java.io.IOException;
import java.security.PrivateKey;
import p081d6.C6662a;
import p223r5.C7754e;
import p223r5.C7758g;
import p223r5.C7770q;
import p234s5.C7821a;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8027v1;
import p267v7.C8212a;
import p293y5.C8395a;
import p628nj.C18263b;

public class BCEdDSAPrivateKey implements C6160a, PrivateKey {

    /* renamed from: b */
    private final boolean f13363b;

    /* renamed from: c */
    private final byte[] f13364c;

    /* renamed from: d */
    public transient C7770q f13365d;

    public BCEdDSAPrivateKey(C6662a aVar) {
        this.f13363b = aVar.f14692f != null;
        C8027v1 v1Var = aVar.f14691e;
        this.f13364c = v1Var != null ? v1Var.mo19527c() : null;
        C8018s1 g = aVar.mo18832g();
        this.f13365d = C8395a.f18406d.equals(aVar.f14689c.f15983b) ? new C7758g(C8008p1.m16103q(g).mo20541v()) : new C7754e(C8008p1.m16103q(g).mo20541v());
    }

    public BCEdDSAPrivateKey(C7770q qVar) {
        this.f13363b = true;
        this.f13364c = null;
        this.f13365d = qVar;
    }

    /* renamed from: a */
    public C7770q mo17386a() {
        return this.f13365d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCEdDSAPrivateKey)) {
            return false;
        }
        return C8212a.m16500g(((BCEdDSAPrivateKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.f13365d instanceof C7758g ? "Ed448" : "Ed25519";
    }

    public byte[] getEncoded() {
        try {
            C8027v1 q = C8027v1.m16171q(this.f13364c);
            C6662a a = C7821a.m15080a(this.f13365d, q);
            return this.f13363b ? a.mo19527c() : new C6662a(a.f14689c, a.mo18832g(), q, (byte[]) null).mo19527c();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C8212a.m16495b(getEncoded());
    }

    public String toString() {
        C7770q qVar = this.f13365d;
        return C18263b.m30842f("Private Key", getAlgorithm(), qVar instanceof C7758g ? ((C7758g) qVar).mo20319a() : ((C7754e) qVar).mo20318a());
    }
}
