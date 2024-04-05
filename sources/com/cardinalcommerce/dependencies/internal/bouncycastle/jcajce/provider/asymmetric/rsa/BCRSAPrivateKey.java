package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import androidx.appcompat.widget.C0326j;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Hashtable;
import java.util.Vector;
import p081d6.C6665d;
import p081d6.C6666e;
import p082d7.C6669a;
import p161k6.C7199b;
import p180m6.C7338b;
import p223r5.C7771r;
import p244t5.C8037z;
import p267v7.C8217e;
import p628nj.C18263b;

public class BCRSAPrivateKey implements C7338b, RSAPrivateKey {

    /* renamed from: i */
    public static BigInteger f13385i = BigInteger.valueOf(0);

    /* renamed from: a */
    public BigInteger f13386a;

    /* renamed from: b */
    public BigInteger f13387b;

    public BCRSAPrivateKey() {
        C0326j.m867l();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    public String getAlgorithm() {
        return BaseSecureKeyWrapper.RSA_ALGORITHM;
    }

    public byte[] getEncoded() {
        C7199b bVar = new C7199b(C6665d.f14699p0, C8037z.f17524b);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = f13385i;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = f13385i;
        return C18263b.m30866s(bVar, new C6666e(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getModulus() {
        return this.f13386a;
    }

    public BigInteger getPrivateExponent() {
        return this.f13387b;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("RSA Private Key [");
        stringBuffer.append(C6669a.m13043a(getModulus()));
        stringBuffer.append("],[]");
        stringBuffer.append(str);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCRSAPrivateKey(C6666e eVar) {
        C0326j.m867l();
        this.f13386a = eVar.f14707c;
        this.f13387b = eVar.f14709e;
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        new Hashtable();
        new Vector();
        this.f13386a = rSAPrivateKey.getModulus();
        this.f13387b = rSAPrivateKey.getPrivateExponent();
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13386a = rSAPrivateKeySpec.getModulus();
        this.f13387b = rSAPrivateKeySpec.getPrivateExponent();
    }

    public BCRSAPrivateKey(C7771r rVar) {
        new Hashtable();
        new Vector();
        rVar.getClass();
        this.f13386a = null;
        this.f13387b = null;
    }
}
