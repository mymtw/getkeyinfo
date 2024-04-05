package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import androidx.appcompat.widget.C0326j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6149b;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.coroutines.C19543e0;
import p161k6.C7198a;
import p180m6.C7338b;
import p190n6.C7485a;
import p199o6.C7623d;
import p199o6.C7624e;
import p209p6.C7676c;
import p223r5.C7750c;
import p223r5.C7759g0;
import p244t5.C7984h1;
import p244t5.C8012r;
import p244t5.C8018s1;

public class BCECGOST3410PrivateKey implements C6149b, C7338b, ECPrivateKey {

    /* renamed from: a */
    private String f13337a = "ECGOST3410";

    /* renamed from: b */
    private boolean f13338b;

    /* renamed from: c */
    public transient C7984h1 f13339c;

    /* renamed from: d */
    public transient BigInteger f13340d;

    /* renamed from: e */
    public transient ECParameterSpec f13341e;

    /* renamed from: f */
    public transient C8012r f13342f;

    public BCECGOST3410PrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7623d mo17238a() {
        ECParameterSpec eCParameterSpec = this.f13341e;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13338b);
    }

    /* renamed from: b */
    public C7623d mo17344b() {
        ECParameterSpec eCParameterSpec = this.f13341e;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13338b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    /* renamed from: c */
    public BigInteger mo17239c() {
        return this.f13340d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return mo17239c().equals(bCECGOST3410PrivateKey.mo17239c()) && mo17344b().equals(bCECGOST3410PrivateKey.mo17344b());
    }

    public String getAlgorithm() {
        return this.f13337a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r10 = this;
            t5.h1 r0 = r10.f13339c
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L_0x004a
            r0 = 32
            byte[] r3 = new byte[r0]
            java.math.BigInteger r4 = r10.getS()
            byte[] r4 = r4.toByteArray()
            int r5 = r4.length
            r6 = 0
            if (r5 >= r0) goto L_0x0021
            byte[] r5 = new byte[r0]
            int r7 = r4.length
            int r7 = 32 - r7
            int r8 = r4.length
            java.lang.System.arraycopy(r4, r6, r5, r7, r8)
            r4 = r5
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r5 == r0) goto L_0x0031
            int r7 = r6 + r5
            int r8 = r4.length
            int r8 = r8 + -1
            int r8 = r8 - r5
            byte r8 = r4[r8]
            r3[r7] = r8
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0031:
            d6.a r0 = new d6.a     // Catch:{ IOException -> 0x0049 }
            k6.b r4 = new k6.b     // Catch:{ IOException -> 0x0049 }
            t5.a r5 = p285x5.C8322a.f18257b     // Catch:{ IOException -> 0x0049 }
            t5.h1 r6 = r10.f13339c     // Catch:{ IOException -> 0x0049 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0049 }
            t5.b0 r5 = new t5.b0     // Catch:{ IOException -> 0x0049 }
            r5.<init>((byte[]) r3)     // Catch:{ IOException -> 0x0049 }
            r0.<init>(r4, r5, r2, r2)     // Catch:{ IOException -> 0x0049 }
            byte[] r0 = r0.mo20561a(r1)     // Catch:{ IOException -> 0x0049 }
            return r0
        L_0x0049:
            return r2
        L_0x004a:
            java.security.spec.ECParameterSpec r0 = r10.f13341e
            boolean r3 = r0 instanceof p199o6.C7622c
            if (r3 == 0) goto L_0x006b
            o6.c r0 = (p199o6.C7622c) r0
            java.lang.String r0 = r0.f16909a
            t5.a r0 = kotlinx.coroutines.C19543e0.m33332s(r0)
            if (r0 != 0) goto L_0x0065
            t5.a r0 = new t5.a
            java.security.spec.ECParameterSpec r3 = r10.f13341e
            o6.c r3 = (p199o6.C7622c) r3
            java.lang.String r3 = r3.f16909a
            r0.<init>((java.lang.String) r3)
        L_0x0065:
            j6.d r3 = new j6.d
            r3.<init>((p244t5.C7959a) r0)
            goto L_0x00b7
        L_0x006b:
            if (r0 != 0) goto L_0x007f
            j6.d r0 = new j6.d
            t5.z r3 = p244t5.C8037z.f17524b
            r0.<init>((p244t5.C8037z) r3)
            a7.a r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.math.BigInteger r4 = r10.getS()
            int r3 = kotlinx.coroutines.C19543e0.m33319l(r3, r2, r4)
            goto L_0x00ca
        L_0x007f:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            p6.c r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12351g(r0)
            j6.f r0 = new j6.f
            java.security.spec.ECParameterSpec r3 = r10.f13341e
            java.security.spec.ECPoint r3 = r3.getGenerator()
            p6.e r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12353i(r4, r3)
            java.security.spec.ECParameterSpec r3 = r10.f13341e
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r10.f13341e
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r10.f13341e
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>((p209p6.C7676c) r4, (p209p6.C7686e) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (byte[]) r8)
            j6.d r3 = new j6.d
            r3.<init>((p152j6.C7148f) r0)
        L_0x00b7:
            a7.a r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.security.spec.ECParameterSpec r4 = r10.f13341e
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r10.getS()
            int r0 = kotlinx.coroutines.C19543e0.m33319l(r0, r4, r5)
            r9 = r3
            r3 = r0
            r0 = r9
        L_0x00ca:
            t5.r r4 = r10.f13342f
            if (r4 == 0) goto L_0x00da
            e6.a r4 = new e6.a
            java.math.BigInteger r5 = r10.getS()
            t5.r r6 = r10.f13342f
            r4.<init>(r3, r5, r6, r0)
            goto L_0x00e3
        L_0x00da:
            e6.a r4 = new e6.a
            java.math.BigInteger r5 = r10.getS()
            r4.<init>(r3, r5, r2, r0)
        L_0x00e3:
            d6.a r3 = new d6.a     // Catch:{ IOException -> 0x00f8 }
            k6.b r5 = new k6.b     // Catch:{ IOException -> 0x00f8 }
            t5.a r6 = p285x5.C8322a.f18257b     // Catch:{ IOException -> 0x00f8 }
            t5.s1 r0 = r0.f15866b     // Catch:{ IOException -> 0x00f8 }
            r5.<init>(r6, r0)     // Catch:{ IOException -> 0x00f8 }
            t5.t1 r0 = r4.f14813b     // Catch:{ IOException -> 0x00f8 }
            r3.<init>(r5, r0, r2, r2)     // Catch:{ IOException -> 0x00f8 }
            byte[] r0 = r3.mo20561a(r1)     // Catch:{ IOException -> 0x00f8 }
            return r0
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.f13341e;
    }

    public BigInteger getS() {
        return this.f13340d;
    }

    public int hashCode() {
        return mo17239c().hashCode() ^ mo17344b().hashCode();
    }

    public String toString() {
        return C19543e0.m33323n(this.f13337a, this.f13340d, mo17344b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCECGOST3410PrivateKey(p081d6.C6662a r10) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = "ECGOST3410"
            r9.f13337a = r0
            androidx.appcompat.widget.C0326j.m867l()
            k6.b r0 = r10.f14689c
            t5.h1 r0 = r0.f15984c
            t5.s1 r1 = r0.mo12996i()
            boolean r2 = r1 instanceof p244t5.C8021t1
            if (r2 == 0) goto L_0x008d
            t5.t1 r2 = p244t5.C8021t1.m16151s(r1)
            int r2 = r2.mo20525y()
            r3 = 2
            if (r2 == r3) goto L_0x002c
            t5.t1 r1 = p244t5.C8021t1.m16151s(r1)
            int r1 = r1.mo20525y()
            r2 = 3
            if (r1 != r2) goto L_0x008d
        L_0x002c:
            x5.e r0 = p285x5.C8326e.m16621e(r0)
            r9.f13339c = r0
            t5.a r1 = r0.f18279b
            java.lang.String r1 = p285x5.C8323b.m16618a(r1)
            o6.b r1 = com.google.android.play.core.appupdate.C15562d.m25192c(r1)
            p6.c r2 = r1.f16910a
            java.security.spec.EllipticCurve r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r2)
            o6.c r2 = new o6.c
            t5.a r0 = r0.f18279b
            java.lang.String r4 = p285x5.C8323b.m16618a(r0)
            p6.e r0 = r1.f16912c
            java.security.spec.ECPoint r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r0)
            java.math.BigInteger r7 = r1.f16913d
            java.math.BigInteger r8 = r1.f16914e
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f13341e = r2
            t5.s1 r10 = r10.mo18832g()
            boolean r0 = r10 instanceof p244t5.C7999m1
            if (r0 == 0) goto L_0x006c
            t5.m1 r10 = p244t5.C7999m1.m16076q(r10)
            java.math.BigInteger r10 = r10.mo20558v()
            goto L_0x011f
        L_0x006c:
            t5.p1 r10 = p244t5.C8008p1.m16103q(r10)
            byte[] r10 = r10.mo20541v()
            int r0 = r10.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L_0x0078:
            int r2 = r10.length
            r3 = 1
            if (r1 == r2) goto L_0x0086
            int r2 = r10.length
            int r2 = r2 - r3
            int r2 = r2 - r1
            byte r2 = r10[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x0078
        L_0x0086:
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r3, r0)
            goto L_0x011f
        L_0x008d:
            j6.d r0 = p152j6.C7146d.m13814e(r0)
            t5.s1 r0 = r0.f15866b
            boolean r1 = r0 instanceof p244t5.C7959a
            if (r1 == 0) goto L_0x00e3
            t5.a r0 = p244t5.C7959a.m15938q(r0)
            j6.f r1 = kotlinx.coroutines.C19543e0.m33321m(r0)
            if (r1 != 0) goto L_0x00c2
            java.util.Hashtable r1 = p285x5.C8323b.f18268b
            java.lang.Object r1 = r1.get(r0)
            r5.g0 r1 = (p223r5.C7759g0) r1
            j6.f r8 = new j6.f
            p6.c r3 = r1.f17188f
            p6.e r4 = r1.f17190h
            java.math.BigInteger r5 = r1.f17191i
            java.math.BigInteger r6 = r1.f17192j
            byte[] r7 = r1.mo20320b()
            r2 = r8
            r2.<init>((p209p6.C7676c) r3, (p209p6.C7686e) r4, (java.math.BigInteger) r5, (java.math.BigInteger) r6, (byte[]) r7)
            java.lang.String r0 = p285x5.C8323b.m16618a(r0)
            r3 = r0
            r1 = r8
            goto L_0x00c7
        L_0x00c2:
            java.lang.String r0 = kotlinx.coroutines.C19543e0.m33340w(r0)
            r3 = r0
        L_0x00c7:
            p6.c r0 = r1.f15872c
            r1.mo19446l()
            java.security.spec.EllipticCurve r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r0)
            o6.c r0 = new o6.c
            p6.e r2 = r1.mo19445g()
            java.security.spec.ECPoint r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r2)
            java.math.BigInteger r6 = r1.f15874e
            java.math.BigInteger r7 = r1.f15875f
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00e8
        L_0x00e3:
            boolean r1 = r0 instanceof p244t5.C8002n1
            if (r1 == 0) goto L_0x00eb
            r0 = 0
        L_0x00e8:
            r9.f13341e = r0
            goto L_0x010f
        L_0x00eb:
            j6.f r0 = p152j6.C7148f.m13817e(r0)
            p6.c r1 = r0.f15872c
            r0.mo19446l()
            java.security.spec.EllipticCurve r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r1)
            java.security.spec.ECParameterSpec r2 = new java.security.spec.ECParameterSpec
            p6.e r3 = r0.mo19445g()
            java.security.spec.ECPoint r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r3)
            java.math.BigInteger r4 = r0.f15874e
            java.math.BigInteger r0 = r0.f15875f
            int r0 = r0.intValue()
            r2.<init>(r1, r3, r4, r0)
            r9.f13341e = r2
        L_0x010f:
            t5.s1 r10 = r10.mo18832g()
            boolean r0 = r10 instanceof p244t5.C7999m1
            if (r0 == 0) goto L_0x0122
            t5.m1 r10 = p244t5.C7999m1.m16076q(r10)
            java.math.BigInteger r10 = r10.mo20556s()
        L_0x011f:
            r9.f13340d = r10
            goto L_0x0132
        L_0x0122:
            e6.a r10 = p093e6.C6719a.m13110e(r10)
            java.math.BigInteger r0 = r10.mo18903g()
            r9.f13340d = r0
            t5.r r10 = r10.mo18904l()
            r9.f13342f = r10
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.<init>(d6.a):void");
    }

    public BCECGOST3410PrivateKey(String str, C7750c cVar) {
        C0326j.m867l();
        this.f13337a = str;
        cVar.getClass();
        this.f13340d = null;
        this.f13341e = null;
    }

    public BCECGOST3410PrivateKey(String str, C7750c cVar, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        C0326j.m867l();
        this.f13337a = str;
        cVar.getClass();
        C8012r rVar = null;
        this.f13340d = null;
        if (eCParameterSpec == null) {
            C7759g0 g0Var = cVar.f17170b;
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        }
        this.f13341e = eCParameterSpec;
        this.f13339c = bCECGOST3410PublicKey.mo17355e();
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCECGOST3410PublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
        }
        this.f13342f = rVar;
    }

    public BCECGOST3410PrivateKey(String str, C7750c cVar, BCECGOST3410PublicKey bCECGOST3410PublicKey, C7623d dVar) {
        ECParameterSpec eCParameterSpec;
        C0326j.m867l();
        this.f13337a = str;
        cVar.getClass();
        C8012r rVar = null;
        this.f13340d = null;
        if (dVar == null) {
            C7759g0 g0Var = cVar.f17170b;
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(dVar.f16910a), C6171d.m12347c(dVar.f16912c), dVar.f16913d, dVar.f16914e.intValue());
        }
        this.f13341e = eCParameterSpec;
        this.f13339c = bCECGOST3410PublicKey.mo17355e();
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCECGOST3410PublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
        }
        this.f13342f = rVar;
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13340d = eCPrivateKeySpec.getS();
        this.f13341e = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(C7624e eVar) {
        C0326j.m867l();
        throw null;
    }
}
