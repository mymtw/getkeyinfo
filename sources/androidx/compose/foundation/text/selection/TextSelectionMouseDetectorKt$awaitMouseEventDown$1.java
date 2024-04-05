package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", mo70541f = "TextSelectionMouseDetector.kt", mo70542l = {127}, mo70543m = "awaitMouseEventDown")
final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public TextSelectionMouseDetectorKt$awaitMouseEventDown$1(C19340c<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TextSelectionMouseDetectorKt.m2059a((C1631c) null, this);
    }
}
