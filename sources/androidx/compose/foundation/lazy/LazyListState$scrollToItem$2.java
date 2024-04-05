package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.C0614l;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", mo70541f = "LazyListState.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class LazyListState$scrollToItem$2 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i, int i2, C19340c<? super LazyListState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, cVar);
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((LazyListState$scrollToItem$2) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.mo4227h(this.$index, this.$scrollOffset);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
