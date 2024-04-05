package kotlinx.coroutines;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.AwaitKt", mo70541f = "Await.kt", mo70542l = {54}, mo70543m = "joinAll")
final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AwaitKt$joinAll$1(C19340c<? super AwaitKt$joinAll$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            awaitKt$joinAll$1 = this;
        } else {
            awaitKt$joinAll$1 = new AwaitKt$joinAll$1(this);
        }
        Object obj2 = awaitKt$joinAll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = awaitKt$joinAll$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            int i3 = awaitKt$joinAll$1.I$1;
            int i4 = awaitKt$joinAll$1.I$0;
            C19699g1[] g1VarArr = (C19699g1[]) awaitKt$joinAll$1.L$0;
            C0761x.m1684O0(obj2);
            while (i4 < i3) {
                C19699g1 g1Var = g1VarArr[i4];
                i4++;
                awaitKt$joinAll$1.L$0 = g1VarArr;
                awaitKt$joinAll$1.I$0 = i4;
                awaitKt$joinAll$1.I$1 = i3;
                awaitKt$joinAll$1.label = 1;
                if (g1Var.mo72394c0(awaitKt$joinAll$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
