package androidx.compose.p015ui.viewinterop;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7294l;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", mo70541f = "AndroidViewHolder.android.kt", mo70542l = {470, 475}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
public final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ boolean $consumed;
    public final /* synthetic */ long $viewVelocity;
    public int label;
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z, AndroidViewHolder androidViewHolder, long j, C19340c<? super AndroidViewHolder$onNestedFling$1> cVar) {
        super(2, cVar);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            if (!this.$consumed) {
                NestedScrollDispatcher access$getDispatcher$p = this.this$0.dispatcher;
                int i2 = C7294l.f16177c;
                long j = C7294l.f16176b;
                long j2 = this.$viewVelocity;
                this.label = 1;
                if (access$getDispatcher$p.mo6535a(j, j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                NestedScrollDispatcher access$getDispatcher$p2 = this.this$0.dispatcher;
                long j3 = this.$viewVelocity;
                int i3 = C7294l.f16177c;
                long j4 = C7294l.f16176b;
                this.label = 2;
                if (access$getDispatcher$p2.mo6535a(j3, j4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
