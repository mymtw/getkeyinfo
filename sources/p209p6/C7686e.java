package p209p6;

import androidx.work.C3436p;
import java.math.BigInteger;
import java.util.Hashtable;
import p209p6.C7676c;
import p209p6.C7681d;
import p504ai.C13983i;

/* renamed from: p6.e */
public abstract class C7686e {

    /* renamed from: g */
    public static final C7681d[] f17047g = new C7681d[0];

    /* renamed from: a */
    public C7676c f17048a;

    /* renamed from: b */
    public C7681d f17049b;

    /* renamed from: c */
    public C7681d f17050c;

    /* renamed from: d */
    public C7681d[] f17051d;

    /* renamed from: e */
    public boolean f17052e;

    /* renamed from: f */
    public Hashtable f17053f;

    /* renamed from: p6.e$a */
    public class C7687a implements C7694h {

        /* renamed from: a */
        public final /* synthetic */ boolean f17054a;

        /* renamed from: b */
        public final /* synthetic */ boolean f17055b;

        public C7687a(boolean z, boolean z2) {
            this.f17054a = z;
            this.f17055b = z2;
        }

        /* renamed from: a */
        public final C7695i mo20147a(C7695i iVar) {
            C7698l lVar = iVar instanceof C7698l ? (C7698l) iVar : null;
            if (lVar == null) {
                lVar = new C7698l();
            }
            if (lVar.f17070a) {
                return lVar;
            }
            if (!lVar.f17071b) {
                if (this.f17054a || C7686e.this.mo20123d()) {
                    lVar.f17071b = true;
                } else {
                    lVar.f17070a = true;
                    return lVar;
                }
            }
            if (this.f17055b && !lVar.f17072c) {
                if (!C7686e.this.mo20132k()) {
                    lVar.f17070a = true;
                    return lVar;
                }
                lVar.f17072c = true;
            }
            return lVar;
        }
    }

    /* renamed from: p6.e$b */
    public static abstract class C7688b extends C7686e {
        public C7688b(C7676c cVar, C7681d dVar, C7681d dVar2) {
            super(cVar, dVar, dVar2);
        }

        public C7688b(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr) {
            super(cVar, dVar, dVar2, dVarArr);
        }

        /* renamed from: d */
        public final boolean mo20123d() {
            C7681d dVar;
            C7681d dVar2;
            C7676c cVar = this.f17048a;
            C7681d dVar3 = this.f17049b;
            C7681d dVar4 = cVar.f17024b;
            C7681d dVar5 = cVar.f17025c;
            int i = cVar.f17028f;
            if (i == 6) {
                C7681d dVar6 = this.f17051d[0];
                boolean q = dVar6.mo20108q();
                if (dVar3.mo20109r()) {
                    C7681d m = this.f17050c.mo20104m();
                    if (!q) {
                        dVar5 = dVar5.mo20101j(dVar6.mo20104m());
                    }
                    return m.equals(dVar5);
                }
                C7681d dVar7 = this.f17050c;
                C7681d m2 = dVar3.mo20104m();
                if (q) {
                    dVar2 = C13983i.m21497p(dVar7, dVar7, dVar4);
                    dVar = m2.mo20104m().mo20094c(dVar5);
                } else {
                    C7681d m3 = dVar6.mo20104m();
                    C7681d m4 = m3.mo20104m();
                    dVar2 = dVar7.mo20094c(dVar6).mo20099h(dVar7, dVar4, m3);
                    dVar = m2.mo20095d(dVar5, m4);
                }
                return dVar2.mo20101j(m2).equals(dVar);
            }
            C7681d dVar8 = this.f17050c;
            C7681d j = dVar8.mo20094c(dVar3).mo20101j(dVar8);
            if (i != 0) {
                if (i == 1) {
                    C7681d dVar9 = this.f17051d[0];
                    if (!dVar9.mo20108q()) {
                        C7681d j2 = dVar9.mo20101j(dVar9.mo20104m());
                        j = j.mo20101j(dVar9);
                        dVar4 = dVar4.mo20101j(dVar9);
                        dVar5 = dVar5.mo20101j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(dVar3.mo20094c(dVar4).mo20101j(dVar3.mo20104m()).mo20094c(dVar5));
        }

        /* renamed from: i */
        public final C7686e mo20130i(C7681d dVar) {
            if (mo20141t()) {
                return this;
            }
            int o = mo20136o();
            if (o == 5) {
                C7681d dVar2 = this.f17049b;
                C7681d dVar3 = this.f17050c;
                return this.f17048a.mo20079g(dVar2, dVar3.mo20094c(dVar2).mo20103l(dVar).mo20094c(dVar2.mo20101j(dVar)), this.f17051d, this.f17052e);
            } else if (o != 6) {
                return C7686e.super.mo20130i(dVar);
            } else {
                C7681d dVar4 = this.f17049b;
                C7681d dVar5 = this.f17050c;
                C7681d dVar6 = this.f17051d[0];
                C7681d j = dVar4.mo20101j(dVar.mo20104m());
                C7681d c = dVar5.mo20094c(dVar4).mo20094c(j);
                C7681d j2 = dVar6.mo20101j(dVar);
                return this.f17048a.mo20079g(j, c, new C7681d[]{j2}, this.f17052e);
            }
        }

        /* renamed from: k */
        public final boolean mo20132k() {
            BigInteger bigInteger = this.f17048a.f17027e;
            if (C7675b.f17020c.equals(bigInteger)) {
                C7686e s = mo20140s();
                s.mo20139r();
                return ((C7681d.C7682a) s.f17049b.mo20094c(this.f17048a.f17024b)).mo20113u() == 0;
            } else if (!C7675b.f17022e.equals(bigInteger)) {
                return C7686e.super.mo20132k();
            } else {
                C7686e s2 = mo20140s();
                s2.mo20139r();
                C7681d dVar = s2.f17049b;
                C7676c cVar = this.f17048a;
                C7681d q = ((C7676c.C7677a) cVar).mo20090q(dVar.mo20094c(cVar.f17024b));
                if (q == null) {
                    return false;
                }
                C7681d c = dVar.mo20101j(q).mo20094c(s2.mo20137p()).mo20094c(this.f17048a.f17024b);
                return ((C7681d.C7682a) c).mo20113u() == 0 || ((C7681d.C7682a) c.mo20094c(dVar)).mo20113u() == 0;
            }
        }

        /* renamed from: l */
        public final C7686e mo20133l(C7681d dVar) {
            if (mo20141t()) {
                return this;
            }
            int o = mo20136o();
            if (o != 5 && o != 6) {
                return C7686e.super.mo20133l(dVar);
            }
            C7681d dVar2 = this.f17049b;
            return this.f17048a.mo20079g(dVar2, this.f17050c.mo20094c(dVar2).mo20101j(dVar).mo20094c(dVar2), this.f17051d, this.f17052e);
        }

        /* renamed from: y */
        public final C7688b mo20148y(int i) {
            C7686e eVar;
            if (mo20141t()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            int i2 = cVar.f17028f;
            C7681d dVar = this.f17049b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                C7681d dVar2 = this.f17050c;
                C7681d dVar3 = this.f17051d[0];
                eVar = cVar.mo20079g(dVar.mo20093b(i), dVar2.mo20093b(i), new C7681d[]{dVar3.mo20093b(i)}, this.f17052e);
                return (C7688b) eVar;
            }
            eVar = cVar.mo20078f(dVar.mo20093b(i), this.f17050c.mo20093b(i), this.f17052e);
            return (C7688b) eVar;
        }
    }

    /* renamed from: p6.e$c */
    public static abstract class C7689c extends C7686e {
        public C7689c(C7676c cVar, C7681d dVar, C7681d dVar2) {
            super(cVar, dVar, dVar2);
        }

        public C7689c(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr) {
            super(cVar, dVar, dVar2, dVarArr);
        }

        /* renamed from: d */
        public final boolean mo20123d() {
            C7681d dVar = this.f17049b;
            C7681d dVar2 = this.f17050c;
            C7676c cVar = this.f17048a;
            C7681d dVar3 = cVar.f17024b;
            C7681d dVar4 = cVar.f17025c;
            C7681d m = dVar2.mo20104m();
            int o = mo20136o();
            if (o != 0) {
                if (o == 1) {
                    C7681d dVar5 = this.f17051d[0];
                    if (!dVar5.mo20108q()) {
                        C7681d m2 = dVar5.mo20104m();
                        C7681d j = dVar5.mo20101j(m2);
                        m = m.mo20101j(dVar5);
                        dVar3 = dVar3.mo20101j(m2);
                        dVar4 = dVar4.mo20101j(j);
                    }
                } else if (o == 2 || o == 3 || o == 4) {
                    C7681d dVar6 = this.f17051d[0];
                    if (!dVar6.mo20108q()) {
                        C7681d m3 = dVar6.mo20104m();
                        C7681d m4 = m3.mo20104m();
                        C7681d j2 = m3.mo20101j(m4);
                        dVar3 = dVar3.mo20101j(m4);
                        dVar4 = dVar4.mo20101j(j2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return m.equals(dVar.mo20104m().mo20094c(dVar3).mo20101j(dVar).mo20094c(dVar4));
        }

        /* renamed from: u */
        public final boolean mo20143u() {
            return mo20137p().mo20110s();
        }
    }

    /* renamed from: p6.e$d */
    public static class C7690d extends C7688b {
        public C7690d(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
            super(cVar, dVar, dVar2);
            if ((dVar == null) == (dVar2 != null ? false : true)) {
                if (dVar != null) {
                    C7681d.C7684c.m14791v(this.f17049b, this.f17050c);
                    if (cVar != null) {
                        C7681d.C7684c.m14791v(this.f17049b, this.f17048a.f17024b);
                    }
                }
                this.f17052e = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public C7690d(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
            super(cVar, dVar, dVar2, dVarArr);
            this.f17052e = z;
        }

        /* renamed from: j */
        public final C7686e mo20131j(C7686e eVar) {
            C7681d dVar;
            C7681d dVar2;
            C7681d dVar3;
            C7681d dVar4;
            C7681d dVar5;
            C7681d dVar6;
            if (mo20141t()) {
                return eVar;
            }
            if (eVar.mo20141t()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            int i = cVar.f17028f;
            C7681d dVar7 = this.f17049b;
            C7681d dVar8 = eVar.f17049b;
            if (i == 0) {
                C7681d dVar9 = this.f17050c;
                C7681d dVar10 = eVar.f17050c;
                C7681d c = dVar7.mo20094c(dVar8);
                C7681d c2 = dVar9.mo20094c(dVar10);
                if (c.mo20109r()) {
                    return c2.mo20109r() ? mo20145w() : cVar.mo20089p();
                }
                C7681d l = c2.mo20103l(c);
                C7681d c3 = C13983i.m21497p(l, l, c).mo20094c(cVar.f17024b);
                return new C7690d(cVar, c3, l.mo20101j(dVar7.mo20094c(c3)).mo20094c(c3).mo20094c(dVar9), this.f17052e);
            } else if (i == 1) {
                C7681d dVar11 = this.f17050c;
                C7681d dVar12 = this.f17051d[0];
                C7681d dVar13 = eVar.f17050c;
                C7681d dVar14 = eVar.f17051d[0];
                boolean q = dVar14.mo20108q();
                C7681d c4 = dVar12.mo20101j(dVar13).mo20094c(q ? dVar11 : dVar11.mo20101j(dVar14));
                C7681d c5 = dVar12.mo20101j(dVar8).mo20094c(q ? dVar7 : dVar7.mo20101j(dVar14));
                if (c5.mo20109r()) {
                    return c4.mo20109r() ? mo20145w() : cVar.mo20089p();
                }
                C7681d m = c5.mo20104m();
                C7681d j = m.mo20101j(c5);
                if (!q) {
                    dVar12 = dVar12.mo20101j(dVar14);
                }
                C7681d c6 = c4.mo20094c(c5);
                C7681d c7 = c6.mo20099h(c4, m, cVar.f17024b).mo20101j(dVar12).mo20094c(j);
                C7681d j2 = c5.mo20101j(c7);
                if (!q) {
                    m = m.mo20101j(dVar14);
                }
                return new C7690d(cVar, j2, c4.mo20099h(dVar7, c5, dVar11).mo20099h(m, c6, c7), new C7681d[]{j.mo20101j(dVar12)}, this.f17052e);
            } else if (i != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (dVar7.mo20109r()) {
                return dVar8.mo20109r() ? cVar.mo20089p() : eVar.mo20131j(this);
            } else {
                C7681d dVar15 = this.f17050c;
                C7681d dVar16 = this.f17051d[0];
                C7681d dVar17 = eVar.f17050c;
                C7681d dVar18 = eVar.f17051d[0];
                boolean q2 = dVar16.mo20108q();
                if (!q2) {
                    dVar2 = dVar8.mo20101j(dVar16);
                    dVar = dVar17.mo20101j(dVar16);
                } else {
                    dVar2 = dVar8;
                    dVar = dVar17;
                }
                boolean q3 = dVar18.mo20108q();
                if (!q3) {
                    dVar7 = dVar7.mo20101j(dVar18);
                    dVar3 = dVar15.mo20101j(dVar18);
                } else {
                    dVar3 = dVar15;
                }
                C7681d c8 = dVar3.mo20094c(dVar);
                C7681d c9 = dVar7.mo20094c(dVar2);
                if (c9.mo20109r()) {
                    return c8.mo20109r() ? mo20145w() : cVar.mo20089p();
                }
                if (dVar8.mo20109r()) {
                    C7686e s = mo20140s();
                    C7681d dVar19 = s.f17049b;
                    C7681d q4 = s.mo20138q();
                    C7681d l2 = q4.mo20094c(dVar17).mo20103l(dVar19);
                    dVar5 = C13983i.m21497p(l2, l2, dVar19).mo20094c(cVar.f17024b);
                    if (dVar5.mo20109r()) {
                        return new C7690d(cVar, dVar5, cVar.f17025c.mo20106o(), this.f17052e);
                    }
                    dVar4 = l2.mo20101j(dVar19.mo20094c(dVar5)).mo20094c(dVar5).mo20094c(q4).mo20103l(dVar5).mo20094c(dVar5);
                    dVar6 = cVar.mo20073b(C7675b.f17019b);
                } else {
                    C7681d m2 = c9.mo20104m();
                    C7681d j3 = c8.mo20101j(dVar7);
                    C7681d j4 = c8.mo20101j(dVar2);
                    C7681d j5 = j3.mo20101j(j4);
                    if (j5.mo20109r()) {
                        return new C7690d(cVar, j5, cVar.f17025c.mo20106o(), this.f17052e);
                    }
                    C7681d j6 = c8.mo20101j(m2);
                    if (!q3) {
                        j6 = j6.mo20101j(dVar18);
                    }
                    dVar4 = j4.mo20094c(m2).mo20095d(j6, dVar15.mo20094c(dVar16));
                    dVar6 = !q2 ? j6.mo20101j(dVar16) : j6;
                    dVar5 = j5;
                }
                return new C7690d(cVar, dVar5, dVar4, new C7681d[]{dVar6}, this.f17052e);
            }
        }

        /* renamed from: m */
        public final C7686e mo20134m(C7686e eVar) {
            if (mo20141t()) {
                return eVar;
            }
            if (eVar.mo20141t()) {
                return mo20145w();
            }
            C7676c cVar = this.f17048a;
            C7681d dVar = this.f17049b;
            if (dVar.mo20109r()) {
                return eVar;
            }
            if (cVar.f17028f != 6) {
                return mo20145w().mo20131j(eVar);
            }
            C7681d dVar2 = eVar.f17049b;
            C7681d dVar3 = eVar.f17051d[0];
            if (dVar2.mo20109r() || !dVar3.mo20108q()) {
                return mo20145w().mo20131j(eVar);
            }
            C7681d dVar4 = this.f17050c;
            C7681d dVar5 = this.f17051d[0];
            C7681d dVar6 = eVar.f17050c;
            C7681d m = dVar.mo20104m();
            C7681d m2 = dVar4.mo20104m();
            C7681d m3 = dVar5.mo20104m();
            C7681d c = cVar.f17024b.mo20101j(m3).mo20094c(m2).mo20094c(dVar4.mo20101j(dVar5));
            C7681d i = dVar6.mo20100i();
            C7681d h = cVar.f17024b.mo20094c(i).mo20101j(m3).mo20094c(m2).mo20099h(c, m, m3);
            C7681d j = dVar2.mo20101j(m3);
            C7681d m4 = j.mo20094c(c).mo20104m();
            if (m4.mo20109r()) {
                return h.mo20109r() ? eVar.mo20145w() : cVar.mo20089p();
            }
            if (h.mo20109r()) {
                return new C7690d(cVar, h, cVar.f17025c.mo20106o(), this.f17052e);
            }
            C7681d j2 = h.mo20104m().mo20101j(j);
            C7681d j3 = h.mo20101j(m4).mo20101j(m3);
            return new C7690d(cVar, j2, h.mo20094c(m4).mo20104m().mo20099h(c, i, j3), new C7681d[]{j3}, this.f17052e);
        }

        /* renamed from: n */
        public final C7686e mo20135n() {
            mo20139r();
            return new C7690d((C7676c) null, this.f17049b, mo20137p(), false);
        }

        /* renamed from: q */
        public final C7681d mo20138q() {
            int o = mo20136o();
            if (o != 5 && o != 6) {
                return this.f17050c;
            }
            C7681d dVar = this.f17049b;
            C7681d dVar2 = this.f17050c;
            if (mo20141t() || dVar.mo20109r()) {
                return dVar2;
            }
            C7681d j = dVar2.mo20094c(dVar).mo20101j(dVar);
            if (6 != o) {
                return j;
            }
            C7681d dVar3 = this.f17051d[0];
            return !dVar3.mo20108q() ? j.mo20103l(dVar3) : j;
        }

        /* renamed from: u */
        public final boolean mo20143u() {
            C7681d dVar = this.f17049b;
            if (dVar.mo20109r()) {
                return false;
            }
            C7681d dVar2 = this.f17050c;
            int o = mo20136o();
            return (o == 5 || o == 6) ? dVar2.mo20110s() != dVar.mo20110s() : dVar2.mo20103l(dVar).mo20110s();
        }

        /* renamed from: v */
        public final C7686e mo20144v() {
            if (mo20141t()) {
                return this;
            }
            C7681d dVar = this.f17049b;
            if (dVar.mo20109r()) {
                return this;
            }
            int o = mo20136o();
            if (o == 0) {
                return new C7690d(this.f17048a, dVar, this.f17050c.mo20094c(dVar), this.f17052e);
            } else if (o == 1) {
                C7681d dVar2 = this.f17050c;
                C7681d dVar3 = this.f17051d[0];
                return new C7690d(this.f17048a, dVar, dVar2.mo20094c(dVar), new C7681d[]{dVar3}, this.f17052e);
            } else if (o == 5) {
                return new C7690d(this.f17048a, dVar, this.f17050c.mo20100i(), this.f17052e);
            } else if (o == 6) {
                C7681d dVar4 = this.f17050c;
                C7681d dVar5 = this.f17051d[0];
                return new C7690d(this.f17048a, dVar, dVar4.mo20094c(dVar5), new C7681d[]{dVar5}, this.f17052e);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        /* renamed from: w */
        public final C7686e mo20145w() {
            C7681d dVar;
            if (mo20141t()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            C7681d dVar2 = this.f17049b;
            if (dVar2.mo20109r()) {
                return cVar.mo20089p();
            }
            int i = cVar.f17028f;
            if (i == 0) {
                C7681d c = this.f17050c.mo20103l(dVar2).mo20094c(dVar2);
                C7681d c2 = c.mo20104m().mo20094c(c).mo20094c(cVar.f17024b);
                return new C7690d(cVar, c2, dVar2.mo20095d(c2, c.mo20100i()), this.f17052e);
            } else if (i == 1) {
                C7681d dVar3 = this.f17050c;
                C7681d dVar4 = this.f17051d[0];
                boolean q = dVar4.mo20108q();
                C7681d j = q ? dVar2 : dVar2.mo20101j(dVar4);
                if (!q) {
                    dVar3 = dVar3.mo20101j(dVar4);
                }
                C7681d m = dVar2.mo20104m();
                C7681d c3 = m.mo20094c(dVar3);
                C7681d m2 = j.mo20104m();
                C7681d c4 = c3.mo20094c(j);
                C7681d h = c4.mo20099h(c3, m2, cVar.f17024b);
                return new C7690d(cVar, j.mo20101j(h), m.mo20104m().mo20099h(j, h, c4), new C7681d[]{j.mo20101j(m2)}, this.f17052e);
            } else if (i == 6) {
                C7681d dVar5 = this.f17050c;
                C7681d dVar6 = this.f17051d[0];
                boolean q2 = dVar6.mo20108q();
                C7681d j2 = q2 ? dVar5 : dVar5.mo20101j(dVar6);
                C7681d m3 = q2 ? dVar6 : dVar6.mo20104m();
                C7681d dVar7 = cVar.f17024b;
                C7681d j3 = q2 ? dVar7 : dVar7.mo20101j(m3);
                C7681d p = C13983i.m21497p(dVar5, j2, j3);
                if (p.mo20109r()) {
                    return new C7690d(cVar, p, cVar.f17025c.mo20106o(), this.f17052e);
                }
                C7681d m4 = p.mo20104m();
                C7681d j4 = q2 ? p : p.mo20101j(m3);
                C7681d dVar8 = cVar.f17025c;
                if (dVar8.mo20107p() < (cVar.mo20072a() >> 1)) {
                    C7681d m5 = dVar5.mo20094c(dVar2).mo20104m();
                    dVar = m5.mo20094c(p).mo20094c(m3).mo20101j(m5).mo20094c(dVar8.mo20108q() ? j3.mo20094c(m3).mo20104m() : j3.mo20095d(dVar8, m3.mo20104m())).mo20094c(m4);
                    if (!dVar7.mo20109r()) {
                        if (!dVar7.mo20108q()) {
                            dVar = dVar.mo20094c(dVar7.mo20100i().mo20101j(j4));
                        }
                        return new C7690d(cVar, m4, dVar, new C7681d[]{j4}, this.f17052e);
                    }
                } else {
                    if (!q2) {
                        dVar2 = dVar2.mo20101j(dVar6);
                    }
                    dVar = dVar2.mo20095d(p, j2).mo20094c(m4);
                }
                dVar = dVar.mo20094c(j4);
                return new C7690d(cVar, m4, dVar, new C7681d[]{j4}, this.f17052e);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
    }

    /* renamed from: p6.e$e */
    public static class C7691e extends C7689c {
        public C7691e(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
            super(cVar, dVar, dVar2);
            if ((dVar == null) == (dVar2 != null ? false : true)) {
                this.f17052e = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public C7691e(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
            super(cVar, dVar, dVar2, dVarArr);
            this.f17052e = z;
        }

        /* renamed from: A */
        public static C7681d m14866A(C7681d dVar) {
            return dVar.mo20094c(dVar).mo20094c(dVar);
        }

        /* renamed from: B */
        public static C7681d m14867B(C7681d dVar) {
            C7681d c = dVar.mo20094c(dVar);
            return c.mo20094c(c);
        }

        /* renamed from: C */
        public final C7681d mo20149C() {
            C7681d[] dVarArr = this.f17051d;
            C7681d dVar = dVarArr[1];
            if (dVar != null) {
                return dVar;
            }
            C7681d y = mo20150y(dVarArr[0], (C7681d) null);
            dVarArr[1] = y;
            return y;
        }

        /* renamed from: a */
        public final C7681d mo20120a() {
            return C7686e.super.mo20120a();
        }

        /* renamed from: h */
        public final C7686e mo20128h(int i) {
            C7681d dVar;
            int i2 = i;
            if (i2 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i2 == 0 || mo20141t()) {
                return this;
            } else {
                if (i2 == 1) {
                    return mo20145w();
                }
                C7676c cVar = this.f17048a;
                C7681d dVar2 = this.f17050c;
                if (dVar2.mo20109r()) {
                    return cVar.mo20089p();
                }
                int i3 = cVar.f17028f;
                C7681d dVar3 = cVar.f17024b;
                C7681d dVar4 = this.f17049b;
                C7681d[] dVarArr = this.f17051d;
                C7681d b = dVarArr.length < 1 ? cVar.mo20073b(C7675b.f17019b) : dVarArr[0];
                if (!b.mo20108q() && i3 != 0) {
                    if (i3 == 1) {
                        dVar = b.mo20104m();
                        dVar4 = dVar4.mo20101j(b);
                        dVar2 = dVar2.mo20101j(dVar);
                    } else if (i3 == 2) {
                        dVar = null;
                    } else if (i3 == 4) {
                        dVar3 = mo20149C();
                    } else {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    dVar3 = mo20150y(b, dVar);
                }
                int i4 = 0;
                C7681d dVar5 = dVar3;
                C7681d dVar6 = dVar2;
                C7681d dVar7 = dVar4;
                C7681d dVar8 = dVar5;
                while (i4 < i2) {
                    if (dVar6.mo20109r()) {
                        return cVar.mo20089p();
                    }
                    C7681d A = m14866A(dVar7.mo20104m());
                    C7681d c = dVar6.mo20094c(dVar6);
                    C7681d j = c.mo20101j(dVar6);
                    C7681d j2 = dVar7.mo20101j(j);
                    C7681d c2 = j2.mo20094c(j2);
                    C7681d m = j.mo20104m();
                    C7681d c3 = m.mo20094c(m);
                    if (!dVar8.mo20109r()) {
                        A = A.mo20094c(dVar8);
                        C7681d j3 = c3.mo20101j(dVar8);
                        dVar8 = j3.mo20094c(j3);
                    }
                    C7681d g = A.mo20104m().mo20098g(c2.mo20094c(c2));
                    dVar6 = A.mo20101j(c2.mo20098g(g)).mo20098g(c3);
                    b = b.mo20108q() ? c : c.mo20101j(b);
                    i4++;
                    dVar7 = g;
                }
                if (i3 == 0) {
                    C7681d n = b.mo20105n();
                    C7681d m2 = n.mo20104m();
                    return new C7691e(cVar, dVar7.mo20101j(m2), dVar6.mo20101j(m2.mo20101j(n)), this.f17052e);
                } else if (i3 == 1) {
                    return new C7691e(cVar, dVar7.mo20101j(b), dVar6, new C7681d[]{b.mo20101j(b.mo20104m())}, this.f17052e);
                } else if (i3 == 2) {
                    return new C7691e(cVar, dVar7, dVar6, new C7681d[]{b}, this.f17052e);
                } else if (i3 == 4) {
                    return new C7691e(cVar, dVar7, dVar6, new C7681d[]{b, dVar8}, this.f17052e);
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
            if (r1 == r6) goto L_0x0121;
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p209p6.C7686e mo20131j(p209p6.C7686e r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                boolean r2 = r16.mo20141t()
                if (r2 == 0) goto L_0x000b
                return r1
            L_0x000b:
                boolean r2 = r17.mo20141t()
                if (r2 == 0) goto L_0x0012
                return r0
            L_0x0012:
                if (r0 != r1) goto L_0x0019
                p6.e r1 = r16.mo20145w()
                return r1
            L_0x0019:
                p6.c r3 = r0.f17048a
                int r2 = r3.f17028f
                p6.d r4 = r0.f17049b
                p6.d r5 = r0.f17050c
                p6.d r6 = r1.f17049b
                p6.d r7 = r1.f17050c
                if (r2 == 0) goto L_0x01d9
                r8 = 1
                r9 = 0
                if (r2 == r8) goto L_0x0141
                r10 = 4
                r11 = 2
                if (r2 == r11) goto L_0x003a
                if (r2 != r10) goto L_0x0032
                goto L_0x003a
            L_0x0032:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L_0x003a:
                p6.d[] r12 = r0.f17051d
                r12 = r12[r9]
                p6.d[] r1 = r1.f17051d
                r1 = r1[r9]
                boolean r13 = r12.mo20108q()
                if (r13 != 0) goto L_0x00a1
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto L_0x00a1
                p6.d r1 = r4.mo20098g(r6)
                p6.d r7 = r5.mo20098g(r7)
                boolean r13 = r1.mo20109r()
                if (r13 == 0) goto L_0x006c
                boolean r1 = r7.mo20109r()
                if (r1 == 0) goto L_0x0067
                p6.e r1 = r16.mo20145w()
                return r1
            L_0x0067:
                p6.e r1 = r3.mo20089p()
                return r1
            L_0x006c:
                p6.d r13 = r1.mo20104m()
                p6.d r4 = r4.mo20101j(r13)
                p6.d r6 = r6.mo20101j(r13)
                p6.d r13 = r4.mo20098g(r6)
                p6.d r5 = r13.mo20101j(r5)
                p6.d r13 = r7.mo20104m()
                p6.d r13 = r13.mo20098g(r4)
                p6.d r6 = r13.mo20098g(r6)
                p6.d r4 = r4.mo20098g(r6)
                p6.d r4 = r4.mo20101j(r7)
                p6.d r4 = r4.mo20098g(r5)
                p6.d r1 = r1.mo20101j(r12)
                r5 = r4
                r4 = r6
            L_0x009e:
                r14 = 0
                goto L_0x0121
            L_0x00a1:
                if (r13 == 0) goto L_0x00a4
                goto L_0x00b4
            L_0x00a4:
                p6.d r15 = r12.mo20104m()
                p6.d r6 = r15.mo20101j(r6)
                p6.d r15 = r15.mo20101j(r12)
                p6.d r7 = r15.mo20101j(r7)
            L_0x00b4:
                boolean r15 = r1.mo20108q()
                if (r15 == 0) goto L_0x00bb
                goto L_0x00cb
            L_0x00bb:
                p6.d r14 = r1.mo20104m()
                p6.d r4 = r14.mo20101j(r4)
                p6.d r14 = r14.mo20101j(r1)
                p6.d r5 = r14.mo20101j(r5)
            L_0x00cb:
                p6.d r6 = r4.mo20098g(r6)
                p6.d r7 = r5.mo20098g(r7)
                boolean r14 = r6.mo20109r()
                if (r14 == 0) goto L_0x00e9
                boolean r1 = r7.mo20109r()
                if (r1 == 0) goto L_0x00e4
                p6.e r1 = r16.mo20145w()
                return r1
            L_0x00e4:
                p6.e r1 = r3.mo20089p()
                return r1
            L_0x00e9:
                p6.d r14 = r6.mo20104m()
                p6.d r8 = r14.mo20101j(r6)
                p6.d r4 = r14.mo20101j(r4)
                p6.d r9 = r7.mo20104m()
                p6.d r9 = r9.mo20094c(r8)
                p6.d r11 = r4.mo20094c(r4)
                p6.d r9 = r9.mo20098g(r11)
                p6.d r4 = r4.mo20098g(r9)
                p6.d r4 = r4.mo20096e(r7, r8, r5)
                if (r13 != 0) goto L_0x0114
                p6.d r5 = r6.mo20101j(r12)
                goto L_0x0115
            L_0x0114:
                r5 = r6
            L_0x0115:
                if (r15 != 0) goto L_0x011c
                p6.d r1 = r5.mo20101j(r1)
                goto L_0x011d
            L_0x011c:
                r1 = r5
            L_0x011d:
                r5 = r4
                r4 = r9
                if (r1 != r6) goto L_0x009e
            L_0x0121:
                if (r2 != r10) goto L_0x0131
                p6.d r2 = r0.mo20150y(r1, r14)
                r6 = 2
                p6.d[] r6 = new p209p6.C7681d[r6]
                r7 = 0
                r6[r7] = r1
                r8 = 1
                r6[r8] = r2
                goto L_0x0138
            L_0x0131:
                r7 = 0
                r8 = 1
                p6.d[] r2 = new p209p6.C7681d[r8]
                r2[r7] = r1
                r6 = r2
            L_0x0138:
                p6.e$e r1 = new p6.e$e
                boolean r7 = r0.f17052e
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x0141:
                p6.d[] r2 = r0.f17051d
                r8 = 0
                r2 = r2[r8]
                p6.d[] r1 = r1.f17051d
                r1 = r1[r8]
                boolean r8 = r2.mo20108q()
                boolean r9 = r1.mo20108q()
                if (r8 == 0) goto L_0x0155
                goto L_0x0159
            L_0x0155:
                p6.d r7 = r7.mo20101j(r2)
            L_0x0159:
                if (r9 == 0) goto L_0x015c
                goto L_0x0160
            L_0x015c:
                p6.d r5 = r5.mo20101j(r1)
            L_0x0160:
                p6.d r7 = r7.mo20098g(r5)
                if (r8 == 0) goto L_0x0167
                goto L_0x016b
            L_0x0167:
                p6.d r6 = r6.mo20101j(r2)
            L_0x016b:
                if (r9 == 0) goto L_0x016e
                goto L_0x0172
            L_0x016e:
                p6.d r4 = r4.mo20101j(r1)
            L_0x0172:
                p6.d r6 = r6.mo20098g(r4)
                boolean r10 = r6.mo20109r()
                if (r10 == 0) goto L_0x018c
                boolean r1 = r7.mo20109r()
                if (r1 == 0) goto L_0x0187
                p6.e r1 = r16.mo20145w()
                return r1
            L_0x0187:
                p6.e r1 = r3.mo20089p()
                return r1
            L_0x018c:
                if (r8 == 0) goto L_0x0190
                r2 = r1
                goto L_0x0197
            L_0x0190:
                if (r9 == 0) goto L_0x0193
                goto L_0x0197
            L_0x0193:
                p6.d r2 = r2.mo20101j(r1)
            L_0x0197:
                p6.d r1 = r6.mo20104m()
                p6.d r8 = r1.mo20101j(r6)
                p6.d r1 = r1.mo20101j(r4)
                p6.d r4 = r7.mo20104m()
                p6.d r4 = r4.mo20101j(r2)
                p6.d r4 = r4.mo20098g(r8)
                p6.d r9 = r1.mo20094c(r1)
                p6.d r4 = r4.mo20098g(r9)
                p6.d r6 = r6.mo20101j(r4)
                p6.d r1 = r1.mo20098g(r4)
                p6.d r5 = r1.mo20096e(r7, r5, r8)
                p6.d r1 = r8.mo20101j(r2)
                p6.e$e r8 = new p6.e$e
                r2 = 1
                p6.d[] r7 = new p209p6.C7681d[r2]
                r2 = 0
                r7[r2] = r1
                boolean r1 = r0.f17052e
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L_0x01d9:
                p6.d r1 = r6.mo20098g(r4)
                p6.d r2 = r7.mo20098g(r5)
                boolean r7 = r1.mo20109r()
                if (r7 == 0) goto L_0x01f7
                boolean r1 = r2.mo20109r()
                if (r1 == 0) goto L_0x01f2
                p6.e r1 = r16.mo20145w()
                return r1
            L_0x01f2:
                p6.e r1 = r3.mo20089p()
                return r1
            L_0x01f7:
                p6.d r1 = r2.mo20103l(r1)
                p6.d r2 = r1.mo20104m()
                p6.d r2 = r2.mo20098g(r4)
                p6.d r2 = r2.mo20098g(r6)
                p6.d r4 = r4.mo20098g(r2)
                p6.d r1 = r1.mo20101j(r4)
                p6.d r1 = r1.mo20098g(r5)
                p6.e$e r4 = new p6.e$e
                boolean r5 = r0.f17052e
                r4.<init>(r3, r2, r1, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p209p6.C7686e.C7691e.mo20131j(p6.e):p6.e");
        }

        /* renamed from: m */
        public final C7686e mo20134m(C7686e eVar) {
            if (this == eVar) {
                return mo20146x();
            }
            if (mo20141t()) {
                return eVar;
            }
            if (eVar.mo20141t()) {
                return mo20145w();
            }
            C7681d dVar = this.f17050c;
            if (dVar.mo20109r()) {
                return eVar;
            }
            C7676c cVar = this.f17048a;
            int i = cVar.f17028f;
            if (i != 0) {
                return i != 4 ? mo20145w().mo20131j(eVar) : mo20151z(false).mo20131j(eVar);
            }
            C7681d dVar2 = this.f17049b;
            C7681d dVar3 = eVar.f17049b;
            C7681d dVar4 = eVar.f17050c;
            C7681d g = dVar3.mo20098g(dVar2);
            C7681d g2 = dVar4.mo20098g(dVar);
            if (g.mo20109r()) {
                return g2.mo20109r() ? mo20146x() : this;
            }
            C7681d m = g.mo20104m();
            C7681d g3 = m.mo20101j(dVar2.mo20094c(dVar2).mo20094c(dVar3)).mo20098g(g2.mo20104m());
            if (g3.mo20109r()) {
                return cVar.mo20089p();
            }
            C7681d n = g3.mo20101j(g).mo20105n();
            C7681d j = g3.mo20101j(n).mo20101j(g2);
            C7681d g4 = dVar.mo20094c(dVar).mo20101j(m).mo20101j(g).mo20101j(n).mo20098g(j);
            C7681d c = g4.mo20098g(j).mo20101j(j.mo20094c(g4)).mo20094c(dVar3);
            return new C7691e(cVar, c, dVar2.mo20098g(c).mo20101j(g4).mo20098g(dVar), this.f17052e);
        }

        /* renamed from: n */
        public final C7686e mo20135n() {
            mo20139r();
            return new C7691e((C7676c) null, this.f17049b, mo20137p(), false);
        }

        /* renamed from: v */
        public final C7686e mo20144v() {
            if (mo20141t()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            return cVar.f17028f != 0 ? new C7691e(cVar, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e) : new C7691e(cVar, this.f17049b, this.f17050c.mo20102k(), this.f17052e);
        }

        /* renamed from: w */
        public final C7686e mo20145w() {
            C7681d dVar;
            C7681d dVar2;
            if (mo20141t()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            C7681d dVar3 = this.f17050c;
            if (dVar3.mo20109r()) {
                return cVar.mo20089p();
            }
            int i = cVar.f17028f;
            C7681d dVar4 = this.f17049b;
            if (i == 0) {
                C7681d l = m14866A(dVar4.mo20104m()).mo20094c(this.f17048a.f17024b).mo20103l(dVar3.mo20094c(dVar3));
                C7681d g = l.mo20104m().mo20098g(dVar4.mo20094c(dVar4));
                return new C7691e(cVar, g, l.mo20101j(dVar4.mo20098g(g)).mo20098g(dVar3), this.f17052e);
            } else if (i == 1) {
                C7681d dVar5 = this.f17051d[0];
                boolean q = dVar5.mo20108q();
                C7681d dVar6 = cVar.f17024b;
                if (!dVar6.mo20109r() && !q) {
                    dVar6 = dVar6.mo20101j(dVar5.mo20104m());
                }
                C7681d c = dVar6.mo20094c(m14866A(dVar4.mo20104m()));
                C7681d j = q ? dVar3 : dVar3.mo20101j(dVar5);
                C7681d m = q ? dVar3.mo20104m() : j.mo20101j(dVar3);
                C7681d B = m14867B(dVar4.mo20101j(m));
                C7681d g2 = c.mo20104m().mo20098g(B.mo20094c(B));
                C7681d c2 = j.mo20094c(j);
                C7681d j2 = g2.mo20101j(c2);
                C7681d c3 = m.mo20094c(m);
                C7681d j3 = B.mo20098g(g2).mo20101j(c);
                C7681d m2 = c3.mo20104m();
                C7681d g3 = j3.mo20098g(m2.mo20094c(m2));
                C7681d c4 = q ? c3.mo20094c(c3) : c2.mo20104m();
                return new C7691e(cVar, j2, g3, new C7681d[]{c4.mo20094c(c4).mo20101j(j)}, this.f17052e);
            } else if (i == 2) {
                C7681d dVar7 = this.f17051d[0];
                boolean q2 = dVar7.mo20108q();
                C7681d m3 = dVar3.mo20104m();
                C7681d m4 = m3.mo20104m();
                C7681d dVar8 = cVar.f17024b;
                C7681d k = dVar8.mo20102k();
                if (k.mo20092a().equals(BigInteger.valueOf(3))) {
                    C7681d m5 = q2 ? dVar7 : dVar7.mo20104m();
                    dVar = m14866A(dVar4.mo20094c(m5).mo20101j(dVar4.mo20098g(m5)));
                    dVar2 = m3.mo20101j(dVar4);
                } else {
                    C7681d A = m14866A(dVar4.mo20104m());
                    if (!q2) {
                        if (!dVar8.mo20109r()) {
                            C7681d m6 = dVar7.mo20104m().mo20104m();
                            if (k.mo20107p() < dVar8.mo20107p()) {
                                dVar = A.mo20098g(m6.mo20101j(k));
                            } else {
                                dVar8 = m6.mo20101j(dVar8);
                            }
                        } else {
                            dVar = A;
                        }
                        dVar2 = dVar4.mo20101j(m3);
                    }
                    dVar = A.mo20094c(dVar8);
                    dVar2 = dVar4.mo20101j(m3);
                }
                C7681d B2 = m14867B(dVar2);
                C7681d g4 = dVar.mo20104m().mo20098g(B2.mo20094c(B2));
                C7681d g5 = B2.mo20098g(g4).mo20101j(dVar).mo20098g(m14867B(m4.mo20094c(m4)));
                C7681d c5 = dVar3.mo20094c(dVar3);
                if (!q2) {
                    c5 = c5.mo20101j(dVar7);
                }
                return new C7691e(cVar, g4, g5, new C7681d[]{c5}, this.f17052e);
            } else if (i == 4) {
                return mo20151z(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        /* renamed from: x */
        public final C7686e mo20146x() {
            if (mo20141t()) {
                return this;
            }
            C7681d dVar = this.f17050c;
            if (dVar.mo20109r()) {
                return this;
            }
            C7676c cVar = this.f17048a;
            int i = cVar.f17028f;
            if (i != 0) {
                return i != 4 ? mo20145w().mo20131j(this) : mo20151z(false).mo20131j(this);
            }
            C7681d dVar2 = this.f17049b;
            C7681d c = dVar.mo20094c(dVar);
            C7681d m = c.mo20104m();
            C7681d c2 = m14866A(dVar2.mo20104m()).mo20094c(this.f17048a.f17024b);
            C7681d g = dVar2.mo20094c(dVar2).mo20094c(dVar2).mo20101j(m).mo20098g(c2.mo20104m());
            if (g.mo20109r()) {
                return this.f17048a.mo20089p();
            }
            C7681d n = g.mo20101j(c).mo20105n();
            C7681d j = g.mo20101j(n).mo20101j(c2);
            C7681d g2 = m.mo20104m().mo20101j(n).mo20098g(j);
            C7681d c3 = g2.mo20098g(j).mo20101j(j.mo20094c(g2)).mo20094c(dVar2);
            return new C7691e(cVar, c3, dVar2.mo20098g(c3).mo20101j(g2).mo20098g(dVar), this.f17052e);
        }

        /* renamed from: y */
        public final C7681d mo20150y(C7681d dVar, C7681d dVar2) {
            C7681d dVar3 = this.f17048a.f17024b;
            if (dVar3.mo20109r() || dVar.mo20108q()) {
                return dVar3;
            }
            if (dVar2 == null) {
                dVar2 = dVar.mo20104m();
            }
            C7681d m = dVar2.mo20104m();
            C7681d k = dVar3.mo20102k();
            return k.mo20107p() < dVar3.mo20107p() ? m.mo20101j(k).mo20102k() : m.mo20101j(dVar3);
        }

        /* renamed from: z */
        public final C7691e mo20151z(boolean z) {
            C7681d dVar;
            C7681d dVar2 = this.f17049b;
            C7681d dVar3 = this.f17050c;
            C7681d dVar4 = this.f17051d[0];
            C7681d C = mo20149C();
            C7681d c = m14866A(dVar2.mo20104m()).mo20094c(C);
            C7681d c2 = dVar3.mo20094c(dVar3);
            C7681d j = c2.mo20101j(dVar3);
            C7681d j2 = dVar2.mo20101j(j);
            C7681d c3 = j2.mo20094c(j2);
            C7681d g = c.mo20104m().mo20098g(c3.mo20094c(c3));
            C7681d m = j.mo20104m();
            C7681d c4 = m.mo20094c(m);
            C7681d g2 = c.mo20101j(c3.mo20098g(g)).mo20098g(c4);
            if (z) {
                C7681d j3 = c4.mo20101j(C);
                dVar = j3.mo20094c(j3);
            } else {
                dVar = null;
            }
            if (!dVar4.mo20108q()) {
                c2 = c2.mo20101j(dVar4);
            }
            return new C7691e(this.f17048a, g, g2, new C7681d[]{c2, dVar}, this.f17052e);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7686e(p209p6.C7676c r7, p209p6.C7681d r8, p209p6.C7681d r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0007
        L_0x0005:
            int r1 = r7.f17028f
        L_0x0007:
            if (r1 == 0) goto L_0x0041
            r2 = 5
            if (r1 == r2) goto L_0x0041
            java.math.BigInteger r2 = p209p6.C7675b.f17019b
            p6.d r2 = r7.mo20073b(r2)
            r3 = 1
            if (r1 == r3) goto L_0x003c
            r4 = 2
            if (r1 == r4) goto L_0x003c
            r5 = 3
            if (r1 == r5) goto L_0x0033
            r5 = 4
            if (r1 == r5) goto L_0x002a
            r4 = 6
            if (r1 != r4) goto L_0x0022
            goto L_0x003c
        L_0x0022:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L_0x002a:
            p6.d[] r1 = new p209p6.C7681d[r4]
            r1[r0] = r2
            p6.d r0 = r7.f17024b
            r1[r3] = r0
            goto L_0x0043
        L_0x0033:
            p6.d[] r1 = new p209p6.C7681d[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            goto L_0x0043
        L_0x003c:
            p6.d[] r1 = new p209p6.C7681d[r3]
            r1[r0] = r2
            goto L_0x0043
        L_0x0041:
            p6.d[] r1 = f17047g
        L_0x0043:
            r6.<init>(r7, r8, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p6.C7686e.<init>(p6.c, p6.d, p6.d):void");
    }

    public C7686e(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr) {
        this.f17053f = null;
        this.f17048a = cVar;
        this.f17049b = dVar;
        this.f17050c = dVar2;
        this.f17051d = dVarArr;
    }

    /* renamed from: a */
    public C7681d mo20120a() {
        C7681d[] dVarArr = this.f17051d;
        if (dVarArr.length <= 0) {
            return null;
        }
        return dVarArr[0];
    }

    /* renamed from: b */
    public final C7686e mo20121b(BigInteger bigInteger) {
        C3436p pVar;
        C7676c cVar = this.f17048a;
        synchronized (cVar) {
            if (cVar.f17030h == null) {
                cVar.f17030h = cVar.mo20088o();
            }
            pVar = cVar.f17030h;
        }
        pVar.getClass();
        int signum = bigInteger.signum();
        if (signum == 0 || mo20141t()) {
            return this.f17048a.mo20089p();
        }
        C7686e n = pVar.mo12959n(this, bigInteger.abs());
        if (signum <= 0) {
            n = n.mo20144v();
        }
        if (n.mo20126f(false, false)) {
            return n;
        }
        throw new IllegalStateException("Invalid result");
    }

    /* renamed from: c */
    public final C7686e mo20122c(C7681d dVar) {
        int o = mo20136o();
        if (o != 1) {
            if (o == 2 || o == 3 || o == 4) {
                C7681d m = dVar.mo20104m();
                return this.f17048a.mo20078f(this.f17049b.mo20101j(m), this.f17050c.mo20101j(m.mo20101j(dVar)), this.f17052e);
            } else if (o != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.f17048a.mo20078f(this.f17049b.mo20101j(dVar), this.f17050c.mo20101j(dVar), this.f17052e);
    }

    /* renamed from: d */
    public abstract boolean mo20123d();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20124e(p209p6.C7686e r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            p6.c r1 = r8.f17048a
            p6.c r2 = r9.f17048a
            r3 = 1
            if (r1 != 0) goto L_0x000d
            r4 = r3
            goto L_0x000e
        L_0x000d:
            r4 = r0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            r5 = r3
            goto L_0x0013
        L_0x0012:
            r5 = r0
        L_0x0013:
            boolean r6 = r8.mo20141t()
            boolean r7 = r9.mo20141t()
            if (r6 != 0) goto L_0x0068
            if (r7 == 0) goto L_0x0020
            goto L_0x0068
        L_0x0020:
            if (r4 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            p6.e r9 = r9.mo20140s()
        L_0x002b:
            r1 = r8
            goto L_0x004e
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            p6.e r1 = r8.mo20140s()
            goto L_0x004e
        L_0x0034:
            boolean r2 = r1.mo20086m(r2)
            if (r2 != 0) goto L_0x003b
            return r0
        L_0x003b:
            r2 = 2
            p6.e[] r4 = new p209p6.C7686e[r2]
            r4[r0] = r8
            p6.e r9 = r1.mo20080h(r9)
            r4[r3] = r9
            r9 = 0
            r1.mo20084k(r4, r0, r2, r9)
            r1 = r4[r0]
            r9 = r4[r3]
        L_0x004e:
            p6.d r2 = r1.f17049b
            p6.d r4 = r9.f17049b
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0067
            p6.d r1 = r1.mo20138q()
            p6.d r9 = r9.mo20138q()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0067
            r0 = r3
        L_0x0067:
            return r0
        L_0x0068:
            if (r6 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0077
            if (r4 != 0) goto L_0x0076
            if (r5 != 0) goto L_0x0076
            boolean r9 = r1.mo20086m(r2)
            if (r9 == 0) goto L_0x0077
        L_0x0076:
            r0 = r3
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p6.C7686e.mo20124e(p6.e):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7686e)) {
            return false;
        }
        return mo20124e((C7686e) obj);
    }

    /* renamed from: f */
    public final boolean mo20126f(boolean z, boolean z2) {
        if (mo20141t()) {
            return true;
        }
        return !((C7698l) this.f17048a.mo20083j(this, "bc_validity", new C7687a(z, z2))).f17070a;
    }

    /* renamed from: g */
    public final byte[] mo20127g(boolean z) {
        if (mo20141t()) {
            return new byte[1];
        }
        C7686e s = mo20140s();
        byte[] t = s.f17049b.mo20111t();
        if (z) {
            byte[] bArr = new byte[(t.length + 1)];
            bArr[0] = (byte) (s.mo20143u() ? 3 : 2);
            System.arraycopy(t, 0, bArr, 1, t.length);
            return bArr;
        }
        byte[] t2 = s.mo20138q().mo20111t();
        byte[] bArr2 = new byte[(t.length + t2.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(t, 0, bArr2, 1, t.length);
        System.arraycopy(t2, 0, bArr2, t.length + 1, t2.length);
        return bArr2;
    }

    /* renamed from: h */
    public C7686e mo20128h(int i) {
        if (i >= 0) {
            C7686e eVar = this;
            while (true) {
                i--;
                if (i < 0) {
                    return eVar;
                }
                eVar = eVar.mo20145w();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public final int hashCode() {
        C7676c cVar = this.f17048a;
        int i = cVar == null ? 0 : ~cVar.hashCode();
        if (mo20141t()) {
            return i;
        }
        C7686e s = mo20140s();
        return (i ^ (s.f17049b.hashCode() * 17)) ^ (s.mo20138q().hashCode() * 257);
    }

    /* renamed from: i */
    public C7686e mo20130i(C7681d dVar) {
        return mo20141t() ? this : this.f17048a.mo20079g(this.f17049b.mo20101j(dVar), this.f17050c, this.f17051d, this.f17052e);
    }

    /* renamed from: j */
    public abstract C7686e mo20131j(C7686e eVar);

    /* renamed from: k */
    public boolean mo20132k() {
        BigInteger bigInteger;
        if (C7675b.f17019b.equals(this.f17048a.f17027e) || (bigInteger = this.f17048a.f17026d) == null) {
            return true;
        }
        BigInteger abs = bigInteger.abs();
        C7686e p = this.f17048a.mo20089p();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                p = this;
            }
            C7686e eVar = this;
            for (int i = 1; i < bitLength; i++) {
                eVar = eVar.mo20145w();
                if (abs.testBit(i)) {
                    p = p.mo20131j(eVar);
                }
            }
        }
        if (bigInteger.signum() < 0) {
            p = p.mo20144v();
        }
        return p.mo20141t();
    }

    /* renamed from: l */
    public C7686e mo20133l(C7681d dVar) {
        return mo20141t() ? this : this.f17048a.mo20079g(this.f17049b, this.f17050c.mo20101j(dVar), this.f17051d, this.f17052e);
    }

    /* renamed from: m */
    public C7686e mo20134m(C7686e eVar) {
        return mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public abstract C7686e mo20135n();

    /* renamed from: o */
    public final int mo20136o() {
        C7676c cVar = this.f17048a;
        if (cVar == null) {
            return 0;
        }
        return cVar.f17028f;
    }

    /* renamed from: p */
    public final C7681d mo20137p() {
        mo20139r();
        return mo20138q();
    }

    /* renamed from: q */
    public C7681d mo20138q() {
        return this.f17050c;
    }

    /* renamed from: r */
    public final void mo20139r() {
        int o = mo20136o();
        boolean z = false;
        if (o == 0 || o == 5 || mo20141t() || this.f17051d[0].mo20108q()) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    /* renamed from: s */
    public final C7686e mo20140s() {
        int o;
        if (mo20141t() || (o = mo20136o()) == 0 || o == 5) {
            return this;
        }
        C7681d a = mo20120a();
        return a.mo20108q() ? this : mo20122c(a.mo20105n());
    }

    /* renamed from: t */
    public final boolean mo20141t() {
        if (!(this.f17049b == null || this.f17050c == null)) {
            C7681d[] dVarArr = this.f17051d;
            if (dVarArr.length <= 0 || !dVarArr[0].mo20109r()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        if (mo20141t()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.f17049b);
        stringBuffer.append(',');
        stringBuffer.append(this.f17050c);
        for (C7681d append : this.f17051d) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public abstract boolean mo20143u();

    /* renamed from: v */
    public abstract C7686e mo20144v();

    /* renamed from: w */
    public abstract C7686e mo20145w();

    /* renamed from: x */
    public C7686e mo20146x() {
        return mo20134m(this);
    }
}
