package androidx.compose.p015ui.viewinterop;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", mo70541f = "AndroidViewHolder.android.kt", mo70542l = {488}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
public final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $toBeConsumed;
    public int label;
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, C19340c<? super AndroidViewHolder$onNestedPreFling$1> cVar) {
        super(2, cVar);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            NestedScrollDispatcher access$getDispatcher$p = this.this$0.dispatcher;
            long j = this.$toBeConsumed;
            this.label = 1;
            if (access$getDispatcher$p.mo6537c(j, this) == coroutineSingletons) {
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
