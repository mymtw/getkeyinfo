package androidx.lifecycle;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.lifecycle.CoroutineLiveData", mo70541f = "CoroutineLiveData.kt", mo70542l = {227, 228}, mo70543m = "emitSource$lifecycle_livedata_ktx_release")
final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C2854e<Object> this$0;

    public CoroutineLiveData$emitSource$1(C2854e<Object> eVar, C19340c<? super CoroutineLiveData$emitSource$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
