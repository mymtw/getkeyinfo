package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", mo70541f = "Migration.kt", mo70542l = {306}, mo70543m = "invokeSuspend")
final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements C19862q<C19600e<Object>, Throwable, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Object $fallback;
    public final /* synthetic */ C19857l<Throwable, Boolean> $predicate;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$onErrorReturn$2(C19857l<? super Throwable, Boolean> lVar, Object obj, C19340c<? super FlowKt__MigrationKt$onErrorReturn$2> cVar) {
        super(3, cVar);
        this.$predicate = lVar;
        this.$fallback = obj;
    }

    public final Object invoke(C19600e<Object> eVar, Throwable th, C19340c<? super C19394m> cVar) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, cVar);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = eVar;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e eVar = (C19600e) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (this.$predicate.invoke(th).booleanValue()) {
                Object obj2 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (eVar.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                throw th;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
