package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import p037c6.C4428a;
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
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p285x5.C8323b;
import p285x5.C8326e;
import p628nj.C18263b;

public class BCECGOST3410_2012PublicKey implements C6150c, ECPublicKey {

    /* renamed from: a */
    private String f13356a;

    /* renamed from: b */
    private boolean f13357b;

    /* renamed from: c */
    public transient C7752d f13358c;

    /* renamed from: d */
    public transient ECParameterSpec f13359d;

    /* renamed from: e */
    public transient C8326e f13360e;

    public BCECGOST3410_2012PublicKey(String str, C7752d dVar) {
        this.f13356a = str;
        this.f13358c = dVar;
        this.f13359d = null;
    }

    public BCECGOST3410_2012PublicKey(String str, C7752d dVar, ECParameterSpec eCParameterSpec) {
        this.f13356a = "ECGOST3410-2012";
        C7759g0 g0Var = dVar.f17170b;
        this.f13356a = str;
        this.f13358c = dVar;
        if (g0Var instanceof C7761h0) {
            ((C7761h0) g0Var).getClass();
            this.f13360e = new C8326e((C7959a) null, (C7959a) null, (C7959a) null);
        }
        if (eCParameterSpec == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13359d = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
            return;
        }
        this.f13359d = eCParameterSpec;
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f13356a = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f13359d = params;
        this.f13358c = new C7752d(C6171d.m12352h(params, eCPublicKeySpec.getW()), C6171d.m12354j((C0041a) null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(C7625f fVar, C0041a aVar) {
        this.f13356a = "ECGOST3410-2012";
        throw null;
    }

    /* renamed from: b */
    public static void m12329b(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    /* renamed from: a */
    public C7623d mo17240a() {
        ECParameterSpec eCParameterSpec = this.f13359d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13357b);
    }

    /* renamed from: b */
    public C7752d mo17374b() {
        return this.f13358c;
    }

    /* renamed from: c */
    public C7686e mo17241c() {
        return this.f13359d == null ? this.f13358c.f17178c.mo20140s().mo20135n() : this.f13358c.f17178c;
    }

    /* renamed from: d */
    public C7623d mo17375d() {
        ECParameterSpec eCParameterSpec = this.f13359d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13357b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    /* renamed from: e */
    public C8326e mo17376e() {
        if (this.f13360e == null && (this.f13359d instanceof C7622c)) {
            C7686e eVar = this.f13358c.f17178c;
            eVar.mo20139r();
            this.f13360e = eVar.f17049b.mo20092a().bitLength() > 256 ? new C8326e(C8323b.m16619b(((C7622c) this.f13359d).f16909a), C4428a.f9715b) : new C8326e(C8323b.m16619b(((C7622c) this.f13359d).f16909a), C4428a.f9714a);
        }
        return this.f13360e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.f13358c.f17178c.mo20124e(bCECGOST3410_2012PublicKey.f13358c.f17178c) && mo17375d().equals(bCECGOST3410_2012PublicKey.mo17375d());
    }

    public String getAlgorithm() {
        return this.f13356a;
    }

    public byte[] getEncoded() {
        C7959a aVar;
        int i;
        C8005o1 o1Var;
        C7959a aVar2;
        C7959a aVar3;
        C7686e eVar = this.f13358c.f17178c;
        eVar.mo20139r();
        BigInteger a = eVar.f17049b.mo20092a();
        BigInteger a2 = this.f13358c.f17178c.mo20137p().mo20092a();
        boolean z = a.bitLength() > 256;
        C8005o1 e = mo17376e();
        if (e == null) {
            ECParameterSpec eCParameterSpec = this.f13359d;
            if (eCParameterSpec instanceof C7622c) {
                C7622c cVar = (C7622c) eCParameterSpec;
                if (z) {
                    aVar3 = C8323b.m16619b(cVar.f16909a);
                    aVar2 = C4428a.f9715b;
                } else {
                    aVar3 = C8323b.m16619b(cVar.f16909a);
                    aVar2 = C4428a.f9714a;
                }
                o1Var = new C8326e(aVar3, aVar2);
            } else {
                C7676c g = C6171d.m12351g(eCParameterSpec.getCurve());
                o1Var = new C7146d(new C7148f(g, C6171d.m12353i(g, this.f13359d.getGenerator()), this.f13359d.getOrder(), BigInteger.valueOf((long) this.f13359d.getCofactor()), this.f13359d.getCurve().getSeed()));
            }
            e = o1Var;
        }
        int i2 = 64;
        if (z) {
            aVar = C4428a.f9717d;
            i2 = 128;
            i = 64;
        } else {
            i = 32;
            aVar = C4428a.f9716c;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        m12329b(bArr, i3, 0, a);
        m12329b(bArr, i3, i, a2);
        try {
            return C18263b.m30852l(new C7198a(new C7199b(aVar, e), (C8005o1) new C7964b0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.f13359d;
    }

    public ECPoint getW() {
        return C6171d.m12347c(this.f13358c.f17178c);
    }

    public int hashCode() {
        return this.f13358c.f17178c.hashCode() ^ mo17375d().hashCode();
    }

    public String toString() {
        return C19543e0.m33326p(this.f13356a, this.f13358c.f17178c, mo17375d());
    }

    public BCECGOST3410_2012PublicKey(String str, C7752d dVar, C7623d dVar2) {
        ECParameterSpec eCParameterSpec;
        this.f13356a = "ECGOST3410-2012";
        C7759g0 g0Var = dVar.f17170b;
        this.f13356a = str;
        this.f13358c = dVar;
        if (dVar2 == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = C6171d.m12346b(C6171d.m12348d(dVar2.f16910a), dVar2);
        }
        this.f13359d = eCParameterSpec;
    }

    public BCECGOST3410_2012PublicKey(C7198a aVar) {
        this.f13356a = "ECGOST3410-2012";
        C7959a aVar2 = aVar.f15981b.f15983b;
        C8012r rVar = aVar.f15982c;
        this.f13356a = "ECGOST3410-2012";
        try {
            byte[] v = ((C8008p1) C8018s1.m16138m(rVar.mo20594s())).mo20541v();
            int i = aVar2.equals(C4428a.f9717d) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr = new byte[(i2 + 1)];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = v[i - i3];
                bArr[i3 + i] = v[i2 - i3];
            }
            C8326e e = C8326e.m16621e(aVar.f15981b.f15984c);
            this.f13360e = e;
            C7621b c = C15562d.m25192c(C8323b.m16618a(e.f18279b));
            C7676c cVar = c.f16910a;
            EllipticCurve d = C6171d.m12348d(cVar);
            this.f13358c = new C7752d(cVar.mo20082i(bArr), C19543e0.m33330r((C0041a) null, c));
            this.f13359d = new C7622c(C8323b.m16618a(this.f13360e.f18279b), d, C6171d.m12347c(c.f16912c), c.f16913d, c.f16914e);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }
}
