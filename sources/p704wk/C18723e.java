package p704wk;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C15323c;

/* renamed from: wk.e */
public final class C18723e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ C15323c f41496b;

    public C18723e(C15323c cVar) {
        this.f41496b = cVar;
    }

    public final boolean onPreDraw() {
        C15323c cVar = this.f41496b;
        float rotation = cVar.f34360v.getRotation();
        if (cVar.f34353o == rotation) {
            return true;
        }
        cVar.f34353o = rotation;
        cVar.mo54068p();
        return true;
    }
}
