package com.google.android.gms.internal.measurement;

import com.etsy.android.lib.models.Listing;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.C19388s;
import p106f8.C6811b;

/* renamed from: com.google.android.gms.internal.measurement.nb */
public final class C14749nb extends C14685j {

    /* renamed from: d */
    public final C6811b f33011d;

    public C14749nb(C6811b bVar) {
        super("internal.registerCallback");
        this.f33011d = bVar;
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List<C14763p> list) {
        TreeMap treeMap;
        C19388s.m32840P0(this.f32890b, list, 3);
        c3Var.mo50400c(list.get(0)).zzi();
        C14763p c = c3Var.mo50400c(list.get(1));
        if (c instanceof C14750o) {
            C14763p c2 = c3Var.mo50400c(list.get(2));
            if (c2 instanceof C14724m) {
                C14724m mVar = (C14724m) c2;
                if (mVar.mo50483c("type")) {
                    String zzi = mVar.mo50489l("type").zzi();
                    int J0 = mVar.mo50483c("priority") ? C19388s.m32828J0(mVar.mo50489l("priority").zzh().doubleValue()) : 1000;
                    C6811b bVar = this.f33011d;
                    C14750o oVar = (C14750o) c;
                    bVar.getClass();
                    if ("create".equals(zzi)) {
                        treeMap = (TreeMap) bVar.f14992c;
                    } else if (Listing.EDIT_STATE.equals(zzi)) {
                        treeMap = (TreeMap) bVar.f14991b;
                    } else {
                        String valueOf = String.valueOf(zzi);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
                    }
                    if (treeMap.containsKey(Integer.valueOf(J0))) {
                        J0 = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(J0), oVar);
                    return C14763p.f33033g0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
