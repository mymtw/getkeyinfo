package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19846a;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ProduceKt", mo70541f = "Produce.kt", mo70542l = {153}, mo70543m = "awaitClose")
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ProduceKt$awaitClose$1(C19340c<? super ProduceKt$awaitClose$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ProduceKt.m33138a((C19513o<?>) null, (C19846a<C19394m>) null, this);
    }
}
