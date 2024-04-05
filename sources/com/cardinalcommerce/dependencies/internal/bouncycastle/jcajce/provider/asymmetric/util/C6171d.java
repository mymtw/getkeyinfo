package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
import com.etsy.android.lib.models.editable.EditableListing;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C19543e0;
import p008a7.C0041a;
import p152j6.C7146d;
import p152j6.C7148f;
import p190n6.C7485a;
import p199o6.C7621b;
import p199o6.C7622c;
import p199o6.C7623d;
import p209p6.C7676c;
import p209p6.C7686e;
import p223r5.C7759g0;
import p244t5.C7959a;
import p244t5.C8002n1;
import p244t5.C8018s1;
import p275w6.C8252a;
import p275w6.C8254c;
import p275w6.C8256e;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.d */
public final class C6171d {

    /* renamed from: a */
    public static HashMap f13395a = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        r3 = (p152j6.C7149g) p152j6.C7122c.f15864y.get(r3);
     */
    static {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f13395a = r0
            java.util.Vector r0 = p189n5.C7452a.f16658K
            java.util.Enumeration r0 = r0.elements()
        L_0x000d:
            boolean r1 = r0.hasMoreElements()
            r2 = 0
            if (r1 == 0) goto L_0x0113
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Hashtable r3 = p152j6.C7122c.f15863x
            java.lang.String r4 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 == 0) goto L_0x0037
            java.util.Hashtable r4 = p152j6.C7122c.f15864y
            java.lang.Object r3 = r4.get(r3)
            j6.g r3 = (p152j6.C7149g) r3
            if (r3 == 0) goto L_0x0037
            j6.f r3 = r3.mo19447b()
            goto L_0x0038
        L_0x0037:
            r3 = r2
        L_0x0038:
            if (r3 != 0) goto L_0x004e
            java.util.Hashtable r3 = p093e6.C6720b.f14821H
            java.lang.String r4 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 != 0) goto L_0x004a
            r3 = r2
            goto L_0x004e
        L_0x004a:
            j6.f r3 = p093e6.C6720b.m13114a(r3)
        L_0x004e:
            if (r3 != 0) goto L_0x0064
            java.util.Hashtable r3 = p007a6.C0039a.f91a
            java.lang.String r4 = p267v7.C8217e.m16509a(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 == 0) goto L_0x0063
            j6.f r3 = p093e6.C6720b.m13114a(r3)
            goto L_0x0064
        L_0x0063:
            r3 = r2
        L_0x0064:
            if (r3 != 0) goto L_0x0084
            java.util.Hashtable r3 = p104f6.C6792a.f14972o
            java.lang.String r4 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 == 0) goto L_0x0083
            java.util.Hashtable r4 = p104f6.C6792a.f14973p
            java.lang.Object r3 = r4.get(r3)
            j6.g r3 = (p152j6.C7149g) r3
            if (r3 == 0) goto L_0x0083
            j6.f r3 = r3.mo19447b()
            goto L_0x0084
        L_0x0083:
            r3 = r2
        L_0x0084:
            if (r3 != 0) goto L_0x00a5
            java.util.Hashtable r3 = p255u5.C8166a.f17924b
            java.lang.String r4 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 != 0) goto L_0x0096
        L_0x0094:
            r3 = r2
            goto L_0x00a5
        L_0x0096:
            java.util.Hashtable r4 = p255u5.C8166a.f17925c
            java.lang.Object r3 = r4.get(r3)
            j6.g r3 = (p152j6.C7149g) r3
            if (r3 != 0) goto L_0x00a1
            goto L_0x0094
        L_0x00a1:
            j6.f r3 = r3.mo19447b()
        L_0x00a5:
            if (r3 != 0) goto L_0x00d2
            java.util.Hashtable r3 = p285x5.C8323b.f18267a
            java.lang.Object r3 = r3.get(r1)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 == 0) goto L_0x00ba
            java.util.Hashtable r4 = p285x5.C8323b.f18268b
            java.lang.Object r3 = r4.get(r3)
            r5.g0 r3 = (p223r5.C7759g0) r3
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            if (r3 != 0) goto L_0x00bf
            r3 = r2
            goto L_0x00d2
        L_0x00bf:
            j6.f r10 = new j6.f
            p6.c r5 = r3.f17188f
            p6.e r6 = r3.f17190h
            java.math.BigInteger r7 = r3.f17191i
            java.math.BigInteger r8 = r3.f17192j
            byte[] r9 = r3.mo20320b()
            r4 = r10
            r4.<init>((p209p6.C7676c) r5, (p209p6.C7686e) r6, (java.math.BigInteger) r7, (java.math.BigInteger) r8, (byte[]) r9)
            r3 = r10
        L_0x00d2:
            if (r3 != 0) goto L_0x00f3
            java.util.Hashtable r3 = p303z5.C8452a.f18475c
            java.lang.String r4 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r3 = r3.get(r4)
            t5.a r3 = (p244t5.C7959a) r3
            if (r3 != 0) goto L_0x00e3
            goto L_0x00ed
        L_0x00e3:
            java.util.Hashtable r4 = p303z5.C8452a.f18476d
            java.lang.Object r3 = r4.get(r3)
            j6.g r3 = (p152j6.C7149g) r3
            if (r3 != 0) goto L_0x00ef
        L_0x00ed:
            r3 = r2
            goto L_0x00f3
        L_0x00ef:
            j6.f r3 = r3.mo19447b()
        L_0x00f3:
            if (r3 == 0) goto L_0x000d
            java.util.HashMap r4 = f13395a
            p6.c r3 = r3.f15872c
            java.util.Hashtable r5 = p189n5.C7452a.f16654G
            java.lang.String r1 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r1 = r5.get(r1)
            j6.g r1 = (p152j6.C7149g) r1
            if (r1 != 0) goto L_0x0108
            goto L_0x010c
        L_0x0108:
            j6.f r2 = r1.mo19447b()
        L_0x010c:
            p6.c r1 = r2.f15872c
            r4.put(r3, r1)
            goto L_0x000d
        L_0x0113:
            java.util.Hashtable r0 = p189n5.C7452a.f16654G
            java.lang.String r1 = "Curve25519"
            java.lang.String r1 = p267v7.C8217e.m16510b(r1)
            java.lang.Object r0 = r0.get(r1)
            j6.g r0 = (p152j6.C7149g) r0
            if (r0 != 0) goto L_0x0124
            goto L_0x0128
        L_0x0124:
            j6.f r2 = r0.mo19447b()
        L_0x0128:
            p6.c r0 = r2.f15872c
            java.util.HashMap r1 = f13395a
            p6.c$d r8 = new p6.c$d
            w6.a r2 = r0.f17023a
            java.math.BigInteger r3 = r2.mo20857a()
            p6.d r2 = r0.f17024b
            java.math.BigInteger r4 = r2.mo20092a()
            p6.d r2 = r0.f17025c
            java.math.BigInteger r5 = r2.mo20092a()
            java.math.BigInteger r6 = r0.f17026d
            java.math.BigInteger r7 = r0.f17027e
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.<clinit>():void");
    }

    /* renamed from: a */
    public static ECParameterSpec m12345a(C7146d dVar, C7676c cVar) {
        C8018s1 s1Var = dVar.f15866b;
        if (s1Var instanceof C7959a) {
            C7959a aVar = (C7959a) s1Var;
            C7148f m = C19543e0.m33321m(aVar);
            if (m == null) {
                Map unmodifiableMap = Collections.unmodifiableMap(((C7485a) C6158a.f13286a).f16687c);
                if (!unmodifiableMap.isEmpty()) {
                    m = (C7148f) unmodifiableMap.get(aVar);
                }
            }
            m.mo19446l();
            return new C7622c(C19543e0.m33340w(aVar), m12348d(cVar), m12347c(m.mo19445g()), m.f15874e, m.f15875f);
        } else if (s1Var instanceof C8002n1) {
            return null;
        } else {
            C7148f e = C7148f.m13817e(s1Var);
            e.mo19446l();
            EllipticCurve d = m12348d(cVar);
            return e.f15875f != null ? new ECParameterSpec(d, m12347c(e.mo19445g()), e.f15874e, e.f15875f.intValue()) : new ECParameterSpec(d, m12347c(e.mo19445g()), e.f15874e, 1);
        }
    }

    /* renamed from: b */
    public static ECParameterSpec m12346b(EllipticCurve ellipticCurve, C7623d dVar) {
        if (!(dVar instanceof C7621b)) {
            return new ECParameterSpec(ellipticCurve, m12347c(dVar.f16912c), dVar.f16913d, dVar.f16914e.intValue());
        }
        return new C7622c(((C7621b) dVar).f16908f, ellipticCurve, m12347c(dVar.f16912c), dVar.f16913d, dVar.f16914e);
    }

    /* renamed from: c */
    public static ECPoint m12347c(C7686e eVar) {
        C7686e s = eVar.mo20140s();
        s.mo20139r();
        return new ECPoint(s.f17049b.mo20092a(), s.mo20137p().mo20092a());
    }

    /* renamed from: d */
    public static EllipticCurve m12348d(C7676c cVar) {
        ECField eCField;
        int[] iArr;
        C8252a aVar = cVar.f17023a;
        int i = 0;
        if (aVar.mo20858b() == 1) {
            eCField = new ECFieldFp(aVar.mo20857a());
        } else {
            C8254c c = ((C8256e) aVar).mo20861c();
            int[] iArr2 = c.f18089a;
            if (iArr2 == null) {
                iArr = null;
            } else {
                iArr = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            }
            int length = iArr.length - 1;
            int i2 = length - 1;
            if (i2 >= 0) {
                int[] iArr3 = new int[i2];
                System.arraycopy(iArr, 1, iArr3, 0, iArr.length - 1 < i2 ? iArr.length - 1 : i2);
                int[] iArr4 = new int[i2];
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    iArr4[i2] = iArr3[i];
                    i++;
                }
                int[] iArr5 = c.f18089a;
                eCField = new ECFieldF2m(iArr5[iArr5.length - 1], iArr4);
            } else {
                StringBuffer stringBuffer = new StringBuffer(1);
                stringBuffer.append(EditableListing.CATEGORY_PATH_JOIN_STRING);
                stringBuffer.append(length);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        return new EllipticCurve(eCField, cVar.f17024b.mo20092a(), cVar.f17025c.mo20092a(), (byte[]) null);
    }

    /* renamed from: e */
    public static C7623d m12349e(ECParameterSpec eCParameterSpec, boolean z) {
        C7676c g = m12351g(eCParameterSpec.getCurve());
        if (eCParameterSpec instanceof C7622c) {
            return new C7621b(((C7622c) eCParameterSpec).f16909a, g, m12353i(g, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
        }
        return new C7623d(g, m12353i(g, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: j6.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p209p6.C7676c m12350f(p008a7.C0041a r3, p152j6.C7146d r4) {
        /*
            n6.a r3 = (p190n6.C7485a) r3
            java.util.HashSet r0 = r3.f16686b
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            t5.s1 r1 = r4.f15866b
            boolean r2 = r1 instanceof p244t5.C7959a
            if (r2 == 0) goto L_0x003d
            t5.a r4 = p244t5.C7959a.m15938q(r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0027
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "named curve not acceptable"
            r3.<init>(r4)
            throw r3
        L_0x0027:
            j6.f r0 = kotlinx.coroutines.C19543e0.m33321m(r4)
            if (r0 != 0) goto L_0x003a
            java.util.HashMap r3 = r3.f16687c
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            j6.f r0 = (p152j6.C7148f) r0
        L_0x003a:
            p6.c r3 = r0.f15872c
            goto L_0x0056
        L_0x003d:
            boolean r1 = r1 instanceof p244t5.C8002n1
            if (r1 == 0) goto L_0x0048
            o6.d r3 = r3.mo19824a()
            p6.c r3 = r3.f16910a
            goto L_0x0056
        L_0x0048:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0057
            t5.s1 r3 = r4.f15866b
            j6.f r3 = p152j6.C7148f.m13817e(r3)
            p6.c r3 = r3.f15872c
        L_0x0056:
            return r3
        L_0x0057:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "encoded parameters not acceptable"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6171d.m12350f(a7.a, j6.d):p6.c");
    }

    /* renamed from: g */
    public static C7676c m12351g(EllipticCurve ellipticCurve) {
        int i;
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            C7676c.C7680d dVar = new C7676c.C7680d(((ECFieldFp) field).getP(), a, b, (BigInteger) null, (BigInteger) null);
            return f13395a.containsKey(dVar) ? (C7676c) f13395a.get(dVar) : dVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] midTermsOfReductionPolynomial = eCFieldF2m.getMidTermsOfReductionPolynomial();
        int[] iArr = new int[3];
        if (midTermsOfReductionPolynomial.length == 1) {
            iArr[0] = midTermsOfReductionPolynomial[0];
        } else if (midTermsOfReductionPolynomial.length == 3) {
            int i2 = midTermsOfReductionPolynomial[0];
            int i3 = midTermsOfReductionPolynomial[1];
            if (i2 >= i3 || i2 >= (i = midTermsOfReductionPolynomial[2])) {
                int i4 = midTermsOfReductionPolynomial[2];
                if (i3 < i4) {
                    iArr[0] = i3;
                    int i5 = midTermsOfReductionPolynomial[0];
                    if (i5 < i4) {
                        iArr[1] = i5;
                        iArr[2] = i4;
                    } else {
                        iArr[1] = i4;
                        iArr[2] = i5;
                    }
                } else {
                    iArr[0] = i4;
                    int i6 = midTermsOfReductionPolynomial[0];
                    if (i6 < i3) {
                        iArr[1] = i6;
                        iArr[2] = midTermsOfReductionPolynomial[1];
                    } else {
                        iArr[1] = i3;
                        iArr[2] = i6;
                    }
                }
            } else {
                iArr[0] = i2;
                if (i3 < i) {
                    iArr[1] = i3;
                    iArr[2] = i;
                } else {
                    iArr[1] = i;
                    iArr[2] = midTermsOfReductionPolynomial[1];
                }
            }
        } else {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        return new C7676c.C7679c(m, iArr[0], iArr[1], iArr[2], a, b);
    }

    /* renamed from: h */
    public static C7686e m12352h(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return m12353i(m12351g(eCParameterSpec.getCurve()), eCPoint);
    }

    /* renamed from: i */
    public static C7686e m12353i(C7676c cVar, ECPoint eCPoint) {
        return cVar.mo20076e(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    /* renamed from: j */
    public static C7759g0 m12354j(C0041a aVar, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return C19543e0.m33330r(aVar, m12349e(eCParameterSpec, false));
        }
        C7623d a = ((C7485a) aVar).mo19824a();
        return new C7759g0(a.f16910a, a.f16912c, a.f16913d, a.f16914e, a.f16911b);
    }
}
