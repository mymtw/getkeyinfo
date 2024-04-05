package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p055dh;

import androidx.appcompat.widget.C0326j;
import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import p081d6.C6662a;
import p081d6.C6664c;
import p081d6.C6665d;
import p152j6.C7120a;
import p152j6.C7121b;
import p152j6.C7153k;
import p161k6.C7199b;
import p180m6.C7338b;
import p223r5.C7749b0;
import p223r5.C7778y;
import p223r5.C7779z;
import p244t5.C7999m1;
import p244t5.C8027v1;
import p267v7.C8212a;
import p267v7.C8217e;
import p294y6.C8396a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey */
public class BCDHPrivateKey implements C7338b, DHPrivateKey {

    /* renamed from: a */
    private BigInteger f13299a;

    /* renamed from: b */
    public transient DHParameterSpec f13300b;

    /* renamed from: c */
    public transient C6662a f13301c;

    /* renamed from: d */
    public transient C7779z f13302d;

    public BCDHPrivateKey() {
        C0326j.m867l();
    }

    /* renamed from: a */
    public C7779z mo17268a() {
        C7779z zVar = this.f13302d;
        if (zVar != null) {
            return zVar;
        }
        DHParameterSpec dHParameterSpec = this.f13300b;
        if (dHParameterSpec instanceof C8396a) {
            return new C7779z(this.f13299a, ((C8396a) dHParameterSpec).mo20974a());
        }
        return new C7779z(this.f13299a, new C7778y(this.f13300b.getL(), dHParameterSpec.getP(), this.f13300b.getG()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        C6662a aVar;
        C7121b bVar;
        try {
            C6662a aVar2 = this.f13301c;
            if (aVar2 != null) {
                return aVar2.mo20561a("DER");
            }
            DHParameterSpec dHParameterSpec = this.f13300b;
            if (!(dHParameterSpec instanceof C8396a) || ((C8396a) dHParameterSpec).f18407a == null) {
                aVar = new C6662a(new C7199b(C6665d.f14700q0, new C6664c(dHParameterSpec.getP(), this.f13300b.getG(), this.f13300b.getL()).mo12996i()), new C7999m1(getX()), (C8027v1) null, (byte[]) null);
            } else {
                C7778y a = ((C8396a) dHParameterSpec).mo20974a();
                C7749b0 b0Var = a.f17213g;
                if (b0Var != null) {
                    bVar = new C7121b(b0Var.f17176b, C8212a.m16504k(b0Var.f17175a));
                } else {
                    bVar = null;
                }
                aVar = new C6662a(new C7199b(C7153k.f15910a1, new C7120a(a.f17208b, a.f17207a, a.f17209c, a.f17210d, bVar).mo12996i()), new C7999m1(getX()), (C8027v1) null, (byte[]) null);
            }
            return aVar.mo20561a("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        return this.f13300b;
    }

    public BigInteger getX() {
        return this.f13299a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        BigInteger bigInteger = this.f13299a;
        C7778y yVar = new C7778y(this.f13300b.getP(), this.f13300b.getG());
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        BigInteger modPow = yVar.f17207a.modPow(bigInteger, yVar.f17208b);
        stringBuffer.append("DH");
        stringBuffer.append(" Private Key [");
        stringBuffer.append(C15588c1.m25333l(modPow, yVar));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("              Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.math.BigInteger} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: d6.c} */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.math.BigInteger] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCDHPrivateKey(p081d6.C6662a r11) {
        /*
            r10 = this;
            r10.<init>()
            androidx.appcompat.widget.C0326j.m867l()
            k6.b r0 = r11.f14689c
            t5.h1 r0 = r0.f15984c
            t5.t1 r0 = p244t5.C8021t1.m16151s(r0)
            t5.s1 r1 = r11.mo18832g()
            t5.m1 r1 = (p244t5.C7999m1) r1
            k6.b r2 = r11.f14689c
            t5.a r2 = r2.f15983b
            r10.f13301c = r11
            java.math.BigInteger r11 = r1.mo20556s()
            r10.f13299a = r11
            t5.a r11 = p081d6.C6665d.f14700q0
            boolean r11 = r2.equals(r11)
            r1 = 0
            if (r11 == 0) goto L_0x009d
            boolean r11 = r0 instanceof p081d6.C6664c
            if (r11 == 0) goto L_0x0031
            r1 = r0
            d6.c r1 = (p081d6.C6664c) r1
            goto L_0x003c
        L_0x0031:
            if (r0 == 0) goto L_0x003c
            d6.c r1 = new d6.c
            t5.t1 r11 = p244t5.C8021t1.m16151s(r0)
            r1.<init>(r11)
        L_0x003c:
            java.math.BigInteger r11 = r1.mo18835m()
            if (r11 == 0) goto L_0x0077
            javax.crypto.spec.DHParameterSpec r11 = new javax.crypto.spec.DHParameterSpec
            java.math.BigInteger r0 = r1.mo18833g()
            java.math.BigInteger r2 = r1.mo18834l()
            java.math.BigInteger r3 = r1.mo18835m()
            int r3 = r3.intValue()
            r11.<init>(r0, r2, r3)
            r10.f13300b = r11
            r5.z r11 = new r5.z
            java.math.BigInteger r0 = r10.f13299a
            r5.y r2 = new r5.y
            java.math.BigInteger r3 = r1.mo18833g()
            java.math.BigInteger r4 = r1.mo18834l()
            java.math.BigInteger r1 = r1.mo18835m()
            int r1 = r1.intValue()
            r2.<init>(r1, r3, r4)
            r11.<init>(r0, r2)
            goto L_0x010b
        L_0x0077:
            javax.crypto.spec.DHParameterSpec r11 = new javax.crypto.spec.DHParameterSpec
            java.math.BigInteger r0 = r1.mo18833g()
            java.math.BigInteger r2 = r1.mo18834l()
            r11.<init>(r0, r2)
            r10.f13300b = r11
            r5.z r11 = new r5.z
            java.math.BigInteger r0 = r10.f13299a
            r5.y r2 = new r5.y
            java.math.BigInteger r3 = r1.mo18833g()
            java.math.BigInteger r1 = r1.mo18834l()
            r4 = 0
            r2.<init>(r4, r3, r1)
            r11.<init>(r0, r2)
            goto L_0x010b
        L_0x009d:
            t5.a r11 = p152j6.C7153k.f15910a1
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L_0x010e
            boolean r11 = r0 instanceof p152j6.C7120a
            if (r11 == 0) goto L_0x00ac
            j6.a r0 = (p152j6.C7120a) r0
            goto L_0x00ba
        L_0x00ac:
            if (r0 == 0) goto L_0x00b9
            j6.a r11 = new j6.a
            t5.t1 r0 = p244t5.C8021t1.m16151s(r0)
            r11.<init>(r0)
            r0 = r11
            goto L_0x00ba
        L_0x00b9:
            r0 = r1
        L_0x00ba:
            y6.a r11 = new y6.a
            t5.m1 r2 = r0.f15833b
            java.math.BigInteger r5 = r2.mo20558v()
            t5.m1 r2 = r0.f15835d
            java.math.BigInteger r6 = r2.mo20558v()
            t5.m1 r2 = r0.f15834c
            java.math.BigInteger r7 = r2.mo20558v()
            t5.m1 r2 = r0.f15836e
            if (r2 != 0) goto L_0x00d4
            r8 = r1
            goto L_0x00d9
        L_0x00d4:
            java.math.BigInteger r2 = r2.mo20558v()
            r8 = r2
        L_0x00d9:
            r4 = 0
            r3 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.f13300b = r11
            r5.z r11 = new r5.z
            java.math.BigInteger r2 = r10.f13299a
            r5.y r9 = new r5.y
            t5.m1 r3 = r0.f15833b
            java.math.BigInteger r4 = r3.mo20558v()
            t5.m1 r3 = r0.f15834c
            java.math.BigInteger r5 = r3.mo20558v()
            t5.m1 r3 = r0.f15835d
            java.math.BigInteger r6 = r3.mo20558v()
            t5.m1 r0 = r0.f15836e
            if (r0 != 0) goto L_0x00fe
            goto L_0x0102
        L_0x00fe:
            java.math.BigInteger r1 = r0.mo20558v()
        L_0x0102:
            r7 = r1
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r11.<init>(r2, r9)
        L_0x010b:
            r10.f13302d = r11
            return
        L_0x010e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown algorithm type: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p055dh.BCDHPrivateKey.<init>(d6.a):void");
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        new Hashtable();
        new Vector();
        this.f13299a = dHPrivateKey.getX();
        this.f13300b = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        new Hashtable();
        new Vector();
        this.f13299a = dHPrivateKeySpec.getX();
        this.f13300b = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(C7779z zVar) {
        C0326j.m867l();
        this.f13299a = zVar.f17214c;
        this.f13300b = new C8396a(zVar.f17206b);
    }
}
