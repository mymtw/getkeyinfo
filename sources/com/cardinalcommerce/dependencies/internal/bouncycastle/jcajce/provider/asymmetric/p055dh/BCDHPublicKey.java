package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p055dh;

import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import p081d6.C6664c;
import p081d6.C6665d;
import p152j6.C7120a;
import p152j6.C7121b;
import p152j6.C7153k;
import p161k6.C7198a;
import p161k6.C7199b;
import p223r5.C7747a0;
import p223r5.C7749b0;
import p223r5.C7778y;
import p244t5.C7999m1;
import p267v7.C8212a;
import p267v7.C8217e;
import p294y6.C8396a;
import p628nj.C18263b;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey */
public class BCDHPublicKey implements DHPublicKey {

    /* renamed from: a */
    private BigInteger f13303a;

    /* renamed from: b */
    public transient C7747a0 f13304b;

    /* renamed from: c */
    public transient DHParameterSpec f13305c;

    /* renamed from: d */
    public transient C7198a f13306d;

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f13303a = bigInteger;
        this.f13305c = dHParameterSpec;
        this.f13304b = dHParameterSpec instanceof C8396a ? new C7747a0(bigInteger, ((C8396a) dHParameterSpec).mo20974a()) : new C7747a0(bigInteger, new C7778y(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f13303a = dHPublicKey.getY();
        this.f13305c = dHPublicKey.getParams();
        this.f13304b = new C7747a0(this.f13303a, new C7778y(this.f13305c.getP(), this.f13305c.getG()));
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13303a = dHPublicKeySpec.getY();
        this.f13305c = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.f13304b = new C7747a0(this.f13303a, new C7778y(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.math.BigInteger} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.math.BigInteger} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: d6.c} */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.math.BigInteger] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.math.BigInteger] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (p244t5.C7999m1.m16076q(r0.mo20523q(2)).mo20556s().compareTo(java.math.BigInteger.valueOf((long) p244t5.C7999m1.m16076q(r0.mo20523q(0)).mo20556s().bitLength())) > 0) goto L_0x005f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCDHPublicKey(p161k6.C7198a r12) {
        /*
            r11 = this;
            r11.<init>()
            r11.f13306d = r12
            t5.s1 r0 = r12.mo19494g()     // Catch:{ IOException -> 0x016a }
            t5.m1 r0 = (p244t5.C7999m1) r0     // Catch:{ IOException -> 0x016a }
            java.math.BigInteger r0 = r0.mo20556s()
            r11.f13303a = r0
            k6.b r0 = r12.f15981b
            t5.h1 r0 = r0.f15984c
            t5.t1 r0 = p244t5.C8021t1.m16151s(r0)
            k6.b r12 = r12.f15981b
            t5.a r12 = r12.f15983b
            t5.a r1 = p081d6.C6665d.f14700q0
            boolean r1 = r12.equals(r1)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0111
            int r1 = r0.mo20525y()
            r4 = 1
            r5 = 2
            if (r1 != r5) goto L_0x0030
            goto L_0x0060
        L_0x0030:
            int r1 = r0.mo20525y()
            r6 = 3
            if (r1 <= r6) goto L_0x0038
            goto L_0x005f
        L_0x0038:
            t5.h1 r1 = r0.mo20523q(r5)
            t5.m1 r1 = p244t5.C7999m1.m16076q(r1)
            t5.h1 r5 = r0.mo20523q(r2)
            t5.m1 r5 = p244t5.C7999m1.m16076q(r5)
            java.math.BigInteger r1 = r1.mo20556s()
            java.math.BigInteger r5 = r5.mo20556s()
            int r5 = r5.bitLength()
            long r5 = (long) r5
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            int r1 = r1.compareTo(r5)
            if (r1 <= 0) goto L_0x0060
        L_0x005f:
            r4 = r2
        L_0x0060:
            if (r4 == 0) goto L_0x0064
            goto L_0x0111
        L_0x0064:
            t5.a r1 = p152j6.C7153k.f15910a1
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L_0x00fa
            boolean r12 = r0 instanceof p152j6.C7120a
            if (r12 == 0) goto L_0x0073
            j6.a r0 = (p152j6.C7120a) r0
            goto L_0x007d
        L_0x0073:
            j6.a r12 = new j6.a
            t5.t1 r0 = p244t5.C8021t1.m16151s(r0)
            r12.<init>(r0)
            r0 = r12
        L_0x007d:
            j6.b r12 = r0.f15837f
            if (r12 == 0) goto L_0x00c2
            r5.a0 r1 = new r5.a0
            java.math.BigInteger r2 = r11.f13303a
            r5.y r10 = new r5.y
            t5.m1 r4 = r0.f15833b
            java.math.BigInteger r5 = r4.mo20558v()
            t5.m1 r4 = r0.f15834c
            java.math.BigInteger r6 = r4.mo20558v()
            t5.m1 r4 = r0.f15835d
            java.math.BigInteger r7 = r4.mo20558v()
            t5.m1 r0 = r0.f15836e
            if (r0 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            java.math.BigInteger r3 = r0.mo20558v()
        L_0x00a2:
            r8 = r3
            r5.b0 r9 = new r5.b0
            t5.r r0 = r12.f15838b
            byte[] r0 = r0.mo20594s()
            t5.m1 r12 = r12.f15839c
            java.math.BigInteger r12 = r12.mo20558v()
            int r12 = r12.intValue()
            r9.<init>(r12, r0)
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r1.<init>(r2, r10)
            r11.f13304b = r1
            goto L_0x00ee
        L_0x00c2:
            r5.a0 r12 = new r5.a0
            java.math.BigInteger r1 = r11.f13303a
            r5.y r2 = new r5.y
            t5.m1 r4 = r0.f15833b
            java.math.BigInteger r5 = r4.mo20558v()
            t5.m1 r4 = r0.f15834c
            java.math.BigInteger r6 = r4.mo20558v()
            t5.m1 r4 = r0.f15835d
            java.math.BigInteger r7 = r4.mo20558v()
            t5.m1 r0 = r0.f15836e
            if (r0 != 0) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            java.math.BigInteger r3 = r0.mo20558v()
        L_0x00e3:
            r8 = r3
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r12.<init>(r1, r2)
            r11.f13304b = r12
        L_0x00ee:
            y6.a r12 = new y6.a
            r5.a0 r0 = r11.f13304b
            r5.y r0 = r0.f17206b
            r12.<init>(r0)
            r11.f13305c = r12
            goto L_0x0169
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown algorithm type: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x0111:
            boolean r12 = r0 instanceof p081d6.C6664c
            if (r12 == 0) goto L_0x0119
            r3 = r0
            d6.c r3 = (p081d6.C6664c) r3
            goto L_0x0124
        L_0x0119:
            if (r0 == 0) goto L_0x0124
            d6.c r3 = new d6.c
            t5.t1 r12 = p244t5.C8021t1.m16151s(r0)
            r3.<init>(r12)
        L_0x0124:
            java.math.BigInteger r12 = r3.mo18835m()
            if (r12 == 0) goto L_0x0140
            javax.crypto.spec.DHParameterSpec r12 = new javax.crypto.spec.DHParameterSpec
            java.math.BigInteger r0 = r3.mo18833g()
            java.math.BigInteger r1 = r3.mo18834l()
            java.math.BigInteger r3 = r3.mo18835m()
            int r3 = r3.intValue()
            r12.<init>(r0, r1, r3)
            goto L_0x014d
        L_0x0140:
            javax.crypto.spec.DHParameterSpec r12 = new javax.crypto.spec.DHParameterSpec
            java.math.BigInteger r0 = r3.mo18833g()
            java.math.BigInteger r1 = r3.mo18834l()
            r12.<init>(r0, r1)
        L_0x014d:
            r11.f13305c = r12
            r5.a0 r12 = new r5.a0
            java.math.BigInteger r0 = r11.f13303a
            r5.y r1 = new r5.y
            javax.crypto.spec.DHParameterSpec r3 = r11.f13305c
            java.math.BigInteger r3 = r3.getP()
            javax.crypto.spec.DHParameterSpec r4 = r11.f13305c
            java.math.BigInteger r4 = r4.getG()
            r1.<init>(r2, r3, r4)
            r12.<init>(r0, r1)
            r11.f13304b = r12
        L_0x0169:
            return
        L_0x016a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid info structure in DH public key"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p055dh.BCDHPublicKey.<init>(k6.a):void");
    }

    /* renamed from: a */
    public C7747a0 mo17277a() {
        return this.f13304b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        C7199b bVar;
        C7999m1 m1Var;
        C7198a aVar = this.f13306d;
        if (aVar != null) {
            return C18263b.m30852l(aVar);
        }
        DHParameterSpec dHParameterSpec = this.f13305c;
        if (dHParameterSpec instanceof C8396a) {
            C8396a aVar2 = (C8396a) dHParameterSpec;
            if (aVar2.f18407a != null) {
                C7778y a = aVar2.mo20974a();
                C7749b0 b0Var = a.f17213g;
                C7121b bVar2 = null;
                if (b0Var != null) {
                    bVar2 = new C7121b(b0Var.f17176b, C8212a.m16504k(b0Var.f17175a));
                }
                bVar = new C7199b(C7153k.f15910a1, new C7120a(a.f17208b, a.f17207a, a.f17209c, a.f17210d, bVar2).mo12996i());
                m1Var = new C7999m1(this.f13303a);
                return C18263b.m30854m(bVar, m1Var);
            }
        }
        bVar = new C7199b(C6665d.f14700q0, new C6664c(dHParameterSpec.getP(), this.f13305c.getG(), this.f13305c.getL()).mo12996i());
        m1Var = new C7999m1(this.f13303a);
        return C18263b.m30854m(bVar, m1Var);
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        return this.f13305c;
    }

    public BigInteger getY() {
        return this.f13303a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        BigInteger bigInteger = this.f13303a;
        C7778y yVar = new C7778y(this.f13305c.getP(), this.f13305c.getG());
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("DH");
        stringBuffer.append(" Public Key [");
        stringBuffer.append(C15588c1.m25333l(bigInteger, yVar));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCDHPublicKey(C7747a0 a0Var) {
        this.f13303a = a0Var.f17173c;
        this.f13305c = new C8396a(a0Var.f17206b);
        this.f13304b = a0Var;
    }
}
