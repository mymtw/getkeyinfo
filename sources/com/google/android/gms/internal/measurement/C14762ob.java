package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.ob */
public final class C14762ob extends C14685j {

    /* renamed from: d */
    public final C1313c f33031d;

    /* renamed from: e */
    public final HashMap f33032e = new HashMap();

    public C14762ob(C1313c cVar) {
        super("require");
        this.f33031d = cVar;
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List<C14763p> list) {
        C14763p pVar;
        C19388s.m32840P0("require", list, 1);
        String zzi = c3Var.mo50400c(list.get(0)).zzi();
        if (this.f33032e.containsKey(zzi)) {
            return (C14763p) this.f33032e.get(zzi);
        }
        C1313c cVar = this.f33031d;
        if (((Map) cVar.f2868b).containsKey(zzi)) {
            try {
                pVar = (C14763p) ((Callable) ((Map) cVar.f2868b).get(zzi)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzi);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            pVar = C14763p.f33033g0;
        }
        if (pVar instanceof C14685j) {
            this.f33032e.put(zzi, (C14685j) pVar);
        }
        return pVar;
    }
}
