package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import p152j6.C7153k;
import p161k6.C7198a;
import p161k6.C7199b;
import p161k6.C7202e;
import p223r5.C7753d0;
import p223r5.C7757f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8021t1;
import p244t5.C8037z;
import p267v7.C8217e;
import p628nj.C18263b;

public class BCDSAPublicKey implements DSAPublicKey {

    /* renamed from: b */
    private BigInteger f13309b;

    /* renamed from: c */
    public transient C7757f0 f13310c;

    /* renamed from: d */
    public transient DSAParams f13311d;

    static {
        BigInteger.valueOf(0);
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f13309b = dSAPublicKey.getY();
        this.f13311d = dSAPublicKey.getParams();
        this.f13310c = new C7757f0(this.f13309b, C6163a.m12300b(this.f13311d));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f13309b = dSAPublicKeySpec.getY();
        this.f13311d = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.f13310c = new C7757f0(this.f13309b, C6163a.m12300b(this.f13311d));
    }

    public BCDSAPublicKey(C7198a aVar) {
        try {
            this.f13309b = ((C7999m1) aVar.mo19494g()).mo20556s();
            C7984h1 h1Var = aVar.f15981b.f15984c;
            C7202e eVar = null;
            if (h1Var != null && !C8037z.f17524b.equals(h1Var.mo12996i())) {
                Object obj = aVar.f15981b.f15984c;
                if (obj instanceof C7202e) {
                    eVar = (C7202e) obj;
                } else if (obj != null) {
                    eVar = new C7202e(C8021t1.m16151s(obj));
                }
                this.f13311d = new DSAParameterSpec(eVar.f15985b.mo20558v(), eVar.f15986c.mo20558v(), eVar.f15987d.mo20558v());
            } else {
                this.f13311d = null;
            }
            this.f13310c = new C7757f0(this.f13309b, C6163a.m12300b(this.f13311d));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    /* renamed from: a */
    public C7757f0 mo17294a() {
        return this.f13310c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.f13311d != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        DSAParams dSAParams = this.f13311d;
        return dSAParams == null ? C18263b.m30854m(new C7199b(C7153k.f15909Z0), new C7999m1(this.f13309b)) : C18263b.m30854m(new C7199b(C7153k.f15909Z0, new C7202e(dSAParams.getP(), this.f13311d.getQ(), this.f13311d.getG()).mo12996i()), new C7999m1(this.f13309b));
    }

    public String getFormat() {
        return "X.509";
    }

    public DSAParams getParams() {
        return this.f13311d;
    }

    public BigInteger getY() {
        return this.f13309b;
    }

    public int hashCode() {
        return this.f13311d != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(C6163a.m12299a(this.f13309b, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(C7757f0 f0Var) {
        this.f13309b = f0Var.f17186c;
        Object obj = f0Var.f17177b;
        this.f13311d = new DSAParameterSpec(((C7753d0) obj).f17181c, ((C7753d0) obj).f17180b, ((C7753d0) obj).f17179a);
        this.f13310c = f0Var;
    }
}
