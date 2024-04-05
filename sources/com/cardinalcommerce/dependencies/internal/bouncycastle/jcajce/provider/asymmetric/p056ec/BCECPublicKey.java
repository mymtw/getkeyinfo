package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p056ec;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p051a.C6150c;
import com.google.android.play.core.assetpacks.C15588c1;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import kotlinx.coroutines.C19543e0;
import p008a7.C0041a;
import p152j6.C7150h;
import p152j6.C7153k;
import p161k6.C7198a;
import p161k6.C7199b;
import p190n6.C7485a;
import p199o6.C7623d;
import p199o6.C7625f;
import p209p6.C7676c;
import p209p6.C7686e;
import p223r5.C7752d;
import p223r5.C7759g0;
import p244t5.C8008p1;
import p628nj.C18263b;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey */
public class BCECPublicKey implements C6150c, ECPublicKey {

    /* renamed from: a */
    private String f13330a;

    /* renamed from: b */
    private boolean f13331b;

    /* renamed from: c */
    public transient C7752d f13332c;

    /* renamed from: d */
    public transient ECParameterSpec f13333d;

    /* renamed from: e */
    public transient C0041a f13334e;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, C0041a aVar) {
        this.f13330a = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f13333d = params;
        this.f13332c = new C7752d(C6171d.m12352h(params, eCPublicKeySpec.getW()), C6171d.m12354j(aVar, eCPublicKeySpec.getParams()));
        this.f13334e = aVar;
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [r5.g0] */
    /* JADX WARNING: type inference failed for: r11v12, types: [t5.s1] */
    /* JADX WARNING: type inference failed for: r1v14, types: [r5.g0] */
    /* JADX WARNING: type inference failed for: r1v15, types: [r5.g0] */
    /* JADX WARNING: type inference failed for: r2v6, types: [r5.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCECPublicKey(java.lang.String r10, p161k6.C7198a r11, p008a7.C0041a r12) {
        /*
            r9 = this;
            r9.<init>()
            r9.f13330a = r10
            r9.f13334e = r12
            k6.b r10 = r11.f15981b
            t5.h1 r10 = r10.f15984c
            j6.d r10 = p152j6.C7146d.m13814e(r10)
            a7.a r12 = r9.f13334e
            p6.c r12 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12350f(r12, r10)
            java.security.spec.ECParameterSpec r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12345a(r10, r12)
            r9.f13333d = r0
            t5.r r11 = r11.f15982c
            byte[] r11 = r11.mo20594s()
            t5.b0 r0 = new t5.b0
            r0.<init>((byte[]) r11)
            r1 = 0
            byte r1 = r11[r1]
            r2 = 4
            if (r1 != r2) goto L_0x0057
            r1 = 1
            byte r1 = r11[r1]
            int r2 = r11.length
            r3 = 2
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x0057
            byte r1 = r11[r3]
            r2 = 3
            if (r1 == r3) goto L_0x003b
            if (r1 != r2) goto L_0x0057
        L_0x003b:
            int r1 = r12.mo20072a()
            int r1 = r1 + 7
            int r1 = r1 / 8
            int r3 = r11.length
            int r3 = r3 - r2
            if (r1 < r3) goto L_0x0057
            t5.s1 r11 = p244t5.C8018s1.m16138m(r11)     // Catch:{ IOException -> 0x004f }
            r0 = r11
            t5.p1 r0 = (p244t5.C8008p1) r0     // Catch:{ IOException -> 0x004f }
            goto L_0x0057
        L_0x004f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "error recovering public key"
            r10.<init>(r11)
            throw r10
        L_0x0057:
            j6.h r11 = new j6.h
            r11.<init>((p209p6.C7676c) r12, (p244t5.C8008p1) r0)
            r5.d r12 = new r5.d
            monitor-enter(r11)
            p6.e r0 = r11.f15880d     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0073
            p6.c r0 = r11.f15879c     // Catch:{ all -> 0x00e4 }
            t5.b0 r1 = r11.f15878b     // Catch:{ all -> 0x00e4 }
            byte[] r1 = r1.f17499b     // Catch:{ all -> 0x00e4 }
            p6.e r0 = r0.mo20082i(r1)     // Catch:{ all -> 0x00e4 }
            p6.e r0 = r0.mo20140s()     // Catch:{ all -> 0x00e4 }
            r11.f15880d = r0     // Catch:{ all -> 0x00e4 }
        L_0x0073:
            p6.e r0 = r11.f15880d     // Catch:{ all -> 0x00e4 }
            monitor-exit(r11)
            a7.a r11 = r9.f13334e
            t5.s1 r10 = r10.f15866b
            boolean r1 = r10 instanceof p244t5.C7959a
            if (r1 == 0) goto L_0x00ab
            t5.a r3 = p244t5.C7959a.m15938q(r10)
            j6.f r10 = kotlinx.coroutines.C19543e0.m33321m(r3)
            if (r10 != 0) goto L_0x0096
            n6.a r11 = (p190n6.C7485a) r11
            java.util.HashMap r10 = r11.f16687c
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r10)
            java.lang.Object r10 = r10.get(r3)
            j6.f r10 = (p152j6.C7148f) r10
        L_0x0096:
            r5.b r11 = new r5.b
            p6.c r4 = r10.f15872c
            p6.e r5 = r10.mo19445g()
            java.math.BigInteger r6 = r10.f15874e
            java.math.BigInteger r7 = r10.f15875f
            byte[] r8 = r10.mo19446l()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00de
        L_0x00ab:
            boolean r1 = r10 instanceof p244t5.C8002n1
            if (r1 == 0) goto L_0x00c6
            n6.a r11 = (p190n6.C7485a) r11
            o6.d r10 = r11.mo19824a()
            r5.g0 r11 = new r5.g0
            p6.c r2 = r10.f16910a
            p6.e r3 = r10.f16912c
            java.math.BigInteger r4 = r10.f16913d
            java.math.BigInteger r5 = r10.f16914e
            byte[] r6 = r10.f16911b
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00de
        L_0x00c6:
            j6.f r10 = p152j6.C7148f.m13817e(r10)
            r5.g0 r11 = new r5.g0
            p6.c r2 = r10.f15872c
            p6.e r3 = r10.mo19445g()
            java.math.BigInteger r4 = r10.f15874e
            java.math.BigInteger r5 = r10.f15875f
            byte[] r6 = r10.mo19446l()
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x00de:
            r12.<init>(r0, r11)
            r9.f13332c = r12
            return
        L_0x00e4:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p056ec.BCECPublicKey.<init>(java.lang.String, k6.a, a7.a):void");
    }

    public BCECPublicKey(String str, C7625f fVar, C0041a aVar) {
        this.f13330a = str;
        throw null;
    }

    public BCECPublicKey(String str, C7752d dVar, C0041a aVar) {
        this.f13330a = str;
        this.f13332c = dVar;
        this.f13333d = null;
        this.f13334e = aVar;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, C0041a aVar) {
        this.f13330a = "EC";
        this.f13330a = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f13333d = params;
        this.f13332c = new C7752d(C6171d.m12352h(params, eCPublicKey.getW()), C6171d.m12354j(aVar, eCPublicKey.getParams()));
    }

    /* renamed from: a */
    public C7623d mo17240a() {
        ECParameterSpec eCParameterSpec = this.f13333d;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6171d.m12349e(eCParameterSpec, this.f13331b);
    }

    /* renamed from: b */
    public C7752d mo17333b() {
        return this.f13332c;
    }

    /* renamed from: c */
    public C7686e mo17241c() {
        C7686e eVar = this.f13332c.f17178c;
        return this.f13333d == null ? eVar.mo20140s().mo20135n() : eVar;
    }

    /* renamed from: d */
    public C7623d mo17334d() {
        ECParameterSpec eCParameterSpec = this.f13333d;
        return eCParameterSpec != null ? C6171d.m12349e(eCParameterSpec, this.f13331b) : ((C7485a) this.f13334e).mo19824a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.f13332c.f17178c.mo20124e(bCECPublicKey.f13332c.f17178c) && mo17334d().equals(bCECPublicKey.mo17334d());
    }

    public String getAlgorithm() {
        return this.f13330a;
    }

    public byte[] getEncoded() {
        return C18263b.m30852l(new C7198a(new C7199b(C7153k.f15885B0, C15588c1.m25330j(this.f13333d, this.f13331b)), C8008p1.m16103q(new C7150h(this.f13332c.f17178c, this.f13331b).f15878b).mo20541v()));
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.f13333d;
    }

    public ECPoint getW() {
        return C6171d.m12347c(this.f13332c.f17178c);
    }

    public int hashCode() {
        return this.f13332c.f17178c.hashCode() ^ mo17334d().hashCode();
    }

    public String toString() {
        return C19543e0.m33326p("EC", this.f13332c.f17178c, mo17334d());
    }

    public BCECPublicKey(String str, C7752d dVar, ECParameterSpec eCParameterSpec, C0041a aVar) {
        this.f13330a = "EC";
        C7759g0 g0Var = dVar.f17170b;
        this.f13330a = str;
        this.f13332c = dVar;
        if (eCParameterSpec == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            this.f13333d = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            this.f13333d = eCParameterSpec;
        }
        this.f13334e = aVar;
    }

    public BCECPublicKey(String str, C7752d dVar, C7623d dVar2, C0041a aVar) {
        ECParameterSpec eCParameterSpec;
        this.f13330a = "EC";
        C7759g0 g0Var = dVar.f17170b;
        this.f13330a = str;
        if (dVar2 == null) {
            C7676c cVar = g0Var.f17188f;
            g0Var.mo20320b();
            eCParameterSpec = new ECParameterSpec(C6171d.m12348d(cVar), C6171d.m12347c(g0Var.f17190h), g0Var.f17191i, g0Var.f17192j.intValue());
        } else {
            eCParameterSpec = C6171d.m12346b(C6171d.m12348d(dVar2.f16910a), dVar2);
        }
        this.f13333d = eCParameterSpec;
        this.f13332c = dVar;
        this.f13334e = aVar;
    }
}
