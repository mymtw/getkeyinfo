package androidx.compose.material;

import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.SliderKt", mo70541f = "Slider.kt", mo70542l = {795}, mo70543m = "awaitSlop-8vUncbI")
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(C19340c<? super SliderKt$awaitSlop$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m2217f((C1631c) null, 0, 0, this);
    }
}
