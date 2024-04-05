package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", mo70541f = "CoroutineLiveData.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C2865i>, Object> {
    public final /* synthetic */ LiveData<Object> $source;
    public final /* synthetic */ C2894y<Object> $this_addDisposableSource;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(C2894y<Object> yVar, LiveData<Object> liveData, C19340c<? super CoroutineLiveDataKt$addDisposableSource$2> cVar) {
        super(2, cVar);
        this.$source = liveData;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2((C2894y<Object>) null, this.$source, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C2865i> cVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0761x.m1684O0(obj);
        throw null;
    }
}
