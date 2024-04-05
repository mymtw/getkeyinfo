package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", mo70541f = "ActualAndroid.android.kt", mo70542l = {51}, mo70543m = "invokeSuspend")
public final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super R>, Object> {
    public final /* synthetic */ C19857l<Long, R> $onFrame;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(C19857l<? super Long, ? extends R> lVar, C19340c<? super SdkStubsFallbackFrameClock$withFrameNanos$2> cVar) {
        super(2, cVar);
        this.$onFrame = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super R> cVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.label = 1;
            if (C18263b.m30814I(16, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.$onFrame.invoke(new Long(System.nanoTime()));
    }
}
