package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import p081d6.C6665d;
import p081d6.C6667f;
import p082d7.C6669a;
import p161k6.C7198a;
import p161k6.C7199b;
import p223r5.C7771r;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p244t5.C8037z;
import p267v7.C8217e;
import p628nj.C18263b;

public class BCRSAPublicKey implements RSAPublicKey {

    /* renamed from: e */
    public static final C7199b f13388e = new C7199b(C6665d.f14699p0, C8037z.f17524b);

    /* renamed from: b */
    private BigInteger f13389b;

    /* renamed from: c */
    private BigInteger f13390c;

    /* renamed from: d */
    public transient C7199b f13391d;

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.f13391d = f13388e;
        this.f13389b = rSAPublicKey.getModulus();
        this.f13390c = rSAPublicKey.getPublicExponent();
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.f13391d = f13388e;
        this.f13389b = rSAPublicKeySpec.getModulus();
        this.f13390c = rSAPublicKeySpec.getPublicExponent();
    }

    public BCRSAPublicKey(C7198a aVar) {
        try {
            C8018s1 g = aVar.mo19494g();
            C6667f fVar = g instanceof C6667f ? (C6667f) g : g != null ? new C6667f(C8021t1.m16151s(g)) : null;
            this.f13391d = aVar.f15981b;
            this.f13389b = fVar.f14716b;
            this.f13390c = fVar.f14717c;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    public BCRSAPublicKey(C7771r rVar) {
        this.f13391d = f13388e;
        rVar.getClass();
        this.f13389b = null;
        this.f13390c = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    public String getAlgorithm() {
        return BaseSecureKeyWrapper.RSA_ALGORITHM;
    }

    public byte[] getEncoded() {
        return C18263b.m30854m(this.f13391d, new C6667f(getModulus(), getPublicExponent()));
    }

    public String getFormat() {
        return "X.509";
    }

    public BigInteger getModulus() {
        return this.f13389b;
    }

    public BigInteger getPublicExponent() {
        return this.f13390c;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(C6669a.m13043a(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(C6669a.m13044b(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("        modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
