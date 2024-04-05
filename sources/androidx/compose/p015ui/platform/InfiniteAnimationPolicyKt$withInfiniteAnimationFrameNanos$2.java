package androidx.compose.p015ui.platform;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", mo70541f = "InfiniteAnimationPolicy.kt", mo70542l = {65}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements C19857l<C19340c<? super R>, Object> {
    public final /* synthetic */ C19857l<Long, R> $onFrame;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(C19857l<? super Long, ? extends R> lVar, C19340c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> cVar) {
        super(1, cVar);
        this.$onFrame = lVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, cVar);
    }

    public final Object invoke(C19340c<? super R> cVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19857l<Long, R> lVar = this.$onFrame;
            this.label = 1;
            obj = C18263b.m30871u0(lVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
