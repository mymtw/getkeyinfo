package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0426g;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", mo70541f = "WindowInsetsConnection.android.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ WindowInsetsAnimationController $animationController;
    public final /* synthetic */ int $current;
    public final /* synthetic */ float $flingAmount;
    public final /* synthetic */ int $target;
    public final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @C19060c(mo70540c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", mo70541f = "WindowInsetsConnection.android.kt", mo70542l = {358}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1 */
    public static final class C06741 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C06741(i, i2, f, windowInsetsAnimationController, z, windowInsetsNestedScrollConnection2, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C06741) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                Animatable m = C19421p.m32945m((float) i);
                Float f = new Float((float) i2);
                Float f2 = new Float(f);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                C06751 r7 = new C19857l<Animatable<Float, C0426g>, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Animatable<Float, C0426g>) (Animatable) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(Animatable<Float, C0426g> animatable) {
                        C19383o.m32797g(animatable, "$this$animateTo");
                        WindowInsetsNestedScrollConnection.m1511c(windowInsetsNestedScrollConnection, animatable.mo3375e().floatValue());
                    }
                };
                this.label = 1;
                if (Animatable.m1065d(m, f, (C0422e) null, f2, r7, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            windowInsetsAnimationController.finish(z);
            windowInsetsNestedScrollConnection2.f1449f = null;
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, C19340c<? super WindowInsetsNestedScrollConnection$fling$3> cVar) {
        super(2, cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$target = i2;
        this.$flingAmount = f;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, cVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            final int i = this.$current;
            final int i2 = this.$target;
            final float f = this.$flingAmount;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
            final boolean z = this.$targetShown;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection.f1453j = C19697g.m33468f((C19525d0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C06741((C19340c<? super C06741>) null), 3);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
