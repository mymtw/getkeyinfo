package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.runtime.C1342k1;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p087e0.C6687f;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DraggableKt", mo70541f = "Draggable.kt", mo70542l = {315, 324, 333, 335}, mo70543m = "awaitDownAndSlop")
final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;

    public DraggableKt$awaitDownAndSlop$1(C19340c<? super DraggableKt$awaitDownAndSlop$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.m1373a((C1631c) null, (C1342k1) null, (C1342k1) null, (C6687f) null, (Orientation) null, this);
    }
}
