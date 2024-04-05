package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollableKt", mo70541f = "Scrollable.kt", mo70542l = {293}, mo70543m = "awaitScrollEvent")
final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ScrollableKt$awaitScrollEvent$1(C19340c<? super ScrollableKt$awaitScrollEvent$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m1397a((C1631c) null, this);
    }
}
