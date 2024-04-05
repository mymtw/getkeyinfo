package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import androidx.appcompat.widget.C0326j;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6149b;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
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
import p244t5.C8012r;
import p285x5.C8326e;

public class BCECGOST3410_2012PrivateKey implements C6149b, C7338b, ECPrivateKey {

    /* renamed from: a */
    private String f13350a = "ECGOST3410-2012";

    /* renamed from: b */
    private boolean f13351b;

    /* renamed from: c */
    public transient C8326e f13352c;

    /* renamed from: d */
    public transient BigInteger f13353d;

    /* renamed from: e */
    public transient ECParameterSpec f13354e;

    /* renamed from: f */
    public transient C8012r f13355f;

    public BCECGOST3410_2012PrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7623d mo17238a() {
        ECParameterSpec eCParameterSpec = this.f13354e;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13351b);
    }

    /* renamed from: b */
    public C7623d mo17365b() {
        ECParameterSpec eCParameterSpec = this.f13354e;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13351b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    /* renamed from: c */
    public BigInteger mo17239c() {
        return this.f13353d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return mo17239c().equals(bCECGOST3410_2012PrivateKey.mo17239c()) && mo17365b().equals(bCECGOST3410_2012PrivateKey.mo17365b());
    }

    public String getAlgorithm() {
        return this.f13350a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r13 = this;
            java.math.BigInteger r0 = r13.f13353d
            int r0 = r0.bitLength()
            r1 = 0
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0013
            t5.a r2 = p037c6.C4428a.f9717d
            goto L_0x0015
        L_0x0013:
            t5.a r2 = p037c6.C4428a.f9716c
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            r0 = 64
            goto L_0x001c
        L_0x001a:
            r0 = 32
        L_0x001c:
            x5.e r3 = r13.f13352c
            java.lang.String r4 = "DER"
            r5 = 0
            if (r3 == 0) goto L_0x0061
            byte[] r3 = new byte[r0]
            java.math.BigInteger r6 = r13.getS()
            byte[] r6 = r6.toByteArray()
            int r7 = r6.length
            if (r7 >= r0) goto L_0x003a
            byte[] r7 = new byte[r0]
            int r8 = r6.length
            int r8 = r0 - r8
            int r9 = r6.length
            java.lang.System.arraycopy(r6, r1, r7, r8, r9)
            r6 = r7
        L_0x003a:
            r7 = r1
        L_0x003b:
            if (r7 == r0) goto L_0x004a
            int r8 = r1 + r7
            int r9 = r6.length
            int r9 = r9 + -1
            int r9 = r9 - r7
            byte r9 = r6[r9]
            r3[r8] = r9
            int r7 = r7 + 1
            goto L_0x003b
        L_0x004a:
            d6.a r0 = new d6.a     // Catch:{ IOException -> 0x0060 }
            k6.b r1 = new k6.b     // Catch:{ IOException -> 0x0060 }
            x5.e r6 = r13.f13352c     // Catch:{ IOException -> 0x0060 }
            r1.<init>(r2, r6)     // Catch:{ IOException -> 0x0060 }
            t5.b0 r2 = new t5.b0     // Catch:{ IOException -> 0x0060 }
            r2.<init>((byte[]) r3)     // Catch:{ IOException -> 0x0060 }
            r0.<init>(r1, r2, r5, r5)     // Catch:{ IOException -> 0x0060 }
            byte[] r0 = r0.mo20561a(r4)     // Catch:{ IOException -> 0x0060 }
            return r0
        L_0x0060:
            return r5
        L_0x0061:
            java.security.spec.ECParameterSpec r0 = r13.f13354e
            boolean r1 = r0 instanceof p199o6.C7622c
            if (r1 == 0) goto L_0x0082
            o6.c r0 = (p199o6.C7622c) r0
            java.lang.String r0 = r0.f16909a
            t5.a r0 = kotlinx.coroutines.C19543e0.m33332s(r0)
            if (r0 != 0) goto L_0x007c
            t5.a r0 = new t5.a
            java.security.spec.ECParameterSpec r1 = r13.f13354e
            o6.c r1 = (p199o6.C7622c) r1
            java.lang.String r1 = r1.f16909a
            r0.<init>((java.lang.String) r1)
        L_0x007c:
            j6.d r1 = new j6.d
            r1.<init>((p244t5.C7959a) r0)
            goto L_0x00ce
        L_0x0082:
            if (r0 != 0) goto L_0x0096
            j6.d r0 = new j6.d
            t5.z r1 = p244t5.C8037z.f17524b
            r0.<init>((p244t5.C8037z) r1)
            a7.a r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.math.BigInteger r3 = r13.getS()
            int r1 = kotlinx.coroutines.C19543e0.m33319l(r1, r5, r3)
            goto L_0x00e1
        L_0x0096:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            p6.c r7 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12351g(r0)
            j6.f r0 = new j6.f
            java.security.spec.ECParameterSpec r1 = r13.f13354e
            java.security.spec.ECPoint r1 = r1.getGenerator()
            p6.e r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12353i(r7, r1)
            java.security.spec.ECParameterSpec r1 = r13.f13354e
            java.math.BigInteger r9 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r13.f13354e
            int r1 = r1.getCofactor()
            long r10 = (long) r1
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
            java.security.spec.ECParameterSpec r1 = r13.f13354e
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r11 = r1.getSeed()
            r6 = r0
            r6.<init>((p209p6.C7676c) r7, (p209p6.C7686e) r8, (java.math.BigInteger) r9, (java.math.BigInteger) r10, (byte[]) r11)
            j6.d r1 = new j6.d
            r1.<init>((p152j6.C7148f) r0)
        L_0x00ce:
            a7.a r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.security.spec.ECParameterSpec r3 = r13.f13354e
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r6 = r13.getS()
            int r0 = kotlinx.coroutines.C19543e0.m33319l(r0, r3, r6)
            r12 = r1
            r1 = r0
            r0 = r12
        L_0x00e1:
            t5.r r3 = r13.f13355f
            if (r3 == 0) goto L_0x00f1
            e6.a r3 = new e6.a
            java.math.BigInteger r6 = r13.getS()
            t5.r r7 = r13.f13355f
            r3.<init>(r1, r6, r7, r0)
            goto L_0x00fa
        L_0x00f1:
            e6.a r3 = new e6.a
            java.math.BigInteger r6 = r13.getS()
            r3.<init>(r1, r6, r5, r0)
        L_0x00fa:
            d6.a r1 = new d6.a     // Catch:{ IOException -> 0x010d }
            k6.b r6 = new k6.b     // Catch:{ IOException -> 0x010d }
            t5.s1 r0 = r0.f15866b     // Catch:{ IOException -> 0x010d }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x010d }
            t5.t1 r0 = r3.f14813b     // Catch:{ IOException -> 0x010d }
            r1.<init>(r6, r0, r5, r5)     // Catch:{ IOException -> 0x010d }
            byte[] r0 = r1.mo20561a(r4)     // Catch:{ IOException -> 0x010d }
            return r0
        L_0x010d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.f13354e;
    }

    public BigInteger getS() {
        return this.f13353d;
    }

    public int hashCode() {
        return mo17239c().hashCode() ^ mo17365b().hashCode();
    }

    public String toString() {
        return C19543e0.m33323n(this.f13350a, this.f13353d, mo17365b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: o6.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCECGOST3410_2012PrivateKey(p081d6.C6662a r10) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = "ECGOST3410-2012"
            r9.f13350a = r0
            androidx.appcompat.widget.C0326j.m867l()
            k6.b r0 = r10.f14689c
            t5.h1 r0 = r0.f15984c
            t5.s1 r0 = r0.mo12996i()
            boolean r1 = r0 instanceof p244t5.C8021t1
            if (r1 == 0) goto L_0x0093
            t5.t1 r1 = p244t5.C8021t1.m16151s(r0)
            int r1 = r1.mo20525y()
            r2 = 2
            if (r1 == r2) goto L_0x002c
            t5.t1 r0 = p244t5.C8021t1.m16151s(r0)
            int r0 = r0.mo20525y()
            r1 = 3
            if (r0 != r1) goto L_0x0093
        L_0x002c:
            k6.b r0 = r10.f14689c
            t5.h1 r0 = r0.f15984c
            x5.e r0 = p285x5.C8326e.m16621e(r0)
            r9.f13352c = r0
            t5.a r0 = r0.f18279b
            java.lang.String r0 = p285x5.C8323b.m16618a(r0)
            o6.b r0 = com.google.android.play.core.appupdate.C15562d.m25192c(r0)
            p6.c r1 = r0.f16910a
            java.security.spec.EllipticCurve r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r1)
            o6.c r1 = new o6.c
            x5.e r2 = r9.f13352c
            t5.a r2 = r2.f18279b
            java.lang.String r3 = p285x5.C8323b.m16618a(r2)
            p6.e r2 = r0.f16912c
            java.security.spec.ECPoint r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r2)
            java.math.BigInteger r6 = r0.f16913d
            java.math.BigInteger r7 = r0.f16914e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f13354e = r1
            t5.s1 r10 = r10.mo18832g()
            boolean r0 = r10 instanceof p244t5.C7999m1
            if (r0 == 0) goto L_0x0072
            t5.m1 r10 = p244t5.C7999m1.m16076q(r10)
            java.math.BigInteger r10 = r10.mo20558v()
            goto L_0x012d
        L_0x0072:
            t5.p1 r10 = p244t5.C8008p1.m16103q(r10)
            byte[] r10 = r10.mo20541v()
            int r0 = r10.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L_0x007e:
            int r2 = r10.length
            r3 = 1
            if (r1 == r2) goto L_0x008c
            int r2 = r10.length
            int r2 = r2 - r3
            int r2 = r2 - r1
            byte r2 = r10[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x007e
        L_0x008c:
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r3, r0)
            goto L_0x012d
        L_0x0093:
            k6.b r0 = r10.f14689c
            t5.h1 r0 = r0.f15984c
            j6.d r0 = p152j6.C7146d.m13814e(r0)
            t5.s1 r0 = r0.f15866b
            boolean r1 = r0 instanceof p244t5.C7959a
            if (r1 == 0) goto L_0x00f1
            t5.a r0 = p244t5.C7959a.m15938q(r0)
            j6.f r1 = kotlinx.coroutines.C19543e0.m33321m(r0)
            if (r1 != 0) goto L_0x00d1
            java.util.Hashtable r1 = p285x5.C8323b.f18268b
            java.lang.Object r1 = r1.get(r0)
            r5.g0 r1 = (p223r5.C7759g0) r1
            p6.c r2 = r1.f17188f
            r1.mo20320b()
            java.security.spec.EllipticCurve r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r2)
            o6.c r2 = new o6.c
            java.lang.String r4 = p285x5.C8323b.m16618a(r0)
            p6.e r0 = r1.f17190h
            java.security.spec.ECPoint r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r0)
            java.math.BigInteger r7 = r1.f17191i
            java.math.BigInteger r8 = r1.f17192j
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x011b
        L_0x00d1:
            p6.c r2 = r1.f15872c
            r1.mo19446l()
            java.security.spec.EllipticCurve r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r2)
            o6.c r2 = new o6.c
            java.lang.String r4 = kotlinx.coroutines.C19543e0.m33340w(r0)
            p6.e r0 = r1.mo19445g()
            java.security.spec.ECPoint r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r0)
            java.math.BigInteger r7 = r1.f15874e
            java.math.BigInteger r8 = r1.f15875f
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x011b
        L_0x00f1:
            boolean r1 = r0 instanceof p244t5.C8002n1
            if (r1 == 0) goto L_0x00f9
            r0 = 0
            r9.f13354e = r0
            goto L_0x011d
        L_0x00f9:
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
        L_0x011b:
            r9.f13354e = r2
        L_0x011d:
            t5.s1 r10 = r10.mo18832g()
            boolean r0 = r10 instanceof p244t5.C7999m1
            if (r0 == 0) goto L_0x0130
            t5.m1 r10 = p244t5.C7999m1.m16076q(r10)
            java.math.BigInteger r10 = r10.mo20556s()
        L_0x012d:
            r9.f13353d = r10
            goto L_0x0140
        L_0x0130:
            e6.a r10 = p093e6.C6719a.m13110e(r10)
            java.math.BigInteger r0 = r10.mo18903g()
            r9.f13353d = r0
            t5.r r10 = r10.mo18904l()
            r9.f13355f = r10
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.<init>(d6.a):void");
    }

    public BCECGOST3410_2012PrivateKey(String str, C7750c cVar) {
        C0326j.m867l();
        this.f13350a = str;
        cVar.getClass();
        this.f13353d = null;
        this.f13354e = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, C7750c cVar, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        C0326j.m867l();
        C7759g0 g0Var = cVar.f17170b;
        this.f13350a = str;
        this.f13353d = null;
        if (eCParameterSpec == null) {
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        }
        this.f13354e = eCParameterSpec;
        this.f13352c = bCECGOST3410_2012PublicKey.mo17376e();
        this.f13355f = C7198a.m13862e(bCECGOST3410_2012PublicKey.getEncoded()).f15982c;
    }

    public BCECGOST3410_2012PrivateKey(String str, C7750c cVar, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, C7623d dVar) {
        C0326j.m867l();
        C7759g0 g0Var = cVar.f17170b;
        this.f13350a = str;
        this.f13353d = null;
        if (dVar == null) {
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13354e = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            this.f13354e = new ECParameterSpec(C6171d.m12348d(dVar.f16910a), C6171d.m12347c(dVar.f16912c), dVar.f16913d, dVar.f16914e.intValue());
        }
        this.f13352c = bCECGOST3410_2012PublicKey.mo17376e();
        this.f13355f = C7198a.m13862e(bCECGOST3410_2012PublicKey.getEncoded()).f15982c;
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13353d = eCPrivateKeySpec.getS();
        this.f13354e = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(C7624e eVar) {
        C0326j.m867l();
        throw null;
    }
}
