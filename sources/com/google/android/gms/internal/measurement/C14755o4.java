package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: com.google.android.gms.internal.measurement.o4 */
public final class C14755o4 {

    /* renamed from: a */
    public static final C7494b f33017a = new C7494b();

    /* renamed from: a */
    public static synchronized void m23819a() {
        synchronized (C14755o4.class) {
            C7494b bVar = f33017a;
            Iterator it = ((C7500h.C7505e) bVar.values()).iterator();
            if (!it.hasNext()) {
                bVar.clear();
            } else {
                ((C14755o4) it.next()).getClass();
                throw null;
            }
        }
    }
}
