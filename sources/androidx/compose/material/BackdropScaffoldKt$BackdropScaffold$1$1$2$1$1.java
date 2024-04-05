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

public final class BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C1175d $scaffoldState;
    public final /* synthetic */ C19525d0 $scope;

    @C19060c(mo70540c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", mo70541f = "BackdropScaffold.kt", mo70542l = {358}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1 */
    public static final class C10401 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C10401(dVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C10401) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1175d dVar = dVar;
                this.label = 1;
                dVar.getClass();
                Object b = SwipeableState.m2243b(dVar, BackdropValue.Concealed, this);
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
    public BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(boolean z, C1175d dVar, C19525d0 d0Var) {
        super(0);
        this.$gesturesEnabled = z;
        this.$scaffoldState = dVar;
        this.$scope = d0Var;
    }

    public final void invoke() {
        if (this.$gesturesEnabled && this.$scaffoldState.f2279b.invoke(BackdropValue.Concealed).booleanValue()) {
            C19525d0 d0Var = this.$scope;
            final C1175d dVar = this.$scaffoldState;
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C10401((C19340c<? super C10401>) null), 3);
        }
    }
}
