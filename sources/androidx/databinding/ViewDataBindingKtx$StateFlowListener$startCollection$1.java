package androidx.databinding;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", mo70541f = "ViewDataBindingKtx.kt", mo70542l = {116}, mo70543m = "invokeSuspend")
final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d $flow;
    public int label;
    public final /* synthetic */ C2463o this$0;

    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$a */
    public static final class C2438a implements C19600e<Object> {

        /* renamed from: b */
        public final /* synthetic */ ViewDataBindingKtx$StateFlowListener$startCollection$1 f5704b;

        public C2438a(ViewDataBindingKtx$StateFlowListener$startCollection$1 viewDataBindingKtx$StateFlowListener$startCollection$1) {
            this.f5704b = viewDataBindingKtx$StateFlowListener$startCollection$1;
        }

        public final Object emit(Object obj, C19340c cVar) {
            this.f5704b.getClass();
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewDataBindingKtx$StateFlowListener$startCollection$1(C2463o oVar, C19597d dVar, C19340c cVar) {
        super(2, cVar);
        this.$flow = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19383o.m32797g(cVar, "completion");
        return new ViewDataBindingKtx$StateFlowListener$startCollection$1((C2463o) null, this.$flow, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ViewDataBindingKtx$StateFlowListener$startCollection$1) create(obj, (C19340c) obj2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d dVar = this.$flow;
            C2438a aVar = new C2438a(this);
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
