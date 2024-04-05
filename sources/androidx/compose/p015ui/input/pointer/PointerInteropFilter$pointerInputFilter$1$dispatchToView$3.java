package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.input.pointer.PointerInteropFilter;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends Lambda implements C19857l<MotionEvent, C19394m> {
    public final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    public final /* synthetic */ PointerInteropFilter this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C19394m.f43287a;
    }

    public final void invoke(MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        C19383o.m32797g(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
            C19857l<? super MotionEvent, Boolean> lVar = this.this$1.f3601b;
            if (lVar != null) {
                if (lVar.invoke(motionEvent).booleanValue()) {
                    dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
                } else {
                    dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
                pointerInteropFilter$pointerInputFilter$1.f3605d = dispatchToViewState;
                return;
            }
            C19383o.m32805o("onTouchEvent");
            throw null;
        }
        C19857l<? super MotionEvent, Boolean> lVar2 = this.this$1.f3601b;
        if (lVar2 != null) {
            lVar2.invoke(motionEvent);
        } else {
            C19383o.m32805o("onTouchEvent");
            throw null;
        }
    }
}
