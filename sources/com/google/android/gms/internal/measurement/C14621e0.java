package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import kotlin.jvm.internal.C19388s;
import p504ai.C13983i;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
public final class C14621e0 extends C14849w {
    public C14621e0() {
        this.f33140a.add(zzbl.ADD);
        this.f33140a.add(zzbl.DIVIDE);
        this.f33140a.add(zzbl.MODULUS);
        this.f33140a.add(zzbl.MULTIPLY);
        this.f33140a.add(zzbl.NEGATE);
        this.f33140a.add(zzbl.POST_DECREMENT);
        this.f33140a.add(zzbl.POST_INCREMENT);
        this.f33140a.add(zzbl.PRE_DECREMENT);
        this.f33140a.add(zzbl.PRE_INCREMENT);
        this.f33140a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C19388s.m32834M0(str).ordinal();
        if (ordinal == 0) {
            C14763p c = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.ADD, arrayList, 2, 0));
            C14763p c2 = c3Var.mo50400c((C14763p) arrayList.get(1));
            if ((c instanceof C14711l) || (c instanceof C14813t) || (c2 instanceof C14711l) || (c2 instanceof C14813t)) {
                String valueOf = String.valueOf(c.zzi());
                String valueOf2 = String.valueOf(c2.zzi());
                return new C14813t(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new C14672i(Double.valueOf(c2.zzh().doubleValue() + c.zzh().doubleValue()));
        } else if (ordinal == 21) {
            return new C14672i(Double.valueOf(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.DIVIDE, arrayList, 2, 0)).zzh().doubleValue() / c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()));
        } else {
            if (ordinal == 59) {
                C14763p c3 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.SUBTRACT, arrayList, 2, 0));
                Double valueOf3 = Double.valueOf(-c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue());
                if (valueOf3 == null) {
                    valueOf3 = Double.valueOf(Double.NaN);
                }
                return new C14672i(Double.valueOf(valueOf3.doubleValue() + c3.zzh().doubleValue()));
            } else if (ordinal == 52 || ordinal == 53) {
                C19388s.m32840P0(str, arrayList, 2);
                C14763p c4 = c3Var.mo50400c((C14763p) arrayList.get(0));
                c3Var.mo50400c((C14763p) arrayList.get(1));
                return c4;
            } else if (ordinal == 55 || ordinal == 56) {
                C19388s.m32840P0(str, arrayList, 1);
                return c3Var.mo50400c((C14763p) arrayList.get(0));
            } else {
                switch (ordinal) {
                    case 44:
                        return new C14672i(Double.valueOf(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.MODULUS, arrayList, 2, 0)).zzh().doubleValue() % c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()));
                    case 45:
                        return new C14672i(Double.valueOf(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.MULTIPLY, arrayList, 2, 0)).zzh().doubleValue() * c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()));
                    case 46:
                        return new C14672i(Double.valueOf(-c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.NEGATE, arrayList, 1, 0)).zzh().doubleValue()));
                    default:
                        mo50946b(str);
                        throw null;
                }
            }
        }
    }
}
