package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C14594c {

    /* renamed from: a */
    public C14581b f32768a;

    /* renamed from: b */
    public C14581b f32769b;

    /* renamed from: c */
    public final ArrayList f32770c;

    public C14594c() {
        this.f32768a = new C14581b("", 0, (HashMap) null);
        this.f32769b = new C14581b("", 0, (HashMap) null);
        this.f32770c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C14594c cVar = new C14594c(this.f32768a.clone());
        Iterator it = this.f32770c.iterator();
        while (it.hasNext()) {
            cVar.f32770c.add(((C14581b) it.next()).clone());
        }
        return cVar;
    }

    public C14594c(C14581b bVar) {
        this.f32768a = bVar;
        this.f32769b = bVar.clone();
        this.f32770c = new ArrayList();
    }
}
