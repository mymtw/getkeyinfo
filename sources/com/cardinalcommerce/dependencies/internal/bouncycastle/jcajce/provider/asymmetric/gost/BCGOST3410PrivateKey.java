package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import androidx.appcompat.widget.C0326j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6153i;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.jvm.internal.C19382n;
import p001a0.C0005b;
import p081d6.C6662a;
import p161k6.C7199b;
import p180m6.C7337a;
import p180m6.C7338b;
import p199o6.C7630k;
import p199o6.C7631l;
import p223r5.C7766m;
import p223r5.C7767n;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7999m1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8027v1;
import p285x5.C8322a;
import p285x5.C8326e;

public class BCGOST3410PrivateKey implements C6153i, C7338b {

    /* renamed from: a */
    private BigInteger f13375a;

    /* renamed from: b */
    public transient C7337a f13376b;

    public BCGOST3410PrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7337a mo17246a() {
        return this.f13376b;
    }

    /* renamed from: b */
    public BigInteger mo17247b() {
        return this.f13375a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6153i)) {
            return false;
        }
        C6153i iVar = (C6153i) obj;
        if (!mo17247b().equals(iVar.mo17247b()) || !((C7630k) mo17246a()).f16917a.equals(((C7630k) iVar.mo17246a()).f16917a) || !((C7630k) mo17246a()).f16919c.equals(((C7630k) iVar.mo17246a()).f16919c)) {
            return false;
        }
        String str = ((C7630k) mo17246a()).f16920d;
        String str2 = ((C7630k) iVar.mo17246a()).f16920d;
        return str == str2 ? true : str == null ? false : str.equals(str2);
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public byte[] getEncoded() {
        byte[] byteArray = mo17247b().toByteArray();
        int length = byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.f13376b instanceof C7630k ? new C6662a(new C7199b(C8322a.f18256a, new C8326e(new C7959a(((C7630k) this.f13376b).f16918b), new C7959a(((C7630k) this.f13376b).f16919c))), new C7964b0(bArr), (C8027v1) null, (byte[]) null) : new C6662a(new C7199b(C8322a.f18256a), new C7964b0(bArr), (C8027v1) null, (byte[]) null)).mo20561a("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return mo17247b().hashCode() ^ this.f13376b.hashCode();
    }

    public String toString() {
        try {
            return C0005b.m53p(this.f13375a, (C7766m) C19382n.m32765q(this).f17194b);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public BCGOST3410PrivateKey(C6153i iVar) {
        new Hashtable();
        new Vector();
        this.f13375a = iVar.mo17247b();
        this.f13376b = iVar.mo17246a();
    }

    public BCGOST3410PrivateKey(C6662a aVar) {
        BigInteger bigInteger;
        C0326j.m867l();
        C8326e e = C8326e.m16621e(aVar.f14689c.f15984c);
        C8018s1 g = aVar.mo18832g();
        if (g instanceof C7999m1) {
            bigInteger = C7999m1.m16076q(g).mo20558v();
        } else {
            byte[] v = C8008p1.m16103q(aVar.mo18832g()).mo20541v();
            byte[] bArr = new byte[v.length];
            for (int i = 0; i != v.length; i++) {
                bArr[i] = v[(v.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.f13375a = bigInteger;
        this.f13376b = C7630k.m14650a(e);
    }

    public BCGOST3410PrivateKey(C7631l lVar) {
        C0326j.m867l();
        throw null;
    }

    public BCGOST3410PrivateKey(C7767n nVar, C7630k kVar) {
        C0326j.m867l();
        this.f13375a = nVar.f17198c;
        this.f13376b = kVar;
        if (kVar == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }
}
