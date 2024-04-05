package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

class CompositeGeneratedAdaptersObserver implements C2885q {

    /* renamed from: b */
    public final C2879m[] f6418b;

    public CompositeGeneratedAdaptersObserver(C2879m[] mVarArr) {
        this.f6418b = mVarArr;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        new HashMap();
        for (C2879m a : this.f6418b) {
            a.mo10832a();
        }
        for (C2879m a2 : this.f6418b) {
            a2.mo10832a();
        }
    }
}
