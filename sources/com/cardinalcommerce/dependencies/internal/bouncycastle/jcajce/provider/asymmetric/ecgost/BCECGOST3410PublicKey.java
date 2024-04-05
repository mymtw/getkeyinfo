package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6150c;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import kotlinx.coroutines.C19543e0;
import p008a7.C0041a;
import p152j6.C7146d;
import p152j6.C7148f;
import p161k6.C7198a;
import p161k6.C7199b;
import p190n6.C7485a;
import p199o6.C7621b;
import p199o6.C7622c;
import p199o6.C7623d;
import p199o6.C7625f;
import p209p6.C7676c;
import p209p6.C7686e;
import p223r5.C7752d;
import p223r5.C7759g0;
import p223r5.C7761h0;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p285x5.C8322a;
import p285x5.C8323b;
import p285x5.C8326e;
import p628nj.C18263b;

public class BCECGOST3410PublicKey implements C6150c, ECPublicKey {

    /* renamed from: a */
    private String f13343a;

    /* renamed from: b */
    private boolean f13344b;

    /* renamed from: c */
    public transient C7752d f13345c;

    /* renamed from: d */
    public transient ECParameterSpec f13346d;

    /* renamed from: e */
    public transient C8005o1 f13347e;

    public BCECGOST3410PublicKey(String str, C7752d dVar) {
        this.f13343a = str;
        this.f13345c = dVar;
        this.f13346d = null;
    }

    public BCECGOST3410PublicKey(String str, C7752d dVar, ECParameterSpec eCParameterSpec) {
        this.f13343a = "ECGOST3410";
        C7759g0 g0Var = dVar.f17170b;
        if (g0Var instanceof C7761h0) {
            ((C7761h0) g0Var).getClass();
            this.f13347e = new C8326e((C7959a) null, (C7959a) null, (C7959a) null);
        }
        this.f13343a = str;
        this.f13345c = dVar;
        if (eCParameterSpec == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13346d = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
            return;
        }
        this.f13346d = eCParameterSpec;
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f13343a = "ECGOST3410";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f13346d = params;
        this.f13345c = new C7752d(C6171d.m12352h(params, eCPublicKeySpec.getW()), C6171d.m12354j((C0041a) null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(C7625f fVar, C0041a aVar) {
        this.f13343a = "ECGOST3410";
        throw null;
    }

    /* renamed from: b */
    public static void m12320b(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    /* renamed from: a */
    public C7623d mo17240a() {
        ECParameterSpec eCParameterSpec = this.f13346d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13344b);
    }

    /* renamed from: b */
    public C7752d mo17353b() {
        return this.f13345c;
    }

    /* renamed from: c */
    public C7686e mo17241c() {
        return this.f13346d == null ? this.f13345c.f17178c.mo20140s().mo20135n() : this.f13345c.f17178c;
    }

    /* renamed from: d */
    public C7623d mo17354d() {
        ECParameterSpec eCParameterSpec = this.f13346d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13344b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    /* renamed from: e */
    public C7984h1 mo17355e() {
        if (this.f13347e == null) {
            ECParameterSpec eCParameterSpec = this.f13346d;
            if (eCParameterSpec instanceof C7622c) {
                this.f13347e = new C8326e(C8323b.m16619b(((C7622c) eCParameterSpec).f16909a), C8322a.f18258c);
            }
        }
        return this.f13347e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.f13345c.f17178c.mo20124e(bCECGOST3410PublicKey.f13345c.f17178c) && mo17354d().equals(bCECGOST3410PublicKey.mo17354d());
    }

    public String getAlgorithm() {
        return this.f13343a;
    }

    public byte[] getEncoded() {
        C7984h1 h1Var;
        C7984h1 e = mo17355e();
        if (e == null) {
            ECParameterSpec eCParameterSpec = this.f13346d;
            if (eCParameterSpec instanceof C7622c) {
                h1Var = new C8326e(C8323b.m16619b(((C7622c) eCParameterSpec).f16909a), C8322a.f18258c);
            } else {
                C7676c g = C6171d.m12351g(eCParameterSpec.getCurve());
                h1Var = new C7146d(new C7148f(g, C6171d.m12353i(g, this.f13346d.getGenerator()), this.f13346d.getOrder(), BigInteger.valueOf((long) this.f13346d.getCofactor()), this.f13346d.getCurve().getSeed()));
            }
            e = h1Var;
        }
        C7686e eVar = this.f13345c.f17178c;
        eVar.mo20139r();
        BigInteger a = eVar.f17049b.mo20092a();
        BigInteger a2 = this.f13345c.f17178c.mo20137p().mo20092a();
        byte[] bArr = new byte[64];
        m12320b(bArr, 0, a);
        m12320b(bArr, 32, a2);
        try {
            return C18263b.m30852l(new C7198a(new C7199b(C8322a.f18257b, e), (C8005o1) new C7964b0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.f13346d;
    }

    public ECPoint getW() {
        return C6171d.m12347c(this.f13345c.f17178c);
    }

    public int hashCode() {
        return this.f13345c.f17178c.hashCode() ^ mo17354d().hashCode();
    }

    public String toString() {
        return C19543e0.m33326p(this.f13343a, this.f13345c.f17178c, mo17354d());
    }

    public BCECGOST3410PublicKey(String str, C7752d dVar, C7623d dVar2) {
        ECParameterSpec eCParameterSpec;
        this.f13343a = "ECGOST3410";
        C7759g0 g0Var = dVar.f17170b;
        this.f13343a = str;
        this.f13345c = dVar;
        if (dVar2 == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = C6171d.m12346b(C6171d.m12348d(dVar2.f16910a), dVar2);
        }
        this.f13346d = eCParameterSpec;
    }

    public BCECGOST3410PublicKey(C7198a aVar) {
        C7959a aVar2;
        this.f13343a = "ECGOST3410";
        C8012r rVar = aVar.f15982c;
        this.f13343a = "ECGOST3410";
        try {
            byte[] v = ((C8008p1) C8018s1.m16138m(rVar.mo20594s())).mo20541v();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = v[32 - i];
                bArr[i + 32] = v[64 - i];
            }
            C7984h1 h1Var = aVar.f15981b.f15984c;
            if (h1Var instanceof C7959a) {
                aVar2 = C7959a.m15938q(h1Var);
                this.f13347e = aVar2;
            } else {
                C8326e e = C8326e.m16621e(h1Var);
                this.f13347e = e;
                aVar2 = e.f18279b;
            }
            C7621b c = C15562d.m25192c(C8323b.m16618a(aVar2));
            C7676c cVar = c.f16910a;
            EllipticCurve d = C6171d.m12348d(cVar);
            this.f13345c = new C7752d(cVar.mo20082i(bArr), C19543e0.m33330r((C0041a) null, c));
            this.f13346d = new C7622c(C8323b.m16618a(aVar2), d, C6171d.m12347c(c.f16912c), c.f16913d, c.f16914e);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }
}
