package p152j6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7686e;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8212a;
import p275w6.C8252a;
import p275w6.C8256e;

/* renamed from: j6.f */
public final class C7148f extends C8005o1 implements C7153k {

    /* renamed from: h */
    public static final BigInteger f15870h = BigInteger.valueOf(1);

    /* renamed from: b */
    public C7152j f15871b;

    /* renamed from: c */
    public C7676c f15872c;

    /* renamed from: d */
    public C7150h f15873d;

    /* renamed from: e */
    public BigInteger f15874e;

    /* renamed from: f */
    public BigInteger f15875f;

    /* renamed from: g */
    public byte[] f15876g;

    public C7148f(C7676c.C7680d dVar, C7150h hVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this((C7676c) dVar, hVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public C7148f(C7676c cVar, C7150h hVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        C7152j jVar;
        int[] iArr;
        this.f15872c = cVar;
        this.f15873d = hVar;
        this.f15874e = bigInteger;
        this.f15875f = bigInteger2;
        this.f15876g = C8212a.m16504k(bArr);
        if (cVar.f17023a.mo20858b() == 1) {
            jVar = new C7152j(cVar.f17023a.mo20857a());
        } else {
            C8252a aVar = cVar.f17023a;
            if (aVar.mo20858b() > 1 && aVar.mo20857a().equals(C7675b.f17020c) && (aVar instanceof C8256e)) {
                int[] iArr2 = ((C8256e) cVar.f17023a).mo20861c().f18089a;
                if (iArr2 == null) {
                    iArr = null;
                } else {
                    int[] iArr3 = new int[iArr2.length];
                    System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                    iArr = iArr3;
                }
                if (iArr.length == 3) {
                    jVar = new C7152j(iArr[2], iArr[1], 0, 0);
                } else if (iArr.length == 5) {
                    jVar = new C7152j(iArr[4], iArr[1], iArr[2], iArr[3]);
                } else {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
            } else {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
        }
        this.f15871b = jVar;
    }

    /* renamed from: e */
    public static C7148f m13817e(C8018s1 s1Var) {
        if (s1Var instanceof C7148f) {
            return (C7148f) s1Var;
        }
        if (s1Var != null) {
            return new C7148f(C8021t1.m16151s(s1Var));
        }
        return null;
    }

    /* renamed from: g */
    public final C7686e mo19445g() {
        C7686e eVar;
        C7150h hVar = this.f15873d;
        synchronized (hVar) {
            if (hVar.f15880d == null) {
                hVar.f15880d = hVar.f15879c.mo20082i(hVar.f15878b.f17499b).mo20140s();
            }
            eVar = hVar.f15880d;
        }
        return eVar;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(f15870h));
        iVar.mo55343b(this.f15871b);
        iVar.mo55343b(new C7147e(this.f15872c, this.f15876g));
        iVar.mo55343b(this.f15873d);
        iVar.mo55343b(new C7999m1(this.f15874e));
        BigInteger bigInteger = this.f15875f;
        if (bigInteger != null) {
            iVar.mo55343b(new C7999m1(bigInteger));
        }
        return new C7976f0(iVar);
    }

    /* renamed from: l */
    public final byte[] mo19446l() {
        return C8212a.m16504k(this.f15876g);
    }

    public C7148f(C7676c cVar, C7686e eVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(cVar, new C7150h(eVar, false), bigInteger, bigInteger2, bArr);
    }

    public C7148f(C8021t1 t1Var) {
        if (!(t1Var.mo20523q(0) instanceof C7999m1) || !((C7999m1) t1Var.mo20523q(0)).mo20556s().equals(f15870h)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f15874e = ((C7999m1) t1Var.mo20523q(4)).mo20556s();
        if (t1Var.mo20525y() == 6) {
            this.f15875f = ((C7999m1) t1Var.mo20523q(5)).mo20556s();
        }
        C7984h1 q = t1Var.mo20523q(1);
        C7147e eVar = new C7147e(q instanceof C7152j ? (C7152j) q : q != null ? new C7152j(C8021t1.m16151s(q)) : null, this.f15874e, this.f15875f, C8021t1.m16151s(t1Var.mo20523q(2)));
        this.f15872c = eVar.f15867b;
        C7984h1 q2 = t1Var.mo20523q(3);
        if (q2 instanceof C7150h) {
            this.f15873d = (C7150h) q2;
        } else {
            this.f15873d = new C7150h(this.f15872c, (C8008p1) q2);
        }
        this.f15876g = C8212a.m16504k(eVar.f15868c);
    }
}
