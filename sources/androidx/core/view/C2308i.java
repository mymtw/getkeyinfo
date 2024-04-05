package androidx.core.view;

import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.core.view.i */
public final /* synthetic */ class C2308i implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ C2310j f5565b;

    /* renamed from: c */
    public final /* synthetic */ Lifecycle.State f5566c;

    /* renamed from: d */
    public final /* synthetic */ C2313k f5567d;

    public /* synthetic */ C2308i(C2310j jVar, Lifecycle.State state, C2313k kVar) {
        this.f5565b = jVar;
        this.f5566c = state;
        this.f5567d = kVar;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        C2310j jVar = this.f5565b;
        Lifecycle.State state = this.f5566c;
        C2313k kVar = this.f5567d;
        jVar.getClass();
        if (event == Lifecycle.Event.upTo(state)) {
            jVar.f5569b.add(kVar);
            jVar.f5568a.run();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            jVar.mo8898a(kVar);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            jVar.f5569b.remove(kVar);
            jVar.f5568a.run();
        }
    }
}
