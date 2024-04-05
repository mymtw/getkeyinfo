package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", mo70541f = "FlowLiveData.kt", mo70542l = {151}, mo70543m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements C19861p<C2892w<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $this_asLiveData;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$a */
    public static final class C2828a implements C19600e<Object> {

        /* renamed from: b */
        public final /* synthetic */ C2892w f6421b;

        public C2828a(C2892w wVar) {
            this.f6421b = wVar;
        }

        public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
            Object a = this.f6421b.mo10842a();
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(C19597d<Object> dVar, C19340c<? super FlowLiveDataConversions$asLiveData$1> cVar) {
        super(2, cVar);
        this.$this_asLiveData = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, cVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object invoke(C2892w<Object> wVar, C19340c<? super C19394m> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Object> dVar = this.$this_asLiveData;
            C2828a aVar = new C2828a((C2892w) this.L$0);
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
