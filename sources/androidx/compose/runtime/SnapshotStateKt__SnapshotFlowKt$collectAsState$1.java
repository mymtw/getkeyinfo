package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", mo70541f = "SnapshotFlow.kt", mo70542l = {65, 66}, mo70543m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements C19861p<C1357q0<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ C19597d<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", mo70541f = "SnapshotFlow.kt", mo70542l = {67}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 */
    public static final class C12892 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        public static final class C1290a implements C19600e<Object> {

            /* renamed from: b */
            public final /* synthetic */ C1357q0<Object> f2792b;

            public C1290a(C1357q0<Object> q0Var) {
                this.f2792b = q0Var;
            }

            public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
                this.f2792b.setValue(obj);
                return C19394m.f43287a;
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C12892(dVar2, q0Var, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C12892) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19597d<Object> dVar = dVar2;
                C1290a aVar = new C1290a(q0Var);
                this.label = 1;
                if (dVar.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a */
    public static final class C1291a implements C19600e<Object> {

        /* renamed from: b */
        public final /* synthetic */ C1357q0<Object> f2793b;

        public C1291a(C1357q0<Object> q0Var) {
            this.f2793b = q0Var;
        }

        public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
            this.f2793b.setValue(obj);
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, C19597d<Object> dVar, C19340c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> cVar) {
        super(2, cVar);
        this.$context = coroutineContext;
        this.$this_collectAsState = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    public final Object invoke(C1357q0<Object> q0Var, C19340c<? super C19394m> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(q0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C1357q0 q0Var = (C1357q0) this.L$0;
            if (C19383o.m32792b(this.$context, EmptyCoroutineContext.INSTANCE)) {
                C19597d<Object> dVar = this.$this_collectAsState;
                C1291a aVar = new C1291a(q0Var);
                this.label = 1;
                if (dVar.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                CoroutineContext coroutineContext = this.$context;
                final C19597d<Object> dVar2 = this.$this_collectAsState;
                C12892 r3 = new C12892((C19340c<? super C12892>) null);
                this.label = 2;
                if (C19697g.m33471i(this, coroutineContext, r3) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
