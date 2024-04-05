package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.w0 */
public final class C14557w0 {
    /* renamed from: a */
    public static final void m23221a(Object obj, Object obj2) {
        zzdy zzdy = (zzdy) obj;
        C14554v0 v0Var = (C14554v0) obj2;
        if (!zzdy.isEmpty()) {
            Iterator it = zzdy.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }
}
