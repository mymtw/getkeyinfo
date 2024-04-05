package androidx.savedstate;

import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.savedstate.a */
public final /* synthetic */ class C3264a implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ C3265b f7583b;

    public /* synthetic */ C3264a(C3265b bVar) {
        this.f7583b = bVar;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        C3265b bVar = this.f7583b;
        C19383o.m32797g(bVar, "this$0");
        if (event == Lifecycle.Event.ON_START) {
            bVar.f7589f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            bVar.f7589f = false;
        }
    }
}
