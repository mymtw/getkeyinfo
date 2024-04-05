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
import p753kq.C19864s;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", mo70541f = "Zip.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 */
public final class C19574xd7c321e8 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d[] $flows;
    public final /* synthetic */ C19864s $transform$inlined;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", mo70541f = "Zip.kt", mo70542l = {333}, mo70543m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1 */
    public static final class C195751 extends SuspendLambda implements C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public final Object invoke(C19600e<Object> eVar, Object[] objArr, C19340c<? super C19394m> cVar) {
            C195751 r0 = new C195751(cVar, sVar);
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
                C19864s sVar = sVar;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.label = 1;
                if (sVar.invoke((C19600e) this.L$0, obj2, obj3, obj4, this) == coroutineSingletons) {
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
    public C19574xd7c321e8(C19597d[] dVarArr, C19340c cVar, C19864s sVar) {
        super(2, cVar);
        this.$flows = dVarArr;
        this.$transform$inlined = sVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19574xd7c321e8 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 = new C19574xd7c321e8(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((C19574xd7c321e8) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d[] dVarArr = this.$flows;
            FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
            final C19864s sVar = this.$transform$inlined;
            C195751 r4 = new C195751((C19340c) null);
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
