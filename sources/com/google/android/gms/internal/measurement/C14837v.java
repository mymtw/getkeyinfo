package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import kotlin.jvm.internal.C19388s;
import p504ai.C13983i;

/* renamed from: com.google.android.gms.internal.measurement.v */
public final class C14837v extends C14849w {
    public C14837v() {
        this.f33140a.add(zzbl.BITWISE_AND);
        this.f33140a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f33140a.add(zzbl.BITWISE_NOT);
        this.f33140a.add(zzbl.BITWISE_OR);
        this.f33140a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f33140a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f33140a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        zzbl zzbl = zzbl.ADD;
        switch (C19388s.m32834M0(str).ordinal()) {
            case 4:
                return new C14672i(Double.valueOf((double) (C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_AND, arrayList, 2, 0)).zzh().doubleValue()) & C19388s.m32828J0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()))));
            case 5:
                return new C14672i(Double.valueOf((double) (C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_LEFT_SHIFT, arrayList, 2, 0)).zzh().doubleValue()) << ((int) (C19388s.m32832L0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 6:
                return new C14672i(Double.valueOf((double) (~C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_NOT, arrayList, 1, 0)).zzh().doubleValue()))));
            case 7:
                return new C14672i(Double.valueOf((double) (C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_OR, arrayList, 2, 0)).zzh().doubleValue()) | C19388s.m32828J0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()))));
            case 8:
                return new C14672i(Double.valueOf((double) (C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_RIGHT_SHIFT, arrayList, 2, 0)).zzh().doubleValue()) >> ((int) (C19388s.m32832L0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 9:
                return new C14672i(Double.valueOf((double) (C19388s.m32832L0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT, arrayList, 2, 0)).zzh().doubleValue()) >>> ((int) (C19388s.m32832L0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 10:
                return new C14672i(Double.valueOf((double) (C19388s.m32828J0(c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.BITWISE_XOR, arrayList, 2, 0)).zzh().doubleValue()) ^ C19388s.m32828J0(c3Var.mo50400c((C14763p) arrayList.get(1)).zzh().doubleValue()))));
            default:
                mo50946b(str);
                throw null;
        }
    }
}
