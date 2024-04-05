package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", mo70541f = "Zip.kt", mo70542l = {251}, mo70543m = "invokeSuspend")
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object>[] $flows;
    public final /* synthetic */ C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> $transform;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$6(C19597d<Object>[] dVarArr, C19862q<? super C19600e<Object>, ? super Object[], ? super C19340c<? super C19394m>, ? extends Object> qVar, C19340c<? super FlowKt__ZipKt$combineTransform$6> cVar) {
        super(2, cVar);
        this.$flows = dVarArr;
        this.$transform = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.$flows, this.$transform, cVar);
        flowKt__ZipKt$combineTransform$6.L$0 = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((FlowKt__ZipKt$combineTransform$6) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e eVar = (C19600e) this.L$0;
            C19383o.m32804n();
            throw null;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        C19600e eVar = (C19600e) this.L$0;
        C19383o.m32804n();
        throw null;
    }
}
