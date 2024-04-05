package kotlinx.coroutines;

import java.util.ArrayList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.AwaitKt", mo70541f = "Await.kt", mo70542l = {66}, mo70543m = "joinAll")
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AwaitKt$joinAll$3(C19340c<? super AwaitKt$joinAll$3> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19478c.m33095a((ArrayList) null, this);
    }
}
