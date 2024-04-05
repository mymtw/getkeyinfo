package androidx.compose.runtime;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer", mo70541f = "Recomposer.kt", mo70542l = {623, 630}, mo70543m = "runFrameLoop")
final class Recomposer$runFrameLoop$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$1(Recomposer recomposer, C19340c<? super Recomposer$runFrameLoop$1> cVar) {
        super(cVar);
        this.this$0 = recomposer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Recomposer.m2547w(this.this$0, (C1321f0) null, (C1355p0) null, this);
    }
}
