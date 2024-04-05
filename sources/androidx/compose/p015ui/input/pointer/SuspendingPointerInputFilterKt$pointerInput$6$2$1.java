package androidx.compose.p015ui.input.pointer;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", mo70541f = "SuspendingPointerInputFilter.kt", mo70542l = {336}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1 */
public final class SuspendingPointerInputFilterKt$pointerInput$6$2$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C1652w, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ SuspendingPointerInputFilter $filter;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$6$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, C19861p<? super C1652w, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super SuspendingPointerInputFilterKt$pointerInput$6$2$1> cVar) {
        super(2, cVar);
        this.$filter = suspendingPointerInputFilter;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SuspendingPointerInputFilterKt$pointerInput$6$2$1 suspendingPointerInputFilterKt$pointerInput$6$2$1 = new SuspendingPointerInputFilterKt$pointerInput$6$2$1(this.$filter, this.$block, cVar);
        suspendingPointerInputFilterKt$pointerInput$6$2$1.L$0 = obj;
        return suspendingPointerInputFilterKt$pointerInput$6$2$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SuspendingPointerInputFilterKt$pointerInput$6$2$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.$filter;
            suspendingPointerInputFilter.getClass();
            C19383o.m32797g(d0Var, "<set-?>");
            suspendingPointerInputFilter.f3614k = d0Var;
            C19861p<C1652w, C19340c<? super C19394m>, Object> pVar = this.$block;
            SuspendingPointerInputFilter suspendingPointerInputFilter2 = this.$filter;
            this.label = 1;
            if (pVar.invoke(suspendingPointerInputFilter2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
