package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
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

public final class DrawerKt$ModalDrawer$1$2$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1206k0 $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C19525d0 $scope;

    @C19060c(mo70540c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", mo70541f = "Drawer.kt", mo70542l = {421}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1 */
    public static final class C10771 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C10771(k0Var, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C10771) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1206k0 k0Var = k0Var;
                this.label = 1;
                k0Var.getClass();
                DrawerValue drawerValue = DrawerValue.Closed;
                C0433j0<Float> j0Var = DrawerKt.f2205c;
                SwipeableState<DrawerValue> swipeableState = k0Var.f2507a;
                Object collect = swipeableState.f2287j.collect(new SwipeableState$animateTo$2(drawerValue, swipeableState, j0Var), this);
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
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$2(boolean z, C1206k0 k0Var, C19525d0 d0Var) {
        super(0);
        this.$gesturesEnabled = z;
        this.$drawerState = k0Var;
        this.$scope = d0Var;
    }

    public final void invoke() {
        if (this.$gesturesEnabled && this.$drawerState.f2507a.f2279b.invoke(DrawerValue.Closed).booleanValue()) {
            C19525d0 d0Var = this.$scope;
            final C1206k0 k0Var = this.$drawerState;
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C10771((C19340c<? super C10771>) null), 3);
        }
    }
}
