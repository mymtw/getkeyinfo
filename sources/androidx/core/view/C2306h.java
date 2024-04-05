package androidx.core.view;

import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.core.view.h */
public final /* synthetic */ class C2306h implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ C2310j f5563b;

    /* renamed from: c */
    public final /* synthetic */ C2313k f5564c;

    public /* synthetic */ C2306h(C2310j jVar, C2313k kVar) {
        this.f5563b = jVar;
        this.f5564c = kVar;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        C2310j jVar = this.f5563b;
        C2313k kVar = this.f5564c;
        jVar.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            jVar.mo8898a(kVar);
        }
    }
}
