package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0422e;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", mo70541f = "ScrollExtensions.kt", mo70542l = {40}, mo70543m = "animateScrollBy")
public final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ScrollExtensionsKt$animateScrollBy$1(C19340c<? super ScrollExtensionsKt$animateScrollBy$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.m1395a((C0615m) null, 0.0f, (C0422e<Float>) null, this);
    }
}
