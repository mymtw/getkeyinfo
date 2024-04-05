package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import p244t5.C8012r;
import p244t5.C8018s1;

public class BCDSTU4145PrivateKey implements C6149b, C7338b, ECPrivateKey {

    /* renamed from: a */
    private String f13314a = "DSTU4145";

    /* renamed from: b */
    private boolean f13315b;

    /* renamed from: c */
    public transient BigInteger f13316c;

    /* renamed from: d */
    public transient ECParameterSpec f13317d;

    /* renamed from: e */
    public transient C8012r f13318e;

    public BCDSTU4145PrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7623d mo17238a() {
        ECParameterSpec eCParameterSpec = this.f13317d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13315b);
    }

    /* renamed from: b */
    public C7623d mo17304b() {
        ECParameterSpec eCParameterSpec = this.f13317d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13315b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    /* renamed from: c */
    public BigInteger mo17239c() {
        return this.f13316c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return mo17239c().equals(bCDSTU4145PrivateKey.mo17239c()) && mo17304b().equals(bCDSTU4145PrivateKey.mo17304b());
    }

    public String getAlgorithm() {
        return this.f13314a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a4 A[Catch:{ IOException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b5 A[Catch:{ IOException -> 0x00cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r10 = this;
            java.security.spec.ECParameterSpec r0 = r10.f13317d
            boolean r1 = r0 instanceof p199o6.C7622c
            r2 = 0
            if (r1 == 0) goto L_0x0022
            o6.c r0 = (p199o6.C7622c) r0
            java.lang.String r0 = r0.f16909a
            t5.a r0 = kotlinx.coroutines.C19543e0.m33332s(r0)
            if (r0 != 0) goto L_0x001c
            t5.a r0 = new t5.a
            java.security.spec.ECParameterSpec r1 = r10.f13317d
            o6.c r1 = (p199o6.C7622c) r1
            java.lang.String r1 = r1.f16909a
            r0.<init>((java.lang.String) r1)
        L_0x001c:
            j6.d r1 = new j6.d
            r1.<init>((p244t5.C7959a) r0)
            goto L_0x006e
        L_0x0022:
            if (r0 != 0) goto L_0x0036
            j6.d r0 = new j6.d
            t5.z r1 = p244t5.C8037z.f17524b
            r0.<init>((p244t5.C8037z) r1)
            a7.a r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.math.BigInteger r3 = r10.getS()
            int r1 = kotlinx.coroutines.C19543e0.m33319l(r1, r2, r3)
            goto L_0x0081
        L_0x0036:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            p6.c r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12351g(r0)
            j6.f r0 = new j6.f
            java.security.spec.ECParameterSpec r1 = r10.f13317d
            java.security.spec.ECPoint r1 = r1.getGenerator()
            p6.e r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12353i(r4, r1)
            java.security.spec.ECParameterSpec r1 = r10.f13317d
            java.math.BigInteger r6 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r10.f13317d
            int r1 = r1.getCofactor()
            long r7 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r1 = r10.f13317d
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r8 = r1.getSeed()
            r3 = r0
            r3.<init>((p209p6.C7676c) r4, (p209p6.C7686e) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (byte[]) r8)
            j6.d r1 = new j6.d
            r1.<init>((p152j6.C7148f) r0)
        L_0x006e:
            a7.a r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a.f13286a
            java.security.spec.ECParameterSpec r3 = r10.f13317d
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r10.getS()
            int r0 = kotlinx.coroutines.C19543e0.m33319l(r0, r3, r4)
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0081:
            t5.r r3 = r10.f13318e
            if (r3 == 0) goto L_0x0091
            e6.a r3 = new e6.a
            java.math.BigInteger r4 = r10.getS()
            t5.r r5 = r10.f13318e
            r3.<init>(r1, r4, r5, r0)
            goto L_0x009a
        L_0x0091:
            e6.a r3 = new e6.a
            java.math.BigInteger r4 = r10.getS()
            r3.<init>(r1, r4, r2, r0)
        L_0x009a:
            java.lang.String r1 = r10.f13314a     // Catch:{ IOException -> 0x00cc }
            java.lang.String r4 = "DSTU4145"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x00cc }
            if (r1 == 0) goto L_0x00b5
            d6.a r1 = new d6.a     // Catch:{ IOException -> 0x00cc }
            k6.b r4 = new k6.b     // Catch:{ IOException -> 0x00cc }
            t5.a r5 = p116g6.C6887e.f15250b     // Catch:{ IOException -> 0x00cc }
            t5.s1 r0 = r0.f15866b     // Catch:{ IOException -> 0x00cc }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x00cc }
            t5.t1 r0 = r3.f14813b     // Catch:{ IOException -> 0x00cc }
            r1.<init>(r4, r0, r2, r2)     // Catch:{ IOException -> 0x00cc }
            goto L_0x00c5
        L_0x00b5:
            d6.a r1 = new d6.a     // Catch:{ IOException -> 0x00cc }
            k6.b r4 = new k6.b     // Catch:{ IOException -> 0x00cc }
            t5.a r5 = p152j6.C7153k.f15885B0     // Catch:{ IOException -> 0x00cc }
            t5.s1 r0 = r0.f15866b     // Catch:{ IOException -> 0x00cc }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x00cc }
            t5.t1 r0 = r3.f14813b     // Catch:{ IOException -> 0x00cc }
            r1.<init>(r4, r0, r2, r2)     // Catch:{ IOException -> 0x00cc }
        L_0x00c5:
            java.lang.String r0 = "DER"
            byte[] r0 = r1.mo20561a(r0)     // Catch:{ IOException -> 0x00cc }
            return r0
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.f13317d;
    }

    public BigInteger getS() {
        return this.f13316c;
    }

    public int hashCode() {
        return mo17239c().hashCode() ^ mo17304b().hashCode();
    }

    public String toString() {
        return C19543e0.m33323n(this.f13314a, this.f13316c, mo17304b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: o6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: o6.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: o6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: o6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: o6.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCDSTU4145PrivateKey(p081d6.C6662a r14) {
        /*
            r13 = this;
            r13.<init>()
            java.lang.String r0 = "DSTU4145"
            r13.f13314a = r0
            androidx.appcompat.widget.C0326j.m867l()
            k6.b r0 = r14.f14689c
            t5.h1 r0 = r0.f15984c
            j6.d r0 = p152j6.C7146d.m13814e(r0)
            t5.s1 r1 = r0.f15866b
            boolean r2 = r1 instanceof p244t5.C7959a
            if (r2 == 0) goto L_0x0062
            t5.a r0 = p244t5.C7959a.m15938q(r1)
            j6.f r1 = kotlinx.coroutines.C19543e0.m33321m(r0)
            if (r1 != 0) goto L_0x0042
            r5.g0 r1 = p116g6.C6885c.m13339a(r0)
            p6.c r2 = r1.f17188f
            r1.mo20320b()
            java.security.spec.EllipticCurve r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r2)
            o6.c r2 = new o6.c
            java.lang.String r4 = r0.f17434b
            p6.e r0 = r1.f17190h
            java.security.spec.ECPoint r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r0)
            java.math.BigInteger r7 = r1.f17191i
            java.math.BigInteger r8 = r1.f17192j
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x009c
        L_0x0042:
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
            goto L_0x009c
        L_0x0062:
            boolean r2 = r1 instanceof p244t5.C8002n1
            if (r2 == 0) goto L_0x006b
            r0 = 0
            r13.f13317d = r0
            goto L_0x0169
        L_0x006b:
            t5.t1 r1 = p244t5.C8021t1.m16151s(r1)
            r2 = 0
            t5.h1 r3 = r1.mo20523q(r2)
            boolean r3 = r3 instanceof p244t5.C7999m1
            if (r3 == 0) goto L_0x00a0
            t5.s1 r0 = r0.f15866b
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
        L_0x009c:
            r13.f13317d = r2
            goto L_0x0169
        L_0x00a0:
            g6.d r0 = p116g6.C6886d.m13340e(r1)
            boolean r1 = r0.mo19009g()
            if (r1 == 0) goto L_0x00c6
            t5.a r0 = r0.f15246b
            r5.g0 r1 = p116g6.C6885c.m13339a(r0)
            o6.b r9 = new o6.b
            java.lang.String r3 = r0.f17434b
            p6.c r4 = r1.f17188f
            p6.e r5 = r1.f17190h
            java.math.BigInteger r6 = r1.f17191i
            java.math.BigInteger r7 = r1.f17192j
            byte[] r8 = r1.mo20320b()
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x014e
        L_0x00c6:
            g6.b r0 = r0.f15247c
            t5.p1 r1 = r0.f15239e
            byte[] r1 = r1.mo20541v()
            byte[] r1 = p267v7.C8212a.m16504k(r1)
            k6.b r3 = r14.f14689c
            t5.a r3 = r3.f15983b
            t5.a r4 = p116g6.C6887e.f15249a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f7
            r3 = r2
        L_0x00df:
            int r5 = r1.length
            int r5 = r5 / 2
            if (r3 >= r5) goto L_0x00f7
            byte r5 = r1[r3]
            int r6 = r1.length
            int r6 = r6 + -1
            int r6 = r6 - r3
            byte r6 = r1[r6]
            r1[r3] = r6
            int r6 = r1.length
            int r6 = r6 + -1
            int r6 = r6 - r3
            r1[r6] = r5
            int r3 = r3 + 1
            goto L_0x00df
        L_0x00f7:
            g6.a r3 = r0.f15237c
            p6.c$c r12 = new p6.c$c
            int r6 = r3.f15232b
            int r7 = r3.f15233c
            int r8 = r3.f15234d
            int r9 = r3.f15235e
            t5.m1 r3 = r0.f15238d
            java.math.BigInteger r10 = r3.mo20556s()
            java.math.BigInteger r11 = new java.math.BigInteger
            r3 = 1
            r11.<init>(r3, r1)
            r5 = r12
            r5.<init>((int) r6, (int) r7, (int) r8, (int) r9, (java.math.BigInteger) r10, (java.math.BigInteger) r11)
            t5.p1 r1 = r0.f15241g
            byte[] r1 = r1.mo20541v()
            byte[] r1 = p267v7.C8212a.m16504k(r1)
            k6.b r3 = r14.f14689c
            t5.a r3 = r3.f15983b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x013f
        L_0x0127:
            int r3 = r1.length
            int r3 = r3 / 2
            if (r2 >= r3) goto L_0x013f
            byte r3 = r1[r2]
            int r4 = r1.length
            int r4 = r4 + -1
            int r4 = r4 - r2
            byte r4 = r1[r4]
            r1[r2] = r4
            int r4 = r1.length
            int r4 = r4 + -1
            int r4 = r4 - r2
            r1[r4] = r3
            int r2 = r2 + 1
            goto L_0x0127
        L_0x013f:
            o6.d r9 = new o6.d
            p6.e r1 = androidx.preference.C3039b.m7172l(r12, r1)
            t5.m1 r0 = r0.f15240f
            java.math.BigInteger r0 = r0.mo20556s()
            r9.<init>(r12, r1, r0)
        L_0x014e:
            p6.c r0 = r9.f16910a
            java.security.spec.EllipticCurve r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r0)
            java.security.spec.ECParameterSpec r1 = new java.security.spec.ECParameterSpec
            p6.e r2 = r9.f16912c
            java.security.spec.ECPoint r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r2)
            java.math.BigInteger r3 = r9.f16913d
            java.math.BigInteger r4 = r9.f16914e
            int r4 = r4.intValue()
            r1.<init>(r0, r2, r3, r4)
            r13.f13317d = r1
        L_0x0169:
            t5.s1 r14 = r14.mo18832g()
            boolean r0 = r14 instanceof p244t5.C7999m1
            if (r0 == 0) goto L_0x017c
            t5.m1 r14 = p244t5.C7999m1.m16076q(r14)
            java.math.BigInteger r14 = r14.mo20556s()
            r13.f13316c = r14
            goto L_0x018c
        L_0x017c:
            e6.a r14 = p093e6.C6719a.m13110e(r14)
            java.math.BigInteger r0 = r14.mo18903g()
            r13.f13316c = r0
            t5.r r14 = r14.mo18904l()
            r13.f13318e = r14
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.<init>(d6.a):void");
    }

    public BCDSTU4145PrivateKey(String str, C7750c cVar) {
        C0326j.m867l();
        this.f13314a = str;
        cVar.getClass();
        this.f13316c = null;
        this.f13317d = null;
    }

    public BCDSTU4145PrivateKey(String str, C7750c cVar, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        C0326j.m867l();
        C7759g0 g0Var = cVar.f17170b;
        this.f13314a = str;
        C8012r rVar = null;
        this.f13316c = null;
        if (eCParameterSpec == null) {
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        }
        this.f13317d = eCParameterSpec;
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCDSTU4145PublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
        }
        this.f13318e = rVar;
    }

    public BCDSTU4145PrivateKey(String str, C7750c cVar, BCDSTU4145PublicKey bCDSTU4145PublicKey, C7623d dVar) {
        ECParameterSpec eCParameterSpec;
        C0326j.m867l();
        C7759g0 g0Var = cVar.f17170b;
        this.f13314a = str;
        C8012r rVar = null;
        this.f13316c = null;
        if (dVar == null) {
            C7676c cVar2 = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar2), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(dVar.f16910a), C6171d.m12347c(dVar.f16912c), dVar.f16913d, dVar.f16914e.intValue());
        }
        this.f13317d = eCParameterSpec;
        try {
            rVar = C7198a.m13862e(C8018s1.m16138m(bCDSTU4145PublicKey.getEncoded())).f15982c;
        } catch (IOException unused) {
        }
        this.f13318e = rVar;
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13316c = eCPrivateKeySpec.getS();
        this.f13317d = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(C7624e eVar) {
        C0326j.m867l();
        throw null;
    }
}
