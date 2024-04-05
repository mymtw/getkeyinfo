package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1 */
public final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements C19857l<MotionEvent, C19394m> {
    public final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C19394m.f43287a;
    }

    public final void invoke(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "motionEvent");
        C19857l<? super MotionEvent, Boolean> lVar = this.this$0.f3601b;
        if (lVar != null) {
            lVar.invoke(motionEvent);
        } else {
            C19383o.m32805o("onTouchEvent");
            throw null;
        }
    }
}
