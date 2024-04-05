package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6154j;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import kotlin.jvm.internal.C19382n;
import p001a0.C0005b;
import p161k6.C7198a;
import p161k6.C7199b;
import p180m6.C7337a;
import p199o6.C7630k;
import p199o6.C7633n;
import p223r5.C7766m;
import p223r5.C7768o;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C8005o1;
import p285x5.C8322a;
import p285x5.C8326e;
import p628nj.C18263b;

public class BCGOST3410PublicKey implements C6154j {

    /* renamed from: a */
    private BigInteger f13377a;

    /* renamed from: b */
    public transient C7337a f13378b;

    public BCGOST3410PublicKey(C6154j jVar) {
        this.f13377a = jVar.mo17249b();
        this.f13378b = jVar.mo17248a();
    }

    public BCGOST3410PublicKey(C7198a aVar) {
        C8326e e = C8326e.m16621e(aVar.f15981b.f15984c);
        try {
            byte[] bArr = ((C7964b0) aVar.mo19494g()).f17499b;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            this.f13377a = new BigInteger(1, bArr2);
            this.f13378b = C7630k.m14650a(e);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    public BCGOST3410PublicKey(C7633n nVar) {
        throw null;
    }

    /* renamed from: a */
    public C7337a mo17248a() {
        return this.f13378b;
    }

    /* renamed from: b */
    public BigInteger mo17249b() {
        return this.f13377a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCGOST3410PublicKey) {
            BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
            return this.f13377a.equals(bCGOST3410PublicKey.f13377a) && this.f13378b.equals(bCGOST3410PublicKey.f13378b);
        }
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public byte[] getEncoded() {
        byte[] byteArray = mo17249b().toByteArray();
        int length = byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            C7337a aVar = this.f13378b;
            return C18263b.m30852l(aVar instanceof C7630k ? ((C7630k) aVar).f16920d != null ? new C7198a(new C7199b(C8322a.f18256a, new C8326e(new C7959a(((C7630k) this.f13378b).f16918b), new C7959a(((C7630k) this.f13378b).f16919c), new C7959a(((C7630k) this.f13378b).f16920d))), (C8005o1) new C7964b0(bArr)) : new C7198a(new C7199b(C8322a.f18256a, new C8326e(new C7959a(((C7630k) this.f13378b).f16918b), new C7959a(((C7630k) this.f13378b).f16919c))), (C8005o1) new C7964b0(bArr)) : new C7198a(new C7199b(C8322a.f18256a), (C8005o1) new C7964b0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f13377a.hashCode() ^ this.f13378b.hashCode();
    }

    public String toString() {
        try {
            return C0005b.m18L(this.f13377a, (C7766m) C19382n.m32767r(this).f17194b);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public BCGOST3410PublicKey(C7768o oVar, C7630k kVar) {
        this.f13377a = oVar.f17199c;
        this.f13378b = kVar;
    }
}
