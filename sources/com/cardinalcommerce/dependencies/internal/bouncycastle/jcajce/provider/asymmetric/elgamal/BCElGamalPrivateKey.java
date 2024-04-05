package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import androidx.appcompat.widget.C0326j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6151e;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import p026b6.C3480a;
import p026b6.C3481b;
import p081d6.C6662a;
import p161k6.C7199b;
import p180m6.C7338b;
import p199o6.C7627h;
import p199o6.C7628i;
import p223r5.C7763j;
import p244t5.C7959a;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8021t1;
import p244t5.C8027v1;

public class BCElGamalPrivateKey implements C6151e, C7338b, DHPrivateKey {

    /* renamed from: a */
    private BigInteger f13371a;

    /* renamed from: b */
    public transient C7627h f13372b;

    public BCElGamalPrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7627h mo17242a() {
        return this.f13372b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public byte[] getEncoded() {
        try {
            C7959a aVar = C3481b.f8105b;
            C7627h hVar = this.f13372b;
            return new C6662a(new C7199b(aVar, new C3480a(hVar.f16915a, hVar.f16916b)), new C7999m1(getX()), (C8027v1) null, (byte[]) null).mo20561a("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        C7627h hVar = this.f13372b;
        return new DHParameterSpec(hVar.f16915a, hVar.f16916b);
    }

    public BigInteger getX() {
        return this.f13371a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCElGamalPrivateKey(C6151e eVar) {
        new Hashtable();
        new Vector();
        this.f13371a = eVar.getX();
        this.f13372b = eVar.mo17242a();
    }

    public BCElGamalPrivateKey(C6662a aVar) {
        C0326j.m867l();
        C7984h1 h1Var = aVar.f14689c.f15984c;
        C3480a aVar2 = h1Var instanceof C3480a ? (C3480a) h1Var : h1Var != null ? new C3480a(C8021t1.m16151s(h1Var)) : null;
        this.f13371a = C7999m1.m16076q(aVar.mo18832g()).mo20556s();
        this.f13372b = new C7627h(aVar2.f8102b.mo20558v(), aVar2.f8103c.mo20558v());
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        new Hashtable();
        new Vector();
        this.f13371a = dHPrivateKey.getX();
        this.f13372b = new C7627h(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13371a = dHPrivateKeySpec.getX();
        this.f13372b = new C7627h(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(C7628i iVar) {
        C0326j.m867l();
        throw null;
    }

    public BCElGamalPrivateKey(C7763j jVar) {
        C0326j.m867l();
        throw null;
    }
}
