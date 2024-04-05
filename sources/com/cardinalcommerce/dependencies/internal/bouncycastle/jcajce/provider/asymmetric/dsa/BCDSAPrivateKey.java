package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import androidx.appcompat.widget.C0326j;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Hashtable;
import java.util.Vector;
import p081d6.C6662a;
import p152j6.C7153k;
import p161k6.C7199b;
import p161k6.C7202e;
import p180m6.C7338b;
import p223r5.C7753d0;
import p223r5.C7755e0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8021t1;
import p267v7.C8217e;
import p628nj.C18263b;

public class BCDSAPrivateKey implements C7338b, DSAPrivateKey {

    /* renamed from: a */
    private BigInteger f13307a;

    /* renamed from: b */
    public transient DSAParams f13308b;

    public BCDSAPrivateKey() {
        C0326j.m867l();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        return C18263b.m30866s(new C7199b(C7153k.f15909Z0, new C7202e(this.f13308b.getP(), this.f13308b.getQ(), this.f13308b.getG()).mo12996i()), new C7999m1(getX()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DSAParams getParams() {
        return this.f13308b;
    }

    public BigInteger getX() {
        return this.f13307a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        BigInteger modPow = getParams().getG().modPow(this.f13307a, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(C6163a.m12299a(modPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(C6662a aVar) {
        C0326j.m867l();
        C7984h1 h1Var = aVar.f14689c.f15984c;
        C7202e eVar = h1Var instanceof C7202e ? (C7202e) h1Var : h1Var != null ? new C7202e(C8021t1.m16151s(h1Var)) : null;
        this.f13307a = ((C7999m1) aVar.mo18832g()).mo20556s();
        this.f13308b = new DSAParameterSpec(eVar.f15985b.mo20558v(), eVar.f15986c.mo20558v(), eVar.f15987d.mo20558v());
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        new Hashtable();
        new Vector();
        this.f13307a = dSAPrivateKey.getX();
        this.f13308b = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13307a = dSAPrivateKeySpec.getX();
        this.f13308b = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(C7755e0 e0Var) {
        new Hashtable();
        new Vector();
        e0Var.getClass();
        this.f13307a = null;
        Object obj = e0Var.f17177b;
        this.f13308b = new DSAParameterSpec(((C7753d0) obj).f17181c, ((C7753d0) obj).f17180b, ((C7753d0) obj).f17179a);
    }
}
