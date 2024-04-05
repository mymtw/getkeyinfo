package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", mo70541f = "FlowExt.kt", mo70542l = {91}, mo70543m = "invokeSuspend")
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ C19597d<Object> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", mo70541f = "FlowExt.kt", mo70542l = {99}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    public static final class C28231 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        public static final class C2824a implements C19600e<Object> {

            /* renamed from: b */
            public final /* synthetic */ C19513o f6419b;

            public C2824a(C19513o oVar) {
                this.f6419b = oVar;
            }

            public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
                Object E = this.f6419b.mo72188E(obj, cVar);
                return E == CoroutineSingletons.COROUTINE_SUSPENDED ? E : C19394m.f43287a;
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C28231(dVar, oVar2, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C28231) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19597d<Object> dVar = dVar;
                C2824a aVar = new C2824a(oVar2);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, C19597d<Object> dVar, C19340c<? super FlowExtKt$flowWithLifecycle$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19513o oVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19513o oVar2 = (C19513o) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final C19597d<Object> dVar = this.$this_flowWithLifecycle;
            C28231 r5 = new C28231((C19340c<? super C28231>) null);
            this.L$0 = oVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.m6782a(lifecycle, state, r5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            oVar = oVar2;
        } else if (i == 1) {
            oVar = (C19513o) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oVar.mo72187C((Throwable) null);
        return C19394m.f43287a;
    }
}
