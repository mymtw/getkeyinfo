package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import kotlin.jvm.internal.C19388s;
import p504ai.C13983i;

/* renamed from: com.google.android.gms.internal.measurement.b0 */
public final class C14582b0 extends C14849w {
    public C14582b0() {
        this.f33140a.add(zzbl.AND);
        this.f33140a.add(zzbl.NOT);
        this.f33140a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C19388s.m32834M0(str).ordinal();
        if (ordinal == 1) {
            C14763p c = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.AND, arrayList, 2, 0));
            return !c.zzg().booleanValue() ? c : c3Var.mo50400c((C14763p) arrayList.get(1));
        } else if (ordinal == 47) {
            return new C14646g(Boolean.valueOf(!c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.NOT, arrayList, 1, 0)).zzg().booleanValue()));
        } else {
            if (ordinal == 50) {
                C14763p c2 = c3Var.mo50400c((C14763p) C13983i.m21491j(zzbl.OR, arrayList, 2, 0));
                return c2.zzg().booleanValue() ? c2 : c3Var.mo50400c((C14763p) arrayList.get(1));
            }
            mo50946b(str);
            throw null;
        }
    }
}
