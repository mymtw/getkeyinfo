package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.p053a.C6161b;
import java.io.IOException;
import java.security.PrivateKey;
import p081d6.C6662a;
import p223r5.C7770q;
import p223r5.C7773t;
import p223r5.C7775v;
import p234s5.C7821a;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8027v1;
import p267v7.C8212a;
import p293y5.C8395a;
import p628nj.C18263b;

public class BCXDHPrivateKey implements C6161b, PrivateKey {

    /* renamed from: b */
    private final boolean f13367b;

    /* renamed from: c */
    private final byte[] f13368c;

    /* renamed from: d */
    public transient C7770q f13369d;

    public BCXDHPrivateKey(C6662a aVar) {
        this.f13367b = aVar.f14692f != null;
        C8027v1 v1Var = aVar.f14691e;
        this.f13368c = v1Var != null ? v1Var.mo19527c() : null;
        C8018s1 g = aVar.mo18832g();
        this.f13369d = C8395a.f18404b.equals(aVar.f14689c.f15983b) ? new C7775v(C8008p1.m16103q(g).mo20541v()) : new C7773t(C8008p1.m16103q(g).mo20541v());
    }

    public BCXDHPrivateKey(C7770q qVar) {
        this.f13367b = true;
        this.f13368c = null;
        this.f13369d = qVar;
    }

    /* renamed from: a */
    public C7770q mo17400a() {
        return this.f13369d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXDHPrivateKey)) {
            return false;
        }
        return C8212a.m16500g(((BCXDHPrivateKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.f13369d instanceof C7775v ? "X448" : "X25519";
    }

    public byte[] getEncoded() {
        try {
            C8027v1 q = C8027v1.m16171q(this.f13368c);
            C6662a a = C7821a.m15080a(this.f13369d, q);
            return this.f13367b ? a.mo19527c() : new C6662a(a.f14689c, a.mo18832g(), q, (byte[]) null).mo19527c();
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
        C7770q qVar = this.f13369d;
        return C18263b.m30842f("Private Key", getAlgorithm(), qVar instanceof C7775v ? ((C7775v) qVar).mo20326a() : ((C7773t) qVar).mo20325a());
    }
}
