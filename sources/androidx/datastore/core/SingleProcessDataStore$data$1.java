package androidx.datastore.core;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.C19593b2;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore$data$1", mo70541f = "SingleProcessDataStore.kt", mo70542l = {117}, mo70543m = "invokeSuspend")
final class SingleProcessDataStore$data$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    @C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", mo70541f = "SingleProcessDataStore.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1 */
    public static final class C24721 extends SuspendLambda implements C19861p<C2484k<Object>, C19340c<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C24721 r0 = new C24721(kVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C2484k<Object> kVar, C19340c<? super Boolean> cVar) {
            return ((C24721) create(kVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                C2484k<Object> kVar = (C2484k) this.L$0;
                C2484k<Object> kVar2 = kVar;
                boolean z = false;
                if (!(kVar2 instanceof C2474b) && !(kVar2 instanceof C2480g) && kVar == kVar2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<Object> singleProcessDataStore, C19340c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, cVar);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((SingleProcessDataStore$data$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e eVar = (C19600e) this.L$0;
            final C2484k kVar = (C2484k) this.this$0.f5735h.getValue();
            if (!(kVar instanceof C2474b)) {
                this.this$0.f5737j.mo9300a(new SingleProcessDataStore.C2467a.C2468a(kVar));
            }
            StateFlowImpl stateFlowImpl = this.this$0.f5735h;
            C24721 r4 = new C24721((C19340c<? super C24721>) null);
            this.label = 1;
            if (!(eVar instanceof C19593b2)) {
                Object collect = stateFlowImpl.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(eVar), r4), this);
                if (collect != coroutineSingletons) {
                    collect = C19394m.f43287a;
                }
                if (collect != coroutineSingletons) {
                    collect = C19394m.f43287a;
                }
                if (collect != coroutineSingletons) {
                    collect = C19394m.f43287a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ((C19593b2) eVar).getClass();
                throw null;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
