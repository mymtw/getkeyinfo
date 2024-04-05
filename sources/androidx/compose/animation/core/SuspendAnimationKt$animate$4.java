package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.animation.core.SuspendAnimationKt", mo70541f = "SuspendAnimation.kt", mo70542l = {233, 272}, mo70543m = "animate")
public final class SuspendAnimationKt$animate$4<T, V extends C0432j> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public SuspendAnimationKt$animate$4(C19340c<? super SuspendAnimationKt$animate$4> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SuspendAnimationKt.m1070a((C0424f) null, (C0413b) null, 0, (C19857l) null, this);
    }
}
