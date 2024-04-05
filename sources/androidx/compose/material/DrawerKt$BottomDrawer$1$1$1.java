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

public final class DrawerKt$BottomDrawer$1$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1185g $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C19525d0 $scope;

    @C19060c(mo70540c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1", mo70541f = "Drawer.kt", mo70542l = {562}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1 */
    public static final class C10711 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C10711(gVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C10711) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1185g gVar = gVar;
                this.label = 1;
                gVar.getClass();
                Object b = SwipeableState.m2243b(gVar, BottomDrawerValue.Closed, this);
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
    public DrawerKt$BottomDrawer$1$1$1(boolean z, C1185g gVar, C19525d0 d0Var) {
        super(0);
        this.$gesturesEnabled = z;
        this.$drawerState = gVar;
        this.$scope = d0Var;
    }

    public final void invoke() {
        if (this.$gesturesEnabled && this.$drawerState.f2279b.invoke(BottomDrawerValue.Closed).booleanValue()) {
            C19525d0 d0Var = this.$scope;
            final C1185g gVar = this.$drawerState;
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C10711((C19340c<? super C10711>) null), 3);
        }
    }
}
