package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6766d;

/* renamed from: androidx.compose.foundation.relocation.b */
public abstract class C0880b implements C6764b, C1678e0 {

    /* renamed from: b */
    public final C0881c f1891b;

    /* renamed from: c */
    public C0881c f1892c;

    /* renamed from: d */
    public C1689j f1893d;

    public C0880b(C0879a aVar) {
        C19383o.m32797g(aVar, "defaultParent");
        this.f1891b = aVar;
    }

    /* renamed from: D */
    public final void mo3725D(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        this.f1893d = jVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f1892c = (C0881c) dVar.mo6818a(BringIntoViewKt.f1883a);
    }
}
