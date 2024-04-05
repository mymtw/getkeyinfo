package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import androidx.preference.C3039b;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6150c;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import kotlinx.coroutines.C19543e0;
import p008a7.C0041a;
import p116g6.C6886d;
import p116g6.C6887e;
import p152j6.C7146d;
import p152j6.C7148f;
import p161k6.C7198a;
import p161k6.C7199b;
import p190n6.C7485a;
import p199o6.C7622c;
import p199o6.C7623d;
import p199o6.C7625f;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p223r5.C7752d;
import p223r5.C7759g0;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C8005o1;
import p267v7.C8212a;
import p628nj.C18263b;

public class BCDSTU4145PublicKey implements C6150c, ECPublicKey {

    /* renamed from: a */
    private String f13319a;

    /* renamed from: b */
    private boolean f13320b;

    /* renamed from: c */
    public transient C7752d f13321c;

    /* renamed from: d */
    public transient ECParameterSpec f13322d;

    /* renamed from: e */
    public transient C6886d f13323e;

    public BCDSTU4145PublicKey(String str, C7752d dVar) {
        this.f13319a = str;
        this.f13321c = dVar;
        this.f13322d = null;
    }

    public BCDSTU4145PublicKey(String str, C7752d dVar, ECParameterSpec eCParameterSpec) {
        this.f13319a = "DSTU4145";
        C7759g0 g0Var = dVar.f17170b;
        this.f13319a = str;
        this.f13321c = dVar;
        if (eCParameterSpec == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13322d = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
            return;
        }
        this.f13322d = eCParameterSpec;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f13319a = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f13322d = params;
        this.f13321c = new C7752d(C6171d.m12352h(params, eCPublicKeySpec.getW()), C6171d.m12354j((C0041a) null, this.f13322d));
    }

    public BCDSTU4145PublicKey(C7625f fVar, C0041a aVar) {
        this.f13319a = "DSTU4145";
        throw null;
    }

    /* renamed from: b */
    public static void m12304b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    /* renamed from: a */
    public C7623d mo17240a() {
        ECParameterSpec eCParameterSpec = this.f13322d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13320b);
    }

    /* renamed from: b */
    public byte[] mo17313b() {
        C6886d dVar = this.f13323e;
        if (dVar != null) {
            return C8212a.m16504k(dVar.f15248d);
        }
        return C8212a.m16504k(C6886d.f15245e);
    }

    /* renamed from: c */
    public C7686e mo17241c() {
        C7686e eVar = this.f13321c.f17178c;
        return this.f13322d == null ? eVar.mo20140s().mo20135n() : eVar;
    }

    /* renamed from: d */
    public C7752d mo17314d() {
        return this.f13321c;
    }

    /* renamed from: e */
    public C7623d mo17315e() {
        ECParameterSpec eCParameterSpec = this.f13322d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13320b) : ((C7485a) C6158a.f13286a).mo19824a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.f13321c.f17178c.mo20124e(bCDSTU4145PublicKey.f13321c.f17178c) && mo17315e().equals(bCDSTU4145PublicKey.mo17315e());
    }

    public String getAlgorithm() {
        return this.f13319a;
    }

    public byte[] getEncoded() {
        C8005o1 o1Var = this.f13323e;
        if (o1Var == null) {
            ECParameterSpec eCParameterSpec = this.f13322d;
            if (eCParameterSpec instanceof C7622c) {
                o1Var = new C6886d(new C7959a(((C7622c) this.f13322d).f16909a));
            } else {
                C7676c g = C6171d.m12351g(eCParameterSpec.getCurve());
                o1Var = new C7146d(new C7148f(g, C6171d.m12353i(g, this.f13322d.getGenerator()), this.f13322d.getOrder(), BigInteger.valueOf((long) this.f13322d.getCofactor()), this.f13322d.getCurve().getSeed()));
            }
        }
        C7686e s = this.f13321c.f17178c.mo20140s();
        s.mo20139r();
        C7681d dVar = s.f17049b;
        byte[] t = dVar.mo20111t();
        if (!dVar.mo20109r()) {
            if (C3039b.m7170k(s.mo20137p().mo20103l(dVar)).mo20108q()) {
                int length = t.length - 1;
                t[length] = (byte) (t[length] | 1);
            } else {
                int length2 = t.length - 1;
                t[length2] = (byte) (t[length2] & 254);
            }
        }
        try {
            return C18263b.m30852l(new C7198a(new C7199b(C6887e.f15250b, o1Var), (C8005o1) new C7964b0(t)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.f13322d;
    }

    public ECPoint getW() {
        return C6171d.m12347c(this.f13321c.f17178c);
    }

    public int hashCode() {
        return this.f13321c.f17178c.hashCode() ^ mo17315e().hashCode();
    }

    public String toString() {
        return C19543e0.m33326p(this.f13319a, this.f13321c.f17178c, mo17315e());
    }

    public BCDSTU4145PublicKey(String str, C7752d dVar, C7623d dVar2) {
        ECParameterSpec eCParameterSpec;
        this.f13319a = "DSTU4145";
        C7759g0 g0Var = dVar.f17170b;
        this.f13319a = str;
        if (dVar2 == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = C6171d.m12346b(C6171d.m12348d(dVar2.f16910a), dVar2);
        }
        this.f13322d = eCParameterSpec;
        this.f13321c = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: o6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: o6.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCDSTU4145PublicKey(p161k6.C7198a r15) {
        /*
            r14 = this;
            r14.<init>()
            java.lang.String r0 = "DSTU4145"
            r14.f13319a = r0
            t5.r r1 = r15.f15982c
            r14.f13319a = r0
            byte[] r0 = r1.mo20594s()     // Catch:{ IOException -> 0x0149 }
            t5.s1 r0 = p244t5.C8018s1.m16138m(r0)     // Catch:{ IOException -> 0x0149 }
            t5.p1 r0 = (p244t5.C8008p1) r0     // Catch:{ IOException -> 0x0149 }
            byte[] r0 = r0.mo20541v()
            k6.b r1 = r15.f15981b
            t5.a r1 = r1.f15983b
            t5.a r2 = p116g6.C6887e.f15249a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0028
            m12304b(r0)
        L_0x0028:
            k6.b r1 = r15.f15981b
            t5.h1 r1 = r1.f15984c
            t5.t1 r1 = p244t5.C8021t1.m16151s(r1)
            r3 = 0
            t5.h1 r3 = r1.mo20523q(r3)
            boolean r3 = r3 instanceof p244t5.C7999m1
            r4 = 0
            if (r3 == 0) goto L_0x0054
            j6.f r15 = p152j6.C7148f.m13817e(r1)
            o6.d r1 = new o6.d
            p6.c r6 = r15.f15872c
            p6.e r7 = r15.mo19445g()
            java.math.BigInteger r8 = r15.f15874e
            java.math.BigInteger r9 = r15.f15875f
            byte[] r10 = r15.mo19446l()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x00dd
        L_0x0054:
            g6.d r1 = p116g6.C6886d.m13340e(r1)
            r14.f13323e = r1
            boolean r1 = r1.mo19009g()
            if (r1 == 0) goto L_0x007e
            g6.d r15 = r14.f13323e
            t5.a r15 = r15.f15246b
            r5.g0 r1 = p116g6.C6885c.m13339a(r15)
            o6.b r2 = new o6.b
            java.lang.String r6 = r15.f17434b
            p6.c r7 = r1.f17188f
            p6.e r8 = r1.f17190h
            java.math.BigInteger r9 = r1.f17191i
            java.math.BigInteger r10 = r1.f17192j
            byte[] r11 = r1.mo20320b()
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = r2
            goto L_0x00dc
        L_0x007e:
            g6.d r1 = r14.f13323e
            g6.b r1 = r1.f15247c
            t5.p1 r3 = r1.f15239e
            byte[] r3 = r3.mo20541v()
            byte[] r3 = p267v7.C8212a.m16504k(r3)
            k6.b r5 = r15.f15981b
            t5.a r5 = r5.f15983b
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0099
            m12304b(r3)
        L_0x0099:
            g6.a r5 = r1.f15237c
            p6.c$c r13 = new p6.c$c
            int r7 = r5.f15232b
            int r8 = r5.f15233c
            int r9 = r5.f15234d
            int r10 = r5.f15235e
            t5.m1 r5 = r1.f15238d
            java.math.BigInteger r11 = r5.mo20556s()
            java.math.BigInteger r12 = new java.math.BigInteger
            r5 = 1
            r12.<init>(r5, r3)
            r6 = r13
            r6.<init>((int) r7, (int) r8, (int) r9, (int) r10, (java.math.BigInteger) r11, (java.math.BigInteger) r12)
            t5.p1 r3 = r1.f15241g
            byte[] r3 = r3.mo20541v()
            byte[] r3 = p267v7.C8212a.m16504k(r3)
            k6.b r15 = r15.f15981b
            t5.a r15 = r15.f15983b
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00cc
            m12304b(r3)
        L_0x00cc:
            o6.d r15 = new o6.d
            p6.e r2 = androidx.preference.C3039b.m7172l(r13, r3)
            t5.m1 r1 = r1.f15240f
            java.math.BigInteger r1 = r1.mo20556s()
            r15.<init>(r13, r2, r1)
            r1 = r15
        L_0x00dc:
            r15 = r4
        L_0x00dd:
            p6.c r2 = r1.f16910a
            java.security.spec.EllipticCurve r7 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r2)
            g6.d r3 = r14.f13323e
            if (r3 == 0) goto L_0x011a
            boolean r15 = r3.mo19009g()
            if (r15 == 0) goto L_0x0104
            o6.c r15 = new o6.c
            g6.d r3 = r14.f13323e
            t5.a r3 = r3.f15246b
            java.lang.String r6 = r3.f17434b
            p6.e r3 = r1.f16912c
            java.security.spec.ECPoint r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r3)
            java.math.BigInteger r9 = r1.f16913d
            java.math.BigInteger r10 = r1.f16914e
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0117
        L_0x0104:
            java.security.spec.ECParameterSpec r15 = new java.security.spec.ECParameterSpec
            p6.e r3 = r1.f16912c
            java.security.spec.ECPoint r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r3)
            java.math.BigInteger r5 = r1.f16913d
            java.math.BigInteger r1 = r1.f16914e
            int r1 = r1.intValue()
            r15.<init>(r7, r3, r5, r1)
        L_0x0117:
            r14.f13322d = r15
            goto L_0x0137
        L_0x011a:
            java.security.spec.ECParameterSpec r1 = new java.security.spec.ECParameterSpec
            p6.c r3 = r15.f15872c
            java.security.spec.EllipticCurve r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12348d(r3)
            p6.e r5 = r15.mo19445g()
            java.security.spec.ECPoint r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12347c(r5)
            java.math.BigInteger r6 = r15.f15874e
            java.math.BigInteger r15 = r15.f15875f
            int r15 = r15.intValue()
            r1.<init>(r3, r5, r6, r15)
            r14.f13322d = r1
        L_0x0137:
            r5.d r15 = new r5.d
            p6.e r0 = androidx.preference.C3039b.m7172l(r2, r0)
            java.security.spec.ECParameterSpec r1 = r14.f13322d
            r5.g0 r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12354j(r4, r1)
            r15.<init>(r0, r1)
            r14.f13321c = r15
            return
        L_0x0149:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey.<init>(k6.a):void");
    }
}
