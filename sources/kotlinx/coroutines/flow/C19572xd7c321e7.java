package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.C19630g;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", mo70541f = "Zip.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 */
public final class C19572xd7c321e7 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d[] $flows;
    public final /* synthetic */ C19863r $transform$inlined;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", mo70541f = "Zip.kt", mo70542l = {333}, mo70543m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1 */
    public static final class C195731 extends SuspendLambda implements C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public final Object invoke(C19600e<Object> eVar, Object[] objArr, C19340c<? super C19394m> cVar) {
            C195731 r0 = new C195731(cVar, rVar);
            r0.L$0 = eVar;
            r0.L$1 = objArr;
            return r0.invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                Object[] objArr = (Object[]) this.L$1;
                C19863r rVar = rVar;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.label = 1;
                if (rVar.invoke((C19600e) this.L$0, obj2, obj3, this) == coroutineSingletons) {
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
    public C19572xd7c321e7(C19597d[] dVarArr, C19340c cVar, C19863r rVar) {
        super(2, cVar);
        this.$flows = dVarArr;
        this.$transform$inlined = rVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19572xd7c321e7 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 = new C19572xd7c321e7(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((C19572xd7c321e7) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d[] dVarArr = this.$flows;
            FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
            final C19863r rVar = this.$transform$inlined;
            C195731 r4 = new C195731((C19340c) null);
            this.label = 1;
            if (C19630g.m33418a(dVarArr, flowKt__ZipKt$nullArrayFactory$1, r4, (C19600e) this.L$0, this) == coroutineSingletons) {
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
