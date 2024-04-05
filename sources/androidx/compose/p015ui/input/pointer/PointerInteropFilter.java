package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter */
public final class PointerInteropFilter implements C1651v {

    /* renamed from: b */
    public C19857l<? super MotionEvent, Boolean> f3601b;

    /* renamed from: c */
    public C1655z f3602c;

    /* renamed from: d */
    public boolean f3603d;

    /* renamed from: e */
    public final PointerInteropFilter$pointerInputFilter$1 f3604e = new PointerInteropFilter$pointerInputFilter$1(this);

    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState */
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* renamed from: q0 */
    public final C1650u mo6547q0() {
        return this.f3604e;
    }
}
