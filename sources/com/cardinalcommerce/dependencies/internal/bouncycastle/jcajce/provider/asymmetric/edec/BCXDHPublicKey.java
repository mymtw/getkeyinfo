package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.p053a.C6161b;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import p038c7.C4429a;
import p161k6.C7198a;
import p223r5.C7770q;
import p223r5.C7774u;
import p223r5.C7776w;
import p267v7.C8212a;
import p293y5.C8395a;
import p628nj.C18263b;

public class BCXDHPublicKey implements C6161b, PublicKey {

    /* renamed from: b */
    public transient C7770q f13370b;

    public BCXDHPublicKey(C7198a aVar) {
        C7770q qVar;
        if (C8395a.f18404b.equals(aVar.f15981b.f15983b)) {
            qVar = new C7776w(0, aVar.f15982c.mo20593q());
        } else {
            qVar = new C7774u(0, aVar.f15982c.mo20593q());
        }
        this.f13370b = qVar;
    }

    public BCXDHPublicKey(C7770q qVar) {
        this.f13370b = qVar;
    }

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) {
        C7770q uVar;
        int length = bArr.length;
        if (C18263b.m30850k(bArr, bArr2)) {
            if (bArr2.length - length == 56) {
                uVar = new C7776w(length, bArr2);
            } else if (bArr2.length - length == 32) {
                uVar = new C7774u(length, bArr2);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.f13370b = uVar;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    /* renamed from: a */
    public C7770q mo17407a() {
        return this.f13370b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXDHPublicKey)) {
            return false;
        }
        return C8212a.m16500g(((BCXDHPublicKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.f13370b instanceof C7776w ? "X448" : "X25519";
    }

    public byte[] getEncoded() {
        if (this.f13370b instanceof C7776w) {
            byte[] bArr = C4429a.f9722a;
            byte[] bArr2 = new byte[(bArr.length + 56)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(((C7776w) this.f13370b).f17205b, 0, bArr2, bArr.length, 56);
            return bArr2;
        }
        byte[] bArr3 = C4429a.f9723b;
        byte[] bArr4 = new byte[(bArr3.length + 32)];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(((C7774u) this.f13370b).f17203b, 0, bArr4, bArr3.length, 32);
        return bArr4;
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C8212a.m16495b(getEncoded());
    }

    public String toString() {
        return C18263b.m30842f("Public Key", getAlgorithm(), this.f13370b);
    }
}
