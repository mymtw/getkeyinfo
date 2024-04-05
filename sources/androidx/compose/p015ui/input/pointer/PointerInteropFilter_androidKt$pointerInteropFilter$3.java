package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3 */
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements C19857l<MotionEvent, Boolean> {
    public final /* synthetic */ AndroidViewHolder $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    public final Boolean invoke(MotionEvent motionEvent) {
        boolean z;
        C19383o.m32797g(motionEvent, "motionEvent");
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = this.$view.dispatchTouchEvent(motionEvent);
                break;
            default:
                z = this.$view.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z);
    }
}
