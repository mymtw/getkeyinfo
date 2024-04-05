package androidx.compose.foundation.relocation;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p288y.C8345d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", mo70541f = "BringIntoViewResponder.kt", mo70542l = {272}, mo70543m = "invokeSuspend")
final class BringIntoViewResponderModifier$dispatchRequest$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1689j $layoutCoordinates;
    public final /* synthetic */ C8345d $localRect;
    public final /* synthetic */ C8345d $parentRect;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BringIntoViewResponderModifier this$0;

    @C19060c(mo70540c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", mo70541f = "BringIntoViewResponder.kt", mo70542l = {267}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1 */
    public static final class C08781 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C08781(bringIntoViewResponderModifier, dVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C08781) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C0884f fVar = bringIntoViewResponderModifier.f1887e;
                if (fVar != null) {
                    C8345d dVar = dVar;
                    this.label = 1;
                    if (fVar.mo3726a(dVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    C19383o.m32805o("responder");
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier$dispatchRequest$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, C8345d dVar, C1689j jVar, C8345d dVar2, C19340c<? super BringIntoViewResponderModifier$dispatchRequest$2> cVar) {
        super(2, cVar);
        this.this$0 = bringIntoViewResponderModifier;
        this.$parentRect = dVar;
        this.$layoutCoordinates = jVar;
        this.$localRect = dVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BringIntoViewResponderModifier$dispatchRequest$2 bringIntoViewResponderModifier$dispatchRequest$2 = new BringIntoViewResponderModifier$dispatchRequest$2(this.this$0, this.$parentRect, this.$layoutCoordinates, this.$localRect, cVar);
        bringIntoViewResponderModifier$dispatchRequest$2.L$0 = obj;
        return bringIntoViewResponderModifier$dispatchRequest$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BringIntoViewResponderModifier$dispatchRequest$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final BringIntoViewResponderModifier bringIntoViewResponderModifier = this.this$0;
            final C8345d dVar = this.$localRect;
            C19697g.m33468f((C19525d0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C08781((C19340c<? super C08781>) null), 3);
            BringIntoViewResponderModifier bringIntoViewResponderModifier2 = this.this$0;
            C0881c cVar = bringIntoViewResponderModifier2.f1892c;
            if (cVar == null) {
                cVar = bringIntoViewResponderModifier2.f1891b;
            }
            C8345d dVar2 = this.$parentRect;
            C1689j jVar = this.$layoutCoordinates;
            this.label = 1;
            if (cVar.mo4409a(dVar2, jVar, this) == coroutineSingletons) {
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
