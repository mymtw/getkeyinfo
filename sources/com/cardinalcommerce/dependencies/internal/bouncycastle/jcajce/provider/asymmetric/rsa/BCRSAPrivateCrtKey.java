package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import p081d6.C6665d;
import p081d6.C6666e;
import p082d7.C6669a;
import p161k6.C7199b;
import p223r5.C7771r;
import p223r5.C7772s;
import p244t5.C8037z;
import p267v7.C8217e;
import p628nj.C18263b;

public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {

    /* renamed from: c */
    private BigInteger f13379c;

    /* renamed from: d */
    private BigInteger f13380d;

    /* renamed from: e */
    private BigInteger f13381e;

    /* renamed from: f */
    private BigInteger f13382f;

    /* renamed from: g */
    private BigInteger f13383g;

    /* renamed from: h */
    private BigInteger f13384h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCRSAPrivateCrtKey(p081d6.C6662a r2) {
        /*
            r1 = this;
            t5.s1 r2 = r2.mo18832g()
            boolean r0 = r2 instanceof p081d6.C6666e
            if (r0 == 0) goto L_0x000b
            d6.e r2 = (p081d6.C6666e) r2
            goto L_0x0019
        L_0x000b:
            if (r2 == 0) goto L_0x0018
            d6.e r0 = new d6.e
            t5.t1 r2 = p244t5.C8021t1.m16151s(r2)
            r0.<init>(r2)
            r2 = r0
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            r1.<init>((p081d6.C6666e) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey.<init>(d6.a):void");
    }

    public BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.f13386a = rSAPrivateCrtKey.getModulus();
        this.f13379c = rSAPrivateCrtKey.getPublicExponent();
        this.f13387b = rSAPrivateCrtKey.getPrivateExponent();
        this.f13380d = rSAPrivateCrtKey.getPrimeP();
        this.f13381e = rSAPrivateCrtKey.getPrimeQ();
        this.f13382f = rSAPrivateCrtKey.getPrimeExponentP();
        this.f13383g = rSAPrivateCrtKey.getPrimeExponentQ();
        this.f13384h = rSAPrivateCrtKey.getCrtCoefficient();
    }

    public BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.f13386a = rSAPrivateCrtKeySpec.getModulus();
        this.f13379c = rSAPrivateCrtKeySpec.getPublicExponent();
        this.f13387b = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.f13380d = rSAPrivateCrtKeySpec.getPrimeP();
        this.f13381e = rSAPrivateCrtKeySpec.getPrimeQ();
        this.f13382f = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.f13383g = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.f13384h = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    public BCRSAPrivateCrtKey(C7772s sVar) {
        super((C7771r) sVar);
        sVar.getClass();
        this.f13379c = null;
        this.f13380d = null;
        this.f13381e = null;
        this.f13382f = null;
        this.f13383g = null;
        this.f13384h = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    public BigInteger getCrtCoefficient() {
        return this.f13384h;
    }

    public byte[] getEncoded() {
        return C18263b.m30866s(new C7199b(C6665d.f14699p0, C8037z.f17524b), new C6666e(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getPrimeExponentP() {
        return this.f13382f;
    }

    public BigInteger getPrimeExponentQ() {
        return this.f13383g;
    }

    public BigInteger getPrimeP() {
        return this.f13380d;
    }

    public BigInteger getPrimeQ() {
        return this.f13381e;
    }

    public BigInteger getPublicExponent() {
        return this.f13379c;
    }

    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("RSA Private CRT Key [");
        stringBuffer.append(C6669a.m13043a(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(C6669a.m13044b(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("             modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("     public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCRSAPrivateCrtKey(C6666e eVar) {
        this.f13386a = eVar.f14707c;
        this.f13379c = eVar.f14708d;
        this.f13387b = eVar.f14709e;
        this.f13380d = eVar.f14710f;
        this.f13381e = eVar.f14711g;
        this.f13382f = eVar.f14712h;
        this.f13383g = eVar.f14713i;
        this.f13384h = eVar.f14714j;
    }
}
