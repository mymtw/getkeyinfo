package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6152f;
import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import p026b6.C3480a;
import p026b6.C3481b;
import p161k6.C7198a;
import p161k6.C7199b;
import p199o6.C7627h;
import p199o6.C7629j;
import p223r5.C7764k;
import p244t5.C7959a;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8021t1;

public class BCElGamalPublicKey implements C6152f, DHPublicKey {

    /* renamed from: a */
    private BigInteger f13373a;

    /* renamed from: b */
    public transient C7627h f13374b;

    public BCElGamalPublicKey(C6152f fVar) {
        this.f13373a = fVar.getY();
        this.f13374b = fVar.mo17244a();
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f13373a = dHPublicKey.getY();
        this.f13374b = new C7627h(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13373a = dHPublicKeySpec.getY();
        this.f13374b = new C7627h(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(C7198a aVar) {
        C7984h1 h1Var = aVar.f15981b.f15984c;
        C3480a aVar2 = h1Var instanceof C3480a ? (C3480a) h1Var : h1Var != null ? new C3480a(C8021t1.m16151s(h1Var)) : null;
        try {
            this.f13373a = ((C7999m1) aVar.mo19494g()).mo20556s();
            this.f13374b = new C7627h(aVar2.f8102b.mo20558v(), aVar2.f8103c.mo20558v());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public BCElGamalPublicKey(C7629j jVar) {
        throw null;
    }

    public BCElGamalPublicKey(C7764k kVar) {
        throw null;
    }

    /* renamed from: a */
    public C7627h mo17244a() {
        return this.f13374b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public byte[] getEncoded() {
        try {
            C7959a aVar = C3481b.f8105b;
            C7627h hVar = this.f13374b;
            return new C7198a(new C7199b(aVar, new C3480a(hVar.f16915a, hVar.f16916b)), (C8005o1) new C7999m1(this.f13373a)).mo20561a("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        C7627h hVar = this.f13374b;
        return new DHParameterSpec(hVar.f16915a, hVar.f16916b);
    }

    public BigInteger getY() {
        return this.f13373a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
