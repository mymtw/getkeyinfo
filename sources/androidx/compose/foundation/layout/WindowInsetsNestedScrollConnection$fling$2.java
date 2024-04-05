package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", mo70541f = "WindowInsetsConnection.android.kt", mo70542l = {348}, mo70543m = "invokeSuspend")
public final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ WindowInsetsAnimationController $animationController;
    public final /* synthetic */ int $current;
    public final /* synthetic */ Ref$FloatRef $endVelocity;
    public final /* synthetic */ float $flingAmount;
    public final /* synthetic */ int $hidden;
    public final /* synthetic */ int $shown;
    public final /* synthetic */ C0717c0 $spec;
    public final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @C19060c(mo70540c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", mo70541f = "WindowInsetsConnection.android.kt", mo70542l = {332}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1 */
    public static final class C06721 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C06721(i2, f, c0Var, i3, i4, windowInsetsNestedScrollConnection2, ref$FloatRef, windowInsetsAnimationController, z, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C06721) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                float f = f;
                C0717c0 c0Var = c0Var;
                final int i2 = i3;
                final int i3 = i4;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                final Ref$FloatRef ref$FloatRef = ref$FloatRef;
                final WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsAnimationController;
                final boolean z = z;
                C06731 r4 = new C19861p<Float, Float, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return C19394m.f43287a;
                    }

                    public final void invoke(float f, float f2) {
                        if (f <= ((float) i3) && ((float) i2) <= f) {
                            WindowInsetsNestedScrollConnection.m1511c(windowInsetsNestedScrollConnection, f);
                            return;
                        }
                        ref$FloatRef.element = f2;
                        windowInsetsAnimationController.finish(z);
                        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection;
                        windowInsetsNestedScrollConnection.f1449f = null;
                        C19699g1 g1Var = windowInsetsNestedScrollConnection.f1453j;
                        if (g1Var != null) {
                            g1Var.mo72134a((CancellationException) null);
                        }
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.m1072c((float) i2, f, c0Var, r4, this) == coroutineSingletons) {
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
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, float f, C0717c0 c0Var, int i2, int i3, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, C19340c<? super WindowInsetsNestedScrollConnection$fling$2> cVar) {
        super(2, cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$flingAmount = f;
        this.$spec = c0Var;
        this.$hidden = i2;
        this.$shown = i3;
        this.$endVelocity = ref$FloatRef;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, cVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            final int i2 = this.$current;
            final float f = this.$flingAmount;
            final C0717c0 c0Var = this.$spec;
            final int i3 = this.$hidden;
            final int i4 = this.$shown;
            final Ref$FloatRef ref$FloatRef = this.$endVelocity;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            C06721 r4 = r5;
            final boolean z = this.$targetShown;
            C06721 r5 = new C06721((C19340c<? super C06721>) null);
            windowInsetsNestedScrollConnection.f1453j = C19697g.m33468f((C19525d0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, r4, 3);
            C19699g1 g1Var = this.this$0.f1453j;
            if (g1Var != null) {
                this.label = 1;
                if (g1Var.mo72394c0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f1453j = null;
        return C19394m.f43287a;
    }
}
