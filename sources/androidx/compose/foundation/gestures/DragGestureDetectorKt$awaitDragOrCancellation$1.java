package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo70541f = "DragGestureDetector.kt", mo70542l = {823}, mo70543m = "awaitDragOrCancellation-rnUCldI")
public final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitDragOrCancellation$1(C19340c<? super DragGestureDetectorKt$awaitDragOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m1359b((C1631c) null, 0, this);
    }
}
