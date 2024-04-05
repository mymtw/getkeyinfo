package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.C1339j1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19388s;
import p106f8.C6810a;
import p106f8.C6811b;
import p504ai.C13983i;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
public final class C14608d0 extends C14849w {
    public C14608d0() {
        this.f33140a.add(zzbl.FOR_IN);
        this.f33140a.add(zzbl.FOR_IN_CONST);
        this.f33140a.add(zzbl.FOR_IN_LET);
        this.f33140a.add(zzbl.FOR_LET);
        this.f33140a.add(zzbl.FOR_OF);
        this.f33140a.add(zzbl.FOR_OF_CONST);
        this.f33140a.add(zzbl.FOR_OF_LET);
        this.f33140a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    public static C14763p m23423c(C14595c0 c0Var, Iterator<C14763p> it, C14763p pVar) {
        if (it != null) {
            while (it.hasNext()) {
                C14763p d = c0Var.mo5884a(it.next()).mo50401d((C14633f) pVar);
                if (d instanceof C14659h) {
                    C14659h hVar = (C14659h) d;
                    if ("break".equals(hVar.f32858c)) {
                        return C14763p.f33033g0;
                    }
                    if ("return".equals(hVar.f32858c)) {
                        return hVar;
                    }
                }
            }
        }
        return C14763p.f33033g0;
    }

    /* renamed from: d */
    public static C14763p m23424d(C14595c0 c0Var, C14763p pVar, C14763p pVar2) {
        if (pVar instanceof Iterable) {
            return m23423c(c0Var, ((Iterable) pVar).iterator(), pVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C19388s.m32834M0(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    if (C13983i.m21491j(zzbl.FOR_IN, arrayList, 3, 0) instanceof C14813t) {
                        return m23423c(new C1339j1(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)).mo50482a(), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    if (C13983i.m21491j(zzbl.FOR_IN_CONST, arrayList, 3, 0) instanceof C14813t) {
                        return m23423c(new C6810a(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)).mo50482a(), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    if (C13983i.m21491j(zzbl.FOR_IN_LET, arrayList, 3, 0) instanceof C14813t) {
                        return m23423c(new C6811b(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)).mo50482a(), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C14763p c = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.FOR_LET, arrayList, 4, 0));
                    if (c instanceof C14633f) {
                        C14633f fVar = (C14633f) c;
                        C14763p pVar = (C14763p) arrayList.get(1);
                        C14763p pVar2 = (C14763p) arrayList.get(2);
                        C14763p c2 = c3Var.mo50400c((C14763p) arrayList.get(3));
                        C14598c3 b = c3Var.mo50399b();
                        for (int i = 0; i < fVar.mo50490m(); i++) {
                            String zzi = fVar.mo50491n(i).zzi();
                            b.mo50404g(zzi, c3Var.mo50402e(zzi));
                        }
                        while (c3Var.mo50400c(pVar).zzg().booleanValue()) {
                            C14763p d = c3Var.mo50401d((C14633f) c2);
                            if (d instanceof C14659h) {
                                C14659h hVar = (C14659h) d;
                                if ("break".equals(hVar.f32858c)) {
                                    return C14763p.f33033g0;
                                }
                                if ("return".equals(hVar.f32858c)) {
                                    return hVar;
                                }
                            }
                            C14598c3 b2 = c3Var.mo50399b();
                            for (int i2 = 0; i2 < fVar.mo50490m(); i2++) {
                                String zzi2 = fVar.mo50491n(i2).zzi();
                                b2.mo50404g(zzi2, b.mo50402e(zzi2));
                            }
                            b2.mo50400c(pVar2);
                            b = b2;
                        }
                        return C14763p.f33033g0;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    if (C13983i.m21491j(zzbl.FOR_OF, arrayList, 3, 0) instanceof C14813t) {
                        return m23424d(new C1339j1(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    if (C13983i.m21491j(zzbl.FOR_OF_CONST, arrayList, 3, 0) instanceof C14813t) {
                        return m23424d(new C6810a(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    if (C13983i.m21491j(zzbl.FOR_OF_LET, arrayList, 3, 0) instanceof C14813t) {
                        return m23424d(new C6811b(c3Var, ((C14763p) arrayList.get(0)).zzi()), c3Var.mo50400c((C14763p) arrayList.get(1)), c3Var.mo50400c((C14763p) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    mo50946b(str);
                    throw null;
            }
        } else {
            C14763p pVar3 = (C14763p) C13983i.m21491j(zzbl.WHILE, arrayList, 4, 0);
            C14763p pVar4 = (C14763p) arrayList.get(1);
            C14763p c3 = c3Var.mo50400c((C14763p) arrayList.get(3));
            if (c3Var.mo50400c((C14763p) arrayList.get(2)).zzg().booleanValue()) {
                C14763p d2 = c3Var.mo50401d((C14633f) c3);
                if (d2 instanceof C14659h) {
                    C14659h hVar2 = (C14659h) d2;
                    if ("break".equals(hVar2.f32858c)) {
                        return C14763p.f33033g0;
                    }
                    if ("return".equals(hVar2.f32858c)) {
                        return hVar2;
                    }
                }
            }
            while (c3Var.mo50400c(pVar3).zzg().booleanValue()) {
                C14763p d3 = c3Var.mo50401d((C14633f) c3);
                if (d3 instanceof C14659h) {
                    C14659h hVar3 = (C14659h) d3;
                    if ("break".equals(hVar3.f32858c)) {
                        return C14763p.f33033g0;
                    }
                    if ("return".equals(hVar3.f32858c)) {
                        return hVar3;
                    }
                }
                c3Var.mo50400c(pVar4);
            }
            return C14763p.f33033g0;
        }
    }
}
