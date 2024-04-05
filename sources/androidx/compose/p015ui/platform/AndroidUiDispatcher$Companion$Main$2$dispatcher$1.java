package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", mo70541f = "AndroidUiDispatcher.android.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1 */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Choreographer>, Object> {
    public int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(C19340c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super Choreographer> cVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
