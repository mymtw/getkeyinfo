package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DrawerKt$ModalDrawer$1$2$6 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ C1206k0 $drawerState;
    public final /* synthetic */ String $navigationMenu;
    public final /* synthetic */ C19525d0 $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$6(String str, C1206k0 k0Var, C19525d0 d0Var) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = k0Var;
        this.$scope = d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        String str = this.$navigationMenu;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C19383o.m32797g(str, "<set-?>");
        C1908o.f4255c.mo7356a(qVar, C1908o.f4253a[2], str);
        if (this.$drawerState.f2507a.mo5116d() == DrawerValue.Open) {
            final C1206k0 k0Var = this.$drawerState;
            final C19525d0 d0Var = this.$scope;
            C1908o.m4196c(qVar, new C19846a<Boolean>() {

                @C19060c(mo70540c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", mo70541f = "Drawer.kt", mo70542l = {450}, mo70543m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1 */
                public static final class C10791 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return new C10791(k0Var, cVar);
                    }

                    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                        return ((C10791) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
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

                public final Boolean invoke() {
                    if (k0Var.f2507a.f2279b.invoke(DrawerValue.Closed).booleanValue()) {
                        C19525d0 d0Var = d0Var;
                        final C1206k0 k0Var = k0Var;
                        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C10791((C19340c<? super C10791>) null), 3);
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }
}
