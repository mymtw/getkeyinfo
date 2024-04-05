package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.C1339j1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.v5 */
public final class C14843v5 extends C14685j {

    /* renamed from: d */
    public final /* synthetic */ int f33132d = 1;

    /* renamed from: e */
    public final Object f33133e;

    public C14843v5(C1339j1 j1Var) {
        super("internal.remoteConfig");
        this.f33133e = j1Var;
        this.f32891c.put("getValue", new C14732m7(j1Var));
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List list) {
        switch (this.f33132d) {
            case 0:
                C19388s.m32840P0(this.f32890b, list, 3);
                String zzi = c3Var.mo50400c((C14763p) list.get(0)).zzi();
                long I0 = (long) C19388s.m32826I0(c3Var.mo50400c((C14763p) list.get(1)).zzh().doubleValue());
                C14763p c = c3Var.mo50400c((C14763p) list.get(2));
                ((C14594c) this.f33133e).f32770c.add(new C14581b(zzi, I0, c instanceof C14724m ? C19388s.m32838O0((C14724m) c) : new HashMap()));
                return C14763p.f33033g0;
            default:
                return C14763p.f33033g0;
        }
    }

    public C14843v5(C14594c cVar) {
        super("internal.eventLogger");
        this.f33133e = cVar;
    }
}
