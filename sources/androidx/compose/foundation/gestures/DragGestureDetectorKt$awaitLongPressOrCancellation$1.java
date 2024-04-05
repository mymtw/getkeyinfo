package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo70541f = "DragGestureDetector.kt", mo70542l = {754}, mo70543m = "awaitLongPressOrCancellation")
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitLongPressOrCancellation$1(C19340c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m1358a((C1652w) null, (C1644p) null, this);
    }
}
