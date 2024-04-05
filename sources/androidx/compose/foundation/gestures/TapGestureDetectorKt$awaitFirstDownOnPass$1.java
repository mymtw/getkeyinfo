package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.PointerEventPass;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo70541f = "TapGestureDetector.kt", mo70542l = {244}, mo70543m = "awaitFirstDownOnPass")
public final class TapGestureDetectorKt$awaitFirstDownOnPass$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public TapGestureDetectorKt$awaitFirstDownOnPass$1(C19340c<? super TapGestureDetectorKt$awaitFirstDownOnPass$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.m1411c((C1631c) null, (PointerEventPass) null, false, this);
    }
}
