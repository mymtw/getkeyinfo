package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19525d0 $scope;
    public final /* synthetic */ C1177d1 $sheetState;

    @C19060c(mo70540c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", mo70541f = "ModalBottomSheet.kt", mo70542l = {335}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1 */
    public static final class C11031 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C11031(d1Var, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C11031) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1177d1 d1Var = d1Var;
                this.label = 1;
                d1Var.getClass();
                Object b = SwipeableState.m2243b(d1Var, ModalBottomSheetValue.Hidden, this);
                if (b != coroutineSingletons) {
                    b = C19394m.f43287a;
                }
                if (b == coroutineSingletons) {
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
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1(C1177d1 d1Var, C19525d0 d0Var) {
        super(0);
        this.$sheetState = d1Var;
        this.$scope = d0Var;
    }

    public final void invoke() {
        if (this.$sheetState.f2279b.invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            C19525d0 d0Var = this.$scope;
            final C1177d1 d1Var = this.$sheetState;
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C11031((C19340c<? super C11031>) null), 3);
        }
    }
}
