package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.C2223f;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.C0023f;
import p203p0.C7647b;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.e */
public final class C2205e {

    /* renamed from: a */
    public C2220d f5221a;

    /* renamed from: b */
    public boolean f5222b = true;

    /* renamed from: c */
    public boolean f5223c = true;

    /* renamed from: d */
    public C2220d f5224d;

    /* renamed from: e */
    public ArrayList<WidgetRun> f5225e = new ArrayList<>();

    /* renamed from: f */
    public C2200b.C2202b f5226f;

    /* renamed from: g */
    public C2200b.C2201a f5227g;

    /* renamed from: h */
    public ArrayList<C2213l> f5228h;

    public C2205e(C2220d dVar) {
        new ArrayList();
        this.f5226f = null;
        this.f5227g = new C2200b.C2201a();
        this.f5228h = new ArrayList<>();
        this.f5221a = dVar;
        this.f5224d = dVar;
    }

    /* renamed from: a */
    public final void mo8320a(DependencyNode dependencyNode, int i, int i2, ArrayList arrayList, C2213l lVar) {
        WidgetRun widgetRun = dependencyNode.f5186d;
        if (widgetRun.f5197c == null) {
            C2220d dVar = this.f5221a;
            if (widgetRun != dVar.f5142d && widgetRun != dVar.f5144e) {
                if (lVar == null) {
                    lVar = new C2213l(widgetRun);
                    arrayList.add(lVar);
                }
                widgetRun.f5197c = lVar;
                lVar.f5234b.add(widgetRun);
                Iterator it = widgetRun.f5202h.f5193k.iterator();
                while (it.hasNext()) {
                    C2204d dVar2 = (C2204d) it.next();
                    if (dVar2 instanceof DependencyNode) {
                        mo8320a((DependencyNode) dVar2, i, 0, arrayList, lVar);
                    }
                }
                Iterator it2 = widgetRun.f5203i.f5193k.iterator();
                while (it2.hasNext()) {
                    C2204d dVar3 = (C2204d) it2.next();
                    if (dVar3 instanceof DependencyNode) {
                        mo8320a((DependencyNode) dVar3, i, 1, arrayList, lVar);
                    }
                }
                if (i == 1 && (widgetRun instanceof C2214m)) {
                    Iterator it3 = ((C2214m) widgetRun).f5235k.f5193k.iterator();
                    while (it3.hasNext()) {
                        C2204d dVar4 = (C2204d) it3.next();
                        if (dVar4 instanceof DependencyNode) {
                            mo8320a((DependencyNode) dVar4, i, 2, arrayList, lVar);
                        }
                    }
                }
                Iterator it4 = widgetRun.f5202h.f5194l.iterator();
                while (it4.hasNext()) {
                    mo8320a((DependencyNode) it4.next(), i, 0, arrayList, lVar);
                }
                Iterator it5 = widgetRun.f5203i.f5194l.iterator();
                while (it5.hasNext()) {
                    mo8320a((DependencyNode) it5.next(), i, 1, arrayList, lVar);
                }
                if (i == 1 && (widgetRun instanceof C2214m)) {
                    Iterator it6 = ((C2214m) widgetRun).f5235k.f5194l.iterator();
                    while (it6.hasNext()) {
                        mo8320a((DependencyNode) it6.next(), i, 2, arrayList, lVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8321b(C2220d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        C2220d dVar2 = dVar;
        Iterator<ConstraintWidget> it = dVar2.f16944p0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f5125P;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (next.f5143d0 == 8) {
                next.f5136a = true;
            } else {
                float f = next.f5168r;
                if (f < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f5160m = 2;
                }
                float f2 = next.f5171u;
                if (f2 < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f5162n = 2;
                }
                if (next.f5129T > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f5160m = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f5162n = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (next.f5160m == 0) {
                            next.f5160m = 3;
                        }
                        if (next.f5162n == 0) {
                            next.f5162n = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && next.f5160m == 1 && (next.f5114E.f5105f == null || next.f5116G.f5105f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour6 == dimensionBehaviour8 && next.f5162n == 1 && (next.f5115F.f5105f == null || next.f5117H.f5105f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour6;
                C2211k kVar = next.f5142d;
                kVar.f5198d = dimensionBehaviour5;
                int i2 = next.f5160m;
                kVar.f5195a = i2;
                C2214m mVar = next.f5144e;
                mVar.f5198d = dimensionBehaviour9;
                int i3 = next.f5162n;
                mVar.f5195a = i3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour5 == dimensionBehaviour10 || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour9 == dimensionBehaviour10 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int r = next.mo8289r();
                    if (dimensionBehaviour5 == dimensionBehaviour10) {
                        r = (dVar.mo8289r() - next.f5114E.f5106g) - next.f5116G.f5106g;
                        dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i4 = r;
                    int o = next.mo8286o();
                    if (dimensionBehaviour9 == dimensionBehaviour10) {
                        i = (dVar.mo8286o() - next.f5115F.f5106g) - next.f5117H.f5106g;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i = o;
                        dimensionBehaviour4 = dimensionBehaviour9;
                    }
                    mo8325f(next, dimensionBehaviour5, i4, dimensionBehaviour4, i);
                    next.f5142d.f5199e.mo8304d(next.mo8289r());
                    next.f5144e.f5199e.mo8304d(next.mo8286o());
                    next.f5136a = true;
                } else {
                    if (dimensionBehaviour5 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i2 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                mo8325f(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int o2 = next.mo8286o();
                            int i5 = (int) ((((float) o2) * next.f5129T) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                            mo8325f(next, dimensionBehaviour11, i5, dimensionBehaviour11, o2);
                            next.f5142d.f5199e.mo8304d(next.mo8289r());
                            next.f5144e.f5199e.mo8304d(next.mo8286o());
                            next.f5136a = true;
                        } else if (i2 == 1) {
                            mo8325f(next, dimensionBehaviour3, 0, dimensionBehaviour9, 0);
                            next.f5142d.f5199e.f5229m = next.mo8289r();
                        } else if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dVar2.f5125P[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour12 == dimensionBehaviour13 || dimensionBehaviour12 == dimensionBehaviour10) {
                                mo8325f(next, dimensionBehaviour13, (int) ((f * ((float) dVar.mo8289r())) + 0.5f), dimensionBehaviour9, next.mo8286o());
                                next.f5142d.f5199e.mo8304d(next.mo8289r());
                                next.f5144e.f5199e.mo8304d(next.mo8286o());
                                next.f5136a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.f5122M;
                            if (constraintAnchorArr[0].f5105f == null || constraintAnchorArr[1].f5105f == null) {
                                mo8325f(next, dimensionBehaviour3, 0, dimensionBehaviour9, 0);
                                next.f5142d.f5199e.mo8304d(next.mo8289r());
                                next.f5144e.f5199e.mo8304d(next.mo8286o());
                                next.f5136a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour5 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i3 == 3) {
                            if (dimensionBehaviour5 == dimensionBehaviour2) {
                                mo8325f(next, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                            }
                            int r2 = next.mo8289r();
                            float f3 = next.f5129T;
                            if (next.f5130U == -1) {
                                f3 = 1.0f / f3;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            mo8325f(next, dimensionBehaviour14, r2, dimensionBehaviour14, (int) ((((float) r2) * f3) + 0.5f));
                            next.f5142d.f5199e.mo8304d(next.mo8289r());
                            next.f5144e.f5199e.mo8304d(next.mo8286o());
                            next.f5136a = true;
                        } else if (i3 == 1) {
                            mo8325f(next, dimensionBehaviour5, 0, dimensionBehaviour2, 0);
                            next.f5144e.f5199e.f5229m = next.mo8286o();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dVar2.f5125P[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                mo8325f(next, dimensionBehaviour5, next.mo8289r(), dimensionBehaviour16, (int) ((f2 * ((float) dVar.mo8286o())) + 0.5f));
                                next.f5142d.f5199e.mo8304d(next.mo8289r());
                                next.f5144e.f5199e.mo8304d(next.mo8286o());
                                next.f5136a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.f5122M;
                            if (constraintAnchorArr2[2].f5105f == null || constraintAnchorArr2[3].f5105f == null) {
                                mo8325f(next, dimensionBehaviour2, 0, dimensionBehaviour9, 0);
                                next.f5142d.f5199e.mo8304d(next.mo8289r());
                                next.f5144e.f5199e.mo8304d(next.mo8286o());
                                next.f5136a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour5 == dimensionBehaviour8 && dimensionBehaviour9 == dimensionBehaviour8) {
                        if (i2 == 1 || i3 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            mo8325f(next, dimensionBehaviour17, 0, dimensionBehaviour17, 0);
                            next.f5142d.f5199e.f5229m = next.mo8289r();
                            next.f5144e.f5199e.f5229m = next.mo8286o();
                        } else if (i3 == 2 && i2 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar2.f5125P;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if ((dimensionBehaviour18 == dimensionBehaviour19 || dimensionBehaviour18 == dimensionBehaviour19) && ((dimensionBehaviour = dimensionBehaviourArr2[1]) == dimensionBehaviour19 || dimensionBehaviour == dimensionBehaviour19)) {
                                ConstraintWidget constraintWidget = next;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviour19;
                                mo8325f(constraintWidget, dimensionBehaviour20, (int) ((f * ((float) dVar.mo8289r())) + 0.5f), dimensionBehaviour19, (int) ((f2 * ((float) dVar.mo8286o())) + 0.5f));
                                next.f5142d.f5199e.mo8304d(next.mo8289r());
                                next.f5144e.f5199e.mo8304d(next.mo8286o());
                                next.f5136a = true;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8322c() {
        ArrayList<WidgetRun> arrayList = this.f5225e;
        arrayList.clear();
        this.f5224d.f5142d.mo8309f();
        this.f5224d.f5144e.mo8309f();
        arrayList.add(this.f5224d.f5142d);
        arrayList.add(this.f5224d.f5144e);
        Iterator<ConstraintWidget> it = this.f5224d.f16944p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C2223f) {
                arrayList.add(new C2209i(next));
            } else {
                if (next.mo8296x()) {
                    if (next.f5138b == null) {
                        next.f5138b = new C2203c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5138b);
                } else {
                    arrayList.add(next.f5142d);
                }
                if (next.mo8297y()) {
                    if (next.f5140c == null) {
                        next.f5140c = new C2203c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5140c);
                } else {
                    arrayList.add(next.f5144e);
                }
                if (next instanceof C7647b) {
                    arrayList.add(new C2210j(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo8309f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f5196b != this.f5224d) {
                next2.mo8307d();
            }
        }
        this.f5228h.clear();
        mo8324e(this.f5221a.f5142d, 0, this.f5228h);
        mo8324e(this.f5221a.f5144e, 1, this.f5228h);
        this.f5222b = false;
    }

    /* renamed from: d */
    public final int mo8323d(C2220d dVar, int i) {
        float f;
        C2205e eVar = this;
        C2220d dVar2 = dVar;
        int i2 = i;
        int size = eVar.f5228h.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            C2213l lVar = eVar.f5228h.get(i3);
            WidgetRun widgetRun = lVar.f5233a;
            if (widgetRun instanceof C2203c) {
                if (((C2203c) widgetRun).f5200f != i2) {
                    j = Math.max(j, j2);
                    i3++;
                    j2 = 0;
                    eVar = this;
                    dVar2 = dVar;
                }
            } else if (i2 == 0) {
                if (!(widgetRun instanceof C2211k)) {
                    j = Math.max(j, j2);
                    i3++;
                    j2 = 0;
                    eVar = this;
                    dVar2 = dVar;
                }
            } else if (!(widgetRun instanceof C2214m)) {
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                dVar2 = dVar;
            }
            DependencyNode dependencyNode = (i2 == 0 ? dVar2.f5142d : dVar2.f5144e).f5202h;
            DependencyNode dependencyNode2 = (i2 == 0 ? dVar2.f5142d : dVar2.f5144e).f5203i;
            boolean contains = widgetRun.f5202h.f5194l.contains(dependencyNode);
            boolean contains2 = lVar.f5233a.f5203i.f5194l.contains(dependencyNode2);
            long j3 = lVar.f5233a.mo8311j();
            if (!contains || !contains2) {
                if (contains) {
                    DependencyNode dependencyNode3 = lVar.f5233a.f5202h;
                    j2 = Math.max(C2213l.m4864b(dependencyNode3, (long) dependencyNode3.f5188f), ((long) lVar.f5233a.f5202h.f5188f) + j3);
                } else if (contains2) {
                    DependencyNode dependencyNode4 = lVar.f5233a.f5203i;
                    j2 = Math.max(-C2213l.m4863a(dependencyNode4, (long) dependencyNode4.f5188f), ((long) (-lVar.f5233a.f5203i.f5188f)) + j3);
                } else {
                    WidgetRun widgetRun2 = lVar.f5233a;
                    j2 = (widgetRun2.mo8311j() + ((long) widgetRun2.f5202h.f5188f)) - ((long) lVar.f5233a.f5203i.f5188f);
                }
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                dVar2 = dVar;
            } else {
                long b = C2213l.m4864b(lVar.f5233a.f5202h, j2);
                long a = C2213l.m4863a(lVar.f5233a.f5203i, j2);
                long j4 = b - j3;
                WidgetRun widgetRun3 = lVar.f5233a;
                int i4 = widgetRun3.f5203i.f5188f;
                if (j4 >= ((long) (-i4))) {
                    j4 += (long) i4;
                }
                long j5 = (long) widgetRun3.f5202h.f5188f;
                long j6 = ((-a) - j3) - j5;
                if (j6 >= j5) {
                    j6 -= j5;
                }
                ConstraintWidget constraintWidget = widgetRun3.f5196b;
                if (i2 == 0) {
                    f = constraintWidget.f5137a0;
                } else if (i2 == 1) {
                    f = constraintWidget.f5139b0;
                } else {
                    constraintWidget.getClass();
                    f = -1.0f;
                }
                float f2 = (float) (f > 0.0f ? (long) ((((float) j4) / (1.0f - f)) + (((float) j6) / f)) : 0);
                long b2 = ((long) ((f2 * f) + 0.5f)) + j3 + ((long) C0023f.m103b(1.0f, f, f2, 0.5f));
                WidgetRun widgetRun4 = lVar.f5233a;
                j2 = (((long) widgetRun4.f5202h.f5188f) + b2) - ((long) widgetRun4.f5203i.f5188f);
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                dVar2 = dVar;
            }
        }
        return (int) j;
    }

    /* renamed from: e */
    public final void mo8324e(WidgetRun widgetRun, int i, ArrayList<C2213l> arrayList) {
        Iterator it = widgetRun.f5202h.f5193k.iterator();
        while (it.hasNext()) {
            C2204d dVar = (C2204d) it.next();
            if (dVar instanceof DependencyNode) {
                mo8320a((DependencyNode) dVar, i, 0, arrayList, (C2213l) null);
            } else if (dVar instanceof WidgetRun) {
                mo8320a(((WidgetRun) dVar).f5202h, i, 0, arrayList, (C2213l) null);
            }
        }
        Iterator it2 = widgetRun.f5203i.f5193k.iterator();
        while (it2.hasNext()) {
            C2204d dVar2 = (C2204d) it2.next();
            if (dVar2 instanceof DependencyNode) {
                mo8320a((DependencyNode) dVar2, i, 1, arrayList, (C2213l) null);
            } else if (dVar2 instanceof WidgetRun) {
                mo8320a(((WidgetRun) dVar2).f5203i, i, 1, arrayList, (C2213l) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C2214m) widgetRun).f5235k.f5193k.iterator();
            while (it3.hasNext()) {
                C2204d dVar3 = (C2204d) it3.next();
                if (dVar3 instanceof DependencyNode) {
                    mo8320a((DependencyNode) dVar3, i, 2, arrayList, (C2213l) null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo8325f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        C2200b.C2201a aVar = this.f5227g;
        aVar.f5209a = dimensionBehaviour;
        aVar.f5210b = dimensionBehaviour2;
        aVar.f5211c = i;
        aVar.f5212d = i2;
        ((ConstraintLayout.C2235b) this.f5226f).mo8460b(constraintWidget, aVar);
        constraintWidget.mo8272L(this.f5227g.f5213e);
        constraintWidget.mo8269I(this.f5227g.f5214f);
        C2200b.C2201a aVar2 = this.f5227g;
        constraintWidget.f5176z = aVar2.f5216h;
        int i3 = aVar2.f5215g;
        constraintWidget.f5133X = i3;
        constraintWidget.f5176z = i3 > 0;
    }

    /* renamed from: g */
    public final void mo8326g() {
        C2199a aVar;
        Iterator<ConstraintWidget> it = this.f5221a.f16944p0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f5136a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f5125P;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.f5160m;
                int i2 = next.f5162n;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2206f fVar = next.f5142d.f5199e;
                boolean z3 = fVar.f5192j;
                C2206f fVar2 = next.f5144e.f5199e;
                boolean z4 = fVar2.f5192j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    mo8325f(next, dimensionBehaviour4, fVar.f5189g, dimensionBehaviour4, fVar2.f5189g);
                    next.f5136a = true;
                } else if (z3 && z) {
                    mo8325f(next, ConstraintWidget.DimensionBehaviour.FIXED, fVar.f5189g, dimensionBehaviour3, fVar2.f5189g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f5144e.f5199e.f5229m = next.mo8286o();
                    } else {
                        next.f5144e.f5199e.mo8304d(next.mo8286o());
                        next.f5136a = true;
                    }
                } else if (z4 && z2) {
                    mo8325f(next, dimensionBehaviour3, fVar.f5189g, ConstraintWidget.DimensionBehaviour.FIXED, fVar2.f5189g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f5142d.f5199e.f5229m = next.mo8289r();
                    } else {
                        next.f5142d.f5199e.mo8304d(next.mo8289r());
                        next.f5136a = true;
                    }
                }
                if (next.f5136a && (aVar = next.f5144e.f5236l) != null) {
                    aVar.mo8304d(next.f5133X);
                }
            }
        }
    }
}
