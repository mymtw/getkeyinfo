package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.p053a.C6160a;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import p038c7.C4429a;
import p161k6.C7198a;
import p223r5.C7756f;
import p223r5.C7760h;
import p223r5.C7770q;
import p267v7.C8212a;
import p293y5.C8395a;
import p628nj.C18263b;

public class BCEdDSAPublicKey implements C6160a, PublicKey {

    /* renamed from: b */
    public transient C7770q f13366b;

    public BCEdDSAPublicKey(C7198a aVar) {
        C7770q qVar;
        if (C8395a.f18406d.equals(aVar.f15981b.f15983b)) {
            qVar = new C7760h(0, aVar.f15982c.mo20593q());
        } else {
            qVar = new C7756f(0, aVar.f15982c.mo20593q());
        }
        this.f13366b = qVar;
    }

    public BCEdDSAPublicKey(C7770q qVar) {
        this.f13366b = qVar;
    }

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) {
        C7770q fVar;
        int length = bArr.length;
        if (C18263b.m30850k(bArr, bArr2)) {
            if (bArr2.length - length == 57) {
                fVar = new C7760h(length, bArr2);
            } else if (bArr2.length - length == 32) {
                fVar = new C7756f(length, bArr2);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.f13366b = fVar;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    /* renamed from: a */
    public C7770q mo17393a() {
        return this.f13366b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCEdDSAPublicKey)) {
            return false;
        }
        return C8212a.m16500g(((BCEdDSAPublicKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.f13366b instanceof C7760h ? "Ed448" : "Ed25519";
    }

    public byte[] getEncoded() {
        if (this.f13366b instanceof C7760h) {
            byte[] bArr = C4429a.f9724c;
            byte[] bArr2 = new byte[(bArr.length + 57)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(((C7760h) this.f13366b).f17193b, 0, bArr2, bArr.length, 57);
            return bArr2;
        }
        byte[] bArr3 = C4429a.f9725d;
        byte[] bArr4 = new byte[(bArr3.length + 32)];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(((C7756f) this.f13366b).f17183b, 0, bArr4, bArr3.length, 32);
        return bArr4;
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C8212a.m16495b(getEncoded());
    }

    public String toString() {
        return C18263b.m30842f("Public Key", getAlgorithm(), this.f13366b);
    }
}
