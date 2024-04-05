package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableKt", mo70541f = "Transformable.kt", mo70542l = {160}, mo70543m = "awaitTwoDowns")
final class TransformableKt$awaitTwoDowns$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public TransformableKt$awaitTwoDowns$1(C19340c<? super TransformableKt$awaitTwoDowns$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C0618p.m1434a((C1631c) null, this);
    }
}
