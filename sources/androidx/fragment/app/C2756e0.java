package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: androidx.fragment.app.e0 */
public final class C2756e0 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f6280a;

    public C2756e0(Rect rect) {
        this.f6280a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f6280a;
    }
}
