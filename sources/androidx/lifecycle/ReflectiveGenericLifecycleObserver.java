package androidx.lifecycle;

import androidx.lifecycle.C2846c;
import androidx.lifecycle.Lifecycle;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C2885q {

    /* renamed from: b */
    public final Object f6443b;

    /* renamed from: c */
    public final C2846c.C2847a f6444c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f6443b = obj;
        this.f6444c = C2846c.f6460c.mo10802b(obj.getClass());
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        C2846c.C2847a aVar = this.f6444c;
        Object obj = this.f6443b;
        C2846c.C2847a.m6790a((List) aVar.f6463a.get(event), sVar, event, obj);
        C2846c.C2847a.m6790a((List) aVar.f6463a.get(Lifecycle.Event.ON_ANY), sVar, event, obj);
    }
}
