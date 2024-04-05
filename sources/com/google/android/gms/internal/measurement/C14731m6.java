package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
public final class C14731m6 {
    /* renamed from: a */
    public static final void m23738a(Object obj, Object obj2) {
        zzkw zzkw = (zzkw) obj;
        C14718l6 l6Var = (C14718l6) obj2;
        if (!zzkw.isEmpty()) {
            Iterator it = zzkw.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public static final zzkw m23739b(Object obj, Object obj2) {
        zzkw zzkw = (zzkw) obj;
        zzkw zzkw2 = (zzkw) obj2;
        if (!zzkw2.isEmpty()) {
            if (!zzkw.zze()) {
                zzkw = zzkw.zzb();
            }
            zzkw.zzd(zzkw2);
        }
        return zzkw;
    }
}
