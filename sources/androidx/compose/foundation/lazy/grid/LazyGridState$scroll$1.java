package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0614l;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.grid.LazyGridState", mo70541f = "LazyGridState.kt", mo70542l = {263, 264}, mo70543m = "scroll")
public final class LazyGridState$scroll$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, C19340c<? super LazyGridState$scroll$1> cVar) {
        super(cVar);
        this.this$0 = lazyGridState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3690a((MutatePriority) null, (C19861p<? super C0614l, ? super C19340c<? super C19394m>, ? extends Object>) null, this);
    }
}
