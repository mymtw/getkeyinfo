package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo70541f = "DragGestureDetector.kt", mo70542l = {829, 867}, mo70543m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
public final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public float F$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(C19340c<? super DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m1362e((C1631c) null, 0, 0, (C19861p<? super C1644p, ? super Float, C19394m>) null, this);
    }
}
