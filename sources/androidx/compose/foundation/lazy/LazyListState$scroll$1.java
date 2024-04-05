package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0614l;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.LazyListState", mo70541f = "LazyListState.kt", mo70542l = {257, 258}, mo70543m = "scroll")
public final class LazyListState$scroll$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(LazyListState lazyListState, C19340c<? super LazyListState$scroll$1> cVar) {
        super(cVar);
        this.this$0 = lazyListState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3690a((MutatePriority) null, (C19861p<? super C0614l, ? super C19340c<? super C19394m>, ? extends Object>) null, this);
    }
}
