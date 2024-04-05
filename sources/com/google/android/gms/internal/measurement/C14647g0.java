package com.google.android.gms.internal.measurement;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19388s;
import p504ai.C13983i;

/* renamed from: com.google.android.gms.internal.measurement.g0 */
public final class C14647g0 extends C14849w {
    public C14647g0() {
        this.f33140a.add(zzbl.ASSIGN);
        this.f33140a.add(zzbl.CONST);
        this.f33140a.add(zzbl.CREATE_ARRAY);
        this.f33140a.add(zzbl.CREATE_OBJECT);
        this.f33140a.add(zzbl.EXPRESSION_LIST);
        this.f33140a.add(zzbl.GET);
        this.f33140a.add(zzbl.GET_INDEX);
        this.f33140a.add(zzbl.GET_PROPERTY);
        this.f33140a.add(zzbl.NULL);
        this.f33140a.add(zzbl.SET_PROPERTY);
        this.f33140a.add(zzbl.TYPEOF);
        this.f33140a.add(zzbl.UNDEFINED);
        this.f33140a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = C19388s.m32834M0(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C14763p c = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.ASSIGN, arrayList, 2, 0));
            if (!(c instanceof C14813t)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{c.getClass().getCanonicalName()}));
            } else if (c3Var.mo50405h(c.zzi())) {
                C14763p c2 = c3Var.mo50400c((C14763p) arrayList.get(1));
                c3Var.mo50404g(c.zzi(), c2);
                return c2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{c.zzi()}));
            }
        } else if (ordinal == 14) {
            C19388s.m32842Q0(zzbl.CONST.name(), arrayList, 2);
            if (arrayList.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < arrayList.size() - 1) {
                    C14763p c3 = c3Var.mo50400c((C14763p) arrayList.get(i2));
                    if (c3 instanceof C14813t) {
                        String zzi = c3.zzi();
                        c3Var.mo50403f(zzi, c3Var.mo50400c((C14763p) arrayList.get(i2 + 1)));
                        ((Map) c3Var.f32781d).put(zzi, Boolean.TRUE);
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{c3.getClass().getCanonicalName()}));
                    }
                }
                return C14763p.f33033g0;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
        } else if (ordinal == 24) {
            C19388s.m32842Q0(zzbl.EXPRESSION_LIST.name(), arrayList, 1);
            C14763p pVar = C14763p.f33033g0;
            while (i < arrayList.size()) {
                pVar = c3Var.mo50400c((C14763p) arrayList.get(i));
                if (!(pVar instanceof C14659h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return pVar;
        } else if (ordinal == 33) {
            C14763p c4 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.GET, arrayList, 1, 0));
            if (c4 instanceof C14813t) {
                return c3Var.mo50402e(c4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{c4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C19388s.m32840P0(zzbl.NULL.name(), arrayList, 0);
            return C14763p.f33034h0;
        } else if (ordinal == 58) {
            C14763p c5 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.SET_PROPERTY, arrayList, 3, 0));
            C14763p c6 = c3Var.mo50400c((C14763p) arrayList.get(1));
            C14763p c7 = c3Var.mo50400c((C14763p) arrayList.get(2));
            if (c5 == C14763p.f33033g0 || c5 == C14763p.f33034h0) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{c6.zzi(), c5.zzi()}));
            }
            if ((c5 instanceof C14633f) && (c6 instanceof C14672i)) {
                ((C14633f) c5).mo50497v(c6.zzh().intValue(), c7);
            } else if (c5 instanceof C14711l) {
                ((C14711l) c5).mo50484e(c6.zzi(), c7);
            }
            return c7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C14763p c8 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.GET_PROPERTY, arrayList, 2, 0));
                    C14763p c9 = c3Var.mo50400c((C14763p) arrayList.get(1));
                    if ((c8 instanceof C14633f) && C19388s.m32846S0(c9)) {
                        return ((C14633f) c8).mo50491n(c9.zzh().intValue());
                    }
                    if (c8 instanceof C14711l) {
                        return ((C14711l) c8).mo50489l(c9.zzi());
                    }
                    if (c8 instanceof C14813t) {
                        if ("length".equals(c9.zzi())) {
                            return new C14672i(Double.valueOf((double) c8.zzi().length()));
                        }
                        if (C19388s.m32846S0(c9) && c9.zzh().doubleValue() < ((double) c8.zzi().length())) {
                            return new C14813t(String.valueOf(c8.zzi().charAt(c9.zzh().intValue())));
                        }
                    }
                    return C14763p.f33033g0;
                }
                switch (ordinal) {
                    case 62:
                        C14763p c10 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.TYPEOF, arrayList, 1, 0));
                        if (c10 instanceof C14825u) {
                            str2 = "undefined";
                        } else if (c10 instanceof C14646g) {
                            str2 = "boolean";
                        } else if (c10 instanceof C14672i) {
                            str2 = "number";
                        } else if (c10 instanceof C14813t) {
                            str2 = "string";
                        } else if (c10 instanceof C14750o) {
                            str2 = "function";
                        } else if ((c10 instanceof C14776q) || (c10 instanceof C14659h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{c10}));
                        } else {
                            str2 = ResponseConstants.OBJECT;
                        }
                        return new C14813t(str2);
                    case 63:
                        C19388s.m32840P0(zzbl.UNDEFINED.name(), arrayList, 0);
                        return C14763p.f33033g0;
                    case 64:
                        C19388s.m32842Q0(zzbl.VAR.name(), arrayList, 1);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C14763p c11 = c3Var.mo50400c((C14763p) it.next());
                            if (c11 instanceof C14813t) {
                                c3Var.mo50403f(c11.zzi(), C14763p.f33033g0);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{c11.getClass().getCanonicalName()}));
                            }
                        }
                        return C14763p.f33033g0;
                    default:
                        mo50946b(str);
                        throw null;
                }
            } else if (arrayList.isEmpty()) {
                return new C14724m();
            } else {
                if (arrayList.size() % 2 == 0) {
                    C14724m mVar = new C14724m();
                    while (i < arrayList.size() - 1) {
                        C14763p c12 = c3Var.mo50400c((C14763p) arrayList.get(i));
                        C14763p c13 = c3Var.mo50400c((C14763p) arrayList.get(i + 1));
                        if ((c12 instanceof C14659h) || (c13 instanceof C14659h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        mVar.mo50484e(c12.zzi(), c13);
                        i += 2;
                    }
                    return mVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
            }
        } else if (arrayList.isEmpty()) {
            return new C14633f();
        } else {
            C14633f fVar = new C14633f();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C14763p c14 = c3Var.mo50400c((C14763p) it2.next());
                if (!(c14 instanceof C14659h)) {
                    fVar.mo50497v(i, c14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
